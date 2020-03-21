package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectTaggingCommand", JSImport.Namespace)
@js.native
object putObjectTaggingCommandMod extends js.Object {
  @js.native
  class PutObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectTaggingInput, 
          OutputTypesUnion, 
          PutObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectTaggingInput) = this()
    /* CompleteClass */
    override val input: PutObjectTaggingInput = js.native
    val middlewareStack: MiddlewareStack[PutObjectTaggingInput, PutObjectTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectTaggingInput, PutObjectTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectTaggingInput, PutObjectTaggingOutput] = js.native
  }
  
}

