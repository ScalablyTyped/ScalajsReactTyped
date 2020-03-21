package typingsJapgolly.gsap.gsap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSRulePlugin extends TweenPlugin {
  def getRule(selector: String): js.Object
}

object CSSRulePlugin {
  @scala.inline
  def apply(activate: js.Array[js.Any] => CallbackTo[Boolean], getRule: String => CallbackTo[js.Object]): CSSRulePlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: js.Array[js.Any]) => activate(t0).runNow()))
    __obj.updateDynamic("getRule")(js.Any.fromFunction1((t0: java.lang.String) => getRule(t0).runNow()))
    __obj.asInstanceOf[CSSRulePlugin]
  }
}

