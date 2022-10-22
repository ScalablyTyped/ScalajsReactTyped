package typingsJapgolly.stripe.anon

import typingsJapgolly.stripe.mod.Stripe.Reporting.ReportRunsResource
import typingsJapgolly.stripe.mod.Stripe.Reporting.ReportTypesResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRuns extends StObject {
  
  var reportRuns: ReportRunsResource
  
  var reportTypes: ReportTypesResource
}
object ReportRuns {
  
  inline def apply(reportRuns: ReportRunsResource, reportTypes: ReportTypesResource): ReportRuns = {
    val __obj = js.Dynamic.literal(reportRuns = reportRuns.asInstanceOf[js.Any], reportTypes = reportTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportRuns]
  }
  
  extension [Self <: ReportRuns](x: Self) {
    
    inline def setReportRuns(value: ReportRunsResource): Self = StObject.set(x, "reportRuns", value.asInstanceOf[js.Any])
    
    inline def setReportTypes(value: ReportTypesResource): Self = StObject.set(x, "reportTypes", value.asInstanceOf[js.Any])
  }
}
