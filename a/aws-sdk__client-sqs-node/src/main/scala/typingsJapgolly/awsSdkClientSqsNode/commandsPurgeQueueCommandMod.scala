package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPurgeQueueCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", "PurgeQueueCommand")
  @js.native
  open class PurgeQueueCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: PurgeQueueInput) = this()
    
    /* CompleteClass */
    override val input: PurgeQueueInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PurgeQueueInput, PurgeQueueOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
}
