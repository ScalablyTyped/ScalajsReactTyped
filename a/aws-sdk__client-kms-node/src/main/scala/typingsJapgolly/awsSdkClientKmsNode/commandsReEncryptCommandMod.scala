package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
import typingsJapgolly.awsSdkClientKmsNode.typesReEncryptOutputMod.ReEncryptOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsReEncryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ReEncryptCommand", "ReEncryptCommand")
  @js.native
  open class ReEncryptCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ReEncryptInput, 
          OutputTypesUnion, 
          ReEncryptOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ReEncryptInput) = this()
    
    /* CompleteClass */
    override val input: ReEncryptInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ReEncryptInput, ReEncryptOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ReEncryptInput, ReEncryptOutput] = js.native
  }
}
