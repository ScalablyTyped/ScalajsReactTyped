package typingsJapgolly.reactPopover.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPopover.mod.PopoverPlace
import typingsJapgolly.reactPopover.mod.PopoverProps
import typingsJapgolly.reactPopover.mod.^
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPopover {
  def apply(
    appendTarget: Element = null,
    body: VdomNode = null,
    className: String = null,
    enterExitTransitionDurationMs: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onOuterAction: /* event */ Event_ => Callback = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: Int | Double = null,
    style: CSSProperties = null,
    target: VdomElement = null,
    tipSize: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, ^, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (enterExitTransitionDurationMs != null) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOuterAction(t0).runNow()))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace.asInstanceOf[js.Any])
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.rawElement.asInstanceOf[js.Any])
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopover.mod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPopover.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopover.mod.PopoverProps])(children: _*)
  }
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

