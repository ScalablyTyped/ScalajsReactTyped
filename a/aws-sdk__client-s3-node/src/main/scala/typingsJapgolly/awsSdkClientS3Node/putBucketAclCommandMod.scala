package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAclCommand", JSImport.Namespace)
@js.native
object putBucketAclCommandMod extends js.Object {
  @js.native
  class PutBucketAclCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAclInput, 
          OutputTypesUnion, 
          PutBucketAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketAclInput) = this()
    /* CompleteClass */
    override val input: PutBucketAclInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketAclInput, PutBucketAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAclInput, PutBucketAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAclInput, PutBucketAclOutput] = js.native
  }
  
}

