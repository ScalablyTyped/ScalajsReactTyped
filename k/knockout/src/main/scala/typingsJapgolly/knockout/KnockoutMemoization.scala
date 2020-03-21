package typingsJapgolly.knockout

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMemoization extends js.Object {
  def memoize(callback: js.Function): String
  def parseMemoText(memoText: String): String
  def unmemoize(memoId: String, callbackParams: js.Array[_]): Boolean
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[_]): Boolean
}

object KnockoutMemoization {
  @scala.inline
  def apply(
    memoize: js.Function => CallbackTo[String],
    parseMemoText: String => CallbackTo[String],
    unmemoize: (String, js.Array[js.Any]) => CallbackTo[Boolean],
    unmemoizeDomNodeAndDescendants: (js.Any, js.Array[js.Any]) => CallbackTo[Boolean]
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("memoize")(js.Any.fromFunction1((t0: js.Function) => memoize(t0).runNow()))
    __obj.updateDynamic("parseMemoText")(js.Any.fromFunction1((t0: java.lang.String) => parseMemoText(t0).runNow()))
    __obj.updateDynamic("unmemoize")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => unmemoize(t0, t1).runNow()))
    __obj.updateDynamic("unmemoizeDomNodeAndDescendants")(js.Any.fromFunction2((t0: js.Any, t1: js.Array[js.Any]) => unmemoizeDomNodeAndDescendants(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutMemoization]
  }
}

