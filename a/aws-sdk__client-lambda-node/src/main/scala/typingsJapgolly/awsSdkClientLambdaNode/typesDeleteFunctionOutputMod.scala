package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/DeleteFunctionOutput", JSImport.Namespace)
@js.native
object typesDeleteFunctionOutputMod extends js.Object {
  @js.native
  trait DeleteFunctionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
  }
  
}

