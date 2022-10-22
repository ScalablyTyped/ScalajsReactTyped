package typingsJapgolly.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typingsJapgolly.awsSdkClientLambdaNode.typesFunctionCodeMod.FunctionCode
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
    - typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
  */
  type InputTypesUnion = _InputTypesUnion | InvokeAsyncInput[Readable]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    inline def AddPermissionInput(Action: String, FunctionName: String, Principal: String, StatementId: String): typingsJapgolly.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    inline def CreateAliasInput(FunctionName: String, FunctionVersion: String, Name: String): typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], FunctionVersion = FunctionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    inline def CreateEventSourceMappingInput(EventSourceArn: String, FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput]
    }
    
    inline def CreateFunctionInput(
      Code: FunctionCode,
      FunctionName: String,
      Handler: String,
      Role: String,
      Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): typingsJapgolly.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput]
    }
    
    inline def DeleteAliasInput(FunctionName: String, Name: String): typingsJapgolly.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    inline def DeleteEventSourceMappingInput(UUID: String): typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput]
    }
    
    inline def DeleteFunctionConcurrencyInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput]
    }
    
    inline def DeleteFunctionInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput]
    }
    
    inline def GetAccountSettingsInput(): typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput]
    }
    
    inline def GetAliasInput(FunctionName: String, Name: String): typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput]
    }
    
    inline def GetEventSourceMappingInput(UUID: String): typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput]
    }
    
    inline def GetFunctionConfigurationInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput]
    }
    
    inline def GetFunctionInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput]
    }
    
    inline def GetPolicyInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput]
    }
    
    inline def InvokeInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput]
    }
    
    inline def ListAliasesInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    inline def ListEventSourceMappingsInput(): typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput]
    }
    
    inline def ListFunctionsInput(): typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput]
    }
    
    inline def ListTagsInput(Resource: String): typingsJapgolly.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput]
    }
    
    inline def ListVersionsByFunctionInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput]
    }
    
    inline def PublishVersionInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput]
    }
    
    inline def PutFunctionConcurrencyInput(FunctionName: String, ReservedConcurrentExecutions: Double): typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ReservedConcurrentExecutions = ReservedConcurrentExecutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput]
    }
    
    inline def RemovePermissionInput(FunctionName: String, StatementId: String): typingsJapgolly.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    inline def TagResourceInput(Resource: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsJapgolly.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(Resource: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateAliasInput(FunctionName: String, Name: String): typingsJapgolly.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    inline def UpdateEventSourceMappingInput(UUID: String): typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput]
    }
    
    inline def UpdateFunctionCodeInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput]
    }
    
    inline def UpdateFunctionConfigurationInput(FunctionName: String): typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput]
    }
  }
}
