package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/CreatePullRequestOutput", JSImport.Namespace)
@js.native
object typesCreatePullRequestOutputMod extends js.Object {
  @js.native
  trait CreatePullRequestOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the newly created pull request.</p>
      */
    var pullRequest: UnmarshalledPullRequest = js.native
  }
  
}

