package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamCommand", "DescribeStreamCommand")
  @js.native
  open class DescribeStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeStreamInput, 
          OutputTypesUnion, 
          DescribeStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeStreamInput) = this()
    
    /* CompleteClass */
    override val input: DescribeStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeStreamInput, DescribeStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
  }
}
