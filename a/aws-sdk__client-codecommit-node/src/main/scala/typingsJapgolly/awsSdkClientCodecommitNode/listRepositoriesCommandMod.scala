package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListRepositoriesCommand", JSImport.Namespace)
@js.native
object listRepositoriesCommandMod extends js.Object {
  @js.native
  class ListRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          ListRepositoriesInput, 
          OutputTypesUnion, 
          ListRepositoriesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListRepositoriesInput) = this()
    /* CompleteClass */
    override val input: ListRepositoriesInput = js.native
    val middlewareStack: MiddlewareStack[ListRepositoriesInput, ListRepositoriesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
  }
  
}

