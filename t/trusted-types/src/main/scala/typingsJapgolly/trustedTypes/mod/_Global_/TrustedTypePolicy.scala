package typingsJapgolly.trustedTypes.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypePolicy extends js.Object {
  val name: String
  def createHTML(input: String): TrustedHTML
  def createScript(input: String): TrustedScript
  def createScriptURL(input: String): TrustedScriptURL
  def createURL(input: String): TrustedURL
}

object TrustedTypePolicy {
  @scala.inline
  def apply(
    createHTML: String => CallbackTo[TrustedHTML],
    createScript: String => CallbackTo[TrustedScript],
    createScriptURL: String => CallbackTo[TrustedScriptURL],
    createURL: String => CallbackTo[TrustedURL],
    name: String
  ): TrustedTypePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("createHTML")(js.Any.fromFunction1((t0: java.lang.String) => createHTML(t0).runNow()))
    __obj.updateDynamic("createScript")(js.Any.fromFunction1((t0: java.lang.String) => createScript(t0).runNow()))
    __obj.updateDynamic("createScriptURL")(js.Any.fromFunction1((t0: java.lang.String) => createScriptURL(t0).runNow()))
    __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: java.lang.String) => createURL(t0).runNow()))
    __obj.asInstanceOf[TrustedTypePolicy]
  }
}

