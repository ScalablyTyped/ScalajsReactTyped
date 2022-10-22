package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModel
  extends StObject
     with Destroyable {
  
  def extend(source: Any): Any
  
  def model(): Model[Any, ModelSetOptions, Any]
  
  def shareOptions(): ViewModelOptions
}
object ViewModel {
  
  inline def apply(
    destroy: CallbackTo[Any],
    extend: Any => Any,
    model: CallbackTo[Model[Any, ModelSetOptions, Any]],
    shareOptions: CallbackTo[ViewModelOptions]
  ): ViewModel = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, extend = js.Any.fromFunction1(extend), model = model.toJsFn, shareOptions = shareOptions.toJsFn)
    __obj.asInstanceOf[ViewModel]
  }
  
  extension [Self <: ViewModel](x: Self) {
    
    inline def setExtend(value: Any => Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setModel(value: CallbackTo[Model[Any, ModelSetOptions, Any]]): Self = StObject.set(x, "model", value.toJsFn)
    
    inline def setShareOptions(value: CallbackTo[ViewModelOptions]): Self = StObject.set(x, "shareOptions", value.toJsFn)
  }
}
