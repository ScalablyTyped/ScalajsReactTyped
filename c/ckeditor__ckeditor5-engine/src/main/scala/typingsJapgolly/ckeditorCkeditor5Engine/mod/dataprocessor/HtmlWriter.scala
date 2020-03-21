package typingsJapgolly.ckeditorCkeditor5Engine.mod.dataprocessor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/dataprocessor/htmlwriter
trait HtmlWriter extends js.Object {
  def getHtml(fragment: DocumentFragment): String
}

object HtmlWriter {
  @scala.inline
  def apply(getHtml: DocumentFragment => CallbackTo[String]): HtmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHtml")(js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment) => getHtml(t0).runNow()))
    __obj.asInstanceOf[HtmlWriter]
  }
}

