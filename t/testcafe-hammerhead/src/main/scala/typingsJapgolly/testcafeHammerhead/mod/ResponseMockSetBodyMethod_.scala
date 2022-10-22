package typingsJapgolly.testcafeHammerhead.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMockSetBodyMethod_ extends StObject {
  
  def add(res: IncomingMessageLikeInitOptions): Unit
  
  def remove(res: IncomingMessageLikeInitOptions): Unit
}
object ResponseMockSetBodyMethod_ {
  
  inline def apply(
    add: IncomingMessageLikeInitOptions => Callback,
    remove: IncomingMessageLikeInitOptions => Callback
  ): ResponseMockSetBodyMethod_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: IncomingMessageLikeInitOptions) => add(t0).runNow()), remove = js.Any.fromFunction1((t0: IncomingMessageLikeInitOptions) => remove(t0).runNow()))
    __obj.asInstanceOf[ResponseMockSetBodyMethod_]
  }
  
  extension [Self <: ResponseMockSetBodyMethod_](x: Self) {
    
    inline def setAdd(value: IncomingMessageLikeInitOptions => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: IncomingMessageLikeInitOptions) => value(t0).runNow()))
    
    inline def setRemove(value: IncomingMessageLikeInitOptions => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: IncomingMessageLikeInitOptions) => value(t0).runNow()))
  }
}
