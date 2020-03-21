package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.primereact.passwordMod.PasswordProps
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Password {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    feedback: js.UndefOr[Boolean] = js.undefined,
    mediumLabel: String = null,
    promptLabel: String = null,
    strongLabel: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    weakLabel: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PasswordProps, 
    typingsJapgolly.primereact.primereactPasswordMod.Password, 
    Unit, 
    PasswordProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(feedback)) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (mediumLabel != null) __obj.updateDynamic("mediumLabel")(mediumLabel.asInstanceOf[js.Any])
    if (promptLabel != null) __obj.updateDynamic("promptLabel")(promptLabel.asInstanceOf[js.Any])
    if (strongLabel != null) __obj.updateDynamic("strongLabel")(strongLabel.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (weakLabel != null) __obj.updateDynamic("weakLabel")(weakLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.passwordMod.PasswordProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactPasswordMod.Password](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.passwordMod.PasswordProps])(children: _*)
  }
  @JSImport("primereact/password", "Password")
  @js.native
  object componentImport extends js.Object
  
}

