package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
import typingsJapgolly.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectAclCommand", JSImport.Namespace)
@js.native
object putObjectAclCommandMod extends js.Object {
  @js.native
  class PutObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectAclInput, 
          OutputTypesUnion, 
          PutObjectAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectAclInput) = this()
    /* CompleteClass */
    override val input: PutObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[PutObjectAclInput, PutObjectAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
  }
  
}

