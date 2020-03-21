package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectTaggingCommand", JSImport.Namespace)
@js.native
object getObjectTaggingCommandMod extends js.Object {
  @js.native
  class GetObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectTaggingInput, 
          OutputTypesUnion, 
          GetObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectTaggingInput) = this()
    /* CompleteClass */
    override val input: GetObjectTaggingInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectTaggingInput, GetObjectTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTaggingInput, GetObjectTaggingOutput] = js.native
  }
  
}

