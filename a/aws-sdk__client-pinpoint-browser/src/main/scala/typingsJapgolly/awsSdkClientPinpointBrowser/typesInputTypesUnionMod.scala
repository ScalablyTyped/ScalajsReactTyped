package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod.ADMChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnschannelrequestMod.APNSChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnssandboxchannelrequestMod.APNSSandboxChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsvoipchannelrequestMod.APNSVoipChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelrequestMod.APNSVoipSandboxChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod.BaiduChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod.CreateApplicationRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod.EmailChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod.EndpointBatchRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEventsRequestMod.EventsRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesExportJobRequestMod.ExportJobRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmchannelrequestMod.GCMChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesImportJobRequestMod.ImportJobRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageRequestMod.MessageRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesNumberValidateRequestMod.NumberValidateRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod.SendUsersMessageRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSmschannelrequestMod.SMSChannelRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod.UpdateAttributesRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod.WriteApplicationSettingsRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteEventStreamMod.WriteEventStream
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod.WriteSegmentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def CreateAppInput(CreateApplicationRequest: CreateApplicationRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput = {
      val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput]
    }
    
    inline def CreateCampaignInput(ApplicationId: String, WriteCampaignRequest: WriteCampaignRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput]
    }
    
    inline def CreateExportJobInput(ApplicationId: String, ExportJobRequest: ExportJobRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput]
    }
    
    inline def CreateImportJobInput(ApplicationId: String, ImportJobRequest: ImportJobRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput]
    }
    
    inline def CreateSegmentInput(ApplicationId: String, WriteSegmentRequest: WriteSegmentRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput]
    }
    
    inline def DeleteAdmChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput]
    }
    
    inline def DeleteApnsChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput]
    }
    
    inline def DeleteApnsSandboxChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput]
    }
    
    inline def DeleteApnsVoipChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput]
    }
    
    inline def DeleteApnsVoipSandboxChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput]
    }
    
    inline def DeleteAppInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput]
    }
    
    inline def DeleteBaiduChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput]
    }
    
    inline def DeleteCampaignInput(ApplicationId: String, CampaignId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput]
    }
    
    inline def DeleteEmailChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput]
    }
    
    inline def DeleteEndpointInput(ApplicationId: String, EndpointId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput]
    }
    
    inline def DeleteEventStreamInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput]
    }
    
    inline def DeleteGcmChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput]
    }
    
    inline def DeleteSegmentInput(ApplicationId: String, SegmentId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput]
    }
    
    inline def DeleteSmsChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput]
    }
    
    inline def DeleteUserEndpointsInput(ApplicationId: String, UserId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput]
    }
    
    inline def GetAdmChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput]
    }
    
    inline def GetApnsChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput]
    }
    
    inline def GetApnsSandboxChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput]
    }
    
    inline def GetApnsVoipChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput]
    }
    
    inline def GetApnsVoipSandboxChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput]
    }
    
    inline def GetAppInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput]
    }
    
    inline def GetApplicationSettingsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput]
    }
    
    inline def GetAppsInput(): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput]
    }
    
    inline def GetBaiduChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput]
    }
    
    inline def GetCampaignActivitiesInput(ApplicationId: String, CampaignId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput]
    }
    
    inline def GetCampaignInput(ApplicationId: String, CampaignId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput]
    }
    
    inline def GetCampaignVersionInput(ApplicationId: String, CampaignId: String, Version: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput]
    }
    
    inline def GetCampaignVersionsInput(ApplicationId: String, CampaignId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput]
    }
    
    inline def GetCampaignsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput]
    }
    
    inline def GetChannelsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput]
    }
    
    inline def GetEmailChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput]
    }
    
    inline def GetEndpointInput(ApplicationId: String, EndpointId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput]
    }
    
    inline def GetEventStreamInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput]
    }
    
    inline def GetExportJobInput(ApplicationId: String, JobId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput]
    }
    
    inline def GetExportJobsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput]
    }
    
    inline def GetGcmChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput]
    }
    
    inline def GetImportJobInput(ApplicationId: String, JobId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput]
    }
    
    inline def GetImportJobsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput]
    }
    
    inline def GetSegmentExportJobsInput(ApplicationId: String, SegmentId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput]
    }
    
    inline def GetSegmentImportJobsInput(ApplicationId: String, SegmentId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput]
    }
    
    inline def GetSegmentInput(ApplicationId: String, SegmentId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput]
    }
    
    inline def GetSegmentVersionInput(ApplicationId: String, SegmentId: String, Version: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput]
    }
    
    inline def GetSegmentVersionsInput(ApplicationId: String, SegmentId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput]
    }
    
    inline def GetSegmentsInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput]
    }
    
    inline def GetSmsChannelInput(ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput]
    }
    
    inline def GetUserEndpointsInput(ApplicationId: String, UserId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput]
    }
    
    inline def PhoneNumberValidateInput(NumberValidateRequest: NumberValidateRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput = {
      val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput]
    }
    
    inline def PutEventStreamInput(ApplicationId: String, WriteEventStream: WriteEventStream): typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteEventStream = WriteEventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput]
    }
    
    inline def PutEventsInput(ApplicationId: String, EventsRequest: EventsRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput]
    }
    
    inline def RemoveAttributesInput(ApplicationId: String, AttributeType: String, UpdateAttributesRequest: UpdateAttributesRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput]
    }
    
    inline def SendMessagesInput(ApplicationId: String, MessageRequest: MessageRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput]
    }
    
    inline def SendUsersMessagesInput(ApplicationId: String, SendUsersMessageRequest: SendUsersMessageRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput]
    }
    
    inline def UpdateAdmChannelInput(ADMChannelRequest: ADMChannelRequest, ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput = {
      val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput]
    }
    
    inline def UpdateApnsChannelInput(APNSChannelRequest: APNSChannelRequest, ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput = {
      val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput]
    }
    
    inline def UpdateApnsSandboxChannelInput(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput]
    }
    
    inline def UpdateApnsVoipChannelInput(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput]
    }
    
    inline def UpdateApnsVoipSandboxChannelInput(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: String): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput]
    }
    
    inline def UpdateApplicationSettingsInput(ApplicationId: String, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput]
    }
    
    inline def UpdateBaiduChannelInput(ApplicationId: String, BaiduChannelRequest: BaiduChannelRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput]
    }
    
    inline def UpdateCampaignInput(ApplicationId: String, CampaignId: String, WriteCampaignRequest: WriteCampaignRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput]
    }
    
    inline def UpdateEmailChannelInput(ApplicationId: String, EmailChannelRequest: EmailChannelRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput]
    }
    
    inline def UpdateEndpointInput(ApplicationId: String, EndpointId: String, EndpointRequest: EndpointRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput]
    }
    
    inline def UpdateEndpointsBatchInput(ApplicationId: String, EndpointBatchRequest: EndpointBatchRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput]
    }
    
    inline def UpdateGcmChannelInput(ApplicationId: String, GCMChannelRequest: GCMChannelRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput]
    }
    
    inline def UpdateSegmentInput(ApplicationId: String, SegmentId: String, WriteSegmentRequest: WriteSegmentRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput]
    }
    
    inline def UpdateSmsChannelInput(ApplicationId: String, SMSChannelRequest: SMSChannelRequest): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput]
    }
  }
}
