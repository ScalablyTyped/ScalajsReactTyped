package typingsJapgolly.awsSdkClientPinpointBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/OutputTypesUnion", JSImport.Namespace)
@js.native
object outputTypesUnionMod extends js.Object {
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
  trait OutputTypesUnion extends js.Object
  
}

