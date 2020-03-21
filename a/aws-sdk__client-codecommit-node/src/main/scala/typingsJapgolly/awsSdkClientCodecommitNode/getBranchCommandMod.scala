package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBranchCommand", JSImport.Namespace)
@js.native
object getBranchCommandMod extends js.Object {
  @js.native
  class GetBranchCommand protected () extends Command[
          InputTypesUnion, 
          GetBranchInput, 
          OutputTypesUnion, 
          GetBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBranchInput) = this()
    /* CompleteClass */
    override val input: GetBranchInput = js.native
    val middlewareStack: MiddlewareStack[GetBranchInput, GetBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
  }
  
}

