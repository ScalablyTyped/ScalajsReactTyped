package typingsJapgolly.calq.Calq_

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  def clear(): Unit
  def identify(userId: String): Unit
  def profile(params: StringDictionary[js.Any]): Unit
}

object User {
  @scala.inline
  def apply(clear: Callback, identify: String => Callback, profile: StringDictionary[js.Any] => Callback): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("identify")(js.Any.fromFunction1((t0: java.lang.String) => identify(t0).runNow()))
    __obj.updateDynamic("profile")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => profile(t0).runNow()))
    __obj.asInstanceOf[User]
  }
}

