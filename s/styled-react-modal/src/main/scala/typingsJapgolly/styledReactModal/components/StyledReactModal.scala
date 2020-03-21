package typingsJapgolly.styledReactModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.std.Event_
import typingsJapgolly.styledReactModal.mod.ModalProps
import typingsJapgolly.styledReactModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledReactModal {
  def apply(
    isOpen: Boolean,
    afterClose: js.UndefOr[Callback] = js.undefined,
    afterOpen: js.UndefOr[Callback] = js.undefined,
    allowScroll: js.UndefOr[Boolean] = js.undefined,
    backgroundProps: js.Object = null,
    beforeClose: js.Promise[Unit] | js.Function0[Unit] = null,
    beforeOpen: js.Promise[Unit] | js.Function0[Unit] = null,
    onBackgroundClick: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onEscapeKeydown: /* event */ Event_ => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, default, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
      afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    afterOpen.foreach(p => __obj.updateDynamic("afterOpen")(p.toJsFn))
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll.asInstanceOf[js.Any])
    if (backgroundProps != null) __obj.updateDynamic("backgroundProps")(backgroundProps.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBackgroundClick(t0).runNow()))
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onEscapeKeydown(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledReactModal.mod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledReactModal.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styledReactModal.mod.ModalProps])(children: _*)
  }
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

