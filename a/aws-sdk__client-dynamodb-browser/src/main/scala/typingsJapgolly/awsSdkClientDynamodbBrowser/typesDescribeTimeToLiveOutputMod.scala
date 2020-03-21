package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/DescribeTimeToLiveOutput", JSImport.Namespace)
@js.native
object typesDescribeTimeToLiveOutputMod extends js.Object {
  @js.native
  trait DescribeTimeToLiveOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p/>
      */
    var TimeToLiveDescription: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.native
  }
  
}

