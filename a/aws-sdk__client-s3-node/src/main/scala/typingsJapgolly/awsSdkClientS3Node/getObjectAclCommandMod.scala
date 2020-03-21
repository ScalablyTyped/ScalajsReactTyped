package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
import typingsJapgolly.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectAclCommand", JSImport.Namespace)
@js.native
object getObjectAclCommandMod extends js.Object {
  @js.native
  class GetObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectAclInput, 
          OutputTypesUnion, 
          GetObjectAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectAclInput) = this()
    /* CompleteClass */
    override val input: GetObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectAclInput, GetObjectAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
  }
  
}

