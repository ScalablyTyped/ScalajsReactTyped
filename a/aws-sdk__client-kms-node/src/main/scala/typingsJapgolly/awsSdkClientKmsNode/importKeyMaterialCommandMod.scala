package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
import typingsJapgolly.awsSdkClientKmsNode.typesImportKeyMaterialOutputMod.ImportKeyMaterialOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ImportKeyMaterialCommand", JSImport.Namespace)
@js.native
object importKeyMaterialCommandMod extends js.Object {
  @js.native
  class ImportKeyMaterialCommand protected () extends Command[
          InputTypesUnion, 
          ImportKeyMaterialInput, 
          OutputTypesUnion, 
          ImportKeyMaterialOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ImportKeyMaterialInput) = this()
    /* CompleteClass */
    override val input: ImportKeyMaterialInput = js.native
    val middlewareStack: MiddlewareStack[ImportKeyMaterialInput, ImportKeyMaterialOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[ImportKeyMaterialInput, ImportKeyMaterialOutput] = js.native
  }
  
}

