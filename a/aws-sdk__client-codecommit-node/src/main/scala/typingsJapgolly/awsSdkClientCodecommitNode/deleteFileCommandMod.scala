package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", JSImport.Namespace)
@js.native
object deleteFileCommandMod extends js.Object {
  @js.native
  class DeleteFileCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFileInput, 
          OutputTypesUnion, 
          DeleteFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFileInput) = this()
    /* CompleteClass */
    override val input: DeleteFileInput = js.native
    val middlewareStack: MiddlewareStack[DeleteFileInput, DeleteFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  }
  
}

