package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest extends StObject {
  
  /**
    * Optional. A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use
    * for filtering. The value must be a string, a number, or a boolean. String values are case-insensitive. The comparison operator must be either `:`, `=`, `!=`, `>`, `>=`, `<=` or `<`.
    * The `:` operator can be used with string fields to match substrings. For non-string fields it is equivalent to the `=` operator. The `:*` comparison can be used to test whether a
    * key has been defined. You can also filter on nested fields. To filter on multiple expressions, you can separate expression using `AND` and `OR` operators, using parentheses to
    * specify precedence. If neither operator is specified, `AND` is assumed. Examples: Include only pools with more than 100 reserved workers: `(worker_count > 100)
    * (worker_config.reserved = true)` Include only pools with a certain label or machines of the e2-standard family: `worker_config.labels.key1 : * OR worker_config.machine_type:
    * e2-standard`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. */
  var parent: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
