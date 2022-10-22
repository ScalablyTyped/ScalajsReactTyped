package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-lambda-node", "AddPermissionCommand")
  @js.native
  open class AddPermissionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsAddPermissionCommandMod.AddPermissionCommand {
    def this(input: AddPermissionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "CreateAliasCommand")
  @js.native
  open class CreateAliasCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsCreateAliasCommandMod.CreateAliasCommand {
    def this(input: CreateAliasInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "CreateEventSourceMappingCommand")
  @js.native
  open class CreateEventSourceMappingCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsCreateEventSourceMappingCommandMod.CreateEventSourceMappingCommand {
    def this(input: CreateEventSourceMappingInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "CreateFunctionCommand")
  @js.native
  open class CreateFunctionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsCreateFunctionCommandMod.CreateFunctionCommand {
    def this(input: CreateFunctionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "DeleteAliasCommand")
  @js.native
  open class DeleteAliasCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsDeleteAliasCommandMod.DeleteAliasCommand {
    def this(input: DeleteAliasInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "DeleteEventSourceMappingCommand")
  @js.native
  open class DeleteEventSourceMappingCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsDeleteEventSourceMappingCommandMod.DeleteEventSourceMappingCommand {
    def this(input: DeleteEventSourceMappingInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "DeleteFunctionCommand")
  @js.native
  open class DeleteFunctionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsDeleteFunctionCommandMod.DeleteFunctionCommand {
    def this(input: DeleteFunctionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "DeleteFunctionConcurrencyCommand")
  @js.native
  open class DeleteFunctionConcurrencyCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsDeleteFunctionConcurrencyCommandMod.DeleteFunctionConcurrencyCommand {
    def this(input: DeleteFunctionConcurrencyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetAccountSettingsCommand")
  @js.native
  open class GetAccountSettingsCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetAccountSettingsCommandMod.GetAccountSettingsCommand {
    def this(input: GetAccountSettingsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetAliasCommand")
  @js.native
  open class GetAliasCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetAliasCommandMod.GetAliasCommand {
    def this(input: GetAliasInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetEventSourceMappingCommand")
  @js.native
  open class GetEventSourceMappingCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetEventSourceMappingCommandMod.GetEventSourceMappingCommand {
    def this(input: GetEventSourceMappingInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetFunctionCommand")
  @js.native
  open class GetFunctionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetFunctionCommandMod.GetFunctionCommand {
    def this(input: GetFunctionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetFunctionConfigurationCommand")
  @js.native
  open class GetFunctionConfigurationCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetFunctionConfigurationCommandMod.GetFunctionConfigurationCommand {
    def this(input: GetFunctionConfigurationInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "GetPolicyCommand")
  @js.native
  open class GetPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsGetPolicyCommandMod.GetPolicyCommand {
    def this(input: GetPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "InvokeAsyncCommand")
  @js.native
  open class InvokeAsyncCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsInvokeAsyncCommandMod.InvokeAsyncCommand {
    def this(input: InvokeAsyncInput[Readable]) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "InvokeCommand")
  @js.native
  open class InvokeCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsInvokeCommandMod.InvokeCommand {
    def this(input: InvokeInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "Lambda")
  @js.native
  open class Lambda protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.lambdaMod.Lambda {
    def this(configuration: LambdaConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "LambdaClient")
  @js.native
  open class LambdaClient protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.lambdaClientMod.LambdaClient {
    def this(configuration: LambdaConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "ListAliasesCommand")
  @js.native
  open class ListAliasesCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsListAliasesCommandMod.ListAliasesCommand {
    def this(input: ListAliasesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "ListEventSourceMappingsCommand")
  @js.native
  open class ListEventSourceMappingsCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsListEventSourceMappingsCommandMod.ListEventSourceMappingsCommand {
    def this(input: ListEventSourceMappingsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "ListFunctionsCommand")
  @js.native
  open class ListFunctionsCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsListFunctionsCommandMod.ListFunctionsCommand {
    def this(input: ListFunctionsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "ListTagsCommand")
  @js.native
  open class ListTagsCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsListTagsCommandMod.ListTagsCommand {
    def this(input: ListTagsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "ListVersionsByFunctionCommand")
  @js.native
  open class ListVersionsByFunctionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsListVersionsByFunctionCommandMod.ListVersionsByFunctionCommand {
    def this(input: ListVersionsByFunctionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "PublishVersionCommand")
  @js.native
  open class PublishVersionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsPublishVersionCommandMod.PublishVersionCommand {
    def this(input: PublishVersionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "PutFunctionConcurrencyCommand")
  @js.native
  open class PutFunctionConcurrencyCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsPutFunctionConcurrencyCommandMod.PutFunctionConcurrencyCommand {
    def this(input: PutFunctionConcurrencyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "RemovePermissionCommand")
  @js.native
  open class RemovePermissionCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsRemovePermissionCommandMod.RemovePermissionCommand {
    def this(input: RemovePermissionInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "TagResourceCommand")
  @js.native
  open class TagResourceCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsTagResourceCommandMod.TagResourceCommand {
    def this(input: TagResourceInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "UntagResourceCommand")
  @js.native
  open class UntagResourceCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsUntagResourceCommandMod.UntagResourceCommand {
    def this(input: UntagResourceInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "UpdateAliasCommand")
  @js.native
  open class UpdateAliasCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsUpdateAliasCommandMod.UpdateAliasCommand {
    def this(input: UpdateAliasInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "UpdateEventSourceMappingCommand")
  @js.native
  open class UpdateEventSourceMappingCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsUpdateEventSourceMappingCommandMod.UpdateEventSourceMappingCommand {
    def this(input: UpdateEventSourceMappingInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "UpdateFunctionCodeCommand")
  @js.native
  open class UpdateFunctionCodeCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsUpdateFunctionCodeCommandMod.UpdateFunctionCodeCommand {
    def this(input: UpdateFunctionCodeInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "UpdateFunctionConfigurationCommand")
  @js.native
  open class UpdateFunctionConfigurationCommand protected ()
    extends typingsJapgolly.awsSdkClientLambdaNode.commandsUpdateFunctionConfigurationCommandMod.UpdateFunctionConfigurationCommand {
    def this(input: UpdateFunctionConfigurationInput) = this()
  }
  
  @JSImport("@aws-sdk/client-lambda-node", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<LambdaResolvableConfiguration, LambdaResolvedConfiguration> */ Any = js.native
}
