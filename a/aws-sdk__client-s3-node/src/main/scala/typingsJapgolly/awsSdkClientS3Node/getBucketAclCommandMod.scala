package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAclCommand", JSImport.Namespace)
@js.native
object getBucketAclCommandMod extends js.Object {
  @js.native
  class GetBucketAclCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAclInput, 
          OutputTypesUnion, 
          GetBucketAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAclInput) = this()
    /* CompleteClass */
    override val input: GetBucketAclInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketAclInput, GetBucketAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
  }
  
}

