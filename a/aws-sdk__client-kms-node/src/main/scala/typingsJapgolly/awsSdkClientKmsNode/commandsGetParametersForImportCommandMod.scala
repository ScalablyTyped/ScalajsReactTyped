package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
import typingsJapgolly.awsSdkClientKmsNode.typesGetParametersForImportOutputMod.GetParametersForImportOutput
import typingsJapgolly.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetParametersForImportCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GetParametersForImportCommand", "GetParametersForImportCommand")
  @js.native
  open class GetParametersForImportCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetParametersForImportInput, 
          OutputTypesUnion, 
          GetParametersForImportOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetParametersForImportInput) = this()
    
    /* CompleteClass */
    override val input: GetParametersForImportInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GetParametersForImportInput, GetParametersForImportOutput] = js.native
  }
}
