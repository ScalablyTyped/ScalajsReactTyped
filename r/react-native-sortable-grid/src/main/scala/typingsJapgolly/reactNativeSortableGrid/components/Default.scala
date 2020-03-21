package typingsJapgolly.reactNativeSortableGrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSortableGrid.AnonTransform
import typingsJapgolly.reactNativeSortableGrid.mod.ItemOrder
import typingsJapgolly.reactNativeSortableGrid.mod.OrderedItem
import typingsJapgolly.reactNativeSortableGrid.mod.SortableGridProps
import typingsJapgolly.reactNativeSortableGrid.mod.defaultCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Default {
  def apply(
    activeBlockCenteringDuration: Int | Double = null,
    blockTransitionDuration: Int | Double = null,
    doubleTapTreshold: Int | Double = null,
    dragActivationThreshold: Int | Double = null,
    dragStartAnimation: AnonTransform = null,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    itemsPerRow: Int | Double = null,
    onDeleteItem: /* deletedItem */ OrderedItem => Callback = null,
    onDragRelease: /* itemOrder */ ItemOrder => Callback = null,
    onDragStart: /* item */ OrderedItem => Callback = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element] = null
  ): UnmountedWithRoot[SortableGridProps, defaultCls, Unit, SortableGridProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (activeBlockCenteringDuration != null) __obj.updateDynamic("activeBlockCenteringDuration")(activeBlockCenteringDuration.asInstanceOf[js.Any])
    if (blockTransitionDuration != null) __obj.updateDynamic("blockTransitionDuration")(blockTransitionDuration.asInstanceOf[js.Any])
    if (doubleTapTreshold != null) __obj.updateDynamic("doubleTapTreshold")(doubleTapTreshold.asInstanceOf[js.Any])
    if (dragActivationThreshold != null) __obj.updateDynamic("dragActivationThreshold")(dragActivationThreshold.asInstanceOf[js.Any])
    if (dragStartAnimation != null) __obj.updateDynamic("dragStartAnimation")(dragStartAnimation.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (onDeleteItem != null) __obj.updateDynamic("onDeleteItem")(js.Any.fromFunction1((t0: /* deletedItem */ typingsJapgolly.reactNativeSortableGrid.mod.OrderedItem) => onDeleteItem(t0).runNow()))
    if (onDragRelease != null) __obj.updateDynamic("onDragRelease")(js.Any.fromFunction1((t0: /* itemOrder */ typingsJapgolly.reactNativeSortableGrid.mod.ItemOrder) => onDragRelease(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.reactNativeSortableGrid.mod.OrderedItem) => onDragStart(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSortableGrid.mod.SortableGridProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeSortableGrid.mod.defaultCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSortableGrid.mod.SortableGridProps])
  }
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

