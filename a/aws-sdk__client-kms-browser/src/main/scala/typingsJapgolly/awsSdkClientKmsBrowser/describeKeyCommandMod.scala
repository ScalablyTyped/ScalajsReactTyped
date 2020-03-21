package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesDescribeKeyOutputMod.DescribeKeyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DescribeKeyCommand", JSImport.Namespace)
@js.native
object describeKeyCommandMod extends js.Object {
  @js.native
  class DescribeKeyCommand protected () extends Command[
          InputTypesUnion, 
          DescribeKeyInput, 
          OutputTypesUnion, 
          DescribeKeyOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeKeyInput) = this()
    /* CompleteClass */
    override val input: DescribeKeyInput = js.native
    val middlewareStack: MiddlewareStack[DescribeKeyInput, DescribeKeyOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  }
  
}

