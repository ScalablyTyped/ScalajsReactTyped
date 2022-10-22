package typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.JSXBase

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  extension [Self <: DetailsHTMLAttributes[?], T](x: Self & DetailsHTMLAttributes[T]) {
    
    inline def setOnToggle(value: /* event */ Event => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
