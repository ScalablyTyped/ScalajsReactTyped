package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  def spellCheck(words: js.Array[String], callback: js.Function1[/* misspeltWords */ js.Array[String], Unit]): Unit
}
object Provider {
  
  inline def apply(
    spellCheck: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Callback
  ): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function1[/* misspeltWords */ js.Array[String], Unit]) => (spellCheck(t0, t1)).runNow()))
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setSpellCheck(value: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Callback): Self = StObject.set(x, "spellCheck", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function1[/* misspeltWords */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
  }
}
