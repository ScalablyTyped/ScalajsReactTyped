package typingsJapgolly.awsSdkClientPinpointBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
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
  trait InputTypesUnion extends js.Object
  
}

