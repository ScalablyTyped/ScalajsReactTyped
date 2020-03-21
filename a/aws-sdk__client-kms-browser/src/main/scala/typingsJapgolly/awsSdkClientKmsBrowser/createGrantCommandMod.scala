package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantOutputMod.CreateGrantOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/CreateGrantCommand", JSImport.Namespace)
@js.native
object createGrantCommandMod extends js.Object {
  @js.native
  class CreateGrantCommand protected () extends Command[
          InputTypesUnion, 
          CreateGrantInput, 
          OutputTypesUnion, 
          CreateGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateGrantInput) = this()
    /* CompleteClass */
    override val input: CreateGrantInput = js.native
    val middlewareStack: MiddlewareStack[CreateGrantInput, CreateGrantOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  }
  
}

