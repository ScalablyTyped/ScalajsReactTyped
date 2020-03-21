package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingOutputMod.DeleteEventSourceMappingOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteEventSourceMappingCommand", JSImport.Namespace)
@js.native
object deleteEventSourceMappingCommandMod extends js.Object {
  @js.native
  class DeleteEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventSourceMappingInput, 
          OutputTypesUnion, 
          DeleteEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteEventSourceMappingInput) = this()
    /* CompleteClass */
    override val input: DeleteEventSourceMappingInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
  }
  
}

