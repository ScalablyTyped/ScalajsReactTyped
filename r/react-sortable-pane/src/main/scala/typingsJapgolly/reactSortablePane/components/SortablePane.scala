package typingsJapgolly.reactSortablePane.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMotion.mod.SpringHelperConfig
import typingsJapgolly.reactSortablePane.mod.PaneKey
import typingsJapgolly.reactSortablePane.mod.PaneResizeDirection
import typingsJapgolly.reactSortablePane.mod.PaneSize
import typingsJapgolly.reactSortablePane.mod.SortablePaneProps
import typingsJapgolly.reactSortablePane.reactSortablePaneStrings.horizontal
import typingsJapgolly.reactSortablePane.reactSortablePaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortablePane {
  def apply(
    className: String = null,
    defaultOrder: js.Array[String] = null,
    direction: horizontal | vertical = null,
    disableEffect: js.UndefOr[Boolean] = js.undefined,
    dragHandleClassName: String = null,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    onDragStart: (/* e */ ReactMouseEventFrom[HTMLElement] | ReactTouchEventFrom[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Callback = null,
    onDragStop: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Callback = null,
    onOrderChange: /* order */ js.Array[String] => Callback = null,
    onResize: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Callback = null,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLElement] | ReactTouchEventFrom[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Callback = null,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Callback = null,
    order: js.Array[String] = null,
    springConfig: SpringHelperConfig = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element]
  ): UnmountedWithRoot[
    SortablePaneProps, 
    typingsJapgolly.reactSortablePane.mod.SortablePane, 
    Unit, 
    SortablePaneProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultOrder != null) __obj.updateDynamic("defaultOrder")(defaultOrder.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEffect)) __obj.updateDynamic("disableEffect")(disableEffect.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* key */ typingsJapgolly.reactSortablePane.mod.PaneKey, t2: /* elementRef */ org.scalajs.dom.raw.HTMLElement) => onDragStart(t0, t1, t2).runNow()))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction4((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* key */ typingsJapgolly.reactSortablePane.mod.PaneKey, t2: /* elementRef */ org.scalajs.dom.raw.HTMLElement, t3: /* order */ js.Array[java.lang.String]) => onDragStop(t0, t1, t2, t3).runNow()))
    if (onOrderChange != null) __obj.updateDynamic("onOrderChange")(js.Any.fromFunction1((t0: /* order */ js.Array[java.lang.String]) => onOrderChange(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* key */ typingsJapgolly.reactSortablePane.mod.PaneKey, t2: /* dir */ typingsJapgolly.reactSortablePane.mod.PaneResizeDirection, t3: /* elementRef */ org.scalajs.dom.raw.HTMLElement, t4: /* delta */ typingsJapgolly.reactSortablePane.mod.PaneSize) => onResize(t0, t1, t2, t3, t4).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* key */ typingsJapgolly.reactSortablePane.mod.PaneKey, t2: /* dir */ typingsJapgolly.reactSortablePane.mod.PaneResizeDirection) => onResizeStart(t0, t1, t2).runNow()))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* key */ typingsJapgolly.reactSortablePane.mod.PaneKey, t2: /* dir */ typingsJapgolly.reactSortablePane.mod.PaneResizeDirection, t3: /* elementRef */ org.scalajs.dom.raw.HTMLElement, t4: /* delta */ typingsJapgolly.reactSortablePane.mod.PaneSize) => onResizeStop(t0, t1, t2, t3, t4).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSortablePane.mod.SortablePaneProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSortablePane.mod.SortablePane](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSortablePane.mod.SortablePaneProps])
  }
  @JSImport("react-sortable-pane", "SortablePane")
  @js.native
  object componentImport extends js.Object
  
}

