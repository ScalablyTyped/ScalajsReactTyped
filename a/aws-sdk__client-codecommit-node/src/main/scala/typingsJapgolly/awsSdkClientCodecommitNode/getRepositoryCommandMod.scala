package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", JSImport.Namespace)
@js.native
object getRepositoryCommandMod extends js.Object {
  @js.native
  class GetRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryInput, 
          OutputTypesUnion, 
          GetRepositoryOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetRepositoryInput) = this()
    /* CompleteClass */
    override val input: GetRepositoryInput = js.native
    val middlewareStack: MiddlewareStack[GetRepositoryInput, GetRepositoryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  }
  
}

