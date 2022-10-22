package typingsJapgolly.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateS3ResourcesRequest extends StObject {
  
  /**
    * (Discontinued) The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie Classic.
    */
  var associatedS3Resources: S3Resources
  
  /**
    * (Discontinued) The ID of the Amazon Macie Classic member account whose resources you want to remove from being monitored by Macie Classic.
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
}
object DisassociateS3ResourcesRequest {
  
  inline def apply(associatedS3Resources: S3Resources): DisassociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(associatedS3Resources = associatedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateS3ResourcesRequest]
  }
  
  extension [Self <: DisassociateS3ResourcesRequest](x: Self) {
    
    inline def setAssociatedS3Resources(value: S3Resources): Self = StObject.set(x, "associatedS3Resources", value.asInstanceOf[js.Any])
    
    inline def setAssociatedS3ResourcesVarargs(value: S3Resource*): Self = StObject.set(x, "associatedS3Resources", js.Array(value*))
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
  }
}
