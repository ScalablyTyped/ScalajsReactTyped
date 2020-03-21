package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListTagsOutputMod.ListTagsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", JSImport.Namespace)
@js.native
object listTagsCommandMod extends js.Object {
  @js.native
  class ListTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsInput, 
          OutputTypesUnion, 
          ListTagsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTagsInput) = this()
    /* CompleteClass */
    override val input: ListTagsInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsInput, ListTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
  }
  
}

