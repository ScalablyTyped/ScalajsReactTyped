package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    inline def CreateAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput]
    }
    
    inline def CreateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput]
    }
    
    inline def CreateExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput]
    }
    
    inline def CreateImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput]
    }
    
    inline def CreateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput]
    }
    
    inline def DeleteAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput]
    }
    
    inline def DeleteApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput]
    }
    
    inline def DeleteApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput]
    }
    
    inline def DeleteApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput]
    }
    
    inline def DeleteApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput]
    }
    
    inline def DeleteAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput]
    }
    
    inline def DeleteBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput]
    }
    
    inline def DeleteCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput]
    }
    
    inline def DeleteEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput]
    }
    
    inline def DeleteEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput]
    }
    
    inline def DeleteEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput]
    }
    
    inline def DeleteGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput]
    }
    
    inline def DeleteSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput]
    }
    
    inline def DeleteSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput]
    }
    
    inline def DeleteUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput]
    }
    
    inline def GetAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput]
    }
    
    inline def GetApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput]
    }
    
    inline def GetApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput]
    }
    
    inline def GetApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput]
    }
    
    inline def GetApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput]
    }
    
    inline def GetAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput]
    }
    
    inline def GetApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput]
    }
    
    inline def GetAppsOutput($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput]
    }
    
    inline def GetBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput]
    }
    
    inline def GetCampaignActivitiesOutput($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput]
    }
    
    inline def GetCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput]
    }
    
    inline def GetCampaignVersionOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput]
    }
    
    inline def GetCampaignVersionsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput]
    }
    
    inline def GetCampaignsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput]
    }
    
    inline def GetChannelsOutput($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput]
    }
    
    inline def GetEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput]
    }
    
    inline def GetEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput]
    }
    
    inline def GetEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput]
    }
    
    inline def GetExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput]
    }
    
    inline def GetExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput]
    }
    
    inline def GetGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput]
    }
    
    inline def GetImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput]
    }
    
    inline def GetImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput]
    }
    
    inline def GetSegmentExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput]
    }
    
    inline def GetSegmentImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput]
    }
    
    inline def GetSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput]
    }
    
    inline def GetSegmentVersionOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput]
    }
    
    inline def GetSegmentVersionsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput]
    }
    
    inline def GetSegmentsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput]
    }
    
    inline def GetSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput]
    }
    
    inline def GetUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput]
    }
    
    inline def PhoneNumberValidateOutput($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput]
    }
    
    inline def PutEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput]
    }
    
    inline def PutEventsOutput($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput]
    }
    
    inline def RemoveAttributesOutput($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput]
    }
    
    inline def SendMessagesOutput($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput]
    }
    
    inline def SendUsersMessagesOutput($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput]
    }
    
    inline def UpdateAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput]
    }
    
    inline def UpdateApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput]
    }
    
    inline def UpdateApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput]
    }
    
    inline def UpdateApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput]
    }
    
    inline def UpdateApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput]
    }
    
    inline def UpdateApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput]
    }
    
    inline def UpdateBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput]
    }
    
    inline def UpdateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput]
    }
    
    inline def UpdateEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput]
    }
    
    inline def UpdateEndpointOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput]
    }
    
    inline def UpdateEndpointsBatchOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput]
    }
    
    inline def UpdateGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput]
    }
    
    inline def UpdateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput]
    }
    
    inline def UpdateSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput]
    }
  }
}
