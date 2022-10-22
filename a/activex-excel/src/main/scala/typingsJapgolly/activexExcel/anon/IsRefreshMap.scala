package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.XlXmlImportResult
import typingsJapgolly.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRefreshMap extends StObject {
  
  val IsRefresh: Boolean
  
  val Map: XmlMap
  
  val Result: XlXmlImportResult
}
object IsRefreshMap {
  
  inline def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult): IsRefreshMap = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefreshMap]
  }
  
  extension [Self <: IsRefreshMap](x: Self) {
    
    inline def setIsRefresh(value: Boolean): Self = StObject.set(x, "IsRefresh", value.asInstanceOf[js.Any])
    
    inline def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setResult(value: XlXmlImportResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
