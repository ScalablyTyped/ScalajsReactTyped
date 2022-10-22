package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalConfig extends StObject {
  
  /** Whether or not approval is needed. If this is set on a build, it will become pending when created, and will need to be explicitly approved to start. */
  var approvalRequired: js.UndefOr[Boolean] = js.undefined
}
object ApprovalConfig {
  
  inline def apply(): ApprovalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalConfig]
  }
  
  extension [Self <: ApprovalConfig](x: Self) {
    
    inline def setApprovalRequired(value: Boolean): Self = StObject.set(x, "approvalRequired", value.asInstanceOf[js.Any])
    
    inline def setApprovalRequiredUndefined: Self = StObject.set(x, "approvalRequired", js.undefined)
  }
}
