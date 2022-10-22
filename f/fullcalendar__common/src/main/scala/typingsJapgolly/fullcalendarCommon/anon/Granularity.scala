package typingsJapgolly.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granularity extends StObject {
  
  var granularity: js.UndefOr[String] = js.undefined
  
  var maintainDuration: js.UndefOr[Boolean] = js.undefined
}
object Granularity {
  
  inline def apply(): Granularity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granularity]
  }
  
  extension [Self <: Granularity](x: Self) {
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setMaintainDuration(value: Boolean): Self = StObject.set(x, "maintainDuration", value.asInstanceOf[js.Any])
    
    inline def setMaintainDurationUndefined: Self = StObject.set(x, "maintainDuration", js.undefined)
  }
}
