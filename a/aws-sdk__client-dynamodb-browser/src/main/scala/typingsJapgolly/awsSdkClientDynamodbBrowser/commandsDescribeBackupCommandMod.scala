package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeBackupOutputMod.DescribeBackupOutput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeBackupCommand", "DescribeBackupCommand")
  @js.native
  open class DescribeBackupCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeBackupInput, 
          OutputTypesUnion, 
          DescribeBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeBackupInput) = this()
    
    /* CompleteClass */
    override val input: DescribeBackupInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeBackupInput, DescribeBackupOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeBackupInput, DescribeBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeBackupInput, DescribeBackupOutput] = js.native
  }
}
