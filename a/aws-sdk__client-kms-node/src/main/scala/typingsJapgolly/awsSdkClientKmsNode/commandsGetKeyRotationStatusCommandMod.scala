package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typingsJapgolly.awsSdkClientKmsNode.typesGetKeyRotationStatusOutputMod.GetKeyRotationStatusOutput
import typingsJapgolly.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetKeyRotationStatusCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GetKeyRotationStatusCommand", "GetKeyRotationStatusCommand")
  @js.native
  open class GetKeyRotationStatusCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetKeyRotationStatusInput, 
          OutputTypesUnion, 
          GetKeyRotationStatusOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GetKeyRotationStatusInput) = this()
    
    /* CompleteClass */
    override val input: GetKeyRotationStatusInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
  }
}
