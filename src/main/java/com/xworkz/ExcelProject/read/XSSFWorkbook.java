package com.xworkz.ExcelProject.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;

public class XSSFWorkbook implements Workbook {

	public XSSFWorkbook() {
		// TODO Auto-generated constructor stub
	}

	public XSSFWorkbook(FileInputStream file) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator<Sheet> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getActiveSheetIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setActiveSheet(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFirstVisibleTab() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFirstVisibleTab(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSheetOrder(String sheetname, int pos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSelectedTab(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSheetName(int sheet, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSheetName(int sheet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSheetIndex(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSheetIndex(Sheet sheet) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sheet createSheet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sheet createSheet(String sheetname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sheet cloneSheet(int sheetNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Sheet> sheetIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfSheets() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sheet getSheetAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sheet getSheet(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSheetAt(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public Font createFont() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Font findFont(boolean bold, short color, short fontHeight, String name, boolean italic, boolean strikeout,
			short typeOffset, byte underline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfFonts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfFontsAsInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Font getFontAt(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellStyle createCellStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumCellStyles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CellStyle getCellStyleAt(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(OutputStream stream) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNumberOfNames() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Name getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Name> getNames(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Name> getAllNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Name createName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeName(Name name) {
		// TODO Auto-generated method stub

	}

	@Override
	public int linkExternalWorkbook(String name, Workbook workbook) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrintArea(int sheetIndex, String reference) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPrintArea(int sheetIndex, int startColumn, int endColumn, int startRow, int endRow) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPrintArea(int sheetIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePrintArea(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public MissingCellPolicy getMissingCellPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMissingCellPolicy(MissingCellPolicy missingCellPolicy) {
		// TODO Auto-generated method stub

	}

	@Override
	public DataFormat createDataFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addPicture(byte[] pictureData, int format) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<? extends PictureData> getAllPictures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreationHelper getCreationHelper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHidden() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setHidden(boolean hiddenFlag) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSheetHidden(int sheetIx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSheetVeryHidden(int sheetIx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSheetHidden(int sheetIx, boolean hidden) {
		// TODO Auto-generated method stub

	}

	@Override
	public SheetVisibility getSheetVisibility(int sheetIx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSheetVisibility(int sheetIx, SheetVisibility visibility) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToolPack(UDFFinder toolpack) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setForceFormulaRecalculation(boolean value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getForceFormulaRecalculation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SpreadsheetVersion getSpreadsheetVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addOlePackage(byte[] oleData, String label, String fileName, String command) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EvaluationWorkbook createEvaluationWorkbook() {
		// TODO Auto-generated method stub
		return null;
	}

}
