package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneTimeSchedule extends StObject {
  
  /** Required. The desired patch job execution time. */
  var executeTime: js.UndefOr[String] = js.undefined
}
object OneTimeSchedule {
  
  inline def apply(): OneTimeSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneTimeSchedule]
  }
  
  extension [Self <: OneTimeSchedule](x: Self) {
    
    inline def setExecuteTime(value: String): Self = StObject.set(x, "executeTime", value.asInstanceOf[js.Any])
    
    inline def setExecuteTimeUndefined: Self = StObject.set(x, "executeTime", js.undefined)
  }
}
