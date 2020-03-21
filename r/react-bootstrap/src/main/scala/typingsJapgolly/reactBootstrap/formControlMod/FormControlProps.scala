package typingsJapgolly.reactBootstrap.formControlMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps
  extends AllHTMLAttributes[FormControl]
     with ClassAttributes[FormControl] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormControl] = null,
    ClassAttributes: ClassAttributes[FormControl] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    componentClass: ReactType[_] = null,
    inputRef: /* instance */ HTMLInputElement => Callback = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* instance */ org.scalajs.dom.raw.HTMLInputElement) => inputRef(t0).runNow()))
    __obj.asInstanceOf[FormControlProps]
  }
}

