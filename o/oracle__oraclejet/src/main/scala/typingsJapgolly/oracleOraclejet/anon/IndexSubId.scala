package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`oj-table-footer`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`oj-table-header`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexSubId extends StObject {
  
  var index: Double
  
  var subId: `oj-table-footer` | `oj-table-header`
}
object IndexSubId {
  
  inline def apply(index: Double, subId: `oj-table-footer` | `oj-table-header`): IndexSubId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSubId]
  }
  
  extension [Self <: IndexSubId](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSubId(value: `oj-table-footer` | `oj-table-header`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
