package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateRepositoryCommand", JSImport.Namespace)
@js.native
object createRepositoryCommandMod extends js.Object {
  @js.native
  class CreateRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          CreateRepositoryInput, 
          OutputTypesUnion, 
          CreateRepositoryOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateRepositoryInput) = this()
    /* CompleteClass */
    override val input: CreateRepositoryInput = js.native
    val middlewareStack: MiddlewareStack[CreateRepositoryInput, CreateRepositoryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateRepositoryInput, CreateRepositoryOutput] = js.native
  }
  
}

