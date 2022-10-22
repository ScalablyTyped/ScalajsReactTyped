package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMsg extends StObject
@JSImport("steam-user", "EMsg")
@js.native
object EMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg & Double] = js.native
  
  @js.native
  sealed trait AIGetAppGCFlags
    extends StObject
       with EMsg
  /* 423 */ val AIGetAppGCFlags: typingsJapgolly.steamUser.mod.EMsg.AIGetAppGCFlags & Double = js.native
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse
    extends StObject
       with EMsg
  /* 424 */ val AIGetAppGCFlagsResponse: typingsJapgolly.steamUser.mod.EMsg.AIGetAppGCFlagsResponse & Double = js.native
  
  @js.native
  sealed trait AIGetAppInfo
    extends StObject
       with EMsg
  /* 427 */ val AIGetAppInfo: typingsJapgolly.steamUser.mod.EMsg.AIGetAppInfo & Double = js.native
  
  @js.native
  sealed trait AIGetAppInfoResponse
    extends StObject
       with EMsg
  /* 428 */ val AIGetAppInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AIGetAppInfoResponse & Double = js.native
  
  @js.native
  sealed trait AIGetAppList
    extends StObject
       with EMsg
  /* 425 */ val AIGetAppList: typingsJapgolly.steamUser.mod.EMsg.AIGetAppList & Double = js.native
  
  @js.native
  sealed trait AIGetAppListResponse
    extends StObject
       with EMsg
  /* 426 */ val AIGetAppListResponse: typingsJapgolly.steamUser.mod.EMsg.AIGetAppListResponse & Double = js.native
  
  @js.native
  sealed trait AISAppInfoTableChanged
    extends StObject
       with EMsg
  /* 407 */ val AISAppInfoTableChanged: typingsJapgolly.steamUser.mod.EMsg.AISAppInfoTableChanged & Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessage
    extends StObject
       with EMsg
  /* 409 */ val AISCreateMarketingMessage: typingsJapgolly.steamUser.mod.EMsg.AISCreateMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse
    extends StObject
       with EMsg
  /* 410 */ val AISCreateMarketingMessageResponse: typingsJapgolly.steamUser.mod.EMsg.AISCreateMarketingMessageResponse & Double = js.native
  
  @js.native
  sealed trait AISDeleteMarketingMessage
    extends StObject
       with EMsg
  /* 416 */ val AISDeleteMarketingMessage: typingsJapgolly.steamUser.mod.EMsg.AISDeleteMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISGetCouponDefinition
    extends StObject
       with EMsg
  /* 429 */ val AISGetCouponDefinition: typingsJapgolly.steamUser.mod.EMsg.AISGetCouponDefinition & Double = js.native
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse
    extends StObject
       with EMsg
  /* 430 */ val AISGetCouponDefinitionResponse: typingsJapgolly.steamUser.mod.EMsg.AISGetCouponDefinitionResponse & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessage
    extends StObject
       with EMsg
  /* 411 */ val AISGetMarketingMessage: typingsJapgolly.steamUser.mod.EMsg.AISGetMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessageResponse
    extends StObject
       with EMsg
  /* 412 */ val AISGetMarketingMessageResponse: typingsJapgolly.steamUser.mod.EMsg.AISGetMarketingMessageResponse & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingTreatments
    extends StObject
       with EMsg
  /* 419 */ val AISGetMarketingTreatments: typingsJapgolly.steamUser.mod.EMsg.AISGetMarketingTreatments & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse
    extends StObject
       with EMsg
  /* 420 */ val AISGetMarketingTreatmentsResponse: typingsJapgolly.steamUser.mod.EMsg.AISGetMarketingTreatmentsResponse & Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumber
    extends StObject
       with EMsg
  /* 405 */ val AISGetPackageChangeNumber: typingsJapgolly.steamUser.mod.EMsg.AISGetPackageChangeNumber & Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse
    extends StObject
       with EMsg
  /* 406 */ val AISGetPackageChangeNumberResponse: typingsJapgolly.steamUser.mod.EMsg.AISGetPackageChangeNumberResponse & Double = js.native
  
  @js.native
  sealed trait AISRefreshContentDescription
    extends StObject
       with EMsg
  /* 401 */ val AISRefreshContentDescription: typingsJapgolly.steamUser.mod.EMsg.AISRefreshContentDescription & Double = js.native
  
  @js.native
  sealed trait AISRequestContentDescription
    extends StObject
       with EMsg
  /* 402 */ val AISRequestContentDescription: typingsJapgolly.steamUser.mod.EMsg.AISRequestContentDescription & Double = js.native
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate
    extends StObject
       with EMsg
  /* 415 */ val AISRequestMarketingMessageUpdate: typingsJapgolly.steamUser.mod.EMsg.AISRequestMarketingMessageUpdate & Double = js.native
  
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate
    extends StObject
       with EMsg
  /* 421 */ val AISRequestMarketingTreatmentUpdate: typingsJapgolly.steamUser.mod.EMsg.AISRequestMarketingTreatmentUpdate & Double = js.native
  
  @js.native
  sealed trait AISTestAddPackage
    extends StObject
       with EMsg
  /* 422 */ val AISTestAddPackage: typingsJapgolly.steamUser.mod.EMsg.AISTestAddPackage & Double = js.native
  
  @js.native
  sealed trait AISTestEnableGC
    extends StObject
       with EMsg
  /* 433 */ val AISTestEnableGC: typingsJapgolly.steamUser.mod.EMsg.AISTestEnableGC & Double = js.native
  
  @js.native
  sealed trait AISUpdateAppInfo
    extends StObject
       with EMsg
  /* 403 */ val AISUpdateAppInfo: typingsJapgolly.steamUser.mod.EMsg.AISUpdateAppInfo & Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessage
    extends StObject
       with EMsg
  /* 413 */ val AISUpdateMarketingMessage: typingsJapgolly.steamUser.mod.EMsg.AISUpdateMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse
    extends StObject
       with EMsg
  /* 414 */ val AISUpdateMarketingMessageResponse: typingsJapgolly.steamUser.mod.EMsg.AISUpdateMarketingMessageResponse & Double = js.native
  
  @js.native
  sealed trait AISUpdatePackageCosts
    extends StObject
       with EMsg
  /* 404 */ val AISUpdatePackageCosts: typingsJapgolly.steamUser.mod.EMsg.AISUpdatePackageCosts & Double = js.native
  
  @js.native
  sealed trait AISUpdatePackageCostsResponse
    extends StObject
       with EMsg
  /* 408 */ val AISUpdatePackageCostsResponse: typingsJapgolly.steamUser.mod.EMsg.AISUpdatePackageCostsResponse & Double = js.native
  
  @js.native
  sealed trait AISUpdatePackageInfo
    extends StObject
       with EMsg
  /* 404 */ val AISUpdatePackageInfo: typingsJapgolly.steamUser.mod.EMsg.AISUpdatePackageInfo & Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription
    extends StObject
       with EMsg
  /* 431 */ val AISUpdateSlaveContentDescription: typingsJapgolly.steamUser.mod.EMsg.AISUpdateSlaveContentDescription & Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse
    extends StObject
       with EMsg
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: typingsJapgolly.steamUser.mod.EMsg.AISUpdateSlaveContentDescriptionResponse & Double = js.native
  
  @js.native
  sealed trait AMAccountPS3Unlink
    extends StObject
       with EMsg
  /* 4310 */ val AMAccountPS3Unlink: typingsJapgolly.steamUser.mod.EMsg.AMAccountPS3Unlink & Double = js.native
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse
    extends StObject
       with EMsg
  /* 4311 */ val AMAccountPS3UnlinkResponse: typingsJapgolly.steamUser.mod.EMsg.AMAccountPS3UnlinkResponse & Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchase
    extends StObject
       with EMsg
  /* 4346 */ val AMAcctAllowedToPurchase: typingsJapgolly.steamUser.mod.EMsg.AMAcctAllowedToPurchase & Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse
    extends StObject
       with EMsg
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMAcctAllowedToPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMAcknowledgeClanInvite
    extends StObject
       with EMsg
  /* 565 */ val AMAcknowledgeClanInvite: typingsJapgolly.steamUser.mod.EMsg.AMAcknowledgeClanInvite & Double = js.native
  
  @js.native
  sealed trait AMAddClanNews
    extends StObject
       with EMsg
  /* 4141 */ val AMAddClanNews: typingsJapgolly.steamUser.mod.EMsg.AMAddClanNews & Double = js.native
  
  @js.native
  sealed trait AMAddComment
    extends StObject
       with EMsg
  /* 4202 */ val AMAddComment: typingsJapgolly.steamUser.mod.EMsg.AMAddComment & Double = js.native
  
  @js.native
  sealed trait AMAddCommentResponse
    extends StObject
       with EMsg
  /* 4203 */ val AMAddCommentResponse: typingsJapgolly.steamUser.mod.EMsg.AMAddCommentResponse & Double = js.native
  
  @js.native
  sealed trait AMAddFounderToClan
    extends StObject
       with EMsg
  /* 4061 */ val AMAddFounderToClan: typingsJapgolly.steamUser.mod.EMsg.AMAddFounderToClan & Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicense
    extends StObject
       with EMsg
  /* 4224 */ val AMAddFreeLicense: typingsJapgolly.steamUser.mod.EMsg.AMAddFreeLicense & Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicenseResponse
    extends StObject
       with EMsg
  /* 4285 */ val AMAddFreeLicenseResponse: typingsJapgolly.steamUser.mod.EMsg.AMAddFreeLicenseResponse & Double = js.native
  
  @js.native
  sealed trait AMAddFriend
    extends StObject
       with EMsg
  /* 4081 */ val AMAddFriend: typingsJapgolly.steamUser.mod.EMsg.AMAddFriend & Double = js.native
  
  @js.native
  sealed trait AMAddFriendResponse
    extends StObject
       with EMsg
  /* 4082 */ val AMAddFriendResponse: typingsJapgolly.steamUser.mod.EMsg.AMAddFriendResponse & Double = js.native
  
  @js.native
  sealed trait AMAddLicense
    extends StObject
       with EMsg
  /* 505 */ val AMAddLicense: typingsJapgolly.steamUser.mod.EMsg.AMAddLicense & Double = js.native
  
  @js.native
  sealed trait AMAddMinutesToLicense
    extends StObject
       with EMsg
  /* 510 */ val AMAddMinutesToLicense: typingsJapgolly.steamUser.mod.EMsg.AMAddMinutesToLicense & Double = js.native
  
  @js.native
  sealed trait AMAddPublisherUser
    extends StObject
       with EMsg
  /* 4280 */ val AMAddPublisherUser: typingsJapgolly.steamUser.mod.EMsg.AMAddPublisherUser & Double = js.native
  
  @js.native
  sealed trait AMAddUsersToMarketingTreatment
    extends StObject
       with EMsg
  /* 4234 */ val AMAddUsersToMarketingTreatment: typingsJapgolly.steamUser.mod.EMsg.AMAddUsersToMarketingTreatment & Double = js.native
  
  @js.native
  sealed trait AMAllowUserContentQuery
    extends StObject
       with EMsg
  /* 558 */ val AMAllowUserContentQuery: typingsJapgolly.steamUser.mod.EMsg.AMAllowUserContentQuery & Double = js.native
  
  @js.native
  sealed trait AMAllowUserContentResponse
    extends StObject
       with EMsg
  /* 559 */ val AMAllowUserContentResponse: typingsJapgolly.steamUser.mod.EMsg.AMAllowUserContentResponse & Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesRequest
    extends StObject
       with EMsg
  /* 4156 */ val AMAllowUserFilesRequest: typingsJapgolly.steamUser.mod.EMsg.AMAllowUserFilesRequest & Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesResponse
    extends StObject
       with EMsg
  /* 4157 */ val AMAllowUserFilesResponse: typingsJapgolly.steamUser.mod.EMsg.AMAllowUserFilesResponse & Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUser
    extends StObject
       with EMsg
  /* 592 */ val AMAuthenticateUser: typingsJapgolly.steamUser.mod.EMsg.AMAuthenticateUser & Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUserResponse
    extends StObject
       with EMsg
  /* 593 */ val AMAuthenticateUserResponse: typingsJapgolly.steamUser.mod.EMsg.AMAuthenticateUserResponse & Double = js.native
  
  @js.native
  sealed trait AMAuthenticatedPlayerList
    extends StObject
       with EMsg
  /* 4315 */ val AMAuthenticatedPlayerList: typingsJapgolly.steamUser.mod.EMsg.AMAuthenticatedPlayerList & Double = js.native
  
  @js.native
  sealed trait AMBanFromChat
    extends StObject
       with EMsg
  /* 4145 */ val AMBanFromChat: typingsJapgolly.steamUser.mod.EMsg.AMBanFromChat & Double = js.native
  
  @js.native
  sealed trait AMBeginProcessingLicenses
    extends StObject
       with EMsg
  /* 507 */ val AMBeginProcessingLicenses: typingsJapgolly.steamUser.mod.EMsg.AMBeginProcessingLicenses & Double = js.native
  
  @js.native
  sealed trait AMBitPayPayment
    extends StObject
       with EMsg
  /* 4410 */ val AMBitPayPayment: typingsJapgolly.steamUser.mod.EMsg.AMBitPayPayment & Double = js.native
  
  @js.native
  sealed trait AMBitPayPaymentResponse
    extends StObject
       with EMsg
  /* 4411 */ val AMBitPayPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMBitPayPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPayment
    extends StObject
       with EMsg
  /* 4380 */ val AMBoaCompraPayment: typingsJapgolly.steamUser.mod.EMsg.AMBoaCompraPayment & Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse
    extends StObject
       with EMsg
  /* 4381 */ val AMBoaCompraPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMBoaCompraPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollect
    extends StObject
       with EMsg
  /* 4086 */ val AMCancelEasyCollect: typingsJapgolly.steamUser.mod.EMsg.AMCancelEasyCollect & Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollectResponse
    extends StObject
       with EMsg
  /* 4087 */ val AMCancelEasyCollectResponse: typingsJapgolly.steamUser.mod.EMsg.AMCancelEasyCollectResponse & Double = js.native
  
  @js.native
  sealed trait AMCancelLicense
    extends StObject
       with EMsg
  /* 511 */ val AMCancelLicense: typingsJapgolly.steamUser.mod.EMsg.AMCancelLicense & Double = js.native
  
  @js.native
  sealed trait AMCancelPurchase
    extends StObject
       with EMsg
  /* 522 */ val AMCancelPurchase: typingsJapgolly.steamUser.mod.EMsg.AMCancelPurchase & Double = js.native
  
  @js.native
  sealed trait AMChallengeNotification
    extends StObject
       with EMsg
  /* 4105 */ val AMChallengeNotification: typingsJapgolly.steamUser.mod.EMsg.AMChallengeNotification & Double = js.native
  
  @js.native
  sealed trait AMChallengeVerdict
    extends StObject
       with EMsg
  /* 4104 */ val AMChallengeVerdict: typingsJapgolly.steamUser.mod.EMsg.AMChallengeVerdict & Double = js.native
  
  @js.native
  sealed trait AMChangeClanOwner
    extends StObject
       with EMsg
  /* 4085 */ val AMChangeClanOwner: typingsJapgolly.steamUser.mod.EMsg.AMChangeClanOwner & Double = js.native
  
  @js.native
  sealed trait AMChatActionResult
    extends StObject
       with EMsg
  /* 579 */ val AMChatActionResult: typingsJapgolly.steamUser.mod.EMsg.AMChatActionResult & Double = js.native
  
  @js.native
  sealed trait AMChatCleanup
    extends StObject
       with EMsg
  /* 533 */ val AMChatCleanup: typingsJapgolly.steamUser.mod.EMsg.AMChatCleanup & Double = js.native
  
  @js.native
  sealed trait AMChatEnter
    extends StObject
       with EMsg
  /* 577 */ val AMChatEnter: typingsJapgolly.steamUser.mod.EMsg.AMChatEnter & Double = js.native
  
  @js.native
  sealed trait AMChatInvite
    extends StObject
       with EMsg
  /* 572 */ val AMChatInvite: typingsJapgolly.steamUser.mod.EMsg.AMChatInvite & Double = js.native
  
  @js.native
  sealed trait AMChatMulti
    extends StObject
       with EMsg
  /* 570 */ val AMChatMulti: typingsJapgolly.steamUser.mod.EMsg.AMChatMulti & Double = js.native
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting
    extends StObject
       with EMsg
  /* 4118 */ val AMCheckClanInviteRateLimiting: typingsJapgolly.steamUser.mod.EMsg.AMCheckClanInviteRateLimiting & Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembership
    extends StObject
       with EMsg
  /* 4075 */ val AMCheckClanMembership: typingsJapgolly.steamUser.mod.EMsg.AMCheckClanMembership & Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembershipResponse
    extends StObject
       with EMsg
  /* 4161 */ val AMCheckClanMembershipResponse: typingsJapgolly.steamUser.mod.EMsg.AMCheckClanMembershipResponse & Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGift
    extends StObject
       with EMsg
  /* 4352 */ val AMClaimUnownedUserGift: typingsJapgolly.steamUser.mod.EMsg.AMClaimUnownedUserGift & Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse
    extends StObject
       with EMsg
  /* 4353 */ val AMClaimUnownedUserGiftResponse: typingsJapgolly.steamUser.mod.EMsg.AMClaimUnownedUserGiftResponse & Double = js.native
  
  @js.native
  sealed trait AMClanCleanup
    extends StObject
       with EMsg
  /* 534 */ val AMClanCleanup: typingsJapgolly.steamUser.mod.EMsg.AMClanCleanup & Double = js.native
  
  @js.native
  sealed trait AMClanCleanupList
    extends StObject
       with EMsg
  /* 538 */ val AMClanCleanupList: typingsJapgolly.steamUser.mod.EMsg.AMClanCleanupList & Double = js.native
  
  @js.native
  sealed trait AMClanDataUpdated
    extends StObject
       with EMsg
  /* 567 */ val AMClanDataUpdated: typingsJapgolly.steamUser.mod.EMsg.AMClanDataUpdated & Double = js.native
  
  @js.native
  sealed trait AMClanPermissions
    extends StObject
       with EMsg
  /* 4011 */ val AMClanPermissions: typingsJapgolly.steamUser.mod.EMsg.AMClanPermissions & Double = js.native
  
  @js.native
  sealed trait AMClanPermissionsResponse
    extends StObject
       with EMsg
  /* 4012 */ val AMClanPermissionsResponse: typingsJapgolly.steamUser.mod.EMsg.AMClanPermissionsResponse & Double = js.native
  
  @js.native
  sealed trait AMClansInCommon
    extends StObject
       with EMsg
  /* 4090 */ val AMClansInCommon: typingsJapgolly.steamUser.mod.EMsg.AMClansInCommon & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCount
    extends StObject
       with EMsg
  /* 4103 */ val AMClansInCommonCount: typingsJapgolly.steamUser.mod.EMsg.AMClansInCommonCount & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCountResponse
    extends StObject
       with EMsg
  /* 4097 */ val AMClansInCommonCountResponse: typingsJapgolly.steamUser.mod.EMsg.AMClansInCommonCountResponse & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonResponse
    extends StObject
       with EMsg
  /* 4091 */ val AMClansInCommonResponse: typingsJapgolly.steamUser.mod.EMsg.AMClansInCommonResponse & Double = js.native
  
  @js.native
  sealed trait AMClearDispute
    extends StObject
       with EMsg
  /* 4264 */ val AMClearDispute: typingsJapgolly.steamUser.mod.EMsg.AMClearDispute & Double = js.native
  
  @js.native
  sealed trait AMClearDisputeResponse
    extends StObject
       with EMsg
  /* 4265 */ val AMClearDisputeResponse: typingsJapgolly.steamUser.mod.EMsg.AMClearDisputeResponse & Double = js.native
  
  @js.native
  sealed trait AMClearPersonaMetadataBlob
    extends StObject
       with EMsg
  /* 4306 */ val AMClearPersonaMetadataBlob: typingsJapgolly.steamUser.mod.EMsg.AMClearPersonaMetadataBlob & Double = js.native
  
  @js.native
  sealed trait AMClientAcceptFriendInvite
    extends StObject
       with EMsg
  /* 576 */ val AMClientAcceptFriendInvite: typingsJapgolly.steamUser.mod.EMsg.AMClientAcceptFriendInvite & Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroup
    extends StObject
       with EMsg
  /* 5566 */ val AMClientAddFriendToGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientAddFriendToGroup & Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse
    extends StObject
       with EMsg
  /* 5567 */ val AMClientAddFriendToGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientAddFriendToGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientChatActionRelay
    extends StObject
       with EMsg
  /* 598 */ val AMClientChatActionRelay: typingsJapgolly.steamUser.mod.EMsg.AMClientChatActionRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatInviteRelay
    extends StObject
       with EMsg
  /* 571 */ val AMClientChatInviteRelay: typingsJapgolly.steamUser.mod.EMsg.AMClientChatInviteRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay
    extends StObject
       with EMsg
  /* 574 */ val AMClientChatMemberInfoRelay: typingsJapgolly.steamUser.mod.EMsg.AMClientChatMemberInfoRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatMsgRelay
    extends StObject
       with EMsg
  /* 569 */ val AMClientChatMsgRelay: typingsJapgolly.steamUser.mod.EMsg.AMClientChatMsgRelay & Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroup
    extends StObject
       with EMsg
  /* 5560 */ val AMClientCreateFriendsGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientCreateFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5561 */ val AMClientCreateFriendsGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientCreateFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup
    extends StObject
       with EMsg
  /* 5562 */ val AMClientDeleteFriendsGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientDeleteFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientDeleteFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientJoinChatRelay
    extends StObject
       with EMsg
  /* 573 */ val AMClientJoinChatRelay: typingsJapgolly.steamUser.mod.EMsg.AMClientJoinChatRelay & Double = js.native
  
  @js.native
  sealed trait AMClientManageFriendsGroup
    extends StObject
       with EMsg
  /* 5564 */ val AMClientManageFriendsGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientManageFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientManageFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5565 */ val AMClientManageFriendsGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientManageFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientNotPlaying
    extends StObject
       with EMsg
  /* 553 */ val AMClientNotPlaying: typingsJapgolly.steamUser.mod.EMsg.AMClientNotPlaying & Double = js.native
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource
    extends StObject
       with EMsg
  /* 578 */ val AMClientPublishRemovalFromSource: typingsJapgolly.steamUser.mod.EMsg.AMClientPublishRemovalFromSource & Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup
    extends StObject
       with EMsg
  /* 5568 */ val AMClientRemoveFriendFromGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientRemoveFriendFromGroup & Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse
    extends StObject
       with EMsg
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientRemoveFriendFromGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroup
    extends StObject
       with EMsg
  /* 5564 */ val AMClientRenameFriendsGroup: typingsJapgolly.steamUser.mod.EMsg.AMClientRenameFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5565 */ val AMClientRenameFriendsGroupResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientRenameFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientRequestFriendship
    extends StObject
       with EMsg
  /* 554 */ val AMClientRequestFriendship: typingsJapgolly.steamUser.mod.EMsg.AMClientRequestFriendship & Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNickname
    extends StObject
       with EMsg
  /* 5588 */ val AMClientSetPlayerNickname: typingsJapgolly.steamUser.mod.EMsg.AMClientSetPlayerNickname & Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse
    extends StObject
       with EMsg
  /* 5589 */ val AMClientSetPlayerNicknameResponse: typingsJapgolly.steamUser.mod.EMsg.AMClientSetPlayerNicknameResponse & Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchase
    extends StObject
       with EMsg
  /* 4383 */ val AMCompleteExternalPurchase: typingsJapgolly.steamUser.mod.EMsg.AMCompleteExternalPurchase & Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse
    extends StObject
       with EMsg
  /* 4384 */ val AMCompleteExternalPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMCompleteExternalPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMCompletePurchase
    extends StObject
       with EMsg
  /* 521 */ val AMCompletePurchase: typingsJapgolly.steamUser.mod.EMsg.AMCompletePurchase & Double = js.native
  
  @js.native
  sealed trait AMConvertClan
    extends StObject
       with EMsg
  /* 4093 */ val AMConvertClan: typingsJapgolly.steamUser.mod.EMsg.AMConvertClan & Double = js.native
  
  @js.native
  sealed trait AMConvertWallet
    extends StObject
       with EMsg
  /* 4251 */ val AMConvertWallet: typingsJapgolly.steamUser.mod.EMsg.AMConvertWallet & Double = js.native
  
  @js.native
  sealed trait AMConvertWalletResponse
    extends StObject
       with EMsg
  /* 4252 */ val AMConvertWalletResponse: typingsJapgolly.steamUser.mod.EMsg.AMConvertWalletResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateAccountRecord
    extends StObject
       with EMsg
  /* 4109 */ val AMCreateAccountRecord: typingsJapgolly.steamUser.mod.EMsg.AMCreateAccountRecord & Double = js.native
  
  @js.native
  sealed trait AMCreateAccountRecordInSteam3
    extends StObject
       with EMsg
  /* 4183 */ val AMCreateAccountRecordInSteam3: typingsJapgolly.steamUser.mod.EMsg.AMCreateAccountRecordInSteam3 & Double = js.native
  
  @js.native
  sealed trait AMCreateAccountResponse
    extends StObject
       with EMsg
  /* 129 */ val AMCreateAccountResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateAccountResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateChargeback
    extends StObject
       with EMsg
  /* 4260 */ val AMCreateChargeback: typingsJapgolly.steamUser.mod.EMsg.AMCreateChargeback & Double = js.native
  
  @js.native
  sealed trait AMCreateChargebackResponse
    extends StObject
       with EMsg
  /* 4261 */ val AMCreateChargebackResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateChargebackResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateChat
    extends StObject
       with EMsg
  /* 4001 */ val AMCreateChat: typingsJapgolly.steamUser.mod.EMsg.AMCreateChat & Double = js.native
  
  @js.native
  sealed trait AMCreateChatResponse
    extends StObject
       with EMsg
  /* 4002 */ val AMCreateChatResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateChatResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClan
    extends StObject
       with EMsg
  /* 586 */ val AMCreateClan: typingsJapgolly.steamUser.mod.EMsg.AMCreateClan & Double = js.native
  
  @js.native
  sealed trait AMCreateClanAnnouncement
    extends StObject
       with EMsg
  /* 4027 */ val AMCreateClanAnnouncement: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanAnnouncement & Double = js.native
  
  @js.native
  sealed trait AMCreateClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4028 */ val AMCreateClanAnnouncementResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClanEvent
    extends StObject
       with EMsg
  /* 4013 */ val AMCreateClanEvent: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanEvent & Double = js.native
  
  @js.native
  sealed trait AMCreateClanEventDummyForRateLimiting
    extends StObject
       with EMsg
  /* 4013 */ val AMCreateClanEventDummyForRateLimiting: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanEventDummyForRateLimiting & Double = js.native
  
  @js.native
  sealed trait AMCreateClanEventResponse
    extends StObject
       with EMsg
  /* 4014 */ val AMCreateClanEventResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClanResponse
    extends StObject
       with EMsg
  /* 587 */ val AMCreateClanResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateClanResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateDispute
    extends StObject
       with EMsg
  /* 4262 */ val AMCreateDispute: typingsJapgolly.steamUser.mod.EMsg.AMCreateDispute & Double = js.native
  
  @js.native
  sealed trait AMCreateDisputeResponse
    extends StObject
       with EMsg
  /* 4263 */ val AMCreateDisputeResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateDisputeResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateFinancialAdjustment
    extends StObject
       with EMsg
  /* 4265 */ val AMCreateFinancialAdjustment: typingsJapgolly.steamUser.mod.EMsg.AMCreateFinancialAdjustment & Double = js.native
  
  @js.native
  sealed trait AMCreateRefund
    extends StObject
       with EMsg
  /* 4258 */ val AMCreateRefund: typingsJapgolly.steamUser.mod.EMsg.AMCreateRefund & Double = js.native
  
  @js.native
  sealed trait AMCreateRefundResponse
    extends StObject
       with EMsg
  /* 4259 */ val AMCreateRefundResponse: typingsJapgolly.steamUser.mod.EMsg.AMCreateRefundResponse & Double = js.native
  
  @js.native
  sealed trait AMDegicaPayment
    extends StObject
       with EMsg
  /* 4396 */ val AMDegicaPayment: typingsJapgolly.steamUser.mod.EMsg.AMDegicaPayment & Double = js.native
  
  @js.native
  sealed trait AMDegicaPaymentResponse
    extends StObject
       with EMsg
  /* 4397 */ val AMDegicaPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMDegicaPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanAnnouncement
    extends StObject
       with EMsg
  /* 4035 */ val AMDeleteClanAnnouncement: typingsJapgolly.steamUser.mod.EMsg.AMDeleteClanAnnouncement & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4036 */ val AMDeleteClanAnnouncementResponse: typingsJapgolly.steamUser.mod.EMsg.AMDeleteClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEvent
    extends StObject
       with EMsg
  /* 4019 */ val AMDeleteClanEvent: typingsJapgolly.steamUser.mod.EMsg.AMDeleteClanEvent & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEventResponse
    extends StObject
       with EMsg
  /* 4020 */ val AMDeleteClanEventResponse: typingsJapgolly.steamUser.mod.EMsg.AMDeleteClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMDeleteComment
    extends StObject
       with EMsg
  /* 4204 */ val AMDeleteComment: typingsJapgolly.steamUser.mod.EMsg.AMDeleteComment & Double = js.native
  
  @js.native
  sealed trait AMDeleteCommentResponse
    extends StObject
       with EMsg
  /* 4205 */ val AMDeleteCommentResponse: typingsJapgolly.steamUser.mod.EMsg.AMDeleteCommentResponse & Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredCard
    extends StObject
       with EMsg
  /* 4241 */ val AMDeleteStoredCard: typingsJapgolly.steamUser.mod.EMsg.AMDeleteStoredCard & Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo
    extends StObject
       with EMsg
  /* 4246 */ val AMDeleteStoredPaymentInfo: typingsJapgolly.steamUser.mod.EMsg.AMDeleteStoredPaymentInfo & Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement
    extends StObject
       with EMsg
  /* 4330 */ val AMDeleteStoredPaypalAgreement: typingsJapgolly.steamUser.mod.EMsg.AMDeleteStoredPaypalAgreement & Double = js.native
  
  @js.native
  sealed trait AMDumpClan
    extends StObject
       with EMsg
  /* 4084 */ val AMDumpClan: typingsJapgolly.steamUser.mod.EMsg.AMDumpClan & Double = js.native
  
  @js.native
  sealed trait AMDumpUser
    extends StObject
       with EMsg
  /* 4059 */ val AMDumpUser: typingsJapgolly.steamUser.mod.EMsg.AMDumpUser & Double = js.native
  
  @js.native
  sealed trait AMEClubPayment
    extends StObject
       with EMsg
  /* 4398 */ val AMEClubPayment: typingsJapgolly.steamUser.mod.EMsg.AMEClubPayment & Double = js.native
  
  @js.native
  sealed trait AMEClubPaymentResponse
    extends StObject
       with EMsg
  /* 4399 */ val AMEClubPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMEClubPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMEditBanReason
    extends StObject
       with EMsg
  /* 4160 */ val AMEditBanReason: typingsJapgolly.steamUser.mod.EMsg.AMEditBanReason & Double = js.native
  
  @js.native
  sealed trait AMExpireCaptchaByGID
    extends StObject
       with EMsg
  /* 4382 */ val AMExpireCaptchaByGID: typingsJapgolly.steamUser.mod.EMsg.AMExpireCaptchaByGID & Double = js.native
  
  @js.native
  sealed trait AMExtendLicense
    extends StObject
       with EMsg
  /* 509 */ val AMExtendLicense: typingsJapgolly.steamUser.mod.EMsg.AMExtendLicense & Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchase
    extends StObject
       with EMsg
  /* 4367 */ val AMFinalizePurchase: typingsJapgolly.steamUser.mod.EMsg.AMFinalizePurchase & Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchaseResponse
    extends StObject
       with EMsg
  /* 4368 */ val AMFinalizePurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMFinalizePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMFindAccounts
    extends StObject
       with EMsg
  /* 580 */ val AMFindAccounts: typingsJapgolly.steamUser.mod.EMsg.AMFindAccounts & Double = js.native
  
  @js.native
  sealed trait AMFindAccountsResponse
    extends StObject
       with EMsg
  /* 581 */ val AMFindAccountsResponse: typingsJapgolly.steamUser.mod.EMsg.AMFindAccountsResponse & Double = js.native
  
  @js.native
  sealed trait AMFindClanUser
    extends StObject
       with EMsg
  /* 4143 */ val AMFindClanUser: typingsJapgolly.steamUser.mod.EMsg.AMFindClanUser & Double = js.native
  
  @js.native
  sealed trait AMFindClanUserResponse
    extends StObject
       with EMsg
  /* 4144 */ val AMFindClanUserResponse: typingsJapgolly.steamUser.mod.EMsg.AMFindClanUserResponse & Double = js.native
  
  @js.native
  sealed trait AMFindGSByIP
    extends StObject
       with EMsg
  /* 4106 */ val AMFindGSByIP: typingsJapgolly.steamUser.mod.EMsg.AMFindGSByIP & Double = js.native
  
  @js.native
  sealed trait AMFindHungTransactions
    extends StObject
       with EMsg
  /* 518 */ val AMFindHungTransactions: typingsJapgolly.steamUser.mod.EMsg.AMFindHungTransactions & Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchase
    extends StObject
       with EMsg
  /* 525 */ val AMFixPendingPurchase: typingsJapgolly.steamUser.mod.EMsg.AMFixPendingPurchase & Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse
    extends StObject
       with EMsg
  /* 526 */ val AMFixPendingPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMFixPendingPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMFixPendingRefund
    extends StObject
       with EMsg
  /* 535 */ val AMFixPendingRefund: typingsJapgolly.steamUser.mod.EMsg.AMFixPendingRefund & Double = js.native
  
  @js.native
  sealed trait AMFoundGSByIP
    extends StObject
       with EMsg
  /* 4107 */ val AMFoundGSByIP: typingsJapgolly.steamUser.mod.EMsg.AMFoundGSByIP & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommon
    extends StObject
       with EMsg
  /* 4100 */ val AMFriendsInCommon: typingsJapgolly.steamUser.mod.EMsg.AMFriendsInCommon & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse
    extends StObject
       with EMsg
  /* 4102 */ val AMFriendsInCommonCountResponse: typingsJapgolly.steamUser.mod.EMsg.AMFriendsInCommonCountResponse & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonResponse
    extends StObject
       with EMsg
  /* 4101 */ val AMFriendsInCommonResponse: typingsJapgolly.steamUser.mod.EMsg.AMFriendsInCommonResponse & Double = js.native
  
  @js.native
  sealed trait AMFriendsList
    extends StObject
       with EMsg
  /* 4098 */ val AMFriendsList: typingsJapgolly.steamUser.mod.EMsg.AMFriendsList & Double = js.native
  
  @js.native
  sealed trait AMFriendsListResponse
    extends StObject
       with EMsg
  /* 4099 */ val AMFriendsListResponse: typingsJapgolly.steamUser.mod.EMsg.AMFriendsListResponse & Double = js.native
  
  @js.native
  sealed trait AMFundedPayment
    extends StObject
       with EMsg
  /* 4418 */ val AMFundedPayment: typingsJapgolly.steamUser.mod.EMsg.AMFundedPayment & Double = js.native
  
  @js.native
  sealed trait AMFundedPaymentResponse
    extends StObject
       with EMsg
  /* 4419 */ val AMFundedPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMFundedPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerRemove
    extends StObject
       with EMsg
  /* 6406 */ val AMGMSGameServerRemove: typingsJapgolly.steamUser.mod.EMsg.AMGMSGameServerRemove & Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerUpdate
    extends StObject
       with EMsg
  /* 6405 */ val AMGMSGameServerUpdate: typingsJapgolly.steamUser.mod.EMsg.AMGMSGameServerUpdate & Double = js.native
  
  @js.native
  sealed trait AMGSSearch
    extends StObject
       with EMsg
  /* 4213 */ val AMGSSearch: typingsJapgolly.steamUser.mod.EMsg.AMGSSearch & Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountChangePassword
    extends StObject
       with EMsg
  /* 4340 */ val AMGameServerAccountChangePassword: typingsJapgolly.steamUser.mod.EMsg.AMGameServerAccountChangePassword & Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount
    extends StObject
       with EMsg
  /* 4341 */ val AMGameServerAccountDeleteAccount: typingsJapgolly.steamUser.mod.EMsg.AMGameServerAccountDeleteAccount & Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck
    extends StObject
       with EMsg
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: typingsJapgolly.steamUser.mod.EMsg.AMGameServerPlayerCompatibilityCheck & Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse
    extends StObject
       with EMsg
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: typingsJapgolly.steamUser.mod.EMsg.AMGameServerPlayerCompatibilityCheckResponse & Double = js.native
  
  @js.native
  sealed trait AMGameServerRemove
    extends StObject
       with EMsg
  /* 4332 */ val AMGameServerRemove: typingsJapgolly.steamUser.mod.EMsg.AMGameServerRemove & Double = js.native
  
  @js.native
  sealed trait AMGameServerUpdate
    extends StObject
       with EMsg
  /* 4331 */ val AMGameServerUpdate: typingsJapgolly.steamUser.mod.EMsg.AMGameServerUpdate & Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfo
    extends StObject
       with EMsg
  /* 4323 */ val AMGetAccountBanInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountBanInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse
    extends StObject
       with EMsg
  /* 4324 */ val AMGetAccountBanInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountBanInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo
    extends StObject
       with EMsg
  /* 4338 */ val AMGetAccountCommunityBanInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountCommunityBanInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse
    extends StObject
       with EMsg
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountCommunityBanInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails
    extends StObject
       with EMsg
  /* 4287 */ val AMGetAccountDetails: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountDetails & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails2
    extends StObject
       with EMsg
  /* 4112 */ val AMGetAccountDetails2: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountDetails2 & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse
    extends StObject
       with EMsg
  /* 4288 */ val AMGetAccountDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2
    extends StObject
       with EMsg
  /* 4113 */ val AMGetAccountDetailsResponse2: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountDetailsResponse2 & Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddress
    extends StObject
       with EMsg
  /* 4006 */ val AMGetAccountEmailAddress: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountEmailAddress & Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse
    extends StObject
       with EMsg
  /* 4007 */ val AMGetAccountEmailAddressResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountEmailAddressResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing
    extends StObject
       with EMsg
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountFlagsForWGSpoofing & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse
    extends StObject
       with EMsg
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountFlagsForWGSpoofingResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFriendsCount
    extends StObject
       with EMsg
  /* 594 */ val AMGetAccountFriendsCount: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountFriendsCount & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFriendsCountResponse
    extends StObject
       with EMsg
  /* 595 */ val AMGetAccountFriendsCountResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountFriendsCountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinks
    extends StObject
       with EMsg
  /* 4069 */ val AMGetAccountLinks: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountLinks & Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinksResponse
    extends StObject
       with EMsg
  /* 4070 */ val AMGetAccountLinksResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountLinksResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfo
    extends StObject
       with EMsg
  /* 4313 */ val AMGetAccountPSNInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountPSNInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse
    extends StObject
       with EMsg
  /* 4314 */ val AMGetAccountPSNInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountPSNInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest
    extends StObject
       with EMsg
  /* 4408 */ val AMGetAccountResetDetailsRequest: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountResetDetailsRequest & Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse
    extends StObject
       with EMsg
  /* 4409 */ val AMGetAccountResetDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountResetDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatus
    extends StObject
       with EMsg
  /* 4158 */ val AMGetAccountStatus: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountStatus & Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatusResponse
    extends StObject
       with EMsg
  /* 4159 */ val AMGetAccountStatusResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetAccountStatusResponse & Double = js.native
  
  @js.native
  sealed trait AMGetBillingAddress
    extends StObject
       with EMsg
  /* 4188 */ val AMGetBillingAddress: typingsJapgolly.steamUser.mod.EMsg.AMGetBillingAddress & Double = js.native
  
  @js.native
  sealed trait AMGetBillingAddressResponse
    extends StObject
       with EMsg
  /* 4189 */ val AMGetBillingAddressResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGID
    extends StObject
       with EMsg
  /* 4134 */ val AMGetCaptchaDataByGID: typingsJapgolly.steamUser.mod.EMsg.AMGetCaptchaDataByGID & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse
    extends StObject
       with EMsg
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetCaptchaDataByGIDResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIP
    extends StObject
       with EMsg
  /* 4129 */ val AMGetCaptchaDataForIP: typingsJapgolly.steamUser.mod.EMsg.AMGetCaptchaDataForIP & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse
    extends StObject
       with EMsg
  /* 4130 */ val AMGetCaptchaDataForIPResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetCaptchaDataForIPResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCardList
    extends StObject
       with EMsg
  /* 4239 */ val AMGetCardList: typingsJapgolly.steamUser.mod.EMsg.AMGetCardList & Double = js.native
  
  @js.native
  sealed trait AMGetCardListResponse
    extends StObject
       with EMsg
  /* 4240 */ val AMGetCardListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetCardListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetChatBanList
    extends StObject
       with EMsg
  /* 4065 */ val AMGetChatBanList: typingsJapgolly.steamUser.mod.EMsg.AMGetChatBanList & Double = js.native
  
  @js.native
  sealed trait AMGetChatBanListResponse
    extends StObject
       with EMsg
  /* 4066 */ val AMGetChatBanListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetChatBanListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanAnnouncements
    extends StObject
       with EMsg
  /* 4033 */ val AMGetClanAnnouncements: typingsJapgolly.steamUser.mod.EMsg.AMGetClanAnnouncements & Double = js.native
  
  @js.native
  sealed trait AMGetClanAnnouncementsCount
    extends StObject
       with EMsg
  /* 4031 */ val AMGetClanAnnouncementsCount: typingsJapgolly.steamUser.mod.EMsg.AMGetClanAnnouncementsCount & Double = js.native
  
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse
    extends StObject
       with EMsg
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanAnnouncementsCountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanAnnouncementsResponse
    extends StObject
       with EMsg
  /* 4034 */ val AMGetClanAnnouncementsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanAnnouncementsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetails
    extends StObject
       with EMsg
  /* 588 */ val AMGetClanDetails: typingsJapgolly.steamUser.mod.EMsg.AMGetClanDetails & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation
    extends StObject
       with EMsg
  /* 4373 */ val AMGetClanDetailsForForumCreation: typingsJapgolly.steamUser.mod.EMsg.AMGetClanDetailsForForumCreation & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse
    extends StObject
       with EMsg
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanDetailsForForumCreationResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsResponse
    extends StObject
       with EMsg
  /* 589 */ val AMGetClanDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanEvents
    extends StObject
       with EMsg
  /* 4017 */ val AMGetClanEvents: typingsJapgolly.steamUser.mod.EMsg.AMGetClanEvents & Double = js.native
  
  @js.native
  sealed trait AMGetClanEventsResponse
    extends StObject
       with EMsg
  /* 4018 */ val AMGetClanEventsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanEventsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanHistory
    extends StObject
       with EMsg
  /* 4039 */ val AMGetClanHistory: typingsJapgolly.steamUser.mod.EMsg.AMGetClanHistory & Double = js.native
  
  @js.native
  sealed trait AMGetClanHistoryResponse
    extends StObject
       with EMsg
  /* 4040 */ val AMGetClanHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembers
    extends StObject
       with EMsg
  /* 4076 */ val AMGetClanMembers: typingsJapgolly.steamUser.mod.EMsg.AMGetClanMembers & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembersResponse
    extends StObject
       with EMsg
  /* 4077 */ val AMGetClanMembersResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanMembersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembershipList
    extends StObject
       with EMsg
  /* 4088 */ val AMGetClanMembershipList: typingsJapgolly.steamUser.mod.EMsg.AMGetClanMembershipList & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembershipListResponse
    extends StObject
       with EMsg
  /* 4089 */ val AMGetClanMembershipListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanMembershipListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanOfficers
    extends StObject
       with EMsg
  /* 4298 */ val AMGetClanOfficers: typingsJapgolly.steamUser.mod.EMsg.AMGetClanOfficers & Double = js.native
  
  @js.native
  sealed trait AMGetClanOfficersResponse
    extends StObject
       with EMsg
  /* 4299 */ val AMGetClanOfficersResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanOfficersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTW
    extends StObject
       with EMsg
  /* 4054 */ val AMGetClanPOTW: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPOTW & Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTWResponse
    extends StObject
       with EMsg
  /* 4055 */ val AMGetClanPOTWResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPOTWResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBits
    extends StObject
       with EMsg
  /* 4041 */ val AMGetClanPermissionBits: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPermissionBits & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse
    extends StObject
       with EMsg
  /* 4042 */ val AMGetClanPermissionBitsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPermissionBitsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettings
    extends StObject
       with EMsg
  /* 4023 */ val AMGetClanPermissionSettings: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPermissionSettings & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse
    extends StObject
       with EMsg
  /* 4024 */ val AMGetClanPermissionSettingsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanPermissionSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanRank
    extends StObject
       with EMsg
  /* 4050 */ val AMGetClanRank: typingsJapgolly.steamUser.mod.EMsg.AMGetClanRank & Double = js.native
  
  @js.native
  sealed trait AMGetClanRankResponse
    extends StObject
       with EMsg
  /* 4051 */ val AMGetClanRankResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetClanRankResponse & Double = js.native
  
  @js.native
  sealed trait AMGetComments
    extends StObject
       with EMsg
  /* 4200 */ val AMGetComments: typingsJapgolly.steamUser.mod.EMsg.AMGetComments & Double = js.native
  
  @js.native
  sealed trait AMGetCommentsResponse
    extends StObject
       with EMsg
  /* 4201 */ val AMGetCommentsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetCommentsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyState
    extends StObject
       with EMsg
  /* 4116 */ val AMGetCommunityPrivacyState: typingsJapgolly.steamUser.mod.EMsg.AMGetCommunityPrivacyState & Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse
    extends StObject
       with EMsg
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetCommunityPrivacyStateResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFinalPrice
    extends StObject
       with EMsg
  /* 514 */ val AMGetFinalPrice: typingsJapgolly.steamUser.mod.EMsg.AMGetFinalPrice & Double = js.native
  
  @js.native
  sealed trait AMGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 515 */ val AMGetFinalPriceResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationship
    extends StObject
       with EMsg
  /* 4124 */ val AMGetFriendRelationship: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendRelationship & Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse
    extends StObject
       with EMsg
  /* 4125 */ val AMGetFriendRelationshipResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendRelationshipResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbies
    extends StObject
       with EMsg
  /* 4165 */ val AMGetFriendsLobbies: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendsLobbies & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse
    extends StObject
       with EMsg
  /* 4166 */ val AMGetFriendsLobbiesResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendsLobbiesResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsWishlistInfo
    extends StObject
       with EMsg
  /* 4296 */ val AMGetFriendsWishlistInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendsWishlistInfo & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse
    extends StObject
       with EMsg
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetFriendsWishlistInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerList
    extends StObject
       with EMsg
  /* 4271 */ val AMGetGSPlayerList: typingsJapgolly.steamUser.mod.EMsg.AMGetGSPlayerList & Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerListResponse
    extends StObject
       with EMsg
  /* 4272 */ val AMGetGSPlayerListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetGSPlayerListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetGameMembers
    extends StObject
       with EMsg
  /* 4276 */ val AMGetGameMembers: typingsJapgolly.steamUser.mod.EMsg.AMGetGameMembers & Double = js.native
  
  @js.native
  sealed trait AMGetGameMembersResponse
    extends StObject
       with EMsg
  /* 4277 */ val AMGetGameMembersResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetGameMembersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetGiftTargetListRelay
    extends StObject
       with EMsg
  /* 4094 */ val AMGetGiftTargetListRelay: typingsJapgolly.steamUser.mod.EMsg.AMGetGiftTargetListRelay & Double = js.native
  
  @js.native
  sealed trait AMGetIgnored
    extends StObject
       with EMsg
  /* 4120 */ val AMGetIgnored: typingsJapgolly.steamUser.mod.EMsg.AMGetIgnored & Double = js.native
  
  @js.native
  sealed trait AMGetIgnoredResponse
    extends StObject
       with EMsg
  /* 4121 */ val AMGetIgnoredResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetIgnoredResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKey
    extends StObject
       with EMsg
  /* 516 */ val AMGetLegacyGameKey: typingsJapgolly.steamUser.mod.EMsg.AMGetLegacyGameKey & Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse
    extends StObject
       with EMsg
  /* 517 */ val AMGetLegacyGameKeyResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetLegacyGameKeyResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLicenses
    extends StObject
       with EMsg
  /* 539 */ val AMGetLicenses: typingsJapgolly.steamUser.mod.EMsg.AMGetLicenses & Double = js.native
  
  @js.native
  sealed trait AMGetLicensesResponse
    extends StObject
       with EMsg
  /* 540 */ val AMGetLicensesResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetLicensesResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLobbyList
    extends StObject
       with EMsg
  /* 4136 */ val AMGetLobbyList: typingsJapgolly.steamUser.mod.EMsg.AMGetLobbyList & Double = js.native
  
  @js.native
  sealed trait AMGetLobbyListResponse
    extends StObject
       with EMsg
  /* 4137 */ val AMGetLobbyListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLobbyMetadata
    extends StObject
       with EMsg
  /* 4138 */ val AMGetLobbyMetadata: typingsJapgolly.steamUser.mod.EMsg.AMGetLobbyMetadata & Double = js.native
  
  @js.native
  sealed trait AMGetLobbyMetadataResponse
    extends StObject
       with EMsg
  /* 4139 */ val AMGetLobbyMetadataResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetLobbyMetadataResponse & Double = js.native
  
  @js.native
  sealed trait AMGetNameHistory
    extends StObject
       with EMsg
  /* 4301 */ val AMGetNameHistory: typingsJapgolly.steamUser.mod.EMsg.AMGetNameHistory & Double = js.native
  
  @js.native
  sealed trait AMGetNameHistoryResponse
    extends StObject
       with EMsg
  /* 4302 */ val AMGetNameHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetNameHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreements
    extends StObject
       with EMsg
  /* 4333 */ val AMGetPaypalAgreements: typingsJapgolly.steamUser.mod.EMsg.AMGetPaypalAgreements & Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse
    extends StObject
       with EMsg
  /* 4334 */ val AMGetPaypalAgreementsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetPaypalAgreementsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCount
    extends StObject
       with EMsg
  /* 4375 */ val AMGetPendingNotificationCount: typingsJapgolly.steamUser.mod.EMsg.AMGetPendingNotificationCount & Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse
    extends StObject
       with EMsg
  /* 4376 */ val AMGetPendingNotificationCountResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetPendingNotificationCountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetails
    extends StObject
       with EMsg
  /* 4365 */ val AMGetPlayerBanDetails: typingsJapgolly.steamUser.mod.EMsg.AMGetPlayerBanDetails & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse
    extends StObject
       with EMsg
  /* 4366 */ val AMGetPlayerBanDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetPlayerBanDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetails
    extends StObject
       with EMsg
  /* 4289 */ val AMGetPlayerLinkDetails: typingsJapgolly.steamUser.mod.EMsg.AMGetPlayerLinkDetails & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse
    extends StObject
       with EMsg
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetPlayerLinkDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPreviousCBAccount
    extends StObject
       with EMsg
  /* 4184 */ val AMGetPreviousCBAccount: typingsJapgolly.steamUser.mod.EMsg.AMGetPreviousCBAccount & Double = js.native
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse
    extends StObject
       with EMsg
  /* 4185 */ val AMGetPreviousCBAccountResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetPreviousCBAccountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPurchaseStatus
    extends StObject
       with EMsg
  /* 4206 */ val AMGetPurchaseStatus: typingsJapgolly.steamUser.mod.EMsg.AMGetPurchaseStatus & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanAnnouncement
    extends StObject
       with EMsg
  /* 4037 */ val AMGetSingleClanAnnouncement: typingsJapgolly.steamUser.mod.EMsg.AMGetSingleClanAnnouncement & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetSingleClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEvent
    extends StObject
       with EMsg
  /* 4048 */ val AMGetSingleClanEvent: typingsJapgolly.steamUser.mod.EMsg.AMGetSingleClanEvent & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEventResponse
    extends StObject
       with EMsg
  /* 4049 */ val AMGetSingleClanEventResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetSingleClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn
    extends StObject
       with EMsg
  /* 4278 */ val AMGetSteamIDForMicroTxn: typingsJapgolly.steamUser.mod.EMsg.AMGetSteamIDForMicroTxn & Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse
    extends StObject
       with EMsg
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetSteamIDForMicroTxnResponse & Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummary
    extends StObject
       with EMsg
  /* 4247 */ val AMGetStoredPaymentSummary: typingsJapgolly.steamUser.mod.EMsg.AMGetStoredPaymentSummary & Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse
    extends StObject
       with EMsg
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetStoredPaymentSummaryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserAchievementStatus
    extends StObject
       with EMsg
  /* 4119 */ val AMGetUserAchievementStatus: typingsJapgolly.steamUser.mod.EMsg.AMGetUserAchievementStatus & Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNews
    extends StObject
       with EMsg
  /* 4175 */ val AMGetUserClansNews: typingsJapgolly.steamUser.mod.EMsg.AMGetUserClansNews & Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNewsResponse
    extends StObject
       with EMsg
  /* 4174 */ val AMGetUserClansNewsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserClansNewsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo
    extends StObject
       with EMsg
  /* 4269 */ val AMGetUserCurrentGameInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetUserCurrentGameInfo & Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse
    extends StObject
       with EMsg
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserCurrentGameInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse
    extends StObject
       with EMsg
  /* 4172 */ val AMGetUserFriendNewsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserFriendNewsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed
    extends StObject
       with EMsg
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: typingsJapgolly.steamUser.mod.EMsg.AMGetUserFriendsMinutesPlayed & Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse
    extends StObject
       with EMsg
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserFriendsMinutesPlayedResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStats
    extends StObject
       with EMsg
  /* 4073 */ val AMGetUserGameStats: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGameStats & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStatsResponse
    extends StObject
       with EMsg
  /* 4074 */ val AMGetUserGameStatsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGameStatsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameplayInfo
    extends StObject
       with EMsg
  /* 4237 */ val AMGetUserGameplayInfo: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGameplayInfo & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameplayInfoResponse
    extends StObject
       with EMsg
  /* 4238 */ val AMGetUserGameplayInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGameplayInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGifts
    extends StObject
       with EMsg
  /* 4316 */ val AMGetUserGifts: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGifts & Double = js.native
  
  @js.native
  sealed trait AMGetUserGiftsResponse
    extends StObject
       with EMsg
  /* 4317 */ val AMGetUserGiftsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGiftsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatus
    extends StObject
       with EMsg
  /* 921 */ val AMGetUserGroupStatus: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGroupStatus & Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse
    extends StObject
       with EMsg
  /* 922 */ val AMGetUserGroupStatusResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserGroupStatusResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserHistory
    extends StObject
       with EMsg
  /* 4154 */ val AMGetUserHistory: typingsJapgolly.steamUser.mod.EMsg.AMGetUserHistory & Double = js.native
  
  @js.native
  sealed trait AMGetUserHistoryResponse
    extends StObject
       with EMsg
  /* 4146 */ val AMGetUserHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseHistory
    extends StObject
       with EMsg
  /* 4190 */ val AMGetUserLicenseHistory: typingsJapgolly.steamUser.mod.EMsg.AMGetUserLicenseHistory & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse
    extends StObject
       with EMsg
  /* 4191 */ val AMGetUserLicenseHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserLicenseHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseList
    extends StObject
       with EMsg
  /* 4282 */ val AMGetUserLicenseList: typingsJapgolly.steamUser.mod.EMsg.AMGetUserLicenseList & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseListResponse
    extends StObject
       with EMsg
  /* 4283 */ val AMGetUserLicenseListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserLicenseListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserMinutesPlayed
    extends StObject
       with EMsg
  /* 4227 */ val AMGetUserMinutesPlayed: typingsJapgolly.steamUser.mod.EMsg.AMGetUserMinutesPlayed & Double = js.native
  
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse
    extends StObject
       with EMsg
  /* 4228 */ val AMGetUserMinutesPlayedResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserMinutesPlayedResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserNews
    extends StObject
       with EMsg
  /* 4150 */ val AMGetUserNews: typingsJapgolly.steamUser.mod.EMsg.AMGetUserNews & Double = js.native
  
  @js.native
  sealed trait AMGetUserNewsResponse
    extends StObject
       with EMsg
  /* 4151 */ val AMGetUserNewsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserNewsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserNewsSubscriptions
    extends StObject
       with EMsg
  /* 4147 */ val AMGetUserNewsSubscriptions: typingsJapgolly.steamUser.mod.EMsg.AMGetUserNewsSubscriptions & Double = js.native
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse
    extends StObject
       with EMsg
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserNewsSubscriptionsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserStats
    extends StObject
       with EMsg
  /* 4211 */ val AMGetUserStats: typingsJapgolly.steamUser.mod.EMsg.AMGetUserStats & Double = js.native
  
  @js.native
  sealed trait AMGetUserVacBanList
    extends StObject
       with EMsg
  /* 4292 */ val AMGetUserVacBanList: typingsJapgolly.steamUser.mod.EMsg.AMGetUserVacBanList & Double = js.native
  
  @js.native
  sealed trait AMGetUserVacBanListResponse
    extends StObject
       with EMsg
  /* 4293 */ val AMGetUserVacBanListResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetUserVacBanListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRate
    extends StObject
       with EMsg
  /* 4249 */ val AMGetWalletConversionRate: typingsJapgolly.steamUser.mod.EMsg.AMGetWalletConversionRate & Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse
    extends StObject
       with EMsg
  /* 4250 */ val AMGetWalletConversionRateResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetWalletConversionRateResponse & Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetails
    extends StObject
       with EMsg
  /* 4244 */ val AMGetWalletDetails: typingsJapgolly.steamUser.mod.EMsg.AMGetWalletDetails & Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetailsResponse
    extends StObject
       with EMsg
  /* 4245 */ val AMGetWalletDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMGetWalletDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGiftRevoked
    extends StObject
       with EMsg
  /* 4108 */ val AMGiftRevoked: typingsJapgolly.steamUser.mod.EMsg.AMGiftRevoked & Double = js.native
  
  @js.native
  sealed trait AMGrantCoupon
    extends StObject
       with EMsg
  /* 4356 */ val AMGrantCoupon: typingsJapgolly.steamUser.mod.EMsg.AMGrantCoupon & Double = js.native
  
  @js.native
  sealed trait AMGrantCouponResponse
    extends StObject
       with EMsg
  /* 4357 */ val AMGrantCouponResponse: typingsJapgolly.steamUser.mod.EMsg.AMGrantCouponResponse & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses
    extends StObject
       with EMsg
  /* 566 */ val AMGrantGuestPasses: typingsJapgolly.steamUser.mod.EMsg.AMGrantGuestPasses & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2
    extends StObject
       with EMsg
  /* 4361 */ val AMGrantGuestPasses2: typingsJapgolly.steamUser.mod.EMsg.AMGrantGuestPasses2 & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2Response
    extends StObject
       with EMsg
  /* 4362 */ val AMGrantGuestPasses2Response: typingsJapgolly.steamUser.mod.EMsg.AMGrantGuestPasses2Response & Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransaction
    extends StObject
       with EMsg
  /* 4328 */ val AMHandlePendingTransaction: typingsJapgolly.steamUser.mod.EMsg.AMHandlePendingTransaction & Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse
    extends StObject
       with EMsg
  /* 4360 */ val AMHandlePendingTransactionResponse: typingsJapgolly.steamUser.mod.EMsg.AMHandlePendingTransactionResponse & Double = js.native
  
  @js.native
  sealed trait AMInitPurchase
    extends StObject
       with EMsg
  /* 512 */ val AMInitPurchase: typingsJapgolly.steamUser.mod.EMsg.AMInitPurchase & Double = js.native
  
  @js.native
  sealed trait AMInitPurchaseResponse
    extends StObject
       with EMsg
  /* 560 */ val AMInitPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMInviteUserToClan
    extends StObject
       with EMsg
  /* 564 */ val AMInviteUserToClan: typingsJapgolly.steamUser.mod.EMsg.AMInviteUserToClan & Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod
    extends StObject
       with EMsg
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: typingsJapgolly.steamUser.mod.EMsg.AMIsAccountInCaptchaGracePeriod & Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse
    extends StObject
       with EMsg
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: typingsJapgolly.steamUser.mod.EMsg.AMIsAccountInCaptchaGracePeriodResponse & Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry
    extends StObject
       with EMsg
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: typingsJapgolly.steamUser.mod.EMsg.AMIsPackageRestrictedInUserCountry & Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse
    extends StObject
       with EMsg
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: typingsJapgolly.steamUser.mod.EMsg.AMIsPackageRestrictedInUserCountryResponse & Double = js.native
  
  @js.native
  sealed trait AMIsUserBanned
    extends StObject
       with EMsg
  /* 527 */ val AMIsUserBanned: typingsJapgolly.steamUser.mod.EMsg.AMIsUserBanned & Double = js.native
  
  @js.native
  sealed trait AMIsValidAccountID
    extends StObject
       with EMsg
  /* 4092 */ val AMIsValidAccountID: typingsJapgolly.steamUser.mod.EMsg.AMIsValidAccountID & Double = js.native
  
  @js.native
  sealed trait AMJoinPublicClan
    extends StObject
       with EMsg
  /* 4078 */ val AMJoinPublicClan: typingsJapgolly.steamUser.mod.EMsg.AMJoinPublicClan & Double = js.native
  
  @js.native
  sealed trait AMKickUserFromClan
    extends StObject
       with EMsg
  /* 4060 */ val AMKickUserFromClan: typingsJapgolly.steamUser.mod.EMsg.AMKickUserFromClan & Double = js.native
  
  @js.native
  sealed trait AMLeaveClan
    extends StObject
       with EMsg
  /* 4010 */ val AMLeaveClan: typingsJapgolly.steamUser.mod.EMsg.AMLeaveClan & Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodes
    extends StObject
       with EMsg
  /* 529 */ val AMLoadActivationCodes: typingsJapgolly.steamUser.mod.EMsg.AMLoadActivationCodes & Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodesResponse
    extends StObject
       with EMsg
  /* 530 */ val AMLoadActivationCodesResponse: typingsJapgolly.steamUser.mod.EMsg.AMLoadActivationCodesResponse & Double = js.native
  
  @js.native
  sealed trait AMLoadOEMTickets
    extends StObject
       with EMsg
  /* 524 */ val AMLoadOEMTickets: typingsJapgolly.steamUser.mod.EMsg.AMLoadOEMTickets & Double = js.native
  
  @js.native
  sealed trait AMLockProfile
    extends StObject
       with EMsg
  /* 562 */ val AMLockProfile: typingsJapgolly.steamUser.mod.EMsg.AMLockProfile & Double = js.native
  
  @js.native
  sealed trait AMLookupKey
    extends StObject
       with EMsg
  /* 532 */ val AMLookupKey: typingsJapgolly.steamUser.mod.EMsg.AMLookupKey & Double = js.native
  
  @js.native
  sealed trait AMLookupKeyResponse
    extends StObject
       with EMsg
  /* 531 */ val AMLookupKeyResponse: typingsJapgolly.steamUser.mod.EMsg.AMLookupKeyResponse & Double = js.native
  
  @js.native
  sealed trait AMMOLPayment
    extends StObject
       with EMsg
  /* 4391 */ val AMMOLPayment: typingsJapgolly.steamUser.mod.EMsg.AMMOLPayment & Double = js.native
  
  @js.native
  sealed trait AMMOLPaymentResponse
    extends StObject
       with EMsg
  /* 4392 */ val AMMOLPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMMOLPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMMarketingTreatmentUpdate
    extends StObject
       with EMsg
  /* 4257 */ val AMMarketingTreatmentUpdate: typingsJapgolly.steamUser.mod.EMsg.AMMarketingTreatmentUpdate & Double = js.native
  
  @js.native
  sealed trait AMMoPayPayment
    extends StObject
       with EMsg
  /* 4378 */ val AMMoPayPayment: typingsJapgolly.steamUser.mod.EMsg.AMMoPayPayment & Double = js.native
  
  @js.native
  sealed trait AMMoPayPaymentResponse
    extends StObject
       with EMsg
  /* 4379 */ val AMMoPayPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMMoPayPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMNameChange
    extends StObject
       with EMsg
  /* 4300 */ val AMNameChange: typingsJapgolly.steamUser.mod.EMsg.AMNameChange & Double = js.native
  
  @js.native
  sealed trait AMNewChallenge
    extends StObject
       with EMsg
  /* 523 */ val AMNewChallenge: typingsJapgolly.steamUser.mod.EMsg.AMNewChallenge & Double = js.native
  
  @js.native
  sealed trait AMNodwinPayment
    extends StObject
       with EMsg
  /* 4414 */ val AMNodwinPayment: typingsJapgolly.steamUser.mod.EMsg.AMNodwinPayment & Double = js.native
  
  @js.native
  sealed trait AMNodwinPaymentResponse
    extends StObject
       with EMsg
  /* 4415 */ val AMNodwinPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMNodwinPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMNotifyChatOfClanChange
    extends StObject
       with EMsg
  /* 4079 */ val AMNotifyChatOfClanChange: typingsJapgolly.steamUser.mod.EMsg.AMNotifyChatOfClanChange & Double = js.native
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized
    extends StObject
       with EMsg
  /* 6508 */ val AMNotifySessionDeviceAuthorized: typingsJapgolly.steamUser.mod.EMsg.AMNotifySessionDeviceAuthorized & Double = js.native
  
  @js.native
  sealed trait AMP2PIntroducerMessage
    extends StObject
       with EMsg
  /* 596 */ val AMP2PIntroducerMessage: typingsJapgolly.steamUser.mod.EMsg.AMP2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait AMPasswordHashUpgrade
    extends StObject
       with EMsg
  /* 4377 */ val AMPasswordHashUpgrade: typingsJapgolly.steamUser.mod.EMsg.AMPasswordHashUpgrade & Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment
    extends StObject
       with EMsg
  /* 4400 */ val AMPayPalPaymentsHubPayment: typingsJapgolly.steamUser.mod.EMsg.AMPayPalPaymentsHubPayment & Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse
    extends StObject
       with EMsg
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMPayPalPaymentsHubPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMPayelpPayment
    extends StObject
       with EMsg
  /* 4387 */ val AMPayelpPayment: typingsJapgolly.steamUser.mod.EMsg.AMPayelpPayment & Double = js.native
  
  @js.native
  sealed trait AMPayelpPaymentResponse
    extends StObject
       with EMsg
  /* 4388 */ val AMPayelpPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMPayelpPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMPerfectWorldPayment
    extends StObject
       with EMsg
  /* 4421 */ val AMPerfectWorldPayment: typingsJapgolly.steamUser.mod.EMsg.AMPerfectWorldPayment & Double = js.native
  
  @js.native
  sealed trait AMPerfectWorldPaymentResponse
    extends StObject
       with EMsg
  /* 4422 */ val AMPerfectWorldPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMPerfectWorldPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMPersonaChangeResponse
    extends StObject
       with EMsg
  /* 4372 */ val AMPersonaChangeResponse: typingsJapgolly.steamUser.mod.EMsg.AMPersonaChangeResponse & Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails
    extends StObject
       with EMsg
  /* 4389 */ val AMPlayerGetClanBasicDetails: typingsJapgolly.steamUser.mod.EMsg.AMPlayerGetClanBasicDetails & Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse
    extends StObject
       with EMsg
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.AMPlayerGetClanBasicDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer
    extends StObject
       with EMsg
  /* 4322 */ val AMPlayerHostedOnGameServer: typingsJapgolly.steamUser.mod.EMsg.AMPlayerHostedOnGameServer & Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameList
    extends StObject
       with EMsg
  /* 4266 */ val AMPlayerNicknameList: typingsJapgolly.steamUser.mod.EMsg.AMPlayerNicknameList & Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameListResponse
    extends StObject
       with EMsg
  /* 4267 */ val AMPlayerNicknameListResponse: typingsJapgolly.steamUser.mod.EMsg.AMPlayerNicknameListResponse & Double = js.native
  
  @js.native
  sealed trait AMPrimePersonaStateCache
    extends StObject
       with EMsg
  /* 557 */ val AMPrimePersonaStateCache: typingsJapgolly.steamUser.mod.EMsg.AMPrimePersonaStateCache & Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipList
    extends StObject
       with EMsg
  /* 4162 */ val AMProbeClanMembershipList: typingsJapgolly.steamUser.mod.EMsg.AMProbeClanMembershipList & Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse
    extends StObject
       with EMsg
  /* 4163 */ val AMProbeClanMembershipListResponse: typingsJapgolly.steamUser.mod.EMsg.AMProbeClanMembershipListResponse & Double = js.native
  
  @js.native
  sealed trait AMPublishChatMemberInfo
    extends StObject
       with EMsg
  /* 575 */ val AMPublishChatMemberInfo: typingsJapgolly.steamUser.mod.EMsg.AMPublishChatMemberInfo & Double = js.native
  
  @js.native
  sealed trait AMPublishChatMetadata
    extends StObject
       with EMsg
  /* 4004 */ val AMPublishChatMetadata: typingsJapgolly.steamUser.mod.EMsg.AMPublishChatMetadata & Double = js.native
  
  @js.native
  sealed trait AMPublishChatRoomInfo
    extends StObject
       with EMsg
  /* 4025 */ val AMPublishChatRoomInfo: typingsJapgolly.steamUser.mod.EMsg.AMPublishChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait AMPurchaseResponse
    extends StObject
       with EMsg
  /* 513 */ val AMPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMRecordBanEnforcement
    extends StObject
       with EMsg
  /* 4325 */ val AMRecordBanEnforcement: typingsJapgolly.steamUser.mod.EMsg.AMRecordBanEnforcement & Double = js.native
  
  @js.native
  sealed trait AMRefreshGuestPasses
    extends StObject
       with EMsg
  /* 563 */ val AMRefreshGuestPasses: typingsJapgolly.steamUser.mod.EMsg.AMRefreshGuestPasses & Double = js.native
  
  @js.native
  sealed trait AMRefreshSessions
    extends StObject
       with EMsg
  /* 2210 */ val AMRefreshSessions: typingsJapgolly.steamUser.mod.EMsg.AMRefreshSessions & Double = js.native
  
  @js.native
  sealed trait AMRegisterKey
    extends StObject
       with EMsg
  /* 528 */ val AMRegisterKey: typingsJapgolly.steamUser.mod.EMsg.AMRegisterKey & Double = js.native
  
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame
    extends StObject
       with EMsg
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: typingsJapgolly.steamUser.mod.EMsg.AMRelayGetFriendsWhoPlayGame & Double = js.native
  
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse
    extends StObject
       with EMsg
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: typingsJapgolly.steamUser.mod.EMsg.AMRelayGetFriendsWhoPlayGameResponse & Double = js.native
  
  @js.native
  sealed trait AMRelayPublishStatus
    extends StObject
       with EMsg
  /* 555 */ val AMRelayPublishStatus: typingsJapgolly.steamUser.mod.EMsg.AMRelayPublishStatus & Double = js.native
  
  @js.native
  sealed trait AMRelayToGC
    extends StObject
       with EMsg
  /* 2201 */ val AMRelayToGC: typingsJapgolly.steamUser.mod.EMsg.AMRelayToGC & Double = js.native
  
  @js.native
  sealed trait AMReloadAccount
    extends StObject
       with EMsg
  /* 568 */ val AMReloadAccount: typingsJapgolly.steamUser.mod.EMsg.AMReloadAccount & Double = js.native
  
  @js.native
  sealed trait AMReloadGameGroupPolicy
    extends StObject
       with EMsg
  /* 4284 */ val AMReloadGameGroupPolicy: typingsJapgolly.steamUser.mod.EMsg.AMReloadGameGroupPolicy & Double = js.native
  
  @js.native
  sealed trait AMRemoveFriend
    extends StObject
       with EMsg
  /* 4083 */ val AMRemoveFriend: typingsJapgolly.steamUser.mod.EMsg.AMRemoveFriend & Double = js.native
  
  @js.native
  sealed trait AMRemovePublisherUser
    extends StObject
       with EMsg
  /* 4281 */ val AMRemovePublisherUser: typingsJapgolly.steamUser.mod.EMsg.AMRemovePublisherUser & Double = js.native
  
  @js.native
  sealed trait AMRenewAgreement
    extends StObject
       with EMsg
  /* 4342 */ val AMRenewAgreement: typingsJapgolly.steamUser.mod.EMsg.AMRenewAgreement & Double = js.native
  
  @js.native
  sealed trait AMRenewLicense
    extends StObject
       with EMsg
  /* 4337 */ val AMRenewLicense: typingsJapgolly.steamUser.mod.EMsg.AMRenewLicense & Double = js.native
  
  @js.native
  sealed trait AMRequestAccountData
    extends StObject
       with EMsg
  /* 582 */ val AMRequestAccountData: typingsJapgolly.steamUser.mod.EMsg.AMRequestAccountData & Double = js.native
  
  @js.native
  sealed trait AMRequestAccountDataResponse
    extends StObject
       with EMsg
  /* 583 */ val AMRequestAccountDataResponse: typingsJapgolly.steamUser.mod.EMsg.AMRequestAccountDataResponse & Double = js.native
  
  @js.native
  sealed trait AMRequestChatMetadata
    extends StObject
       with EMsg
  /* 4058 */ val AMRequestChatMetadata: typingsJapgolly.steamUser.mod.EMsg.AMRequestChatMetadata & Double = js.native
  
  @js.native
  sealed trait AMRequestClanData
    extends StObject
       with EMsg
  /* 4008 */ val AMRequestClanData: typingsJapgolly.steamUser.mod.EMsg.AMRequestClanData & Double = js.native
  
  @js.native
  sealed trait AMRequestClanDetails
    extends StObject
       with EMsg
  /* 4329 */ val AMRequestClanDetails: typingsJapgolly.steamUser.mod.EMsg.AMRequestClanDetails & Double = js.native
  
  @js.native
  sealed trait AMRequestFriendData
    extends StObject
       with EMsg
  /* 7530 */ val AMRequestFriendData: typingsJapgolly.steamUser.mod.EMsg.AMRequestFriendData & Double = js.native
  
  @js.native
  sealed trait AMRequestPersonaUpdateForChatServer
    extends StObject
       with EMsg
  /* 4420 */ val AMRequestPersonaUpdateForChatServer: typingsJapgolly.steamUser.mod.EMsg.AMRequestPersonaUpdateForChatServer & Double = js.native
  
  @js.native
  sealed trait AMResetCommunityContent
    extends StObject
       with EMsg
  /* 556 */ val AMResetCommunityContent: typingsJapgolly.steamUser.mod.EMsg.AMResetCommunityContent & Double = js.native
  
  @js.native
  sealed trait AMResetUserVerificationGSByIP
    extends StObject
       with EMsg
  /* 4197 */ val AMResetUserVerificationGSByIP: typingsJapgolly.steamUser.mod.EMsg.AMResetUserVerificationGSByIP & Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits
    extends StObject
       with EMsg
  /* 4385 */ val AMResolveNegativeWalletCredits: typingsJapgolly.steamUser.mod.EMsg.AMResolveNegativeWalletCredits & Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse
    extends StObject
       with EMsg
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: typingsJapgolly.steamUser.mod.EMsg.AMResolveNegativeWalletCreditsResponse & Double = js.native
  
  @js.native
  sealed trait AMResolveWalletReverseRevoke
    extends StObject
       with EMsg
  /* 4417 */ val AMResolveWalletReverseRevoke: typingsJapgolly.steamUser.mod.EMsg.AMResolveWalletReverseRevoke & Double = js.native
  
  @js.native
  sealed trait AMResolveWalletRevoke
    extends StObject
       with EMsg
  /* 4416 */ val AMResolveWalletRevoke: typingsJapgolly.steamUser.mod.EMsg.AMResolveWalletRevoke & Double = js.native
  
  @js.native
  sealed trait AMResubmitPurchase
    extends StObject
       with EMsg
  /* 4080 */ val AMResubmitPurchase: typingsJapgolly.steamUser.mod.EMsg.AMResubmitPurchase & Double = js.native
  
  @js.native
  sealed trait AMReverseChargeback
    extends StObject
       with EMsg
  /* 536 */ val AMReverseChargeback: typingsJapgolly.steamUser.mod.EMsg.AMReverseChargeback & Double = js.native
  
  @js.native
  sealed trait AMReverseChargebackResponse
    extends StObject
       with EMsg
  /* 537 */ val AMReverseChargebackResponse: typingsJapgolly.steamUser.mod.EMsg.AMReverseChargebackResponse & Double = js.native
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys
    extends StObject
       with EMsg
  /* 4242 */ val AMRevokeLegacyGameKeys: typingsJapgolly.steamUser.mod.EMsg.AMRevokeLegacyGameKeys & Double = js.native
  
  @js.native
  sealed trait AMRevokePurchaseResponse
    extends StObject
       with EMsg
  /* 561 */ val AMRevokePurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMRevokePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransfer
    extends StObject
       with EMsg
  /* 4326 */ val AMRollbackGiftTransfer: typingsJapgolly.steamUser.mod.EMsg.AMRollbackGiftTransfer & Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse
    extends StObject
       with EMsg
  /* 4327 */ val AMRollbackGiftTransferResponse: typingsJapgolly.steamUser.mod.EMsg.AMRollbackGiftTransferResponse & Double = js.native
  
  @js.native
  sealed trait AMRouteFriendMsg
    extends StObject
       with EMsg
  /* 4219 */ val AMRouteFriendMsg: typingsJapgolly.steamUser.mod.EMsg.AMRouteFriendMsg & Double = js.native
  
  @js.native
  sealed trait AMRouteToClients
    extends StObject
       with EMsg
  /* 4009 */ val AMRouteToClients: typingsJapgolly.steamUser.mod.EMsg.AMRouteToClients & Double = js.native
  
  @js.native
  sealed trait AMSendAccountInfoUpdate
    extends StObject
       with EMsg
  /* 4412 */ val AMSendAccountInfoUpdate: typingsJapgolly.steamUser.mod.EMsg.AMSendAccountInfoUpdate & Double = js.native
  
  @js.native
  sealed trait AMSendCartRepurchase
    extends StObject
       with EMsg
  /* 541 */ val AMSendCartRepurchase: typingsJapgolly.steamUser.mod.EMsg.AMSendCartRepurchase & Double = js.native
  
  @js.native
  sealed trait AMSendCartRepurchaseResponse
    extends StObject
       with EMsg
  /* 542 */ val AMSendCartRepurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMSendCartRepurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMSendEmail
    extends StObject
       with EMsg
  /* 4343 */ val AMSendEmail: typingsJapgolly.steamUser.mod.EMsg.AMSendEmail & Double = js.native
  
  @js.native
  sealed trait AMSendQueuedEmails
    extends StObject
       with EMsg
  /* 4152 */ val AMSendQueuedEmails: typingsJapgolly.steamUser.mod.EMsg.AMSendQueuedEmails & Double = js.native
  
  @js.native
  sealed trait AMSendScheduledGift
    extends StObject
       with EMsg
  /* 4413 */ val AMSendScheduledGift: typingsJapgolly.steamUser.mod.EMsg.AMSendScheduledGift & Double = js.native
  
  @js.native
  sealed trait AMSendSystemIMToUser
    extends StObject
       with EMsg
  /* 508 */ val AMSendSystemIMToUser: typingsJapgolly.steamUser.mod.EMsg.AMSendSystemIMToUser & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCache
    extends StObject
       with EMsg
  /* 4126 */ val AMServiceModulesCache: typingsJapgolly.steamUser.mod.EMsg.AMServiceModulesCache & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCall
    extends StObject
       with EMsg
  /* 4127 */ val AMServiceModulesCall: typingsJapgolly.steamUser.mod.EMsg.AMServiceModulesCall & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCallResponse
    extends StObject
       with EMsg
  /* 4128 */ val AMServiceModulesCallResponse: typingsJapgolly.steamUser.mod.EMsg.AMServiceModulesCallResponse & Double = js.native
  
  @js.native
  sealed trait AMSessionInfoRequest
    extends StObject
       with EMsg
  /* 4045 */ val AMSessionInfoRequest: typingsJapgolly.steamUser.mod.EMsg.AMSessionInfoRequest & Double = js.native
  
  @js.native
  sealed trait AMSessionInfoResponse
    extends StObject
       with EMsg
  /* 4046 */ val AMSessionInfoResponse: typingsJapgolly.steamUser.mod.EMsg.AMSessionInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMSessionQuery
    extends StObject
       with EMsg
  /* 4363 */ val AMSessionQuery: typingsJapgolly.steamUser.mod.EMsg.AMSessionQuery & Double = js.native
  
  @js.native
  sealed trait AMSessionQueryResponse
    extends StObject
       with EMsg
  /* 4364 */ val AMSessionQueryResponse: typingsJapgolly.steamUser.mod.EMsg.AMSessionQueryResponse & Double = js.native
  
  @js.native
  sealed trait AMSetAccountDetails
    extends StObject
       with EMsg
  /* 4064 */ val AMSetAccountDetails: typingsJapgolly.steamUser.mod.EMsg.AMSetAccountDetails & Double = js.native
  
  @js.native
  sealed trait AMSetAccountFlags
    extends StObject
       with EMsg
  /* 584 */ val AMSetAccountFlags: typingsJapgolly.steamUser.mod.EMsg.AMSetAccountFlags & Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinks
    extends StObject
       with EMsg
  /* 4071 */ val AMSetAccountLinks: typingsJapgolly.steamUser.mod.EMsg.AMSetAccountLinks & Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinksResponse
    extends StObject
       with EMsg
  /* 4072 */ val AMSetAccountLinksResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetAccountLinksResponse & Double = js.native
  
  @js.native
  sealed trait AMSetAccountTrustedRequest
    extends StObject
       with EMsg
  /* 519 */ val AMSetAccountTrustedRequest: typingsJapgolly.steamUser.mod.EMsg.AMSetAccountTrustedRequest & Double = js.native
  
  @js.native
  sealed trait AMSetAvatar
    extends StObject
       with EMsg
  /* 591 */ val AMSetAvatar: typingsJapgolly.steamUser.mod.EMsg.AMSetAvatar & Double = js.native
  
  @js.native
  sealed trait AMSetClanDetails
    extends StObject
       with EMsg
  /* 4068 */ val AMSetClanDetails: typingsJapgolly.steamUser.mod.EMsg.AMSetClanDetails & Double = js.native
  
  @js.native
  sealed trait AMSetClanName
    extends StObject
       with EMsg
  /* 4354 */ val AMSetClanName: typingsJapgolly.steamUser.mod.EMsg.AMSetClanName & Double = js.native
  
  @js.native
  sealed trait AMSetClanNameResponse
    extends StObject
       with EMsg
  /* 4355 */ val AMSetClanNameResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetClanNameResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTW
    extends StObject
       with EMsg
  /* 4056 */ val AMSetClanPOTW: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPOTW & Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTWResponse
    extends StObject
       with EMsg
  /* 4057 */ val AMSetClanPOTWResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPOTWResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBits
    extends StObject
       with EMsg
  /* 4043 */ val AMSetClanPermissionBits: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPermissionBits & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse
    extends StObject
       with EMsg
  /* 4044 */ val AMSetClanPermissionBitsResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPermissionBitsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettings
    extends StObject
       with EMsg
  /* 4021 */ val AMSetClanPermissionSettings: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPermissionSettings & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse
    extends StObject
       with EMsg
  /* 4022 */ val AMSetClanPermissionSettingsResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetClanPermissionSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanRank
    extends StObject
       with EMsg
  /* 4052 */ val AMSetClanRank: typingsJapgolly.steamUser.mod.EMsg.AMSetClanRank & Double = js.native
  
  @js.native
  sealed trait AMSetClanRankResponse
    extends StObject
       with EMsg
  /* 4053 */ val AMSetClanRankResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetClanRankResponse & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettings
    extends StObject
       with EMsg
  /* 4114 */ val AMSetCommunityProfileSettings: typingsJapgolly.steamUser.mod.EMsg.AMSetCommunityProfileSettings & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse
    extends StObject
       with EMsg
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetCommunityProfileSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityState
    extends StObject
       with EMsg
  /* 4063 */ val AMSetCommunityState: typingsJapgolly.steamUser.mod.EMsg.AMSetCommunityState & Double = js.native
  
  @js.native
  sealed trait AMSetDRMTestConfig
    extends StObject
       with EMsg
  /* 4268 */ val AMSetDRMTestConfig: typingsJapgolly.steamUser.mod.EMsg.AMSetDRMTestConfig & Double = js.native
  
  @js.native
  sealed trait AMSetFriendRelationshipNone
    extends StObject
       with EMsg
  /* 4123 */ val AMSetFriendRelationshipNone: typingsJapgolly.steamUser.mod.EMsg.AMSetFriendRelationshipNone & Double = js.native
  
  @js.native
  sealed trait AMSetIgnored
    extends StObject
       with EMsg
  /* 4096 */ val AMSetIgnored: typingsJapgolly.steamUser.mod.EMsg.AMSetIgnored & Double = js.native
  
  @js.native
  sealed trait AMSetIgnoredResponse
    extends StObject
       with EMsg
  /* 4122 */ val AMSetIgnoredResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetIgnoredResponse & Double = js.native
  
  @js.native
  sealed trait AMSetLicenseFlags
    extends StObject
       with EMsg
  /* 4153 */ val AMSetLicenseFlags: typingsJapgolly.steamUser.mod.EMsg.AMSetLicenseFlags & Double = js.native
  
  @js.native
  sealed trait AMSetPartnerMember
    extends StObject
       with EMsg
  /* 4280 */ val AMSetPartnerMember: typingsJapgolly.steamUser.mod.EMsg.AMSetPartnerMember & Double = js.native
  
  @js.native
  sealed trait AMSetPersonaName
    extends StObject
       with EMsg
  /* 590 */ val AMSetPersonaName: typingsJapgolly.steamUser.mod.EMsg.AMSetPersonaName & Double = js.native
  
  @js.native
  sealed trait AMSetPreApproval
    extends StObject
       with EMsg
  /* 4255 */ val AMSetPreApproval: typingsJapgolly.steamUser.mod.EMsg.AMSetPreApproval & Double = js.native
  
  @js.native
  sealed trait AMSetPreApprovalResponse
    extends StObject
       with EMsg
  /* 4256 */ val AMSetPreApprovalResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetPreApprovalResponse & Double = js.native
  
  @js.native
  sealed trait AMSetProfileURL
    extends StObject
       with EMsg
  /* 4005 */ val AMSetProfileURL: typingsJapgolly.steamUser.mod.EMsg.AMSetProfileURL & Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnowned
    extends StObject
       with EMsg
  /* 4350 */ val AMSetUserGiftUnowned: typingsJapgolly.steamUser.mod.EMsg.AMSetUserGiftUnowned & Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse
    extends StObject
       with EMsg
  /* 4351 */ val AMSetUserGiftUnownedResponse: typingsJapgolly.steamUser.mod.EMsg.AMSetUserGiftUnownedResponse & Double = js.native
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions
    extends StObject
       with EMsg
  /* 4149 */ val AMSetUserNewsSubscriptions: typingsJapgolly.steamUser.mod.EMsg.AMSetUserNewsSubscriptions & Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPayment
    extends StObject
       with EMsg
  /* 4404 */ val AMSmart2PayPayment: typingsJapgolly.steamUser.mod.EMsg.AMSmart2PayPayment & Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse
    extends StObject
       with EMsg
  /* 4405 */ val AMSmart2PayPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMSmart2PayPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMStoreCancelPurchase
    extends StObject
       with EMsg
  /* 4181 */ val AMStoreCancelPurchase: typingsJapgolly.steamUser.mod.EMsg.AMStoreCancelPurchase & Double = js.native
  
  @js.native
  sealed trait AMStoreCompletePurchase
    extends StObject
       with EMsg
  /* 4180 */ val AMStoreCompletePurchase: typingsJapgolly.steamUser.mod.EMsg.AMStoreCompletePurchase & Double = js.native
  
  @js.native
  sealed trait AMStoreGetFinalPrice
    extends StObject
       with EMsg
  /* 4178 */ val AMStoreGetFinalPrice: typingsJapgolly.steamUser.mod.EMsg.AMStoreGetFinalPrice & Double = js.native
  
  @js.native
  sealed trait AMStoreGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 4179 */ val AMStoreGetFinalPriceResponse: typingsJapgolly.steamUser.mod.EMsg.AMStoreGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait AMStoreInitPurchase
    extends StObject
       with EMsg
  /* 4176 */ val AMStoreInitPurchase: typingsJapgolly.steamUser.mod.EMsg.AMStoreInitPurchase & Double = js.native
  
  @js.native
  sealed trait AMStoreInitPurchaseResponse
    extends StObject
       with EMsg
  /* 4177 */ val AMStoreInitPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMStoreInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMStorePurchaseResponse
    extends StObject
       with EMsg
  /* 4182 */ val AMStorePurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.AMStorePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMStoreUserStats
    extends StObject
       with EMsg
  /* 4236 */ val AMStoreUserStats: typingsJapgolly.steamUser.mod.EMsg.AMStoreUserStats & Double = js.native
  
  @js.native
  sealed trait AMStoreUserStatsResponse
    extends StObject
       with EMsg
  /* 4312 */ val AMStoreUserStatsResponse: typingsJapgolly.steamUser.mod.EMsg.AMStoreUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait AMSubscribeToPersonaFeed
    extends StObject
       with EMsg
  /* 4291 */ val AMSubscribeToPersonaFeed: typingsJapgolly.steamUser.mod.EMsg.AMSubscribeToPersonaFeed & Double = js.native
  
  @js.native
  sealed trait AMSupportChangeEmail
    extends StObject
       with EMsg
  /* 4195 */ val AMSupportChangeEmail: typingsJapgolly.steamUser.mod.EMsg.AMSupportChangeEmail & Double = js.native
  
  @js.native
  sealed trait AMSupportChangePassword
    extends StObject
       with EMsg
  /* 4194 */ val AMSupportChangePassword: typingsJapgolly.steamUser.mod.EMsg.AMSupportChangePassword & Double = js.native
  
  @js.native
  sealed trait AMSupportChangeSecretQA
    extends StObject
       with EMsg
  /* 4196 */ val AMSupportChangeSecretQA: typingsJapgolly.steamUser.mod.EMsg.AMSupportChangeSecretQA & Double = js.native
  
  @js.native
  sealed trait AMSupportEnableOrDisable
    extends StObject
       with EMsg
  /* 4199 */ val AMSupportEnableOrDisable: typingsJapgolly.steamUser.mod.EMsg.AMSupportEnableOrDisable & Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabled
    extends StObject
       with EMsg
  /* 4209 */ val AMSupportIsAccountEnabled: typingsJapgolly.steamUser.mod.EMsg.AMSupportIsAccountEnabled & Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse
    extends StObject
       with EMsg
  /* 4210 */ val AMSupportIsAccountEnabledResponse: typingsJapgolly.steamUser.mod.EMsg.AMSupportIsAccountEnabledResponse & Double = js.native
  
  @js.native
  sealed trait AMSupportKickSession
    extends StObject
       with EMsg
  /* 4212 */ val AMSupportKickSession: typingsJapgolly.steamUser.mod.EMsg.AMSupportKickSession & Double = js.native
  
  @js.native
  sealed trait AMSupportRemoveAccountSecurity
    extends StObject
       with EMsg
  /* 4307 */ val AMSupportRemoveAccountSecurity: typingsJapgolly.steamUser.mod.EMsg.AMSupportRemoveAccountSecurity & Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDeposit
    extends StObject
       with EMsg
  /* 4348 */ val AMSwapKioskDeposit: typingsJapgolly.steamUser.mod.EMsg.AMSwapKioskDeposit & Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDepositResponse
    extends StObject
       with EMsg
  /* 4349 */ val AMSwapKioskDepositResponse: typingsJapgolly.steamUser.mod.EMsg.AMSwapKioskDepositResponse & Double = js.native
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse
    extends StObject
       with EMsg
  /* 4220 */ val AMTicketAuthRequestOrResponse: typingsJapgolly.steamUser.mod.EMsg.AMTicketAuthRequestOrResponse & Double = js.native
  
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey
    extends StObject
       with EMsg
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: typingsJapgolly.steamUser.mod.EMsg.AMToMDSGetDepotDecryptionKey & Double = js.native
  
  @js.native
  sealed trait AMTrackFailedAuthByIP
    extends StObject
       with EMsg
  /* 4133 */ val AMTrackFailedAuthByIP: typingsJapgolly.steamUser.mod.EMsg.AMTrackFailedAuthByIP & Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGifts
    extends StObject
       with EMsg
  /* 4320 */ val AMTransferLockedGifts: typingsJapgolly.steamUser.mod.EMsg.AMTransferLockedGifts & Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse
    extends StObject
       with EMsg
  /* 4321 */ val AMTransferLockedGiftsResponse: typingsJapgolly.steamUser.mod.EMsg.AMTransferLockedGiftsResponse & Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest
    extends StObject
       with EMsg
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: typingsJapgolly.steamUser.mod.EMsg.AMTwoFactorRecoverAuthenticatorRequest & Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse
    extends StObject
       with EMsg
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: typingsJapgolly.steamUser.mod.EMsg.AMTwoFactorRecoverAuthenticatorResponse & Double = js.native
  
  @js.native
  sealed trait AMUnBanFromChat
    extends StObject
       with EMsg
  /* 4067 */ val AMUnBanFromChat: typingsJapgolly.steamUser.mod.EMsg.AMUnBanFromChat & Double = js.native
  
  @js.native
  sealed trait AMUpdateBillingAddress
    extends StObject
       with EMsg
  /* 4186 */ val AMUpdateBillingAddress: typingsJapgolly.steamUser.mod.EMsg.AMUpdateBillingAddress & Double = js.native
  
  @js.native
  sealed trait AMUpdateBillingAddressResponse
    extends StObject
       with EMsg
  /* 4187 */ val AMUpdateBillingAddressResponse: typingsJapgolly.steamUser.mod.EMsg.AMUpdateBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateChatMetadata
    extends StObject
       with EMsg
  /* 4003 */ val AMUpdateChatMetadata: typingsJapgolly.steamUser.mod.EMsg.AMUpdateChatMetadata & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanAnnouncement
    extends StObject
       with EMsg
  /* 4029 */ val AMUpdateClanAnnouncement: typingsJapgolly.steamUser.mod.EMsg.AMUpdateClanAnnouncement & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4030 */ val AMUpdateClanAnnouncementResponse: typingsJapgolly.steamUser.mod.EMsg.AMUpdateClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEvent
    extends StObject
       with EMsg
  /* 4015 */ val AMUpdateClanEvent: typingsJapgolly.steamUser.mod.EMsg.AMUpdateClanEvent & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEventDummyForRateLimiting
    extends StObject
       with EMsg
  /* 4015 */ val AMUpdateClanEventDummyForRateLimiting: typingsJapgolly.steamUser.mod.EMsg.AMUpdateClanEventDummyForRateLimiting & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEventResponse
    extends StObject
       with EMsg
  /* 4016 */ val AMUpdateClanEventResponse: typingsJapgolly.steamUser.mod.EMsg.AMUpdateClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateGSPlayStats
    extends StObject
       with EMsg
  /* 4198 */ val AMUpdateGSPlayStats: typingsJapgolly.steamUser.mod.EMsg.AMUpdateGSPlayStats & Double = js.native
  
  @js.native
  sealed trait AMUpdatePersonaStateCache
    extends StObject
       with EMsg
  /* 4275 */ val AMUpdatePersonaStateCache: typingsJapgolly.steamUser.mod.EMsg.AMUpdatePersonaStateCache & Double = js.native
  
  @js.native
  sealed trait AMUpdateProviderStatus
    extends StObject
       with EMsg
  /* 4305 */ val AMUpdateProviderStatus: typingsJapgolly.steamUser.mod.EMsg.AMUpdateProviderStatus & Double = js.native
  
  @js.native
  sealed trait AMUpdateUserBanRequest
    extends StObject
       with EMsg
  /* 504 */ val AMUpdateUserBanRequest: typingsJapgolly.steamUser.mod.EMsg.AMUpdateUserBanRequest & Double = js.native
  
  @js.native
  sealed trait AMUserClanList
    extends StObject
       with EMsg
  /* 4110 */ val AMUserClanList: typingsJapgolly.steamUser.mod.EMsg.AMUserClanList & Double = js.native
  
  @js.native
  sealed trait AMUserClanListResponse
    extends StObject
       with EMsg
  /* 4111 */ val AMUserClanListResponse: typingsJapgolly.steamUser.mod.EMsg.AMUserClanListResponse & Double = js.native
  
  @js.native
  sealed trait AMVACStatusUpdate
    extends StObject
       with EMsg
  /* 4286 */ val AMVACStatusUpdate: typingsJapgolly.steamUser.mod.EMsg.AMVACStatusUpdate & Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP
    extends StObject
       with EMsg
  /* 4131 */ val AMValidateCaptchaDataForIP: typingsJapgolly.steamUser.mod.EMsg.AMValidateCaptchaDataForIP & Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse
    extends StObject
       with EMsg
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: typingsJapgolly.steamUser.mod.EMsg.AMValidateCaptchaDataForIPResponse & Double = js.native
  
  @js.native
  sealed trait AMValidateEmailLink
    extends StObject
       with EMsg
  /* 4231 */ val AMValidateEmailLink: typingsJapgolly.steamUser.mod.EMsg.AMValidateEmailLink & Double = js.native
  
  @js.native
  sealed trait AMValidateEmailLinkResponse
    extends StObject
       with EMsg
  /* 4232 */ val AMValidateEmailLinkResponse: typingsJapgolly.steamUser.mod.EMsg.AMValidateEmailLinkResponse & Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest
    extends StObject
       with EMsg
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: typingsJapgolly.steamUser.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsRequest & Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse
    extends StObject
       with EMsg
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: typingsJapgolly.steamUser.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsResponse & Double = js.native
  
  @js.native
  sealed trait AMValidateWGToken
    extends StObject
       with EMsg
  /* 4047 */ val AMValidateWGToken: typingsJapgolly.steamUser.mod.EMsg.AMValidateWGToken & Double = js.native
  
  @js.native
  sealed trait AMValidateWGTokenResponse
    extends StObject
       with EMsg
  /* 4062 */ val AMValidateWGTokenResponse: typingsJapgolly.steamUser.mod.EMsg.AMValidateWGTokenResponse & Double = js.native
  
  @js.native
  sealed trait AMVerfiyUser
    extends StObject
       with EMsg
  /* 552 */ val AMVerfiyUser: typingsJapgolly.steamUser.mod.EMsg.AMVerfiyUser & Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRights
    extends StObject
       with EMsg
  /* 4222 */ val AMVerifyDepotManagementRights: typingsJapgolly.steamUser.mod.EMsg.AMVerifyDepotManagementRights & Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse
    extends StObject
       with EMsg
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: typingsJapgolly.steamUser.mod.EMsg.AMVerifyDepotManagementRightsResponse & Double = js.native
  
  @js.native
  sealed trait AMWipeFriendsList
    extends StObject
       with EMsg
  /* 4095 */ val AMWipeFriendsList: typingsJapgolly.steamUser.mod.EMsg.AMWipeFriendsList & Double = js.native
  
  @js.native
  sealed trait AMWriteNews
    extends StObject
       with EMsg
  /* 4142 */ val AMWriteNews: typingsJapgolly.steamUser.mod.EMsg.AMWriteNews & Double = js.native
  
  @js.native
  sealed trait AMXsollaPayment
    extends StObject
       with EMsg
  /* 4344 */ val AMXsollaPayment: typingsJapgolly.steamUser.mod.EMsg.AMXsollaPayment & Double = js.native
  
  @js.native
  sealed trait AMXsollaPaymentResponse
    extends StObject
       with EMsg
  /* 4345 */ val AMXsollaPaymentResponse: typingsJapgolly.steamUser.mod.EMsg.AMXsollaPaymentResponse & Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestResponse
    extends StObject
       with EMsg
  /* 1519 */ val ATSCSPerfTestResponse: typingsJapgolly.steamUser.mod.EMsg.ATSCSPerfTestResponse & Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestTask
    extends StObject
       with EMsg
  /* 1518 */ val ATSCSPerfTestTask: typingsJapgolly.steamUser.mod.EMsg.ATSCSPerfTestTask & Double = js.native
  
  @js.native
  sealed trait ATSCallTest
    extends StObject
       with EMsg
  /* 1508 */ val ATSCallTest: typingsJapgolly.steamUser.mod.EMsg.ATSCallTest & Double = js.native
  
  @js.native
  sealed trait ATSCallTestReply
    extends StObject
       with EMsg
  /* 1509 */ val ATSCallTestReply: typingsJapgolly.steamUser.mod.EMsg.ATSCallTestReply & Double = js.native
  
  @js.native
  sealed trait ATSCycleTCM
    extends StObject
       with EMsg
  /* 1506 */ val ATSCycleTCM: typingsJapgolly.steamUser.mod.EMsg.ATSCycleTCM & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressActionResult
    extends StObject
       with EMsg
  /* 1516 */ val ATSExternalStressActionResult: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressActionResult & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobQueued
    extends StObject
       with EMsg
  /* 1512 */ val ATSExternalStressJobQueued: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressJobQueued & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobRunning
    extends StObject
       with EMsg
  /* 1513 */ val ATSExternalStressJobRunning: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressJobRunning & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStart
    extends StObject
       with EMsg
  /* 1511 */ val ATSExternalStressJobStart: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressJobStart & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopAll
    extends StObject
       with EMsg
  /* 1515 */ val ATSExternalStressJobStopAll: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressJobStopAll & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopped
    extends StObject
       with EMsg
  /* 1514 */ val ATSExternalStressJobStopped: typingsJapgolly.steamUser.mod.EMsg.ATSExternalStressJobStopped & Double = js.native
  
  @js.native
  sealed trait ATSInitDRMSStressTest
    extends StObject
       with EMsg
  /* 1507 */ val ATSInitDRMSStressTest: typingsJapgolly.steamUser.mod.EMsg.ATSInitDRMSStressTest & Double = js.native
  
  @js.native
  sealed trait ATSRunFailServerTest
    extends StObject
       with EMsg
  /* 1503 */ val ATSRunFailServerTest: typingsJapgolly.steamUser.mod.EMsg.ATSRunFailServerTest & Double = js.native
  
  @js.native
  sealed trait ATSStartExternalStress
    extends StObject
       with EMsg
  /* 1510 */ val ATSStartExternalStress: typingsJapgolly.steamUser.mod.EMsg.ATSStartExternalStress & Double = js.native
  
  @js.native
  sealed trait ATSStartStressTest
    extends StObject
       with EMsg
  /* 1501 */ val ATSStartStressTest: typingsJapgolly.steamUser.mod.EMsg.ATSStartStressTest & Double = js.native
  
  @js.native
  sealed trait ATSStarted
    extends StObject
       with EMsg
  /* 1517 */ val ATSStarted: typingsJapgolly.steamUser.mod.EMsg.ATSStarted & Double = js.native
  
  @js.native
  sealed trait ATSStopStressTest
    extends StObject
       with EMsg
  /* 1502 */ val ATSStopStressTest: typingsJapgolly.steamUser.mod.EMsg.ATSStopStressTest & Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestResponse
    extends StObject
       with EMsg
  /* 1505 */ val ATSUFSPerfTestResponse: typingsJapgolly.steamUser.mod.EMsg.ATSUFSPerfTestResponse & Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestTask
    extends StObject
       with EMsg
  /* 1504 */ val ATSUFSPerfTestTask: typingsJapgolly.steamUser.mod.EMsg.ATSUFSPerfTestTask & Double = js.native
  
  @js.native
  sealed trait AdminCmd
    extends StObject
       with EMsg
  /* 1000 */ val AdminCmd: typingsJapgolly.steamUser.mod.EMsg.AdminCmd & Double = js.native
  
  @js.native
  sealed trait AdminCmdResponse
    extends StObject
       with EMsg
  /* 1004 */ val AdminCmdResponse: typingsJapgolly.steamUser.mod.EMsg.AdminCmdResponse & Double = js.native
  
  @js.native
  sealed trait AdminConsoleTitle
    extends StObject
       with EMsg
  /* 1020 */ val AdminConsoleTitle: typingsJapgolly.steamUser.mod.EMsg.AdminConsoleTitle & Double = js.native
  
  @js.native
  sealed trait AdminGCCommand
    extends StObject
       with EMsg
  /* 1024 */ val AdminGCCommand: typingsJapgolly.steamUser.mod.EMsg.AdminGCCommand & Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandList
    extends StObject
       with EMsg
  /* 1025 */ val AdminGCGetCommandList: typingsJapgolly.steamUser.mod.EMsg.AdminGCGetCommandList & Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandListResponse
    extends StObject
       with EMsg
  /* 1026 */ val AdminGCGetCommandListResponse: typingsJapgolly.steamUser.mod.EMsg.AdminGCGetCommandListResponse & Double = js.native
  
  @js.native
  sealed trait AdminGCSpew
    extends StObject
       with EMsg
  /* 1023 */ val AdminGCSpew: typingsJapgolly.steamUser.mod.EMsg.AdminGCSpew & Double = js.native
  
  @js.native
  sealed trait AdminLogEvent
    extends StObject
       with EMsg
  /* 1006 */ val AdminLogEvent: typingsJapgolly.steamUser.mod.EMsg.AdminLogEvent & Double = js.native
  
  @js.native
  sealed trait AdminLogListenRequest
    extends StObject
       with EMsg
  /* 1005 */ val AdminLogListenRequest: typingsJapgolly.steamUser.mod.EMsg.AdminLogListenRequest & Double = js.native
  
  @js.native
  sealed trait AdminMsgSpew
    extends StObject
       with EMsg
  /* 1028 */ val AdminMsgSpew: typingsJapgolly.steamUser.mod.EMsg.AdminMsgSpew & Double = js.native
  
  @js.native
  sealed trait AdminPwLogon
    extends StObject
       with EMsg
  /* 1017 */ val AdminPwLogon: typingsJapgolly.steamUser.mod.EMsg.AdminPwLogon & Double = js.native
  
  @js.native
  sealed trait AdminPwLogonResponse
    extends StObject
       with EMsg
  /* 1018 */ val AdminPwLogonResponse: typingsJapgolly.steamUser.mod.EMsg.AdminPwLogonResponse & Double = js.native
  
  @js.native
  sealed trait AdminSpew
    extends StObject
       with EMsg
  /* 1019 */ val AdminSpew: typingsJapgolly.steamUser.mod.EMsg.AdminSpew & Double = js.native
  
  @js.native
  sealed trait Alert
    extends StObject
       with EMsg
  /* 115 */ val Alert: typingsJapgolly.steamUser.mod.EMsg.Alert & Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayQuery
    extends StObject
       with EMsg
  /* 550 */ val AllowUserToPlayQuery: typingsJapgolly.steamUser.mod.EMsg.AllowUserToPlayQuery & Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayResponse
    extends StObject
       with EMsg
  /* 551 */ val AllowUserToPlayResponse: typingsJapgolly.steamUser.mod.EMsg.AllowUserToPlayResponse & Double = js.native
  
  @js.native
  sealed trait AssignSysID
    extends StObject
       with EMsg
  /* 200 */ val AssignSysID: typingsJapgolly.steamUser.mod.EMsg.AssignSysID & Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodes
    extends StObject
       with EMsg
  /* 3619 */ val BRPCheckActivationCodes: typingsJapgolly.steamUser.mod.EMsg.BRPCheckActivationCodes & Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse
    extends StObject
       with EMsg
  /* 3620 */ val BRPCheckActivationCodesResponse: typingsJapgolly.steamUser.mod.EMsg.BRPCheckActivationCodesResponse & Double = js.native
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate
    extends StObject
       with EMsg
  /* 3610 */ val BRPCheckFinanceCloseOutDate: typingsJapgolly.steamUser.mod.EMsg.BRPCheckFinanceCloseOutDate & Double = js.native
  
  @js.native
  sealed trait BRPCheckSettlementReports
    extends StObject
       with EMsg
  /* 3626 */ val BRPCheckSettlementReports: typingsJapgolly.steamUser.mod.EMsg.BRPCheckSettlementReports & Double = js.native
  
  @js.native
  sealed trait BRPCommitGC
    extends StObject
       with EMsg
  /* 3607 */ val BRPCommitGC: typingsJapgolly.steamUser.mod.EMsg.BRPCommitGC & Double = js.native
  
  @js.native
  sealed trait BRPCommitGCResponse
    extends StObject
       with EMsg
  /* 3608 */ val BRPCommitGCResponse: typingsJapgolly.steamUser.mod.EMsg.BRPCommitGCResponse & Double = js.native
  
  @js.native
  sealed trait BRPCommitWP
    extends StObject
       with EMsg
  /* 3621 */ val BRPCommitWP: typingsJapgolly.steamUser.mod.EMsg.BRPCommitWP & Double = js.native
  
  @js.native
  sealed trait BRPCommitWPResponse
    extends StObject
       with EMsg
  /* 3622 */ val BRPCommitWPResponse: typingsJapgolly.steamUser.mod.EMsg.BRPCommitWPResponse & Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeys
    extends StObject
       with EMsg
  /* 3615 */ val BRPConvertToCurrentKeys: typingsJapgolly.steamUser.mod.EMsg.BRPConvertToCurrentKeys & Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse
    extends StObject
       with EMsg
  /* 3616 */ val BRPConvertToCurrentKeysResponse: typingsJapgolly.steamUser.mod.EMsg.BRPConvertToCurrentKeysResponse & Double = js.native
  
  @js.native
  sealed trait BRPFindHungTransactions
    extends StObject
       with EMsg
  /* 3609 */ val BRPFindHungTransactions: typingsJapgolly.steamUser.mod.EMsg.BRPFindHungTransactions & Double = js.native
  
  @js.native
  sealed trait BRPPostTaxToAvalara
    extends StObject
       with EMsg
  /* 3628 */ val BRPPostTaxToAvalara: typingsJapgolly.steamUser.mod.EMsg.BRPPostTaxToAvalara & Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTax
    extends StObject
       with EMsg
  /* 3629 */ val BRPPostTransactionTax: typingsJapgolly.steamUser.mod.EMsg.BRPPostTransactionTax & Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse
    extends StObject
       with EMsg
  /* 3630 */ val BRPPostTransactionTaxResponse: typingsJapgolly.steamUser.mod.EMsg.BRPPostTransactionTaxResponse & Double = js.native
  
  @js.native
  sealed trait BRPProcessGCReports
    extends StObject
       with EMsg
  /* 3603 */ val BRPProcessGCReports: typingsJapgolly.steamUser.mod.EMsg.BRPProcessGCReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessIMReports
    extends StObject
       with EMsg
  /* 3631 */ val BRPProcessIMReports: typingsJapgolly.steamUser.mod.EMsg.BRPProcessIMReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessLicenses
    extends StObject
       with EMsg
  /* 3611 */ val BRPProcessLicenses: typingsJapgolly.steamUser.mod.EMsg.BRPProcessLicenses & Double = js.native
  
  @js.native
  sealed trait BRPProcessLicensesResponse
    extends StObject
       with EMsg
  /* 3612 */ val BRPProcessLicensesResponse: typingsJapgolly.steamUser.mod.EMsg.BRPProcessLicensesResponse & Double = js.native
  
  @js.native
  sealed trait BRPProcessPPReports
    extends StObject
       with EMsg
  /* 3604 */ val BRPProcessPPReports: typingsJapgolly.steamUser.mod.EMsg.BRPProcessPPReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessPartnerPayments
    extends StObject
       with EMsg
  /* 3625 */ val BRPProcessPartnerPayments: typingsJapgolly.steamUser.mod.EMsg.BRPProcessPartnerPayments & Double = js.native
  
  @js.native
  sealed trait BRPProcessPaymentRules
    extends StObject
       with EMsg
  /* 3624 */ val BRPProcessPaymentRules: typingsJapgolly.steamUser.mod.EMsg.BRPProcessPaymentRules & Double = js.native
  
  @js.native
  sealed trait BRPProcessUSBankReports
    extends StObject
       with EMsg
  /* 3602 */ val BRPProcessUSBankReports: typingsJapgolly.steamUser.mod.EMsg.BRPProcessUSBankReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessWPReports
    extends StObject
       with EMsg
  /* 3623 */ val BRPProcessWPReports: typingsJapgolly.steamUser.mod.EMsg.BRPProcessWPReports & Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStats
    extends StObject
       with EMsg
  /* 3617 */ val BRPPruneCardUsageStats: typingsJapgolly.steamUser.mod.EMsg.BRPPruneCardUsageStats & Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse
    extends StObject
       with EMsg
  /* 3618 */ val BRPPruneCardUsageStatsResponse: typingsJapgolly.steamUser.mod.EMsg.BRPPruneCardUsageStatsResponse & Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData
    extends StObject
       with EMsg
  /* 3613 */ val BRPRemoveExpiredPaymentData: typingsJapgolly.steamUser.mod.EMsg.BRPRemoveExpiredPaymentData & Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse
    extends StObject
       with EMsg
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: typingsJapgolly.steamUser.mod.EMsg.BRPRemoveExpiredPaymentDataResponse & Double = js.native
  
  @js.native
  sealed trait BRPSettleCB
    extends StObject
       with EMsg
  /* 3606 */ val BRPSettleCB: typingsJapgolly.steamUser.mod.EMsg.BRPSettleCB & Double = js.native
  
  @js.native
  sealed trait BRPSettleNOVA
    extends StObject
       with EMsg
  /* 3605 */ val BRPSettleNOVA: typingsJapgolly.steamUser.mod.EMsg.BRPSettleNOVA & Double = js.native
  
  @js.native
  sealed trait BRPStartShippingJobs
    extends StObject
       with EMsg
  /* 3601 */ val BRPStartShippingJobs: typingsJapgolly.steamUser.mod.EMsg.BRPStartShippingJobs & Double = js.native
  
  @js.native
  sealed trait BSAuthenticateCCTrans
    extends StObject
       with EMsg
  /* 1403 */ val BSAuthenticateCCTrans: typingsJapgolly.steamUser.mod.EMsg.BSAuthenticateCCTrans & Double = js.native
  
  @js.native
  sealed trait BSAuthenticateCCTransResponse
    extends StObject
       with EMsg
  /* 1404 */ val BSAuthenticateCCTransResponse: typingsJapgolly.steamUser.mod.EMsg.BSAuthenticateCCTransResponse & Double = js.native
  
  @js.native
  sealed trait BSBannedRequest
    extends StObject
       with EMsg
  /* 1407 */ val BSBannedRequest: typingsJapgolly.steamUser.mod.EMsg.BSBannedRequest & Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery
    extends StObject
       with EMsg
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: typingsJapgolly.steamUser.mod.EMsg.BSBoaCompraConfirmProductDelivery & Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse
    extends StObject
       with EMsg
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: typingsJapgolly.steamUser.mod.EMsg.BSBoaCompraConfirmProductDeliveryResponse & Double = js.native
  
  @js.native
  sealed trait BSChaseRFRRequest
    extends StObject
       with EMsg
  /* 1416 */ val BSChaseRFRRequest: typingsJapgolly.steamUser.mod.EMsg.BSChaseRFRRequest & Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunning
    extends StObject
       with EMsg
  /* 1456 */ val BSCheckJobRunning: typingsJapgolly.steamUser.mod.EMsg.BSCheckJobRunning & Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunningResponse
    extends StObject
       with EMsg
  /* 1457 */ val BSCheckJobRunningResponse: typingsJapgolly.steamUser.mod.EMsg.BSCheckJobRunningResponse & Double = js.native
  
  @js.native
  sealed trait BSCommitAdyenTxn
    extends StObject
       with EMsg
  /* 1499 */ val BSCommitAdyenTxn: typingsJapgolly.steamUser.mod.EMsg.BSCommitAdyenTxn & Double = js.native
  
  @js.native
  sealed trait BSCommitGCTxn
    extends StObject
       with EMsg
  /* 1425 */ val BSCommitGCTxn: typingsJapgolly.steamUser.mod.EMsg.BSCommitGCTxn & Double = js.native
  
  @js.native
  sealed trait BSCommitWPTxn
    extends StObject
       with EMsg
  /* 1498 */ val BSCommitWPTxn: typingsJapgolly.steamUser.mod.EMsg.BSCommitWPTxn & Double = js.native
  
  @js.native
  sealed trait BSCompletePurchase
    extends StObject
       with EMsg
  /* 1474 */ val BSCompletePurchase: typingsJapgolly.steamUser.mod.EMsg.BSCompletePurchase & Double = js.native
  
  @js.native
  sealed trait BSCompletePurchaseResponse
    extends StObject
       with EMsg
  /* 1475 */ val BSCompletePurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.BSCompletePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeys
    extends StObject
       with EMsg
  /* 1470 */ val BSConvertToCurrentKeys: typingsJapgolly.steamUser.mod.EMsg.BSConvertToCurrentKeys & Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse
    extends StObject
       with EMsg
  /* 1471 */ val BSConvertToCurrentKeysResponse: typingsJapgolly.steamUser.mod.EMsg.BSConvertToCurrentKeysResponse & Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5
    extends StObject
       with EMsg
  /* 1496 */ val BSGenerateBoaCompraMD5: typingsJapgolly.steamUser.mod.EMsg.BSGenerateBoaCompraMD5 & Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response
    extends StObject
       with EMsg
  /* 1497 */ val BSGenerateBoaCompraMD5Response: typingsJapgolly.steamUser.mod.EMsg.BSGenerateBoaCompraMD5Response & Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5
    extends StObject
       with EMsg
  /* 1492 */ val BSGenerateMoPayMD5: typingsJapgolly.steamUser.mod.EMsg.BSGenerateMoPayMD5 & Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response
    extends StObject
       with EMsg
  /* 1493 */ val BSGenerateMoPayMD5Response: typingsJapgolly.steamUser.mod.EMsg.BSGenerateMoPayMD5Response & Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddress
    extends StObject
       with EMsg
  /* 1462 */ val BSGetBillingAddress: typingsJapgolly.steamUser.mod.EMsg.BSGetBillingAddress & Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddressResponse
    extends StObject
       with EMsg
  /* 1463 */ val BSGetBillingAddressResponse: typingsJapgolly.steamUser.mod.EMsg.BSGetBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfo
    extends StObject
       with EMsg
  /* 1464 */ val BSGetCreditCardInfo: typingsJapgolly.steamUser.mod.EMsg.BSGetCreditCardInfo & Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse
    extends StObject
       with EMsg
  /* 1465 */ val BSGetCreditCardInfoResponse: typingsJapgolly.steamUser.mod.EMsg.BSGetCreditCardInfoResponse & Double = js.native
  
  @js.native
  sealed trait BSGetEvents
    extends StObject
       with EMsg
  /* 1415 */ val BSGetEvents: typingsJapgolly.steamUser.mod.EMsg.BSGetEvents & Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfo
    extends StObject
       with EMsg
  /* 1410 */ val BSGetPayPalUserInfo: typingsJapgolly.steamUser.mod.EMsg.BSGetPayPalUserInfo & Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse
    extends StObject
       with EMsg
  /* 1411 */ val BSGetPayPalUserInfoResponse: typingsJapgolly.steamUser.mod.EMsg.BSGetPayPalUserInfoResponse & Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatus
    extends StObject
       with EMsg
  /* 1454 */ val BSGetProPackOrderStatus: typingsJapgolly.steamUser.mod.EMsg.BSGetProPackOrderStatus & Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse
    extends StObject
       with EMsg
  /* 1455 */ val BSGetProPackOrderStatusResponse: typingsJapgolly.steamUser.mod.EMsg.BSGetProPackOrderStatusResponse & Double = js.native
  
  @js.native
  sealed trait BSInitGCBankXferTxn
    extends StObject
       with EMsg
  /* 1421 */ val BSInitGCBankXferTxn: typingsJapgolly.steamUser.mod.EMsg.BSInitGCBankXferTxn & Double = js.native
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse
    extends StObject
       with EMsg
  /* 1422 */ val BSInitGCBankXferTxnResponse: typingsJapgolly.steamUser.mod.EMsg.BSInitGCBankXferTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSInitPayPalTxn
    extends StObject
       with EMsg
  /* 1408 */ val BSInitPayPalTxn: typingsJapgolly.steamUser.mod.EMsg.BSInitPayPalTxn & Double = js.native
  
  @js.native
  sealed trait BSInitPayPalTxnResponse
    extends StObject
       with EMsg
  /* 1409 */ val BSInitPayPalTxnResponse: typingsJapgolly.steamUser.mod.EMsg.BSInitPayPalTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSInitPurchase
    extends StObject
       with EMsg
  /* 1472 */ val BSInitPurchase: typingsJapgolly.steamUser.mod.EMsg.BSInitPurchase & Double = js.native
  
  @js.native
  sealed trait BSInitPurchaseResponse
    extends StObject
       with EMsg
  /* 1473 */ val BSInitPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.BSInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery
    extends StObject
       with EMsg
  /* 1490 */ val BSMoPayConfirmProductDelivery: typingsJapgolly.steamUser.mod.EMsg.BSMoPayConfirmProductDelivery & Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse
    extends StObject
       with EMsg
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: typingsJapgolly.steamUser.mod.EMsg.BSMoPayConfirmProductDeliveryResponse & Double = js.native
  
  @js.native
  sealed trait BSPaymentInstrBan
    extends StObject
       with EMsg
  /* 1417 */ val BSPaymentInstrBan: typingsJapgolly.steamUser.mod.EMsg.BSPaymentInstrBan & Double = js.native
  
  @js.native
  sealed trait BSPaymentInstrBanResponse
    extends StObject
       with EMsg
  /* 1418 */ val BSPaymentInstrBanResponse: typingsJapgolly.steamUser.mod.EMsg.BSPaymentInstrBanResponse & Double = js.native
  
  @js.native
  sealed trait BSProcessGCReports
    extends StObject
       with EMsg
  /* 1419 */ val BSProcessGCReports: typingsJapgolly.steamUser.mod.EMsg.BSProcessGCReports & Double = js.native
  
  @js.native
  sealed trait BSProcessPPReports
    extends StObject
       with EMsg
  /* 1420 */ val BSProcessPPReports: typingsJapgolly.steamUser.mod.EMsg.BSProcessPPReports & Double = js.native
  
  @js.native
  sealed trait BSProcessUSBankReports
    extends StObject
       with EMsg
  /* 1436 */ val BSProcessUSBankReports: typingsJapgolly.steamUser.mod.EMsg.BSProcessUSBankReports & Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStats
    extends StObject
       with EMsg
  /* 1476 */ val BSPruneCardUsageStats: typingsJapgolly.steamUser.mod.EMsg.BSPruneCardUsageStats & Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse
    extends StObject
       with EMsg
  /* 1477 */ val BSPruneCardUsageStatsResponse: typingsJapgolly.steamUser.mod.EMsg.BSPruneCardUsageStatsResponse & Double = js.native
  
  @js.native
  sealed trait BSPurchaseResponse
    extends StObject
       with EMsg
  /* 1402 */ val BSPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.BSPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait BSPurchaseRunFraudChecks
    extends StObject
       with EMsg
  /* 1437 */ val BSPurchaseRunFraudChecks: typingsJapgolly.steamUser.mod.EMsg.BSPurchaseRunFraudChecks & Double = js.native
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse
    extends StObject
       with EMsg
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: typingsJapgolly.steamUser.mod.EMsg.BSPurchaseRunFraudChecksResponse & Double = js.native
  
  @js.native
  sealed trait BSPurchaseStart
    extends StObject
       with EMsg
  /* 1401 */ val BSPurchaseStart: typingsJapgolly.steamUser.mod.EMsg.BSPurchaseStart & Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoice
    extends StObject
       with EMsg
  /* 1448 */ val BSQiwiWalletInvoice: typingsJapgolly.steamUser.mod.EMsg.BSQiwiWalletInvoice & Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse
    extends StObject
       with EMsg
  /* 1449 */ val BSQiwiWalletInvoiceResponse: typingsJapgolly.steamUser.mod.EMsg.BSQiwiWalletInvoiceResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryBankInformation
    extends StObject
       with EMsg
  /* 1440 */ val BSQueryBankInformation: typingsJapgolly.steamUser.mod.EMsg.BSQueryBankInformation & Double = js.native
  
  @js.native
  sealed trait BSQueryBankInformationResponse
    extends StObject
       with EMsg
  /* 1441 */ val BSQueryBankInformationResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryBankInformationResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryCBOrderStatus
    extends StObject
       with EMsg
  /* 1428 */ val BSQueryCBOrderStatus: typingsJapgolly.steamUser.mod.EMsg.BSQueryCBOrderStatus & Double = js.native
  
  @js.native
  sealed trait BSQueryCBOrderStatusResponse
    extends StObject
       with EMsg
  /* 1429 */ val BSQueryCBOrderStatusResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryCBOrderStatusResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCard
    extends StObject
       with EMsg
  /* 1484 */ val BSQueryFindCreditCard: typingsJapgolly.steamUser.mod.EMsg.BSQueryFindCreditCard & Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse
    extends StObject
       with EMsg
  /* 1485 */ val BSQueryFindCreditCardResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryFindCreditCardResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryGCBankXferTxn
    extends StObject
       with EMsg
  /* 1423 */ val BSQueryGCBankXferTxn: typingsJapgolly.steamUser.mod.EMsg.BSQueryGCBankXferTxn & Double = js.native
  
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse
    extends StObject
       with EMsg
  /* 1424 */ val BSQueryGCBankXferTxnResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryGCBankXferTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryPaymentInstResponse
    extends StObject
       with EMsg
  /* 1432 */ val BSQueryPaymentInstResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryPaymentInstResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryPaymentInstUsage
    extends StObject
       with EMsg
  /* 1431 */ val BSQueryPaymentInstUsage: typingsJapgolly.steamUser.mod.EMsg.BSQueryPaymentInstUsage & Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatus
    extends StObject
       with EMsg
  /* 1426 */ val BSQueryTransactionStatus: typingsJapgolly.steamUser.mod.EMsg.BSQueryTransactionStatus & Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse
    extends StObject
       with EMsg
  /* 1427 */ val BSQueryTransactionStatusResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryTransactionStatusResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo
    extends StObject
       with EMsg
  /* 1433 */ val BSQueryTxnExtendedInfo: typingsJapgolly.steamUser.mod.EMsg.BSQueryTxnExtendedInfo & Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse
    extends StObject
       with EMsg
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: typingsJapgolly.steamUser.mod.EMsg.BSQueryTxnExtendedInfoResponse & Double = js.native
  
  @js.native
  sealed trait BSRefundTxn
    extends StObject
       with EMsg
  /* 1413 */ val BSRefundTxn: typingsJapgolly.steamUser.mod.EMsg.BSRefundTxn & Double = js.native
  
  @js.native
  sealed trait BSRefundTxnResponse
    extends StObject
       with EMsg
  /* 1414 */ val BSRefundTxnResponse: typingsJapgolly.steamUser.mod.EMsg.BSRefundTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData
    extends StObject
       with EMsg
  /* 1468 */ val BSRemoveExpiredPaymentData: typingsJapgolly.steamUser.mod.EMsg.BSRemoveExpiredPaymentData & Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse
    extends StObject
       with EMsg
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: typingsJapgolly.steamUser.mod.EMsg.BSRemoveExpiredPaymentDataResponse & Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit
    extends StObject
       with EMsg
  /* 1458 */ val BSResetPackagePurchaseRateLimit: typingsJapgolly.steamUser.mod.EMsg.BSResetPackagePurchaseRateLimit & Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse
    extends StObject
       with EMsg
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: typingsJapgolly.steamUser.mod.EMsg.BSResetPackagePurchaseRateLimitResponse & Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey
    extends StObject
       with EMsg
  /* 1482 */ val BSReverseRedeemPOSAKey: typingsJapgolly.steamUser.mod.EMsg.BSReverseRedeemPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: typingsJapgolly.steamUser.mod.EMsg.BSReverseRedeemPOSAKeyResponse & Double = js.native
  
  @js.native
  sealed trait BSRunRedFlagReport
    extends StObject
       with EMsg
  /* 1430 */ val BSRunRedFlagReport: typingsJapgolly.steamUser.mod.EMsg.BSRunRedFlagReport & Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequest
    extends StObject
       with EMsg
  /* 1452 */ val BSSendShippingRequest: typingsJapgolly.steamUser.mod.EMsg.BSSendShippingRequest & Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequestResponse
    extends StObject
       with EMsg
  /* 1453 */ val BSSendShippingRequestResponse: typingsJapgolly.steamUser.mod.EMsg.BSSendShippingRequestResponse & Double = js.native
  
  @js.native
  sealed trait BSSettleComplete
    extends StObject
       with EMsg
  /* 1406 */ val BSSettleComplete: typingsJapgolly.steamUser.mod.EMsg.BSSettleComplete & Double = js.native
  
  @js.native
  sealed trait BSSettleNOVA
    extends StObject
       with EMsg
  /* 1404 */ val BSSettleNOVA: typingsJapgolly.steamUser.mod.EMsg.BSSettleNOVA & Double = js.native
  
  @js.native
  sealed trait BSStartShippingJobs
    extends StObject
       with EMsg
  /* 1439 */ val BSStartShippingJobs: typingsJapgolly.steamUser.mod.EMsg.BSStartShippingJobs & Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey
    extends StObject
       with EMsg
  /* 1486 */ val BSStatusInquiryPOSAKey: typingsJapgolly.steamUser.mod.EMsg.BSStatusInquiryPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: typingsJapgolly.steamUser.mod.EMsg.BSStatusInquiryPOSAKeyResponse & Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformation
    extends StObject
       with EMsg
  /* 1478 */ val BSStoreBankInformation: typingsJapgolly.steamUser.mod.EMsg.BSStoreBankInformation & Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformationResponse
    extends StObject
       with EMsg
  /* 1479 */ val BSStoreBankInformationResponse: typingsJapgolly.steamUser.mod.EMsg.BSStoreBankInformationResponse & Double = js.native
  
  @js.native
  sealed trait BSUpdateConversionRates
    extends StObject
       with EMsg
  /* 1435 */ val BSUpdateConversionRates: typingsJapgolly.steamUser.mod.EMsg.BSUpdateConversionRates & Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack
    extends StObject
       with EMsg
  /* 1450 */ val BSUpdateInventoryFromProPack: typingsJapgolly.steamUser.mod.EMsg.BSUpdateInventoryFromProPack & Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse
    extends StObject
       with EMsg
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: typingsJapgolly.steamUser.mod.EMsg.BSUpdateInventoryFromProPackResponse & Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentData
    extends StObject
       with EMsg
  /* 1460 */ val BSUpdatePaymentData: typingsJapgolly.steamUser.mod.EMsg.BSUpdatePaymentData & Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse
    extends StObject
       with EMsg
  /* 1461 */ val BSUpdatePaymentDataResponse: typingsJapgolly.steamUser.mod.EMsg.BSUpdatePaymentDataResponse & Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignature
    extends StObject
       with EMsg
  /* 1488 */ val BSValidateMoPaySignature: typingsJapgolly.steamUser.mod.EMsg.BSValidateMoPaySignature & Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse
    extends StObject
       with EMsg
  /* 1489 */ val BSValidateMoPaySignatureResponse: typingsJapgolly.steamUser.mod.EMsg.BSValidateMoPaySignatureResponse & Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignature
    extends StObject
       with EMsg
  /* 1445 */ val BSValidateXsollaSignature: typingsJapgolly.steamUser.mod.EMsg.BSValidateXsollaSignature & Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse
    extends StObject
       with EMsg
  /* 1446 */ val BSValidateXsollaSignatureResponse: typingsJapgolly.steamUser.mod.EMsg.BSValidateXsollaSignatureResponse & Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKey
    extends StObject
       with EMsg
  /* 1480 */ val BSVerifyPOSAKey: typingsJapgolly.steamUser.mod.EMsg.BSVerifyPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1481 */ val BSVerifyPOSAKeyResponse: typingsJapgolly.steamUser.mod.EMsg.BSVerifyPOSAKeyResponse & Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrency
    extends StObject
       with EMsg
  /* 8401 */ val BackpackAddToCurrency: typingsJapgolly.steamUser.mod.EMsg.BackpackAddToCurrency & Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse
    extends StObject
       with EMsg
  /* 8402 */ val BackpackAddToCurrencyResponse: typingsJapgolly.steamUser.mod.EMsg.BackpackAddToCurrencyResponse & Double = js.native
  
  @js.native
  sealed trait BackpackBase
    extends StObject
       with EMsg
  /* 8400 */ val BackpackBase: typingsJapgolly.steamUser.mod.EMsg.BackpackBase & Double = js.native
  
  @js.native
  sealed trait BadLoginIPList
    extends StObject
       with EMsg
  /* 7805 */ val BadLoginIPList: typingsJapgolly.steamUser.mod.EMsg.BadLoginIPList & Double = js.native
  
  @js.native
  sealed trait BadgeCraftedNotification
    extends StObject
       with EMsg
  /* 5625 */ val BadgeCraftedNotification: typingsJapgolly.steamUser.mod.EMsg.BadgeCraftedNotification & Double = js.native
  
  @js.native
  sealed trait BaseAIS
    extends StObject
       with EMsg
  /* 400 */ val BaseAIS: typingsJapgolly.steamUser.mod.EMsg.BaseAIS & Double = js.native
  
  @js.native
  sealed trait BaseAM
    extends StObject
       with EMsg
  /* 500 */ val BaseAM: typingsJapgolly.steamUser.mod.EMsg.BaseAM & Double = js.native
  
  @js.native
  sealed trait BaseAMRange2
    extends StObject
       with EMsg
  /* 4000 */ val BaseAMRange2: typingsJapgolly.steamUser.mod.EMsg.BaseAMRange2 & Double = js.native
  
  @js.native
  sealed trait BaseATS
    extends StObject
       with EMsg
  /* 1500 */ val BaseATS: typingsJapgolly.steamUser.mod.EMsg.BaseATS & Double = js.native
  
  @js.native
  sealed trait BaseAdmin
    extends StObject
       with EMsg
  /* 1000 */ val BaseAdmin: typingsJapgolly.steamUser.mod.EMsg.BaseAdmin & Double = js.native
  
  @js.native
  sealed trait BaseBRP
    extends StObject
       with EMsg
  /* 3600 */ val BaseBRP: typingsJapgolly.steamUser.mod.EMsg.BaseBRP & Double = js.native
  
  @js.native
  sealed trait BaseBS
    extends StObject
       with EMsg
  /* 1400 */ val BaseBS: typingsJapgolly.steamUser.mod.EMsg.BaseBS & Double = js.native
  
  @js.native
  sealed trait BaseCCSRange
    extends StObject
       with EMsg
  /* 3150 */ val BaseCCSRange: typingsJapgolly.steamUser.mod.EMsg.BaseCCSRange & Double = js.native
  
  @js.native
  sealed trait BaseCM
    extends StObject
       with EMsg
  /* 1700 */ val BaseCM: typingsJapgolly.steamUser.mod.EMsg.BaseCM & Double = js.native
  
  @js.native
  sealed trait BaseCS
    extends StObject
       with EMsg
  /* 650 */ val BaseCS: typingsJapgolly.steamUser.mod.EMsg.BaseCS & Double = js.native
  
  @js.native
  sealed trait BaseChannelAuth
    extends StObject
       with EMsg
  /* 1300 */ val BaseChannelAuth: typingsJapgolly.steamUser.mod.EMsg.BaseChannelAuth & Double = js.native
  
  @js.native
  sealed trait BaseChatServer
    extends StObject
       with EMsg
  /* 12000 */ val BaseChatServer: typingsJapgolly.steamUser.mod.EMsg.BaseChatServer & Double = js.native
  
  @js.native
  sealed trait BaseClient
    extends StObject
       with EMsg
  /* 700 */ val BaseClient: typingsJapgolly.steamUser.mod.EMsg.BaseClient & Double = js.native
  
  @js.native
  sealed trait BaseClient2
    extends StObject
       with EMsg
  /* 5400 */ val BaseClient2: typingsJapgolly.steamUser.mod.EMsg.BaseClient2 & Double = js.native
  
  @js.native
  sealed trait BaseClient3
    extends StObject
       with EMsg
  /* 9800 */ val BaseClient3: typingsJapgolly.steamUser.mod.EMsg.BaseClient3 & Double = js.native
  
  @js.native
  sealed trait BaseDFS
    extends StObject
       with EMsg
  /* 5600 */ val BaseDFS: typingsJapgolly.steamUser.mod.EMsg.BaseDFS & Double = js.native
  
  @js.native
  sealed trait BaseDP
    extends StObject
       with EMsg
  /* 1600 */ val BaseDP: typingsJapgolly.steamUser.mod.EMsg.BaseDP & Double = js.native
  
  @js.native
  sealed trait BaseDRMS
    extends StObject
       with EMsg
  /* 625 */ val BaseDRMS: typingsJapgolly.steamUser.mod.EMsg.BaseDRMS & Double = js.native
  
  @js.native
  sealed trait BaseDSS
    extends StObject
       with EMsg
  /* 1800 */ val BaseDSS: typingsJapgolly.steamUser.mod.EMsg.BaseDSS & Double = js.native
  
  @js.native
  sealed trait BaseEPM
    extends StObject
       with EMsg
  /* 1900 */ val BaseEPM: typingsJapgolly.steamUser.mod.EMsg.BaseEPM & Double = js.native
  
  @js.native
  sealed trait BaseFBS
    extends StObject
       with EMsg
  /* 1100 */ val BaseFBS: typingsJapgolly.steamUser.mod.EMsg.BaseFBS & Double = js.native
  
  @js.native
  sealed trait BaseFTSRange
    extends StObject
       with EMsg
  /* 3100 */ val BaseFTSRange: typingsJapgolly.steamUser.mod.EMsg.BaseFTSRange & Double = js.native
  
  @js.native
  sealed trait BaseFileXfer
    extends StObject
       with EMsg
  /* 1200 */ val BaseFileXfer: typingsJapgolly.steamUser.mod.EMsg.BaseFileXfer & Double = js.native
  
  @js.native
  sealed trait BaseGC
    extends StObject
       with EMsg
  /* 2200 */ val BaseGC: typingsJapgolly.steamUser.mod.EMsg.BaseGC & Double = js.native
  
  @js.native
  sealed trait BaseGM
    extends StObject
       with EMsg
  /* 300 */ val BaseGM: typingsJapgolly.steamUser.mod.EMsg.BaseGM & Double = js.native
  
  @js.native
  sealed trait BaseGameServer
    extends StObject
       with EMsg
  /* 900 */ val BaseGameServer: typingsJapgolly.steamUser.mod.EMsg.BaseGameServer & Double = js.native
  
  @js.native
  sealed trait BaseGeneral
    extends StObject
       with EMsg
  /* 100 */ val BaseGeneral: typingsJapgolly.steamUser.mod.EMsg.BaseGeneral & Double = js.native
  
  @js.native
  sealed trait BaseLBSRange
    extends StObject
       with EMsg
  /* 3200 */ val BaseLBSRange: typingsJapgolly.steamUser.mod.EMsg.BaseLBSRange & Double = js.native
  
  @js.native
  sealed trait BaseMDS
    extends StObject
       with EMsg
  /* 5800 */ val BaseMDS: typingsJapgolly.steamUser.mod.EMsg.BaseMDS & Double = js.native
  
  @js.native
  sealed trait BaseOGS
    extends StObject
       with EMsg
  /* 3400 */ val BaseOGS: typingsJapgolly.steamUser.mod.EMsg.BaseOGS & Double = js.native
  
  @js.native
  sealed trait BaseP2P
    extends StObject
       with EMsg
  /* 2500 */ val BaseP2P: typingsJapgolly.steamUser.mod.EMsg.BaseP2P & Double = js.native
  
  @js.native
  sealed trait BasePSRange
    extends StObject
       with EMsg
  /* 5000 */ val BasePSRange: typingsJapgolly.steamUser.mod.EMsg.BasePSRange & Double = js.native
  
  @js.native
  sealed trait BaseSM
    extends StObject
       with EMsg
  /* 2900 */ val BaseSM: typingsJapgolly.steamUser.mod.EMsg.BaseSM & Double = js.native
  
  @js.native
  sealed trait BaseSecretServer
    extends StObject
       with EMsg
  /* 12100 */ val BaseSecretServer: typingsJapgolly.steamUser.mod.EMsg.BaseSecretServer & Double = js.native
  
  @js.native
  sealed trait BaseShell
    extends StObject
       with EMsg
  /* 200 */ val BaseShell: typingsJapgolly.steamUser.mod.EMsg.BaseShell & Double = js.native
  
  @js.native
  sealed trait BaseTest
    extends StObject
       with EMsg
  /* 3000 */ val BaseTest: typingsJapgolly.steamUser.mod.EMsg.BaseTest & Double = js.native
  
  @js.native
  sealed trait BaseUFSRange
    extends StObject
       with EMsg
  /* 5200 */ val BaseUFSRange: typingsJapgolly.steamUser.mod.EMsg.BaseUFSRange & Double = js.native
  
  @js.native
  sealed trait BaseVS
    extends StObject
       with EMsg
  /* 600 */ val BaseVS: typingsJapgolly.steamUser.mod.EMsg.BaseVS & Double = js.native
  
  @js.native
  sealed trait BaseWatchdogServer
    extends StObject
       with EMsg
  /* 10000 */ val BaseWatchdogServer: typingsJapgolly.steamUser.mod.EMsg.BaseWatchdogServer & Double = js.native
  
  @js.native
  sealed trait BoxMonitorBase
    extends StObject
       with EMsg
  /* 8700 */ val BoxMonitorBase: typingsJapgolly.steamUser.mod.EMsg.BoxMonitorBase & Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportRequest
    extends StObject
       with EMsg
  /* 8700 */ val BoxMonitorReportRequest: typingsJapgolly.steamUser.mod.EMsg.BoxMonitorReportRequest & Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportResponse
    extends StObject
       with EMsg
  /* 8701 */ val BoxMonitorReportResponse: typingsJapgolly.steamUser.mod.EMsg.BoxMonitorReportResponse & Double = js.native
  
  @js.native
  sealed trait CCSAddComment
    extends StObject
       with EMsg
  /* 3153 */ val CCSAddComment: typingsJapgolly.steamUser.mod.EMsg.CCSAddComment & Double = js.native
  
  @js.native
  sealed trait CCSAddCommentResponse
    extends StObject
       with EMsg
  /* 3154 */ val CCSAddCommentResponse: typingsJapgolly.steamUser.mod.EMsg.CCSAddCommentResponse & Double = js.native
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor
    extends StObject
       with EMsg
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: typingsJapgolly.steamUser.mod.EMsg.CCSDeleteAllCommentsByAuthor & Double = js.native
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse
    extends StObject
       with EMsg
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: typingsJapgolly.steamUser.mod.EMsg.CCSDeleteAllCommentsByAuthorResponse & Double = js.native
  
  @js.native
  sealed trait CCSDeleteComment
    extends StObject
       with EMsg
  /* 3155 */ val CCSDeleteComment: typingsJapgolly.steamUser.mod.EMsg.CCSDeleteComment & Double = js.native
  
  @js.native
  sealed trait CCSDeleteCommentResponse
    extends StObject
       with EMsg
  /* 3156 */ val CCSDeleteCommentResponse: typingsJapgolly.steamUser.mod.EMsg.CCSDeleteCommentResponse & Double = js.native
  
  @js.native
  sealed trait CCSGetComments
    extends StObject
       with EMsg
  /* 3151 */ val CCSGetComments: typingsJapgolly.steamUser.mod.EMsg.CCSGetComments & Double = js.native
  
  @js.native
  sealed trait CCSGetCommentsForNews
    extends StObject
       with EMsg
  /* 3159 */ val CCSGetCommentsForNews: typingsJapgolly.steamUser.mod.EMsg.CCSGetCommentsForNews & Double = js.native
  
  @js.native
  sealed trait CCSGetCommentsForNewsResponse
    extends StObject
       with EMsg
  /* 3160 */ val CCSGetCommentsForNewsResponse: typingsJapgolly.steamUser.mod.EMsg.CCSGetCommentsForNewsResponse & Double = js.native
  
  @js.native
  sealed trait CCSGetCommentsResponse
    extends StObject
       with EMsg
  /* 3152 */ val CCSGetCommentsResponse: typingsJapgolly.steamUser.mod.EMsg.CCSGetCommentsResponse & Double = js.native
  
  @js.native
  sealed trait CCSNotifyCommentCount
    extends StObject
       with EMsg
  /* 3158 */ val CCSNotifyCommentCount: typingsJapgolly.steamUser.mod.EMsg.CCSNotifyCommentCount & Double = js.native
  
  @js.native
  sealed trait CCSPreloadComments
    extends StObject
       with EMsg
  /* 3157 */ val CCSPreloadComments: typingsJapgolly.steamUser.mod.EMsg.CCSPreloadComments & Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest
    extends StObject
       with EMsg
  /* 7602 */ val CEGPropStatusDRMSRequest: typingsJapgolly.steamUser.mod.EMsg.CEGPropStatusDRMSRequest & Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse
    extends StObject
       with EMsg
  /* 7603 */ val CEGPropStatusDRMSResponse: typingsJapgolly.steamUser.mod.EMsg.CEGPropStatusDRMSResponse & Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest
    extends StObject
       with EMsg
  /* 7600 */ val CEGVersionSetEnableDisableRequest: typingsJapgolly.steamUser.mod.EMsg.CEGVersionSetEnableDisableRequest & Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse
    extends StObject
       with EMsg
  /* 7601 */ val CEGVersionSetEnableDisableResponse: typingsJapgolly.steamUser.mod.EMsg.CEGVersionSetEnableDisableResponse & Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportRequest
    extends StObject
       with EMsg
  /* 7604 */ val CEGWhackFailureReportRequest: typingsJapgolly.steamUser.mod.EMsg.CEGWhackFailureReportRequest & Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportResponse
    extends StObject
       with EMsg
  /* 7605 */ val CEGWhackFailureReportResponse: typingsJapgolly.steamUser.mod.EMsg.CEGWhackFailureReportResponse & Double = js.native
  
  @js.native
  sealed trait CMAppInfoResponseDeprecated
    extends StObject
       with EMsg
  /* 1703 */ val CMAppInfoResponseDeprecated: typingsJapgolly.steamUser.mod.EMsg.CMAppInfoResponseDeprecated & Double = js.native
  
  @js.native
  sealed trait CMGetSecrets
    extends StObject
       with EMsg
  /* 1705 */ val CMGetSecrets: typingsJapgolly.steamUser.mod.EMsg.CMGetSecrets & Double = js.native
  
  @js.native
  sealed trait CMSessionRejected
    extends StObject
       with EMsg
  /* 1703 */ val CMSessionRejected: typingsJapgolly.steamUser.mod.EMsg.CMSessionRejected & Double = js.native
  
  @js.native
  sealed trait CMSetAllowState
    extends StObject
       with EMsg
  /* 1701 */ val CMSetAllowState: typingsJapgolly.steamUser.mod.EMsg.CMSetAllowState & Double = js.native
  
  @js.native
  sealed trait CMSetSecrets
    extends StObject
       with EMsg
  /* 1704 */ val CMSetSecrets: typingsJapgolly.steamUser.mod.EMsg.CMSetSecrets & Double = js.native
  
  @js.native
  sealed trait CMSpewAllowState
    extends StObject
       with EMsg
  /* 1702 */ val CMSpewAllowState: typingsJapgolly.steamUser.mod.EMsg.CMSpewAllowState & Double = js.native
  
  @js.native
  sealed trait CREBase
    extends StObject
       with EMsg
  /* 8500 */ val CREBase: typingsJapgolly.steamUser.mod.EMsg.CREBase & Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFiles
    extends StObject
       with EMsg
  /* 8511 */ val CREEnumeratePublishedFiles: typingsJapgolly.steamUser.mod.EMsg.CREEnumeratePublishedFiles & Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse
    extends StObject
       with EMsg
  /* 8512 */ val CREEnumeratePublishedFilesResponse: typingsJapgolly.steamUser.mod.EMsg.CREEnumeratePublishedFilesResponse & Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails
    extends StObject
       with EMsg
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: typingsJapgolly.steamUser.mod.EMsg.CREGetUserPublishedItemVoteDetails & Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse
    extends StObject
       with EMsg
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.CREGetUserPublishedItemVoteDetailsResponse & Double = js.native
  
  @js.native
  sealed trait CREItemVoteSummary
    extends StObject
       with EMsg
  /* 8503 */ val CREItemVoteSummary: typingsJapgolly.steamUser.mod.EMsg.CREItemVoteSummary & Double = js.native
  
  @js.native
  sealed trait CREItemVoteSummaryResponse
    extends StObject
       with EMsg
  /* 8504 */ val CREItemVoteSummaryResponse: typingsJapgolly.steamUser.mod.EMsg.CREItemVoteSummaryResponse & Double = js.native
  
  @js.native
  sealed trait CREPublishedFileVoteAdded
    extends StObject
       with EMsg
  /* 8513 */ val CREPublishedFileVoteAdded: typingsJapgolly.steamUser.mod.EMsg.CREPublishedFileVoteAdded & Double = js.native
  
  @js.native
  sealed trait CRERankByTrend
    extends StObject
       with EMsg
  /* 8501 */ val CRERankByTrend: typingsJapgolly.steamUser.mod.EMsg.CRERankByTrend & Double = js.native
  
  @js.native
  sealed trait CRERankByTrendResponse
    extends StObject
       with EMsg
  /* 8502 */ val CRERankByTrendResponse: typingsJapgolly.steamUser.mod.EMsg.CRERankByTrendResponse & Double = js.native
  
  @js.native
  sealed trait CRERankByVote
    extends StObject
       with EMsg
  /* 8505 */ val CRERankByVote: typingsJapgolly.steamUser.mod.EMsg.CRERankByVote & Double = js.native
  
  @js.native
  sealed trait CRERankByVoteResponse
    extends StObject
       with EMsg
  /* 8506 */ val CRERankByVoteResponse: typingsJapgolly.steamUser.mod.EMsg.CRERankByVoteResponse & Double = js.native
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVote
    extends StObject
       with EMsg
  /* 8507 */ val CREUpdateUserPublishedItemVote: typingsJapgolly.steamUser.mod.EMsg.CREUpdateUserPublishedItemVote & Double = js.native
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse
    extends StObject
       with EMsg
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: typingsJapgolly.steamUser.mod.EMsg.CREUpdateUserPublishedItemVoteResponse & Double = js.native
  
  @js.native
  sealed trait CSBase
    extends StObject
       with EMsg
  /* 6200 */ val CSBase: typingsJapgolly.steamUser.mod.EMsg.CSBase & Double = js.native
  
  @js.native
  sealed trait CSPing
    extends StObject
       with EMsg
  /* 6201 */ val CSPing: typingsJapgolly.steamUser.mod.EMsg.CSPing & Double = js.native
  
  @js.native
  sealed trait CSPingResponse
    extends StObject
       with EMsg
  /* 6202 */ val CSPingResponse: typingsJapgolly.steamUser.mod.EMsg.CSPingResponse & Double = js.native
  
  @js.native
  sealed trait CSUserContentApprove
    extends StObject
       with EMsg
  /* 787 */ val CSUserContentApprove: typingsJapgolly.steamUser.mod.EMsg.CSUserContentApprove & Double = js.native
  
  @js.native
  sealed trait CSUserContentDeny
    extends StObject
       with EMsg
  /* 788 */ val CSUserContentDeny: typingsJapgolly.steamUser.mod.EMsg.CSUserContentDeny & Double = js.native
  
  @js.native
  sealed trait CSUserContentRequest
    extends StObject
       with EMsg
  /* 652 */ val CSUserContentRequest: typingsJapgolly.steamUser.mod.EMsg.CSUserContentRequest & Double = js.native
  
  @js.native
  sealed trait ChannelAuthChallenge
    extends StObject
       with EMsg
  /* 1300 */ val ChannelAuthChallenge: typingsJapgolly.steamUser.mod.EMsg.ChannelAuthChallenge & Double = js.native
  
  @js.native
  sealed trait ChannelAuthResponse
    extends StObject
       with EMsg
  /* 1301 */ val ChannelAuthResponse: typingsJapgolly.steamUser.mod.EMsg.ChannelAuthResponse & Double = js.native
  
  @js.native
  sealed trait ChannelAuthResult
    extends StObject
       with EMsg
  /* 1302 */ val ChannelAuthResult: typingsJapgolly.steamUser.mod.EMsg.ChannelAuthResult & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptRequest
    extends StObject
       with EMsg
  /* 1303 */ val ChannelEncryptRequest: typingsJapgolly.steamUser.mod.EMsg.ChannelEncryptRequest & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResponse
    extends StObject
       with EMsg
  /* 1304 */ val ChannelEncryptResponse: typingsJapgolly.steamUser.mod.EMsg.ChannelEncryptResponse & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResult
    extends StObject
       with EMsg
  /* 1305 */ val ChannelEncryptResult: typingsJapgolly.steamUser.mod.EMsg.ChannelEncryptResult & Double = js.native
  
  @js.native
  sealed trait ChatServerGetPendingNotificationCount
    extends StObject
       with EMsg
  /* 12000 */ val ChatServerGetPendingNotificationCount: typingsJapgolly.steamUser.mod.EMsg.ChatServerGetPendingNotificationCount & Double = js.native
  
  @js.native
  sealed trait ChatServerGetPendingNotificationCountResponse
    extends StObject
       with EMsg
  /* 12001 */ val ChatServerGetPendingNotificationCountResponse: typingsJapgolly.steamUser.mod.EMsg.ChatServerGetPendingNotificationCountResponse & Double = js.native
  
  @js.native
  sealed trait ChatServerRouteFriendMsg
    extends StObject
       with EMsg
  /* 4219 */ val ChatServerRouteFriendMsg: typingsJapgolly.steamUser.mod.EMsg.ChatServerRouteFriendMsg & Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficers
    extends StObject
       with EMsg
  /* 5531 */ val ClientAMGetClanOfficers: typingsJapgolly.steamUser.mod.EMsg.ClientAMGetClanOfficers & Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse
    extends StObject
       with EMsg
  /* 5532 */ val ClientAMGetClanOfficersResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAMGetClanOfficersResponse & Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory
    extends StObject
       with EMsg
  /* 5570 */ val ClientAMGetPersonaNameHistory: typingsJapgolly.steamUser.mod.EMsg.ClientAMGetPersonaNameHistory & Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse
    extends StObject
       with EMsg
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAMGetPersonaNameHistoryResponse & Double = js.native
  
  @js.native
  sealed trait ClientAccountInfo
    extends StObject
       with EMsg
  /* 768 */ val ClientAccountInfo: typingsJapgolly.steamUser.mod.EMsg.ClientAccountInfo & Double = js.native
  
  @js.native
  sealed trait ClientAckGuestPass
    extends StObject
       with EMsg
  /* 740 */ val ClientAckGuestPass: typingsJapgolly.steamUser.mod.EMsg.ClientAckGuestPass & Double = js.native
  
  @js.native
  sealed trait ClientAckGuestPassResponse
    extends StObject
       with EMsg
  /* 796 */ val ClientAckGuestPassResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAckGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientAckMessageByGID
    extends StObject
       with EMsg
  /* 735 */ val ClientAckMessageByGID: typingsJapgolly.steamUser.mod.EMsg.ClientAckMessageByGID & Double = js.native
  
  @js.native
  sealed trait ClientAckPurchaseReceipt
    extends StObject
       with EMsg
  /* 737 */ val ClientAckPurchaseReceipt: typingsJapgolly.steamUser.mod.EMsg.ClientAckPurchaseReceipt & Double = js.native
  
  @js.native
  sealed trait ClientAckVACBan
    extends StObject
       with EMsg
  /* 709 */ val ClientAckVACBan: typingsJapgolly.steamUser.mod.EMsg.ClientAckVACBan & Double = js.native
  
  @js.native
  sealed trait ClientAckVACBan2
    extends StObject
       with EMsg
  /* 732 */ val ClientAckVACBan2: typingsJapgolly.steamUser.mod.EMsg.ClientAckVACBan2 & Double = js.native
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite
    extends StObject
       with EMsg
  /* 745 */ val ClientAcknowledgeClanInvite: typingsJapgolly.steamUser.mod.EMsg.ClientAcknowledgeClanInvite & Double = js.native
  
  @js.native
  sealed trait ClientActivateOEMLicense
    extends StObject
       with EMsg
  /* 5468 */ val ClientActivateOEMLicense: typingsJapgolly.steamUser.mod.EMsg.ClientActivateOEMLicense & Double = js.native
  
  @js.native
  sealed trait ClientAddFriend
    extends StObject
       with EMsg
  /* 791 */ val ClientAddFriend: typingsJapgolly.steamUser.mod.EMsg.ClientAddFriend & Double = js.native
  
  @js.native
  sealed trait ClientAddFriendResponse
    extends StObject
       with EMsg
  /* 792 */ val ClientAddFriendResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAddFriendResponse & Double = js.native
  
  @js.native
  sealed trait ClientAnonLogOn_Deprecated
    extends StObject
       with EMsg
  /* 702 */ val ClientAnonLogOn_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientAnonLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated
    extends StObject
       with EMsg
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientAnonUserLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientAppInfoChanges
    extends StObject
       with EMsg
  /* 867 */ val ClientAppInfoChanges: typingsJapgolly.steamUser.mod.EMsg.ClientAppInfoChanges & Double = js.native
  
  @js.native
  sealed trait ClientAppInfoRequest
    extends StObject
       with EMsg
  /* 840 */ val ClientAppInfoRequest: typingsJapgolly.steamUser.mod.EMsg.ClientAppInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientAppInfoResponse
    extends StObject
       with EMsg
  /* 841 */ val ClientAppInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAppInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientAppInfoUpdate
    extends StObject
       with EMsg
  /* 866 */ val ClientAppInfoUpdate: typingsJapgolly.steamUser.mod.EMsg.ClientAppInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ClientAppMinutesPlayedData
    extends StObject
       with EMsg
  /* 5507 */ val ClientAppMinutesPlayedData: typingsJapgolly.steamUser.mod.EMsg.ClientAppMinutesPlayedData & Double = js.native
  
  @js.native
  sealed trait ClientAppUsageEvent
    extends StObject
       with EMsg
  /* 747 */ val ClientAppUsageEvent: typingsJapgolly.steamUser.mod.EMsg.ClientAppUsageEvent & Double = js.native
  
  @js.native
  sealed trait ClientAuthList
    extends StObject
       with EMsg
  /* 5432 */ val ClientAuthList: typingsJapgolly.steamUser.mod.EMsg.ClientAuthList & Double = js.native
  
  @js.native
  sealed trait ClientAuthListAck
    extends StObject
       with EMsg
  /* 5575 */ val ClientAuthListAck: typingsJapgolly.steamUser.mod.EMsg.ClientAuthListAck & Double = js.native
  
  @js.native
  sealed trait ClientAuthList_Deprecated
    extends StObject
       with EMsg
  /* 5428 */ val ClientAuthList_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientAuthList_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDevice
    extends StObject
       with EMsg
  /* 6502 */ val ClientAuthorizeLocalDevice: typingsJapgolly.steamUser.mod.EMsg.ClientAuthorizeLocalDevice & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification
    extends StObject
       with EMsg
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: typingsJapgolly.steamUser.mod.EMsg.ClientAuthorizeLocalDeviceNotification & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest
    extends StObject
       with EMsg
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: typingsJapgolly.steamUser.mod.EMsg.ClientAuthorizeLocalDeviceRequest & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse
    extends StObject
       with EMsg
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: typingsJapgolly.steamUser.mod.EMsg.ClientAuthorizeLocalDeviceResponse & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastBase
    extends StObject
       with EMsg
  /* 9700 */ val ClientBroadcastBase: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastBase & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastDisconnect
    extends StObject
       with EMsg
  /* 9702 */ val ClientBroadcastDisconnect: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastDisconnect & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastFrames
    extends StObject
       with EMsg
  /* 9701 */ val ClientBroadcastFrames: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastFrames & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastInit
    extends StObject
       with EMsg
  /* 9700 */ val ClientBroadcastInit: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastInit & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastScreenshot
    extends StObject
       with EMsg
  /* 9703 */ val ClientBroadcastScreenshot: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastUploadConfig
    extends StObject
       with EMsg
  /* 9704 */ val ClientBroadcastUploadConfig: typingsJapgolly.steamUser.mod.EMsg.ClientBroadcastUploadConfig & Double = js.native
  
  @js.native
  sealed trait ClientCMList
    extends StObject
       with EMsg
  /* 783 */ val ClientCMList: typingsJapgolly.steamUser.mod.EMsg.ClientCMList & Double = js.native
  
  @js.native
  sealed trait ClientCancelLicense
    extends StObject
       with EMsg
  /* 729 */ val ClientCancelLicense: typingsJapgolly.steamUser.mod.EMsg.ClientCancelLicense & Double = js.native
  
  @js.native
  sealed trait ClientCancelLicenseResponse
    extends StObject
       with EMsg
  /* 781 */ val ClientCancelLicenseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCancelLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientChallengeRequest
    extends StObject
       with EMsg
  /* 5623 */ val ClientChallengeRequest: typingsJapgolly.steamUser.mod.EMsg.ClientChallengeRequest & Double = js.native
  
  @js.native
  sealed trait ClientChallengeResponse
    extends StObject
       with EMsg
  /* 5624 */ val ClientChallengeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientChallengeResponse & Double = js.native
  
  @js.native
  sealed trait ClientChangeStatus
    extends StObject
       with EMsg
  /* 716 */ val ClientChangeStatus: typingsJapgolly.steamUser.mod.EMsg.ClientChangeStatus & Double = js.native
  
  @js.native
  sealed trait ClientChangeSteamGuardOptions
    extends StObject
       with EMsg
  /* 5579 */ val ClientChangeSteamGuardOptions: typingsJapgolly.steamUser.mod.EMsg.ClientChangeSteamGuardOptions & Double = js.native
  
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse
    extends StObject
       with EMsg
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientChangeSteamGuardOptionsResponse & Double = js.native
  
  @js.native
  sealed trait ClientChatAction
    extends StObject
       with EMsg
  /* 597 */ val ClientChatAction: typingsJapgolly.steamUser.mod.EMsg.ClientChatAction & Double = js.native
  
  @js.native
  sealed trait ClientChatActionResult
    extends StObject
       with EMsg
  /* 814 */ val ClientChatActionResult: typingsJapgolly.steamUser.mod.EMsg.ClientChatActionResult & Double = js.native
  
  @js.native
  sealed trait ClientChatDeclined
    extends StObject
       with EMsg
  /* 5426 */ val ClientChatDeclined: typingsJapgolly.steamUser.mod.EMsg.ClientChatDeclined & Double = js.native
  
  @js.native
  sealed trait ClientChatEnter
    extends StObject
       with EMsg
  /* 807 */ val ClientChatEnter: typingsJapgolly.steamUser.mod.EMsg.ClientChatEnter & Double = js.native
  
  @js.native
  sealed trait ClientChatGetFriendMessageHistory
    extends StObject
       with EMsg
  /* 7525 */ val ClientChatGetFriendMessageHistory: typingsJapgolly.steamUser.mod.EMsg.ClientChatGetFriendMessageHistory & Double = js.native
  
  @js.native
  sealed trait ClientChatGetFriendMessageHistoryForOfflineMessages
    extends StObject
       with EMsg
  /* 7527 */ val ClientChatGetFriendMessageHistoryForOfflineMessages: typingsJapgolly.steamUser.mod.EMsg.ClientChatGetFriendMessageHistoryForOfflineMessages & Double = js.native
  
  @js.native
  sealed trait ClientChatGetFriendMessageHistoryResponse
    extends StObject
       with EMsg
  /* 7526 */ val ClientChatGetFriendMessageHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.ClientChatGetFriendMessageHistoryResponse & Double = js.native
  
  @js.native
  sealed trait ClientChatInvite
    extends StObject
       with EMsg
  /* 800 */ val ClientChatInvite: typingsJapgolly.steamUser.mod.EMsg.ClientChatInvite & Double = js.native
  
  @js.native
  sealed trait ClientChatMemberInfo
    extends StObject
       with EMsg
  /* 802 */ val ClientChatMemberInfo: typingsJapgolly.steamUser.mod.EMsg.ClientChatMemberInfo & Double = js.native
  
  @js.native
  sealed trait ClientChatMsg
    extends StObject
       with EMsg
  /* 799 */ val ClientChatMsg: typingsJapgolly.steamUser.mod.EMsg.ClientChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientChatOfflineMessageNotification
    extends StObject
       with EMsg
  /* 7523 */ val ClientChatOfflineMessageNotification: typingsJapgolly.steamUser.mod.EMsg.ClientChatOfflineMessageNotification & Double = js.native
  
  @js.native
  sealed trait ClientChatRequestOfflineMessageCount
    extends StObject
       with EMsg
  /* 7524 */ val ClientChatRequestOfflineMessageCount: typingsJapgolly.steamUser.mod.EMsg.ClientChatRequestOfflineMessageCount & Double = js.native
  
  @js.native
  sealed trait ClientChatRoomInfo
    extends StObject
       with EMsg
  /* 4026 */ val ClientChatRoomInfo: typingsJapgolly.steamUser.mod.EMsg.ClientChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPassword
    extends StObject
       with EMsg
  /* 5450 */ val ClientCheckAppBetaPassword: typingsJapgolly.steamUser.mod.EMsg.ClientCheckAppBetaPassword & Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse
    extends StObject
       with EMsg
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCheckAppBetaPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientCheckFileSignature
    extends StObject
       with EMsg
  /* 5533 */ val ClientCheckFileSignature: typingsJapgolly.steamUser.mod.EMsg.ClientCheckFileSignature & Double = js.native
  
  @js.native
  sealed trait ClientCheckFileSignatureResponse
    extends StObject
       with EMsg
  /* 5534 */ val ClientCheckFileSignatureResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCheckFileSignatureResponse & Double = js.native
  
  @js.native
  sealed trait ClientCheckPassword
    extends StObject
       with EMsg
  /* 845 */ val ClientCheckPassword: typingsJapgolly.steamUser.mod.EMsg.ClientCheckPassword & Double = js.native
  
  @js.native
  sealed trait ClientCheckPasswordResponse
    extends StObject
       with EMsg
  /* 848 */ val ClientCheckPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCheckPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientClanState
    extends StObject
       with EMsg
  /* 822 */ val ClientClanState: typingsJapgolly.steamUser.mod.EMsg.ClientClanState & Double = js.native
  
  @js.native
  sealed trait ClientCommentNotifications
    extends StObject
       with EMsg
  /* 5582 */ val ClientCommentNotifications: typingsJapgolly.steamUser.mod.EMsg.ClientCommentNotifications & Double = js.native
  
  @js.native
  sealed trait ClientConcurrentSessionsBase
    extends StObject
       with EMsg
  /* 9600 */ val ClientConcurrentSessionsBase: typingsJapgolly.steamUser.mod.EMsg.ClientConcurrentSessionsBase & Double = js.native
  
  @js.native
  sealed trait ClientConnectionStats
    extends StObject
       with EMsg
  /* 710 */ val ClientConnectionStats: typingsJapgolly.steamUser.mod.EMsg.ClientConnectionStats & Double = js.native
  
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated
    extends StObject
       with EMsg
  /* 731 */ val ClientContentServerLogOn_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientContentServerLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount2
    extends StObject
       with EMsg
  /* 5406 */ val ClientCreateAccount2: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAccount2 & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount3
    extends StObject
       with EMsg
  /* 5462 */ val ClientCreateAccount3: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAccount3 & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountProto
    extends StObject
       with EMsg
  /* 5590 */ val ClientCreateAccountProto: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAccountProto & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse
    extends StObject
       with EMsg
  /* 5591 */ val ClientCreateAccountProtoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAccountProtoResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountResponse
    extends StObject
       with EMsg
  /* 5403 */ val ClientCreateAccountResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAccountResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateAcctResponse
    extends StObject
       with EMsg
  /* 761 */ val ClientCreateAcctResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCreateAcctResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateChat
    extends StObject
       with EMsg
  /* 809 */ val ClientCreateChat: typingsJapgolly.steamUser.mod.EMsg.ClientCreateChat & Double = js.native
  
  @js.native
  sealed trait ClientCreateChatResponse
    extends StObject
       with EMsg
  /* 810 */ val ClientCreateChatResponse: typingsJapgolly.steamUser.mod.EMsg.ClientCreateChatResponse & Double = js.native
  
  @js.native
  sealed trait ClientCurrentUIMode
    extends StObject
       with EMsg
  /* 5597 */ val ClientCurrentUIMode: typingsJapgolly.steamUser.mod.EMsg.ClientCurrentUIMode & Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest
    extends StObject
       with EMsg
  /* 5605 */ val ClientDFSAuthenticateRequest: typingsJapgolly.steamUser.mod.EMsg.ClientDFSAuthenticateRequest & Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse
    extends StObject
       with EMsg
  /* 5606 */ val ClientDFSAuthenticateResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDFSAuthenticateResponse & Double = js.native
  
  @js.native
  sealed trait ClientDFSDownloadStatus
    extends StObject
       with EMsg
  /* 5617 */ val ClientDFSDownloadStatus: typingsJapgolly.steamUser.mod.EMsg.ClientDFSDownloadStatus & Double = js.native
  
  @js.native
  sealed trait ClientDFSEndSession
    extends StObject
       with EMsg
  /* 5607 */ val ClientDFSEndSession: typingsJapgolly.steamUser.mod.EMsg.ClientDFSEndSession & Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey
    extends StObject
       with EMsg
  /* 1620 */ val ClientDPCheckSpecialSurvey: typingsJapgolly.steamUser.mod.EMsg.ClientDPCheckSpecialSurvey & Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse
    extends StObject
       with EMsg
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDPCheckSpecialSurveyResponse & Double = js.native
  
  @js.native
  sealed trait ClientDPContentStatsReport
    extends StObject
       with EMsg
  /* 1630 */ val ClientDPContentStatsReport: typingsJapgolly.steamUser.mod.EMsg.ClientDPContentStatsReport & Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse
    extends StObject
       with EMsg
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDPSendSpecialSurveyResponse & Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply
    extends StObject
       with EMsg
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: typingsJapgolly.steamUser.mod.EMsg.ClientDPSendSpecialSurveyResponseReply & Double = js.native
  
  @js.native
  sealed trait ClientDPSteam2AppStarted
    extends StObject
       with EMsg
  /* 1627 */ val ClientDPSteam2AppStarted: typingsJapgolly.steamUser.mod.EMsg.ClientDPSteam2AppStarted & Double = js.native
  
  @js.native
  sealed trait ClientDPUnsignedInstallScript
    extends StObject
       with EMsg
  /* 1627 */ val ClientDPUnsignedInstallScript: typingsJapgolly.steamUser.mod.EMsg.ClientDPUnsignedInstallScript & Double = js.native
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport
    extends StObject
       with EMsg
  /* 1625 */ val ClientDPUpdateAppJobReport: typingsJapgolly.steamUser.mod.EMsg.ClientDPUpdateAppJobReport & Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobRequest
    extends StObject
       with EMsg
  /* 896 */ val ClientDRMBlobRequest: typingsJapgolly.steamUser.mod.EMsg.ClientDRMBlobRequest & Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobResponse
    extends StObject
       with EMsg
  /* 897 */ val ClientDRMBlobResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDRMBlobResponse & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequest
    extends StObject
       with EMsg
  /* 5485 */ val ClientDRMDownloadRequest: typingsJapgolly.steamUser.mod.EMsg.ClientDRMDownloadRequest & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData
    extends StObject
       with EMsg
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: typingsJapgolly.steamUser.mod.EMsg.ClientDRMDownloadRequestWithCrashData & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadResponse
    extends StObject
       with EMsg
  /* 5486 */ val ClientDRMDownloadResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDRMDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientDRMFinalResult
    extends StObject
       with EMsg
  /* 5487 */ val ClientDRMFinalResult: typingsJapgolly.steamUser.mod.EMsg.ClientDRMFinalResult & Double = js.native
  
  @js.native
  sealed trait ClientDRMProblemReport
    extends StObject
       with EMsg
  /* 851 */ val ClientDRMProblemReport: typingsJapgolly.steamUser.mod.EMsg.ClientDRMProblemReport & Double = js.native
  
  @js.native
  sealed trait ClientDRMTest
    extends StObject
       with EMsg
  /* 5495 */ val ClientDRMTest: typingsJapgolly.steamUser.mod.EMsg.ClientDRMTest & Double = js.native
  
  @js.native
  sealed trait ClientDRMTestResult
    extends StObject
       with EMsg
  /* 5496 */ val ClientDRMTestResult: typingsJapgolly.steamUser.mod.EMsg.ClientDRMTestResult & Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDevice
    extends StObject
       with EMsg
  /* 6504 */ val ClientDeauthorizeDevice: typingsJapgolly.steamUser.mod.EMsg.ClientDeauthorizeDevice & Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest
    extends StObject
       with EMsg
  /* 6503 */ val ClientDeauthorizeDeviceRequest: typingsJapgolly.steamUser.mod.EMsg.ClientDeauthorizeDeviceRequest & Double = js.native
  
  @js.native
  sealed trait ClientDeregisterWithServer
    extends StObject
       with EMsg
  /* 5511 */ val ClientDeregisterWithServer: typingsJapgolly.steamUser.mod.EMsg.ClientDeregisterWithServer & Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicense
    extends StObject
       with EMsg
  /* 5445 */ val ClientDisableTestLicense: typingsJapgolly.steamUser.mod.EMsg.ClientDisableTestLicense & Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse
    extends StObject
       with EMsg
  /* 5446 */ val ClientDisableTestLicenseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientDisableTestLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientDownloadRateStatistics
    extends StObject
       with EMsg
  /* 5548 */ val ClientDownloadRateStatistics: typingsJapgolly.steamUser.mod.EMsg.ClientDownloadRateStatistics & Double = js.native
  
  @js.native
  sealed trait ClientEmailAddrInfo
    extends StObject
       with EMsg
  /* 5456 */ val ClientEmailAddrInfo: typingsJapgolly.steamUser.mod.EMsg.ClientEmailAddrInfo & Double = js.native
  
  @js.native
  sealed trait ClientEmailChange3
    extends StObject
       with EMsg
  /* 5458 */ val ClientEmailChange3: typingsJapgolly.steamUser.mod.EMsg.ClientEmailChange3 & Double = js.native
  
  @js.native
  sealed trait ClientEmailChange4
    extends StObject
       with EMsg
  /* 5544 */ val ClientEmailChange4: typingsJapgolly.steamUser.mod.EMsg.ClientEmailChange4 & Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse
    extends StObject
       with EMsg
  /* 891 */ val ClientEmailChangeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientEmailChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse4
    extends StObject
       with EMsg
  /* 5545 */ val ClientEmailChangeResponse4: typingsJapgolly.steamUser.mod.EMsg.ClientEmailChangeResponse4 & Double = js.native
  
  @js.native
  sealed trait ClientEmoticonList
    extends StObject
       with EMsg
  /* 9331 */ val ClientEmoticonList: typingsJapgolly.steamUser.mod.EMsg.ClientEmoticonList & Double = js.native
  
  @js.native
  sealed trait ClientEnableTestLicense
    extends StObject
       with EMsg
  /* 5443 */ val ClientEnableTestLicense: typingsJapgolly.steamUser.mod.EMsg.ClientEnableTestLicense & Double = js.native
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse
    extends StObject
       with EMsg
  /* 5444 */ val ClientEnableTestLicenseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientEnableTestLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientEncryptPct
    extends StObject
       with EMsg
  /* 784 */ val ClientEncryptPct: typingsJapgolly.steamUser.mod.EMsg.ClientEncryptPct & Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList
    extends StObject
       with EMsg
  /* 7519 */ val ClientFSEnumerateFollowingList: typingsJapgolly.steamUser.mod.EMsg.ClientFSEnumerateFollowingList & Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse
    extends StObject
       with EMsg
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFSEnumerateFollowingListResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCount
    extends StObject
       with EMsg
  /* 7515 */ val ClientFSGetFollowerCount: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFollowerCount & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse
    extends StObject
       with EMsg
  /* 7516 */ val ClientFSGetFollowerCountResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFollowerCountResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory
    extends StObject
       with EMsg
  /* 7525 */ val ClientFSGetFriendMessageHistory: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFriendMessageHistory & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages
    extends StObject
       with EMsg
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse
    extends StObject
       with EMsg
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFriendMessageHistoryResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels
    extends StObject
       with EMsg
  /* 7528 */ val ClientFSGetFriendsSteamLevels: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFriendsSteamLevels & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse
    extends StObject
       with EMsg
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetFriendsSteamLevelsResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowing
    extends StObject
       with EMsg
  /* 7517 */ val ClientFSGetIsFollowing: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetIsFollowing & Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse
    extends StObject
       with EMsg
  /* 7518 */ val ClientFSGetIsFollowingResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFSGetIsFollowingResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification
    extends StObject
       with EMsg
  /* 7523 */ val ClientFSOfflineMessageNotification: typingsJapgolly.steamUser.mod.EMsg.ClientFSOfflineMessageNotification & Double = js.native
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount
    extends StObject
       with EMsg
  /* 7524 */ val ClientFSRequestOfflineMessageCount: typingsJapgolly.steamUser.mod.EMsg.ClientFSRequestOfflineMessageCount & Double = js.native
  
  @js.native
  sealed trait ClientFavoritesList
    extends StObject
       with EMsg
  /* 786 */ val ClientFavoritesList: typingsJapgolly.steamUser.mod.EMsg.ClientFavoritesList & Double = js.native
  
  @js.native
  sealed trait ClientFileToDownload
    extends StObject
       with EMsg
  /* 5412 */ val ClientFileToDownload: typingsJapgolly.steamUser.mod.EMsg.ClientFileToDownload & Double = js.native
  
  @js.native
  sealed trait ClientFileToDownloadResponse
    extends StObject
       with EMsg
  /* 5413 */ val ClientFileToDownloadResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFileToDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsg
    extends StObject
       with EMsg
  /* 718 */ val ClientFriendMsg: typingsJapgolly.steamUser.mod.EMsg.ClientFriendMsg & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender
    extends StObject
       with EMsg
  /* 5578 */ val ClientFriendMsgEchoToSender: typingsJapgolly.steamUser.mod.EMsg.ClientFriendMsgEchoToSender & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgIncoming
    extends StObject
       with EMsg
  /* 5427 */ val ClientFriendMsgIncoming: typingsJapgolly.steamUser.mod.EMsg.ClientFriendMsgIncoming & Double = js.native
  
  @js.native
  sealed trait ClientFriendProfileInfo
    extends StObject
       with EMsg
  /* 5535 */ val ClientFriendProfileInfo: typingsJapgolly.steamUser.mod.EMsg.ClientFriendProfileInfo & Double = js.native
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse
    extends StObject
       with EMsg
  /* 5536 */ val ClientFriendProfileInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientFriendProfileInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientFriendRemovedFromSource
    extends StObject
       with EMsg
  /* 808 */ val ClientFriendRemovedFromSource: typingsJapgolly.steamUser.mod.EMsg.ClientFriendRemovedFromSource & Double = js.native
  
  @js.native
  sealed trait ClientFriendUserStatusPublished
    extends StObject
       with EMsg
  /* 5596 */ val ClientFriendUserStatusPublished: typingsJapgolly.steamUser.mod.EMsg.ClientFriendUserStatusPublished & Double = js.native
  
  @js.native
  sealed trait ClientFriendsGroupsList
    extends StObject
       with EMsg
  /* 5553 */ val ClientFriendsGroupsList: typingsJapgolly.steamUser.mod.EMsg.ClientFriendsGroupsList & Double = js.native
  
  @js.native
  sealed trait ClientFriendsList
    extends StObject
       with EMsg
  /* 767 */ val ClientFriendsList: typingsJapgolly.steamUser.mod.EMsg.ClientFriendsList & Double = js.native
  
  @js.native
  sealed trait ClientFromGC
    extends StObject
       with EMsg
  /* 5453 */ val ClientFromGC: typingsJapgolly.steamUser.mod.EMsg.ClientFromGC & Double = js.native
  
  @js.native
  sealed trait ClientGCMsgFailed
    extends StObject
       with EMsg
  /* 5503 */ val ClientGCMsgFailed: typingsJapgolly.steamUser.mod.EMsg.ClientGCMsgFailed & Double = js.native
  
  @js.native
  sealed trait ClientGMSServerQuery
    extends StObject
       with EMsg
  /* 6403 */ val ClientGMSServerQuery: typingsJapgolly.steamUser.mod.EMsg.ClientGMSServerQuery & Double = js.native
  
  @js.native
  sealed trait ClientGameConnectDeny
    extends StObject
       with EMsg
  /* 773 */ val ClientGameConnectDeny: typingsJapgolly.steamUser.mod.EMsg.ClientGameConnectDeny & Double = js.native
  
  @js.native
  sealed trait ClientGameConnectTokens
    extends StObject
       with EMsg
  /* 779 */ val ClientGameConnectTokens: typingsJapgolly.steamUser.mod.EMsg.ClientGameConnectTokens & Double = js.native
  
  @js.native
  sealed trait ClientGameConnect_obsolete
    extends StObject
       with EMsg
  /* 719 */ val ClientGameConnect_obsolete: typingsJapgolly.steamUser.mod.EMsg.ClientGameConnect_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGameEnded_obsolete
    extends StObject
       with EMsg
  /* 721 */ val ClientGameEnded_obsolete: typingsJapgolly.steamUser.mod.EMsg.ClientGameEnded_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed
    extends StObject
       with EMsg
  /* 742 */ val ClientGamesPlayed: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayed & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed2_obsolete
    extends StObject
       with EMsg
  /* 720 */ val ClientGamesPlayed2_obsolete: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayed2_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed3_obsolete
    extends StObject
       with EMsg
  /* 738 */ val ClientGamesPlayed3_obsolete: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayed3_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob
    extends StObject
       with EMsg
  /* 715 */ val ClientGamesPlayedNoDataBlob: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayedNoDataBlob & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob
    extends StObject
       with EMsg
  /* 5410 */ val ClientGamesPlayedWithDataBlob: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayedWithDataBlob & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed_obsolete
    extends StObject
       with EMsg
  /* 705 */ val ClientGamesPlayed_obsolete: typingsJapgolly.steamUser.mod.EMsg.ClientGamesPlayed_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGetAppBetaPasswords
    extends StObject
       with EMsg
  /* 5441 */ val ClientGetAppBetaPasswords: typingsJapgolly.steamUser.mod.EMsg.ClientGetAppBetaPasswords & Double = js.native
  
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse
    extends StObject
       with EMsg
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetAppBetaPasswordsResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket
    extends StObject
       with EMsg
  /* 857 */ val ClientGetAppOwnershipTicket: typingsJapgolly.steamUser.mod.EMsg.ClientGetAppOwnershipTicket & Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse
    extends StObject
       with EMsg
  /* 858 */ val ClientGetAppOwnershipTicketResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetAppOwnershipTicketResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevices
    extends StObject
       with EMsg
  /* 6506 */ val ClientGetAuthorizedDevices: typingsJapgolly.steamUser.mod.EMsg.ClientGetAuthorizedDevices & Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse
    extends StObject
       with EMsg
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetAuthorizedDevicesResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthToken
    extends StObject
       with EMsg
  /* 5546 */ val ClientGetCDNAuthToken: typingsJapgolly.steamUser.mod.EMsg.ClientGetCDNAuthToken & Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse
    extends StObject
       with EMsg
  /* 5547 */ val ClientGetCDNAuthTokenResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetCDNAuthTokenResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCounts
    extends StObject
       with EMsg
  /* 5554 */ val ClientGetClanActivityCounts: typingsJapgolly.steamUser.mod.EMsg.ClientGetClanActivityCounts & Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse
    extends StObject
       with EMsg
  /* 5555 */ val ClientGetClanActivityCountsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetClanActivityCountsResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppList
    extends StObject
       with EMsg
  /* 5518 */ val ClientGetClientAppList: typingsJapgolly.steamUser.mod.EMsg.ClientGetClientAppList & Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppListResponse
    extends StObject
       with EMsg
  /* 5519 */ val ClientGetClientAppListResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetClientAppListResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetails
    extends StObject
       with EMsg
  /* 5515 */ val ClientGetClientDetails: typingsJapgolly.steamUser.mod.EMsg.ClientGetClientDetails & Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetailsResponse
    extends StObject
       with EMsg
  /* 5516 */ val ClientGetClientDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetClientDetailsResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetDepotDecryptionKey
    extends StObject
       with EMsg
  /* 5438 */ val ClientGetDepotDecryptionKey: typingsJapgolly.steamUser.mod.EMsg.ClientGetDepotDecryptionKey & Double = js.native
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse
    extends StObject
       with EMsg
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetDepotDecryptionKeyResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetEmoticonList
    extends StObject
       with EMsg
  /* 9330 */ val ClientGetEmoticonList: typingsJapgolly.steamUser.mod.EMsg.ClientGetEmoticonList & Double = js.native
  
  @js.native
  sealed trait ClientGetFinalPrice
    extends StObject
       with EMsg
  /* 722 */ val ClientGetFinalPrice: typingsJapgolly.steamUser.mod.EMsg.ClientGetFinalPrice & Double = js.native
  
  @js.native
  sealed trait ClientGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 775 */ val ClientGetFinalPriceResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame
    extends StObject
       with EMsg
  /* 5488 */ val ClientGetFriendsWhoPlayGame: typingsJapgolly.steamUser.mod.EMsg.ClientGetFriendsWhoPlayGame & Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse
    extends StObject
       with EMsg
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetFriendsWhoPlayGameResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetGiftTargetList
    extends StObject
       with EMsg
  /* 748 */ val ClientGetGiftTargetList: typingsJapgolly.steamUser.mod.EMsg.ClientGetGiftTargetList & Double = js.native
  
  @js.native
  sealed trait ClientGetGiftTargetListResponse
    extends StObject
       with EMsg
  /* 749 */ val ClientGetGiftTargetListResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetGiftTargetListResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetLegacyGameKey
    extends StObject
       with EMsg
  /* 730 */ val ClientGetLegacyGameKey: typingsJapgolly.steamUser.mod.EMsg.ClientGetLegacyGameKey & Double = js.native
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse
    extends StObject
       with EMsg
  /* 785 */ val ClientGetLegacyGameKeyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetLegacyGameKeyResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetLicenses
    extends StObject
       with EMsg
  /* 728 */ val ClientGetLicenses: typingsJapgolly.steamUser.mod.EMsg.ClientGetLicenses & Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyListResponse
    extends StObject
       with EMsg
  /* 860 */ val ClientGetLobbyListResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyMetadata
    extends StObject
       with EMsg
  /* 861 */ val ClientGetLobbyMetadata: typingsJapgolly.steamUser.mod.EMsg.ClientGetLobbyMetadata & Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyMetadataResponse
    extends StObject
       with EMsg
  /* 862 */ val ClientGetLobbyMetadataResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetLobbyMetadataResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfo
    extends StObject
       with EMsg
  /* 5508 */ val ClientGetMicroTxnInfo: typingsJapgolly.steamUser.mod.EMsg.ClientGetMicroTxnInfo & Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse
    extends StObject
       with EMsg
  /* 5509 */ val ClientGetMicroTxnInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetMicroTxnInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers
    extends StObject
       with EMsg
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: typingsJapgolly.steamUser.mod.EMsg.ClientGetNumberOfCurrentPlayers & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP
    extends StObject
       with EMsg
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: typingsJapgolly.steamUser.mod.EMsg.ClientGetNumberOfCurrentPlayersDP & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse
    extends StObject
       with EMsg
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetNumberOfCurrentPlayersDPResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse
    extends StObject
       with EMsg
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetNumberOfCurrentPlayersResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetPurchaseReceipts
    extends StObject
       with EMsg
  /* 736 */ val ClientGetPurchaseReceipts: typingsJapgolly.steamUser.mod.EMsg.ClientGetPurchaseReceipts & Double = js.native
  
  @js.native
  sealed trait ClientGetUserStats
    extends StObject
       with EMsg
  /* 818 */ val ClientGetUserStats: typingsJapgolly.steamUser.mod.EMsg.ClientGetUserStats & Double = js.native
  
  @js.native
  sealed trait ClientGetUserStatsResponse
    extends StObject
       with EMsg
  /* 819 */ val ClientGetUserStatsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientGetUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientHeartBeat
    extends StObject
       with EMsg
  /* 703 */ val ClientHeartBeat: typingsJapgolly.steamUser.mod.EMsg.ClientHeartBeat & Double = js.native
  
  @js.native
  sealed trait ClientHideFriend
    extends StObject
       with EMsg
  /* 5552 */ val ClientHideFriend: typingsJapgolly.steamUser.mod.EMsg.ClientHideFriend & Double = js.native
  
  @js.native
  sealed trait ClientInformOfCreateAccount
    extends StObject
       with EMsg
  /* 708 */ val ClientInformOfCreateAccount: typingsJapgolly.steamUser.mod.EMsg.ClientInformOfCreateAccount & Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword
    extends StObject
       with EMsg
  /* 5407 */ val ClientInformOfResetForgottenPassword: typingsJapgolly.steamUser.mod.EMsg.ClientInformOfResetForgottenPassword & Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse
    extends StObject
       with EMsg
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientInformOfResetForgottenPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientInitPurchase
    extends StObject
       with EMsg
  /* 711 */ val ClientInitPurchase: typingsJapgolly.steamUser.mod.EMsg.ClientInitPurchase & Double = js.native
  
  @js.native
  sealed trait ClientInitPurchaseResponse
    extends StObject
       with EMsg
  /* 789 */ val ClientInitPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait ClientInstallClientApp
    extends StObject
       with EMsg
  /* 5520 */ val ClientInstallClientApp: typingsJapgolly.steamUser.mod.EMsg.ClientInstallClientApp & Double = js.native
  
  @js.native
  sealed trait ClientInstallClientAppResponse
    extends StObject
       with EMsg
  /* 5521 */ val ClientInstallClientAppResponse: typingsJapgolly.steamUser.mod.EMsg.ClientInstallClientAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientInviteFriend
    extends StObject
       with EMsg
  /* 793 */ val ClientInviteFriend: typingsJapgolly.steamUser.mod.EMsg.ClientInviteFriend & Double = js.native
  
  @js.native
  sealed trait ClientInviteFriendResponse
    extends StObject
       with EMsg
  /* 794 */ val ClientInviteFriendResponse: typingsJapgolly.steamUser.mod.EMsg.ClientInviteFriendResponse & Double = js.native
  
  @js.native
  sealed trait ClientInviteToGame
    extends StObject
       with EMsg
  /* 7005 */ val ClientInviteToGame: typingsJapgolly.steamUser.mod.EMsg.ClientInviteToGame & Double = js.native
  
  @js.native
  sealed trait ClientInviteUserToClan
    extends StObject
       with EMsg
  /* 744 */ val ClientInviteUserToClan: typingsJapgolly.steamUser.mod.EMsg.ClientInviteUserToClan & Double = js.native
  
  @js.native
  sealed trait ClientIsLimitedAccount
    extends StObject
       with EMsg
  /* 5430 */ val ClientIsLimitedAccount: typingsJapgolly.steamUser.mod.EMsg.ClientIsLimitedAccount & Double = js.native
  
  @js.native
  sealed trait ClientItemAnnouncements
    extends StObject
       with EMsg
  /* 5576 */ val ClientItemAnnouncements: typingsJapgolly.steamUser.mod.EMsg.ClientItemAnnouncements & Double = js.native
  
  @js.native
  sealed trait ClientJoinChat
    extends StObject
       with EMsg
  /* 801 */ val ClientJoinChat: typingsJapgolly.steamUser.mod.EMsg.ClientJoinChat & Double = js.native
  
  @js.native
  sealed trait ClientKickPlayingSession
    extends StObject
       with EMsg
  /* 9601 */ val ClientKickPlayingSession: typingsJapgolly.steamUser.mod.EMsg.ClientKickPlayingSession & Double = js.native
  
  @js.native
  sealed trait ClientLANP2PBase
    extends StObject
       with EMsg
  /* 9900 */ val ClientLANP2PBase: typingsJapgolly.steamUser.mod.EMsg.ClientLANP2PBase & Double = js.native
  
  @js.native
  sealed trait ClientLANP2PMax
    extends StObject
       with EMsg
  /* 9999 */ val ClientLANP2PMax: typingsJapgolly.steamUser.mod.EMsg.ClientLANP2PMax & Double = js.native
  
  @js.native
  sealed trait ClientLANP2PRequestChunk
    extends StObject
       with EMsg
  /* 9900 */ val ClientLANP2PRequestChunk: typingsJapgolly.steamUser.mod.EMsg.ClientLANP2PRequestChunk & Double = js.native
  
  @js.native
  sealed trait ClientLANP2PRequestChunkResponse
    extends StObject
       with EMsg
  /* 9901 */ val ClientLANP2PRequestChunkResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLANP2PRequestChunkResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB
    extends StObject
       with EMsg
  /* 5416 */ val ClientLBSFindOrCreateLB: typingsJapgolly.steamUser.mod.EMsg.ClientLBSFindOrCreateLB & Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse
    extends StObject
       with EMsg
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLBSFindOrCreateLBResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntries
    extends StObject
       with EMsg
  /* 5418 */ val ClientLBSGetLBEntries: typingsJapgolly.steamUser.mod.EMsg.ClientLBSGetLBEntries & Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse
    extends StObject
       with EMsg
  /* 5419 */ val ClientLBSGetLBEntriesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLBSGetLBEntriesResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScore
    extends StObject
       with EMsg
  /* 5414 */ val ClientLBSSetScore: typingsJapgolly.steamUser.mod.EMsg.ClientLBSSetScore & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScoreResponse
    extends StObject
       with EMsg
  /* 5415 */ val ClientLBSSetScoreResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLBSSetScoreResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGC
    extends StObject
       with EMsg
  /* 5529 */ val ClientLBSSetUGC: typingsJapgolly.steamUser.mod.EMsg.ClientLBSSetUGC & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGCResponse
    extends StObject
       with EMsg
  /* 5530 */ val ClientLBSSetUGCResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLBSSetUGCResponse & Double = js.native
  
  @js.native
  sealed trait ClientLicenseList
    extends StObject
       with EMsg
  /* 780 */ val ClientLicenseList: typingsJapgolly.steamUser.mod.EMsg.ClientLicenseList & Double = js.native
  
  @js.native
  sealed trait ClientLogOff
    extends StObject
       with EMsg
  /* 706 */ val ClientLogOff: typingsJapgolly.steamUser.mod.EMsg.ClientLogOff & Double = js.native
  
  @js.native
  sealed trait ClientLogOnResponse
    extends StObject
       with EMsg
  /* 751 */ val ClientLogOnResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLogOnResponse & Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated
    extends StObject
       with EMsg
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientLogOnWithCredentials_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated
    extends StObject
       with EMsg
  /* 5465 */ val ClientLogOnWithHash_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientLogOnWithHash_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientLogOn_Deprecated
    extends StObject
       with EMsg
  /* 701 */ val ClientLogOn_Deprecated: typingsJapgolly.steamUser.mod.EMsg.ClientLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientLoggedOff
    extends StObject
       with EMsg
  /* 757 */ val ClientLoggedOff: typingsJapgolly.steamUser.mod.EMsg.ClientLoggedOff & Double = js.native
  
  @js.native
  sealed trait ClientLogon
    extends StObject
       with EMsg
  /* 5514 */ val ClientLogon: typingsJapgolly.steamUser.mod.EMsg.ClientLogon & Double = js.native
  
  @js.native
  sealed trait ClientLogonGameServer
    extends StObject
       with EMsg
  /* 5559 */ val ClientLogonGameServer: typingsJapgolly.steamUser.mod.EMsg.ClientLogonGameServer & Double = js.native
  
  @js.native
  sealed trait ClientLookupKey
    extends StObject
       with EMsg
  /* 898 */ val ClientLookupKey: typingsJapgolly.steamUser.mod.EMsg.ClientLookupKey & Double = js.native
  
  @js.native
  sealed trait ClientLookupKeyResponse
    extends StObject
       with EMsg
  /* 899 */ val ClientLookupKeyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientLookupKeyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSGetDepotManifest
    extends StObject
       with EMsg
  /* 5818 */ val ClientMDSGetDepotManifest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSGetDepotManifest & Double = js.native
  
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk
    extends StObject
       with EMsg
  /* 5820 */ val ClientMDSGetDepotManifestChunk: typingsJapgolly.steamUser.mod.EMsg.ClientMDSGetDepotManifestChunk & Double = js.native
  
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse
    extends StObject
       with EMsg
  /* 5819 */ val ClientMDSGetDepotManifestResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSGetDepotManifestResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild
    extends StObject
       with EMsg
  /* 5842 */ val ClientMDSGetPrevDepotBuild: typingsJapgolly.steamUser.mod.EMsg.ClientMDSGetPrevDepotBuild & Double = js.native
  
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse
    extends StObject
       with EMsg
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSGetPrevDepotBuildResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSHeartbeat
    extends StObject
       with EMsg
  /* 5806 */ val ClientMDSHeartbeat: typingsJapgolly.steamUser.mod.EMsg.ClientMDSHeartbeat & Double = js.native
  
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest
    extends StObject
       with EMsg
  /* 5809 */ val ClientMDSInitDepotBuildRequest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSInitDepotBuildRequest & Double = js.native
  
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse
    extends StObject
       with EMsg
  /* 5810 */ val ClientMDSInitDepotBuildResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSInitDepotBuildResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest
    extends StObject
       with EMsg
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSInitWorkshopBuildRequest & Double = js.native
  
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse
    extends StObject
       with EMsg
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSInitWorkshopBuildResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSLoginRequest
    extends StObject
       with EMsg
  /* 5801 */ val ClientMDSLoginRequest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSLoginRequest & Double = js.native
  
  @js.native
  sealed trait ClientMDSLoginResponse
    extends StObject
       with EMsg
  /* 5802 */ val ClientMDSLoginResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSLoginResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSRegisterAppBuild
    extends StObject
       with EMsg
  /* 5838 */ val ClientMDSRegisterAppBuild: typingsJapgolly.steamUser.mod.EMsg.ClientMDSRegisterAppBuild & Double = js.native
  
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse
    extends StObject
       with EMsg
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSRegisterAppBuildResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSSetAppBuildLive
    extends StObject
       with EMsg
  /* 5840 */ val ClientMDSSetAppBuildLive: typingsJapgolly.steamUser.mod.EMsg.ClientMDSSetAppBuildLive & Double = js.native
  
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse
    extends StObject
       with EMsg
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSSetAppBuildLiveResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSSignInstallScript
    extends StObject
       with EMsg
  /* 5845 */ val ClientMDSSignInstallScript: typingsJapgolly.steamUser.mod.EMsg.ClientMDSSignInstallScript & Double = js.native
  
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse
    extends StObject
       with EMsg
  /* 5846 */ val ClientMDSSignInstallScriptResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSSignInstallScriptResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk
    extends StObject
       with EMsg
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: typingsJapgolly.steamUser.mod.EMsg.ClientMDSTransmitManifestDataChunk & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadDepotChunks
    extends StObject
       with EMsg
  /* 5807 */ val ClientMDSUploadDepotChunks: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadDepotChunks & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse
    extends StObject
       with EMsg
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadDepotChunksResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadManifestRequest
    extends StObject
       with EMsg
  /* 5803 */ val ClientMDSUploadManifestRequest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadManifestRequest & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadManifestResponse
    extends StObject
       with EMsg
  /* 5804 */ val ClientMDSUploadManifestResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadManifestResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadRateTest
    extends StObject
       with EMsg
  /* 5823 */ val ClientMDSUploadRateTest: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadRateTest & Double = js.native
  
  @js.native
  sealed trait ClientMDSUploadRateTestResponse
    extends StObject
       with EMsg
  /* 5824 */ val ClientMDSUploadRateTestResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMDSUploadRateTestResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobby
    extends StObject
       with EMsg
  /* 6601 */ val ClientMMSCreateLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSCreateLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse
    extends StObject
       with EMsg
  /* 6602 */ val ClientMMSCreateLobbyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSCreateLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache
    extends StObject
       with EMsg
  /* 6622 */ val ClientMMSFlushFrenemyListCache: typingsJapgolly.steamUser.mod.EMsg.ClientMMSFlushFrenemyListCache & Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse
    extends StObject
       with EMsg
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSFlushFrenemyListCacheResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyData
    extends StObject
       with EMsg
  /* 6611 */ val ClientMMSGetLobbyData: typingsJapgolly.steamUser.mod.EMsg.ClientMMSGetLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyList
    extends StObject
       with EMsg
  /* 6607 */ val ClientMMSGetLobbyList: typingsJapgolly.steamUser.mod.EMsg.ClientMMSGetLobbyList & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse
    extends StObject
       with EMsg
  /* 6608 */ val ClientMMSGetLobbyListResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyStatus
    extends StObject
       with EMsg
  /* 6626 */ val ClientMMSGetLobbyStatus: typingsJapgolly.steamUser.mod.EMsg.ClientMMSGetLobbyStatus & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyStatusResponse
    extends StObject
       with EMsg
  /* 6627 */ val ClientMMSGetLobbyStatusResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSGetLobbyStatusResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSInviteToLobby
    extends StObject
       with EMsg
  /* 6621 */ val ClientMMSInviteToLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSInviteToLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobby
    extends StObject
       with EMsg
  /* 6603 */ val ClientMMSJoinLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSJoinLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse
    extends StObject
       with EMsg
  /* 6604 */ val ClientMMSJoinLobbyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSJoinLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobby
    extends StObject
       with EMsg
  /* 6605 */ val ClientMMSLeaveLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSLeaveLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse
    extends StObject
       with EMsg
  /* 6606 */ val ClientMMSLeaveLobbyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSLeaveLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg
    extends StObject
       with EMsg
  /* 6614 */ val ClientMMSLobbyChatMsg: typingsJapgolly.steamUser.mod.EMsg.ClientMMSLobbyChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyData
    extends StObject
       with EMsg
  /* 6612 */ val ClientMMSLobbyData: typingsJapgolly.steamUser.mod.EMsg.ClientMMSLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet
    extends StObject
       with EMsg
  /* 6618 */ val ClientMMSLobbyGameServerSet: typingsJapgolly.steamUser.mod.EMsg.ClientMMSLobbyGameServerSet & Double = js.native
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg
    extends StObject
       with EMsg
  /* 6613 */ val ClientMMSSendLobbyChatMsg: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSendLobbyChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyData
    extends StObject
       with EMsg
  /* 6609 */ val ClientMMSSetLobbyData: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse
    extends StObject
       with EMsg
  /* 6610 */ val ClientMMSSetLobbyDataResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyDataResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer
    extends StObject
       with EMsg
  /* 6617 */ val ClientMMSSetLobbyGameServer: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyGameServer & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked
    extends StObject
       with EMsg
  /* 6624 */ val ClientMMSSetLobbyLinked: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyLinked & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner
    extends StObject
       with EMsg
  /* 6615 */ val ClientMMSSetLobbyOwner: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyOwner & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse
    extends StObject
       with EMsg
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetLobbyOwnerResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetRatelimitPolicyOnClient
    extends StObject
       with EMsg
  /* 6625 */ val ClientMMSSetRatelimitPolicyOnClient: typingsJapgolly.steamUser.mod.EMsg.ClientMMSSetRatelimitPolicyOnClient & Double = js.native
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby
    extends StObject
       with EMsg
  /* 6619 */ val ClientMMSUserJoinedLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSUserJoinedLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSUserLeftLobby
    extends StObject
       with EMsg
  /* 6620 */ val ClientMMSUserLeftLobby: typingsJapgolly.steamUser.mod.EMsg.ClientMMSUserLeftLobby & Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate
    extends StObject
       with EMsg
  /* 5420 */ val ClientMarketingMessageUpdate: typingsJapgolly.steamUser.mod.EMsg.ClientMarketingMessageUpdate & Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2
    extends StObject
       with EMsg
  /* 5510 */ val ClientMarketingMessageUpdate2: typingsJapgolly.steamUser.mod.EMsg.ClientMarketingMessageUpdate2 & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest
    extends StObject
       with EMsg
  /* 5504 */ val ClientMicroTxnAuthRequest: typingsJapgolly.steamUser.mod.EMsg.ClientMicroTxnAuthRequest & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorize
    extends StObject
       with EMsg
  /* 5505 */ val ClientMicroTxnAuthorize: typingsJapgolly.steamUser.mod.EMsg.ClientMicroTxnAuthorize & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse
    extends StObject
       with EMsg
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientMicroTxnAuthorizeResponse & Double = js.native
  
  @js.native
  sealed trait ClientNOP
    extends StObject
       with EMsg
  /* 765 */ val ClientNOP: typingsJapgolly.steamUser.mod.EMsg.ClientNOP & Double = js.native
  
  @js.native
  sealed trait ClientNatTraversalStatEvent
    extends StObject
       with EMsg
  /* 839 */ val ClientNatTraversalStatEvent: typingsJapgolly.steamUser.mod.EMsg.ClientNatTraversalStatEvent & Double = js.native
  
  @js.native
  sealed trait ClientNetworkingCertRequest
    extends StObject
       with EMsg
  /* 5621 */ val ClientNetworkingCertRequest: typingsJapgolly.steamUser.mod.EMsg.ClientNetworkingCertRequest & Double = js.native
  
  @js.native
  sealed trait ClientNetworkingCertRequestResponse
    extends StObject
       with EMsg
  /* 5622 */ val ClientNetworkingCertRequestResponse: typingsJapgolly.steamUser.mod.EMsg.ClientNetworkingCertRequestResponse & Double = js.native
  
  @js.native
  sealed trait ClientNetworkingMobileCertRequest
    extends StObject
       with EMsg
  /* 5626 */ val ClientNetworkingMobileCertRequest: typingsJapgolly.steamUser.mod.EMsg.ClientNetworkingMobileCertRequest & Double = js.native
  
  @js.native
  sealed trait ClientNetworkingMobileCertRequestResponse
    extends StObject
       with EMsg
  /* 5627 */ val ClientNetworkingMobileCertRequestResponse: typingsJapgolly.steamUser.mod.EMsg.ClientNetworkingMobileCertRequestResponse & Double = js.native
  
  @js.native
  sealed trait ClientNewLoginKey
    extends StObject
       with EMsg
  /* 5463 */ val ClientNewLoginKey: typingsJapgolly.steamUser.mod.EMsg.ClientNewLoginKey & Double = js.native
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted
    extends StObject
       with EMsg
  /* 5464 */ val ClientNewLoginKeyAccepted: typingsJapgolly.steamUser.mod.EMsg.ClientNewLoginKeyAccepted & Double = js.native
  
  @js.native
  sealed trait ClientNewsUpdate
    extends StObject
       with EMsg
  /* 771 */ val ClientNewsUpdate: typingsJapgolly.steamUser.mod.EMsg.ClientNewsUpdate & Double = js.native
  
  @js.native
  sealed trait ClientNoUDPConnectivity
    extends StObject
       with EMsg
  /* 707 */ val ClientNoUDPConnectivity: typingsJapgolly.steamUser.mod.EMsg.ClientNoUDPConnectivity & Double = js.native
  
  @js.native
  sealed trait ClientNotLoggedOnDeprecated
    extends StObject
       with EMsg
  /* 756 */ val ClientNotLoggedOnDeprecated: typingsJapgolly.steamUser.mod.EMsg.ClientNotLoggedOnDeprecated & Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSession
    extends StObject
       with EMsg
  /* 5490 */ val ClientOGSBeginSession: typingsJapgolly.steamUser.mod.EMsg.ClientOGSBeginSession & Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse
    extends StObject
       with EMsg
  /* 5491 */ val ClientOGSBeginSessionResponse: typingsJapgolly.steamUser.mod.EMsg.ClientOGSBeginSessionResponse & Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSession
    extends StObject
       with EMsg
  /* 5492 */ val ClientOGSEndSession: typingsJapgolly.steamUser.mod.EMsg.ClientOGSEndSession & Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSessionResponse
    extends StObject
       with EMsg
  /* 5493 */ val ClientOGSEndSessionResponse: typingsJapgolly.steamUser.mod.EMsg.ClientOGSEndSessionResponse & Double = js.native
  
  @js.native
  sealed trait ClientOGSGameServerPingSample
    extends StObject
       with EMsg
  /* 5581 */ val ClientOGSGameServerPingSample: typingsJapgolly.steamUser.mod.EMsg.ClientOGSGameServerPingSample & Double = js.native
  
  @js.native
  sealed trait ClientOGSReportBug
    extends StObject
       with EMsg
  /* 5557 */ val ClientOGSReportBug: typingsJapgolly.steamUser.mod.EMsg.ClientOGSReportBug & Double = js.native
  
  @js.native
  sealed trait ClientOGSReportString
    extends StObject
       with EMsg
  /* 5556 */ val ClientOGSReportString: typingsJapgolly.steamUser.mod.EMsg.ClientOGSReportString & Double = js.native
  
  @js.native
  sealed trait ClientOGSWriteRow
    extends StObject
       with EMsg
  /* 5494 */ val ClientOGSWriteRow: typingsJapgolly.steamUser.mod.EMsg.ClientOGSWriteRow & Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo
    extends StObject
       with EMsg
  /* 5435 */ val ClientP2PConnectionFailInfo: typingsJapgolly.steamUser.mod.EMsg.ClientP2PConnectionFailInfo & Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionInfo
    extends StObject
       with EMsg
  /* 5434 */ val ClientP2PConnectionInfo: typingsJapgolly.steamUser.mod.EMsg.ClientP2PConnectionInfo & Double = js.native
  
  @js.native
  sealed trait ClientP2PIntroducerMessage
    extends StObject
       with EMsg
  /* 813 */ val ClientP2PIntroducerMessage: typingsJapgolly.steamUser.mod.EMsg.ClientP2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest
    extends StObject
       with EMsg
  /* 8905 */ val ClientPICSAccessTokenRequest: typingsJapgolly.steamUser.mod.EMsg.ClientPICSAccessTokenRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse
    extends StObject
       with EMsg
  /* 8906 */ val ClientPICSAccessTokenResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPICSAccessTokenResponse & Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest
    extends StObject
       with EMsg
  /* 8901 */ val ClientPICSChangesSinceRequest: typingsJapgolly.steamUser.mod.EMsg.ClientPICSChangesSinceRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse
    extends StObject
       with EMsg
  /* 8902 */ val ClientPICSChangesSinceResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPICSChangesSinceResponse & Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoRequest
    extends StObject
       with EMsg
  /* 8903 */ val ClientPICSProductInfoRequest: typingsJapgolly.steamUser.mod.EMsg.ClientPICSProductInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoResponse
    extends StObject
       with EMsg
  /* 8904 */ val ClientPICSProductInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPICSProductInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientPackageInfoRequest
    extends StObject
       with EMsg
  /* 833 */ val ClientPackageInfoRequest: typingsJapgolly.steamUser.mod.EMsg.ClientPackageInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientPackageInfoResponse
    extends StObject
       with EMsg
  /* 834 */ val ClientPackageInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPackageInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientPackageVersions
    extends StObject
       with EMsg
  /* 148 */ val ClientPackageVersions: typingsJapgolly.steamUser.mod.EMsg.ClientPackageVersions & Double = js.native
  
  @js.native
  sealed trait ClientPasswordChange3
    extends StObject
       with EMsg
  /* 5457 */ val ClientPasswordChange3: typingsJapgolly.steamUser.mod.EMsg.ClientPasswordChange3 & Double = js.native
  
  @js.native
  sealed trait ClientPasswordChangeResponse
    extends StObject
       with EMsg
  /* 805 */ val ClientPasswordChangeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPasswordChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientPersonaChangeResponse
    extends StObject
       with EMsg
  /* 5584 */ val ClientPersonaChangeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPersonaChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientPersonaState
    extends StObject
       with EMsg
  /* 766 */ val ClientPersonaState: typingsJapgolly.steamUser.mod.EMsg.ClientPersonaState & Double = js.native
  
  @js.native
  sealed trait ClientPersonalQAChange3
    extends StObject
       with EMsg
  /* 5459 */ val ClientPersonalQAChange3: typingsJapgolly.steamUser.mod.EMsg.ClientPersonalQAChange3 & Double = js.native
  
  @js.native
  sealed trait ClientPing
    extends StObject
       with EMsg
  /* 764 */ val ClientPing: typingsJapgolly.steamUser.mod.EMsg.ClientPing & Double = js.native
  
  @js.native
  sealed trait ClientPingResponse
    extends StObject
       with EMsg
  /* 712 */ val ClientPingResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPingResponse & Double = js.native
  
  @js.native
  sealed trait ClientPlayerNicknameList
    extends StObject
       with EMsg
  /* 5587 */ val ClientPlayerNicknameList: typingsJapgolly.steamUser.mod.EMsg.ClientPlayerNicknameList & Double = js.native
  
  @js.native
  sealed trait ClientPlayingSessionState
    extends StObject
       with EMsg
  /* 9600 */ val ClientPlayingSessionState: typingsJapgolly.steamUser.mod.EMsg.ClientPlayingSessionState & Double = js.native
  
  @js.native
  sealed trait ClientPurchaseResponse
    extends StObject
       with EMsg
  /* 763 */ val ClientPurchaseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait ClientPurchaseWithMachineID
    extends StObject
       with EMsg
  /* 746 */ val ClientPurchaseWithMachineID: typingsJapgolly.steamUser.mod.EMsg.ClientPurchaseWithMachineID & Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuth
    extends StObject
       with EMsg
  /* 5539 */ val ClientReadMachineAuth: typingsJapgolly.steamUser.mod.EMsg.ClientReadMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuthResponse
    extends StObject
       with EMsg
  /* 5540 */ val ClientReadMachineAuthResponse: typingsJapgolly.steamUser.mod.EMsg.ClientReadMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPass
    extends StObject
       with EMsg
  /* 741 */ val ClientRedeemGuestPass: typingsJapgolly.steamUser.mod.EMsg.ClientRedeemGuestPass & Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse
    extends StObject
       with EMsg
  /* 797 */ val ClientRedeemGuestPassResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRedeemGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM
    extends StObject
       with EMsg
  /* 5502 */ val ClientRegisterAuthTicketWithCM: typingsJapgolly.steamUser.mod.EMsg.ClientRegisterAuthTicketWithCM & Double = js.native
  
  @js.native
  sealed trait ClientRegisterKey
    extends StObject
       with EMsg
  /* 743 */ val ClientRegisterKey: typingsJapgolly.steamUser.mod.EMsg.ClientRegisterKey & Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachine
    extends StObject
       with EMsg
  /* 5469 */ val ClientRegisterOEMMachine: typingsJapgolly.steamUser.mod.EMsg.ClientRegisterOEMMachine & Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse
    extends StObject
       with EMsg
  /* 5470 */ val ClientRegisterOEMMachineResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRegisterOEMMachineResponse & Double = js.native
  
  @js.native
  sealed trait ClientRemoveFriend
    extends StObject
       with EMsg
  /* 714 */ val ClientRemoveFriend: typingsJapgolly.steamUser.mod.EMsg.ClientRemoveFriend & Double = js.native
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure
    extends StObject
       with EMsg
  /* 5517 */ val ClientReportOverlayDetourFailure: typingsJapgolly.steamUser.mod.EMsg.ClientReportOverlayDetourFailure & Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountData
    extends StObject
       with EMsg
  /* 5549 */ val ClientRequestAccountData: typingsJapgolly.steamUser.mod.EMsg.ClientRequestAccountData & Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountDataResponse
    extends StObject
       with EMsg
  /* 5550 */ val ClientRequestAccountDataResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestAccountDataResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestAuthList
    extends StObject
       with EMsg
  /* 5431 */ val ClientRequestAuthList: typingsJapgolly.steamUser.mod.EMsg.ClientRequestAuthList & Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMail
    extends StObject
       with EMsg
  /* 5454 */ val ClientRequestChangeMail: typingsJapgolly.steamUser.mod.EMsg.ClientRequestChangeMail & Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMailResponse
    extends StObject
       with EMsg
  /* 5455 */ val ClientRequestChangeMailResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestChangeMailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestCommentNotifications
    extends StObject
       with EMsg
  /* 5583 */ val ClientRequestCommentNotifications: typingsJapgolly.steamUser.mod.EMsg.ClientRequestCommentNotifications & Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket
    extends StObject
       with EMsg
  /* 5526 */ val ClientRequestEncryptedAppTicket: typingsJapgolly.steamUser.mod.EMsg.ClientRequestEncryptedAppTicket & Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse
    extends StObject
       with EMsg
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestEncryptedAppTicketResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail
    extends StObject
       with EMsg
  /* 5401 */ val ClientRequestForgottenPasswordEmail: typingsJapgolly.steamUser.mod.EMsg.ClientRequestForgottenPasswordEmail & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3
    extends StObject
       with EMsg
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: typingsJapgolly.steamUser.mod.EMsg.ClientRequestForgottenPasswordEmail3 & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse
    extends StObject
       with EMsg
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestForgottenPasswordEmailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicense
    extends StObject
       with EMsg
  /* 5572 */ val ClientRequestFreeLicense: typingsJapgolly.steamUser.mod.EMsg.ClientRequestFreeLicense & Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse
    extends StObject
       with EMsg
  /* 5573 */ val ClientRequestFreeLicenseResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestFreeLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendData
    extends StObject
       with EMsg
  /* 815 */ val ClientRequestFriendData: typingsJapgolly.steamUser.mod.EMsg.ClientRequestFriendData & Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendship
    extends StObject
       with EMsg
  /* 554 */ val ClientRequestFriendship: typingsJapgolly.steamUser.mod.EMsg.ClientRequestFriendship & Double = js.native
  
  @js.native
  sealed trait ClientRequestItemAnnouncements
    extends StObject
       with EMsg
  /* 5577 */ val ClientRequestItemAnnouncements: typingsJapgolly.steamUser.mod.EMsg.ClientRequestItemAnnouncements & Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuth
    extends StObject
       with EMsg
  /* 5541 */ val ClientRequestMachineAuth: typingsJapgolly.steamUser.mod.EMsg.ClientRequestMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse
    extends StObject
       with EMsg
  /* 5542 */ val ClientRequestMachineAuthResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestOAuthTokenForApp
    extends StObject
       with EMsg
  /* 5590 */ val ClientRequestOAuthTokenForApp: typingsJapgolly.steamUser.mod.EMsg.ClientRequestOAuthTokenForApp & Double = js.native
  
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse
    extends StObject
       with EMsg
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestOAuthTokenForAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMail
    extends StObject
       with EMsg
  /* 5448 */ val ClientRequestValidationMail: typingsJapgolly.steamUser.mod.EMsg.ClientRequestValidationMail & Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMailResponse
    extends StObject
       with EMsg
  /* 5449 */ val ClientRequestValidationMailResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestValidationMailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce
    extends StObject
       with EMsg
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: typingsJapgolly.steamUser.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonce & Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse
    extends StObject
       with EMsg
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: typingsJapgolly.steamUser.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestedClientStats
    extends StObject
       with EMsg
  /* 5480 */ val ClientRequestedClientStats: typingsJapgolly.steamUser.mod.EMsg.ClientRequestedClientStats & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword
    extends StObject
       with EMsg
  /* 5404 */ val ClientResetForgottenPassword: typingsJapgolly.steamUser.mod.EMsg.ClientResetForgottenPassword & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword3
    extends StObject
       with EMsg
  /* 5460 */ val ClientResetForgottenPassword3: typingsJapgolly.steamUser.mod.EMsg.ClientResetForgottenPassword3 & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword4
    extends StObject
       with EMsg
  /* 5551 */ val ClientResetForgottenPassword4: typingsJapgolly.steamUser.mod.EMsg.ClientResetForgottenPassword4 & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse
    extends StObject
       with EMsg
  /* 5405 */ val ClientResetForgottenPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientResetForgottenPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientResetPassword
    extends StObject
       with EMsg
  /* 846 */ val ClientResetPassword: typingsJapgolly.steamUser.mod.EMsg.ClientResetPassword & Double = js.native
  
  @js.native
  sealed trait ClientResetPasswordResponse
    extends StObject
       with EMsg
  /* 849 */ val ClientResetPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientResetPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceInfo
    extends StObject
       with EMsg
  /* 7503 */ val ClientRichPresenceInfo: typingsJapgolly.steamUser.mod.EMsg.ClientRichPresenceInfo & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceRequest
    extends StObject
       with EMsg
  /* 7502 */ val ClientRichPresenceRequest: typingsJapgolly.steamUser.mod.EMsg.ClientRichPresenceRequest & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceUpload
    extends StObject
       with EMsg
  /* 7501 */ val ClientRichPresenceUpload: typingsJapgolly.steamUser.mod.EMsg.ClientRichPresenceUpload & Double = js.native
  
  @js.native
  sealed trait ClientScreenshotsChanged
    extends StObject
       with EMsg
  /* 5543 */ val ClientScreenshotsChanged: typingsJapgolly.steamUser.mod.EMsg.ClientScreenshotsChanged & Double = js.native
  
  @js.native
  sealed trait ClientSecretQAChangeResponse
    extends StObject
       with EMsg
  /* 892 */ val ClientSecretQAChangeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSecretQAChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientSendGuestPass
    extends StObject
       with EMsg
  /* 739 */ val ClientSendGuestPass: typingsJapgolly.steamUser.mod.EMsg.ClientSendGuestPass & Double = js.native
  
  @js.native
  sealed trait ClientSendGuestPassResponse
    extends StObject
       with EMsg
  /* 795 */ val ClientSendGuestPassResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSendGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientSentLogs
    extends StObject
       with EMsg
  /* 5558 */ val ClientSentLogs: typingsJapgolly.steamUser.mod.EMsg.ClientSentLogs & Double = js.native
  
  @js.native
  sealed trait ClientServerList
    extends StObject
       with EMsg
  /* 880 */ val ClientServerList: typingsJapgolly.steamUser.mod.EMsg.ClientServerList & Double = js.native
  
  @js.native
  sealed trait ClientServerTimestampRequest
    extends StObject
       with EMsg
  /* 9802 */ val ClientServerTimestampRequest: typingsJapgolly.steamUser.mod.EMsg.ClientServerTimestampRequest & Double = js.native
  
  @js.native
  sealed trait ClientServerTimestampResponse
    extends StObject
       with EMsg
  /* 9803 */ val ClientServerTimestampResponse: typingsJapgolly.steamUser.mod.EMsg.ClientServerTimestampResponse & Double = js.native
  
  @js.native
  sealed trait ClientServerUnavailable
    extends StObject
       with EMsg
  /* 5500 */ val ClientServerUnavailable: typingsJapgolly.steamUser.mod.EMsg.ClientServerUnavailable & Double = js.native
  
  @js.native
  sealed trait ClientServersAvailable
    extends StObject
       with EMsg
  /* 5501 */ val ClientServersAvailable: typingsJapgolly.steamUser.mod.EMsg.ClientServersAvailable & Double = js.native
  
  @js.native
  sealed trait ClientServiceCall
    extends StObject
       with EMsg
  /* 831 */ val ClientServiceCall: typingsJapgolly.steamUser.mod.EMsg.ClientServiceCall & Double = js.native
  
  @js.native
  sealed trait ClientServiceCallResponse
    extends StObject
       with EMsg
  /* 832 */ val ClientServiceCallResponse: typingsJapgolly.steamUser.mod.EMsg.ClientServiceCallResponse & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethod
    extends StObject
       with EMsg
  /* 5594 */ val ClientServiceMethod: typingsJapgolly.steamUser.mod.EMsg.ClientServiceMethod & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethodLegacy
    extends StObject
       with EMsg
  /* 5594 */ val ClientServiceMethodLegacy: typingsJapgolly.steamUser.mod.EMsg.ClientServiceMethodLegacy & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethodLegacyResponse
    extends StObject
       with EMsg
  /* 5595 */ val ClientServiceMethodLegacyResponse: typingsJapgolly.steamUser.mod.EMsg.ClientServiceMethodLegacyResponse & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethodResponse
    extends StObject
       with EMsg
  /* 5595 */ val ClientServiceMethodResponse: typingsJapgolly.steamUser.mod.EMsg.ClientServiceMethodResponse & Double = js.native
  
  @js.native
  sealed trait ClientServiceModule
    extends StObject
       with EMsg
  /* 830 */ val ClientServiceModule: typingsJapgolly.steamUser.mod.EMsg.ClientServiceModule & Double = js.native
  
  @js.native
  sealed trait ClientSessionEnd
    extends StObject
       with EMsg
  /* 136 */ val ClientSessionEnd: typingsJapgolly.steamUser.mod.EMsg.ClientSessionEnd & Double = js.native
  
  @js.native
  sealed trait ClientSessionStart
    extends StObject
       with EMsg
  /* 135 */ val ClientSessionStart: typingsJapgolly.steamUser.mod.EMsg.ClientSessionStart & Double = js.native
  
  @js.native
  sealed trait ClientSessionToken
    extends StObject
       with EMsg
  /* 850 */ val ClientSessionToken: typingsJapgolly.steamUser.mod.EMsg.ClientSessionToken & Double = js.native
  
  @js.native
  sealed trait ClientSessionUpdate
    extends StObject
       with EMsg
  /* 137 */ val ClientSessionUpdate: typingsJapgolly.steamUser.mod.EMsg.ClientSessionUpdate & Double = js.native
  
  @js.native
  sealed trait ClientSessionUpdateAuthTicket
    extends StObject
       with EMsg
  /* 137 */ val ClientSessionUpdateAuthTicket: typingsJapgolly.steamUser.mod.EMsg.ClientSessionUpdateAuthTicket & Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateState
    extends StObject
       with EMsg
  /* 5524 */ val ClientSetClientAppUpdateState: typingsJapgolly.steamUser.mod.EMsg.ClientSetClientAppUpdateState & Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse
    extends StObject
       with EMsg
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSetClientAppUpdateStateResponse & Double = js.native
  
  @js.native
  sealed trait ClientSetHeartbeatRate
    extends StObject
       with EMsg
  /* 755 */ val ClientSetHeartbeatRate: typingsJapgolly.steamUser.mod.EMsg.ClientSetHeartbeatRate & Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriend
    extends StObject
       with EMsg
  /* 855 */ val ClientSetIgnoreFriend: typingsJapgolly.steamUser.mod.EMsg.ClientSetIgnoreFriend & Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse
    extends StObject
       with EMsg
  /* 856 */ val ClientSetIgnoreFriendResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSetIgnoreFriendResponse & Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryBase
    extends StObject
       with EMsg
  /* 9400 */ val ClientSharedLibraryBase: typingsJapgolly.steamUser.mod.EMsg.ClientSharedLibraryBase & Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryLockStatus
    extends StObject
       with EMsg
  /* 9405 */ val ClientSharedLibraryLockStatus: typingsJapgolly.steamUser.mod.EMsg.ClientSharedLibraryLockStatus & Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying
    extends StObject
       with EMsg
  /* 9406 */ val ClientSharedLibraryStopPlaying: typingsJapgolly.steamUser.mod.EMsg.ClientSharedLibraryStopPlaying & Double = js.native
  
  @js.native
  sealed trait ClientSharedLicensesLockStatus
    extends StObject
       with EMsg
  /* 9403 */ val ClientSharedLicensesLockStatus: typingsJapgolly.steamUser.mod.EMsg.ClientSharedLicensesLockStatus & Double = js.native
  
  @js.native
  sealed trait ClientSharedLicensesStopPlaying
    extends StObject
       with EMsg
  /* 9404 */ val ClientSharedLicensesStopPlaying: typingsJapgolly.steamUser.mod.EMsg.ClientSharedLicensesStopPlaying & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseBase
    extends StObject
       with EMsg
  /* 10100 */ val ClientSiteLicenseBase: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseBase & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseCheckout
    extends StObject
       with EMsg
  /* 10101 */ val ClientSiteLicenseCheckout: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseCheckout & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseCheckoutResponse
    extends StObject
       with EMsg
  /* 10102 */ val ClientSiteLicenseCheckoutResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseCheckoutResponse & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseGetAvailableSeats
    extends StObject
       with EMsg
  /* 10103 */ val ClientSiteLicenseGetAvailableSeats: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseGetAvailableSeats & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseGetAvailableSeatsResponse
    extends StObject
       with EMsg
  /* 10104 */ val ClientSiteLicenseGetAvailableSeatsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseGetAvailableSeatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseGetContentCacheInfo
    extends StObject
       with EMsg
  /* 10105 */ val ClientSiteLicenseGetContentCacheInfo: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseGetContentCacheInfo & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseGetContentCacheInfoResponse
    extends StObject
       with EMsg
  /* 10106 */ val ClientSiteLicenseGetContentCacheInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseGetContentCacheInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientSiteLicenseSiteInfoNotification
    extends StObject
       with EMsg
  /* 10100 */ val ClientSiteLicenseSiteInfoNotification: typingsJapgolly.steamUser.mod.EMsg.ClientSiteLicenseSiteInfoNotification & Double = js.native
  
  @js.native
  sealed trait ClientStat
    extends StObject
       with EMsg
  /* 5433 */ val ClientStat: typingsJapgolly.steamUser.mod.EMsg.ClientStat & Double = js.native
  
  @js.native
  sealed trait ClientStat2
    extends StObject
       with EMsg
  /* 5482 */ val ClientStat2: typingsJapgolly.steamUser.mod.EMsg.ClientStat2 & Double = js.native
  
  @js.native
  sealed trait ClientStat2Int32
    extends StObject
       with EMsg
  /* 5481 */ val ClientStat2Int32: typingsJapgolly.steamUser.mod.EMsg.ClientStat2Int32 & Double = js.native
  
  @js.native
  sealed trait ClientStatsUpdated
    extends StObject
       with EMsg
  /* 5467 */ val ClientStatsUpdated: typingsJapgolly.steamUser.mod.EMsg.ClientStatsUpdated & Double = js.native
  
  @js.native
  sealed trait ClientSteamUsageEvent
    extends StObject
       with EMsg
  /* 842 */ val ClientSteamUsageEvent: typingsJapgolly.steamUser.mod.EMsg.ClientSteamUsageEvent & Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStats
    extends StObject
       with EMsg
  /* 820 */ val ClientStoreUserStats: typingsJapgolly.steamUser.mod.EMsg.ClientStoreUserStats & Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStats2
    extends StObject
       with EMsg
  /* 5466 */ val ClientStoreUserStats2: typingsJapgolly.steamUser.mod.EMsg.ClientStoreUserStats2 & Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStatsResponse
    extends StObject
       with EMsg
  /* 821 */ val ClientStoreUserStatsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientStoreUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed
    extends StObject
       with EMsg
  /* 5512 */ val ClientSubscribeToPersonaFeed: typingsJapgolly.steamUser.mod.EMsg.ClientSubscribeToPersonaFeed & Double = js.native
  
  @js.native
  sealed trait ClientSystemIM
    extends StObject
       with EMsg
  /* 726 */ val ClientSystemIM: typingsJapgolly.steamUser.mod.EMsg.ClientSystemIM & Double = js.native
  
  @js.native
  sealed trait ClientSystemIMAck
    extends StObject
       with EMsg
  /* 727 */ val ClientSystemIMAck: typingsJapgolly.steamUser.mod.EMsg.ClientSystemIMAck & Double = js.native
  
  @js.native
  sealed trait ClientTicketAuthComplete
    extends StObject
       with EMsg
  /* 5429 */ val ClientTicketAuthComplete: typingsJapgolly.steamUser.mod.EMsg.ClientTicketAuthComplete & Double = js.native
  
  @js.native
  sealed trait ClientToGC
    extends StObject
       with EMsg
  /* 5452 */ val ClientToGC: typingsJapgolly.steamUser.mod.EMsg.ClientToGC & Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshot
    extends StObject
       with EMsg
  /* 7301 */ val ClientUCMAddScreenshot: typingsJapgolly.steamUser.mod.EMsg.ClientUCMAddScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse
    extends StObject
       with EMsg
  /* 7302 */ val ClientUCMAddScreenshotResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMAddScreenshotResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeletePublishedFile
    extends StObject
       with EMsg
  /* 7315 */ val ClientUCMDeletePublishedFile: typingsJapgolly.steamUser.mod.EMsg.ClientUCMDeletePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse
    extends StObject
       with EMsg
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMDeletePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot
    extends StObject
       with EMsg
  /* 7309 */ val ClientUCMDeleteScreenshot: typingsJapgolly.steamUser.mod.EMsg.ClientUCMDeleteScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse
    extends StObject
       with EMsg
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMDeleteScreenshotResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction
    extends StObject
       with EMsg
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserAction & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse
    extends StObject
       with EMsg
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles
    extends StObject
       with EMsg
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserPublishedFiles & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse
    extends StObject
       with EMsg
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserPublishedFilesResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles
    extends StObject
       with EMsg
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserSubscribedFiles & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse
    extends StObject
       with EMsg
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates
    extends StObject
       with EMsg
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdates & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse
    extends StObject
       with EMsg
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails
    extends StObject
       with EMsg
  /* 7313 */ val ClientUCMGetPublishedFileDetails: typingsJapgolly.steamUser.mod.EMsg.ClientUCMGetPublishedFileDetails & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse
    extends StObject
       with EMsg
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMGetPublishedFileDetailsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser
    extends StObject
       with EMsg
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: typingsJapgolly.steamUser.mod.EMsg.ClientUCMGetPublishedFilesForUser & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse
    extends StObject
       with EMsg
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMGetPublishedFilesForUserResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFile
    extends StObject
       with EMsg
  /* 7311 */ val ClientUCMPublishFile: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFileResponse
    extends StObject
       with EMsg
  /* 7312 */ val ClientUCMPublishFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted
    extends StObject
       with EMsg
  /* 7368 */ val ClientUCMPublishedFileDeleted: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishedFileDeleted & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed
    extends StObject
       with EMsg
  /* 7347 */ val ClientUCMPublishedFileSubscribed: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishedFileSubscribed & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed
    extends StObject
       with EMsg
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishedFileUnsubscribed & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileUpdated
    extends StObject
       with EMsg
  /* 7381 */ val ClientUCMPublishedFileUpdated: typingsJapgolly.steamUser.mod.EMsg.ClientUCMPublishedFileUpdated & Double = js.native
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction
    extends StObject
       with EMsg
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: typingsJapgolly.steamUser.mod.EMsg.ClientUCMSetUserPublishedFileAction & Double = js.native
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse
    extends StObject
       with EMsg
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMSetUserPublishedFileActionResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMSubscribePublishedFile
    extends StObject
       with EMsg
  /* 7319 */ val ClientUCMSubscribePublishedFile: typingsJapgolly.steamUser.mod.EMsg.ClientUCMSubscribePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse
    extends StObject
       with EMsg
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMSubscribePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile
    extends StObject
       with EMsg
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: typingsJapgolly.steamUser.mod.EMsg.ClientUCMUnsubscribePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse
    extends StObject
       with EMsg
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMUnsubscribePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFile
    extends StObject
       with EMsg
  /* 7325 */ val ClientUCMUpdatePublishedFile: typingsJapgolly.steamUser.mod.EMsg.ClientUCMUpdatePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse
    extends StObject
       with EMsg
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUCMUpdatePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUDSInviteToGame
    extends StObject
       with EMsg
  /* 7005 */ val ClientUDSInviteToGame: typingsJapgolly.steamUser.mod.EMsg.ClientUDSInviteToGame & Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded
    extends StObject
       with EMsg
  /* 7002 */ val ClientUDSP2PSessionEnded: typingsJapgolly.steamUser.mod.EMsg.ClientUDSP2PSessionEnded & Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted
    extends StObject
       with EMsg
  /* 7001 */ val ClientUDSP2PSessionStarted: typingsJapgolly.steamUser.mod.EMsg.ClientUDSP2PSessionStarted & Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest
    extends StObject
       with EMsg
  /* 5219 */ val ClientUFSDeleteFileRequest: typingsJapgolly.steamUser.mod.EMsg.ClientUFSDeleteFileRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse
    extends StObject
       with EMsg
  /* 5220 */ val ClientUFSDeleteFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSDeleteFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadChunk
    extends StObject
       with EMsg
  /* 5212 */ val ClientUFSDownloadChunk: typingsJapgolly.steamUser.mod.EMsg.ClientUFSDownloadChunk & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadRequest
    extends StObject
       with EMsg
  /* 5210 */ val ClientUFSDownloadRequest: typingsJapgolly.steamUser.mod.EMsg.ClientUFSDownloadRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadResponse
    extends StObject
       with EMsg
  /* 5211 */ val ClientUFSDownloadResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForApp
    extends StObject
       with EMsg
  /* 5206 */ val ClientUFSGetFileListForApp: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetFileListForApp & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse
    extends StObject
       with EMsg
  /* 5207 */ val ClientUFSGetFileListForAppResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetFileListForAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo
    extends StObject
       with EMsg
  /* 5230 */ val ClientUFSGetSingleFileInfo: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetSingleFileInfo & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse
    extends StObject
       with EMsg
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetSingleFileInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetUGCDetails
    extends StObject
       with EMsg
  /* 5226 */ val ClientUFSGetUGCDetails: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetUGCDetails & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse
    extends StObject
       with EMsg
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSGetUGCDetailsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginRequest
    extends StObject
       with EMsg
  /* 5213 */ val ClientUFSLoginRequest: typingsJapgolly.steamUser.mod.EMsg.ClientUFSLoginRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginResponse
    extends StObject
       with EMsg
  /* 5214 */ val ClientUFSLoginResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSLoginResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFile
    extends StObject
       with EMsg
  /* 5232 */ val ClientUFSShareFile: typingsJapgolly.steamUser.mod.EMsg.ClientUFSShareFile & Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFileResponse
    extends StObject
       with EMsg
  /* 5233 */ val ClientUFSShareFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSShareFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat
    extends StObject
       with EMsg
  /* 5216 */ val ClientUFSTransferHeartbeat: typingsJapgolly.steamUser.mod.EMsg.ClientUFSTransferHeartbeat & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadCommit
    extends StObject
       with EMsg
  /* 5251 */ val ClientUFSUploadCommit: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadCommit & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadCommitResponse
    extends StObject
       with EMsg
  /* 5252 */ val ClientUFSUploadCommitResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadCommitResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileChunk
    extends StObject
       with EMsg
  /* 5204 */ val ClientUFSUploadFileChunk: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadFileChunk & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileFinished
    extends StObject
       with EMsg
  /* 5205 */ val ClientUFSUploadFileFinished: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadFileFinished & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileRequest
    extends StObject
       with EMsg
  /* 5202 */ val ClientUFSUploadFileRequest: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadFileRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileResponse
    extends StObject
       with EMsg
  /* 5203 */ val ClientUFSUploadFileResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUFSUploadFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStats
    extends StObject
       with EMsg
  /* 7901 */ val ClientUGSGetGlobalStats: typingsJapgolly.steamUser.mod.EMsg.ClientUGSGetGlobalStats & Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse
    extends StObject
       with EMsg
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUGSGetGlobalStatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientApp
    extends StObject
       with EMsg
  /* 5522 */ val ClientUninstallClientApp: typingsJapgolly.steamUser.mod.EMsg.ClientUninstallClientApp & Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientAppResponse
    extends StObject
       with EMsg
  /* 5523 */ val ClientUninstallClientAppResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUninstallClientAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientUnlockHEVC
    extends StObject
       with EMsg
  /* 9513 */ val ClientUnlockHEVC: typingsJapgolly.steamUser.mod.EMsg.ClientUnlockHEVC & Double = js.native
  
  @js.native
  sealed trait ClientUnlockHEVCResponse
    extends StObject
       with EMsg
  /* 9514 */ val ClientUnlockHEVCResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUnlockHEVCResponse & Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreaming
    extends StObject
       with EMsg
  /* 9507 */ val ClientUnlockStreaming: typingsJapgolly.steamUser.mod.EMsg.ClientUnlockStreaming & Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreamingResponse
    extends StObject
       with EMsg
  /* 9508 */ val ClientUnlockStreamingResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUnlockStreamingResponse & Double = js.native
  
  @js.native
  sealed trait ClientUpdateChatMetadata
    extends StObject
       with EMsg
  /* 811 */ val ClientUpdateChatMetadata: typingsJapgolly.steamUser.mod.EMsg.ClientUpdateChatMetadata & Double = js.native
  
  @js.native
  sealed trait ClientUpdateGuestPassesList
    extends StObject
       with EMsg
  /* 798 */ val ClientUpdateGuestPassesList: typingsJapgolly.steamUser.mod.EMsg.ClientUpdateGuestPassesList & Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuth
    extends StObject
       with EMsg
  /* 5537 */ val ClientUpdateMachineAuth: typingsJapgolly.steamUser.mod.EMsg.ClientUpdateMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse
    extends StObject
       with EMsg
  /* 5538 */ val ClientUpdateMachineAuthResponse: typingsJapgolly.steamUser.mod.EMsg.ClientUpdateMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientUpdateUserGameInfo
    extends StObject
       with EMsg
  /* 5411 */ val ClientUpdateUserGameInfo: typingsJapgolly.steamUser.mod.EMsg.ClientUpdateUserGameInfo & Double = js.native
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations
    extends StObject
       with EMsg
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: typingsJapgolly.steamUser.mod.EMsg.ClientUseLocalDeviceAuthorizations & Double = js.native
  
  @js.native
  sealed trait ClientUserNotifications
    extends StObject
       with EMsg
  /* 5599 */ val ClientUserNotifications: typingsJapgolly.steamUser.mod.EMsg.ClientUserNotifications & Double = js.native
  
  @js.native
  sealed trait ClientVACBanStatus
    extends StObject
       with EMsg
  /* 782 */ val ClientVACBanStatus: typingsJapgolly.steamUser.mod.EMsg.ClientVACBanStatus & Double = js.native
  
  @js.native
  sealed trait ClientVACChallenge
    extends StObject
       with EMsg
  /* 753 */ val ClientVACChallenge: typingsJapgolly.steamUser.mod.EMsg.ClientVACChallenge & Double = js.native
  
  @js.native
  sealed trait ClientVACResponse
    extends StObject
       with EMsg
  /* 704 */ val ClientVACResponse: typingsJapgolly.steamUser.mod.EMsg.ClientVACResponse & Double = js.native
  
  @js.native
  sealed trait ClientVTTCert
    extends StObject
       with EMsg
  /* 863 */ val ClientVTTCert: typingsJapgolly.steamUser.mod.EMsg.ClientVTTCert & Double = js.native
  
  @js.native
  sealed trait ClientVacStatusQuery
    extends StObject
       with EMsg
  /* 770 */ val ClientVacStatusQuery: typingsJapgolly.steamUser.mod.EMsg.ClientVacStatusQuery & Double = js.native
  
  @js.native
  sealed trait ClientVacStatusResponse
    extends StObject
       with EMsg
  /* 717 */ val ClientVacStatusResponse: typingsJapgolly.steamUser.mod.EMsg.ClientVacStatusResponse & Double = js.native
  
  @js.native
  sealed trait ClientVanityURLChangedNotification
    extends StObject
       with EMsg
  /* 5598 */ val ClientVanityURLChangedNotification: typingsJapgolly.steamUser.mod.EMsg.ClientVanityURLChangedNotification & Double = js.native
  
  @js.native
  sealed trait ClientVerifyPassword
    extends StObject
       with EMsg
  /* 5483 */ val ClientVerifyPassword: typingsJapgolly.steamUser.mod.EMsg.ClientVerifyPassword & Double = js.native
  
  @js.native
  sealed trait ClientVerifyPasswordResponse
    extends StObject
       with EMsg
  /* 5484 */ val ClientVerifyPasswordResponse: typingsJapgolly.steamUser.mod.EMsg.ClientVerifyPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize
    extends StObject
       with EMsg
  /* 9800 */ val ClientVoiceCallPreAuthorize: typingsJapgolly.steamUser.mod.EMsg.ClientVoiceCallPreAuthorize & Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse
    extends StObject
       with EMsg
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: typingsJapgolly.steamUser.mod.EMsg.ClientVoiceCallPreAuthorizeResponse & Double = js.native
  
  @js.native
  sealed trait ClientWalletInfoUpdate
    extends StObject
       with EMsg
  /* 5528 */ val ClientWalletInfoUpdate: typingsJapgolly.steamUser.mod.EMsg.ClientWalletInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest
    extends StObject
       with EMsg
  /* 7382 */ val ClientWorkshopItemChangesRequest: typingsJapgolly.steamUser.mod.EMsg.ClientWorkshopItemChangesRequest & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse
    extends StObject
       with EMsg
  /* 7383 */ val ClientWorkshopItemChangesResponse: typingsJapgolly.steamUser.mod.EMsg.ClientWorkshopItemChangesResponse & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest
    extends StObject
       with EMsg
  /* 7384 */ val ClientWorkshopItemInfoRequest: typingsJapgolly.steamUser.mod.EMsg.ClientWorkshopItemInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse
    extends StObject
       with EMsg
  /* 7385 */ val ClientWorkshopItemInfoResponse: typingsJapgolly.steamUser.mod.EMsg.ClientWorkshopItemInfoResponse & Double = js.native
  
  @js.native
  sealed trait CommunityAddFriendNews
    extends StObject
       with EMsg
  /* 4140 */ val CommunityAddFriendNews: typingsJapgolly.steamUser.mod.EMsg.CommunityAddFriendNews & Double = js.native
  
  @js.native
  sealed trait CommunityDeleteUserNews
    extends StObject
       with EMsg
  /* 4155 */ val CommunityDeleteUserNews: typingsJapgolly.steamUser.mod.EMsg.CommunityDeleteUserNews & Double = js.native
  
  @js.native
  sealed trait CommunityGetUserFriendNews
    extends StObject
       with EMsg
  /* 4173 */ val CommunityGetUserFriendNews: typingsJapgolly.steamUser.mod.EMsg.CommunityGetUserFriendNews & Double = js.native
  
  @js.native
  sealed trait ContentDescriptionDeltaUpdate
    extends StObject
       with EMsg
  /* 246 */ val ContentDescriptionDeltaUpdate: typingsJapgolly.steamUser.mod.EMsg.ContentDescriptionDeltaUpdate & Double = js.native
  
  @js.native
  sealed trait ContentDescriptionUpdate
    extends StObject
       with EMsg
  /* 227 */ val ContentDescriptionUpdate: typingsJapgolly.steamUser.mod.EMsg.ContentDescriptionUpdate & Double = js.native
  
  @js.native
  sealed trait DFSAcceptedResponse
    extends StObject
       with EMsg
  /* 5611 */ val DFSAcceptedResponse: typingsJapgolly.steamUser.mod.EMsg.DFSAcceptedResponse & Double = js.native
  
  @js.native
  sealed trait DFSConnection
    extends StObject
       with EMsg
  /* 5603 */ val DFSConnection: typingsJapgolly.steamUser.mod.EMsg.DFSConnection & Double = js.native
  
  @js.native
  sealed trait DFSConnectionReply
    extends StObject
       with EMsg
  /* 5604 */ val DFSConnectionReply: typingsJapgolly.steamUser.mod.EMsg.DFSConnectionReply & Double = js.native
  
  @js.native
  sealed trait DFSGetFile
    extends StObject
       with EMsg
  /* 5601 */ val DFSGetFile: typingsJapgolly.steamUser.mod.EMsg.DFSGetFile & Double = js.native
  
  @js.native
  sealed trait DFSGetFileFromServer
    extends StObject
       with EMsg
  /* 5610 */ val DFSGetFileFromServer: typingsJapgolly.steamUser.mod.EMsg.DFSGetFileFromServer & Double = js.native
  
  @js.native
  sealed trait DFSInstallLocalFile
    extends StObject
       with EMsg
  /* 5602 */ val DFSInstallLocalFile: typingsJapgolly.steamUser.mod.EMsg.DFSInstallLocalFile & Double = js.native
  
  @js.native
  sealed trait DFSPurgeFile
    extends StObject
       with EMsg
  /* 5608 */ val DFSPurgeFile: typingsJapgolly.steamUser.mod.EMsg.DFSPurgeFile & Double = js.native
  
  @js.native
  sealed trait DFSRecvTransmitFile
    extends StObject
       with EMsg
  /* 5613 */ val DFSRecvTransmitFile: typingsJapgolly.steamUser.mod.EMsg.DFSRecvTransmitFile & Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback
    extends StObject
       with EMsg
  /* 5612 */ val DFSRequestPingback: typingsJapgolly.steamUser.mod.EMsg.DFSRequestPingback & Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback2
    extends StObject
       with EMsg
  /* 5615 */ val DFSRequestPingback2: typingsJapgolly.steamUser.mod.EMsg.DFSRequestPingback2 & Double = js.native
  
  @js.native
  sealed trait DFSResponsePingback2
    extends StObject
       with EMsg
  /* 5616 */ val DFSResponsePingback2: typingsJapgolly.steamUser.mod.EMsg.DFSResponsePingback2 & Double = js.native
  
  @js.native
  sealed trait DFSRouteFile
    extends StObject
       with EMsg
  /* 5609 */ val DFSRouteFile: typingsJapgolly.steamUser.mod.EMsg.DFSRouteFile & Double = js.native
  
  @js.native
  sealed trait DFSRouteFileResponse
    extends StObject
       with EMsg
  /* 5620 */ val DFSRouteFileResponse: typingsJapgolly.steamUser.mod.EMsg.DFSRouteFileResponse & Double = js.native
  
  @js.native
  sealed trait DFSSendTransmitFile
    extends StObject
       with EMsg
  /* 5614 */ val DFSSendTransmitFile: typingsJapgolly.steamUser.mod.EMsg.DFSSendTransmitFile & Double = js.native
  
  @js.native
  sealed trait DFSStartTransfer
    extends StObject
       with EMsg
  /* 5618 */ val DFSStartTransfer: typingsJapgolly.steamUser.mod.EMsg.DFSStartTransfer & Double = js.native
  
  @js.native
  sealed trait DFSTransferComplete
    extends StObject
       with EMsg
  /* 5619 */ val DFSTransferComplete: typingsJapgolly.steamUser.mod.EMsg.DFSTransferComplete & Double = js.native
  
  @js.native
  sealed trait DPAccountCreationStats
    extends StObject
       with EMsg
  /* 1614 */ val DPAccountCreationStats: typingsJapgolly.steamUser.mod.EMsg.DPAccountCreationStats & Double = js.native
  
  @js.native
  sealed trait DPAchievementStats
    extends StObject
       with EMsg
  /* 1613 */ val DPAchievementStats: typingsJapgolly.steamUser.mod.EMsg.DPAchievementStats & Double = js.native
  
  @js.native
  sealed trait DPBlockingStats
    extends StObject
       with EMsg
  /* 1607 */ val DPBlockingStats: typingsJapgolly.steamUser.mod.EMsg.DPBlockingStats & Double = js.native
  
  @js.native
  sealed trait DPCloudStats
    extends StObject
       with EMsg
  /* 1612 */ val DPCloudStats: typingsJapgolly.steamUser.mod.EMsg.DPCloudStats & Double = js.native
  
  @js.native
  sealed trait DPDownloadRateStatistics
    extends StObject
       with EMsg
  /* 1618 */ val DPDownloadRateStatistics: typingsJapgolly.steamUser.mod.EMsg.DPDownloadRateStatistics & Double = js.native
  
  @js.native
  sealed trait DPFacebookStatistics
    extends StObject
       with EMsg
  /* 1619 */ val DPFacebookStatistics: typingsJapgolly.steamUser.mod.EMsg.DPFacebookStatistics & Double = js.native
  
  @js.native
  sealed trait DPGamePlayedStats
    extends StObject
       with EMsg
  /* 1602 */ val DPGamePlayedStats: typingsJapgolly.steamUser.mod.EMsg.DPGamePlayedStats & Double = js.native
  
  @js.native
  sealed trait DPGameServersPlayersStats
    extends StObject
       with EMsg
  /* 1617 */ val DPGameServersPlayersStats: typingsJapgolly.steamUser.mod.EMsg.DPGameServersPlayersStats & Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCount
    extends StObject
       with EMsg
  /* 1615 */ val DPGetPlayerCount: typingsJapgolly.steamUser.mod.EMsg.DPGetPlayerCount & Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCountResponse
    extends StObject
       with EMsg
  /* 1616 */ val DPGetPlayerCountResponse: typingsJapgolly.steamUser.mod.EMsg.DPGetPlayerCountResponse & Double = js.native
  
  @js.native
  sealed trait DPNatTraversalStats
    extends StObject
       with EMsg
  /* 1608 */ val DPNatTraversalStats: typingsJapgolly.steamUser.mod.EMsg.DPNatTraversalStats & Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxns
    extends StObject
       with EMsg
  /* 1628 */ val DPPartnerMicroTxns: typingsJapgolly.steamUser.mod.EMsg.DPPartnerMicroTxns & Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse
    extends StObject
       with EMsg
  /* 1629 */ val DPPartnerMicroTxnsResponse: typingsJapgolly.steamUser.mod.EMsg.DPPartnerMicroTxnsResponse & Double = js.native
  
  @js.native
  sealed trait DPSetPublishingState
    extends StObject
       with EMsg
  /* 1601 */ val DPSetPublishingState: typingsJapgolly.steamUser.mod.EMsg.DPSetPublishingState & Double = js.native
  
  @js.native
  sealed trait DPSteamUsageEvent
    extends StObject
       with EMsg
  /* 1609 */ val DPSteamUsageEvent: typingsJapgolly.steamUser.mod.EMsg.DPSteamUsageEvent & Double = js.native
  
  @js.native
  sealed trait DPStoreSaleStatistics
    extends StObject
       with EMsg
  /* 1624 */ val DPStoreSaleStatistics: typingsJapgolly.steamUser.mod.EMsg.DPStoreSaleStatistics & Double = js.native
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat
    extends StObject
       with EMsg
  /* 1604 */ val DPStreamingUniquePlayersStat: typingsJapgolly.steamUser.mod.EMsg.DPStreamingUniquePlayersStat & Double = js.native
  
  @js.native
  sealed trait DPUniquePlayersStat
    extends StObject
       with EMsg
  /* 1603 */ val DPUniquePlayersStat: typingsJapgolly.steamUser.mod.EMsg.DPUniquePlayersStat & Double = js.native
  
  @js.native
  sealed trait DPUpdateContentEvent
    extends StObject
       with EMsg
  /* 1626 */ val DPUpdateContentEvent: typingsJapgolly.steamUser.mod.EMsg.DPUpdateContentEvent & Double = js.native
  
  @js.native
  sealed trait DPVRUniquePlayersStat
    extends StObject
       with EMsg
  /* 1631 */ val DPVRUniquePlayersStat: typingsJapgolly.steamUser.mod.EMsg.DPVRUniquePlayersStat & Double = js.native
  
  @js.native
  sealed trait DPVacBanStats
    extends StObject
       with EMsg
  /* 1606 */ val DPVacBanStats: typingsJapgolly.steamUser.mod.EMsg.DPVacBanStats & Double = js.native
  
  @js.native
  sealed trait DPVacCafeBanStats
    extends StObject
       with EMsg
  /* 1611 */ val DPVacCafeBanStats: typingsJapgolly.steamUser.mod.EMsg.DPVacCafeBanStats & Double = js.native
  
  @js.native
  sealed trait DPVacCertBanStats
    extends StObject
       with EMsg
  /* 1610 */ val DPVacCertBanStats: typingsJapgolly.steamUser.mod.EMsg.DPVacCertBanStats & Double = js.native
  
  @js.native
  sealed trait DPVacInfractionStats
    extends StObject
       with EMsg
  /* 1605 */ val DPVacInfractionStats: typingsJapgolly.steamUser.mod.EMsg.DPVacInfractionStats & Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdate
    extends StObject
       with EMsg
  /* 640 */ val DRMAdminUpdate: typingsJapgolly.steamUser.mod.EMsg.DRMAdminUpdate & Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdateResponse
    extends StObject
       with EMsg
  /* 641 */ val DRMAdminUpdateResponse: typingsJapgolly.steamUser.mod.EMsg.DRMAdminUpdateResponse & Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobRequest
    extends StObject
       with EMsg
  /* 628 */ val DRMBuildBlobRequest: typingsJapgolly.steamUser.mod.EMsg.DRMBuildBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobResponse
    extends StObject
       with EMsg
  /* 629 */ val DRMBuildBlobResponse: typingsJapgolly.steamUser.mod.EMsg.DRMBuildBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportRequest
    extends StObject
       with EMsg
  /* 637 */ val DRMDetailsReportRequest: typingsJapgolly.steamUser.mod.EMsg.DRMDetailsReportRequest & Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportResponse
    extends StObject
       with EMsg
  /* 638 */ val DRMDetailsReportResponse: typingsJapgolly.steamUser.mod.EMsg.DRMDetailsReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCache
    extends StObject
       with EMsg
  /* 645 */ val DRMEmptyGuidCache: typingsJapgolly.steamUser.mod.EMsg.DRMEmptyGuidCache & Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse
    extends StObject
       with EMsg
  /* 646 */ val DRMEmptyGuidCacheResponse: typingsJapgolly.steamUser.mod.EMsg.DRMEmptyGuidCacheResponse & Double = js.native
  
  @js.native
  sealed trait DRMProcessFile
    extends StObject
       with EMsg
  /* 639 */ val DRMProcessFile: typingsJapgolly.steamUser.mod.EMsg.DRMProcessFile & Double = js.native
  
  @js.native
  sealed trait DRMProcessFileResponse
    extends StObject
       with EMsg
  /* 644 */ val DRMProcessFileResponse: typingsJapgolly.steamUser.mod.EMsg.DRMProcessFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMRange2
    extends StObject
       with EMsg
  /* 7600 */ val DRMRange2: typingsJapgolly.steamUser.mod.EMsg.DRMRange2 & Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidRequest
    extends StObject
       with EMsg
  /* 630 */ val DRMResolveGuidRequest: typingsJapgolly.steamUser.mod.EMsg.DRMResolveGuidRequest & Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidResponse
    extends StObject
       with EMsg
  /* 631 */ val DRMResolveGuidResponse: typingsJapgolly.steamUser.mod.EMsg.DRMResolveGuidResponse & Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSet
    extends StObject
       with EMsg
  /* 7606 */ val DRMSFetchVersionSet: typingsJapgolly.steamUser.mod.EMsg.DRMSFetchVersionSet & Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse
    extends StObject
       with EMsg
  /* 7607 */ val DRMSFetchVersionSetResponse: typingsJapgolly.steamUser.mod.EMsg.DRMSFetchVersionSetResponse & Double = js.native
  
  @js.native
  sealed trait DRMStabilityReport
    extends StObject
       with EMsg
  /* 635 */ val DRMStabilityReport: typingsJapgolly.steamUser.mod.EMsg.DRMStabilityReport & Double = js.native
  
  @js.native
  sealed trait DRMStabilityReportResponse
    extends StObject
       with EMsg
  /* 636 */ val DRMStabilityReportResponse: typingsJapgolly.steamUser.mod.EMsg.DRMStabilityReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMSync
    extends StObject
       with EMsg
  /* 642 */ val DRMSync: typingsJapgolly.steamUser.mod.EMsg.DRMSync & Double = js.native
  
  @js.native
  sealed trait DRMSyncResponse
    extends StObject
       with EMsg
  /* 643 */ val DRMSyncResponse: typingsJapgolly.steamUser.mod.EMsg.DRMSyncResponse & Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReport
    extends StObject
       with EMsg
  /* 633 */ val DRMVariabilityReport: typingsJapgolly.steamUser.mod.EMsg.DRMVariabilityReport & Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReportResponse
    extends StObject
       with EMsg
  /* 634 */ val DRMVariabilityReportResponse: typingsJapgolly.steamUser.mod.EMsg.DRMVariabilityReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcess
    extends StObject
       with EMsg
  /* 9100 */ val DRMWorkerProcess: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcess & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest
    extends StObject
       with EMsg
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessAnalyzeFileRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse
    extends StObject
       with EMsg
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessAnalyzeFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest
    extends StObject
       with EMsg
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessBackfillOriginalRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse
    extends StObject
       with EMsg
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessBackfillOriginalResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign
    extends StObject
       with EMsg
  /* 9100 */ val DRMWorkerProcessDRMAndSign: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessDRMAndSign & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse
    extends StObject
       with EMsg
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessDRMAndSignResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest
    extends StObject
       with EMsg
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessDescribeSecretRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse
    extends StObject
       with EMsg
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessDescribeSecretResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest
    extends StObject
       with EMsg
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessEvaluateCrashRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse
    extends StObject
       with EMsg
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessEvaluateCrashResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest
    extends StObject
       with EMsg
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessExamineBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse
    extends StObject
       with EMsg
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessExamineBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest
    extends StObject
       with EMsg
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessGetBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse
    extends StObject
       with EMsg
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessGetBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest
    extends StObject
       with EMsg
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse
    extends StObject
       with EMsg
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest
    extends StObject
       with EMsg
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallAllRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse
    extends StObject
       with EMsg
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallAllResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest
    extends StObject
       with EMsg
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallDRMDLLRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse
    extends StObject
       with EMsg
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallDRMDLLResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest
    extends StObject
       with EMsg
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallProcessedFilesRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse
    extends StObject
       with EMsg
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessInstallProcessedFilesResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest
    extends StObject
       with EMsg
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSecretIdStringRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse
    extends StObject
       with EMsg
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSecretIdStringResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest
    extends StObject
       with EMsg
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSplitAndInstallRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse
    extends StObject
       with EMsg
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSplitAndInstallResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest
    extends StObject
       with EMsg
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSteamworksInfoRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse
    extends StObject
       with EMsg
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessSteamworksInfoResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest
    extends StObject
       with EMsg
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessUnpackBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse
    extends StObject
       with EMsg
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessUnpackBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest
    extends StObject
       with EMsg
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessValidateDRMDLLRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse
    extends StObject
       with EMsg
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessValidateDRMDLLResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest
    extends StObject
       with EMsg
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessValidateFileRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse
    extends StObject
       with EMsg
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: typingsJapgolly.steamUser.mod.EMsg.DRMWorkerProcessValidateFileResponse & Double = js.native
  
  @js.native
  sealed trait DSSCurrentFileList
    extends StObject
       with EMsg
  /* 1802 */ val DSSCurrentFileList: typingsJapgolly.steamUser.mod.EMsg.DSSCurrentFileList & Double = js.native
  
  @js.native
  sealed trait DSSNewFile
    extends StObject
       with EMsg
  /* 1801 */ val DSSNewFile: typingsJapgolly.steamUser.mod.EMsg.DSSNewFile & Double = js.native
  
  @js.native
  sealed trait DSSSynchList
    extends StObject
       with EMsg
  /* 1803 */ val DSSSynchList: typingsJapgolly.steamUser.mod.EMsg.DSSSynchList & Double = js.native
  
  @js.native
  sealed trait DSSSynchListResponse
    extends StObject
       with EMsg
  /* 1804 */ val DSSSynchListResponse: typingsJapgolly.steamUser.mod.EMsg.DSSSynchListResponse & Double = js.native
  
  @js.native
  sealed trait DSSSynchSubscribe
    extends StObject
       with EMsg
  /* 1805 */ val DSSSynchSubscribe: typingsJapgolly.steamUser.mod.EMsg.DSSSynchSubscribe & Double = js.native
  
  @js.native
  sealed trait DSSSynchUnsubscribe
    extends StObject
       with EMsg
  /* 1806 */ val DSSSynchUnsubscribe: typingsJapgolly.steamUser.mod.EMsg.DSSSynchUnsubscribe & Double = js.native
  
  @js.native
  sealed trait DestJobFailed
    extends StObject
       with EMsg
  /* 113 */ val DestJobFailed: typingsJapgolly.steamUser.mod.EMsg.DestJobFailed & Double = js.native
  
  @js.native
  sealed trait DeviceAuthorizationBase
    extends StObject
       with EMsg
  /* 6500 */ val DeviceAuthorizationBase: typingsJapgolly.steamUser.mod.EMsg.DeviceAuthorizationBase & Double = js.native
  
  @js.native
  sealed trait DirRequest
    extends StObject
       with EMsg
  /* 202 */ val DirRequest: typingsJapgolly.steamUser.mod.EMsg.DirRequest & Double = js.native
  
  @js.native
  sealed trait DirResponse
    extends StObject
       with EMsg
  /* 203 */ val DirResponse: typingsJapgolly.steamUser.mod.EMsg.DirResponse & Double = js.native
  
  @js.native
  sealed trait EPMRestartProcess
    extends StObject
       with EMsg
  /* 1903 */ val EPMRestartProcess: typingsJapgolly.steamUser.mod.EMsg.EPMRestartProcess & Double = js.native
  
  @js.native
  sealed trait EPMStartProcess
    extends StObject
       with EMsg
  /* 1901 */ val EPMStartProcess: typingsJapgolly.steamUser.mod.EMsg.EPMStartProcess & Double = js.native
  
  @js.native
  sealed trait EPMStopProcess
    extends StObject
       with EMsg
  /* 1902 */ val EPMStopProcess: typingsJapgolly.steamUser.mod.EMsg.EPMStopProcess & Double = js.native
  
  @js.native
  sealed trait EconBase
    extends StObject
       with EMsg
  /* 7700 */ val EconBase: typingsJapgolly.steamUser.mod.EMsg.EconBase & Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransaction
    extends StObject
       with EMsg
  /* 7711 */ val EconCDKeyProcessTransaction: typingsJapgolly.steamUser.mod.EMsg.EconCDKeyProcessTransaction & Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse
    extends StObject
       with EMsg
  /* 7712 */ val EconCDKeyProcessTransactionResponse: typingsJapgolly.steamUser.mod.EMsg.EconCDKeyProcessTransactionResponse & Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCache
    extends StObject
       with EMsg
  /* 7707 */ val EconFlushInventoryCache: typingsJapgolly.steamUser.mod.EMsg.EconFlushInventoryCache & Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse
    extends StObject
       with EMsg
  /* 7708 */ val EconFlushInventoryCacheResponse: typingsJapgolly.steamUser.mod.EMsg.EconFlushInventoryCacheResponse & Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogs
    extends StObject
       with EMsg
  /* 7713 */ val EconGetErrorLogs: typingsJapgolly.steamUser.mod.EMsg.EconGetErrorLogs & Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogsResponse
    extends StObject
       with EMsg
  /* 7714 */ val EconGetErrorLogsResponse: typingsJapgolly.steamUser.mod.EMsg.EconGetErrorLogsResponse & Double = js.native
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest
    extends StObject
       with EMsg
  /* 7706 */ val EconTrading_CancelTradeRequest: typingsJapgolly.steamUser.mod.EMsg.EconTrading_CancelTradeRequest & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed
    extends StObject
       with EMsg
  /* 7702 */ val EconTrading_InitiateTradeProposed: typingsJapgolly.steamUser.mod.EMsg.EconTrading_InitiateTradeProposed & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest
    extends StObject
       with EMsg
  /* 7701 */ val EconTrading_InitiateTradeRequest: typingsJapgolly.steamUser.mod.EMsg.EconTrading_InitiateTradeRequest & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse
    extends StObject
       with EMsg
  /* 7703 */ val EconTrading_InitiateTradeResponse: typingsJapgolly.steamUser.mod.EMsg.EconTrading_InitiateTradeResponse & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult
    extends StObject
       with EMsg
  /* 7704 */ val EconTrading_InitiateTradeResult: typingsJapgolly.steamUser.mod.EMsg.EconTrading_InitiateTradeResult & Double = js.native
  
  @js.native
  sealed trait EconTrading_StartSession
    extends StObject
       with EMsg
  /* 7705 */ val EconTrading_StartSession: typingsJapgolly.steamUser.mod.EMsg.EconTrading_StartSession & Double = js.native
  
  @js.native
  sealed trait EnsureExecuteScheduledTaskResponse_TEST
    extends StObject
       with EMsg
  /* 243 */ val EnsureExecuteScheduledTaskResponse_TEST: typingsJapgolly.steamUser.mod.EMsg.EnsureExecuteScheduledTaskResponse_TEST & Double = js.native
  
  @js.native
  sealed trait EnsureExecuteScheduledTask_TEST
    extends StObject
       with EMsg
  /* 242 */ val EnsureExecuteScheduledTask_TEST: typingsJapgolly.steamUser.mod.EMsg.EnsureExecuteScheduledTask_TEST & Double = js.native
  
  @js.native
  sealed trait Exit
    extends StObject
       with EMsg
  /* 201 */ val Exit: typingsJapgolly.steamUser.mod.EMsg.Exit & Double = js.native
  
  @js.native
  sealed trait ExitShell
    extends StObject
       with EMsg
  /* 308 */ val ExitShell: typingsJapgolly.steamUser.mod.EMsg.ExitShell & Double = js.native
  
  @js.native
  sealed trait ExitShells
    extends StObject
       with EMsg
  /* 307 */ val ExitShells: typingsJapgolly.steamUser.mod.EMsg.ExitShells & Double = js.native
  
  @js.native
  sealed trait ExpectShellRestart
    extends StObject
       with EMsg
  /* 336 */ val ExpectShellRestart: typingsJapgolly.steamUser.mod.EMsg.ExpectShellRestart & Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCred
    extends StObject
       with EMsg
  /* 1119 */ val FBSApplyAccountCred: typingsJapgolly.steamUser.mod.EMsg.FBSApplyAccountCred & Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCredResponse
    extends StObject
       with EMsg
  /* 1120 */ val FBSApplyAccountCredResponse: typingsJapgolly.steamUser.mod.EMsg.FBSApplyAccountCredResponse & Double = js.native
  
  @js.native
  sealed trait FBSApplyOSUpdates
    extends StObject
       with EMsg
  /* 1108 */ val FBSApplyOSUpdates: typingsJapgolly.steamUser.mod.EMsg.FBSApplyOSUpdates & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk
    extends StObject
       with EMsg
  /* 1130 */ val FBSBootstrapperGetPackageChunk: typingsJapgolly.steamUser.mod.EMsg.FBSBootstrapperGetPackageChunk & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse
    extends StObject
       with EMsg
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: typingsJapgolly.steamUser.mod.EMsg.FBSBootstrapperGetPackageChunkResponse & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest
    extends StObject
       with EMsg
  /* 1128 */ val FBSBootstrapperPackageRequest: typingsJapgolly.steamUser.mod.EMsg.FBSBootstrapperPackageRequest & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse
    extends StObject
       with EMsg
  /* 1129 */ val FBSBootstrapperPackageResponse: typingsJapgolly.steamUser.mod.EMsg.FBSBootstrapperPackageResponse & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress
    extends StObject
       with EMsg
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: typingsJapgolly.steamUser.mod.EMsg.FBSBootstrapperPackageTransferProgress & Double = js.native
  
  @js.native
  sealed trait FBSConnectionData
    extends StObject
       with EMsg
  /* 1027 */ val FBSConnectionData: typingsJapgolly.steamUser.mod.EMsg.FBSConnectionData & Double = js.native
  
  @js.native
  sealed trait FBSDeployHotFixPackage
    extends StObject
       with EMsg
  /* 1114 */ val FBSDeployHotFixPackage: typingsJapgolly.steamUser.mod.EMsg.FBSDeployHotFixPackage & Double = js.native
  
  @js.native
  sealed trait FBSDeployHotFixResponse
    extends StObject
       with EMsg
  /* 1115 */ val FBSDeployHotFixResponse: typingsJapgolly.steamUser.mod.EMsg.FBSDeployHotFixResponse & Double = js.native
  
  @js.native
  sealed trait FBSDeployPackage
    extends StObject
       with EMsg
  /* 1104 */ val FBSDeployPackage: typingsJapgolly.steamUser.mod.EMsg.FBSDeployPackage & Double = js.native
  
  @js.native
  sealed trait FBSDeployResponse
    extends StObject
       with EMsg
  /* 1105 */ val FBSDeployResponse: typingsJapgolly.steamUser.mod.EMsg.FBSDeployResponse & Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFix
    extends StObject
       with EMsg
  /* 1116 */ val FBSDownloadHotFix: typingsJapgolly.steamUser.mod.EMsg.FBSDownloadHotFix & Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFixResponse
    extends StObject
       with EMsg
  /* 1117 */ val FBSDownloadHotFixResponse: typingsJapgolly.steamUser.mod.EMsg.FBSDownloadHotFixResponse & Double = js.native
  
  @js.native
  sealed trait FBSForceBounce
    extends StObject
       with EMsg
  /* 1103 */ val FBSForceBounce: typingsJapgolly.steamUser.mod.EMsg.FBSForceBounce & Double = js.native
  
  @js.native
  sealed trait FBSForceRefresh
    extends StObject
       with EMsg
  /* 1102 */ val FBSForceRefresh: typingsJapgolly.steamUser.mod.EMsg.FBSForceRefresh & Double = js.native
  
  @js.native
  sealed trait FBSInfoFromBootstrapper
    extends StObject
       with EMsg
  /* 1126 */ val FBSInfoFromBootstrapper: typingsJapgolly.steamUser.mod.EMsg.FBSInfoFromBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSMinidumpServer
    extends StObject
       with EMsg
  /* 1112 */ val FBSMinidumpServer: typingsJapgolly.steamUser.mod.EMsg.FBSMinidumpServer & Double = js.native
  
  @js.native
  sealed trait FBSPauseFrozenDumps
    extends StObject
       with EMsg
  /* 1134 */ val FBSPauseFrozenDumps: typingsJapgolly.steamUser.mod.EMsg.FBSPauseFrozenDumps & Double = js.native
  
  @js.native
  sealed trait FBSQueryGMForRequest
    extends StObject
       with EMsg
  /* 1123 */ val FBSQueryGMForRequest: typingsJapgolly.steamUser.mod.EMsg.FBSQueryGMForRequest & Double = js.native
  
  @js.native
  sealed trait FBSQueryGMResponse
    extends StObject
       with EMsg
  /* 1124 */ val FBSQueryGMResponse: typingsJapgolly.steamUser.mod.EMsg.FBSQueryGMResponse & Double = js.native
  
  @js.native
  sealed trait FBSRebootBox
    extends StObject
       with EMsg
  /* 1110 */ val FBSRebootBox: typingsJapgolly.steamUser.mod.EMsg.FBSRebootBox & Double = js.native
  
  @js.native
  sealed trait FBSRebootBoxResponse
    extends StObject
       with EMsg
  /* 1127 */ val FBSRebootBoxResponse: typingsJapgolly.steamUser.mod.EMsg.FBSRebootBoxResponse & Double = js.native
  
  @js.native
  sealed trait FBSReqVersion
    extends StObject
       with EMsg
  /* 1100 */ val FBSReqVersion: typingsJapgolly.steamUser.mod.EMsg.FBSReqVersion & Double = js.native
  
  @js.native
  sealed trait FBSRestartBootstrapper
    extends StObject
       with EMsg
  /* 1133 */ val FBSRestartBootstrapper: typingsJapgolly.steamUser.mod.EMsg.FBSRestartBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSRunCMDScript
    extends StObject
       with EMsg
  /* 1109 */ val FBSRunCMDScript: typingsJapgolly.steamUser.mod.EMsg.FBSRunCMDScript & Double = js.native
  
  @js.native
  sealed trait FBSSetBigBrotherMode
    extends StObject
       with EMsg
  /* 1111 */ val FBSSetBigBrotherMode: typingsJapgolly.steamUser.mod.EMsg.FBSSetBigBrotherMode & Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount
    extends StObject
       with EMsg
  /* 1121 */ val FBSSetShellCount: typingsJapgolly.steamUser.mod.EMsg.FBSSetShellCount & Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount_obsolete
    extends StObject
       with EMsg
  /* 1113 */ val FBSSetShellCount_obsolete: typingsJapgolly.steamUser.mod.EMsg.FBSSetShellCount_obsolete & Double = js.native
  
  @js.native
  sealed trait FBSSetState
    extends StObject
       with EMsg
  /* 1107 */ val FBSSetState: typingsJapgolly.steamUser.mod.EMsg.FBSSetState & Double = js.native
  
  @js.native
  sealed trait FBSTerminateShell
    extends StObject
       with EMsg
  /* 1122 */ val FBSTerminateShell: typingsJapgolly.steamUser.mod.EMsg.FBSTerminateShell & Double = js.native
  
  @js.native
  sealed trait FBSTerminateZombies
    extends StObject
       with EMsg
  /* 1125 */ val FBSTerminateZombies: typingsJapgolly.steamUser.mod.EMsg.FBSTerminateZombies & Double = js.native
  
  @js.native
  sealed trait FBSUpdateBootstrapper
    extends StObject
       with EMsg
  /* 1106 */ val FBSUpdateBootstrapper: typingsJapgolly.steamUser.mod.EMsg.FBSUpdateBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile
    extends StObject
       with EMsg
  /* 1118 */ val FBSUpdateTargetConfigFile: typingsJapgolly.steamUser.mod.EMsg.FBSUpdateTargetConfigFile & Double = js.native
  
  @js.native
  sealed trait FBSVersionInfo
    extends StObject
       with EMsg
  /* 1101 */ val FBSVersionInfo: typingsJapgolly.steamUser.mod.EMsg.FBSVersionInfo & Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollower
    extends StObject
       with EMsg
  /* 7510 */ val FSAddOrRemoveFollower: typingsJapgolly.steamUser.mod.EMsg.FSAddOrRemoveFollower & Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse
    extends StObject
       with EMsg
  /* 7511 */ val FSAddOrRemoveFollowerResponse: typingsJapgolly.steamUser.mod.EMsg.FSAddOrRemoveFollowerResponse & Double = js.native
  
  @js.native
  sealed trait FSBase
    extends StObject
       with EMsg
  /* 7500 */ val FSBase: typingsJapgolly.steamUser.mod.EMsg.FSBase & Double = js.native
  
  @js.native
  sealed trait FSCommentNotification
    extends StObject
       with EMsg
  /* 7513 */ val FSCommentNotification: typingsJapgolly.steamUser.mod.EMsg.FSCommentNotification & Double = js.native
  
  @js.native
  sealed trait FSCommentNotificationViewed
    extends StObject
       with EMsg
  /* 7514 */ val FSCommentNotificationViewed: typingsJapgolly.steamUser.mod.EMsg.FSCommentNotificationViewed & Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrix
    extends StObject
       with EMsg
  /* 7506 */ val FSComputeFrenematrix: typingsJapgolly.steamUser.mod.EMsg.FSComputeFrenematrix & Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrixResponse
    extends StObject
       with EMsg
  /* 7507 */ val FSComputeFrenematrixResponse: typingsJapgolly.steamUser.mod.EMsg.FSComputeFrenematrixResponse & Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCount
    extends StObject
       with EMsg
  /* 7521 */ val FSGetPendingNotificationCount: typingsJapgolly.steamUser.mod.EMsg.FSGetPendingNotificationCount & Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse
    extends StObject
       with EMsg
  /* 7522 */ val FSGetPendingNotificationCountResponse: typingsJapgolly.steamUser.mod.EMsg.FSGetPendingNotificationCountResponse & Double = js.native
  
  @js.native
  sealed trait FSPlayStatusNotification
    extends StObject
       with EMsg
  /* 7508 */ val FSPlayStatusNotification: typingsJapgolly.steamUser.mod.EMsg.FSPlayStatusNotification & Double = js.native
  
  @js.native
  sealed trait FSPublishPersonaStatus
    extends StObject
       with EMsg
  /* 7509 */ val FSPublishPersonaStatus: typingsJapgolly.steamUser.mod.EMsg.FSPublishPersonaStatus & Double = js.native
  
  @js.native
  sealed trait FSRequestFriendData
    extends StObject
       with EMsg
  /* 7530 */ val FSRequestFriendData: typingsJapgolly.steamUser.mod.EMsg.FSRequestFriendData & Double = js.native
  
  @js.native
  sealed trait FSRichPresenceRequest
    extends StObject
       with EMsg
  /* 7504 */ val FSRichPresenceRequest: typingsJapgolly.steamUser.mod.EMsg.FSRichPresenceRequest & Double = js.native
  
  @js.native
  sealed trait FSRichPresenceResponse
    extends StObject
       with EMsg
  /* 7505 */ val FSRichPresenceResponse: typingsJapgolly.steamUser.mod.EMsg.FSRichPresenceResponse & Double = js.native
  
  @js.native
  sealed trait FSUpdateFollowingList
    extends StObject
       with EMsg
  /* 7512 */ val FSUpdateFollowingList: typingsJapgolly.steamUser.mod.EMsg.FSUpdateFollowingList & Double = js.native
  
  @js.native
  sealed trait FTSBrowseClans
    extends StObject
       with EMsg
  /* 3103 */ val FTSBrowseClans: typingsJapgolly.steamUser.mod.EMsg.FTSBrowseClans & Double = js.native
  
  @js.native
  sealed trait FTSBrowseClansResponse
    extends StObject
       with EMsg
  /* 3104 */ val FTSBrowseClansResponse: typingsJapgolly.steamUser.mod.EMsg.FTSBrowseClansResponse & Double = js.native
  
  @js.native
  sealed trait FTSClanDeleted
    extends StObject
       with EMsg
  /* 3109 */ val FTSClanDeleted: typingsJapgolly.steamUser.mod.EMsg.FTSClanDeleted & Double = js.native
  
  @js.native
  sealed trait FTSGetBrowseCounts
    extends StObject
       with EMsg
  /* 3101 */ val FTSGetBrowseCounts: typingsJapgolly.steamUser.mod.EMsg.FTSGetBrowseCounts & Double = js.native
  
  @js.native
  sealed trait FTSGetBrowseCountsResponse
    extends StObject
       with EMsg
  /* 3102 */ val FTSGetBrowseCountsResponse: typingsJapgolly.steamUser.mod.EMsg.FTSGetBrowseCountsResponse & Double = js.native
  
  @js.native
  sealed trait FTSGetGSPlayStats
    extends StObject
       with EMsg
  /* 3114 */ val FTSGetGSPlayStats: typingsJapgolly.steamUser.mod.EMsg.FTSGetGSPlayStats & Double = js.native
  
  @js.native
  sealed trait FTSGetGSPlayStatsForServer
    extends StObject
       with EMsg
  /* 3116 */ val FTSGetGSPlayStatsForServer: typingsJapgolly.steamUser.mod.EMsg.FTSGetGSPlayStatsForServer & Double = js.native
  
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse
    extends StObject
       with EMsg
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: typingsJapgolly.steamUser.mod.EMsg.FTSGetGSPlayStatsForServerResponse & Double = js.native
  
  @js.native
  sealed trait FTSGetGSPlayStatsResponse
    extends StObject
       with EMsg
  /* 3115 */ val FTSGetGSPlayStatsResponse: typingsJapgolly.steamUser.mod.EMsg.FTSGetGSPlayStatsResponse & Double = js.native
  
  @js.native
  sealed trait FTSReportIPUpdates
    extends StObject
       with EMsg
  /* 3118 */ val FTSReportIPUpdates: typingsJapgolly.steamUser.mod.EMsg.FTSReportIPUpdates & Double = js.native
  
  @js.native
  sealed trait FTSSearch
    extends StObject
       with EMsg
  /* 3110 */ val FTSSearch: typingsJapgolly.steamUser.mod.EMsg.FTSSearch & Double = js.native
  
  @js.native
  sealed trait FTSSearchClansByLocation
    extends StObject
       with EMsg
  /* 3105 */ val FTSSearchClansByLocation: typingsJapgolly.steamUser.mod.EMsg.FTSSearchClansByLocation & Double = js.native
  
  @js.native
  sealed trait FTSSearchClansByLocationResponse
    extends StObject
       with EMsg
  /* 3106 */ val FTSSearchClansByLocationResponse: typingsJapgolly.steamUser.mod.EMsg.FTSSearchClansByLocationResponse & Double = js.native
  
  @js.native
  sealed trait FTSSearchPlayersByLocation
    extends StObject
       with EMsg
  /* 3107 */ val FTSSearchPlayersByLocation: typingsJapgolly.steamUser.mod.EMsg.FTSSearchPlayersByLocation & Double = js.native
  
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse
    extends StObject
       with EMsg
  /* 3108 */ val FTSSearchPlayersByLocationResponse: typingsJapgolly.steamUser.mod.EMsg.FTSSearchPlayersByLocationResponse & Double = js.native
  
  @js.native
  sealed trait FTSSearchResponse
    extends StObject
       with EMsg
  /* 3111 */ val FTSSearchResponse: typingsJapgolly.steamUser.mod.EMsg.FTSSearchResponse & Double = js.native
  
  @js.native
  sealed trait FTSSearchStatus
    extends StObject
       with EMsg
  /* 3112 */ val FTSSearchStatus: typingsJapgolly.steamUser.mod.EMsg.FTSSearchStatus & Double = js.native
  
  @js.native
  sealed trait FTSSearchStatusResponse
    extends StObject
       with EMsg
  /* 3113 */ val FTSSearchStatusResponse: typingsJapgolly.steamUser.mod.EMsg.FTSSearchStatusResponse & Double = js.native
  
  @js.native
  sealed trait FailServer
    extends StObject
       with EMsg
  /* 3000 */ val FailServer: typingsJapgolly.steamUser.mod.EMsg.FailServer & Double = js.native
  
  @js.native
  sealed trait FileXferData
    extends StObject
       with EMsg
  /* 1202 */ val FileXferData: typingsJapgolly.steamUser.mod.EMsg.FileXferData & Double = js.native
  
  @js.native
  sealed trait FileXferDataAck
    extends StObject
       with EMsg
  /* 1204 */ val FileXferDataAck: typingsJapgolly.steamUser.mod.EMsg.FileXferDataAck & Double = js.native
  
  @js.native
  sealed trait FileXferEnd
    extends StObject
       with EMsg
  /* 1203 */ val FileXferEnd: typingsJapgolly.steamUser.mod.EMsg.FileXferEnd & Double = js.native
  
  @js.native
  sealed trait FileXferRequest
    extends StObject
       with EMsg
  /* 1200 */ val FileXferRequest: typingsJapgolly.steamUser.mod.EMsg.FileXferRequest & Double = js.native
  
  @js.native
  sealed trait FileXferResponse
    extends StObject
       with EMsg
  /* 1201 */ val FileXferResponse: typingsJapgolly.steamUser.mod.EMsg.FileXferResponse & Double = js.native
  
  @js.native
  sealed trait GCAchievementAwarded
    extends StObject
       with EMsg
  /* 2212 */ val GCAchievementAwarded: typingsJapgolly.steamUser.mod.EMsg.GCAchievementAwarded & Double = js.native
  
  @js.native
  sealed trait GCCmdBounce
    extends StObject
       with EMsg
  /* 2204 */ val GCCmdBounce: typingsJapgolly.steamUser.mod.EMsg.GCCmdBounce & Double = js.native
  
  @js.native
  sealed trait GCCmdDeploy
    extends StObject
       with EMsg
  /* 2207 */ val GCCmdDeploy: typingsJapgolly.steamUser.mod.EMsg.GCCmdDeploy & Double = js.native
  
  @js.native
  sealed trait GCCmdDeployResponse
    extends StObject
       with EMsg
  /* 2208 */ val GCCmdDeployResponse: typingsJapgolly.steamUser.mod.EMsg.GCCmdDeployResponse & Double = js.native
  
  @js.native
  sealed trait GCCmdDown
    extends StObject
       with EMsg
  /* 2206 */ val GCCmdDown: typingsJapgolly.steamUser.mod.EMsg.GCCmdDown & Double = js.native
  
  @js.native
  sealed trait GCCmdForceBounce
    extends StObject
       with EMsg
  /* 2205 */ val GCCmdForceBounce: typingsJapgolly.steamUser.mod.EMsg.GCCmdForceBounce & Double = js.native
  
  @js.native
  sealed trait GCCmdRevive
    extends StObject
       with EMsg
  /* 2203 */ val GCCmdRevive: typingsJapgolly.steamUser.mod.EMsg.GCCmdRevive & Double = js.native
  
  @js.native
  sealed trait GCCmdStatus
    extends StObject
       with EMsg
  /* 2216 */ val GCCmdStatus: typingsJapgolly.steamUser.mod.EMsg.GCCmdStatus & Double = js.native
  
  @js.native
  sealed trait GCCmdSwitch
    extends StObject
       with EMsg
  /* 2209 */ val GCCmdSwitch: typingsJapgolly.steamUser.mod.EMsg.GCCmdSwitch & Double = js.native
  
  @js.native
  sealed trait GCGetAccountDetails
    extends StObject
       with EMsg
  /* 2218 */ val GCGetAccountDetails: typingsJapgolly.steamUser.mod.EMsg.GCGetAccountDetails & Double = js.native
  
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED
    extends StObject
       with EMsg
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: typingsJapgolly.steamUser.mod.EMsg.GCGetAccountDetails_DEPRECATED & Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplate
    extends StObject
       with EMsg
  /* 2220 */ val GCGetEmailTemplate: typingsJapgolly.steamUser.mod.EMsg.GCGetEmailTemplate & Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplateResponse
    extends StObject
       with EMsg
  /* 2221 */ val GCGetEmailTemplateResponse: typingsJapgolly.steamUser.mod.EMsg.GCGetEmailTemplateResponse & Double = js.native
  
  @js.native
  sealed trait GCHAccountLockStatusChange
    extends StObject
       with EMsg
  /* 2234 */ val GCHAccountLockStatusChange: typingsJapgolly.steamUser.mod.EMsg.GCHAccountLockStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange
    extends StObject
       with EMsg
  /* 2236 */ val GCHAccountPhoneNumberChange: typingsJapgolly.steamUser.mod.EMsg.GCHAccountPhoneNumberChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange
    extends StObject
       with EMsg
  /* 2233 */ val GCHAccountTradeBanStatusChange: typingsJapgolly.steamUser.mod.EMsg.GCHAccountTradeBanStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountTwoFactorChange
    extends StObject
       with EMsg
  /* 2237 */ val GCHAccountTwoFactorChange: typingsJapgolly.steamUser.mod.EMsg.GCHAccountTwoFactorChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountVacStatusChange
    extends StObject
       with EMsg
  /* 2228 */ val GCHAccountVacStatusChange: typingsJapgolly.steamUser.mod.EMsg.GCHAccountVacStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHInviteUserToLobby
    extends StObject
       with EMsg
  /* 2238 */ val GCHInviteUserToLobby: typingsJapgolly.steamUser.mod.EMsg.GCHInviteUserToLobby & Double = js.native
  
  @js.native
  sealed trait GCHKillGC
    extends StObject
       with EMsg
  /* 2231 */ val GCHKillGC: typingsJapgolly.steamUser.mod.EMsg.GCHKillGC & Double = js.native
  
  @js.native
  sealed trait GCHKillGCResponse
    extends StObject
       with EMsg
  /* 2232 */ val GCHKillGCResponse: typingsJapgolly.steamUser.mod.EMsg.GCHKillGCResponse & Double = js.native
  
  @js.native
  sealed trait GCHRelay
    extends StObject
       with EMsg
  /* 2222 */ val GCHRelay: typingsJapgolly.steamUser.mod.EMsg.GCHRelay & Double = js.native
  
  @js.native
  sealed trait GCHRelayClientToIS
    extends StObject
       with EMsg
  /* 2223 */ val GCHRelayClientToIS: typingsJapgolly.steamUser.mod.EMsg.GCHRelayClientToIS & Double = js.native
  
  @js.native
  sealed trait GCHRelayToClient
    extends StObject
       with EMsg
  /* 2223 */ val GCHRelayToClient: typingsJapgolly.steamUser.mod.EMsg.GCHRelayToClient & Double = js.native
  
  @js.native
  sealed trait GCHRequestStatus
    extends StObject
       with EMsg
  /* 2226 */ val GCHRequestStatus: typingsJapgolly.steamUser.mod.EMsg.GCHRequestStatus & Double = js.native
  
  @js.native
  sealed trait GCHRequestStatusResponse
    extends StObject
       with EMsg
  /* 2227 */ val GCHRequestStatusResponse: typingsJapgolly.steamUser.mod.EMsg.GCHRequestStatusResponse & Double = js.native
  
  @js.native
  sealed trait GCHRequestUpdateSession
    extends StObject
       with EMsg
  /* 2225 */ val GCHRequestUpdateSession: typingsJapgolly.steamUser.mod.EMsg.GCHRequestUpdateSession & Double = js.native
  
  @js.native
  sealed trait GCHSpawnGC
    extends StObject
       with EMsg
  /* 2229 */ val GCHSpawnGC: typingsJapgolly.steamUser.mod.EMsg.GCHSpawnGC & Double = js.native
  
  @js.native
  sealed trait GCHSpawnGCResponse
    extends StObject
       with EMsg
  /* 2230 */ val GCHSpawnGCResponse: typingsJapgolly.steamUser.mod.EMsg.GCHSpawnGCResponse & Double = js.native
  
  @js.native
  sealed trait GCHUpdateSession
    extends StObject
       with EMsg
  /* 2224 */ val GCHUpdateSession: typingsJapgolly.steamUser.mod.EMsg.GCHUpdateSession & Double = js.native
  
  @js.native
  sealed trait GCHVacVerificationChange
    extends StObject
       with EMsg
  /* 2235 */ val GCHVacVerificationChange: typingsJapgolly.steamUser.mod.EMsg.GCHVacVerificationChange & Double = js.native
  
  @js.native
  sealed trait GCInterAppMessage
    extends StObject
       with EMsg
  /* 2219 */ val GCInterAppMessage: typingsJapgolly.steamUser.mod.EMsg.GCInterAppMessage & Double = js.native
  
  @js.native
  sealed trait GCRegisterWebInterfaces
    extends StObject
       with EMsg
  /* 2217 */ val GCRegisterWebInterfaces: typingsJapgolly.steamUser.mod.EMsg.GCRegisterWebInterfaces & Double = js.native
  
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated
    extends StObject
       with EMsg
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: typingsJapgolly.steamUser.mod.EMsg.GCRegisterWebInterfaces_Deprecated & Double = js.native
  
  @js.native
  sealed trait GCSendClient
    extends StObject
       with EMsg
  /* 2200 */ val GCSendClient: typingsJapgolly.steamUser.mod.EMsg.GCSendClient & Double = js.native
  
  @js.native
  sealed trait GCSystemMessage
    extends StObject
       with EMsg
  /* 2213 */ val GCSystemMessage: typingsJapgolly.steamUser.mod.EMsg.GCSystemMessage & Double = js.native
  
  @js.native
  sealed trait GCUpdateGSState
    extends StObject
       with EMsg
  /* 2211 */ val GCUpdateGSState: typingsJapgolly.steamUser.mod.EMsg.GCUpdateGSState & Double = js.native
  
  @js.native
  sealed trait GCUpdatePlayedState
    extends StObject
       with EMsg
  /* 2202 */ val GCUpdatePlayedState: typingsJapgolly.steamUser.mod.EMsg.GCUpdatePlayedState & Double = js.native
  
  @js.native
  sealed trait GCValidateSession
    extends StObject
       with EMsg
  /* 2214 */ val GCValidateSession: typingsJapgolly.steamUser.mod.EMsg.GCValidateSession & Double = js.native
  
  @js.native
  sealed trait GCValidateSessionResponse
    extends StObject
       with EMsg
  /* 2215 */ val GCValidateSessionResponse: typingsJapgolly.steamUser.mod.EMsg.GCValidateSessionResponse & Double = js.native
  
  @js.native
  sealed trait GMConvertUserWallets
    extends StObject
       with EMsg
  /* 333 */ val GMConvertUserWallets: typingsJapgolly.steamUser.mod.EMsg.GMConvertUserWallets & Double = js.native
  
  @js.native
  sealed trait GMDRMSync
    extends StObject
       with EMsg
  /* 320 */ val GMDRMSync: typingsJapgolly.steamUser.mod.EMsg.GMDRMSync & Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRouting
    extends StObject
       with EMsg
  /* 331 */ val GMGetServiceMethodRouting: typingsJapgolly.steamUser.mod.EMsg.GMGetServiceMethodRouting & Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse
    extends StObject
       with EMsg
  /* 332 */ val GMGetServiceMethodRoutingResponse: typingsJapgolly.steamUser.mod.EMsg.GMGetServiceMethodRoutingResponse & Double = js.native
  
  @js.native
  sealed trait GMLoadActivationCodes
    extends StObject
       with EMsg
  /* 325 */ val GMLoadActivationCodes: typingsJapgolly.steamUser.mod.EMsg.GMLoadActivationCodes & Double = js.native
  
  @js.native
  sealed trait GMQueueForFBS
    extends StObject
       with EMsg
  /* 326 */ val GMQueueForFBS: typingsJapgolly.steamUser.mod.EMsg.GMQueueForFBS & Double = js.native
  
  @js.native
  sealed trait GMReportPHPError
    extends StObject
       with EMsg
  /* 319 */ val GMReportPHPError: typingsJapgolly.steamUser.mod.EMsg.GMReportPHPError & Double = js.native
  
  @js.native
  sealed trait GMSBase
    extends StObject
       with EMsg
  /* 6400 */ val GMSBase: typingsJapgolly.steamUser.mod.EMsg.GMSBase & Double = js.native
  
  @js.native
  sealed trait GMSClientServerQueryResponse
    extends StObject
       with EMsg
  /* 6404 */ val GMSClientServerQueryResponse: typingsJapgolly.steamUser.mod.EMsg.GMSClientServerQueryResponse & Double = js.native
  
  @js.native
  sealed trait GMSGameServerReplicate
    extends StObject
       with EMsg
  /* 6401 */ val GMSGameServerReplicate: typingsJapgolly.steamUser.mod.EMsg.GMSGameServerReplicate & Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResults
    extends StObject
       with EMsg
  /* 327 */ val GMSchemaConversionResults: typingsJapgolly.steamUser.mod.EMsg.GMSchemaConversionResults & Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResultsResponse
    extends StObject
       with EMsg
  /* 328 */ val GMSchemaConversionResultsResponse: typingsJapgolly.steamUser.mod.EMsg.GMSchemaConversionResultsResponse & Double = js.native
  
  @js.native
  sealed trait GMTestNextBuildSchemaConversion
    extends StObject
       with EMsg
  /* 334 */ val GMTestNextBuildSchemaConversion: typingsJapgolly.steamUser.mod.EMsg.GMTestNextBuildSchemaConversion & Double = js.native
  
  @js.native
  sealed trait GMTestNextBuildSchemaConversionResponse
    extends StObject
       with EMsg
  /* 335 */ val GMTestNextBuildSchemaConversionResponse: typingsJapgolly.steamUser.mod.EMsg.GMTestNextBuildSchemaConversionResponse & Double = js.native
  
  @js.native
  sealed trait GMWriteConfigToSQL
    extends StObject
       with EMsg
  /* 324 */ val GMWriteConfigToSQL: typingsJapgolly.steamUser.mod.EMsg.GMWriteConfigToSQL & Double = js.native
  
  @js.native
  sealed trait GMWriteShellFailureToSQL
    extends StObject
       with EMsg
  /* 329 */ val GMWriteShellFailureToSQL: typingsJapgolly.steamUser.mod.EMsg.GMWriteShellFailureToSQL & Double = js.native
  
  @js.native
  sealed trait GMWriteStatsToSOS
    extends StObject
       with EMsg
  /* 330 */ val GMWriteStatsToSOS: typingsJapgolly.steamUser.mod.EMsg.GMWriteStatsToSOS & Double = js.native
  
  @js.native
  sealed trait GSApprove
    extends StObject
       with EMsg
  /* 758 */ val GSApprove: typingsJapgolly.steamUser.mod.EMsg.GSApprove & Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClan
    extends StObject
       with EMsg
  /* 938 */ val GSAssociateWithClan: typingsJapgolly.steamUser.mod.EMsg.GSAssociateWithClan & Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClanResponse
    extends StObject
       with EMsg
  /* 939 */ val GSAssociateWithClanResponse: typingsJapgolly.steamUser.mod.EMsg.GSAssociateWithClanResponse & Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility
    extends StObject
       with EMsg
  /* 940 */ val GSComputeNewPlayerCompatibility: typingsJapgolly.steamUser.mod.EMsg.GSComputeNewPlayerCompatibility & Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse
    extends StObject
       with EMsg
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: typingsJapgolly.steamUser.mod.EMsg.GSComputeNewPlayerCompatibilityResponse & Double = js.native
  
  @js.native
  sealed trait GSDeny
    extends StObject
       with EMsg
  /* 759 */ val GSDeny: typingsJapgolly.steamUser.mod.EMsg.GSDeny & Double = js.native
  
  @js.native
  sealed trait GSDisconnectNotice
    extends StObject
       with EMsg
  /* 901 */ val GSDisconnectNotice: typingsJapgolly.steamUser.mod.EMsg.GSDisconnectNotice & Double = js.native
  
  @js.native
  sealed trait GSGetPlayStats
    extends StObject
       with EMsg
  /* 918 */ val GSGetPlayStats: typingsJapgolly.steamUser.mod.EMsg.GSGetPlayStats & Double = js.native
  
  @js.native
  sealed trait GSGetPlayStatsResponse
    extends StObject
       with EMsg
  /* 919 */ val GSGetPlayStatsResponse: typingsJapgolly.steamUser.mod.EMsg.GSGetPlayStatsResponse & Double = js.native
  
  @js.native
  sealed trait GSGetReputation
    extends StObject
       with EMsg
  /* 936 */ val GSGetReputation: typingsJapgolly.steamUser.mod.EMsg.GSGetReputation & Double = js.native
  
  @js.native
  sealed trait GSGetReputationResponse
    extends StObject
       with EMsg
  /* 937 */ val GSGetReputationResponse: typingsJapgolly.steamUser.mod.EMsg.GSGetReputationResponse & Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatus
    extends StObject
       with EMsg
  /* 910 */ val GSGetUserAchievementStatus: typingsJapgolly.steamUser.mod.EMsg.GSGetUserAchievementStatus & Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse
    extends StObject
       with EMsg
  /* 911 */ val GSGetUserAchievementStatusResponse: typingsJapgolly.steamUser.mod.EMsg.GSGetUserAchievementStatusResponse & Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatus
    extends StObject
       with EMsg
  /* 920 */ val GSGetUserGroupStatus: typingsJapgolly.steamUser.mod.EMsg.GSGetUserGroupStatus & Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse
    extends StObject
       with EMsg
  /* 923 */ val GSGetUserGroupStatusResponse: typingsJapgolly.steamUser.mod.EMsg.GSGetUserGroupStatusResponse & Double = js.native
  
  @js.native
  sealed trait GSKick
    extends StObject
       with EMsg
  /* 760 */ val GSKick: typingsJapgolly.steamUser.mod.EMsg.GSKick & Double = js.native
  
  @js.native
  sealed trait GSPerformHardwareSurvey
    extends StObject
       with EMsg
  /* 5440 */ val GSPerformHardwareSurvey: typingsJapgolly.steamUser.mod.EMsg.GSPerformHardwareSurvey & Double = js.native
  
  @js.native
  sealed trait GSPlayerList
    extends StObject
       with EMsg
  /* 909 */ val GSPlayerList: typingsJapgolly.steamUser.mod.EMsg.GSPlayerList & Double = js.native
  
  @js.native
  sealed trait GSServerType
    extends StObject
       with EMsg
  /* 908 */ val GSServerType: typingsJapgolly.steamUser.mod.EMsg.GSServerType & Double = js.native
  
  @js.native
  sealed trait GSStatus
    extends StObject
       with EMsg
  /* 903 */ val GSStatus: typingsJapgolly.steamUser.mod.EMsg.GSStatus & Double = js.native
  
  @js.native
  sealed trait GSStatus2
    extends StObject
       with EMsg
  /* 906 */ val GSStatus2: typingsJapgolly.steamUser.mod.EMsg.GSStatus2 & Double = js.native
  
  @js.native
  sealed trait GSStatusReply
    extends StObject
       with EMsg
  /* 774 */ val GSStatusReply: typingsJapgolly.steamUser.mod.EMsg.GSStatusReply & Double = js.native
  
  @js.native
  sealed trait GSStatusUpdate_Unused
    extends StObject
       with EMsg
  /* 907 */ val GSStatusUpdate_Unused: typingsJapgolly.steamUser.mod.EMsg.GSStatusUpdate_Unused & Double = js.native
  
  @js.native
  sealed trait GSUserPlaying
    extends StObject
       with EMsg
  /* 905 */ val GSUserPlaying: typingsJapgolly.steamUser.mod.EMsg.GSUserPlaying & Double = js.native
  
  @js.native
  sealed trait GameServerOutOfDate
    extends StObject
       with EMsg
  /* 6407 */ val GameServerOutOfDate: typingsJapgolly.steamUser.mod.EMsg.GameServerOutOfDate & Double = js.native
  
  @js.native
  sealed trait GenericReply
    extends StObject
       with EMsg
  /* 100 */ val GenericReply: typingsJapgolly.steamUser.mod.EMsg.GenericReply & Double = js.native
  
  @js.native
  sealed trait GetUserIPCountry
    extends StObject
       with EMsg
  /* 4393 */ val GetUserIPCountry: typingsJapgolly.steamUser.mod.EMsg.GetUserIPCountry & Double = js.native
  
  @js.native
  sealed trait GetUserIPCountryResponse
    extends StObject
       with EMsg
  /* 4394 */ val GetUserIPCountryResponse: typingsJapgolly.steamUser.mod.EMsg.GetUserIPCountryResponse & Double = js.native
  
  @js.native
  sealed trait GracefulExitShell
    extends StObject
       with EMsg
  /* 309 */ val GracefulExitShell: typingsJapgolly.steamUser.mod.EMsg.GracefulExitShell & Double = js.native
  
  @js.native
  sealed trait Heartbeat
    extends StObject
       with EMsg
  /* 300 */ val Heartbeat: typingsJapgolly.steamUser.mod.EMsg.Heartbeat & Double = js.native
  
  @js.native
  sealed trait HotFixProgress
    extends StObject
       with EMsg
  /* 337 */ val HotFixProgress: typingsJapgolly.steamUser.mod.EMsg.HotFixProgress & Double = js.native
  
  @js.native
  sealed trait HubConnect
    extends StObject
       with EMsg
  /* 124 */ val HubConnect: typingsJapgolly.steamUser.mod.EMsg.HubConnect & Double = js.native
  
  @js.native
  sealed trait ISRelayToGCH
    extends StObject
       with EMsg
  /* 2222 */ val ISRelayToGCH: typingsJapgolly.steamUser.mod.EMsg.ISRelayToGCH & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EMsg
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EMsg.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidateDBOCacheItems
    extends StObject
       with EMsg
  /* 145 */ val InvalidateDBOCacheItems: typingsJapgolly.steamUser.mod.EMsg.InvalidateDBOCacheItems & Double = js.native
  
  @js.native
  sealed trait JobHeartbeat
    extends StObject
       with EMsg
  /* 123 */ val JobHeartbeat: typingsJapgolly.steamUser.mod.EMsg.JobHeartbeat & Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTest
    extends StObject
       with EMsg
  /* 3001 */ val JobHeartbeatTest: typingsJapgolly.steamUser.mod.EMsg.JobHeartbeatTest & Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTestResponse
    extends StObject
       with EMsg
  /* 3002 */ val JobHeartbeatTestResponse: typingsJapgolly.steamUser.mod.EMsg.JobHeartbeatTestResponse & Double = js.native
  
  @js.native
  sealed trait KGSAllocateKeyRange
    extends StObject
       with EMsg
  /* 7201 */ val KGSAllocateKeyRange: typingsJapgolly.steamUser.mod.EMsg.KGSAllocateKeyRange & Double = js.native
  
  @js.native
  sealed trait KGSAllocateKeyRangeResponse
    extends StObject
       with EMsg
  /* 7202 */ val KGSAllocateKeyRangeResponse: typingsJapgolly.steamUser.mod.EMsg.KGSAllocateKeyRangeResponse & Double = js.native
  
  @js.native
  sealed trait KGSBase
    extends StObject
       with EMsg
  /* 7200 */ val KGSBase: typingsJapgolly.steamUser.mod.EMsg.KGSBase & Double = js.native
  
  @js.native
  sealed trait KGSGenerateGameStopWCKeys
    extends StObject
       with EMsg
  /* 7207 */ val KGSGenerateGameStopWCKeys: typingsJapgolly.steamUser.mod.EMsg.KGSGenerateGameStopWCKeys & Double = js.native
  
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse
    extends StObject
       with EMsg
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: typingsJapgolly.steamUser.mod.EMsg.KGSGenerateGameStopWCKeysResponse & Double = js.native
  
  @js.native
  sealed trait KGSGenerateKeys
    extends StObject
       with EMsg
  /* 7203 */ val KGSGenerateKeys: typingsJapgolly.steamUser.mod.EMsg.KGSGenerateKeys & Double = js.native
  
  @js.native
  sealed trait KGSGenerateKeysResponse
    extends StObject
       with EMsg
  /* 7204 */ val KGSGenerateKeysResponse: typingsJapgolly.steamUser.mod.EMsg.KGSGenerateKeysResponse & Double = js.native
  
  @js.native
  sealed trait KGSRemapKeys
    extends StObject
       with EMsg
  /* 7205 */ val KGSRemapKeys: typingsJapgolly.steamUser.mod.EMsg.KGSRemapKeys & Double = js.native
  
  @js.native
  sealed trait KGSRemapKeysResponse
    extends StObject
       with EMsg
  /* 7206 */ val KGSRemapKeysResponse: typingsJapgolly.steamUser.mod.EMsg.KGSRemapKeysResponse & Double = js.native
  
  @js.native
  sealed trait KeepAlive
    extends StObject
       with EMsg
  /* 132 */ val KeepAlive: typingsJapgolly.steamUser.mod.EMsg.KeepAlive & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLB
    extends StObject
       with EMsg
  /* 3210 */ val LBSDeleteLB: typingsJapgolly.steamUser.mod.EMsg.LBSDeleteLB & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBEntry
    extends StObject
       with EMsg
  /* 3211 */ val LBSDeleteLBEntry: typingsJapgolly.steamUser.mod.EMsg.LBSDeleteLBEntry & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBResponse
    extends StObject
       with EMsg
  /* 3214 */ val LBSDeleteLBResponse: typingsJapgolly.steamUser.mod.EMsg.LBSDeleteLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLB
    extends StObject
       with EMsg
  /* 3203 */ val LBSFindOrCreateLB: typingsJapgolly.steamUser.mod.EMsg.LBSFindOrCreateLB & Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse
    extends StObject
       with EMsg
  /* 3204 */ val LBSFindOrCreateLBResponse: typingsJapgolly.steamUser.mod.EMsg.LBSFindOrCreateLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntries
    extends StObject
       with EMsg
  /* 3205 */ val LBSGetLBEntries: typingsJapgolly.steamUser.mod.EMsg.LBSGetLBEntries & Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntriesResponse
    extends StObject
       with EMsg
  /* 3206 */ val LBSGetLBEntriesResponse: typingsJapgolly.steamUser.mod.EMsg.LBSGetLBEntriesResponse & Double = js.native
  
  @js.native
  sealed trait LBSGetLBList
    extends StObject
       with EMsg
  /* 3207 */ val LBSGetLBList: typingsJapgolly.steamUser.mod.EMsg.LBSGetLBList & Double = js.native
  
  @js.native
  sealed trait LBSGetLBListResponse
    extends StObject
       with EMsg
  /* 3208 */ val LBSGetLBListResponse: typingsJapgolly.steamUser.mod.EMsg.LBSGetLBListResponse & Double = js.native
  
  @js.native
  sealed trait LBSResetLB
    extends StObject
       with EMsg
  /* 3212 */ val LBSResetLB: typingsJapgolly.steamUser.mod.EMsg.LBSResetLB & Double = js.native
  
  @js.native
  sealed trait LBSResetLBResponse
    extends StObject
       with EMsg
  /* 3213 */ val LBSResetLBResponse: typingsJapgolly.steamUser.mod.EMsg.LBSResetLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSSetLBDetails
    extends StObject
       with EMsg
  /* 3209 */ val LBSSetLBDetails: typingsJapgolly.steamUser.mod.EMsg.LBSSetLBDetails & Double = js.native
  
  @js.native
  sealed trait LBSSetScore
    extends StObject
       with EMsg
  /* 3201 */ val LBSSetScore: typingsJapgolly.steamUser.mod.EMsg.LBSSetScore & Double = js.native
  
  @js.native
  sealed trait LBSSetScoreResponse
    extends StObject
       with EMsg
  /* 3202 */ val LBSSetScoreResponse: typingsJapgolly.steamUser.mod.EMsg.LBSSetScoreResponse & Double = js.native
  
  @js.native
  sealed trait LicenseProcessingComplete
    extends StObject
       with EMsg
  /* 316 */ val LicenseProcessingComplete: typingsJapgolly.steamUser.mod.EMsg.LicenseProcessingComplete & Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItem
    extends StObject
       with EMsg
  /* 143 */ val LoadDBOCacheItem: typingsJapgolly.steamUser.mod.EMsg.LoadDBOCacheItem & Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItemResponse
    extends StObject
       with EMsg
  /* 144 */ val LoadDBOCacheItemResponse: typingsJapgolly.steamUser.mod.EMsg.LoadDBOCacheItemResponse & Double = js.native
  
  @js.native
  sealed trait LogSearchCancel
    extends StObject
       with EMsg
  /* 1009 */ val LogSearchCancel: typingsJapgolly.steamUser.mod.EMsg.LogSearchCancel & Double = js.native
  
  @js.native
  sealed trait LogSearchRequest
    extends StObject
       with EMsg
  /* 1007 */ val LogSearchRequest: typingsJapgolly.steamUser.mod.EMsg.LogSearchRequest & Double = js.native
  
  @js.native
  sealed trait LogSearchResponse
    extends StObject
       with EMsg
  /* 1008 */ val LogSearchResponse: typingsJapgolly.steamUser.mod.EMsg.LogSearchResponse & Double = js.native
  
  @js.native
  sealed trait LogsinkBase
    extends StObject
       with EMsg
  /* 8800 */ val LogsinkBase: typingsJapgolly.steamUser.mod.EMsg.LogsinkBase & Double = js.native
  
  @js.native
  sealed trait LogsinkWriteReport
    extends StObject
       with EMsg
  /* 8800 */ val LogsinkWriteReport: typingsJapgolly.steamUser.mod.EMsg.LogsinkWriteReport & Double = js.native
  
  @js.native
  sealed trait MDSContentServerConfig
    extends StObject
       with EMsg
  /* 5828 */ val MDSContentServerConfig: typingsJapgolly.steamUser.mod.EMsg.MDSContentServerConfig & Double = js.native
  
  @js.native
  sealed trait MDSContentServerConfigRequest
    extends StObject
       with EMsg
  /* 5827 */ val MDSContentServerConfigRequest: typingsJapgolly.steamUser.mod.EMsg.MDSContentServerConfigRequest & Double = js.native
  
  @js.native
  sealed trait MDSContentServerStatsBroadcast
    extends StObject
       with EMsg
  /* 5826 */ val MDSContentServerStatsBroadcast: typingsJapgolly.steamUser.mod.EMsg.MDSContentServerStatsBroadcast & Double = js.native
  
  @js.native
  sealed trait MDSDownloadDepotChunksAck
    extends StObject
       with EMsg
  /* 5825 */ val MDSDownloadDepotChunksAck: typingsJapgolly.steamUser.mod.EMsg.MDSDownloadDepotChunksAck & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunk
    extends StObject
       with EMsg
  /* 5832 */ val MDSGetDepotChunk: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkChunk
    extends StObject
       with EMsg
  /* 5834 */ val MDSGetDepotChunkChunk: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotChunkChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkResponse
    extends StObject
       with EMsg
  /* 5833 */ val MDSGetDepotChunkResponse: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotChunkResponse & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifest
    extends StObject
       with EMsg
  /* 5829 */ val MDSGetDepotManifest: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotManifest & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestChunk
    extends StObject
       with EMsg
  /* 5831 */ val MDSGetDepotManifestChunk: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotManifestChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestResponse
    extends StObject
       with EMsg
  /* 5830 */ val MDSGetDepotManifestResponse: typingsJapgolly.steamUser.mod.EMsg.MDSGetDepotManifestResponse & Double = js.native
  
  @js.native
  sealed trait MDSGetServerListForUser
    extends StObject
       with EMsg
  /* 5836 */ val MDSGetServerListForUser: typingsJapgolly.steamUser.mod.EMsg.MDSGetServerListForUser & Double = js.native
  
  @js.native
  sealed trait MDSGetServerListForUserResponse
    extends StObject
       with EMsg
  /* 5837 */ val MDSGetServerListForUserResponse: typingsJapgolly.steamUser.mod.EMsg.MDSGetServerListForUserResponse & Double = js.native
  
  @js.native
  sealed trait MDSGetVersionsForDepot
    extends StObject
       with EMsg
  /* 5814 */ val MDSGetVersionsForDepot: typingsJapgolly.steamUser.mod.EMsg.MDSGetVersionsForDepot & Double = js.native
  
  @js.native
  sealed trait MDSGetVersionsForDepotResponse
    extends StObject
       with EMsg
  /* 5815 */ val MDSGetVersionsForDepotResponse: typingsJapgolly.steamUser.mod.EMsg.MDSGetVersionsForDepotResponse & Double = js.native
  
  @js.native
  sealed trait MDSMigrateChunk
    extends StObject
       with EMsg
  /* 5847 */ val MDSMigrateChunk: typingsJapgolly.steamUser.mod.EMsg.MDSMigrateChunk & Double = js.native
  
  @js.native
  sealed trait MDSMigrateChunkResponse
    extends StObject
       with EMsg
  /* 5848 */ val MDSMigrateChunkResponse: typingsJapgolly.steamUser.mod.EMsg.MDSMigrateChunkResponse & Double = js.native
  
  @js.native
  sealed trait MDSSetPublicVersionForDepot
    extends StObject
       with EMsg
  /* 5816 */ val MDSSetPublicVersionForDepot: typingsJapgolly.steamUser.mod.EMsg.MDSSetPublicVersionForDepot & Double = js.native
  
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse
    extends StObject
       with EMsg
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: typingsJapgolly.steamUser.mod.EMsg.MDSSetPublicVersionForDepotResponse & Double = js.native
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse
    extends StObject
       with EMsg
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: typingsJapgolly.steamUser.mod.EMsg.MDSToAMGetDepotDecryptionKeyResponse & Double = js.native
  
  @js.native
  sealed trait MDSToCSFlushChunk
    extends StObject
       with EMsg
  /* 5844 */ val MDSToCSFlushChunk: typingsJapgolly.steamUser.mod.EMsg.MDSToCSFlushChunk & Double = js.native
  
  @js.native
  sealed trait MDSToCSFlushManifest
    extends StObject
       with EMsg
  /* 5849 */ val MDSToCSFlushManifest: typingsJapgolly.steamUser.mod.EMsg.MDSToCSFlushManifest & Double = js.native
  
  @js.native
  sealed trait MDSUpdateContentServerConfig
    extends StObject
       with EMsg
  /* 5835 */ val MDSUpdateContentServerConfig: typingsJapgolly.steamUser.mod.EMsg.MDSUpdateContentServerConfig & Double = js.native
  
  @js.native
  sealed trait MMSBase
    extends StObject
       with EMsg
  /* 6600 */ val MMSBase: typingsJapgolly.steamUser.mod.EMsg.MMSBase & Double = js.native
  
  @js.native
  sealed trait MMSGetLobbyList
    extends StObject
       with EMsg
  /* 6628 */ val MMSGetLobbyList: typingsJapgolly.steamUser.mod.EMsg.MMSGetLobbyList & Double = js.native
  
  @js.native
  sealed trait MMSGetLobbyListResponse
    extends StObject
       with EMsg
  /* 6629 */ val MMSGetLobbyListResponse: typingsJapgolly.steamUser.mod.EMsg.MMSGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait MPASBase
    extends StObject
       with EMsg
  /* 7100 */ val MPASBase: typingsJapgolly.steamUser.mod.EMsg.MPASBase & Double = js.native
  
  @js.native
  sealed trait MPASVacBanReset
    extends StObject
       with EMsg
  /* 7101 */ val MPASVacBanReset: typingsJapgolly.steamUser.mod.EMsg.MPASVacBanReset & Double = js.native
  
  @js.native
  sealed trait MarketingMessageUpdate
    extends StObject
       with EMsg
  /* 4216 */ val MarketingMessageUpdate: typingsJapgolly.steamUser.mod.EMsg.MarketingMessageUpdate & Double = js.native
  
  @js.native
  sealed trait Multi
    extends StObject
       with EMsg
  /* 1 */ val Multi: typingsJapgolly.steamUser.mod.EMsg.Multi & Double = js.native
  
  @js.native
  sealed trait NonStdMsgBase
    extends StObject
       with EMsg
  /* 6800 */ val NonStdMsgBase: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgBase & Double = js.native
  
  @js.native
  sealed trait NonStdMsgChase
    extends StObject
       with EMsg
  /* 6806 */ val NonStdMsgChase: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgChase & Double = js.native
  
  @js.native
  sealed trait NonStdMsgDFSTransfer
    extends StObject
       with EMsg
  /* 6807 */ val NonStdMsgDFSTransfer: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgDFSTransfer & Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPClient
    extends StObject
       with EMsg
  /* 6803 */ val NonStdMsgHTTPClient: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgHTTPClient & Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPServer
    extends StObject
       with EMsg
  /* 6802 */ val NonStdMsgHTTPServer: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgHTTPServer & Double = js.native
  
  @js.native
  sealed trait NonStdMsgLogsink
    extends StObject
       with EMsg
  /* 6811 */ val NonStdMsgLogsink: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgLogsink & Double = js.native
  
  @js.native
  sealed trait NonStdMsgMemcached
    extends StObject
       with EMsg
  /* 6801 */ val NonStdMsgMemcached: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgMemcached & Double = js.native
  
  @js.native
  sealed trait NonStdMsgPHPSimulator
    extends StObject
       with EMsg
  /* 6805 */ val NonStdMsgPHPSimulator: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgPHPSimulator & Double = js.native
  
  @js.native
  sealed trait NonStdMsgRTMPServer
    extends StObject
       with EMsg
  /* 6813 */ val NonStdMsgRTMPServer: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgRTMPServer & Double = js.native
  
  @js.native
  sealed trait NonStdMsgRedis
    extends StObject
       with EMsg
  /* 6815 */ val NonStdMsgRedis: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgRedis & Double = js.native
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator
    extends StObject
       with EMsg
  /* 6812 */ val NonStdMsgSteam2Emulator: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgSteam2Emulator & Double = js.native
  
  @js.native
  sealed trait NonStdMsgSyslog
    extends StObject
       with EMsg
  /* 6810 */ val NonStdMsgSyslog: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgSyslog & Double = js.native
  
  @js.native
  sealed trait NonStdMsgTests
    extends StObject
       with EMsg
  /* 6808 */ val NonStdMsgTests: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgTests & Double = js.native
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL
    extends StObject
       with EMsg
  /* 6809 */ val NonStdMsgUMQpipeAAPL: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgUMQpipeAAPL & Double = js.native
  
  @js.native
  sealed trait NonStdMsgWGResponse
    extends StObject
       with EMsg
  /* 6804 */ val NonStdMsgWGResponse: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgWGResponse & Double = js.native
  
  @js.native
  sealed trait NonStdMsgWebSocket
    extends StObject
       with EMsg
  /* 6814 */ val NonStdMsgWebSocket: typingsJapgolly.steamUser.mod.EMsg.NonStdMsgWebSocket & Double = js.native
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity
    extends StObject
       with EMsg
  /* 4395 */ val NotificationOfSuspiciousActivity: typingsJapgolly.steamUser.mod.EMsg.NotificationOfSuspiciousActivity & Double = js.native
  
  @js.native
  sealed trait NotifyWatchdog
    extends StObject
       with EMsg
  /* 10000 */ val NotifyWatchdog: typingsJapgolly.steamUser.mod.EMsg.NotifyWatchdog & Double = js.native
  
  @js.native
  sealed trait OGSBeginSession
    extends StObject
       with EMsg
  /* 3401 */ val OGSBeginSession: typingsJapgolly.steamUser.mod.EMsg.OGSBeginSession & Double = js.native
  
  @js.native
  sealed trait OGSBeginSessionResponse
    extends StObject
       with EMsg
  /* 3402 */ val OGSBeginSessionResponse: typingsJapgolly.steamUser.mod.EMsg.OGSBeginSessionResponse & Double = js.native
  
  @js.native
  sealed trait OGSEndSession
    extends StObject
       with EMsg
  /* 3403 */ val OGSEndSession: typingsJapgolly.steamUser.mod.EMsg.OGSEndSession & Double = js.native
  
  @js.native
  sealed trait OGSEndSessionResponse
    extends StObject
       with EMsg
  /* 3404 */ val OGSEndSessionResponse: typingsJapgolly.steamUser.mod.EMsg.OGSEndSessionResponse & Double = js.native
  
  @js.native
  sealed trait OGSWriteAppSessionRow
    extends StObject
       with EMsg
  /* 3406 */ val OGSWriteAppSessionRow: typingsJapgolly.steamUser.mod.EMsg.OGSWriteAppSessionRow & Double = js.native
  
  @js.native
  sealed trait P2PIntroducerMessage
    extends StObject
       with EMsg
  /* 2502 */ val P2PIntroducerMessage: typingsJapgolly.steamUser.mod.EMsg.P2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait PICSBase
    extends StObject
       with EMsg
  /* 8900 */ val PICSBase: typingsJapgolly.steamUser.mod.EMsg.PICSBase & Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCart
    extends StObject
       with EMsg
  /* 5005 */ val PSAddPackageToShoppingCart: typingsJapgolly.steamUser.mod.EMsg.PSAddPackageToShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse
    extends StObject
       with EMsg
  /* 5006 */ val PSAddPackageToShoppingCartResponse: typingsJapgolly.steamUser.mod.EMsg.PSAddPackageToShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart
    extends StObject
       with EMsg
  /* 5011 */ val PSAddWalletCreditToShoppingCart: typingsJapgolly.steamUser.mod.EMsg.PSAddWalletCreditToShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse
    extends StObject
       with EMsg
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: typingsJapgolly.steamUser.mod.EMsg.PSAddWalletCreditToShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCart
    extends StObject
       with EMsg
  /* 5001 */ val PSCreateShoppingCart: typingsJapgolly.steamUser.mod.EMsg.PSCreateShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCartResponse
    extends StObject
       with EMsg
  /* 5002 */ val PSCreateShoppingCartResponse: typingsJapgolly.steamUser.mod.EMsg.PSCreateShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContents
    extends StObject
       with EMsg
  /* 5009 */ val PSGetShoppingCartContents: typingsJapgolly.steamUser.mod.EMsg.PSGetShoppingCartContents & Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse
    extends StObject
       with EMsg
  /* 5010 */ val PSGetShoppingCartContentsResponse: typingsJapgolly.steamUser.mod.EMsg.PSGetShoppingCartContentsResponse & Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCart
    extends StObject
       with EMsg
  /* 5003 */ val PSIsValidShoppingCart: typingsJapgolly.steamUser.mod.EMsg.PSIsValidShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse
    extends StObject
       with EMsg
  /* 5004 */ val PSIsValidShoppingCartResponse: typingsJapgolly.steamUser.mod.EMsg.PSIsValidShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart
    extends StObject
       with EMsg
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: typingsJapgolly.steamUser.mod.EMsg.PSRemoveLineItemFromShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse
    extends StObject
       with EMsg
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: typingsJapgolly.steamUser.mod.EMsg.PSRemoveLineItemFromShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PhysicalBoxInventory
    extends StObject
       with EMsg
  /* 321 */ val PhysicalBoxInventory: typingsJapgolly.steamUser.mod.EMsg.PhysicalBoxInventory & Double = js.native
  
  @js.native
  sealed trait Ping
    extends StObject
       with EMsg
  /* 139 */ val Ping: typingsJapgolly.steamUser.mod.EMsg.Ping & Double = js.native
  
  @js.native
  sealed trait PingResponse
    extends StObject
       with EMsg
  /* 140 */ val PingResponse: typingsJapgolly.steamUser.mod.EMsg.PingResponse & Double = js.native
  
  @js.native
  sealed trait PrepareToExit
    extends StObject
       with EMsg
  /* 226 */ val PrepareToExit: typingsJapgolly.steamUser.mod.EMsg.PrepareToExit & Double = js.native
  
  @js.native
  sealed trait ProtobufWrapped
    extends StObject
       with EMsg
  /* 2 */ val ProtobufWrapped: typingsJapgolly.steamUser.mod.EMsg.ProtobufWrapped & Double = js.native
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries
    extends StObject
       with EMsg
  /* 234 */ val ProvideWindowsEventLogEntries: typingsJapgolly.steamUser.mod.EMsg.ProvideWindowsEventLogEntries & Double = js.native
  
  @js.native
  sealed trait QuestServerBase
    extends StObject
       with EMsg
  /* 9300 */ val QuestServerBase: typingsJapgolly.steamUser.mod.EMsg.QuestServerBase & Double = js.native
  
  @js.native
  sealed trait QueuedEmailsComplete
    extends StObject
       with EMsg
  /* 318 */ val QueuedEmailsComplete: typingsJapgolly.steamUser.mod.EMsg.QueuedEmailsComplete & Double = js.native
  
  @js.native
  sealed trait RMDeleteMemcachedKeys
    extends StObject
       with EMsg
  /* 7803 */ val RMDeleteMemcachedKeys: typingsJapgolly.steamUser.mod.EMsg.RMDeleteMemcachedKeys & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceAddTrigger
    extends StObject
       with EMsg
  /* 7806 */ val RMMsgTraceAddTrigger: typingsJapgolly.steamUser.mod.EMsg.RMMsgTraceAddTrigger & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceEvent
    extends StObject
       with EMsg
  /* 7808 */ val RMMsgTraceEvent: typingsJapgolly.steamUser.mod.EMsg.RMMsgTraceEvent & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger
    extends StObject
       with EMsg
  /* 7807 */ val RMMsgTraceRemoveTrigger: typingsJapgolly.steamUser.mod.EMsg.RMMsgTraceRemoveTrigger & Double = js.native
  
  @js.native
  sealed trait RMRange
    extends StObject
       with EMsg
  /* 7800 */ val RMRange: typingsJapgolly.steamUser.mod.EMsg.RMRange & Double = js.native
  
  @js.native
  sealed trait RMRemoteInvoke
    extends StObject
       with EMsg
  /* 7804 */ val RMRemoteInvoke: typingsJapgolly.steamUser.mod.EMsg.RMRemoteInvoke & Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTP
    extends StObject
       with EMsg
  /* 7800 */ val RMTestVerisignOTP: typingsJapgolly.steamUser.mod.EMsg.RMTestVerisignOTP & Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTPResponse
    extends StObject
       with EMsg
  /* 7801 */ val RMTestVerisignOTPResponse: typingsJapgolly.steamUser.mod.EMsg.RMTestVerisignOTPResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientAcceptEULA
    extends StObject
       with EMsg
  /* 9509 */ val RemoteClientAcceptEULA: typingsJapgolly.steamUser.mod.EMsg.RemoteClientAcceptEULA & Double = js.native
  
  @js.native
  sealed trait RemoteClientAppStatus
    extends StObject
       with EMsg
  /* 9502 */ val RemoteClientAppStatus: typingsJapgolly.steamUser.mod.EMsg.RemoteClientAppStatus & Double = js.native
  
  @js.native
  sealed trait RemoteClientAuth
    extends StObject
       with EMsg
  /* 9500 */ val RemoteClientAuth: typingsJapgolly.steamUser.mod.EMsg.RemoteClientAuth & Double = js.native
  
  @js.native
  sealed trait RemoteClientAuthResponse
    extends StObject
       with EMsg
  /* 9501 */ val RemoteClientAuthResponse: typingsJapgolly.steamUser.mod.EMsg.RemoteClientAuthResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientBase
    extends StObject
       with EMsg
  /* 9500 */ val RemoteClientBase: typingsJapgolly.steamUser.mod.EMsg.RemoteClientBase & Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfig
    extends StObject
       with EMsg
  /* 9510 */ val RemoteClientGetControllerConfig: typingsJapgolly.steamUser.mod.EMsg.RemoteClientGetControllerConfig & Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResponse
    extends StObject
       with EMsg
  /* 9511 */ val RemoteClientGetControllerConfigResponse: typingsJapgolly.steamUser.mod.EMsg.RemoteClientGetControllerConfigResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne
    extends StObject
       with EMsg
  /* 9511 */ val RemoteClientGetControllerConfigResposne: typingsJapgolly.steamUser.mod.EMsg.RemoteClientGetControllerConfigResposne & Double = js.native
  
  @js.native
  sealed trait RemoteClientPing
    extends StObject
       with EMsg
  /* 9505 */ val RemoteClientPing: typingsJapgolly.steamUser.mod.EMsg.RemoteClientPing & Double = js.native
  
  @js.native
  sealed trait RemoteClientPingResponse
    extends StObject
       with EMsg
  /* 9506 */ val RemoteClientPingResponse: typingsJapgolly.steamUser.mod.EMsg.RemoteClientPingResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStream
    extends StObject
       with EMsg
  /* 9503 */ val RemoteClientStartStream: typingsJapgolly.steamUser.mod.EMsg.RemoteClientStartStream & Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStreamResponse
    extends StObject
       with EMsg
  /* 9504 */ val RemoteClientStartStreamResponse: typingsJapgolly.steamUser.mod.EMsg.RemoteClientStartStreamResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientStatusRequest
    extends StObject
       with EMsg
  /* 9515 */ val RemoteClientStatusRequest: typingsJapgolly.steamUser.mod.EMsg.RemoteClientStatusRequest & Double = js.native
  
  @js.native
  sealed trait RemoteClientStatusResponse
    extends StObject
       with EMsg
  /* 9516 */ val RemoteClientStatusResponse: typingsJapgolly.steamUser.mod.EMsg.RemoteClientStatusResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientStreamingEnabled
    extends StObject
       with EMsg
  /* 9512 */ val RemoteClientStreamingEnabled: typingsJapgolly.steamUser.mod.EMsg.RemoteClientStreamingEnabled & Double = js.native
  
  @js.native
  sealed trait RemoteSysID
    extends StObject
       with EMsg
  /* 128 */ val RemoteSysID: typingsJapgolly.steamUser.mod.EMsg.RemoteSysID & Double = js.native
  
  @js.native
  sealed trait ReqChallenge
    extends StObject
       with EMsg
  /* 600 */ val ReqChallenge: typingsJapgolly.steamUser.mod.EMsg.ReqChallenge & Double = js.native
  
  @js.native
  sealed trait ReqChallengeTest
    extends StObject
       with EMsg
  /* 602 */ val ReqChallengeTest: typingsJapgolly.steamUser.mod.EMsg.ReqChallengeTest & Double = js.native
  
  @js.native
  sealed trait RequestFullStatsBlock
    extends StObject
       with EMsg
  /* 142 */ val RequestFullStatsBlock: typingsJapgolly.steamUser.mod.EMsg.RequestFullStatsBlock & Double = js.native
  
  @js.native
  sealed trait RequestStatHistory
    extends StObject
       with EMsg
  /* 1014 */ val RequestStatHistory: typingsJapgolly.steamUser.mod.EMsg.RequestStatHistory & Double = js.native
  
  @js.native
  sealed trait RequestWindowsEventLogEntries
    extends StObject
       with EMsg
  /* 233 */ val RequestWindowsEventLogEntries: typingsJapgolly.steamUser.mod.EMsg.RequestWindowsEventLogEntries & Double = js.native
  
  @js.native
  sealed trait RouteMessage
    extends StObject
       with EMsg
  /* 127 */ val RouteMessage: typingsJapgolly.steamUser.mod.EMsg.RouteMessage & Double = js.native
  
  @js.native
  sealed trait SCIDRequest
    extends StObject
       with EMsg
  /* 120 */ val SCIDRequest: typingsJapgolly.steamUser.mod.EMsg.SCIDRequest & Double = js.native
  
  @js.native
  sealed trait SCIDResponse
    extends StObject
       with EMsg
  /* 121 */ val SCIDResponse: typingsJapgolly.steamUser.mod.EMsg.SCIDResponse & Double = js.native
  
  @js.native
  sealed trait SLCBase
    extends StObject
       with EMsg
  /* 9400 */ val SLCBase: typingsJapgolly.steamUser.mod.EMsg.SLCBase & Double = js.native
  
  @js.native
  sealed trait SLCOwnerLibraryChanged
    extends StObject
       with EMsg
  /* 9407 */ val SLCOwnerLibraryChanged: typingsJapgolly.steamUser.mod.EMsg.SLCOwnerLibraryChanged & Double = js.native
  
  @js.native
  sealed trait SLCRequestUserSessionStatus
    extends StObject
       with EMsg
  /* 9401 */ val SLCRequestUserSessionStatus: typingsJapgolly.steamUser.mod.EMsg.SLCRequestUserSessionStatus & Double = js.native
  
  @js.native
  sealed trait SLCSharedLibraryChanged
    extends StObject
       with EMsg
  /* 9408 */ val SLCSharedLibraryChanged: typingsJapgolly.steamUser.mod.EMsg.SLCSharedLibraryChanged & Double = js.native
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus
    extends StObject
       with EMsg
  /* 9402 */ val SLCSharedLicensesLockStatus: typingsJapgolly.steamUser.mod.EMsg.SLCSharedLicensesLockStatus & Double = js.native
  
  @js.native
  sealed trait SLCUserSessionStatus
    extends StObject
       with EMsg
  /* 9400 */ val SLCUserSessionStatus: typingsJapgolly.steamUser.mod.EMsg.SLCUserSessionStatus & Double = js.native
  
  @js.native
  sealed trait SMExpensiveReport
    extends StObject
       with EMsg
  /* 2902 */ val SMExpensiveReport: typingsJapgolly.steamUser.mod.EMsg.SMExpensiveReport & Double = js.native
  
  @js.native
  sealed trait SMFishingReport
    extends StObject
       with EMsg
  /* 2904 */ val SMFishingReport: typingsJapgolly.steamUser.mod.EMsg.SMFishingReport & Double = js.native
  
  @js.native
  sealed trait SMGetSchemaConversionResults
    extends StObject
       with EMsg
  /* 2907 */ val SMGetSchemaConversionResults: typingsJapgolly.steamUser.mod.EMsg.SMGetSchemaConversionResults & Double = js.native
  
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse
    extends StObject
       with EMsg
  /* 2908 */ val SMGetSchemaConversionResultsResponse: typingsJapgolly.steamUser.mod.EMsg.SMGetSchemaConversionResultsResponse & Double = js.native
  
  @js.native
  sealed trait SMHourlyReport
    extends StObject
       with EMsg
  /* 2903 */ val SMHourlyReport: typingsJapgolly.steamUser.mod.EMsg.SMHourlyReport & Double = js.native
  
  @js.native
  sealed trait SMMonitorSpace
    extends StObject
       with EMsg
  /* 2906 */ val SMMonitorSpace: typingsJapgolly.steamUser.mod.EMsg.SMMonitorSpace & Double = js.native
  
  @js.native
  sealed trait SMPartitionRenames
    extends StObject
       with EMsg
  /* 2905 */ val SMPartitionRenames: typingsJapgolly.steamUser.mod.EMsg.SMPartitionRenames & Double = js.native
  
  @js.native
  sealed trait SMTestNextBuildSchemaConversion
    extends StObject
       with EMsg
  /* 2907 */ val SMTestNextBuildSchemaConversion: typingsJapgolly.steamUser.mod.EMsg.SMTestNextBuildSchemaConversion & Double = js.native
  
  @js.native
  sealed trait SMTestNextBuildSchemaConversionResponse
    extends StObject
       with EMsg
  /* 2908 */ val SMTestNextBuildSchemaConversionResponse: typingsJapgolly.steamUser.mod.EMsg.SMTestNextBuildSchemaConversionResponse & Double = js.native
  
  @js.native
  sealed trait SecretsBase
    extends StObject
       with EMsg
  /* 8600 */ val SecretsBase: typingsJapgolly.steamUser.mod.EMsg.SecretsBase & Double = js.native
  
  @js.native
  sealed trait SecretsCredentialPairResponse
    extends StObject
       with EMsg
  /* 8601 */ val SecretsCredentialPairResponse: typingsJapgolly.steamUser.mod.EMsg.SecretsCredentialPairResponse & Double = js.native
  
  @js.native
  sealed trait SecretsRequestCredentialPair
    extends StObject
       with EMsg
  /* 8600 */ val SecretsRequestCredentialPair: typingsJapgolly.steamUser.mod.EMsg.SecretsRequestCredentialPair & Double = js.native
  
  @js.native
  sealed trait SecretsRequestServerIdentity
    extends StObject
       with EMsg
  /* 8602 */ val SecretsRequestServerIdentity: typingsJapgolly.steamUser.mod.EMsg.SecretsRequestServerIdentity & Double = js.native
  
  @js.native
  sealed trait SecretsServerIdentityResponse
    extends StObject
       with EMsg
  /* 8603 */ val SecretsServerIdentityResponse: typingsJapgolly.steamUser.mod.EMsg.SecretsServerIdentityResponse & Double = js.native
  
  @js.native
  sealed trait SecretsUpdateServerIdentities
    extends StObject
       with EMsg
  /* 8604 */ val SecretsUpdateServerIdentities: typingsJapgolly.steamUser.mod.EMsg.SecretsUpdateServerIdentities & Double = js.native
  
  @js.native
  sealed trait ServerSecretChanged
    extends StObject
       with EMsg
  /* 12100 */ val ServerSecretChanged: typingsJapgolly.steamUser.mod.EMsg.ServerSecretChanged & Double = js.native
  
  @js.native
  sealed trait ServiceMethod
    extends StObject
       with EMsg
  /* 146 */ val ServiceMethod: typingsJapgolly.steamUser.mod.EMsg.ServiceMethod & Double = js.native
  
  @js.native
  sealed trait ServiceMethodCallFromClient
    extends StObject
       with EMsg
  /* 151 */ val ServiceMethodCallFromClient: typingsJapgolly.steamUser.mod.EMsg.ServiceMethodCallFromClient & Double = js.native
  
  @js.native
  sealed trait ServiceMethodResponse
    extends StObject
       with EMsg
  /* 147 */ val ServiceMethodResponse: typingsJapgolly.steamUser.mod.EMsg.ServiceMethodResponse & Double = js.native
  
  @js.native
  sealed trait ServiceMethodSendToClient
    extends StObject
       with EMsg
  /* 152 */ val ServiceMethodSendToClient: typingsJapgolly.steamUser.mod.EMsg.ServiceMethodSendToClient & Double = js.native
  
  @js.native
  sealed trait SetTestFlag
    extends StObject
       with EMsg
  /* 317 */ val SetTestFlag: typingsJapgolly.steamUser.mod.EMsg.SetTestFlag & Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdates
    extends StObject
       with EMsg
  /* 237 */ val ShellCheckWindowsUpdates: typingsJapgolly.steamUser.mod.EMsg.ShellCheckWindowsUpdates & Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse
    extends StObject
       with EMsg
  /* 238 */ val ShellCheckWindowsUpdatesResponse: typingsJapgolly.steamUser.mod.EMsg.ShellCheckWindowsUpdatesResponse & Double = js.native
  
  @js.native
  sealed trait ShellConfigInfoUpdate
    extends StObject
       with EMsg
  /* 230 */ val ShellConfigInfoUpdate: typingsJapgolly.steamUser.mod.EMsg.ShellConfigInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ShellFailed
    extends StObject
       with EMsg
  /* 301 */ val ShellFailed: typingsJapgolly.steamUser.mod.EMsg.ShellFailed & Double = js.native
  
  @js.native
  sealed trait ShellFlushUserLicenseCache
    extends StObject
       with EMsg
  /* 239 */ val ShellFlushUserLicenseCache: typingsJapgolly.steamUser.mod.EMsg.ShellFlushUserLicenseCache & Double = js.native
  
  @js.native
  sealed trait ShellSearchLogs
    extends StObject
       with EMsg
  /* 235 */ val ShellSearchLogs: typingsJapgolly.steamUser.mod.EMsg.ShellSearchLogs & Double = js.native
  
  @js.native
  sealed trait ShellSearchLogsResponse
    extends StObject
       with EMsg
  /* 236 */ val ShellSearchLogsResponse: typingsJapgolly.steamUser.mod.EMsg.ShellSearchLogsResponse & Double = js.native
  
  @js.native
  sealed trait StatHistory
    extends StObject
       with EMsg
  /* 1015 */ val StatHistory: typingsJapgolly.steamUser.mod.EMsg.StatHistory & Double = js.native
  
  @js.native
  sealed trait Stats
    extends StObject
       with EMsg
  /* 141 */ val Stats: typingsJapgolly.steamUser.mod.EMsg.Stats & Double = js.native
  
  @js.native
  sealed trait StatsDeprecated
    extends StObject
       with EMsg
  /* 138 */ val StatsDeprecated: typingsJapgolly.steamUser.mod.EMsg.StatsDeprecated & Double = js.native
  
  @js.native
  sealed trait StoreBase
    extends StObject
       with EMsg
  /* 8000 */ val StoreBase: typingsJapgolly.steamUser.mod.EMsg.StoreBase & Double = js.native
  
  @js.native
  sealed trait StoreUpdateRecommendationCount
    extends StObject
       with EMsg
  /* 8000 */ val StoreUpdateRecommendationCount: typingsJapgolly.steamUser.mod.EMsg.StoreUpdateRecommendationCount & Double = js.native
  
  @js.native
  sealed trait Subscribe
    extends StObject
       with EMsg
  /* 126 */ val Subscribe: typingsJapgolly.steamUser.mod.EMsg.Subscribe & Double = js.native
  
  @js.native
  sealed trait TestFlushDelayedSQL
    extends StObject
       with EMsg
  /* 240 */ val TestFlushDelayedSQL: typingsJapgolly.steamUser.mod.EMsg.TestFlushDelayedSQL & Double = js.native
  
  @js.native
  sealed trait TestFlushDelayedSQLResponse
    extends StObject
       with EMsg
  /* 241 */ val TestFlushDelayedSQLResponse: typingsJapgolly.steamUser.mod.EMsg.TestFlushDelayedSQLResponse & Double = js.native
  
  @js.native
  sealed trait TestInitDB
    extends StObject
       with EMsg
  /* 323 */ val TestInitDB: typingsJapgolly.steamUser.mod.EMsg.TestInitDB & Double = js.native
  
  @js.native
  sealed trait TestResetServer
    extends StObject
       with EMsg
  /* 228 */ val TestResetServer: typingsJapgolly.steamUser.mod.EMsg.TestResetServer & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcess
    extends StObject
       with EMsg
  /* 9200 */ val TestWorkerProcess: typingsJapgolly.steamUser.mod.EMsg.TestWorkerProcess & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest
    extends StObject
       with EMsg
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: typingsJapgolly.steamUser.mod.EMsg.TestWorkerProcessLoadUnloadModuleRequest & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse
    extends StObject
       with EMsg
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: typingsJapgolly.steamUser.mod.EMsg.TestWorkerProcessLoadUnloadModuleResponse & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest
    extends StObject
       with EMsg
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: typingsJapgolly.steamUser.mod.EMsg.TestWorkerProcessServiceModuleCallRequest & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse
    extends StObject
       with EMsg
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: typingsJapgolly.steamUser.mod.EMsg.TestWorkerProcessServiceModuleCallResponse & Double = js.native
  
  @js.native
  sealed trait TimestampRequest
    extends StObject
       with EMsg
  /* 149 */ val TimestampRequest: typingsJapgolly.steamUser.mod.EMsg.TimestampRequest & Double = js.native
  
  @js.native
  sealed trait TimestampResponse
    extends StObject
       with EMsg
  /* 150 */ val TimestampResponse: typingsJapgolly.steamUser.mod.EMsg.TimestampResponse & Double = js.native
  
  @js.native
  sealed trait UCMAddTaggedScreenshot
    extends StObject
       with EMsg
  /* 7335 */ val UCMAddTaggedScreenshot: typingsJapgolly.steamUser.mod.EMsg.UCMAddTaggedScreenshot & Double = js.native
  
  @js.native
  sealed trait UCMBase
    extends StObject
       with EMsg
  /* 7300 */ val UCMBase: typingsJapgolly.steamUser.mod.EMsg.UCMBase & Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldScreenshot
    extends StObject
       with EMsg
  /* 7372 */ val UCMDeleteOldScreenshot: typingsJapgolly.steamUser.mod.EMsg.UCMDeleteOldScreenshot & Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse
    extends StObject
       with EMsg
  /* 7373 */ val UCMDeleteOldScreenshotResponse: typingsJapgolly.steamUser.mod.EMsg.UCMDeleteOldScreenshotResponse & Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldVideo
    extends StObject
       with EMsg
  /* 7374 */ val UCMDeleteOldVideo: typingsJapgolly.steamUser.mod.EMsg.UCMDeleteOldVideo & Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldVideoResponse
    extends StObject
       with EMsg
  /* 7375 */ val UCMDeleteOldVideoResponse: typingsJapgolly.steamUser.mod.EMsg.UCMDeleteOldVideoResponse & Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFile
    extends StObject
       with EMsg
  /* 7329 */ val UCMDeletePublishedFile: typingsJapgolly.steamUser.mod.EMsg.UCMDeletePublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse
    extends StObject
       with EMsg
  /* 7330 */ val UCMDeletePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.UCMDeletePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMFixStatsPublishedFile
    extends StObject
       with EMsg
  /* 7371 */ val UCMFixStatsPublishedFile: typingsJapgolly.steamUser.mod.EMsg.UCMFixStatsPublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMGetPublishedFilesForUser
    extends StObject
       with EMsg
  /* 7362 */ val UCMGetPublishedFilesForUser: typingsJapgolly.steamUser.mod.EMsg.UCMGetPublishedFilesForUser & Double = js.native
  
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse
    extends StObject
       with EMsg
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: typingsJapgolly.steamUser.mod.EMsg.UCMGetPublishedFilesForUserResponse & Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles
    extends StObject
       with EMsg
  /* 7369 */ val UCMGetUserSubscribedFiles: typingsJapgolly.steamUser.mod.EMsg.UCMGetUserSubscribedFiles & Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse
    extends StObject
       with EMsg
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: typingsJapgolly.steamUser.mod.EMsg.UCMGetUserSubscribedFilesResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishFile
    extends StObject
       with EMsg
  /* 7351 */ val UCMPublishFile: typingsJapgolly.steamUser.mod.EMsg.UCMPublishFile & Double = js.native
  
  @js.native
  sealed trait UCMPublishFileResponse
    extends StObject
       with EMsg
  /* 7352 */ val UCMPublishFileResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAdd
    extends StObject
       with EMsg
  /* 7353 */ val UCMPublishedFileChildAdd: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildAdd & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse
    extends StObject
       with EMsg
  /* 7354 */ val UCMPublishedFileChildAddResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildAddResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder
    extends StObject
       with EMsg
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildChangeSortOrder & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse
    extends StObject
       with EMsg
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildChangeSortOrderResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemove
    extends StObject
       with EMsg
  /* 7355 */ val UCMPublishedFileChildRemove: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildRemove & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse
    extends StObject
       with EMsg
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileChildRemoveResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated
    extends StObject
       with EMsg
  /* 7380 */ val UCMPublishedFileContentUpdated: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileContentUpdated & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileParentChanged
    extends StObject
       with EMsg
  /* 7359 */ val UCMPublishedFileParentChanged: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileParentChanged & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd
    extends StObject
       with EMsg
  /* 7341 */ val UCMPublishedFilePreviewAdd: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewAdd & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse
    extends StObject
       with EMsg
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewAddResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder
    extends StObject
       with EMsg
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewChangeSortOrder & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse
    extends StObject
       with EMsg
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewChangeSortOrderResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove
    extends StObject
       with EMsg
  /* 7343 */ val UCMPublishedFilePreviewRemove: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewRemove & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse
    extends StObject
       with EMsg
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFilePreviewRemoveResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileReported
    extends StObject
       with EMsg
  /* 7339 */ val UCMPublishedFileReported: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileReported & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileSubscribed
    extends StObject
       with EMsg
  /* 7349 */ val UCMPublishedFileSubscribed: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileSubscribed & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed
    extends StObject
       with EMsg
  /* 7350 */ val UCMPublishedFileUnsubscribed: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileUnsubscribed & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUpdated
    extends StObject
       with EMsg
  /* 7381 */ val UCMPublishedFileUpdated: typingsJapgolly.steamUser.mod.EMsg.UCMPublishedFileUpdated & Double = js.native
  
  @js.native
  sealed trait UCMReloadPublishedFile
    extends StObject
       with EMsg
  /* 7337 */ val UCMReloadPublishedFile: typingsJapgolly.steamUser.mod.EMsg.UCMReloadPublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMReloadUserFileListCaches
    extends StObject
       with EMsg
  /* 7338 */ val UCMReloadUserFileListCaches: typingsJapgolly.steamUser.mod.EMsg.UCMReloadUserFileListCaches & Double = js.native
  
  @js.native
  sealed trait UCMRemoveTaggedScreenshot
    extends StObject
       with EMsg
  /* 7336 */ val UCMRemoveTaggedScreenshot: typingsJapgolly.steamUser.mod.EMsg.UCMRemoveTaggedScreenshot & Double = js.native
  
  @js.native
  sealed trait UCMResetCommunityContent
    extends StObject
       with EMsg
  /* 7307 */ val UCMResetCommunityContent: typingsJapgolly.steamUser.mod.EMsg.UCMResetCommunityContent & Double = js.native
  
  @js.native
  sealed trait UCMResetCommunityContentResponse
    extends StObject
       with EMsg
  /* 7308 */ val UCMResetCommunityContentResponse: typingsJapgolly.steamUser.mod.EMsg.UCMResetCommunityContentResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy
    extends StObject
       with EMsg
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: typingsJapgolly.steamUser.mod.EMsg.UCMUpdateOldScreenshotPrivacy & Double = js.native
  
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse
    extends StObject
       with EMsg
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: typingsJapgolly.steamUser.mod.EMsg.UCMUpdateOldScreenshotPrivacyResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFile
    extends StObject
       with EMsg
  /* 7327 */ val UCMUpdatePublishedFile: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan
    extends StObject
       with EMsg
  /* 7332 */ val UCMUpdatePublishedFileBan: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFileBan & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse
    extends StObject
       with EMsg
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFileBanResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus
    extends StObject
       with EMsg
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFileIncompatibleStatus & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse
    extends StObject
       with EMsg
  /* 7328 */ val UCMUpdatePublishedFileResponse: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat
    extends StObject
       with EMsg
  /* 7331 */ val UCMUpdatePublishedFileStat: typingsJapgolly.steamUser.mod.EMsg.UCMUpdatePublishedFileStat & Double = js.native
  
  @js.native
  sealed trait UCMUpdateTaggedScreenshot
    extends StObject
       with EMsg
  /* 7334 */ val UCMUpdateTaggedScreenshot: typingsJapgolly.steamUser.mod.EMsg.UCMUpdateTaggedScreenshot & Double = js.native
  
  @js.native
  sealed trait UCMValidateObjectExists
    extends StObject
       with EMsg
  /* 7303 */ val UCMValidateObjectExists: typingsJapgolly.steamUser.mod.EMsg.UCMValidateObjectExists & Double = js.native
  
  @js.native
  sealed trait UCMValidateObjectExistsResponse
    extends StObject
       with EMsg
  /* 7304 */ val UCMValidateObjectExistsResponse: typingsJapgolly.steamUser.mod.EMsg.UCMValidateObjectExistsResponse & Double = js.native
  
  @js.native
  sealed trait UDSBase
    extends StObject
       with EMsg
  /* 7000 */ val UDSBase: typingsJapgolly.steamUser.mod.EMsg.UDSBase & Double = js.native
  
  @js.native
  sealed trait UDSFindSession
    extends StObject
       with EMsg
  /* 7006 */ val UDSFindSession: typingsJapgolly.steamUser.mod.EMsg.UDSFindSession & Double = js.native
  
  @js.native
  sealed trait UDSFindSessionResponse
    extends StObject
       with EMsg
  /* 7007 */ val UDSFindSessionResponse: typingsJapgolly.steamUser.mod.EMsg.UDSFindSessionResponse & Double = js.native
  
  @js.native
  sealed trait UDSHasSession
    extends StObject
       with EMsg
  /* 7006 */ val UDSHasSession: typingsJapgolly.steamUser.mod.EMsg.UDSHasSession & Double = js.native
  
  @js.native
  sealed trait UDSHasSessionResponse
    extends StObject
       with EMsg
  /* 7007 */ val UDSHasSessionResponse: typingsJapgolly.steamUser.mod.EMsg.UDSHasSessionResponse & Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuth
    extends StObject
       with EMsg
  /* 7003 */ val UDSRenderUserAuth: typingsJapgolly.steamUser.mod.EMsg.UDSRenderUserAuth & Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuthResponse
    extends StObject
       with EMsg
  /* 7004 */ val UDSRenderUserAuthResponse: typingsJapgolly.steamUser.mod.EMsg.UDSRenderUserAuthResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunk
    extends StObject
       with EMsg
  /* 5223 */ val UFSDownloadChunk: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadChunk & Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkRequest
    extends StObject
       with EMsg
  /* 5246 */ val UFSDownloadChunkRequest: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadChunkRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkResponse
    extends StObject
       with EMsg
  /* 5247 */ val UFSDownloadChunkResponse: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadChunkResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishRequest
    extends StObject
       with EMsg
  /* 5248 */ val UFSDownloadFinishRequest: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadFinishRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishResponse
    extends StObject
       with EMsg
  /* 5249 */ val UFSDownloadFinishResponse: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadFinishResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadRequest
    extends StObject
       with EMsg
  /* 5221 */ val UFSDownloadRequest: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadResponse
    extends StObject
       with EMsg
  /* 5222 */ val UFSDownloadResponse: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartRequest
    extends StObject
       with EMsg
  /* 5244 */ val UFSDownloadStartRequest: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadStartRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartResponse
    extends StObject
       with EMsg
  /* 5245 */ val UFSDownloadStartResponse: typingsJapgolly.steamUser.mod.EMsg.UFSDownloadStartResponse & Double = js.native
  
  @js.native
  sealed trait UFSFlushURLCache
    extends StObject
       with EMsg
  /* 5250 */ val UFSFlushURLCache: typingsJapgolly.steamUser.mod.EMsg.UFSFlushURLCache & Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLs
    extends StObject
       with EMsg
  /* 5240 */ val UFSGetUGCURLs: typingsJapgolly.steamUser.mod.EMsg.UFSGetUGCURLs & Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLsResponse
    extends StObject
       with EMsg
  /* 5241 */ val UFSGetUGCURLsResponse: typingsJapgolly.steamUser.mod.EMsg.UFSGetUGCURLsResponse & Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest
    extends StObject
       with EMsg
  /* 5242 */ val UFSHttpUploadFileFinishRequest: typingsJapgolly.steamUser.mod.EMsg.UFSHttpUploadFileFinishRequest & Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse
    extends StObject
       with EMsg
  /* 5243 */ val UFSHttpUploadFileFinishResponse: typingsJapgolly.steamUser.mod.EMsg.UFSHttpUploadFileFinishResponse & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFile
    extends StObject
       with EMsg
  /* 5238 */ val UFSMigrateFile: typingsJapgolly.steamUser.mod.EMsg.UFSMigrateFile & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppID
    extends StObject
       with EMsg
  /* 5253 */ val UFSMigrateFileAppID: typingsJapgolly.steamUser.mod.EMsg.UFSMigrateFileAppID & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse
    extends StObject
       with EMsg
  /* 5254 */ val UFSMigrateFileAppIDResponse: typingsJapgolly.steamUser.mod.EMsg.UFSMigrateFileAppIDResponse & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileResponse
    extends StObject
       with EMsg
  /* 5239 */ val UFSMigrateFileResponse: typingsJapgolly.steamUser.mod.EMsg.UFSMigrateFileResponse & Double = js.native
  
  @js.native
  sealed trait UFSReloadAccount
    extends StObject
       with EMsg
  /* 5234 */ val UFSReloadAccount: typingsJapgolly.steamUser.mod.EMsg.UFSReloadAccount & Double = js.native
  
  @js.native
  sealed trait UFSReloadAccountResponse
    extends StObject
       with EMsg
  /* 5235 */ val UFSReloadAccountResponse: typingsJapgolly.steamUser.mod.EMsg.UFSReloadAccountResponse & Double = js.native
  
  @js.native
  sealed trait UFSReloadPartitionInfo
    extends StObject
       with EMsg
  /* 5215 */ val UFSReloadPartitionInfo: typingsJapgolly.steamUser.mod.EMsg.UFSReloadPartitionInfo & Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFile
    extends StObject
       with EMsg
  /* 5217 */ val UFSSynchronizeFile: typingsJapgolly.steamUser.mod.EMsg.UFSSynchronizeFile & Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFileResponse
    extends StObject
       with EMsg
  /* 5218 */ val UFSSynchronizeFileResponse: typingsJapgolly.steamUser.mod.EMsg.UFSSynchronizeFileResponse & Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlags
    extends StObject
       with EMsg
  /* 5228 */ val UFSUpdateFileFlags: typingsJapgolly.steamUser.mod.EMsg.UFSUpdateFileFlags & Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse
    extends StObject
       with EMsg
  /* 5229 */ val UFSUpdateFileFlagsResponse: typingsJapgolly.steamUser.mod.EMsg.UFSUpdateFileFlagsResponse & Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatched
    extends StObject
       with EMsg
  /* 5236 */ val UFSUpdateRecordBatched: typingsJapgolly.steamUser.mod.EMsg.UFSUpdateRecordBatched & Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse
    extends StObject
       with EMsg
  /* 5237 */ val UFSUpdateRecordBatchedResponse: typingsJapgolly.steamUser.mod.EMsg.UFSUpdateRecordBatchedResponse & Double = js.native
  
  @js.native
  sealed trait UFSUploadCommit
    extends StObject
       with EMsg
  /* 5251 */ val UFSUploadCommit: typingsJapgolly.steamUser.mod.EMsg.UFSUploadCommit & Double = js.native
  
  @js.native
  sealed trait UFSUploadCommitResponse
    extends StObject
       with EMsg
  /* 5252 */ val UFSUploadCommitResponse: typingsJapgolly.steamUser.mod.EMsg.UFSUploadCommitResponse & Double = js.native
  
  @js.native
  sealed trait UGSBase
    extends StObject
       with EMsg
  /* 7900 */ val UGSBase: typingsJapgolly.steamUser.mod.EMsg.UGSBase & Double = js.native
  
  @js.native
  sealed trait UGSGetUserAchievementStatus
    extends StObject
       with EMsg
  /* 4119 */ val UGSGetUserAchievementStatus: typingsJapgolly.steamUser.mod.EMsg.UGSGetUserAchievementStatus & Double = js.native
  
  @js.native
  sealed trait UGSGetUserAchievementStatusResponse
    extends StObject
       with EMsg
  /* 4164 */ val UGSGetUserAchievementStatusResponse: typingsJapgolly.steamUser.mod.EMsg.UGSGetUserAchievementStatusResponse & Double = js.native
  
  @js.native
  sealed trait UGSGetUserGameStats
    extends StObject
       with EMsg
  /* 4073 */ val UGSGetUserGameStats: typingsJapgolly.steamUser.mod.EMsg.UGSGetUserGameStats & Double = js.native
  
  @js.native
  sealed trait UGSGetUserGameStatsResponse
    extends StObject
       with EMsg
  /* 4074 */ val UGSGetUserGameStatsResponse: typingsJapgolly.steamUser.mod.EMsg.UGSGetUserGameStatsResponse & Double = js.native
  
  @js.native
  sealed trait UGSGetUserStats
    extends StObject
       with EMsg
  /* 4211 */ val UGSGetUserStats: typingsJapgolly.steamUser.mod.EMsg.UGSGetUserStats & Double = js.native
  
  @js.native
  sealed trait UGSStoreUserStats
    extends StObject
       with EMsg
  /* 4236 */ val UGSStoreUserStats: typingsJapgolly.steamUser.mod.EMsg.UGSStoreUserStats & Double = js.native
  
  @js.native
  sealed trait UGSStoreUserStatsResponse
    extends StObject
       with EMsg
  /* 4312 */ val UGSStoreUserStatsResponse: typingsJapgolly.steamUser.mod.EMsg.UGSStoreUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait UGSUpdateGlobalStats
    extends StObject
       with EMsg
  /* 7900 */ val UGSUpdateGlobalStats: typingsJapgolly.steamUser.mod.EMsg.UGSUpdateGlobalStats & Double = js.native
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch
    extends StObject
       with EMsg
  /* 8108 */ val UMQ2AM_ClientMsgBatch: typingsJapgolly.steamUser.mod.EMsg.UMQ2AM_ClientMsgBatch & Double = js.native
  
  @js.native
  sealed trait UMQBase
    extends StObject
       with EMsg
  /* 8100 */ val UMQBase: typingsJapgolly.steamUser.mod.EMsg.UMQBase & Double = js.native
  
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements
    extends StObject
       with EMsg
  /* 8110 */ val UMQEnqueueMobileAnnouncements: typingsJapgolly.steamUser.mod.EMsg.UMQEnqueueMobileAnnouncements & Double = js.native
  
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions
    extends StObject
       with EMsg
  /* 8109 */ val UMQEnqueueMobileSalePromotions: typingsJapgolly.steamUser.mod.EMsg.UMQEnqueueMobileSalePromotions & Double = js.native
  
  @js.native
  sealed trait UMQIncomingChatMessage
    extends StObject
       with EMsg
  /* 8105 */ val UMQIncomingChatMessage: typingsJapgolly.steamUser.mod.EMsg.UMQIncomingChatMessage & Double = js.native
  
  @js.native
  sealed trait UMQLogoffRequest
    extends StObject
       with EMsg
  /* 8102 */ val UMQLogoffRequest: typingsJapgolly.steamUser.mod.EMsg.UMQLogoffRequest & Double = js.native
  
  @js.native
  sealed trait UMQLogoffResponse
    extends StObject
       with EMsg
  /* 8103 */ val UMQLogoffResponse: typingsJapgolly.steamUser.mod.EMsg.UMQLogoffResponse & Double = js.native
  
  @js.native
  sealed trait UMQLogonRequest
    extends StObject
       with EMsg
  /* 8100 */ val UMQLogonRequest: typingsJapgolly.steamUser.mod.EMsg.UMQLogonRequest & Double = js.native
  
  @js.native
  sealed trait UMQLogonResponse
    extends StObject
       with EMsg
  /* 8101 */ val UMQLogonResponse: typingsJapgolly.steamUser.mod.EMsg.UMQLogonResponse & Double = js.native
  
  @js.native
  sealed trait UMQPoll
    extends StObject
       with EMsg
  /* 8106 */ val UMQPoll: typingsJapgolly.steamUser.mod.EMsg.UMQPoll & Double = js.native
  
  @js.native
  sealed trait UMQPollResults
    extends StObject
       with EMsg
  /* 8107 */ val UMQPollResults: typingsJapgolly.steamUser.mod.EMsg.UMQPollResults & Double = js.native
  
  @js.native
  sealed trait UMQSendChatMessage
    extends StObject
       with EMsg
  /* 8104 */ val UMQSendChatMessage: typingsJapgolly.steamUser.mod.EMsg.UMQSendChatMessage & Double = js.native
  
  @js.native
  sealed trait UniverseChanged
    extends StObject
       with EMsg
  /* 229 */ val UniverseChanged: typingsJapgolly.steamUser.mod.EMsg.UniverseChanged & Double = js.native
  
  @js.native
  sealed trait UniverseData
    extends StObject
       with EMsg
  /* 1010 */ val UniverseData: typingsJapgolly.steamUser.mod.EMsg.UniverseData & Double = js.native
  
  @js.native
  sealed trait UpdateConfigFile
    extends StObject
       with EMsg
  /* 322 */ val UpdateConfigFile: typingsJapgolly.steamUser.mod.EMsg.UpdateConfigFile & Double = js.native
  
  @js.native
  sealed trait UpdateCreditCardRequest
    extends StObject
       with EMsg
  /* 221 */ val UpdateCreditCardRequest: typingsJapgolly.steamUser.mod.EMsg.UpdateCreditCardRequest & Double = js.native
  
  @js.native
  sealed trait UpdateRecordResponse
    extends StObject
       with EMsg
  /* 215 */ val UpdateRecordResponse: typingsJapgolly.steamUser.mod.EMsg.UpdateRecordResponse & Double = js.native
  
  @js.native
  sealed trait UpdateScheduledTaskEnableStateResponse_TEST
    extends StObject
       with EMsg
  /* 245 */ val UpdateScheduledTaskEnableStateResponse_TEST: typingsJapgolly.steamUser.mod.EMsg.UpdateScheduledTaskEnableStateResponse_TEST & Double = js.native
  
  @js.native
  sealed trait UpdateScheduledTaskEnableState_TEST
    extends StObject
       with EMsg
  /* 244 */ val UpdateScheduledTaskEnableState_TEST: typingsJapgolly.steamUser.mod.EMsg.UpdateScheduledTaskEnableState_TEST & Double = js.native
  
  @js.native
  sealed trait UpdateUserBanResponse
    extends StObject
       with EMsg
  /* 225 */ val UpdateUserBanResponse: typingsJapgolly.steamUser.mod.EMsg.UpdateUserBanResponse & Double = js.native
  
  @js.native
  sealed trait VACResponse
    extends StObject
       with EMsg
  /* 601 */ val VACResponse: typingsJapgolly.steamUser.mod.EMsg.VACResponse & Double = js.native
  
  @js.native
  sealed trait VSAddCheat
    extends StObject
       with EMsg
  /* 605 */ val VSAddCheat: typingsJapgolly.steamUser.mod.EMsg.VSAddCheat & Double = js.native
  
  @js.native
  sealed trait VSChallengeResultText
    extends StObject
       with EMsg
  /* 608 */ val VSChallengeResultText: typingsJapgolly.steamUser.mod.EMsg.VSChallengeResultText & Double = js.native
  
  @js.native
  sealed trait VSGetChallengeResults
    extends StObject
       with EMsg
  /* 607 */ val VSGetChallengeResults: typingsJapgolly.steamUser.mod.EMsg.VSGetChallengeResults & Double = js.native
  
  @js.native
  sealed trait VSLoadDBFinished
    extends StObject
       with EMsg
  /* 611 */ val VSLoadDBFinished: typingsJapgolly.steamUser.mod.EMsg.VSLoadDBFinished & Double = js.native
  
  @js.native
  sealed trait VSMarkCheat
    extends StObject
       with EMsg
  /* 604 */ val VSMarkCheat: typingsJapgolly.steamUser.mod.EMsg.VSMarkCheat & Double = js.native
  
  @js.native
  sealed trait VSPurgeCodeModDB
    extends StObject
       with EMsg
  /* 606 */ val VSPurgeCodeModDB: typingsJapgolly.steamUser.mod.EMsg.VSPurgeCodeModDB & Double = js.native
  
  @js.native
  sealed trait VSReportLingerer
    extends StObject
       with EMsg
  /* 609 */ val VSReportLingerer: typingsJapgolly.steamUser.mod.EMsg.VSReportLingerer & Double = js.native
  
  @js.native
  sealed trait VSRequestManagedChallenge
    extends StObject
       with EMsg
  /* 610 */ val VSRequestManagedChallenge: typingsJapgolly.steamUser.mod.EMsg.VSRequestManagedChallenge & Double = js.native
  
  @js.native
  sealed trait WGRequest
    extends StObject
       with EMsg
  /* 130 */ val WGRequest: typingsJapgolly.steamUser.mod.EMsg.WGRequest & Double = js.native
  
  @js.native
  sealed trait WGResponse
    extends StObject
       with EMsg
  /* 131 */ val WGResponse: typingsJapgolly.steamUser.mod.EMsg.WGResponse & Double = js.native
  
  @js.native
  sealed trait WebAPIBase
    extends StObject
       with EMsg
  /* 8300 */ val WebAPIBase: typingsJapgolly.steamUser.mod.EMsg.WebAPIBase & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache
    extends StObject
       with EMsg
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: typingsJapgolly.steamUser.mod.EMsg.WebAPIInvalidateOAuthClientCache & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache
    extends StObject
       with EMsg
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: typingsJapgolly.steamUser.mod.EMsg.WebAPIInvalidateOAuthTokenCache & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount
    extends StObject
       with EMsg
  /* 8302 */ val WebAPIInvalidateTokensForAccount: typingsJapgolly.steamUser.mod.EMsg.WebAPIInvalidateTokensForAccount & Double = js.native
  
  @js.native
  sealed trait WebAPIJobRequest
    extends StObject
       with EMsg
  /* 133 */ val WebAPIJobRequest: typingsJapgolly.steamUser.mod.EMsg.WebAPIJobRequest & Double = js.native
  
  @js.native
  sealed trait WebAPIJobResponse
    extends StObject
       with EMsg
  /* 134 */ val WebAPIJobResponse: typingsJapgolly.steamUser.mod.EMsg.WebAPIJobResponse & Double = js.native
  
  @js.native
  sealed trait WebAPIRegisterGCInterfaces
    extends StObject
       with EMsg
  /* 8303 */ val WebAPIRegisterGCInterfaces: typingsJapgolly.steamUser.mod.EMsg.WebAPIRegisterGCInterfaces & Double = js.native
  
  @js.native
  sealed trait WebAPISetSecrets
    extends StObject
       with EMsg
  /* 8306 */ val WebAPISetSecrets: typingsJapgolly.steamUser.mod.EMsg.WebAPISetSecrets & Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token
    extends StObject
       with EMsg
  /* 8300 */ val WebAPIValidateOAuth2Token: typingsJapgolly.steamUser.mod.EMsg.WebAPIValidateOAuth2Token & Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse
    extends StObject
       with EMsg
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: typingsJapgolly.steamUser.mod.EMsg.WebAPIValidateOAuth2TokenResponse & Double = js.native
  
  @js.native
  sealed trait WorkerProcess
    extends StObject
       with EMsg
  /* 9000 */ val WorkerProcess: typingsJapgolly.steamUser.mod.EMsg.WorkerProcess & Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingRequest
    extends StObject
       with EMsg
  /* 9000 */ val WorkerProcessPingRequest: typingsJapgolly.steamUser.mod.EMsg.WorkerProcessPingRequest & Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingResponse
    extends StObject
       with EMsg
  /* 9001 */ val WorkerProcessPingResponse: typingsJapgolly.steamUser.mod.EMsg.WorkerProcessPingResponse & Double = js.native
  
  @js.native
  sealed trait WorkerProcessShutdown
    extends StObject
       with EMsg
  /* 9002 */ val WorkerProcessShutdown: typingsJapgolly.steamUser.mod.EMsg.WorkerProcessShutdown & Double = js.native
  
  @js.native
  sealed trait WorkshopAcceptTOSRequest
    extends StObject
       with EMsg
  /* 8200 */ val WorkshopAcceptTOSRequest: typingsJapgolly.steamUser.mod.EMsg.WorkshopAcceptTOSRequest & Double = js.native
  
  @js.native
  sealed trait WorkshopAcceptTOSResponse
    extends StObject
       with EMsg
  /* 8201 */ val WorkshopAcceptTOSResponse: typingsJapgolly.steamUser.mod.EMsg.WorkshopAcceptTOSResponse & Double = js.native
  
  @js.native
  sealed trait WorkshopBase
    extends StObject
       with EMsg
  /* 8200 */ val WorkshopBase: typingsJapgolly.steamUser.mod.EMsg.WorkshopBase & Double = js.native
  
  @js.native
  sealed trait ZipRequest
    extends StObject
       with EMsg
  /* 204 */ val ZipRequest: typingsJapgolly.steamUser.mod.EMsg.ZipRequest & Double = js.native
  
  @js.native
  sealed trait ZipResponse
    extends StObject
       with EMsg
  /* 205 */ val ZipResponse: typingsJapgolly.steamUser.mod.EMsg.ZipResponse & Double = js.native
}
