package typingsJapgolly.jqueryAjaxfile.AjaxFileKnockout

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInputWrapper extends js.Object {
  def fileSelected(): Boolean
  def getElement(): HTMLInputElement
}

object IFileInputWrapper {
  @scala.inline
  def apply(fileSelected: CallbackTo[Boolean], getElement: CallbackTo[HTMLInputElement]): IFileInputWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSelected")(fileSelected.toJsFn)
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.asInstanceOf[IFileInputWrapper]
  }
}

