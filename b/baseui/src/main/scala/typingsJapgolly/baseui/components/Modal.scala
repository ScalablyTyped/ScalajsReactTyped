package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.AnonCloseSource
import typingsJapgolly.baseui.baseuiStrings.alertdialog
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.dialog
import typingsJapgolly.baseui.baseuiStrings.full
import typingsJapgolly.baseui.modalMod.ModalOverrides
import typingsJapgolly.baseui.modalMod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onClose: /* args */ AnonCloseSource => CallbackTo[js.Any] = null,
    overrides: ModalOverrides = null,
    role: dialog | alertdialog = null,
    size: default_ | full | auto = null,
    unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, typingsJapgolly.baseui.modalMod.Modal, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonCloseSource) => onClose(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_ModalBackdropScroll)) __obj.updateDynamic("unstable_ModalBackdropScroll")(unstable_ModalBackdropScroll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.modalMod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.modalMod.Modal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.modalMod.ModalProps])(children: _*)
  }
  @JSImport("baseui/modal", "Modal")
  @js.native
  object componentImport extends js.Object
  
}

