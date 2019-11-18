package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  /**
    * .
    */
  def spellCheck(words: js.Array[String], callback: js.Function1[/* misspeltWords */ js.Array[String], Unit]): Unit
}

object Provider {
  @scala.inline
  def apply(
    spellCheck: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Callback
  ): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spellCheck")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function1[/* misspeltWords */ js.Array[java.lang.String], scala.Unit]) => spellCheck(t0, t1).runNow()))
    __obj.asInstanceOf[Provider]
  }
}

