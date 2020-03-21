package typingsJapgolly.formol.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formol.AnonDictk
import typingsJapgolly.formol.mod.SwitchButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchButton {
  def apply(
    className: String = null,
    i18n: AnonDictk = null,
    leftLabel: VdomNode = null,
    rightLabel: VdomNode = null,
    `type`: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchButtonProps, typingsJapgolly.formol.mod.SwitchButton, Unit, SwitchButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.rawNode.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formol.mod.SwitchButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.formol.mod.SwitchButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formol.mod.SwitchButtonProps])(children: _*)
  }
  @JSImport("formol", "SwitchButton")
  @js.native
  object componentImport extends js.Object
  
}

