package typingsJapgolly.victory.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victory.mod.CursorData
import typingsJapgolly.victory.mod.VictoryCursorContainerProps
import typingsJapgolly.victory.victoryStrings.x
import typingsJapgolly.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryCursorContainer {
  def apply(
    cursorComponent: VdomElement = null,
    cursorDimension: x | y = null,
    cursorLabel: /* point */ CursorData => Callback = null,
    cursorLabelComponent: VdomElement = null,
    cursorLabelOffset: Double | CursorData = null,
    defaultCursorValue: Double | CursorData = null,
    desc: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    events: DOMAttributes[_] = null,
    height: Int | Double = null,
    onCursorChange: (/* value */ CursorData, /* props */ VictoryCursorContainerProps) => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VictoryCursorContainerProps, 
    typingsJapgolly.victory.mod.VictoryCursorContainer, 
    Unit, 
    VictoryCursorContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (cursorComponent != null) __obj.updateDynamic("cursorComponent")(cursorComponent.rawElement.asInstanceOf[js.Any])
    if (cursorDimension != null) __obj.updateDynamic("cursorDimension")(cursorDimension.asInstanceOf[js.Any])
    if (cursorLabel != null) __obj.updateDynamic("cursorLabel")(js.Any.fromFunction1((t0: /* point */ typingsJapgolly.victory.mod.CursorData) => cursorLabel(t0).runNow()))
    if (cursorLabelComponent != null) __obj.updateDynamic("cursorLabelComponent")(cursorLabelComponent.rawElement.asInstanceOf[js.Any])
    if (cursorLabelOffset != null) __obj.updateDynamic("cursorLabelOffset")(cursorLabelOffset.asInstanceOf[js.Any])
    if (defaultCursorValue != null) __obj.updateDynamic("defaultCursorValue")(defaultCursorValue.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(js.Any.fromFunction2((t0: /* value */ typingsJapgolly.victory.mod.CursorData, t1: /* props */ typingsJapgolly.victory.mod.VictoryCursorContainerProps) => onCursorChange(t0, t1).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryCursorContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.victory.mod.VictoryCursorContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryCursorContainerProps])(children: _*)
  }
  @JSImport("victory", "VictoryCursorContainer")
  @js.native
  object componentImport extends js.Object
  
}

