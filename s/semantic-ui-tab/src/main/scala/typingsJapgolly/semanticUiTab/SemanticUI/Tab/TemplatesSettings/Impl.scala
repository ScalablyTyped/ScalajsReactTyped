package typingsJapgolly.semanticUiTab.SemanticUI.Tab.TemplatesSettings

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * returns page title
    */
  def determineTitle(tabArray: js.Array[_]): String
}

object Impl {
  @scala.inline
  def apply(determineTitle: js.Array[js.Any] => CallbackTo[String]): Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("determineTitle")(js.Any.fromFunction1((t0: js.Array[js.Any]) => determineTitle(t0).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

