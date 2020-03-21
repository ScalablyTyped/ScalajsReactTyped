package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerChildProps
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CellMeasurer {
  def apply(
    cache: CellMeasurerCacheInterface,
    parent: MeasuredCellParent,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    columnIndex: Int | Double = null,
    index: Int | Double = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ CellMeasurerChildProps, Node]) | Node = null
  ): UnmountedWithRoot[
    CellMeasurerProps, 
    typingsJapgolly.reactVirtualized.mod.CellMeasurer, 
    Unit, 
    CellMeasurerProps
  ] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.CellMeasurer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerProps])
  }
  @JSImport("react-virtualized", "CellMeasurer")
  @js.native
  object componentImport extends js.Object
  
}

