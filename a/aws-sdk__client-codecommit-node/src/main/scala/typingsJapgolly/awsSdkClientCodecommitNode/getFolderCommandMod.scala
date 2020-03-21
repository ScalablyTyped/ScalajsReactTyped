package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", JSImport.Namespace)
@js.native
object getFolderCommandMod extends js.Object {
  @js.native
  class GetFolderCommand protected () extends Command[
          InputTypesUnion, 
          GetFolderInput, 
          OutputTypesUnion, 
          GetFolderOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFolderInput) = this()
    /* CompleteClass */
    override val input: GetFolderInput = js.native
    val middlewareStack: MiddlewareStack[GetFolderInput, GetFolderOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
  }
  
}

