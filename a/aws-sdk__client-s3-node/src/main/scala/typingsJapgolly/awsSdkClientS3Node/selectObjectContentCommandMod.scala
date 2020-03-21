package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
import typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/SelectObjectContentCommand", JSImport.Namespace)
@js.native
object selectObjectContentCommandMod extends js.Object {
  @js.native
  class SelectObjectContentCommand protected () extends Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: SelectObjectContentInput) = this()
    /* CompleteClass */
    override val input: SelectObjectContentInput = js.native
    val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
  
}

