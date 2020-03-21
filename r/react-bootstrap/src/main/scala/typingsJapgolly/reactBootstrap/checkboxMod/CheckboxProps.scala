package typingsJapgolly.reactBootstrap.checkboxMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.error
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.success
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends AllHTMLAttributes[Checkbox]
     with ClassAttributes[Checkbox] {
  var bsClass: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
  var validationState: js.UndefOr[success | warning | error] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Checkbox] = null,
    ClassAttributes: ClassAttributes[Checkbox] = null,
    bsClass: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* instance */ HTMLInputElement => Callback = null,
    validationState: success | warning | error = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* instance */ org.scalajs.dom.raw.HTMLInputElement) => inputRef(t0).runNow()))
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

