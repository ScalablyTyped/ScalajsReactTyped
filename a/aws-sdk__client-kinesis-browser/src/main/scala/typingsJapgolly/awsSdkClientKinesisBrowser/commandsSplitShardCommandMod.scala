package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSplitShardCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/SplitShardCommand", "SplitShardCommand")
  @js.native
  open class SplitShardCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SplitShardInput, 
          OutputTypesUnion, 
          SplitShardOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: SplitShardInput) = this()
    
    /* CompleteClass */
    override val input: SplitShardInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SplitShardInput, SplitShardOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
  }
}
