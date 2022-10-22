package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalResult extends StObject {
  
  /** Output only. The time when the approval decision was made. */
  var approvalTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called. */
  var approverAccount: js.UndefOr[String] = js.undefined
  
  /** Optional. An optional comment for this manual approval result. */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Required. The decision of this manual approval. */
  var decision: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use
    * case is a link to an external job that approved this Build.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ApprovalResult {
  
  inline def apply(): ApprovalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalResult]
  }
  
  extension [Self <: ApprovalResult](x: Self) {
    
    inline def setApprovalTime(value: String): Self = StObject.set(x, "approvalTime", value.asInstanceOf[js.Any])
    
    inline def setApprovalTimeUndefined: Self = StObject.set(x, "approvalTime", js.undefined)
    
    inline def setApproverAccount(value: String): Self = StObject.set(x, "approverAccount", value.asInstanceOf[js.Any])
    
    inline def setApproverAccountUndefined: Self = StObject.set(x, "approverAccount", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDecision(value: String): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
