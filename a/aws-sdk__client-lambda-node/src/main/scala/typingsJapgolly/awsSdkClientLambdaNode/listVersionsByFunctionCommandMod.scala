package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", JSImport.Namespace)
@js.native
object listVersionsByFunctionCommandMod extends js.Object {
  @js.native
  class ListVersionsByFunctionCommand protected () extends Command[
          InputTypesUnion, 
          ListVersionsByFunctionInput, 
          OutputTypesUnion, 
          ListVersionsByFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVersionsByFunctionInput) = this()
    /* CompleteClass */
    override val input: ListVersionsByFunctionInput = js.native
    val middlewareStack: MiddlewareStack[ListVersionsByFunctionInput, ListVersionsByFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
  
}

