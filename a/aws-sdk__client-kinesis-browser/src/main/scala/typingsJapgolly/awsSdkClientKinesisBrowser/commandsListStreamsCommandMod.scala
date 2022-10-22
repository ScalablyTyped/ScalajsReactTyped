package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListStreamsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", "ListStreamsCommand")
  @js.native
  open class ListStreamsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListStreamsInput, 
          OutputTypesUnion, 
          ListStreamsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListStreamsInput) = this()
    
    /* CompleteClass */
    override val input: ListStreamsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListStreamsInput, ListStreamsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  }
}
