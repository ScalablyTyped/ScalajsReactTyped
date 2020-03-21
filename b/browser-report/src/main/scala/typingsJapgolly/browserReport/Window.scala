package typingsJapgolly.browserReport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _]): Unit
  def browserReportSync(): ReportResult
}

object Window {
  @scala.inline
  def apply(
    browserReport: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, js.Any] => Callback,
    browserReportSync: CallbackTo[ReportResult]
  ): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browserReport")(js.Any.fromFunction1((t0: js.Function2[
  /* error */ org.scalajs.dom.raw.ErrorEvent, 
  /* report */ typingsJapgolly.browserReport.ReportResult, 
  js.Any]) => browserReport(t0).runNow()))
    __obj.updateDynamic("browserReportSync")(browserReportSync.toJsFn)
    __obj.asInstanceOf[Window]
  }
}

