package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/TestRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object testRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class TestRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          TestRepositoryTriggersInput, 
          OutputTypesUnion, 
          TestRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: TestRepositoryTriggersInput) = this()
    /* CompleteClass */
    override val input: TestRepositoryTriggersInput = js.native
    val middlewareStack: MiddlewareStack[TestRepositoryTriggersInput, TestRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
  }
  
}

