package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.gestalt.AnonActiveIndex
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends js.Object {
  var items: js.Array[Node]
  var selectedItemIndex: Double
  var size: js.UndefOr[md | lg] = js.undefined
  def onChange(args: AnonActiveIndex): Unit
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    items: js.Array[Node],
    onChange: AnonActiveIndex => Callback,
    selectedItemIndex: Double,
    size: md | lg = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonActiveIndex) => onChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

