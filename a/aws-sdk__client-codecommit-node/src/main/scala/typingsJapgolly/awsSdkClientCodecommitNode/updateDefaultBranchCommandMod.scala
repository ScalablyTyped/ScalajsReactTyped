package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateDefaultBranchCommand", JSImport.Namespace)
@js.native
object updateDefaultBranchCommandMod extends js.Object {
  @js.native
  class UpdateDefaultBranchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateDefaultBranchInput, 
          OutputTypesUnion, 
          UpdateDefaultBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateDefaultBranchInput) = this()
    /* CompleteClass */
    override val input: UpdateDefaultBranchInput = js.native
    val middlewareStack: MiddlewareStack[UpdateDefaultBranchInput, UpdateDefaultBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateDefaultBranchInput, UpdateDefaultBranchOutput] = js.native
  }
  
}

