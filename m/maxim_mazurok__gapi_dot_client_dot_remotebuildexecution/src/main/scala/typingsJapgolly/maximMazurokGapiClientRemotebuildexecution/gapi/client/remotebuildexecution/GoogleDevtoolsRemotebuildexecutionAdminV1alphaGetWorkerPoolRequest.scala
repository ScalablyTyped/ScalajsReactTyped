package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest extends StObject {
  
  /** Name of the worker pool to retrieve. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
