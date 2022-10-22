package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.XlXmlExportResult
import typingsJapgolly.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  val Map: XmlMap
  
  val Result: XlXmlExportResult
  
  val Url: String
}
object Result {
  
  inline def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String): Result = {
    val __obj = js.Dynamic.literal(Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setResult(value: XlXmlExportResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
