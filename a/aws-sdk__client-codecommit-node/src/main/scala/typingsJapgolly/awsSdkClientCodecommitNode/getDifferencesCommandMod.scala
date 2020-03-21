package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetDifferencesCommand", JSImport.Namespace)
@js.native
object getDifferencesCommandMod extends js.Object {
  @js.native
  class GetDifferencesCommand protected () extends Command[
          InputTypesUnion, 
          GetDifferencesInput, 
          OutputTypesUnion, 
          GetDifferencesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetDifferencesInput) = this()
    /* CompleteClass */
    override val input: GetDifferencesInput = js.native
    val middlewareStack: MiddlewareStack[GetDifferencesInput, GetDifferencesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetDifferencesInput, GetDifferencesOutput] = js.native
  }
  
}

