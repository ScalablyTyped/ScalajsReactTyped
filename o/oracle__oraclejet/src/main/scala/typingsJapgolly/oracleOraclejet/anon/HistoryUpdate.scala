package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryUpdate extends StObject {
  
  var historyUpdate: String
}
object HistoryUpdate {
  
  inline def apply(historyUpdate: String): HistoryUpdate = {
    val __obj = js.Dynamic.literal(historyUpdate = historyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryUpdate]
  }
  
  extension [Self <: HistoryUpdate](x: Self) {
    
    inline def setHistoryUpdate(value: String): Self = StObject.set(x, "historyUpdate", value.asInstanceOf[js.Any])
  }
}
