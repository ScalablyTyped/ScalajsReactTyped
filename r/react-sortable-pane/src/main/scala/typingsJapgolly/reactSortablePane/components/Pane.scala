package typingsJapgolly.reactSortablePane.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSortablePane.AnonHeight
import typingsJapgolly.reactSortablePane.paneMod.IsPaneResizable
import typingsJapgolly.reactSortablePane.paneMod.PaneProps
import typingsJapgolly.reactSortablePane.paneMod.PaneSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pane {
  def apply(
    StringDictionary: /* otherProps */ StringDictionary[js.Any] = null,
    className: String = null,
    defaultSize: AnonHeight = null,
    grid: js.Tuple2[Double, Double] = null,
    maxHeight: PaneSize = null,
    maxWidth: PaneSize = null,
    minHeight: PaneSize = null,
    minWidth: PaneSize = null,
    onSizeChange: js.UndefOr[Callback] = js.undefined,
    resizable: IsPaneResizable = null,
    size: AnonHeight = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String | Node = null
  ): UnmountedWithRoot[PaneProps, typingsJapgolly.reactSortablePane.mod.Pane, Unit, PaneProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    onSizeChange.foreach(p => __obj.updateDynamic("onSizeChange")(p.toJsFn))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSortablePane.paneMod.PaneProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSortablePane.mod.Pane](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSortablePane.paneMod.PaneProps])
  }
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  object componentImport extends js.Object
  
}

