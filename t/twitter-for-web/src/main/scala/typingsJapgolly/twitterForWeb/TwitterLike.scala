package typingsJapgolly.twitterForWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitterLike extends StObject {
  
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ Twitter, Unit]): Unit
}
object TwitterLike {
  
  inline def apply(ready: js.Function1[/* twttr */ Twitter, Unit] => Callback): TwitterLike = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1((t0: js.Function1[/* twttr */ Twitter, Unit]) => ready(t0).runNow()))
    __obj.asInstanceOf[TwitterLike]
  }
  
  extension [Self <: TwitterLike](x: Self) {
    
    inline def setReady(value: js.Function1[/* twttr */ Twitter, Unit] => Callback): Self = StObject.set(x, "ready", js.Any.fromFunction1((t0: js.Function1[/* twttr */ Twitter, Unit]) => value(t0).runNow()))
  }
}
