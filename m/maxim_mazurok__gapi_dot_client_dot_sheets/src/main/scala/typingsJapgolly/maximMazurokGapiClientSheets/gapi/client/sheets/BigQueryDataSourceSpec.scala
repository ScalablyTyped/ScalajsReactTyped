package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryDataSourceSpec extends StObject {
  
  /** The ID of a BigQuery enabled GCP project with a billing account attached. For any queries executed against the data source, the project is charged. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** A BigQueryQuerySpec. */
  var querySpec: js.UndefOr[BigQueryQuerySpec] = js.undefined
  
  /** A BigQueryTableSpec. */
  var tableSpec: js.UndefOr[BigQueryTableSpec] = js.undefined
}
object BigQueryDataSourceSpec {
  
  inline def apply(): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  
  extension [Self <: BigQueryDataSourceSpec](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setQuerySpec(value: BigQueryQuerySpec): Self = StObject.set(x, "querySpec", value.asInstanceOf[js.Any])
    
    inline def setQuerySpecUndefined: Self = StObject.set(x, "querySpec", js.undefined)
    
    inline def setTableSpec(value: BigQueryTableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
  }
}
