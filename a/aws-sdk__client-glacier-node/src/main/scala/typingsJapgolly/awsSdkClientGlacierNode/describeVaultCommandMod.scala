package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DescribeVaultCommand", JSImport.Namespace)
@js.native
object describeVaultCommandMod extends js.Object {
  @js.native
  class DescribeVaultCommand protected () extends Command[
          InputTypesUnion, 
          DescribeVaultInput, 
          OutputTypesUnion, 
          DescribeVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeVaultInput) = this()
    /* CompleteClass */
    override val input: DescribeVaultInput = js.native
    val middlewareStack: MiddlewareStack[DescribeVaultInput, DescribeVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
  }
  
}

