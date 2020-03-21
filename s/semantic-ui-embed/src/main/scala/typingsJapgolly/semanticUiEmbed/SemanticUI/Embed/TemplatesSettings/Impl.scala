package typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * returns html for iframe
    */
  def iframe(url: String, parameters: String): String
  /**
    * returns html for placeholder element
    */
  def placeholder(image: String, icon: String): String
}

object Impl {
  @scala.inline
  def apply(
    iframe: (String, String) => CallbackTo[String],
    placeholder: (String, String) => CallbackTo[String]
  ): Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iframe")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => iframe(t0, t1).runNow()))
    __obj.updateDynamic("placeholder")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => placeholder(t0, t1).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

