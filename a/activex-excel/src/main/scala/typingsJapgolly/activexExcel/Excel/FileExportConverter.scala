package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileExportConverter extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  val Description: String
  
  /* private */ @JSName("Excel.FileExportConverter_typekey")
  var ExcelDotFileExportConverter_typekey: FileExportConverter
  
  val Extensions: String
  
  val FileFormat: Double
  
  val Parent: Any
}
object FileExportConverter {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Description: String,
    ExcelDotFileExportConverter_typekey: FileExportConverter,
    Extensions: String,
    FileFormat: Double,
    Parent: Any
  ): FileExportConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FileFormat = FileFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FileExportConverter_typekey")(ExcelDotFileExportConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExportConverter]
  }
  
  extension [Self <: FileExportConverter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExcelDotFileExportConverter_typekey(value: FileExportConverter): Self = StObject.set(x, "Excel.FileExportConverter_typekey", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setFileFormat(value: Double): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
