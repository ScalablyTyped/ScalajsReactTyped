package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateGlobalTableOutput", JSImport.Namespace)
@js.native
object typesUpdateGlobalTableOutputMod extends js.Object {
  @js.native
  trait UpdateGlobalTableOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the details of the global table.</p>
      */
    var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.native
  }
  
}

