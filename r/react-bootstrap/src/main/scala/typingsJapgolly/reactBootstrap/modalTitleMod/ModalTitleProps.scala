package typingsJapgolly.reactBootstrap.modalTitleMod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalTitleProps
  extends AllHTMLAttributes[ModalTitle]
     with ClassAttributes[ModalTitle] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object ModalTitleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalTitle] = null,
    ClassAttributes: ClassAttributes[ModalTitle] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): ModalTitleProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTitleProps]
  }
}

