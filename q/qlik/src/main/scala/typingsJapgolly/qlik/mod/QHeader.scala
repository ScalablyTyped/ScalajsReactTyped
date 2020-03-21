package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QHeader extends js.Object {
  var col: Double
  var errorCode: js.UndefOr[Double] = js.undefined
  var errorMessage: js.UndefOr[Double] = js.undefined
  var isOrderedBy: Boolean
  var qCardinal: js.UndefOr[Double] = js.undefined
  var qFallbackTitle: String
  var qMax: js.UndefOr[Double] = js.undefined
  // field?: Field
  var qMin: js.UndefOr[Double] = js.undefined
  var qReverseSort: Boolean
  var qSortIndicator: A | B
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  def orderBy(): Unit
  def reverseOrder(): Unit
  def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): js.Promise[_]
}

object QHeader {
  @scala.inline
  def apply(
    col: Double,
    isOrderedBy: Boolean,
    orderBy: Callback,
    qFallbackTitle: String,
    qReverseSort: Boolean,
    qSortIndicator: A | B,
    reverseOrder: Callback,
    selectRange: (Double, Double, Boolean, Boolean) => CallbackTo[js.Promise[js.Any]],
    errorCode: Int | Double = null,
    errorMessage: Int | Double = null,
    qCardinal: Int | Double = null,
    qMax: Int | Double = null,
    qMin: Int | Double = null,
    qStateCounts: StringDictionary[Double] = null
  ): QHeader = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isOrderedBy = isOrderedBy.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
    __obj.updateDynamic("orderBy")(orderBy.toJsFn)
    __obj.updateDynamic("reverseOrder")(reverseOrder.toJsFn)
    __obj.updateDynamic("selectRange")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Boolean, t3: scala.Boolean) => selectRange(t0, t1, t2, t3).runNow()))
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (qCardinal != null) __obj.updateDynamic("qCardinal")(qCardinal.asInstanceOf[js.Any])
    if (qMax != null) __obj.updateDynamic("qMax")(qMax.asInstanceOf[js.Any])
    if (qMin != null) __obj.updateDynamic("qMin")(qMin.asInstanceOf[js.Any])
    if (qStateCounts != null) __obj.updateDynamic("qStateCounts")(qStateCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[QHeader]
  }
}

