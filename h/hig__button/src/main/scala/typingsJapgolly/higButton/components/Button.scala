package typingsJapgolly.higButton.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.higButton.mod.AvailableTargets_
import typingsJapgolly.higButton.mod.AvailableTypes_
import typingsJapgolly.higButton.mod.AvailableWidths_
import typingsJapgolly.higButton.mod.Props
import typingsJapgolly.higButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    title: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: VdomElement = null,
    link: String = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onClick: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onHover: js.UndefOr[Callback] = js.undefined,
    onMouseDown: js.UndefOr[Callback] = js.undefined,
    onMouseEnter: js.UndefOr[Callback] = js.undefined,
    onMouseLeave: js.UndefOr[Callback] = js.undefined,
    onMouseUp: js.UndefOr[Callback] = js.undefined,
    stylesheet: js.Any = null,
    target: AvailableTargets_ = null,
    `type`: AvailableTypes_ = null,
    width: AvailableWidths_ = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onHover.foreach(p => __obj.updateDynamic("onHover")(p.toJsFn))
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    onMouseUp.foreach(p => __obj.updateDynamic("onMouseUp")(p.toJsFn))
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.higButton.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.higButton.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.higButton.mod.Props])(children: _*)
  }
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

