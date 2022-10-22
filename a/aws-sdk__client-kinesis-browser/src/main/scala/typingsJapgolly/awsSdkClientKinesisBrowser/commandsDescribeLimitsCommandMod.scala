package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeLimitsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
  @js.native
  open class DescribeLimitsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeLimitsInput, 
          OutputTypesUnion, 
          DescribeLimitsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeLimitsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeLimitsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeLimitsInput, DescribeLimitsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
