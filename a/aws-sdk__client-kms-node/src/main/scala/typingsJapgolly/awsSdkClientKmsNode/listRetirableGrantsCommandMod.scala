package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typingsJapgolly.awsSdkClientKmsNode.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ListRetirableGrantsCommand", JSImport.Namespace)
@js.native
object listRetirableGrantsCommandMod extends js.Object {
  @js.native
  class ListRetirableGrantsCommand protected () extends Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    /* CompleteClass */
    override val input: ListRetirableGrantsInput = js.native
    val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
  
}

