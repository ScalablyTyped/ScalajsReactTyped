package typingsJapgolly.reactVirtualized.esCellMeasurerMod

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var cache: CellMeasurerCacheInterface
  var children: (js.Function1[/* props */ CellMeasurerChildProps, Node]) | Node
  var columnIndex: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var parent: MeasuredCellParent
  var rowIndex: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CellMeasurerProps {
  @scala.inline
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
    children: (js.Function1[/* props */ CellMeasurerChildProps, Node]) | Node = null,
    columnIndex: Int | Double = null,
    index: Int | Double = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null
  ): CellMeasurerProps = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMeasurerProps]
  }
}

