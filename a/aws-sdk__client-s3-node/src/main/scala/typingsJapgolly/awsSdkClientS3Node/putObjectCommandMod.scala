package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectCommand", JSImport.Namespace)
@js.native
object putObjectCommandMod extends js.Object {
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Readable], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectInput[Readable]) = this()
    /* CompleteClass */
    override val input: PutObjectInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[PutObjectInput[Readable], PutObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
  }
  
}

