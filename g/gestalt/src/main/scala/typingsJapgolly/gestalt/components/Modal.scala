package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.gestaltStrings.alertdialog
import typingsJapgolly.gestalt.gestaltStrings.dialog
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.mod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    accessibilityCloseLabel: String,
    accessibilityModalLabel: String,
    heading: String,
    onDismiss: Callback,
    footer: VdomNode = null,
    role: alertdialog | dialog = null,
    size: sm | md | lg = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, typingsJapgolly.gestalt.mod.Modal, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal(accessibilityCloseLabel = accessibilityCloseLabel.asInstanceOf[js.Any], accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Modal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.ModalProps])(children: _*)
  }
  @JSImport("gestalt", "Modal")
  @js.native
  object componentImport extends js.Object
  
}

