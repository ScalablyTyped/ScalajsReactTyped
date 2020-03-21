package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", JSImport.Namespace)
@js.native
object listEventSourceMappingsCommandMod extends js.Object {
  @js.native
  class ListEventSourceMappingsCommand protected () extends Command[
          InputTypesUnion, 
          ListEventSourceMappingsInput, 
          OutputTypesUnion, 
          ListEventSourceMappingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListEventSourceMappingsInput) = this()
    /* CompleteClass */
    override val input: ListEventSourceMappingsInput = js.native
    val middlewareStack: MiddlewareStack[ListEventSourceMappingsInput, ListEventSourceMappingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  }
  
}

