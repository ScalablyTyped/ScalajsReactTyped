package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", JSImport.Namespace)
@js.native
object getFileCommandMod extends js.Object {
  @js.native
  class GetFileCommand protected () extends Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFileInput) = this()
    /* CompleteClass */
    override val input: GetFileInput = js.native
    val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
  
}

