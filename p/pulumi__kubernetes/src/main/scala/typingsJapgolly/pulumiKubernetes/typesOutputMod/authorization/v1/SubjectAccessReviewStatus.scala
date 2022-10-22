package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SubjectAccessReviewStatus
  */
trait SubjectAccessReviewStatus extends StObject {
  
  /**
    * Allowed is required. True if the action would be allowed, false otherwise.
    */
  var allowed: Boolean
  
  /**
    * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
    */
  var denied: Boolean
  
  /**
    * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
    */
  var evaluationError: String
  
  /**
    * Reason is optional.  It indicates why a request was allowed or denied.
    */
  var reason: String
}
object SubjectAccessReviewStatus {
  
  inline def apply(allowed: Boolean, denied: Boolean, evaluationError: String, reason: String): SubjectAccessReviewStatus = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], evaluationError = evaluationError.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewStatus]
  }
  
  extension [Self <: SubjectAccessReviewStatus](x: Self) {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setDenied(value: Boolean): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    inline def setEvaluationError(value: String): Self = StObject.set(x, "evaluationError", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
