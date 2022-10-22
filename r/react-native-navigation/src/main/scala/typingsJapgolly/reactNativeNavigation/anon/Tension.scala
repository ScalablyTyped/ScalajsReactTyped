package typingsJapgolly.reactNativeNavigation.anon

import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.overshoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tension
  extends StObject
     with Interpolation {
  
  var tension: js.UndefOr[Double] = js.undefined
  
  var `type`: overshoot
}
object Tension {
  
  inline def apply(): Tension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("overshoot")
    __obj.asInstanceOf[Tension]
  }
  
  extension [Self <: Tension](x: Self) {
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setType(value: overshoot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
