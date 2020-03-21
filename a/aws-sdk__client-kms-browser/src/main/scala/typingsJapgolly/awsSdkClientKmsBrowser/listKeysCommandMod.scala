package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesListKeysOutputMod.ListKeysOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ListKeysCommand", JSImport.Namespace)
@js.native
object listKeysCommandMod extends js.Object {
  @js.native
  class ListKeysCommand protected () extends Command[
          InputTypesUnion, 
          ListKeysInput, 
          OutputTypesUnion, 
          ListKeysOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListKeysInput) = this()
    /* CompleteClass */
    override val input: ListKeysInput = js.native
    val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
  }
  
}

