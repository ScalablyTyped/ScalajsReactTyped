package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.AnonClientHeight
import typingsJapgolly.reactVirtualized.AnonStartIndex
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryCellProps
import typingsJapgolly.reactVirtualized.esMasonryMod.MasonryProps
import typingsJapgolly.reactVirtualized.esMasonryMod.Positioner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Masonry {
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    height: Double,
    width: Double,
    cellRenderer: /* props */ MasonryCellProps => CallbackTo[Node],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    id: String = null,
    keyMapper: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[js.Any] = null,
    onCellsRendered: /* params */ AnonStartIndex => Callback = null,
    onScroll: /* params */ AnonClientHeight => Callback = null,
    overscanByPixels: Int | Double = null,
    role: String = null,
    scrollingResetTimeInterval: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MasonryProps, typingsJapgolly.reactVirtualized.mod.Masonry, Unit, MasonryProps] = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esMasonryMod.MasonryCellProps) => cellRenderer(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => keyMapper(t0, t1).runNow()))
    if (onCellsRendered != null) __obj.updateDynamic("onCellsRendered")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.AnonStartIndex) => onCellsRendered(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.AnonClientHeight) => onScroll(t0).runNow()))
    if (overscanByPixels != null) __obj.updateDynamic("overscanByPixels")(overscanByPixels.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esMasonryMod.MasonryProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualized.mod.Masonry](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esMasonryMod.MasonryProps])(children: _*)
  }
  @JSImport("react-virtualized", "Masonry")
  @js.native
  object componentImport extends js.Object
  
}

