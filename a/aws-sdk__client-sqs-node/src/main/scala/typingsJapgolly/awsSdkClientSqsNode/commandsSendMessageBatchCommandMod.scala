package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSendMessageBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", "SendMessageBatchCommand")
  @js.native
  open class SendMessageBatchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SendMessageBatchInput, 
          OutputTypesUnion, 
          SendMessageBatchOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: SendMessageBatchInput) = this()
    
    /* CompleteClass */
    override val input: SendMessageBatchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SendMessageBatchInput, SendMessageBatchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
}
