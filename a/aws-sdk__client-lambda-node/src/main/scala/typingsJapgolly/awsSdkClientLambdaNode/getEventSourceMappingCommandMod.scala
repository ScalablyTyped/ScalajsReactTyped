package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingOutputMod.GetEventSourceMappingOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetEventSourceMappingCommand", JSImport.Namespace)
@js.native
object getEventSourceMappingCommandMod extends js.Object {
  @js.native
  class GetEventSourceMappingCommand protected () extends Command[
          InputTypesUnion, 
          GetEventSourceMappingInput, 
          OutputTypesUnion, 
          GetEventSourceMappingOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetEventSourceMappingInput) = this()
    /* CompleteClass */
    override val input: GetEventSourceMappingInput = js.native
    val middlewareStack: MiddlewareStack[GetEventSourceMappingInput, GetEventSourceMappingOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
  }
  
}

