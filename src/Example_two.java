class OldPrinter {
    public void printOldDocument(String document) {
        System.out.println("Printing document in old format: " + document);
    }
}

class ModernPrinter {
    public void printDocument(String document) {
        System.out.println("Printing document in modern format: " + document);
    }
}

class PrintingService {
    private ModernPrinter modernPrinter;

    public PrintingService(ModernPrinter modernPrinter) {
        this.modernPrinter = modernPrinter;
    }

    public void print(String document, boolean useOldPrinter) {
        if (useOldPrinter) {
            OldPrinter oldPrinter = new OldPrinter();
            oldPrinter.printOldDocument(document);
        } else {
            modernPrinter.printDocument(document);
        }
    }
}
