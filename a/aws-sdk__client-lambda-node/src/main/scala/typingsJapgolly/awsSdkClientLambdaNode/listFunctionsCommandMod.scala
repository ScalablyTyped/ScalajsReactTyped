package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", JSImport.Namespace)
@js.native
object listFunctionsCommandMod extends js.Object {
  @js.native
  class ListFunctionsCommand protected () extends Command[
          InputTypesUnion, 
          ListFunctionsInput, 
          OutputTypesUnion, 
          ListFunctionsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListFunctionsInput) = this()
    /* CompleteClass */
    override val input: ListFunctionsInput = js.native
    val middlewareStack: MiddlewareStack[ListFunctionsInput, ListFunctionsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
  
}

