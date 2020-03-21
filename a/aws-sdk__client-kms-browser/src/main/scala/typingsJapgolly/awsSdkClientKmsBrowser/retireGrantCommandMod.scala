package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesRetireGrantOutputMod.RetireGrantOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RetireGrantCommand", JSImport.Namespace)
@js.native
object retireGrantCommandMod extends js.Object {
  @js.native
  class RetireGrantCommand protected () extends Command[
          InputTypesUnion, 
          RetireGrantInput, 
          OutputTypesUnion, 
          RetireGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RetireGrantInput) = this()
    /* CompleteClass */
    override val input: RetireGrantInput = js.native
    val middlewareStack: MiddlewareStack[RetireGrantInput, RetireGrantOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
  }
  
}

