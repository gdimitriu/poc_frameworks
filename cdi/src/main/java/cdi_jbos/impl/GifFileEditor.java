package cdi_jbos.impl;

import cdi_jbos.interfaces.ImageFileEditor;

import javax.enterprise.inject.Alternative;

@Alternative
public class GifFileEditor implements ImageFileEditor {

    public String openFile(String fileName) {
        return "Opening GIF file " + fileName;
    }

    public String editFile(String fileName) {
        return "Editing GifFile file " + fileName;
    }

    public String writeFile(String fileNane) {
        return "Writing GIF file " + fileNane;
    }

    public String saveFile(String fileName) {
        return "Save GIF file " + fileName;
    }
}
