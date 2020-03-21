package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.primereact.inputTextareaMod.InputTextareaProps
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputTextarea {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLTextAreaElement] = null,
    ClassAttributes: ClassAttributes[HTMLTextAreaElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InputTextareaProps, 
    typingsJapgolly.primereact.primereactInputtextareaMod.InputTextarea, 
    Unit, 
    InputTextareaProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.inputTextareaMod.InputTextareaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactInputtextareaMod.InputTextarea](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.inputTextareaMod.InputTextareaProps])(children: _*)
  }
  @JSImport("primereact/inputtextarea", "InputTextarea")
  @js.native
  object componentImport extends js.Object
  
}

