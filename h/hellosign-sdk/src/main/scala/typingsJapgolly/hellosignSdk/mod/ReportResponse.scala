package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportResponse
  extends StObject
     with BaseResponse {
  
  var report: Report
}
object ReportResponse {
  
  inline def apply(report: Report, resHeaders: IncomingHttpHeaders): ReportResponse = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResponse]
  }
  
  extension [Self <: ReportResponse](x: Self) {
    
    inline def setReport(value: Report): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
