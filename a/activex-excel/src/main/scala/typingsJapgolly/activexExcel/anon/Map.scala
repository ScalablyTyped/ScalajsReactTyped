package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.Workbook
import typingsJapgolly.activexExcel.Excel.XlXmlExportResult
import typingsJapgolly.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  val Map: XmlMap
  
  val Result: XlXmlExportResult
  
  val Url: String
  
  val Wb: Workbook
}
object Map {
  
  inline def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String, Wb: Workbook): Map = {
    val __obj = js.Dynamic.literal(Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setResult(value: XlXmlExportResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
