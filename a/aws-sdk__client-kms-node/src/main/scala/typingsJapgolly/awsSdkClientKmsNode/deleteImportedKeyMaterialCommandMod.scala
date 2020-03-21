package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typingsJapgolly.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialOutputMod.DeleteImportedKeyMaterialOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DeleteImportedKeyMaterialCommand", JSImport.Namespace)
@js.native
object deleteImportedKeyMaterialCommandMod extends js.Object {
  @js.native
  class DeleteImportedKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          DeleteImportedKeyMaterialInput, 
          OutputTypesUnion, 
          DeleteImportedKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteImportedKeyMaterialInput) = this()
    /* CompleteClass */
    override val input: DeleteImportedKeyMaterialInput = js.native
    val middlewareStack: MiddlewareStack[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteImportedKeyMaterialInput, DeleteImportedKeyMaterialOutput] = js.native
  }
  
}

