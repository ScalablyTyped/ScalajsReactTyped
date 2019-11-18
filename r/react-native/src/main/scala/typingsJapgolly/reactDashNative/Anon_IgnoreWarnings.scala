package typingsJapgolly.reactDashNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreWarnings extends js.Object {
  def ignoreWarnings(warnings: js.Array[String]): Unit
}

object Anon_IgnoreWarnings {
  @scala.inline
  def apply(ignoreWarnings: js.Array[String] => Callback): Anon_IgnoreWarnings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreWarnings")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => ignoreWarnings(t0).runNow()))
    __obj.asInstanceOf[Anon_IgnoreWarnings]
  }
}

