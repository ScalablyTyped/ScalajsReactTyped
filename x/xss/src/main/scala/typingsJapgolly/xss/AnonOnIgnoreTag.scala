package typingsJapgolly.xss

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnIgnoreTag extends js.Object {
  def onIgnoreTag(tag: String, html: String, options: AnonIsClosing): String
  def remove(html: String): String
}

object AnonOnIgnoreTag {
  @scala.inline
  def apply(
    onIgnoreTag: (String, String, AnonIsClosing) => CallbackTo[String],
    remove: String => CallbackTo[String]
  ): AnonOnIgnoreTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onIgnoreTag")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.xss.AnonIsClosing) => onIgnoreTag(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[AnonOnIgnoreTag]
  }
}

