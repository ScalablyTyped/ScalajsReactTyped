package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdatePullRequestStatusOutputMod {
  
  trait UpdatePullRequestStatusOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the pull request.</p>
      */
    var pullRequest: UnmarshalledPullRequest
  }
  object UpdatePullRequestStatusOutput {
    
    inline def apply($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): UpdatePullRequestStatusOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePullRequestStatusOutput]
    }
    
    extension [Self <: UpdatePullRequestStatusOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequest(value: UnmarshalledPullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    }
  }
}
