package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/InvokeOutput", JSImport.Namespace)
@js.native
object typesInvokeOutputMod extends js.Object {
  @js.native
  trait InvokeOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The function version that has been executed. This value is returned only if the invocation type is <code>RequestResponse</code>. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">Traffic Shifting Using Aliases</a>.</p>
      */
    var ExecutedVersion: js.UndefOr[String] = js.native
    /**
      * <p>Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report an <code>Handled</code> error, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>. </p>
      */
    var FunctionError: js.UndefOr[String] = js.native
    /**
      * <p> It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is <code>RequestResponse</code> and the logs were requested. </p>
      */
    var LogResult: js.UndefOr[String] = js.native
    /**
      * <p> It is the JSON representation of the object returned by the Lambda function. This is present only if the invocation type is <code>RequestResponse</code>. </p> <p>In the event of a function error this field contains a message describing the error. For the <code>Handled</code> errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the message. </p>
      */
    var Payload: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.native
    /**
      * <p>The HTTP status code will be in the 200 range for successful request. For the <code>RequestResponse</code> invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be 202. For the <code>DryRun</code> invocation type the status code will be 204. </p>
      */
    var StatusCode: js.UndefOr[Double] = js.native
  }
  
}

