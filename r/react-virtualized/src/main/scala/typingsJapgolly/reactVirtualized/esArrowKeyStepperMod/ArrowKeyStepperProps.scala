package typingsJapgolly.reactVirtualized.esArrowKeyStepperMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.cells
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowKeyStepperProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var columnCount: Double
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isControlled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[edges | cells] = js.undefined
  var onScrollToChange: js.UndefOr[js.Function1[/* params */ ScrollIndices, Unit]] = js.undefined
  var rowCount: Double
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  var scrollToRow: js.UndefOr[Double] = js.undefined
  def children(props: ChildProps): Node
}

object ArrowKeyStepperProps {
  @scala.inline
  def apply(
    children: ChildProps => CallbackTo[Node],
    columnCount: Double,
    rowCount: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mode: edges | cells = null,
    onScrollToChange: /* params */ ScrollIndices => Callback = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null
  ): ArrowKeyStepperProps = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ChildProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onScrollToChange != null) __obj.updateDynamic("onScrollToChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ScrollIndices) => onScrollToChange(t0).runNow()))
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowKeyStepperProps]
  }
}

