package typingsJapgolly.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableReference extends StObject {
  
  /** The ID of the dataset in the above project. */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /** The assigned project ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The ID of the table in the above dataset. */
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
