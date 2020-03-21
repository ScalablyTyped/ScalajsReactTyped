package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
import typingsJapgolly.awsSdkClientKmsNode.typesCreateGrantOutputMod.CreateGrantOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateGrantCommand", JSImport.Namespace)
@js.native
object createGrantCommandMod extends js.Object {
  @js.native
  class CreateGrantCommand protected () extends Command[
          InputTypesUnion, 
          CreateGrantInput, 
          OutputTypesUnion, 
          CreateGrantOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateGrantInput) = this()
    /* CompleteClass */
    override val input: CreateGrantInput = js.native
    val middlewareStack: MiddlewareStack[CreateGrantInput, CreateGrantOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  }
  
}

