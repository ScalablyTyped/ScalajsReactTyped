package typingsJapgolly.reactNativeMaterialKit.mod

import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickProperties
  extends StObject
     with ViewProps {
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var inset: js.UndefOr[Double] = js.undefined
}
object TickProperties {
  
  inline def apply(): TickProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickProperties]
  }
  
  extension [Self <: TickProperties](x: Self) {
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setInset(value: Double): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
  }
}
