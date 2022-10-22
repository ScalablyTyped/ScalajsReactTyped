package typingsJapgolly.browserReport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, Any]): Unit
  
  def browserReportSync(): ReportResult
}
object Window {
  
  inline def apply(
    browserReport: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, Any] => Callback,
    browserReportSync: CallbackTo[ReportResult]
  ): Window = {
    val __obj = js.Dynamic.literal(browserReport = js.Any.fromFunction1((t0: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, Any]) => browserReport(t0).runNow()), browserReportSync = browserReportSync.toJsFn)
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setBrowserReport(value: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, Any] => Callback): Self = StObject.set(x, "browserReport", js.Any.fromFunction1((t0: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, Any]) => value(t0).runNow()))
    
    inline def setBrowserReportSync(value: CallbackTo[ReportResult]): Self = StObject.set(x, "browserReportSync", value.toJsFn)
  }
}
