package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryDescriptionCommand", JSImport.Namespace)
@js.native
object updateRepositoryDescriptionCommandMod extends js.Object {
  @js.native
  class UpdateRepositoryDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryDescriptionInput, 
          OutputTypesUnion, 
          UpdateRepositoryDescriptionOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateRepositoryDescriptionInput) = this()
    /* CompleteClass */
    override val input: UpdateRepositoryDescriptionInput = js.native
    val middlewareStack: MiddlewareStack[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
  }
  
}

