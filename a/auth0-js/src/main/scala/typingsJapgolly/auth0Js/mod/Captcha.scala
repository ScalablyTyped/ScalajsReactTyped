package typingsJapgolly.auth0Js.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Captcha extends StObject {
  
  def getValue(): String
  
  def reload(done: DoneCallback): Unit
}
object Captcha {
  
  inline def apply(getValue: CallbackTo[String], reload: DoneCallback => Callback): Captcha = {
    val __obj = js.Dynamic.literal(getValue = getValue.toJsFn, reload = js.Any.fromFunction1((t0: DoneCallback) => reload(t0).runNow()))
    __obj.asInstanceOf[Captcha]
  }
  
  extension [Self <: Captcha](x: Self) {
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setReload(value: DoneCallback => Callback): Self = StObject.set(x, "reload", js.Any.fromFunction1((t0: DoneCallback) => value(t0).runNow()))
  }
}
