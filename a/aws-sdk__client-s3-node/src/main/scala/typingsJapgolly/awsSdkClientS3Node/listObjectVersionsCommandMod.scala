package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typingsJapgolly.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectVersionsCommand", JSImport.Namespace)
@js.native
object listObjectVersionsCommandMod extends js.Object {
  @js.native
  class ListObjectVersionsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectVersionsInput, 
          OutputTypesUnion, 
          ListObjectVersionsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListObjectVersionsInput) = this()
    /* CompleteClass */
    override val input: ListObjectVersionsInput = js.native
    val middlewareStack: MiddlewareStack[ListObjectVersionsInput, ListObjectVersionsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectVersionsInput, ListObjectVersionsOutput] = js.native
  }
  
}

