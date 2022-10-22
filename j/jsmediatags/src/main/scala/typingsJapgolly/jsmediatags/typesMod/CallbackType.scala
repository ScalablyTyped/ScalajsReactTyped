package typingsJapgolly.jsmediatags.typesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  
  def onSuccess(data: TagType): Unit
}
object CallbackType {
  
  inline def apply(onSuccess: TagType => Callback): CallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1((t0: TagType) => onSuccess(t0).runNow()))
    __obj.asInstanceOf[CallbackType]
  }
  
  extension [Self <: CallbackType](x: Self) {
    
    inline def setOnError(value: /* error */ jsmediatagsError => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ jsmediatagsError) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: TagType => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: TagType) => value(t0).runNow()))
  }
}
