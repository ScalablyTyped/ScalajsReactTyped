package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardStatic extends StObject {
  
  def getString(): js.Promise[String]
  
  def setString(content: String): Unit
}
object ClipboardStatic {
  
  inline def apply(getString: CallbackTo[js.Promise[String]], setString: String => Callback): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = getString.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[ClipboardStatic]
  }
  
  extension [Self <: ClipboardStatic](x: Self) {
    
    inline def setGetString(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
