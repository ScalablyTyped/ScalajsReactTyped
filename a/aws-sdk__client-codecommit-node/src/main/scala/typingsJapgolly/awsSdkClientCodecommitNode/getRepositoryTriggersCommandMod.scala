package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object getRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class GetRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryTriggersInput, 
          OutputTypesUnion, 
          GetRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetRepositoryTriggersInput) = this()
    /* CompleteClass */
    override val input: GetRepositoryTriggersInput = js.native
    val middlewareStack: MiddlewareStack[GetRepositoryTriggersInput, GetRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
  }
  
}

