package typingsJapgolly.reactVirtualized.esArrowKeyStepperMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.esGridMod.RenderedSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProps extends js.Object {
  var scrollToColumn: Double
  var scrollToRow: Double
  def onSectionRendered(params: RenderedSection): Unit
}

object ChildProps {
  @scala.inline
  def apply(onSectionRendered: RenderedSection => Callback, scrollToColumn: Double, scrollToRow: Double): ChildProps = {
    val __obj = js.Dynamic.literal(scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esGridMod.RenderedSection) => onSectionRendered(t0).runNow()))
    __obj.asInstanceOf[ChildProps]
  }
}

