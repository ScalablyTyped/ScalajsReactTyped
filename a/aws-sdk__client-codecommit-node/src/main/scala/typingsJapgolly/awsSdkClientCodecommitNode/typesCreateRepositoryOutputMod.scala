package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/CreateRepositoryOutput", JSImport.Namespace)
@js.native
object typesCreateRepositoryOutputMod extends js.Object {
  @js.native
  trait CreateRepositoryOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the newly created repository.</p>
      */
    var repositoryMetadata: js.UndefOr[UnmarshalledRepositoryMetadata] = js.native
  }
  
}

