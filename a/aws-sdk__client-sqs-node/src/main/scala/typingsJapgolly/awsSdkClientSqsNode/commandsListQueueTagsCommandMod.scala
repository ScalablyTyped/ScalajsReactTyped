package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
import typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
import typingsJapgolly.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListQueueTagsCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/ListQueueTagsCommand", "ListQueueTagsCommand")
  @js.native
  open class ListQueueTagsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListQueueTagsInput, 
          OutputTypesUnion, 
          ListQueueTagsOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: ListQueueTagsInput) = this()
    
    /* CompleteClass */
    override val input: ListQueueTagsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListQueueTagsInput, ListQueueTagsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
  }
}
