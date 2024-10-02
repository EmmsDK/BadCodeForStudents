class DatabaseConnection {
    private boolean isConnected;

    public DatabaseConnection() {
        connect();
    }

    public void connect() {
        if (!isConnected) {
            System.out.println("Connecting to the database...");
            isConnected = true;
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from the database...");
            isConnected = false;
        }
    }
}

class Application {
    public static void main(String[] args) {
        DatabaseConnection dbConnection1 = new DatabaseConnection();
        DatabaseConnection dbConnection2 = new DatabaseConnection();

        dbConnection1.connect();
        dbConnection2.connect();
    }
}
