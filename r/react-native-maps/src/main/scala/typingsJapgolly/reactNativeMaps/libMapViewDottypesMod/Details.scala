package typingsJapgolly.reactNativeMaps.libMapViewDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var isGesture: js.UndefOr[Boolean] = js.undefined
}
object Details {
  
  inline def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  extension [Self <: Details](x: Self) {
    
    inline def setIsGesture(value: Boolean): Self = StObject.set(x, "isGesture", value.asInstanceOf[js.Any])
    
    inline def setIsGestureUndefined: Self = StObject.set(x, "isGesture", js.undefined)
  }
}
