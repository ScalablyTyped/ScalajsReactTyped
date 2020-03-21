package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesListAliasesOutputMod.ListAliasesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListAliasesCommand", JSImport.Namespace)
@js.native
object listAliasesCommandMod extends js.Object {
  @js.native
  class ListAliasesCommand protected () extends Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListAliasesInput) = this()
    /* CompleteClass */
    override val input: ListAliasesInput = js.native
    val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
  
}

