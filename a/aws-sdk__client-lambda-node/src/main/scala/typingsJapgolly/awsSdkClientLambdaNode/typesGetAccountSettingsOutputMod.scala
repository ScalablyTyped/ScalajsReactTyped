package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typingsJapgolly.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/GetAccountSettingsOutput", JSImport.Namespace)
@js.native
object typesGetAccountSettingsOutputMod extends js.Object {
  @js.native
  trait GetAccountSettingsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Limits related to concurrency and code storage.</p>
      */
    var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.native
    /**
      * <p>The number of functions and amount of storage in use.</p>
      */
    var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.native
  }
  
}

