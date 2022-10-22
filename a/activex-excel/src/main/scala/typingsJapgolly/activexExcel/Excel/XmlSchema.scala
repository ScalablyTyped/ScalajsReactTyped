package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlSchema extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.XmlSchema_typekey")
  var ExcelDotXmlSchema_typekey: XmlSchema
  
  val Name: String
  
  val Namespace: XmlNamespace
  
  val Parent: Any
  
  val XML: String
}
object XmlSchema {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotXmlSchema_typekey: XmlSchema,
    Name: String,
    Namespace: XmlNamespace,
    Parent: Any,
    XML: String
  ): XmlSchema = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlSchema_typekey")(ExcelDotXmlSchema_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlSchema]
  }
  
  extension [Self <: XmlSchema](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotXmlSchema_typekey(value: XmlSchema): Self = StObject.set(x, "Excel.XmlSchema_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: XmlNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
