package typingsJapgolly.gsap.gsap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseLookup extends js.Object {
  def find(name: String): Ease
}

object EaseLookup {
  @scala.inline
  def apply(find: String => CallbackTo[Ease]): EaseLookup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.asInstanceOf[EaseLookup]
  }
}

