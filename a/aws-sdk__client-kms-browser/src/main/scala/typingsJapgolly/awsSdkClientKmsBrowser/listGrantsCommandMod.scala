package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesListGrantsOutputMod.ListGrantsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListGrantsCommand", JSImport.Namespace)
@js.native
object listGrantsCommandMod extends js.Object {
  @js.native
  class ListGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListGrantsInput, 
          OutputTypesUnion, 
          ListGrantsOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListGrantsInput) = this()
    /* CompleteClass */
    override val input: ListGrantsInput = js.native
    val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  }
  
}

