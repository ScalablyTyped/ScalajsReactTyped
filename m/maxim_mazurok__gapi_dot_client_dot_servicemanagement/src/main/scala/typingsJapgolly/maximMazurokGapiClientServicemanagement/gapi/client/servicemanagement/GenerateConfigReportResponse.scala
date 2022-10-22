package typingsJapgolly.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateConfigReportResponse extends StObject {
  
  /** list of ChangeReport, each corresponding to comparison between two service configurations. */
  var changeReports: js.UndefOr[js.Array[ChangeReport]] = js.undefined
  
  /** Errors / Linter warnings associated with the service definition this report belongs to. */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  
  /** ID of the service configuration this report belongs to. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of the service this report belongs to. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object GenerateConfigReportResponse {
  
  inline def apply(): GenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportResponse]
  }
  
  extension [Self <: GenerateConfigReportResponse](x: Self) {
    
    inline def setChangeReports(value: js.Array[ChangeReport]): Self = StObject.set(x, "changeReports", value.asInstanceOf[js.Any])
    
    inline def setChangeReportsUndefined: Self = StObject.set(x, "changeReports", js.undefined)
    
    inline def setChangeReportsVarargs(value: ChangeReport*): Self = StObject.set(x, "changeReports", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
