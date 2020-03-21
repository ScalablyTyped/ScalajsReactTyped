package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.formGroupMod.IFormGroupProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup {
  def apply(
    className: String = null,
    contentClassName: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    helperText: VdomNode = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    label: VdomNode = null,
    labelFor: String = null,
    labelInfo: VdomNode = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IFormGroupProps, typingsJapgolly.blueprintjsCore.mod.FormGroup, Unit, IFormGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelFor != null) __obj.updateDynamic("labelFor")(labelFor.asInstanceOf[js.Any])
    if (labelInfo != null) __obj.updateDynamic("labelInfo")(labelInfo.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.formGroupMod.IFormGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.FormGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.formGroupMod.IFormGroupProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "FormGroup")
  @js.native
  object componentImport extends js.Object
  
}

