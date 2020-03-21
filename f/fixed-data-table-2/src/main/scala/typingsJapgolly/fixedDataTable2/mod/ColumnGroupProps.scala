package typingsJapgolly.fixedDataTable2.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.center
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.left
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.right
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps extends ClassAttributes[ColumnGroup] {
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * Controls if the column group is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * This is the header cell for this column group.
    * This can either be a string or a React element. Passing in a string
    * will render a default footer cell with that string. By default, the React
    * element passed in can expect to receive the following props:
    *
    * ```
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * You can also pass in a function that returns a react elemnt, with the
    * props object above passed in as the first parameter.
    */
  var header: js.UndefOr[
    String | Element | (js.Function1[/* props */ ColumnGroupHeaderProps, String | Element])
  ] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(
    align: left | center | right = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    header: String | Element | (js.Function1[/* props */ ColumnGroupHeaderProps, String | Element]) = null,
    key: Key = null,
    ref: LegacyRef[ColumnGroup] = null
  ): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

