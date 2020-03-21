package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
import typingsJapgolly.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketsCommand", JSImport.Namespace)
@js.native
object listBucketsCommandMod extends js.Object {
  @js.native
  class ListBucketsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketsInput, 
          OutputTypesUnion, 
          ListBucketsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketsInput) = this()
    /* CompleteClass */
    override val input: ListBucketsInput = js.native
    val middlewareStack: MiddlewareStack[ListBucketsInput, ListBucketsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketsInput, ListBucketsOutput] = js.native
  }
  
}

