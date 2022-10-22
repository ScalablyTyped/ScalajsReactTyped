package typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableReference extends StObject {
  
  /** [Required] The ID of the dataset containing this table. */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /** [Required] The ID of the project containing this table. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters. */
  var tableId: js.UndefOr[String] = js.undefined
}
object TableReference {
  
  inline def apply(): TableReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableReference]
  }
  
  extension [Self <: TableReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
