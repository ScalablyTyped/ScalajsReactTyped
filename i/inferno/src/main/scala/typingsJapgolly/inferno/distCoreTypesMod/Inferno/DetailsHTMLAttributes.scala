package typingsJapgolly.inferno.distCoreTypesMod.Inferno

import japgolly.scalajs.react.Callback
import typingsJapgolly.inferno.distCoreTypesMod.InfernoEventHandler
import typingsJapgolly.inferno.distCoreTypesMod.SemiSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  extension [Self <: DetailsHTMLAttributes[?], T](x: Self & DetailsHTMLAttributes[T]) {
    
    inline def setOnToggle(value: InfernoEventHandler[T]): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
    
    inline def setOnToggleFunction1(value: SemiSyntheticEvent[T] => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: SemiSyntheticEvent[T]) => value(t0).runNow()))
    
    inline def setOnToggleNull: Self = StObject.set(x, "onToggle", null)
    
    inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
