package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.fundamentalReact.AnonCloseButton
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`6`
import typingsJapgolly.fundamentalReact.modalMod.ModalProps
import typingsJapgolly.fundamentalReact.modalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    title: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: VdomNode = null,
    bodyProps: StringDictionary[js.Any] = null,
    closeProps: StringDictionary[js.Any] = null,
    contentProps: StringDictionary[js.Any] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    footerProps: StringDictionary[js.Any] = null,
    headerProps: StringDictionary[js.Any] = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    localizedText: AnonCloseButton = null,
    onClose: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    show: js.UndefOr[Boolean] = js.undefined,
    titleProps: StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, default, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps.asInstanceOf[js.Any])
    if (closeProps != null) __obj.updateDynamic("closeProps")(closeProps.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClose(t0).runNow()))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.modalMod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.modalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.modalMod.ModalProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Modal/Modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

