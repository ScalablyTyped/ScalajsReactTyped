package typingsJapgolly.metro.anon

import typingsJapgolly.metro.libReportingMod.ReportableEvent
import typingsJapgolly.metro.metroStrings.client_log
import typingsJapgolly.metro.metroStrings.debug
import typingsJapgolly.metro.metroStrings.group
import typingsJapgolly.metro.metroStrings.groupCollapsed
import typingsJapgolly.metro.metroStrings.groupEnd
import typingsJapgolly.metro.metroStrings.info
import typingsJapgolly.metro.metroStrings.log
import typingsJapgolly.metro.metroStrings.trace
import typingsJapgolly.metro.metroStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with ReportableEvent {
  
  var data: js.Array[Any]
  
  var level: trace | info | warn | log | group | groupCollapsed | groupEnd | debug
  
  var `type`: client_log
}
object Data {
  
  inline def apply(data: js.Array[Any], level: trace | info | warn | log | group | groupCollapsed | groupEnd | debug): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("client_log")
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLevel(value: trace | info | warn | log | group | groupCollapsed | groupEnd | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setType(value: client_log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
