package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.layoutMod._LayoutOffset
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnFooter extends _LayoutOffset {
  var columnFooter: js.UndefOr[Double | SignalRef] = js.undefined
  var columnHeader: js.UndefOr[Double | SignalRef] = js.undefined
  var columnTitle: js.UndefOr[Double | SignalRef] = js.undefined
  var rowFooter: js.UndefOr[Double | SignalRef] = js.undefined
  var rowHeader: js.UndefOr[Double | SignalRef] = js.undefined
  var rowTitle: js.UndefOr[Double | SignalRef] = js.undefined
}

object AnonColumnFooter {
  @scala.inline
  def apply(
    columnFooter: Double | SignalRef = null,
    columnHeader: Double | SignalRef = null,
    columnTitle: Double | SignalRef = null,
    rowFooter: Double | SignalRef = null,
    rowHeader: Double | SignalRef = null,
    rowTitle: Double | SignalRef = null
  ): AnonColumnFooter = {
    val __obj = js.Dynamic.literal()
    if (columnFooter != null) __obj.updateDynamic("columnFooter")(columnFooter.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (rowFooter != null) __obj.updateDynamic("rowFooter")(rowFooter.asInstanceOf[js.Any])
    if (rowHeader != null) __obj.updateDynamic("rowHeader")(rowHeader.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnFooter]
  }
}

