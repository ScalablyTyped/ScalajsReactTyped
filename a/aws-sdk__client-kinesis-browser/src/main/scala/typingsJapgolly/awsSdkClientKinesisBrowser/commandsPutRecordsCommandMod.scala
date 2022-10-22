package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutRecordsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordsCommand", "PutRecordsCommand")
  @js.native
  open class PutRecordsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutRecordsInput, 
          OutputTypesUnion, 
          PutRecordsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: PutRecordsInput) = this()
    
    /* CompleteClass */
    override val input: PutRecordsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutRecordsInput, PutRecordsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
  }
}
