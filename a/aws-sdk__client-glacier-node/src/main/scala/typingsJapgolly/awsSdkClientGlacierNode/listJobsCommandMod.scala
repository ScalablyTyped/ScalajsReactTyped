package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListJobsCommand", JSImport.Namespace)
@js.native
object listJobsCommandMod extends js.Object {
  @js.native
  class ListJobsCommand protected () extends Command[
          InputTypesUnion, 
          ListJobsInput, 
          OutputTypesUnion, 
          ListJobsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListJobsInput) = this()
    /* CompleteClass */
    override val input: ListJobsInput = js.native
    val middlewareStack: MiddlewareStack[ListJobsInput, ListJobsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
  }
  
}

