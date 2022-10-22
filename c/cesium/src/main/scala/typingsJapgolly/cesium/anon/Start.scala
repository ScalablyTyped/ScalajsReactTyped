package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[JulianDate] = js.undefined
  
  var stop: js.UndefOr[JulianDate] = js.undefined
}
object Start {
  
  inline def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setStart(value: JulianDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: JulianDate): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
