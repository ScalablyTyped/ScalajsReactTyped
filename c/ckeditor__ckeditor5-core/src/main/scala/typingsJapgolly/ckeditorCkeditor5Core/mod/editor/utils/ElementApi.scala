package typingsJapgolly.ckeditorCkeditor5Core.mod.editor.utils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementApi extends js.Object {
  val sourceElement: HTMLElement
  def updateSourceElement(): Unit
}

object ElementApi {
  @scala.inline
  def apply(sourceElement: HTMLElement, updateSourceElement: Callback): ElementApi = {
    val __obj = js.Dynamic.literal(sourceElement = sourceElement.asInstanceOf[js.Any])
    __obj.updateDynamic("updateSourceElement")(updateSourceElement.toJsFn)
    __obj.asInstanceOf[ElementApi]
  }
}

