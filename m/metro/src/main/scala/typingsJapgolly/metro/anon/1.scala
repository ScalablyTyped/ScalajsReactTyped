package typingsJapgolly.metro.anon

import typingsJapgolly.metro.libReportingMod.ReportableEvent
import typingsJapgolly.metro.metroStrings.transform_cache_reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with ReportableEvent {
  
  var `type`: transform_cache_reset
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("transform_cache_reset")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: transform_cache_reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
