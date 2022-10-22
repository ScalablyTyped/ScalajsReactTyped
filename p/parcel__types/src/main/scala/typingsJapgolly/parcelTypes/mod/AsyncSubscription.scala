package typingsJapgolly.parcelTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSubscription extends StObject {
  
  def unsubscribe(): js.Promise[Any]
}
object AsyncSubscription {
  
  inline def apply(unsubscribe: CallbackTo[js.Promise[Any]]): AsyncSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[AsyncSubscription]
  }
  
  extension [Self <: AsyncSubscription](x: Self) {
    
    inline def setUnsubscribe(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
