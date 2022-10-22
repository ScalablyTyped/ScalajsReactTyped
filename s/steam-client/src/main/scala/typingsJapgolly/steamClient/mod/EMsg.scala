package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMsg extends StObject
@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg & Double] = js.native
  
  // obsolete
  @js.native
  sealed trait AIGetAppGCFlags
    extends StObject
       with EMsg
  /* 423 */ val AIGetAppGCFlags: typingsJapgolly.steamClient.mod.EMsg.AIGetAppGCFlags & Double = js.native
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse
    extends StObject
       with EMsg
  /* 424 */ val AIGetAppGCFlagsResponse: typingsJapgolly.steamClient.mod.EMsg.AIGetAppGCFlagsResponse & Double = js.native
  
  @js.native
  sealed trait AIGetAppInfo
    extends StObject
       with EMsg
  /* 427 */ val AIGetAppInfo: typingsJapgolly.steamClient.mod.EMsg.AIGetAppInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse
    extends StObject
       with EMsg
  /* 428 */ val AIGetAppInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AIGetAppInfoResponse & Double = js.native
  
  @js.native
  sealed trait AIGetAppList
    extends StObject
       with EMsg
  /* 425 */ val AIGetAppList: typingsJapgolly.steamClient.mod.EMsg.AIGetAppList & Double = js.native
  
  @js.native
  sealed trait AIGetAppListResponse
    extends StObject
       with EMsg
  /* 426 */ val AIGetAppListResponse: typingsJapgolly.steamClient.mod.EMsg.AIGetAppListResponse & Double = js.native
  
  @js.native
  sealed trait AISAppInfoTableChanged
    extends StObject
       with EMsg
  /* 407 */ val AISAppInfoTableChanged: typingsJapgolly.steamClient.mod.EMsg.AISAppInfoTableChanged & Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessage
    extends StObject
       with EMsg
  /* 409 */ val AISCreateMarketingMessage: typingsJapgolly.steamClient.mod.EMsg.AISCreateMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse
    extends StObject
       with EMsg
  /* 410 */ val AISCreateMarketingMessageResponse: typingsJapgolly.steamClient.mod.EMsg.AISCreateMarketingMessageResponse & Double = js.native
  
  @js.native
  sealed trait AISDeleteMarketingMessage
    extends StObject
       with EMsg
  /* 416 */ val AISDeleteMarketingMessage: typingsJapgolly.steamClient.mod.EMsg.AISDeleteMarketingMessage & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISGetCouponDefinition
    extends StObject
       with EMsg
  /* 429 */ val AISGetCouponDefinition: typingsJapgolly.steamClient.mod.EMsg.AISGetCouponDefinition & Double = js.native
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse
    extends StObject
       with EMsg
  /* 430 */ val AISGetCouponDefinitionResponse: typingsJapgolly.steamClient.mod.EMsg.AISGetCouponDefinitionResponse & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessage
    extends StObject
       with EMsg
  /* 411 */ val AISGetMarketingMessage: typingsJapgolly.steamClient.mod.EMsg.AISGetMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessageResponse
    extends StObject
       with EMsg
  /* 412 */ val AISGetMarketingMessageResponse: typingsJapgolly.steamClient.mod.EMsg.AISGetMarketingMessageResponse & Double = js.native
  
  @js.native
  sealed trait AISGetMarketingTreatments
    extends StObject
       with EMsg
  /* 419 */ val AISGetMarketingTreatments: typingsJapgolly.steamClient.mod.EMsg.AISGetMarketingTreatments & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse
    extends StObject
       with EMsg
  /* 420 */ val AISGetMarketingTreatmentsResponse: typingsJapgolly.steamClient.mod.EMsg.AISGetMarketingTreatmentsResponse & Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumber
    extends StObject
       with EMsg
  /* 405 */ val AISGetPackageChangeNumber: typingsJapgolly.steamClient.mod.EMsg.AISGetPackageChangeNumber & Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse
    extends StObject
       with EMsg
  /* 406 */ val AISGetPackageChangeNumberResponse: typingsJapgolly.steamClient.mod.EMsg.AISGetPackageChangeNumberResponse & Double = js.native
  
  @js.native
  sealed trait AISRefreshContentDescription
    extends StObject
       with EMsg
  /* 401 */ val AISRefreshContentDescription: typingsJapgolly.steamClient.mod.EMsg.AISRefreshContentDescription & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISRequestContentDescription
    extends StObject
       with EMsg
  /* 402 */ val AISRequestContentDescription: typingsJapgolly.steamClient.mod.EMsg.AISRequestContentDescription & Double = js.native
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate
    extends StObject
       with EMsg
  /* 415 */ val AISRequestMarketingMessageUpdate: typingsJapgolly.steamClient.mod.EMsg.AISRequestMarketingMessageUpdate & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate
    extends StObject
       with EMsg
  /* 421 */ val AISRequestMarketingTreatmentUpdate: typingsJapgolly.steamClient.mod.EMsg.AISRequestMarketingTreatmentUpdate & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISTestAddPackage
    extends StObject
       with EMsg
  /* 422 */ val AISTestAddPackage: typingsJapgolly.steamClient.mod.EMsg.AISTestAddPackage & Double = js.native
  
  @js.native
  sealed trait AISTestEnableGC
    extends StObject
       with EMsg
  /* 433 */ val AISTestEnableGC: typingsJapgolly.steamClient.mod.EMsg.AISTestEnableGC & Double = js.native
  
  @js.native
  sealed trait AISUpdateAppInfo
    extends StObject
       with EMsg
  /* 403 */ val AISUpdateAppInfo: typingsJapgolly.steamClient.mod.EMsg.AISUpdateAppInfo & Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessage
    extends StObject
       with EMsg
  /* 413 */ val AISUpdateMarketingMessage: typingsJapgolly.steamClient.mod.EMsg.AISUpdateMarketingMessage & Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse
    extends StObject
       with EMsg
  /* 414 */ val AISUpdateMarketingMessageResponse: typingsJapgolly.steamClient.mod.EMsg.AISUpdateMarketingMessageResponse & Double = js.native
  
  // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageCosts
    extends StObject
       with EMsg
  /* 404 */ val AISUpdatePackageCosts: typingsJapgolly.steamClient.mod.EMsg.AISUpdatePackageCosts & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISUpdatePackageCostsResponse
    extends StObject
       with EMsg
  /* 408 */ val AISUpdatePackageCostsResponse: typingsJapgolly.steamClient.mod.EMsg.AISUpdatePackageCostsResponse & Double = js.native
  
  @js.native
  sealed trait AISUpdatePackageInfo
    extends StObject
       with EMsg
  /* 404 */ val AISUpdatePackageInfo: typingsJapgolly.steamClient.mod.EMsg.AISUpdatePackageInfo & Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription
    extends StObject
       with EMsg
  /* 431 */ val AISUpdateSlaveContentDescription: typingsJapgolly.steamClient.mod.EMsg.AISUpdateSlaveContentDescription & Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse
    extends StObject
       with EMsg
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: typingsJapgolly.steamClient.mod.EMsg.AISUpdateSlaveContentDescriptionResponse & Double = js.native
  
  @js.native
  sealed trait AMAccountPS3Unlink
    extends StObject
       with EMsg
  /* 4310 */ val AMAccountPS3Unlink: typingsJapgolly.steamClient.mod.EMsg.AMAccountPS3Unlink & Double = js.native
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse
    extends StObject
       with EMsg
  /* 4311 */ val AMAccountPS3UnlinkResponse: typingsJapgolly.steamClient.mod.EMsg.AMAccountPS3UnlinkResponse & Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchase
    extends StObject
       with EMsg
  /* 4346 */ val AMAcctAllowedToPurchase: typingsJapgolly.steamClient.mod.EMsg.AMAcctAllowedToPurchase & Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse
    extends StObject
       with EMsg
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMAcctAllowedToPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMAcknowledgeClanInvite
    extends StObject
       with EMsg
  /* 565 */ val AMAcknowledgeClanInvite: typingsJapgolly.steamClient.mod.EMsg.AMAcknowledgeClanInvite & Double = js.native
  
  @js.native
  sealed trait AMAddClanNews
    extends StObject
       with EMsg
  /* 4141 */ val AMAddClanNews: typingsJapgolly.steamClient.mod.EMsg.AMAddClanNews & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAddComment
    extends StObject
       with EMsg
  /* 4202 */ val AMAddComment: typingsJapgolly.steamClient.mod.EMsg.AMAddComment & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAddCommentResponse
    extends StObject
       with EMsg
  /* 4203 */ val AMAddCommentResponse: typingsJapgolly.steamClient.mod.EMsg.AMAddCommentResponse & Double = js.native
  
  @js.native
  sealed trait AMAddFounderToClan
    extends StObject
       with EMsg
  /* 4061 */ val AMAddFounderToClan: typingsJapgolly.steamClient.mod.EMsg.AMAddFounderToClan & Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicense
    extends StObject
       with EMsg
  /* 4224 */ val AMAddFreeLicense: typingsJapgolly.steamClient.mod.EMsg.AMAddFreeLicense & Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicenseResponse
    extends StObject
       with EMsg
  /* 4285 */ val AMAddFreeLicenseResponse: typingsJapgolly.steamClient.mod.EMsg.AMAddFreeLicenseResponse & Double = js.native
  
  @js.native
  sealed trait AMAddFriend
    extends StObject
       with EMsg
  /* 4081 */ val AMAddFriend: typingsJapgolly.steamClient.mod.EMsg.AMAddFriend & Double = js.native
  
  @js.native
  sealed trait AMAddFriendResponse
    extends StObject
       with EMsg
  /* 4082 */ val AMAddFriendResponse: typingsJapgolly.steamClient.mod.EMsg.AMAddFriendResponse & Double = js.native
  
  @js.native
  sealed trait AMAddLicense
    extends StObject
       with EMsg
  /* 505 */ val AMAddLicense: typingsJapgolly.steamClient.mod.EMsg.AMAddLicense & Double = js.native
  
  @js.native
  sealed trait AMAddMinutesToLicense
    extends StObject
       with EMsg
  /* 510 */ val AMAddMinutesToLicense: typingsJapgolly.steamClient.mod.EMsg.AMAddMinutesToLicense & Double = js.native
  
  @js.native
  sealed trait AMAddPublisherUser
    extends StObject
       with EMsg
  /* 4280 */ val AMAddPublisherUser: typingsJapgolly.steamClient.mod.EMsg.AMAddPublisherUser & Double = js.native
  
  @js.native
  sealed trait AMAddUsersToMarketingTreatment
    extends StObject
       with EMsg
  /* 4234 */ val AMAddUsersToMarketingTreatment: typingsJapgolly.steamClient.mod.EMsg.AMAddUsersToMarketingTreatment & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery
    extends StObject
       with EMsg
  /* 558 */ val AMAllowUserContentQuery: typingsJapgolly.steamClient.mod.EMsg.AMAllowUserContentQuery & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse
    extends StObject
       with EMsg
  /* 559 */ val AMAllowUserContentResponse: typingsJapgolly.steamClient.mod.EMsg.AMAllowUserContentResponse & Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesRequest
    extends StObject
       with EMsg
  /* 4156 */ val AMAllowUserFilesRequest: typingsJapgolly.steamClient.mod.EMsg.AMAllowUserFilesRequest & Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesResponse
    extends StObject
       with EMsg
  /* 4157 */ val AMAllowUserFilesResponse: typingsJapgolly.steamClient.mod.EMsg.AMAllowUserFilesResponse & Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUser
    extends StObject
       with EMsg
  /* 592 */ val AMAuthenticateUser: typingsJapgolly.steamClient.mod.EMsg.AMAuthenticateUser & Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUserResponse
    extends StObject
       with EMsg
  /* 593 */ val AMAuthenticateUserResponse: typingsJapgolly.steamClient.mod.EMsg.AMAuthenticateUserResponse & Double = js.native
  
  @js.native
  sealed trait AMAuthenticatedPlayerList
    extends StObject
       with EMsg
  /* 4315 */ val AMAuthenticatedPlayerList: typingsJapgolly.steamClient.mod.EMsg.AMAuthenticatedPlayerList & Double = js.native
  
  @js.native
  sealed trait AMBanFromChat
    extends StObject
       with EMsg
  /* 4145 */ val AMBanFromChat: typingsJapgolly.steamClient.mod.EMsg.AMBanFromChat & Double = js.native
  
  @js.native
  sealed trait AMBeginProcessingLicenses
    extends StObject
       with EMsg
  /* 507 */ val AMBeginProcessingLicenses: typingsJapgolly.steamClient.mod.EMsg.AMBeginProcessingLicenses & Double = js.native
  
  @js.native
  sealed trait AMBitPayPayment
    extends StObject
       with EMsg
  /* 4410 */ val AMBitPayPayment: typingsJapgolly.steamClient.mod.EMsg.AMBitPayPayment & Double = js.native
  
  @js.native
  sealed trait AMBitPayPaymentResponse
    extends StObject
       with EMsg
  /* 4411 */ val AMBitPayPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMBitPayPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPayment
    extends StObject
       with EMsg
  /* 4380 */ val AMBoaCompraPayment: typingsJapgolly.steamClient.mod.EMsg.AMBoaCompraPayment & Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse
    extends StObject
       with EMsg
  /* 4381 */ val AMBoaCompraPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMBoaCompraPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollect
    extends StObject
       with EMsg
  /* 4086 */ val AMCancelEasyCollect: typingsJapgolly.steamClient.mod.EMsg.AMCancelEasyCollect & Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollectResponse
    extends StObject
       with EMsg
  /* 4087 */ val AMCancelEasyCollectResponse: typingsJapgolly.steamClient.mod.EMsg.AMCancelEasyCollectResponse & Double = js.native
  
  @js.native
  sealed trait AMCancelLicense
    extends StObject
       with EMsg
  /* 511 */ val AMCancelLicense: typingsJapgolly.steamClient.mod.EMsg.AMCancelLicense & Double = js.native
  
  @js.native
  sealed trait AMCancelPurchase
    extends StObject
       with EMsg
  /* 522 */ val AMCancelPurchase: typingsJapgolly.steamClient.mod.EMsg.AMCancelPurchase & Double = js.native
  
  @js.native
  sealed trait AMChallengeNotification
    extends StObject
       with EMsg
  /* 4105 */ val AMChallengeNotification: typingsJapgolly.steamClient.mod.EMsg.AMChallengeNotification & Double = js.native
  
  @js.native
  sealed trait AMChallengeVerdict
    extends StObject
       with EMsg
  /* 4104 */ val AMChallengeVerdict: typingsJapgolly.steamClient.mod.EMsg.AMChallengeVerdict & Double = js.native
  
  @js.native
  sealed trait AMChangeClanOwner
    extends StObject
       with EMsg
  /* 4085 */ val AMChangeClanOwner: typingsJapgolly.steamClient.mod.EMsg.AMChangeClanOwner & Double = js.native
  
  @js.native
  sealed trait AMChatActionResult
    extends StObject
       with EMsg
  /* 579 */ val AMChatActionResult: typingsJapgolly.steamClient.mod.EMsg.AMChatActionResult & Double = js.native
  
  @js.native
  sealed trait AMChatCleanup
    extends StObject
       with EMsg
  /* 533 */ val AMChatCleanup: typingsJapgolly.steamClient.mod.EMsg.AMChatCleanup & Double = js.native
  
  @js.native
  sealed trait AMChatEnter
    extends StObject
       with EMsg
  /* 577 */ val AMChatEnter: typingsJapgolly.steamClient.mod.EMsg.AMChatEnter & Double = js.native
  
  @js.native
  sealed trait AMChatInvite
    extends StObject
       with EMsg
  /* 572 */ val AMChatInvite: typingsJapgolly.steamClient.mod.EMsg.AMChatInvite & Double = js.native
  
  @js.native
  sealed trait AMChatMulti
    extends StObject
       with EMsg
  /* 570 */ val AMChatMulti: typingsJapgolly.steamClient.mod.EMsg.AMChatMulti & Double = js.native
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting
    extends StObject
       with EMsg
  /* 4118 */ val AMCheckClanInviteRateLimiting: typingsJapgolly.steamClient.mod.EMsg.AMCheckClanInviteRateLimiting & Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembership
    extends StObject
       with EMsg
  /* 4075 */ val AMCheckClanMembership: typingsJapgolly.steamClient.mod.EMsg.AMCheckClanMembership & Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembershipResponse
    extends StObject
       with EMsg
  /* 4161 */ val AMCheckClanMembershipResponse: typingsJapgolly.steamClient.mod.EMsg.AMCheckClanMembershipResponse & Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGift
    extends StObject
       with EMsg
  /* 4352 */ val AMClaimUnownedUserGift: typingsJapgolly.steamClient.mod.EMsg.AMClaimUnownedUserGift & Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse
    extends StObject
       with EMsg
  /* 4353 */ val AMClaimUnownedUserGiftResponse: typingsJapgolly.steamClient.mod.EMsg.AMClaimUnownedUserGiftResponse & Double = js.native
  
  @js.native
  sealed trait AMClanCleanup
    extends StObject
       with EMsg
  /* 534 */ val AMClanCleanup: typingsJapgolly.steamClient.mod.EMsg.AMClanCleanup & Double = js.native
  
  @js.native
  sealed trait AMClanCleanupList
    extends StObject
       with EMsg
  /* 538 */ val AMClanCleanupList: typingsJapgolly.steamClient.mod.EMsg.AMClanCleanupList & Double = js.native
  
  @js.native
  sealed trait AMClanDataUpdated
    extends StObject
       with EMsg
  /* 567 */ val AMClanDataUpdated: typingsJapgolly.steamClient.mod.EMsg.AMClanDataUpdated & Double = js.native
  
  @js.native
  sealed trait AMClanPermissions
    extends StObject
       with EMsg
  /* 4011 */ val AMClanPermissions: typingsJapgolly.steamClient.mod.EMsg.AMClanPermissions & Double = js.native
  
  @js.native
  sealed trait AMClanPermissionsResponse
    extends StObject
       with EMsg
  /* 4012 */ val AMClanPermissionsResponse: typingsJapgolly.steamClient.mod.EMsg.AMClanPermissionsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMClansInCommon
    extends StObject
       with EMsg
  /* 4090 */ val AMClansInCommon: typingsJapgolly.steamClient.mod.EMsg.AMClansInCommon & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCount
    extends StObject
       with EMsg
  /* 4103 */ val AMClansInCommonCount: typingsJapgolly.steamClient.mod.EMsg.AMClansInCommonCount & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCountResponse
    extends StObject
       with EMsg
  /* 4097 */ val AMClansInCommonCountResponse: typingsJapgolly.steamClient.mod.EMsg.AMClansInCommonCountResponse & Double = js.native
  
  @js.native
  sealed trait AMClansInCommonResponse
    extends StObject
       with EMsg
  /* 4091 */ val AMClansInCommonResponse: typingsJapgolly.steamClient.mod.EMsg.AMClansInCommonResponse & Double = js.native
  
  @js.native
  sealed trait AMClearDispute
    extends StObject
       with EMsg
  /* 4264 */ val AMClearDispute: typingsJapgolly.steamClient.mod.EMsg.AMClearDispute & Double = js.native
  
  @js.native
  sealed trait AMClearDisputeResponse
    extends StObject
       with EMsg
  /* 4265 */ val AMClearDisputeResponse: typingsJapgolly.steamClient.mod.EMsg.AMClearDisputeResponse & Double = js.native
  
  @js.native
  sealed trait AMClearPersonaMetadataBlob
    extends StObject
       with EMsg
  /* 4306 */ val AMClearPersonaMetadataBlob: typingsJapgolly.steamClient.mod.EMsg.AMClearPersonaMetadataBlob & Double = js.native
  
  @js.native
  sealed trait AMClientAcceptFriendInvite
    extends StObject
       with EMsg
  /* 576 */ val AMClientAcceptFriendInvite: typingsJapgolly.steamClient.mod.EMsg.AMClientAcceptFriendInvite & Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroup
    extends StObject
       with EMsg
  /* 5566 */ val AMClientAddFriendToGroup: typingsJapgolly.steamClient.mod.EMsg.AMClientAddFriendToGroup & Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse
    extends StObject
       with EMsg
  /* 5567 */ val AMClientAddFriendToGroupResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientAddFriendToGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientChatActionRelay
    extends StObject
       with EMsg
  /* 598 */ val AMClientChatActionRelay: typingsJapgolly.steamClient.mod.EMsg.AMClientChatActionRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatInviteRelay
    extends StObject
       with EMsg
  /* 571 */ val AMClientChatInviteRelay: typingsJapgolly.steamClient.mod.EMsg.AMClientChatInviteRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay
    extends StObject
       with EMsg
  /* 574 */ val AMClientChatMemberInfoRelay: typingsJapgolly.steamClient.mod.EMsg.AMClientChatMemberInfoRelay & Double = js.native
  
  @js.native
  sealed trait AMClientChatMsgRelay
    extends StObject
       with EMsg
  /* 569 */ val AMClientChatMsgRelay: typingsJapgolly.steamClient.mod.EMsg.AMClientChatMsgRelay & Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroup
    extends StObject
       with EMsg
  /* 5560 */ val AMClientCreateFriendsGroup: typingsJapgolly.steamClient.mod.EMsg.AMClientCreateFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5561 */ val AMClientCreateFriendsGroupResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientCreateFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup
    extends StObject
       with EMsg
  /* 5562 */ val AMClientDeleteFriendsGroup: typingsJapgolly.steamClient.mod.EMsg.AMClientDeleteFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientDeleteFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientJoinChatRelay
    extends StObject
       with EMsg
  /* 573 */ val AMClientJoinChatRelay: typingsJapgolly.steamClient.mod.EMsg.AMClientJoinChatRelay & Double = js.native
  
  @js.native
  sealed trait AMClientNotPlaying
    extends StObject
       with EMsg
  /* 553 */ val AMClientNotPlaying: typingsJapgolly.steamClient.mod.EMsg.AMClientNotPlaying & Double = js.native
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource
    extends StObject
       with EMsg
  /* 578 */ val AMClientPublishRemovalFromSource: typingsJapgolly.steamClient.mod.EMsg.AMClientPublishRemovalFromSource & Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup
    extends StObject
       with EMsg
  /* 5568 */ val AMClientRemoveFriendFromGroup: typingsJapgolly.steamClient.mod.EMsg.AMClientRemoveFriendFromGroup & Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse
    extends StObject
       with EMsg
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientRemoveFriendFromGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroup
    extends StObject
       with EMsg
  /* 5564 */ val AMClientRenameFriendsGroup: typingsJapgolly.steamClient.mod.EMsg.AMClientRenameFriendsGroup & Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse
    extends StObject
       with EMsg
  /* 5565 */ val AMClientRenameFriendsGroupResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientRenameFriendsGroupResponse & Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNickname
    extends StObject
       with EMsg
  /* 5588 */ val AMClientSetPlayerNickname: typingsJapgolly.steamClient.mod.EMsg.AMClientSetPlayerNickname & Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse
    extends StObject
       with EMsg
  /* 5589 */ val AMClientSetPlayerNicknameResponse: typingsJapgolly.steamClient.mod.EMsg.AMClientSetPlayerNicknameResponse & Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchase
    extends StObject
       with EMsg
  /* 4383 */ val AMCompleteExternalPurchase: typingsJapgolly.steamClient.mod.EMsg.AMCompleteExternalPurchase & Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse
    extends StObject
       with EMsg
  /* 4384 */ val AMCompleteExternalPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMCompleteExternalPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMCompletePurchase
    extends StObject
       with EMsg
  /* 521 */ val AMCompletePurchase: typingsJapgolly.steamClient.mod.EMsg.AMCompletePurchase & Double = js.native
  
  @js.native
  sealed trait AMConvertClan
    extends StObject
       with EMsg
  /* 4093 */ val AMConvertClan: typingsJapgolly.steamClient.mod.EMsg.AMConvertClan & Double = js.native
  
  @js.native
  sealed trait AMConvertWallet
    extends StObject
       with EMsg
  /* 4251 */ val AMConvertWallet: typingsJapgolly.steamClient.mod.EMsg.AMConvertWallet & Double = js.native
  
  @js.native
  sealed trait AMConvertWalletResponse
    extends StObject
       with EMsg
  /* 4252 */ val AMConvertWalletResponse: typingsJapgolly.steamClient.mod.EMsg.AMConvertWalletResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateAccountRecord
    extends StObject
       with EMsg
  /* 4109 */ val AMCreateAccountRecord: typingsJapgolly.steamClient.mod.EMsg.AMCreateAccountRecord & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3
    extends StObject
       with EMsg
  /* 4183 */ val AMCreateAccountRecordInSteam3: typingsJapgolly.steamClient.mod.EMsg.AMCreateAccountRecordInSteam3 & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateAccountResponse
    extends StObject
       with EMsg
  /* 129 */ val AMCreateAccountResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateAccountResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateChargeback
    extends StObject
       with EMsg
  /* 4260 */ val AMCreateChargeback: typingsJapgolly.steamClient.mod.EMsg.AMCreateChargeback & Double = js.native
  
  @js.native
  sealed trait AMCreateChargebackResponse
    extends StObject
       with EMsg
  /* 4261 */ val AMCreateChargebackResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateChargebackResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateChat
    extends StObject
       with EMsg
  /* 4001 */ val AMCreateChat: typingsJapgolly.steamClient.mod.EMsg.AMCreateChat & Double = js.native
  
  @js.native
  sealed trait AMCreateChatResponse
    extends StObject
       with EMsg
  /* 4002 */ val AMCreateChatResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateChatResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClan
    extends StObject
       with EMsg
  /* 586 */ val AMCreateClan: typingsJapgolly.steamClient.mod.EMsg.AMCreateClan & Double = js.native
  
  @js.native
  sealed trait AMCreateClanAnnouncement
    extends StObject
       with EMsg
  /* 4027 */ val AMCreateClanAnnouncement: typingsJapgolly.steamClient.mod.EMsg.AMCreateClanAnnouncement & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4028 */ val AMCreateClanAnnouncementResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClanEvent
    extends StObject
       with EMsg
  /* 4013 */ val AMCreateClanEvent: typingsJapgolly.steamClient.mod.EMsg.AMCreateClanEvent & Double = js.native
  
  @js.native
  sealed trait AMCreateClanEventResponse
    extends StObject
       with EMsg
  /* 4014 */ val AMCreateClanEventResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateClanResponse
    extends StObject
       with EMsg
  /* 587 */ val AMCreateClanResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateClanResponse & Double = js.native
  
  @js.native
  sealed trait AMCreateDispute
    extends StObject
       with EMsg
  /* 4262 */ val AMCreateDispute: typingsJapgolly.steamClient.mod.EMsg.AMCreateDispute & Double = js.native
  
  @js.native
  sealed trait AMCreateDisputeResponse
    extends StObject
       with EMsg
  /* 4263 */ val AMCreateDisputeResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateDisputeResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateRefund
    extends StObject
       with EMsg
  /* 4258 */ val AMCreateRefund: typingsJapgolly.steamClient.mod.EMsg.AMCreateRefund & Double = js.native
  
  @js.native
  sealed trait AMCreateRefundResponse
    extends StObject
       with EMsg
  /* 4259 */ val AMCreateRefundResponse: typingsJapgolly.steamClient.mod.EMsg.AMCreateRefundResponse & Double = js.native
  
  @js.native
  sealed trait AMDegicaPayment
    extends StObject
       with EMsg
  /* 4396 */ val AMDegicaPayment: typingsJapgolly.steamClient.mod.EMsg.AMDegicaPayment & Double = js.native
  
  @js.native
  sealed trait AMDegicaPaymentResponse
    extends StObject
       with EMsg
  /* 4397 */ val AMDegicaPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMDegicaPaymentResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement
    extends StObject
       with EMsg
  /* 4035 */ val AMDeleteClanAnnouncement: typingsJapgolly.steamClient.mod.EMsg.AMDeleteClanAnnouncement & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4036 */ val AMDeleteClanAnnouncementResponse: typingsJapgolly.steamClient.mod.EMsg.AMDeleteClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEvent
    extends StObject
       with EMsg
  /* 4019 */ val AMDeleteClanEvent: typingsJapgolly.steamClient.mod.EMsg.AMDeleteClanEvent & Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEventResponse
    extends StObject
       with EMsg
  /* 4020 */ val AMDeleteClanEventResponse: typingsJapgolly.steamClient.mod.EMsg.AMDeleteClanEventResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteComment
    extends StObject
       with EMsg
  /* 4204 */ val AMDeleteComment: typingsJapgolly.steamClient.mod.EMsg.AMDeleteComment & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse
    extends StObject
       with EMsg
  /* 4205 */ val AMDeleteCommentResponse: typingsJapgolly.steamClient.mod.EMsg.AMDeleteCommentResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteStoredCard
    extends StObject
       with EMsg
  /* 4241 */ val AMDeleteStoredCard: typingsJapgolly.steamClient.mod.EMsg.AMDeleteStoredCard & Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo
    extends StObject
       with EMsg
  /* 4246 */ val AMDeleteStoredPaymentInfo: typingsJapgolly.steamClient.mod.EMsg.AMDeleteStoredPaymentInfo & Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement
    extends StObject
       with EMsg
  /* 4330 */ val AMDeleteStoredPaypalAgreement: typingsJapgolly.steamClient.mod.EMsg.AMDeleteStoredPaypalAgreement & Double = js.native
  
  @js.native
  sealed trait AMDumpClan
    extends StObject
       with EMsg
  /* 4084 */ val AMDumpClan: typingsJapgolly.steamClient.mod.EMsg.AMDumpClan & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDumpUser
    extends StObject
       with EMsg
  /* 4059 */ val AMDumpUser: typingsJapgolly.steamClient.mod.EMsg.AMDumpUser & Double = js.native
  
  @js.native
  sealed trait AMEClubPayment
    extends StObject
       with EMsg
  /* 4398 */ val AMEClubPayment: typingsJapgolly.steamClient.mod.EMsg.AMEClubPayment & Double = js.native
  
  @js.native
  sealed trait AMEClubPaymentResponse
    extends StObject
       with EMsg
  /* 4399 */ val AMEClubPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMEClubPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMEditBanReason
    extends StObject
       with EMsg
  /* 4160 */ val AMEditBanReason: typingsJapgolly.steamClient.mod.EMsg.AMEditBanReason & Double = js.native
  
  @js.native
  sealed trait AMExpireCaptchaByGID
    extends StObject
       with EMsg
  /* 4382 */ val AMExpireCaptchaByGID: typingsJapgolly.steamClient.mod.EMsg.AMExpireCaptchaByGID & Double = js.native
  
  @js.native
  sealed trait AMExtendLicense
    extends StObject
       with EMsg
  /* 509 */ val AMExtendLicense: typingsJapgolly.steamClient.mod.EMsg.AMExtendLicense & Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchase
    extends StObject
       with EMsg
  /* 4367 */ val AMFinalizePurchase: typingsJapgolly.steamClient.mod.EMsg.AMFinalizePurchase & Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchaseResponse
    extends StObject
       with EMsg
  /* 4368 */ val AMFinalizePurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMFinalizePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMFindAccounts
    extends StObject
       with EMsg
  /* 580 */ val AMFindAccounts: typingsJapgolly.steamClient.mod.EMsg.AMFindAccounts & Double = js.native
  
  @js.native
  sealed trait AMFindAccountsResponse
    extends StObject
       with EMsg
  /* 581 */ val AMFindAccountsResponse: typingsJapgolly.steamClient.mod.EMsg.AMFindAccountsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMFindClanUser
    extends StObject
       with EMsg
  /* 4143 */ val AMFindClanUser: typingsJapgolly.steamClient.mod.EMsg.AMFindClanUser & Double = js.native
  
  @js.native
  sealed trait AMFindClanUserResponse
    extends StObject
       with EMsg
  /* 4144 */ val AMFindClanUserResponse: typingsJapgolly.steamClient.mod.EMsg.AMFindClanUserResponse & Double = js.native
  
  @js.native
  sealed trait AMFindGSByIP
    extends StObject
       with EMsg
  /* 4106 */ val AMFindGSByIP: typingsJapgolly.steamClient.mod.EMsg.AMFindGSByIP & Double = js.native
  
  @js.native
  sealed trait AMFindHungTransactions
    extends StObject
       with EMsg
  /* 518 */ val AMFindHungTransactions: typingsJapgolly.steamClient.mod.EMsg.AMFindHungTransactions & Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchase
    extends StObject
       with EMsg
  /* 525 */ val AMFixPendingPurchase: typingsJapgolly.steamClient.mod.EMsg.AMFixPendingPurchase & Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse
    extends StObject
       with EMsg
  /* 526 */ val AMFixPendingPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMFixPendingPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMFixPendingRefund
    extends StObject
       with EMsg
  /* 535 */ val AMFixPendingRefund: typingsJapgolly.steamClient.mod.EMsg.AMFixPendingRefund & Double = js.native
  
  @js.native
  sealed trait AMFoundGSByIP
    extends StObject
       with EMsg
  /* 4107 */ val AMFoundGSByIP: typingsJapgolly.steamClient.mod.EMsg.AMFoundGSByIP & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommon
    extends StObject
       with EMsg
  /* 4100 */ val AMFriendsInCommon: typingsJapgolly.steamClient.mod.EMsg.AMFriendsInCommon & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse
    extends StObject
       with EMsg
  /* 4102 */ val AMFriendsInCommonCountResponse: typingsJapgolly.steamClient.mod.EMsg.AMFriendsInCommonCountResponse & Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonResponse
    extends StObject
       with EMsg
  /* 4101 */ val AMFriendsInCommonResponse: typingsJapgolly.steamClient.mod.EMsg.AMFriendsInCommonResponse & Double = js.native
  
  @js.native
  sealed trait AMFriendsList
    extends StObject
       with EMsg
  /* 4098 */ val AMFriendsList: typingsJapgolly.steamClient.mod.EMsg.AMFriendsList & Double = js.native
  
  @js.native
  sealed trait AMFriendsListResponse
    extends StObject
       with EMsg
  /* 4099 */ val AMFriendsListResponse: typingsJapgolly.steamClient.mod.EMsg.AMFriendsListResponse & Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerRemove
    extends StObject
       with EMsg
  /* 6406 */ val AMGMSGameServerRemove: typingsJapgolly.steamClient.mod.EMsg.AMGMSGameServerRemove & Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerUpdate
    extends StObject
       with EMsg
  /* 6405 */ val AMGMSGameServerUpdate: typingsJapgolly.steamClient.mod.EMsg.AMGMSGameServerUpdate & Double = js.native
  
  @js.native
  sealed trait AMGSSearch
    extends StObject
       with EMsg
  /* 4213 */ val AMGSSearch: typingsJapgolly.steamClient.mod.EMsg.AMGSSearch & Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountChangePassword
    extends StObject
       with EMsg
  /* 4340 */ val AMGameServerAccountChangePassword: typingsJapgolly.steamClient.mod.EMsg.AMGameServerAccountChangePassword & Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount
    extends StObject
       with EMsg
  /* 4341 */ val AMGameServerAccountDeleteAccount: typingsJapgolly.steamClient.mod.EMsg.AMGameServerAccountDeleteAccount & Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck
    extends StObject
       with EMsg
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: typingsJapgolly.steamClient.mod.EMsg.AMGameServerPlayerCompatibilityCheck & Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse
    extends StObject
       with EMsg
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: typingsJapgolly.steamClient.mod.EMsg.AMGameServerPlayerCompatibilityCheckResponse & Double = js.native
  
  @js.native
  sealed trait AMGameServerRemove
    extends StObject
       with EMsg
  /* 4332 */ val AMGameServerRemove: typingsJapgolly.steamClient.mod.EMsg.AMGameServerRemove & Double = js.native
  
  @js.native
  sealed trait AMGameServerUpdate
    extends StObject
       with EMsg
  /* 4331 */ val AMGameServerUpdate: typingsJapgolly.steamClient.mod.EMsg.AMGameServerUpdate & Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfo
    extends StObject
       with EMsg
  /* 4323 */ val AMGetAccountBanInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountBanInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse
    extends StObject
       with EMsg
  /* 4324 */ val AMGetAccountBanInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountBanInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo
    extends StObject
       with EMsg
  /* 4338 */ val AMGetAccountCommunityBanInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountCommunityBanInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse
    extends StObject
       with EMsg
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountCommunityBanInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails
    extends StObject
       with EMsg
  /* 4287 */ val AMGetAccountDetails: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountDetails & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails2
    extends StObject
       with EMsg
  /* 4112 */ val AMGetAccountDetails2: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountDetails2 & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse
    extends StObject
       with EMsg
  /* 4288 */ val AMGetAccountDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2
    extends StObject
       with EMsg
  /* 4113 */ val AMGetAccountDetailsResponse2: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountDetailsResponse2 & Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddress
    extends StObject
       with EMsg
  /* 4006 */ val AMGetAccountEmailAddress: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountEmailAddress & Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse
    extends StObject
       with EMsg
  /* 4007 */ val AMGetAccountEmailAddressResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountEmailAddressResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing
    extends StObject
       with EMsg
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountFlagsForWGSpoofing & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse
    extends StObject
       with EMsg
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountFlagsForWGSpoofingResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountFriendsCount
    extends StObject
       with EMsg
  /* 594 */ val AMGetAccountFriendsCount: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountFriendsCount & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse
    extends StObject
       with EMsg
  /* 595 */ val AMGetAccountFriendsCountResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountFriendsCountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinks
    extends StObject
       with EMsg
  /* 4069 */ val AMGetAccountLinks: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountLinks & Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinksResponse
    extends StObject
       with EMsg
  /* 4070 */ val AMGetAccountLinksResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountLinksResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfo
    extends StObject
       with EMsg
  /* 4313 */ val AMGetAccountPSNInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountPSNInfo & Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse
    extends StObject
       with EMsg
  /* 4314 */ val AMGetAccountPSNInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountPSNInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest
    extends StObject
       with EMsg
  /* 4408 */ val AMGetAccountResetDetailsRequest: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountResetDetailsRequest & Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse
    extends StObject
       with EMsg
  /* 4409 */ val AMGetAccountResetDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountResetDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatus
    extends StObject
       with EMsg
  /* 4158 */ val AMGetAccountStatus: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountStatus & Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatusResponse
    extends StObject
       with EMsg
  /* 4159 */ val AMGetAccountStatusResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetAccountStatusResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetBillingAddress
    extends StObject
       with EMsg
  /* 4188 */ val AMGetBillingAddress: typingsJapgolly.steamClient.mod.EMsg.AMGetBillingAddress & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse
    extends StObject
       with EMsg
  /* 4189 */ val AMGetBillingAddressResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGID
    extends StObject
       with EMsg
  /* 4134 */ val AMGetCaptchaDataByGID: typingsJapgolly.steamClient.mod.EMsg.AMGetCaptchaDataByGID & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse
    extends StObject
       with EMsg
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetCaptchaDataByGIDResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIP
    extends StObject
       with EMsg
  /* 4129 */ val AMGetCaptchaDataForIP: typingsJapgolly.steamClient.mod.EMsg.AMGetCaptchaDataForIP & Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse
    extends StObject
       with EMsg
  /* 4130 */ val AMGetCaptchaDataForIPResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetCaptchaDataForIPResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCardList
    extends StObject
       with EMsg
  /* 4239 */ val AMGetCardList: typingsJapgolly.steamClient.mod.EMsg.AMGetCardList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCardListResponse
    extends StObject
       with EMsg
  /* 4240 */ val AMGetCardListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetCardListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetChatBanList
    extends StObject
       with EMsg
  /* 4065 */ val AMGetChatBanList: typingsJapgolly.steamClient.mod.EMsg.AMGetChatBanList & Double = js.native
  
  @js.native
  sealed trait AMGetChatBanListResponse
    extends StObject
       with EMsg
  /* 4066 */ val AMGetChatBanListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetChatBanListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements
    extends StObject
       with EMsg
  /* 4033 */ val AMGetClanAnnouncements: typingsJapgolly.steamClient.mod.EMsg.AMGetClanAnnouncements & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount
    extends StObject
       with EMsg
  /* 4031 */ val AMGetClanAnnouncementsCount: typingsJapgolly.steamClient.mod.EMsg.AMGetClanAnnouncementsCount & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse
    extends StObject
       with EMsg
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanAnnouncementsCountResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse
    extends StObject
       with EMsg
  /* 4034 */ val AMGetClanAnnouncementsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanAnnouncementsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetails
    extends StObject
       with EMsg
  /* 588 */ val AMGetClanDetails: typingsJapgolly.steamClient.mod.EMsg.AMGetClanDetails & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation
    extends StObject
       with EMsg
  /* 4373 */ val AMGetClanDetailsForForumCreation: typingsJapgolly.steamClient.mod.EMsg.AMGetClanDetailsForForumCreation & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse
    extends StObject
       with EMsg
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanDetailsForForumCreationResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsResponse
    extends StObject
       with EMsg
  /* 589 */ val AMGetClanDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanEvents
    extends StObject
       with EMsg
  /* 4017 */ val AMGetClanEvents: typingsJapgolly.steamClient.mod.EMsg.AMGetClanEvents & Double = js.native
  
  @js.native
  sealed trait AMGetClanEventsResponse
    extends StObject
       with EMsg
  /* 4018 */ val AMGetClanEventsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanEventsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanHistory
    extends StObject
       with EMsg
  /* 4039 */ val AMGetClanHistory: typingsJapgolly.steamClient.mod.EMsg.AMGetClanHistory & Double = js.native
  
  @js.native
  sealed trait AMGetClanHistoryResponse
    extends StObject
       with EMsg
  /* 4040 */ val AMGetClanHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembers
    extends StObject
       with EMsg
  /* 4076 */ val AMGetClanMembers: typingsJapgolly.steamClient.mod.EMsg.AMGetClanMembers & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembersResponse
    extends StObject
       with EMsg
  /* 4077 */ val AMGetClanMembersResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanMembersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanMembershipList
    extends StObject
       with EMsg
  /* 4088 */ val AMGetClanMembershipList: typingsJapgolly.steamClient.mod.EMsg.AMGetClanMembershipList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse
    extends StObject
       with EMsg
  /* 4089 */ val AMGetClanMembershipListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanMembershipListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanOfficers
    extends StObject
       with EMsg
  /* 4298 */ val AMGetClanOfficers: typingsJapgolly.steamClient.mod.EMsg.AMGetClanOfficers & Double = js.native
  
  @js.native
  sealed trait AMGetClanOfficersResponse
    extends StObject
       with EMsg
  /* 4299 */ val AMGetClanOfficersResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanOfficersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTW
    extends StObject
       with EMsg
  /* 4054 */ val AMGetClanPOTW: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPOTW & Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTWResponse
    extends StObject
       with EMsg
  /* 4055 */ val AMGetClanPOTWResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPOTWResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBits
    extends StObject
       with EMsg
  /* 4041 */ val AMGetClanPermissionBits: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPermissionBits & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse
    extends StObject
       with EMsg
  /* 4042 */ val AMGetClanPermissionBitsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPermissionBitsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettings
    extends StObject
       with EMsg
  /* 4023 */ val AMGetClanPermissionSettings: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPermissionSettings & Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse
    extends StObject
       with EMsg
  /* 4024 */ val AMGetClanPermissionSettingsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanPermissionSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetClanRank
    extends StObject
       with EMsg
  /* 4050 */ val AMGetClanRank: typingsJapgolly.steamClient.mod.EMsg.AMGetClanRank & Double = js.native
  
  @js.native
  sealed trait AMGetClanRankResponse
    extends StObject
       with EMsg
  /* 4051 */ val AMGetClanRankResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetClanRankResponse & Double = js.native
  
  @js.native
  sealed trait AMGetComments
    extends StObject
       with EMsg
  /* 4200 */ val AMGetComments: typingsJapgolly.steamClient.mod.EMsg.AMGetComments & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCommentsResponse
    extends StObject
       with EMsg
  /* 4201 */ val AMGetCommentsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetCommentsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyState
    extends StObject
       with EMsg
  /* 4116 */ val AMGetCommunityPrivacyState: typingsJapgolly.steamClient.mod.EMsg.AMGetCommunityPrivacyState & Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse
    extends StObject
       with EMsg
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetCommunityPrivacyStateResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFinalPrice
    extends StObject
       with EMsg
  /* 514 */ val AMGetFinalPrice: typingsJapgolly.steamClient.mod.EMsg.AMGetFinalPrice & Double = js.native
  
  @js.native
  sealed trait AMGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 515 */ val AMGetFinalPriceResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationship
    extends StObject
       with EMsg
  /* 4124 */ val AMGetFriendRelationship: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendRelationship & Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse
    extends StObject
       with EMsg
  /* 4125 */ val AMGetFriendRelationshipResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendRelationshipResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbies
    extends StObject
       with EMsg
  /* 4165 */ val AMGetFriendsLobbies: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendsLobbies & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse
    extends StObject
       with EMsg
  /* 4166 */ val AMGetFriendsLobbiesResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendsLobbiesResponse & Double = js.native
  
  @js.native
  sealed trait AMGetFriendsWishlistInfo
    extends StObject
       with EMsg
  /* 4296 */ val AMGetFriendsWishlistInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendsWishlistInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse
    extends StObject
       with EMsg
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetFriendsWishlistInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerList
    extends StObject
       with EMsg
  /* 4271 */ val AMGetGSPlayerList: typingsJapgolly.steamClient.mod.EMsg.AMGetGSPlayerList & Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerListResponse
    extends StObject
       with EMsg
  /* 4272 */ val AMGetGSPlayerListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetGSPlayerListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetGameMembers
    extends StObject
       with EMsg
  /* 4276 */ val AMGetGameMembers: typingsJapgolly.steamClient.mod.EMsg.AMGetGameMembers & Double = js.native
  
  @js.native
  sealed trait AMGetGameMembersResponse
    extends StObject
       with EMsg
  /* 4277 */ val AMGetGameMembersResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetGameMembersResponse & Double = js.native
  
  @js.native
  sealed trait AMGetGiftTargetListRelay
    extends StObject
       with EMsg
  /* 4094 */ val AMGetGiftTargetListRelay: typingsJapgolly.steamClient.mod.EMsg.AMGetGiftTargetListRelay & Double = js.native
  
  @js.native
  sealed trait AMGetIgnored
    extends StObject
       with EMsg
  /* 4120 */ val AMGetIgnored: typingsJapgolly.steamClient.mod.EMsg.AMGetIgnored & Double = js.native
  
  @js.native
  sealed trait AMGetIgnoredResponse
    extends StObject
       with EMsg
  /* 4121 */ val AMGetIgnoredResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetIgnoredResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKey
    extends StObject
       with EMsg
  /* 516 */ val AMGetLegacyGameKey: typingsJapgolly.steamClient.mod.EMsg.AMGetLegacyGameKey & Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse
    extends StObject
       with EMsg
  /* 517 */ val AMGetLegacyGameKeyResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetLegacyGameKeyResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLicenses
    extends StObject
       with EMsg
  /* 539 */ val AMGetLicenses: typingsJapgolly.steamClient.mod.EMsg.AMGetLicenses & Double = js.native
  
  @js.native
  sealed trait AMGetLicensesResponse
    extends StObject
       with EMsg
  /* 540 */ val AMGetLicensesResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetLicensesResponse & Double = js.native
  
  @js.native
  sealed trait AMGetLobbyList
    extends StObject
       with EMsg
  /* 4136 */ val AMGetLobbyList: typingsJapgolly.steamClient.mod.EMsg.AMGetLobbyList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse
    extends StObject
       with EMsg
  /* 4137 */ val AMGetLobbyListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetLobbyListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata
    extends StObject
       with EMsg
  /* 4138 */ val AMGetLobbyMetadata: typingsJapgolly.steamClient.mod.EMsg.AMGetLobbyMetadata & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse
    extends StObject
       with EMsg
  /* 4139 */ val AMGetLobbyMetadataResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetLobbyMetadataResponse & Double = js.native
  
  @js.native
  sealed trait AMGetNameHistory
    extends StObject
       with EMsg
  /* 4301 */ val AMGetNameHistory: typingsJapgolly.steamClient.mod.EMsg.AMGetNameHistory & Double = js.native
  
  @js.native
  sealed trait AMGetNameHistoryResponse
    extends StObject
       with EMsg
  /* 4302 */ val AMGetNameHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetNameHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreements
    extends StObject
       with EMsg
  /* 4333 */ val AMGetPaypalAgreements: typingsJapgolly.steamClient.mod.EMsg.AMGetPaypalAgreements & Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse
    extends StObject
       with EMsg
  /* 4334 */ val AMGetPaypalAgreementsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetPaypalAgreementsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCount
    extends StObject
       with EMsg
  /* 4375 */ val AMGetPendingNotificationCount: typingsJapgolly.steamClient.mod.EMsg.AMGetPendingNotificationCount & Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse
    extends StObject
       with EMsg
  /* 4376 */ val AMGetPendingNotificationCountResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetPendingNotificationCountResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetails
    extends StObject
       with EMsg
  /* 4365 */ val AMGetPlayerBanDetails: typingsJapgolly.steamClient.mod.EMsg.AMGetPlayerBanDetails & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse
    extends StObject
       with EMsg
  /* 4366 */ val AMGetPlayerBanDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetPlayerBanDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetails
    extends StObject
       with EMsg
  /* 4289 */ val AMGetPlayerLinkDetails: typingsJapgolly.steamClient.mod.EMsg.AMGetPlayerLinkDetails & Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse
    extends StObject
       with EMsg
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetPlayerLinkDetailsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetPreviousCBAccount
    extends StObject
       with EMsg
  /* 4184 */ val AMGetPreviousCBAccount: typingsJapgolly.steamClient.mod.EMsg.AMGetPreviousCBAccount & Double = js.native
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse
    extends StObject
       with EMsg
  /* 4185 */ val AMGetPreviousCBAccountResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetPreviousCBAccountResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetPurchaseStatus
    extends StObject
       with EMsg
  /* 4206 */ val AMGetPurchaseStatus: typingsJapgolly.steamClient.mod.EMsg.AMGetPurchaseStatus & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement
    extends StObject
       with EMsg
  /* 4037 */ val AMGetSingleClanAnnouncement: typingsJapgolly.steamClient.mod.EMsg.AMGetSingleClanAnnouncement & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetSingleClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEvent
    extends StObject
       with EMsg
  /* 4048 */ val AMGetSingleClanEvent: typingsJapgolly.steamClient.mod.EMsg.AMGetSingleClanEvent & Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEventResponse
    extends StObject
       with EMsg
  /* 4049 */ val AMGetSingleClanEventResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetSingleClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn
    extends StObject
       with EMsg
  /* 4278 */ val AMGetSteamIDForMicroTxn: typingsJapgolly.steamClient.mod.EMsg.AMGetSteamIDForMicroTxn & Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse
    extends StObject
       with EMsg
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetSteamIDForMicroTxnResponse & Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummary
    extends StObject
       with EMsg
  /* 4247 */ val AMGetStoredPaymentSummary: typingsJapgolly.steamClient.mod.EMsg.AMGetStoredPaymentSummary & Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse
    extends StObject
       with EMsg
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetStoredPaymentSummaryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserAchievementStatus
    extends StObject
       with EMsg
  /* 4119 */ val AMGetUserAchievementStatus: typingsJapgolly.steamClient.mod.EMsg.AMGetUserAchievementStatus & Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNews
    extends StObject
       with EMsg
  /* 4175 */ val AMGetUserClansNews: typingsJapgolly.steamClient.mod.EMsg.AMGetUserClansNews & Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNewsResponse
    extends StObject
       with EMsg
  /* 4174 */ val AMGetUserClansNewsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserClansNewsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo
    extends StObject
       with EMsg
  /* 4269 */ val AMGetUserCurrentGameInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetUserCurrentGameInfo & Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse
    extends StObject
       with EMsg
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserCurrentGameInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse
    extends StObject
       with EMsg
  /* 4172 */ val AMGetUserFriendNewsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserFriendNewsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed
    extends StObject
       with EMsg
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: typingsJapgolly.steamClient.mod.EMsg.AMGetUserFriendsMinutesPlayed & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse
    extends StObject
       with EMsg
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserFriendsMinutesPlayedResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStats
    extends StObject
       with EMsg
  /* 4073 */ val AMGetUserGameStats: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGameStats & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStatsResponse
    extends StObject
       with EMsg
  /* 4074 */ val AMGetUserGameStatsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGameStatsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGameplayInfo
    extends StObject
       with EMsg
  /* 4237 */ val AMGetUserGameplayInfo: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGameplayInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse
    extends StObject
       with EMsg
  /* 4238 */ val AMGetUserGameplayInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGameplayInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGifts
    extends StObject
       with EMsg
  /* 4316 */ val AMGetUserGifts: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGifts & Double = js.native
  
  @js.native
  sealed trait AMGetUserGiftsResponse
    extends StObject
       with EMsg
  /* 4317 */ val AMGetUserGiftsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGiftsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatus
    extends StObject
       with EMsg
  /* 921 */ val AMGetUserGroupStatus: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGroupStatus & Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse
    extends StObject
       with EMsg
  /* 922 */ val AMGetUserGroupStatusResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserGroupStatusResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserHistory
    extends StObject
       with EMsg
  /* 4154 */ val AMGetUserHistory: typingsJapgolly.steamClient.mod.EMsg.AMGetUserHistory & Double = js.native
  
  @js.native
  sealed trait AMGetUserHistoryResponse
    extends StObject
       with EMsg
  /* 4146 */ val AMGetUserHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserHistoryResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserLicenseHistory
    extends StObject
       with EMsg
  /* 4190 */ val AMGetUserLicenseHistory: typingsJapgolly.steamClient.mod.EMsg.AMGetUserLicenseHistory & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse
    extends StObject
       with EMsg
  /* 4191 */ val AMGetUserLicenseHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserLicenseHistoryResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseList
    extends StObject
       with EMsg
  /* 4282 */ val AMGetUserLicenseList: typingsJapgolly.steamClient.mod.EMsg.AMGetUserLicenseList & Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseListResponse
    extends StObject
       with EMsg
  /* 4283 */ val AMGetUserLicenseListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserLicenseListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed
    extends StObject
       with EMsg
  /* 4227 */ val AMGetUserMinutesPlayed: typingsJapgolly.steamClient.mod.EMsg.AMGetUserMinutesPlayed & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse
    extends StObject
       with EMsg
  /* 4228 */ val AMGetUserMinutesPlayedResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserMinutesPlayedResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserNews
    extends StObject
       with EMsg
  /* 4150 */ val AMGetUserNews: typingsJapgolly.steamClient.mod.EMsg.AMGetUserNews & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse
    extends StObject
       with EMsg
  /* 4151 */ val AMGetUserNewsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserNewsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserNewsSubscriptions
    extends StObject
       with EMsg
  /* 4147 */ val AMGetUserNewsSubscriptions: typingsJapgolly.steamClient.mod.EMsg.AMGetUserNewsSubscriptions & Double = js.native
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse
    extends StObject
       with EMsg
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserNewsSubscriptionsResponse & Double = js.native
  
  @js.native
  sealed trait AMGetUserStats
    extends StObject
       with EMsg
  /* 4211 */ val AMGetUserStats: typingsJapgolly.steamClient.mod.EMsg.AMGetUserStats & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserVacBanList
    extends StObject
       with EMsg
  /* 4292 */ val AMGetUserVacBanList: typingsJapgolly.steamClient.mod.EMsg.AMGetUserVacBanList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse
    extends StObject
       with EMsg
  /* 4293 */ val AMGetUserVacBanListResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetUserVacBanListResponse & Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRate
    extends StObject
       with EMsg
  /* 4249 */ val AMGetWalletConversionRate: typingsJapgolly.steamClient.mod.EMsg.AMGetWalletConversionRate & Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse
    extends StObject
       with EMsg
  /* 4250 */ val AMGetWalletConversionRateResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetWalletConversionRateResponse & Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetails
    extends StObject
       with EMsg
  /* 4244 */ val AMGetWalletDetails: typingsJapgolly.steamClient.mod.EMsg.AMGetWalletDetails & Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetailsResponse
    extends StObject
       with EMsg
  /* 4245 */ val AMGetWalletDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMGetWalletDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMGiftRevoked
    extends StObject
       with EMsg
  /* 4108 */ val AMGiftRevoked: typingsJapgolly.steamClient.mod.EMsg.AMGiftRevoked & Double = js.native
  
  @js.native
  sealed trait AMGrantCoupon
    extends StObject
       with EMsg
  /* 4356 */ val AMGrantCoupon: typingsJapgolly.steamClient.mod.EMsg.AMGrantCoupon & Double = js.native
  
  @js.native
  sealed trait AMGrantCouponResponse
    extends StObject
       with EMsg
  /* 4357 */ val AMGrantCouponResponse: typingsJapgolly.steamClient.mod.EMsg.AMGrantCouponResponse & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses
    extends StObject
       with EMsg
  /* 566 */ val AMGrantGuestPasses: typingsJapgolly.steamClient.mod.EMsg.AMGrantGuestPasses & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2
    extends StObject
       with EMsg
  /* 4361 */ val AMGrantGuestPasses2: typingsJapgolly.steamClient.mod.EMsg.AMGrantGuestPasses2 & Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2Response
    extends StObject
       with EMsg
  /* 4362 */ val AMGrantGuestPasses2Response: typingsJapgolly.steamClient.mod.EMsg.AMGrantGuestPasses2Response & Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransaction
    extends StObject
       with EMsg
  /* 4328 */ val AMHandlePendingTransaction: typingsJapgolly.steamClient.mod.EMsg.AMHandlePendingTransaction & Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse
    extends StObject
       with EMsg
  /* 4360 */ val AMHandlePendingTransactionResponse: typingsJapgolly.steamClient.mod.EMsg.AMHandlePendingTransactionResponse & Double = js.native
  
  @js.native
  sealed trait AMInitPurchase
    extends StObject
       with EMsg
  /* 512 */ val AMInitPurchase: typingsJapgolly.steamClient.mod.EMsg.AMInitPurchase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMInitPurchaseResponse
    extends StObject
       with EMsg
  /* 560 */ val AMInitPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMInviteUserToClan
    extends StObject
       with EMsg
  /* 564 */ val AMInviteUserToClan: typingsJapgolly.steamClient.mod.EMsg.AMInviteUserToClan & Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod
    extends StObject
       with EMsg
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: typingsJapgolly.steamClient.mod.EMsg.AMIsAccountInCaptchaGracePeriod & Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse
    extends StObject
       with EMsg
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: typingsJapgolly.steamClient.mod.EMsg.AMIsAccountInCaptchaGracePeriodResponse & Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry
    extends StObject
       with EMsg
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: typingsJapgolly.steamClient.mod.EMsg.AMIsPackageRestrictedInUserCountry & Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse
    extends StObject
       with EMsg
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: typingsJapgolly.steamClient.mod.EMsg.AMIsPackageRestrictedInUserCountryResponse & Double = js.native
  
  @js.native
  sealed trait AMIsUserBanned
    extends StObject
       with EMsg
  /* 527 */ val AMIsUserBanned: typingsJapgolly.steamClient.mod.EMsg.AMIsUserBanned & Double = js.native
  
  @js.native
  sealed trait AMIsValidAccountID
    extends StObject
       with EMsg
  /* 4092 */ val AMIsValidAccountID: typingsJapgolly.steamClient.mod.EMsg.AMIsValidAccountID & Double = js.native
  
  @js.native
  sealed trait AMJoinPublicClan
    extends StObject
       with EMsg
  /* 4078 */ val AMJoinPublicClan: typingsJapgolly.steamClient.mod.EMsg.AMJoinPublicClan & Double = js.native
  
  @js.native
  sealed trait AMKickUserFromClan
    extends StObject
       with EMsg
  /* 4060 */ val AMKickUserFromClan: typingsJapgolly.steamClient.mod.EMsg.AMKickUserFromClan & Double = js.native
  
  @js.native
  sealed trait AMLeaveClan
    extends StObject
       with EMsg
  /* 4010 */ val AMLeaveClan: typingsJapgolly.steamClient.mod.EMsg.AMLeaveClan & Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodes
    extends StObject
       with EMsg
  /* 529 */ val AMLoadActivationCodes: typingsJapgolly.steamClient.mod.EMsg.AMLoadActivationCodes & Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodesResponse
    extends StObject
       with EMsg
  /* 530 */ val AMLoadActivationCodesResponse: typingsJapgolly.steamClient.mod.EMsg.AMLoadActivationCodesResponse & Double = js.native
  
  @js.native
  sealed trait AMLoadOEMTickets
    extends StObject
       with EMsg
  /* 524 */ val AMLoadOEMTickets: typingsJapgolly.steamClient.mod.EMsg.AMLoadOEMTickets & Double = js.native
  
  @js.native
  sealed trait AMLockProfile
    extends StObject
       with EMsg
  /* 562 */ val AMLockProfile: typingsJapgolly.steamClient.mod.EMsg.AMLockProfile & Double = js.native
  
  @js.native
  sealed trait AMLookupKey
    extends StObject
       with EMsg
  /* 532 */ val AMLookupKey: typingsJapgolly.steamClient.mod.EMsg.AMLookupKey & Double = js.native
  
  @js.native
  sealed trait AMLookupKeyResponse
    extends StObject
       with EMsg
  /* 531 */ val AMLookupKeyResponse: typingsJapgolly.steamClient.mod.EMsg.AMLookupKeyResponse & Double = js.native
  
  @js.native
  sealed trait AMMOLPayment
    extends StObject
       with EMsg
  /* 4391 */ val AMMOLPayment: typingsJapgolly.steamClient.mod.EMsg.AMMOLPayment & Double = js.native
  
  @js.native
  sealed trait AMMOLPaymentResponse
    extends StObject
       with EMsg
  /* 4392 */ val AMMOLPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMMOLPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMMarketingTreatmentUpdate
    extends StObject
       with EMsg
  /* 4257 */ val AMMarketingTreatmentUpdate: typingsJapgolly.steamClient.mod.EMsg.AMMarketingTreatmentUpdate & Double = js.native
  
  @js.native
  sealed trait AMMoPayPayment
    extends StObject
       with EMsg
  /* 4378 */ val AMMoPayPayment: typingsJapgolly.steamClient.mod.EMsg.AMMoPayPayment & Double = js.native
  
  @js.native
  sealed trait AMMoPayPaymentResponse
    extends StObject
       with EMsg
  /* 4379 */ val AMMoPayPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMMoPayPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMNameChange
    extends StObject
       with EMsg
  /* 4300 */ val AMNameChange: typingsJapgolly.steamClient.mod.EMsg.AMNameChange & Double = js.native
  
  @js.native
  sealed trait AMNewChallenge
    extends StObject
       with EMsg
  /* 523 */ val AMNewChallenge: typingsJapgolly.steamClient.mod.EMsg.AMNewChallenge & Double = js.native
  
  @js.native
  sealed trait AMNotifyChatOfClanChange
    extends StObject
       with EMsg
  /* 4079 */ val AMNotifyChatOfClanChange: typingsJapgolly.steamClient.mod.EMsg.AMNotifyChatOfClanChange & Double = js.native
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized
    extends StObject
       with EMsg
  /* 6508 */ val AMNotifySessionDeviceAuthorized: typingsJapgolly.steamClient.mod.EMsg.AMNotifySessionDeviceAuthorized & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMP2PIntroducerMessage
    extends StObject
       with EMsg
  /* 596 */ val AMP2PIntroducerMessage: typingsJapgolly.steamClient.mod.EMsg.AMP2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait AMPasswordHashUpgrade
    extends StObject
       with EMsg
  /* 4377 */ val AMPasswordHashUpgrade: typingsJapgolly.steamClient.mod.EMsg.AMPasswordHashUpgrade & Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment
    extends StObject
       with EMsg
  /* 4400 */ val AMPayPalPaymentsHubPayment: typingsJapgolly.steamClient.mod.EMsg.AMPayPalPaymentsHubPayment & Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse
    extends StObject
       with EMsg
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMPayPalPaymentsHubPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMPayelpPayment
    extends StObject
       with EMsg
  /* 4387 */ val AMPayelpPayment: typingsJapgolly.steamClient.mod.EMsg.AMPayelpPayment & Double = js.native
  
  @js.native
  sealed trait AMPayelpPaymentResponse
    extends StObject
       with EMsg
  /* 4388 */ val AMPayelpPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMPayelpPaymentResponse & Double = js.native
  
  @js.native
  sealed trait AMPersonaChangeResponse
    extends StObject
       with EMsg
  /* 4372 */ val AMPersonaChangeResponse: typingsJapgolly.steamClient.mod.EMsg.AMPersonaChangeResponse & Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails
    extends StObject
       with EMsg
  /* 4389 */ val AMPlayerGetClanBasicDetails: typingsJapgolly.steamClient.mod.EMsg.AMPlayerGetClanBasicDetails & Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse
    extends StObject
       with EMsg
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.AMPlayerGetClanBasicDetailsResponse & Double = js.native
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer
    extends StObject
       with EMsg
  /* 4322 */ val AMPlayerHostedOnGameServer: typingsJapgolly.steamClient.mod.EMsg.AMPlayerHostedOnGameServer & Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameList
    extends StObject
       with EMsg
  /* 4266 */ val AMPlayerNicknameList: typingsJapgolly.steamClient.mod.EMsg.AMPlayerNicknameList & Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameListResponse
    extends StObject
       with EMsg
  /* 4267 */ val AMPlayerNicknameListResponse: typingsJapgolly.steamClient.mod.EMsg.AMPlayerNicknameListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache
    extends StObject
       with EMsg
  /* 557 */ val AMPrimePersonaStateCache: typingsJapgolly.steamClient.mod.EMsg.AMPrimePersonaStateCache & Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipList
    extends StObject
       with EMsg
  /* 4162 */ val AMProbeClanMembershipList: typingsJapgolly.steamClient.mod.EMsg.AMProbeClanMembershipList & Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse
    extends StObject
       with EMsg
  /* 4163 */ val AMProbeClanMembershipListResponse: typingsJapgolly.steamClient.mod.EMsg.AMProbeClanMembershipListResponse & Double = js.native
  
  @js.native
  sealed trait AMPublishChatMemberInfo
    extends StObject
       with EMsg
  /* 575 */ val AMPublishChatMemberInfo: typingsJapgolly.steamClient.mod.EMsg.AMPublishChatMemberInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMPublishChatMetadata
    extends StObject
       with EMsg
  /* 4004 */ val AMPublishChatMetadata: typingsJapgolly.steamClient.mod.EMsg.AMPublishChatMetadata & Double = js.native
  
  @js.native
  sealed trait AMPublishChatRoomInfo
    extends StObject
       with EMsg
  /* 4025 */ val AMPublishChatRoomInfo: typingsJapgolly.steamClient.mod.EMsg.AMPublishChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait AMPurchaseResponse
    extends StObject
       with EMsg
  /* 513 */ val AMPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMRecordBanEnforcement
    extends StObject
       with EMsg
  /* 4325 */ val AMRecordBanEnforcement: typingsJapgolly.steamClient.mod.EMsg.AMRecordBanEnforcement & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRefreshGuestPasses
    extends StObject
       with EMsg
  /* 563 */ val AMRefreshGuestPasses: typingsJapgolly.steamClient.mod.EMsg.AMRefreshGuestPasses & Double = js.native
  
  @js.native
  sealed trait AMRefreshSessions
    extends StObject
       with EMsg
  /* 2210 */ val AMRefreshSessions: typingsJapgolly.steamClient.mod.EMsg.AMRefreshSessions & Double = js.native
  
  @js.native
  sealed trait AMRegisterKey
    extends StObject
       with EMsg
  /* 528 */ val AMRegisterKey: typingsJapgolly.steamClient.mod.EMsg.AMRegisterKey & Double = js.native
  
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame
    extends StObject
       with EMsg
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: typingsJapgolly.steamClient.mod.EMsg.AMRelayGetFriendsWhoPlayGame & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse
    extends StObject
       with EMsg
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: typingsJapgolly.steamClient.mod.EMsg.AMRelayGetFriendsWhoPlayGameResponse & Double = js.native
  
  @js.native
  sealed trait AMRelayPublishStatus
    extends StObject
       with EMsg
  /* 555 */ val AMRelayPublishStatus: typingsJapgolly.steamClient.mod.EMsg.AMRelayPublishStatus & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRelayToGC
    extends StObject
       with EMsg
  /* 2201 */ val AMRelayToGC: typingsJapgolly.steamClient.mod.EMsg.AMRelayToGC & Double = js.native
  
  @js.native
  sealed trait AMReloadAccount
    extends StObject
       with EMsg
  /* 568 */ val AMReloadAccount: typingsJapgolly.steamClient.mod.EMsg.AMReloadAccount & Double = js.native
  
  @js.native
  sealed trait AMReloadGameGroupPolicy
    extends StObject
       with EMsg
  /* 4284 */ val AMReloadGameGroupPolicy: typingsJapgolly.steamClient.mod.EMsg.AMReloadGameGroupPolicy & Double = js.native
  
  @js.native
  sealed trait AMRemoveFriend
    extends StObject
       with EMsg
  /* 4083 */ val AMRemoveFriend: typingsJapgolly.steamClient.mod.EMsg.AMRemoveFriend & Double = js.native
  
  @js.native
  sealed trait AMRemovePublisherUser
    extends StObject
       with EMsg
  /* 4281 */ val AMRemovePublisherUser: typingsJapgolly.steamClient.mod.EMsg.AMRemovePublisherUser & Double = js.native
  
  @js.native
  sealed trait AMRenewAgreement
    extends StObject
       with EMsg
  /* 4342 */ val AMRenewAgreement: typingsJapgolly.steamClient.mod.EMsg.AMRenewAgreement & Double = js.native
  
  @js.native
  sealed trait AMRenewLicense
    extends StObject
       with EMsg
  /* 4337 */ val AMRenewLicense: typingsJapgolly.steamClient.mod.EMsg.AMRenewLicense & Double = js.native
  
  @js.native
  sealed trait AMRequestAccountData
    extends StObject
       with EMsg
  /* 582 */ val AMRequestAccountData: typingsJapgolly.steamClient.mod.EMsg.AMRequestAccountData & Double = js.native
  
  @js.native
  sealed trait AMRequestAccountDataResponse
    extends StObject
       with EMsg
  /* 583 */ val AMRequestAccountDataResponse: typingsJapgolly.steamClient.mod.EMsg.AMRequestAccountDataResponse & Double = js.native
  
  @js.native
  sealed trait AMRequestChatMetadata
    extends StObject
       with EMsg
  /* 4058 */ val AMRequestChatMetadata: typingsJapgolly.steamClient.mod.EMsg.AMRequestChatMetadata & Double = js.native
  
  // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestClanData
    extends StObject
       with EMsg
  /* 4008 */ val AMRequestClanData: typingsJapgolly.steamClient.mod.EMsg.AMRequestClanData & Double = js.native
  
  @js.native
  sealed trait AMRequestClanDetails
    extends StObject
       with EMsg
  /* 4329 */ val AMRequestClanDetails: typingsJapgolly.steamClient.mod.EMsg.AMRequestClanDetails & Double = js.native
  
  @js.native
  sealed trait AMRequestFriendData
    extends StObject
       with EMsg
  /* 4008 */ val AMRequestFriendData: typingsJapgolly.steamClient.mod.EMsg.AMRequestFriendData & Double = js.native
  
  @js.native
  sealed trait AMResetCommunityContent
    extends StObject
       with EMsg
  /* 556 */ val AMResetCommunityContent: typingsJapgolly.steamClient.mod.EMsg.AMResetCommunityContent & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMResetUserVerificationGSByIP
    extends StObject
       with EMsg
  /* 4197 */ val AMResetUserVerificationGSByIP: typingsJapgolly.steamClient.mod.EMsg.AMResetUserVerificationGSByIP & Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits
    extends StObject
       with EMsg
  /* 4385 */ val AMResolveNegativeWalletCredits: typingsJapgolly.steamClient.mod.EMsg.AMResolveNegativeWalletCredits & Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse
    extends StObject
       with EMsg
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: typingsJapgolly.steamClient.mod.EMsg.AMResolveNegativeWalletCreditsResponse & Double = js.native
  
  @js.native
  sealed trait AMResubmitPurchase
    extends StObject
       with EMsg
  /* 4080 */ val AMResubmitPurchase: typingsJapgolly.steamClient.mod.EMsg.AMResubmitPurchase & Double = js.native
  
  @js.native
  sealed trait AMReverseChargeback
    extends StObject
       with EMsg
  /* 536 */ val AMReverseChargeback: typingsJapgolly.steamClient.mod.EMsg.AMReverseChargeback & Double = js.native
  
  @js.native
  sealed trait AMReverseChargebackResponse
    extends StObject
       with EMsg
  /* 537 */ val AMReverseChargebackResponse: typingsJapgolly.steamClient.mod.EMsg.AMReverseChargebackResponse & Double = js.native
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys
    extends StObject
       with EMsg
  /* 4242 */ val AMRevokeLegacyGameKeys: typingsJapgolly.steamClient.mod.EMsg.AMRevokeLegacyGameKeys & Double = js.native
  
  @js.native
  sealed trait AMRevokePurchaseResponse
    extends StObject
       with EMsg
  /* 561 */ val AMRevokePurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMRevokePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransfer
    extends StObject
       with EMsg
  /* 4326 */ val AMRollbackGiftTransfer: typingsJapgolly.steamClient.mod.EMsg.AMRollbackGiftTransfer & Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse
    extends StObject
       with EMsg
  /* 4327 */ val AMRollbackGiftTransferResponse: typingsJapgolly.steamClient.mod.EMsg.AMRollbackGiftTransferResponse & Double = js.native
  
  @js.native
  sealed trait AMRouteFriendMsg
    extends StObject
       with EMsg
  /* 4219 */ val AMRouteFriendMsg: typingsJapgolly.steamClient.mod.EMsg.AMRouteFriendMsg & Double = js.native
  
  @js.native
  sealed trait AMRouteToClients
    extends StObject
       with EMsg
  /* 4009 */ val AMRouteToClients: typingsJapgolly.steamClient.mod.EMsg.AMRouteToClients & Double = js.native
  
  @js.native
  sealed trait AMSendAccountInfoUpdate
    extends StObject
       with EMsg
  /* 4412 */ val AMSendAccountInfoUpdate: typingsJapgolly.steamClient.mod.EMsg.AMSendAccountInfoUpdate & Double = js.native
  
  @js.native
  sealed trait AMSendEmail
    extends StObject
       with EMsg
  /* 4343 */ val AMSendEmail: typingsJapgolly.steamClient.mod.EMsg.AMSendEmail & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSendQueuedEmails
    extends StObject
       with EMsg
  /* 4152 */ val AMSendQueuedEmails: typingsJapgolly.steamClient.mod.EMsg.AMSendQueuedEmails & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSendSystemIMToUser
    extends StObject
       with EMsg
  /* 508 */ val AMSendSystemIMToUser: typingsJapgolly.steamClient.mod.EMsg.AMSendSystemIMToUser & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCache
    extends StObject
       with EMsg
  /* 4126 */ val AMServiceModulesCache: typingsJapgolly.steamClient.mod.EMsg.AMServiceModulesCache & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCall
    extends StObject
       with EMsg
  /* 4127 */ val AMServiceModulesCall: typingsJapgolly.steamClient.mod.EMsg.AMServiceModulesCall & Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCallResponse
    extends StObject
       with EMsg
  /* 4128 */ val AMServiceModulesCallResponse: typingsJapgolly.steamClient.mod.EMsg.AMServiceModulesCallResponse & Double = js.native
  
  @js.native
  sealed trait AMSessionInfoRequest
    extends StObject
       with EMsg
  /* 4045 */ val AMSessionInfoRequest: typingsJapgolly.steamClient.mod.EMsg.AMSessionInfoRequest & Double = js.native
  
  @js.native
  sealed trait AMSessionInfoResponse
    extends StObject
       with EMsg
  /* 4046 */ val AMSessionInfoResponse: typingsJapgolly.steamClient.mod.EMsg.AMSessionInfoResponse & Double = js.native
  
  @js.native
  sealed trait AMSessionQuery
    extends StObject
       with EMsg
  /* 4363 */ val AMSessionQuery: typingsJapgolly.steamClient.mod.EMsg.AMSessionQuery & Double = js.native
  
  @js.native
  sealed trait AMSessionQueryResponse
    extends StObject
       with EMsg
  /* 4364 */ val AMSessionQueryResponse: typingsJapgolly.steamClient.mod.EMsg.AMSessionQueryResponse & Double = js.native
  
  @js.native
  sealed trait AMSetAccountDetails
    extends StObject
       with EMsg
  /* 4064 */ val AMSetAccountDetails: typingsJapgolly.steamClient.mod.EMsg.AMSetAccountDetails & Double = js.native
  
  @js.native
  sealed trait AMSetAccountFlags
    extends StObject
       with EMsg
  /* 584 */ val AMSetAccountFlags: typingsJapgolly.steamClient.mod.EMsg.AMSetAccountFlags & Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinks
    extends StObject
       with EMsg
  /* 4071 */ val AMSetAccountLinks: typingsJapgolly.steamClient.mod.EMsg.AMSetAccountLinks & Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinksResponse
    extends StObject
       with EMsg
  /* 4072 */ val AMSetAccountLinksResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetAccountLinksResponse & Double = js.native
  
  @js.native
  sealed trait AMSetAccountTrustedRequest
    extends StObject
       with EMsg
  /* 519 */ val AMSetAccountTrustedRequest: typingsJapgolly.steamClient.mod.EMsg.AMSetAccountTrustedRequest & Double = js.native
  
  @js.native
  sealed trait AMSetAvatar
    extends StObject
       with EMsg
  /* 591 */ val AMSetAvatar: typingsJapgolly.steamClient.mod.EMsg.AMSetAvatar & Double = js.native
  
  @js.native
  sealed trait AMSetClanDetails
    extends StObject
       with EMsg
  /* 4068 */ val AMSetClanDetails: typingsJapgolly.steamClient.mod.EMsg.AMSetClanDetails & Double = js.native
  
  @js.native
  sealed trait AMSetClanName
    extends StObject
       with EMsg
  /* 4354 */ val AMSetClanName: typingsJapgolly.steamClient.mod.EMsg.AMSetClanName & Double = js.native
  
  @js.native
  sealed trait AMSetClanNameResponse
    extends StObject
       with EMsg
  /* 4355 */ val AMSetClanNameResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetClanNameResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTW
    extends StObject
       with EMsg
  /* 4056 */ val AMSetClanPOTW: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPOTW & Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTWResponse
    extends StObject
       with EMsg
  /* 4057 */ val AMSetClanPOTWResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPOTWResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBits
    extends StObject
       with EMsg
  /* 4043 */ val AMSetClanPermissionBits: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPermissionBits & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse
    extends StObject
       with EMsg
  /* 4044 */ val AMSetClanPermissionBitsResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPermissionBitsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettings
    extends StObject
       with EMsg
  /* 4021 */ val AMSetClanPermissionSettings: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPermissionSettings & Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse
    extends StObject
       with EMsg
  /* 4022 */ val AMSetClanPermissionSettingsResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetClanPermissionSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetClanRank
    extends StObject
       with EMsg
  /* 4052 */ val AMSetClanRank: typingsJapgolly.steamClient.mod.EMsg.AMSetClanRank & Double = js.native
  
  @js.native
  sealed trait AMSetClanRankResponse
    extends StObject
       with EMsg
  /* 4053 */ val AMSetClanRankResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetClanRankResponse & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettings
    extends StObject
       with EMsg
  /* 4114 */ val AMSetCommunityProfileSettings: typingsJapgolly.steamClient.mod.EMsg.AMSetCommunityProfileSettings & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse
    extends StObject
       with EMsg
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetCommunityProfileSettingsResponse & Double = js.native
  
  @js.native
  sealed trait AMSetCommunityState
    extends StObject
       with EMsg
  /* 4063 */ val AMSetCommunityState: typingsJapgolly.steamClient.mod.EMsg.AMSetCommunityState & Double = js.native
  
  @js.native
  sealed trait AMSetDRMTestConfig
    extends StObject
       with EMsg
  /* 4268 */ val AMSetDRMTestConfig: typingsJapgolly.steamClient.mod.EMsg.AMSetDRMTestConfig & Double = js.native
  
  @js.native
  sealed trait AMSetFriendRelationshipNone
    extends StObject
       with EMsg
  /* 4123 */ val AMSetFriendRelationshipNone: typingsJapgolly.steamClient.mod.EMsg.AMSetFriendRelationshipNone & Double = js.native
  
  @js.native
  sealed trait AMSetIgnored
    extends StObject
       with EMsg
  /* 4096 */ val AMSetIgnored: typingsJapgolly.steamClient.mod.EMsg.AMSetIgnored & Double = js.native
  
  @js.native
  sealed trait AMSetIgnoredResponse
    extends StObject
       with EMsg
  /* 4122 */ val AMSetIgnoredResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetIgnoredResponse & Double = js.native
  
  @js.native
  sealed trait AMSetLicenseFlags
    extends StObject
       with EMsg
  /* 4153 */ val AMSetLicenseFlags: typingsJapgolly.steamClient.mod.EMsg.AMSetLicenseFlags & Double = js.native
  
  @js.native
  sealed trait AMSetPersonaName
    extends StObject
       with EMsg
  /* 590 */ val AMSetPersonaName: typingsJapgolly.steamClient.mod.EMsg.AMSetPersonaName & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSetPreApproval
    extends StObject
       with EMsg
  /* 4255 */ val AMSetPreApproval: typingsJapgolly.steamClient.mod.EMsg.AMSetPreApproval & Double = js.native
  
  @js.native
  sealed trait AMSetPreApprovalResponse
    extends StObject
       with EMsg
  /* 4256 */ val AMSetPreApprovalResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetPreApprovalResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSetProfileURL
    extends StObject
       with EMsg
  /* 4005 */ val AMSetProfileURL: typingsJapgolly.steamClient.mod.EMsg.AMSetProfileURL & Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnowned
    extends StObject
       with EMsg
  /* 4350 */ val AMSetUserGiftUnowned: typingsJapgolly.steamClient.mod.EMsg.AMSetUserGiftUnowned & Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse
    extends StObject
       with EMsg
  /* 4351 */ val AMSetUserGiftUnownedResponse: typingsJapgolly.steamClient.mod.EMsg.AMSetUserGiftUnownedResponse & Double = js.native
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions
    extends StObject
       with EMsg
  /* 4149 */ val AMSetUserNewsSubscriptions: typingsJapgolly.steamClient.mod.EMsg.AMSetUserNewsSubscriptions & Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPayment
    extends StObject
       with EMsg
  /* 4404 */ val AMSmart2PayPayment: typingsJapgolly.steamClient.mod.EMsg.AMSmart2PayPayment & Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse
    extends StObject
       with EMsg
  /* 4405 */ val AMSmart2PayPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMSmart2PayPaymentResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase
    extends StObject
       with EMsg
  /* 4181 */ val AMStoreCancelPurchase: typingsJapgolly.steamClient.mod.EMsg.AMStoreCancelPurchase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase
    extends StObject
       with EMsg
  /* 4180 */ val AMStoreCompletePurchase: typingsJapgolly.steamClient.mod.EMsg.AMStoreCompletePurchase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice
    extends StObject
       with EMsg
  /* 4178 */ val AMStoreGetFinalPrice: typingsJapgolly.steamClient.mod.EMsg.AMStoreGetFinalPrice & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 4179 */ val AMStoreGetFinalPriceResponse: typingsJapgolly.steamClient.mod.EMsg.AMStoreGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait AMStoreInitPurchase
    extends StObject
       with EMsg
  /* 4176 */ val AMStoreInitPurchase: typingsJapgolly.steamClient.mod.EMsg.AMStoreInitPurchase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse
    extends StObject
       with EMsg
  /* 4177 */ val AMStoreInitPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMStoreInitPurchaseResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse
    extends StObject
       with EMsg
  /* 4182 */ val AMStorePurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.AMStorePurchaseResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreUserStats
    extends StObject
       with EMsg
  /* 4236 */ val AMStoreUserStats: typingsJapgolly.steamClient.mod.EMsg.AMStoreUserStats & Double = js.native
  
  @js.native
  sealed trait AMStoreUserStatsResponse
    extends StObject
       with EMsg
  /* 4312 */ val AMStoreUserStatsResponse: typingsJapgolly.steamClient.mod.EMsg.AMStoreUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait AMSubscribeToPersonaFeed
    extends StObject
       with EMsg
  /* 4291 */ val AMSubscribeToPersonaFeed: typingsJapgolly.steamClient.mod.EMsg.AMSubscribeToPersonaFeed & Double = js.native
  
  @js.native
  sealed trait AMSupportChangeEmail
    extends StObject
       with EMsg
  /* 4195 */ val AMSupportChangeEmail: typingsJapgolly.steamClient.mod.EMsg.AMSupportChangeEmail & Double = js.native
  
  @js.native
  sealed trait AMSupportChangePassword
    extends StObject
       with EMsg
  /* 4194 */ val AMSupportChangePassword: typingsJapgolly.steamClient.mod.EMsg.AMSupportChangePassword & Double = js.native
  
  @js.native
  sealed trait AMSupportChangeSecretQA
    extends StObject
       with EMsg
  /* 4196 */ val AMSupportChangeSecretQA: typingsJapgolly.steamClient.mod.EMsg.AMSupportChangeSecretQA & Double = js.native
  
  @js.native
  sealed trait AMSupportEnableOrDisable
    extends StObject
       with EMsg
  /* 4199 */ val AMSupportEnableOrDisable: typingsJapgolly.steamClient.mod.EMsg.AMSupportEnableOrDisable & Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabled
    extends StObject
       with EMsg
  /* 4209 */ val AMSupportIsAccountEnabled: typingsJapgolly.steamClient.mod.EMsg.AMSupportIsAccountEnabled & Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse
    extends StObject
       with EMsg
  /* 4210 */ val AMSupportIsAccountEnabledResponse: typingsJapgolly.steamClient.mod.EMsg.AMSupportIsAccountEnabledResponse & Double = js.native
  
  @js.native
  sealed trait AMSupportKickSession
    extends StObject
       with EMsg
  /* 4212 */ val AMSupportKickSession: typingsJapgolly.steamClient.mod.EMsg.AMSupportKickSession & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSupportRemoveAccountSecurity
    extends StObject
       with EMsg
  /* 4307 */ val AMSupportRemoveAccountSecurity: typingsJapgolly.steamClient.mod.EMsg.AMSupportRemoveAccountSecurity & Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDeposit
    extends StObject
       with EMsg
  /* 4348 */ val AMSwapKioskDeposit: typingsJapgolly.steamClient.mod.EMsg.AMSwapKioskDeposit & Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDepositResponse
    extends StObject
       with EMsg
  /* 4349 */ val AMSwapKioskDepositResponse: typingsJapgolly.steamClient.mod.EMsg.AMSwapKioskDepositResponse & Double = js.native
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse
    extends StObject
       with EMsg
  /* 4220 */ val AMTicketAuthRequestOrResponse: typingsJapgolly.steamClient.mod.EMsg.AMTicketAuthRequestOrResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey
    extends StObject
       with EMsg
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: typingsJapgolly.steamClient.mod.EMsg.AMToMDSGetDepotDecryptionKey & Double = js.native
  
  @js.native
  sealed trait AMTrackFailedAuthByIP
    extends StObject
       with EMsg
  /* 4133 */ val AMTrackFailedAuthByIP: typingsJapgolly.steamClient.mod.EMsg.AMTrackFailedAuthByIP & Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGifts
    extends StObject
       with EMsg
  /* 4320 */ val AMTransferLockedGifts: typingsJapgolly.steamClient.mod.EMsg.AMTransferLockedGifts & Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse
    extends StObject
       with EMsg
  /* 4321 */ val AMTransferLockedGiftsResponse: typingsJapgolly.steamClient.mod.EMsg.AMTransferLockedGiftsResponse & Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest
    extends StObject
       with EMsg
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: typingsJapgolly.steamClient.mod.EMsg.AMTwoFactorRecoverAuthenticatorRequest & Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse
    extends StObject
       with EMsg
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: typingsJapgolly.steamClient.mod.EMsg.AMTwoFactorRecoverAuthenticatorResponse & Double = js.native
  
  @js.native
  sealed trait AMUnBanFromChat
    extends StObject
       with EMsg
  /* 4067 */ val AMUnBanFromChat: typingsJapgolly.steamClient.mod.EMsg.AMUnBanFromChat & Double = js.native
  
  @js.native
  sealed trait AMUpdateBillingAddress
    extends StObject
       with EMsg
  /* 4186 */ val AMUpdateBillingAddress: typingsJapgolly.steamClient.mod.EMsg.AMUpdateBillingAddress & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse
    extends StObject
       with EMsg
  /* 4187 */ val AMUpdateBillingAddressResponse: typingsJapgolly.steamClient.mod.EMsg.AMUpdateBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateChatMetadata
    extends StObject
       with EMsg
  /* 4003 */ val AMUpdateChatMetadata: typingsJapgolly.steamClient.mod.EMsg.AMUpdateChatMetadata & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement
    extends StObject
       with EMsg
  /* 4029 */ val AMUpdateClanAnnouncement: typingsJapgolly.steamClient.mod.EMsg.AMUpdateClanAnnouncement & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse
    extends StObject
       with EMsg
  /* 4030 */ val AMUpdateClanAnnouncementResponse: typingsJapgolly.steamClient.mod.EMsg.AMUpdateClanAnnouncementResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEvent
    extends StObject
       with EMsg
  /* 4015 */ val AMUpdateClanEvent: typingsJapgolly.steamClient.mod.EMsg.AMUpdateClanEvent & Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEventResponse
    extends StObject
       with EMsg
  /* 4016 */ val AMUpdateClanEventResponse: typingsJapgolly.steamClient.mod.EMsg.AMUpdateClanEventResponse & Double = js.native
  
  @js.native
  sealed trait AMUpdateGSPlayStats
    extends StObject
       with EMsg
  /* 4198 */ val AMUpdateGSPlayStats: typingsJapgolly.steamClient.mod.EMsg.AMUpdateGSPlayStats & Double = js.native
  
  @js.native
  sealed trait AMUpdatePersonaStateCache
    extends StObject
       with EMsg
  /* 4275 */ val AMUpdatePersonaStateCache: typingsJapgolly.steamClient.mod.EMsg.AMUpdatePersonaStateCache & Double = js.native
  
  @js.native
  sealed trait AMUpdateProviderStatus
    extends StObject
       with EMsg
  /* 4305 */ val AMUpdateProviderStatus: typingsJapgolly.steamClient.mod.EMsg.AMUpdateProviderStatus & Double = js.native
  
  @js.native
  sealed trait AMUpdateUserBanRequest
    extends StObject
       with EMsg
  /* 504 */ val AMUpdateUserBanRequest: typingsJapgolly.steamClient.mod.EMsg.AMUpdateUserBanRequest & Double = js.native
  
  @js.native
  sealed trait AMUserClanList
    extends StObject
       with EMsg
  /* 4110 */ val AMUserClanList: typingsJapgolly.steamClient.mod.EMsg.AMUserClanList & Double = js.native
  
  @js.native
  sealed trait AMUserClanListResponse
    extends StObject
       with EMsg
  /* 4111 */ val AMUserClanListResponse: typingsJapgolly.steamClient.mod.EMsg.AMUserClanListResponse & Double = js.native
  
  @js.native
  sealed trait AMVACStatusUpdate
    extends StObject
       with EMsg
  /* 4286 */ val AMVACStatusUpdate: typingsJapgolly.steamClient.mod.EMsg.AMVACStatusUpdate & Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP
    extends StObject
       with EMsg
  /* 4131 */ val AMValidateCaptchaDataForIP: typingsJapgolly.steamClient.mod.EMsg.AMValidateCaptchaDataForIP & Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse
    extends StObject
       with EMsg
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: typingsJapgolly.steamClient.mod.EMsg.AMValidateCaptchaDataForIPResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMValidateEmailLink
    extends StObject
       with EMsg
  /* 4231 */ val AMValidateEmailLink: typingsJapgolly.steamClient.mod.EMsg.AMValidateEmailLink & Double = js.native
  
  @js.native
  sealed trait AMValidateEmailLinkResponse
    extends StObject
       with EMsg
  /* 4232 */ val AMValidateEmailLinkResponse: typingsJapgolly.steamClient.mod.EMsg.AMValidateEmailLinkResponse & Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest
    extends StObject
       with EMsg
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: typingsJapgolly.steamClient.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsRequest & Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse
    extends StObject
       with EMsg
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: typingsJapgolly.steamClient.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsResponse & Double = js.native
  
  @js.native
  sealed trait AMValidateWGToken
    extends StObject
       with EMsg
  /* 4047 */ val AMValidateWGToken: typingsJapgolly.steamClient.mod.EMsg.AMValidateWGToken & Double = js.native
  
  @js.native
  sealed trait AMValidateWGTokenResponse
    extends StObject
       with EMsg
  /* 4062 */ val AMValidateWGTokenResponse: typingsJapgolly.steamClient.mod.EMsg.AMValidateWGTokenResponse & Double = js.native
  
  @js.native
  sealed trait AMVerfiyUser
    extends StObject
       with EMsg
  /* 552 */ val AMVerfiyUser: typingsJapgolly.steamClient.mod.EMsg.AMVerfiyUser & Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRights
    extends StObject
       with EMsg
  /* 4222 */ val AMVerifyDepotManagementRights: typingsJapgolly.steamClient.mod.EMsg.AMVerifyDepotManagementRights & Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse
    extends StObject
       with EMsg
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: typingsJapgolly.steamClient.mod.EMsg.AMVerifyDepotManagementRightsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMWipeFriendsList
    extends StObject
       with EMsg
  /* 4095 */ val AMWipeFriendsList: typingsJapgolly.steamClient.mod.EMsg.AMWipeFriendsList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMWriteNews
    extends StObject
       with EMsg
  /* 4142 */ val AMWriteNews: typingsJapgolly.steamClient.mod.EMsg.AMWriteNews & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMXsollaPayment
    extends StObject
       with EMsg
  /* 4344 */ val AMXsollaPayment: typingsJapgolly.steamClient.mod.EMsg.AMXsollaPayment & Double = js.native
  
  @js.native
  sealed trait AMXsollaPaymentResponse
    extends StObject
       with EMsg
  /* 4345 */ val AMXsollaPaymentResponse: typingsJapgolly.steamClient.mod.EMsg.AMXsollaPaymentResponse & Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestResponse
    extends StObject
       with EMsg
  /* 1519 */ val ATSCSPerfTestResponse: typingsJapgolly.steamClient.mod.EMsg.ATSCSPerfTestResponse & Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestTask
    extends StObject
       with EMsg
  /* 1518 */ val ATSCSPerfTestTask: typingsJapgolly.steamClient.mod.EMsg.ATSCSPerfTestTask & Double = js.native
  
  @js.native
  sealed trait ATSCallTest
    extends StObject
       with EMsg
  /* 1508 */ val ATSCallTest: typingsJapgolly.steamClient.mod.EMsg.ATSCallTest & Double = js.native
  
  @js.native
  sealed trait ATSCallTestReply
    extends StObject
       with EMsg
  /* 1509 */ val ATSCallTestReply: typingsJapgolly.steamClient.mod.EMsg.ATSCallTestReply & Double = js.native
  
  @js.native
  sealed trait ATSCycleTCM
    extends StObject
       with EMsg
  /* 1506 */ val ATSCycleTCM: typingsJapgolly.steamClient.mod.EMsg.ATSCycleTCM & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressActionResult
    extends StObject
       with EMsg
  /* 1516 */ val ATSExternalStressActionResult: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressActionResult & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobQueued
    extends StObject
       with EMsg
  /* 1512 */ val ATSExternalStressJobQueued: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressJobQueued & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobRunning
    extends StObject
       with EMsg
  /* 1513 */ val ATSExternalStressJobRunning: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressJobRunning & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStart
    extends StObject
       with EMsg
  /* 1511 */ val ATSExternalStressJobStart: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressJobStart & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopAll
    extends StObject
       with EMsg
  /* 1515 */ val ATSExternalStressJobStopAll: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressJobStopAll & Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopped
    extends StObject
       with EMsg
  /* 1514 */ val ATSExternalStressJobStopped: typingsJapgolly.steamClient.mod.EMsg.ATSExternalStressJobStopped & Double = js.native
  
  @js.native
  sealed trait ATSInitDRMSStressTest
    extends StObject
       with EMsg
  /* 1507 */ val ATSInitDRMSStressTest: typingsJapgolly.steamClient.mod.EMsg.ATSInitDRMSStressTest & Double = js.native
  
  @js.native
  sealed trait ATSRunFailServerTest
    extends StObject
       with EMsg
  /* 1503 */ val ATSRunFailServerTest: typingsJapgolly.steamClient.mod.EMsg.ATSRunFailServerTest & Double = js.native
  
  @js.native
  sealed trait ATSStartExternalStress
    extends StObject
       with EMsg
  /* 1510 */ val ATSStartExternalStress: typingsJapgolly.steamClient.mod.EMsg.ATSStartExternalStress & Double = js.native
  
  @js.native
  sealed trait ATSStartStressTest
    extends StObject
       with EMsg
  /* 1501 */ val ATSStartStressTest: typingsJapgolly.steamClient.mod.EMsg.ATSStartStressTest & Double = js.native
  
  @js.native
  sealed trait ATSStarted
    extends StObject
       with EMsg
  /* 1517 */ val ATSStarted: typingsJapgolly.steamClient.mod.EMsg.ATSStarted & Double = js.native
  
  @js.native
  sealed trait ATSStopStressTest
    extends StObject
       with EMsg
  /* 1502 */ val ATSStopStressTest: typingsJapgolly.steamClient.mod.EMsg.ATSStopStressTest & Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestResponse
    extends StObject
       with EMsg
  /* 1505 */ val ATSUFSPerfTestResponse: typingsJapgolly.steamClient.mod.EMsg.ATSUFSPerfTestResponse & Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestTask
    extends StObject
       with EMsg
  /* 1504 */ val ATSUFSPerfTestTask: typingsJapgolly.steamClient.mod.EMsg.ATSUFSPerfTestTask & Double = js.native
  
  @js.native
  sealed trait AdminCmd
    extends StObject
       with EMsg
  /* 1000 */ val AdminCmd: typingsJapgolly.steamClient.mod.EMsg.AdminCmd & Double = js.native
  
  @js.native
  sealed trait AdminCmdResponse
    extends StObject
       with EMsg
  /* 1004 */ val AdminCmdResponse: typingsJapgolly.steamClient.mod.EMsg.AdminCmdResponse & Double = js.native
  
  @js.native
  sealed trait AdminConsoleTitle
    extends StObject
       with EMsg
  /* 1020 */ val AdminConsoleTitle: typingsJapgolly.steamClient.mod.EMsg.AdminConsoleTitle & Double = js.native
  
  @js.native
  sealed trait AdminGCCommand
    extends StObject
       with EMsg
  /* 1024 */ val AdminGCCommand: typingsJapgolly.steamClient.mod.EMsg.AdminGCCommand & Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandList
    extends StObject
       with EMsg
  /* 1025 */ val AdminGCGetCommandList: typingsJapgolly.steamClient.mod.EMsg.AdminGCGetCommandList & Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandListResponse
    extends StObject
       with EMsg
  /* 1026 */ val AdminGCGetCommandListResponse: typingsJapgolly.steamClient.mod.EMsg.AdminGCGetCommandListResponse & Double = js.native
  
  @js.native
  sealed trait AdminGCSpew
    extends StObject
       with EMsg
  /* 1023 */ val AdminGCSpew: typingsJapgolly.steamClient.mod.EMsg.AdminGCSpew & Double = js.native
  
  @js.native
  sealed trait AdminLogEvent
    extends StObject
       with EMsg
  /* 1006 */ val AdminLogEvent: typingsJapgolly.steamClient.mod.EMsg.AdminLogEvent & Double = js.native
  
  @js.native
  sealed trait AdminLogListenRequest
    extends StObject
       with EMsg
  /* 1005 */ val AdminLogListenRequest: typingsJapgolly.steamClient.mod.EMsg.AdminLogListenRequest & Double = js.native
  
  @js.native
  sealed trait AdminMsgSpew
    extends StObject
       with EMsg
  /* 1028 */ val AdminMsgSpew: typingsJapgolly.steamClient.mod.EMsg.AdminMsgSpew & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminPwLogon
    extends StObject
       with EMsg
  /* 1017 */ val AdminPwLogon: typingsJapgolly.steamClient.mod.EMsg.AdminPwLogon & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminPwLogonResponse
    extends StObject
       with EMsg
  /* 1018 */ val AdminPwLogonResponse: typingsJapgolly.steamClient.mod.EMsg.AdminPwLogonResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminSpew
    extends StObject
       with EMsg
  /* 1019 */ val AdminSpew: typingsJapgolly.steamClient.mod.EMsg.AdminSpew & Double = js.native
  
  @js.native
  sealed trait Alert
    extends StObject
       with EMsg
  /* 115 */ val Alert: typingsJapgolly.steamClient.mod.EMsg.Alert & Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayQuery
    extends StObject
       with EMsg
  /* 550 */ val AllowUserToPlayQuery: typingsJapgolly.steamClient.mod.EMsg.AllowUserToPlayQuery & Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayResponse
    extends StObject
       with EMsg
  /* 551 */ val AllowUserToPlayResponse: typingsJapgolly.steamClient.mod.EMsg.AllowUserToPlayResponse & Double = js.native
  
  @js.native
  sealed trait AssignSysID
    extends StObject
       with EMsg
  /* 200 */ val AssignSysID: typingsJapgolly.steamClient.mod.EMsg.AssignSysID & Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodes
    extends StObject
       with EMsg
  /* 3619 */ val BRPCheckActivationCodes: typingsJapgolly.steamClient.mod.EMsg.BRPCheckActivationCodes & Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse
    extends StObject
       with EMsg
  /* 3620 */ val BRPCheckActivationCodesResponse: typingsJapgolly.steamClient.mod.EMsg.BRPCheckActivationCodesResponse & Double = js.native
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate
    extends StObject
       with EMsg
  /* 3610 */ val BRPCheckFinanceCloseOutDate: typingsJapgolly.steamClient.mod.EMsg.BRPCheckFinanceCloseOutDate & Double = js.native
  
  @js.native
  sealed trait BRPCheckSettlementReports
    extends StObject
       with EMsg
  /* 3626 */ val BRPCheckSettlementReports: typingsJapgolly.steamClient.mod.EMsg.BRPCheckSettlementReports & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BRPCommitGC
    extends StObject
       with EMsg
  /* 3607 */ val BRPCommitGC: typingsJapgolly.steamClient.mod.EMsg.BRPCommitGC & Double = js.native
  
  @js.native
  sealed trait BRPCommitGCResponse
    extends StObject
       with EMsg
  /* 3608 */ val BRPCommitGCResponse: typingsJapgolly.steamClient.mod.EMsg.BRPCommitGCResponse & Double = js.native
  
  @js.native
  sealed trait BRPCommitWP
    extends StObject
       with EMsg
  /* 3621 */ val BRPCommitWP: typingsJapgolly.steamClient.mod.EMsg.BRPCommitWP & Double = js.native
  
  @js.native
  sealed trait BRPCommitWPResponse
    extends StObject
       with EMsg
  /* 3622 */ val BRPCommitWPResponse: typingsJapgolly.steamClient.mod.EMsg.BRPCommitWPResponse & Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeys
    extends StObject
       with EMsg
  /* 3615 */ val BRPConvertToCurrentKeys: typingsJapgolly.steamClient.mod.EMsg.BRPConvertToCurrentKeys & Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse
    extends StObject
       with EMsg
  /* 3616 */ val BRPConvertToCurrentKeysResponse: typingsJapgolly.steamClient.mod.EMsg.BRPConvertToCurrentKeysResponse & Double = js.native
  
  @js.native
  sealed trait BRPFindHungTransactions
    extends StObject
       with EMsg
  /* 3609 */ val BRPFindHungTransactions: typingsJapgolly.steamClient.mod.EMsg.BRPFindHungTransactions & Double = js.native
  
  @js.native
  sealed trait BRPPostTaxToAvalara
    extends StObject
       with EMsg
  /* 3628 */ val BRPPostTaxToAvalara: typingsJapgolly.steamClient.mod.EMsg.BRPPostTaxToAvalara & Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTax
    extends StObject
       with EMsg
  /* 3629 */ val BRPPostTransactionTax: typingsJapgolly.steamClient.mod.EMsg.BRPPostTransactionTax & Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse
    extends StObject
       with EMsg
  /* 3630 */ val BRPPostTransactionTaxResponse: typingsJapgolly.steamClient.mod.EMsg.BRPPostTransactionTaxResponse & Double = js.native
  
  @js.native
  sealed trait BRPProcessGCReports
    extends StObject
       with EMsg
  /* 3603 */ val BRPProcessGCReports: typingsJapgolly.steamClient.mod.EMsg.BRPProcessGCReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessIMReports
    extends StObject
       with EMsg
  /* 3631 */ val BRPProcessIMReports: typingsJapgolly.steamClient.mod.EMsg.BRPProcessIMReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessLicenses
    extends StObject
       with EMsg
  /* 3611 */ val BRPProcessLicenses: typingsJapgolly.steamClient.mod.EMsg.BRPProcessLicenses & Double = js.native
  
  @js.native
  sealed trait BRPProcessLicensesResponse
    extends StObject
       with EMsg
  /* 3612 */ val BRPProcessLicensesResponse: typingsJapgolly.steamClient.mod.EMsg.BRPProcessLicensesResponse & Double = js.native
  
  @js.native
  sealed trait BRPProcessPPReports
    extends StObject
       with EMsg
  /* 3604 */ val BRPProcessPPReports: typingsJapgolly.steamClient.mod.EMsg.BRPProcessPPReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessPartnerPayments
    extends StObject
       with EMsg
  /* 3625 */ val BRPProcessPartnerPayments: typingsJapgolly.steamClient.mod.EMsg.BRPProcessPartnerPayments & Double = js.native
  
  @js.native
  sealed trait BRPProcessPaymentRules
    extends StObject
       with EMsg
  /* 3624 */ val BRPProcessPaymentRules: typingsJapgolly.steamClient.mod.EMsg.BRPProcessPaymentRules & Double = js.native
  
  @js.native
  sealed trait BRPProcessUSBankReports
    extends StObject
       with EMsg
  /* 3602 */ val BRPProcessUSBankReports: typingsJapgolly.steamClient.mod.EMsg.BRPProcessUSBankReports & Double = js.native
  
  @js.native
  sealed trait BRPProcessWPReports
    extends StObject
       with EMsg
  /* 3623 */ val BRPProcessWPReports: typingsJapgolly.steamClient.mod.EMsg.BRPProcessWPReports & Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStats
    extends StObject
       with EMsg
  /* 3617 */ val BRPPruneCardUsageStats: typingsJapgolly.steamClient.mod.EMsg.BRPPruneCardUsageStats & Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse
    extends StObject
       with EMsg
  /* 3618 */ val BRPPruneCardUsageStatsResponse: typingsJapgolly.steamClient.mod.EMsg.BRPPruneCardUsageStatsResponse & Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData
    extends StObject
       with EMsg
  /* 3613 */ val BRPRemoveExpiredPaymentData: typingsJapgolly.steamClient.mod.EMsg.BRPRemoveExpiredPaymentData & Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse
    extends StObject
       with EMsg
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: typingsJapgolly.steamClient.mod.EMsg.BRPRemoveExpiredPaymentDataResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BRPSettleCB
    extends StObject
       with EMsg
  /* 3606 */ val BRPSettleCB: typingsJapgolly.steamClient.mod.EMsg.BRPSettleCB & Double = js.native
  
  @js.native
  sealed trait BRPSettleNOVA
    extends StObject
       with EMsg
  /* 3605 */ val BRPSettleNOVA: typingsJapgolly.steamClient.mod.EMsg.BRPSettleNOVA & Double = js.native
  
  @js.native
  sealed trait BRPStartShippingJobs
    extends StObject
       with EMsg
  /* 3601 */ val BRPStartShippingJobs: typingsJapgolly.steamClient.mod.EMsg.BRPStartShippingJobs & Double = js.native
  
  @js.native
  sealed trait BSBannedRequest
    extends StObject
       with EMsg
  /* 1407 */ val BSBannedRequest: typingsJapgolly.steamClient.mod.EMsg.BSBannedRequest & Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery
    extends StObject
       with EMsg
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: typingsJapgolly.steamClient.mod.EMsg.BSBoaCompraConfirmProductDelivery & Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse
    extends StObject
       with EMsg
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: typingsJapgolly.steamClient.mod.EMsg.BSBoaCompraConfirmProductDeliveryResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSChaseRFRRequest
    extends StObject
       with EMsg
  /* 1416 */ val BSChaseRFRRequest: typingsJapgolly.steamClient.mod.EMsg.BSChaseRFRRequest & Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunning
    extends StObject
       with EMsg
  /* 1456 */ val BSCheckJobRunning: typingsJapgolly.steamClient.mod.EMsg.BSCheckJobRunning & Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunningResponse
    extends StObject
       with EMsg
  /* 1457 */ val BSCheckJobRunningResponse: typingsJapgolly.steamClient.mod.EMsg.BSCheckJobRunningResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSCommitGCTxn
    extends StObject
       with EMsg
  /* 1425 */ val BSCommitGCTxn: typingsJapgolly.steamClient.mod.EMsg.BSCommitGCTxn & Double = js.native
  
  @js.native
  sealed trait BSCommitWPTxn
    extends StObject
       with EMsg
  /* 1498 */ val BSCommitWPTxn: typingsJapgolly.steamClient.mod.EMsg.BSCommitWPTxn & Double = js.native
  
  @js.native
  sealed trait BSCompletePurchase
    extends StObject
       with EMsg
  /* 1474 */ val BSCompletePurchase: typingsJapgolly.steamClient.mod.EMsg.BSCompletePurchase & Double = js.native
  
  @js.native
  sealed trait BSCompletePurchaseResponse
    extends StObject
       with EMsg
  /* 1475 */ val BSCompletePurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.BSCompletePurchaseResponse & Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeys
    extends StObject
       with EMsg
  /* 1470 */ val BSConvertToCurrentKeys: typingsJapgolly.steamClient.mod.EMsg.BSConvertToCurrentKeys & Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse
    extends StObject
       with EMsg
  /* 1471 */ val BSConvertToCurrentKeysResponse: typingsJapgolly.steamClient.mod.EMsg.BSConvertToCurrentKeysResponse & Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5
    extends StObject
       with EMsg
  /* 1496 */ val BSGenerateBoaCompraMD5: typingsJapgolly.steamClient.mod.EMsg.BSGenerateBoaCompraMD5 & Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response
    extends StObject
       with EMsg
  /* 1497 */ val BSGenerateBoaCompraMD5Response: typingsJapgolly.steamClient.mod.EMsg.BSGenerateBoaCompraMD5Response & Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5
    extends StObject
       with EMsg
  /* 1492 */ val BSGenerateMoPayMD5: typingsJapgolly.steamClient.mod.EMsg.BSGenerateMoPayMD5 & Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response
    extends StObject
       with EMsg
  /* 1493 */ val BSGenerateMoPayMD5Response: typingsJapgolly.steamClient.mod.EMsg.BSGenerateMoPayMD5Response & Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddress
    extends StObject
       with EMsg
  /* 1462 */ val BSGetBillingAddress: typingsJapgolly.steamClient.mod.EMsg.BSGetBillingAddress & Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddressResponse
    extends StObject
       with EMsg
  /* 1463 */ val BSGetBillingAddressResponse: typingsJapgolly.steamClient.mod.EMsg.BSGetBillingAddressResponse & Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfo
    extends StObject
       with EMsg
  /* 1464 */ val BSGetCreditCardInfo: typingsJapgolly.steamClient.mod.EMsg.BSGetCreditCardInfo & Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse
    extends StObject
       with EMsg
  /* 1465 */ val BSGetCreditCardInfoResponse: typingsJapgolly.steamClient.mod.EMsg.BSGetCreditCardInfoResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSGetEvents
    extends StObject
       with EMsg
  /* 1415 */ val BSGetEvents: typingsJapgolly.steamClient.mod.EMsg.BSGetEvents & Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfo
    extends StObject
       with EMsg
  /* 1410 */ val BSGetPayPalUserInfo: typingsJapgolly.steamClient.mod.EMsg.BSGetPayPalUserInfo & Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse
    extends StObject
       with EMsg
  /* 1411 */ val BSGetPayPalUserInfoResponse: typingsJapgolly.steamClient.mod.EMsg.BSGetPayPalUserInfoResponse & Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatus
    extends StObject
       with EMsg
  /* 1454 */ val BSGetProPackOrderStatus: typingsJapgolly.steamClient.mod.EMsg.BSGetProPackOrderStatus & Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse
    extends StObject
       with EMsg
  /* 1455 */ val BSGetProPackOrderStatusResponse: typingsJapgolly.steamClient.mod.EMsg.BSGetProPackOrderStatusResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSInitGCBankXferTxn
    extends StObject
       with EMsg
  /* 1421 */ val BSInitGCBankXferTxn: typingsJapgolly.steamClient.mod.EMsg.BSInitGCBankXferTxn & Double = js.native
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse
    extends StObject
       with EMsg
  /* 1422 */ val BSInitGCBankXferTxnResponse: typingsJapgolly.steamClient.mod.EMsg.BSInitGCBankXferTxnResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSInitPayPalTxn
    extends StObject
       with EMsg
  /* 1408 */ val BSInitPayPalTxn: typingsJapgolly.steamClient.mod.EMsg.BSInitPayPalTxn & Double = js.native
  
  @js.native
  sealed trait BSInitPayPalTxnResponse
    extends StObject
       with EMsg
  /* 1409 */ val BSInitPayPalTxnResponse: typingsJapgolly.steamClient.mod.EMsg.BSInitPayPalTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSInitPurchase
    extends StObject
       with EMsg
  /* 1472 */ val BSInitPurchase: typingsJapgolly.steamClient.mod.EMsg.BSInitPurchase & Double = js.native
  
  @js.native
  sealed trait BSInitPurchaseResponse
    extends StObject
       with EMsg
  /* 1473 */ val BSInitPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.BSInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery
    extends StObject
       with EMsg
  /* 1490 */ val BSMoPayConfirmProductDelivery: typingsJapgolly.steamClient.mod.EMsg.BSMoPayConfirmProductDelivery & Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse
    extends StObject
       with EMsg
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: typingsJapgolly.steamClient.mod.EMsg.BSMoPayConfirmProductDeliveryResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSPaymentInstrBan
    extends StObject
       with EMsg
  /* 1417 */ val BSPaymentInstrBan: typingsJapgolly.steamClient.mod.EMsg.BSPaymentInstrBan & Double = js.native
  
  @js.native
  sealed trait BSPaymentInstrBanResponse
    extends StObject
       with EMsg
  /* 1418 */ val BSPaymentInstrBanResponse: typingsJapgolly.steamClient.mod.EMsg.BSPaymentInstrBanResponse & Double = js.native
  
  @js.native
  sealed trait BSProcessGCReports
    extends StObject
       with EMsg
  /* 1419 */ val BSProcessGCReports: typingsJapgolly.steamClient.mod.EMsg.BSProcessGCReports & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSProcessPPReports
    extends StObject
       with EMsg
  /* 1420 */ val BSProcessPPReports: typingsJapgolly.steamClient.mod.EMsg.BSProcessPPReports & Double = js.native
  
  @js.native
  sealed trait BSProcessUSBankReports
    extends StObject
       with EMsg
  /* 1436 */ val BSProcessUSBankReports: typingsJapgolly.steamClient.mod.EMsg.BSProcessUSBankReports & Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStats
    extends StObject
       with EMsg
  /* 1476 */ val BSPruneCardUsageStats: typingsJapgolly.steamClient.mod.EMsg.BSPruneCardUsageStats & Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse
    extends StObject
       with EMsg
  /* 1477 */ val BSPruneCardUsageStatsResponse: typingsJapgolly.steamClient.mod.EMsg.BSPruneCardUsageStatsResponse & Double = js.native
  
  @js.native
  sealed trait BSPurchaseResponse
    extends StObject
       with EMsg
  /* 1402 */ val BSPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.BSPurchaseResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSPurchaseRunFraudChecks
    extends StObject
       with EMsg
  /* 1437 */ val BSPurchaseRunFraudChecks: typingsJapgolly.steamClient.mod.EMsg.BSPurchaseRunFraudChecks & Double = js.native
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse
    extends StObject
       with EMsg
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: typingsJapgolly.steamClient.mod.EMsg.BSPurchaseRunFraudChecksResponse & Double = js.native
  
  @js.native
  sealed trait BSPurchaseStart
    extends StObject
       with EMsg
  /* 1401 */ val BSPurchaseStart: typingsJapgolly.steamClient.mod.EMsg.BSPurchaseStart & Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoice
    extends StObject
       with EMsg
  /* 1448 */ val BSQiwiWalletInvoice: typingsJapgolly.steamClient.mod.EMsg.BSQiwiWalletInvoice & Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse
    extends StObject
       with EMsg
  /* 1449 */ val BSQiwiWalletInvoiceResponse: typingsJapgolly.steamClient.mod.EMsg.BSQiwiWalletInvoiceResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryBankInformation
    extends StObject
       with EMsg
  /* 1440 */ val BSQueryBankInformation: typingsJapgolly.steamClient.mod.EMsg.BSQueryBankInformation & Double = js.native
  
  @js.native
  sealed trait BSQueryBankInformationResponse
    extends StObject
       with EMsg
  /* 1441 */ val BSQueryBankInformationResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryBankInformationResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryCBOrderStatus
    extends StObject
       with EMsg
  /* 1428 */ val BSQueryCBOrderStatus: typingsJapgolly.steamClient.mod.EMsg.BSQueryCBOrderStatus & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse
    extends StObject
       with EMsg
  /* 1429 */ val BSQueryCBOrderStatusResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryCBOrderStatusResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCard
    extends StObject
       with EMsg
  /* 1484 */ val BSQueryFindCreditCard: typingsJapgolly.steamClient.mod.EMsg.BSQueryFindCreditCard & Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse
    extends StObject
       with EMsg
  /* 1485 */ val BSQueryFindCreditCardResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryFindCreditCardResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryGCBankXferTxn
    extends StObject
       with EMsg
  /* 1423 */ val BSQueryGCBankXferTxn: typingsJapgolly.steamClient.mod.EMsg.BSQueryGCBankXferTxn & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse
    extends StObject
       with EMsg
  /* 1424 */ val BSQueryGCBankXferTxnResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryGCBankXferTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryPaymentInstResponse
    extends StObject
       with EMsg
  /* 1432 */ val BSQueryPaymentInstResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryPaymentInstResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryPaymentInstUsage
    extends StObject
       with EMsg
  /* 1431 */ val BSQueryPaymentInstUsage: typingsJapgolly.steamClient.mod.EMsg.BSQueryPaymentInstUsage & Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatus
    extends StObject
       with EMsg
  /* 1426 */ val BSQueryTransactionStatus: typingsJapgolly.steamClient.mod.EMsg.BSQueryTransactionStatus & Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse
    extends StObject
       with EMsg
  /* 1427 */ val BSQueryTransactionStatusResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryTransactionStatusResponse & Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo
    extends StObject
       with EMsg
  /* 1433 */ val BSQueryTxnExtendedInfo: typingsJapgolly.steamClient.mod.EMsg.BSQueryTxnExtendedInfo & Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse
    extends StObject
       with EMsg
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: typingsJapgolly.steamClient.mod.EMsg.BSQueryTxnExtendedInfoResponse & Double = js.native
  
  @js.native
  sealed trait BSRefundTxn
    extends StObject
       with EMsg
  /* 1413 */ val BSRefundTxn: typingsJapgolly.steamClient.mod.EMsg.BSRefundTxn & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSRefundTxnResponse
    extends StObject
       with EMsg
  /* 1414 */ val BSRefundTxnResponse: typingsJapgolly.steamClient.mod.EMsg.BSRefundTxnResponse & Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData
    extends StObject
       with EMsg
  /* 1468 */ val BSRemoveExpiredPaymentData: typingsJapgolly.steamClient.mod.EMsg.BSRemoveExpiredPaymentData & Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse
    extends StObject
       with EMsg
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: typingsJapgolly.steamClient.mod.EMsg.BSRemoveExpiredPaymentDataResponse & Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit
    extends StObject
       with EMsg
  /* 1458 */ val BSResetPackagePurchaseRateLimit: typingsJapgolly.steamClient.mod.EMsg.BSResetPackagePurchaseRateLimit & Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse
    extends StObject
       with EMsg
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: typingsJapgolly.steamClient.mod.EMsg.BSResetPackagePurchaseRateLimitResponse & Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey
    extends StObject
       with EMsg
  /* 1482 */ val BSReverseRedeemPOSAKey: typingsJapgolly.steamClient.mod.EMsg.BSReverseRedeemPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: typingsJapgolly.steamClient.mod.EMsg.BSReverseRedeemPOSAKeyResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSRunRedFlagReport
    extends StObject
       with EMsg
  /* 1430 */ val BSRunRedFlagReport: typingsJapgolly.steamClient.mod.EMsg.BSRunRedFlagReport & Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequest
    extends StObject
       with EMsg
  /* 1452 */ val BSSendShippingRequest: typingsJapgolly.steamClient.mod.EMsg.BSSendShippingRequest & Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequestResponse
    extends StObject
       with EMsg
  /* 1453 */ val BSSendShippingRequestResponse: typingsJapgolly.steamClient.mod.EMsg.BSSendShippingRequestResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSSettleComplete
    extends StObject
       with EMsg
  /* 1406 */ val BSSettleComplete: typingsJapgolly.steamClient.mod.EMsg.BSSettleComplete & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSSettleNOVA
    extends StObject
       with EMsg
  /* 1404 */ val BSSettleNOVA: typingsJapgolly.steamClient.mod.EMsg.BSSettleNOVA & Double = js.native
  
  @js.native
  sealed trait BSStartShippingJobs
    extends StObject
       with EMsg
  /* 1439 */ val BSStartShippingJobs: typingsJapgolly.steamClient.mod.EMsg.BSStartShippingJobs & Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey
    extends StObject
       with EMsg
  /* 1486 */ val BSStatusInquiryPOSAKey: typingsJapgolly.steamClient.mod.EMsg.BSStatusInquiryPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: typingsJapgolly.steamClient.mod.EMsg.BSStatusInquiryPOSAKeyResponse & Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformation
    extends StObject
       with EMsg
  /* 1478 */ val BSStoreBankInformation: typingsJapgolly.steamClient.mod.EMsg.BSStoreBankInformation & Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformationResponse
    extends StObject
       with EMsg
  /* 1479 */ val BSStoreBankInformationResponse: typingsJapgolly.steamClient.mod.EMsg.BSStoreBankInformationResponse & Double = js.native
  
  @js.native
  sealed trait BSUpdateConversionRates
    extends StObject
       with EMsg
  /* 1435 */ val BSUpdateConversionRates: typingsJapgolly.steamClient.mod.EMsg.BSUpdateConversionRates & Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack
    extends StObject
       with EMsg
  /* 1450 */ val BSUpdateInventoryFromProPack: typingsJapgolly.steamClient.mod.EMsg.BSUpdateInventoryFromProPack & Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse
    extends StObject
       with EMsg
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: typingsJapgolly.steamClient.mod.EMsg.BSUpdateInventoryFromProPackResponse & Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentData
    extends StObject
       with EMsg
  /* 1460 */ val BSUpdatePaymentData: typingsJapgolly.steamClient.mod.EMsg.BSUpdatePaymentData & Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse
    extends StObject
       with EMsg
  /* 1461 */ val BSUpdatePaymentDataResponse: typingsJapgolly.steamClient.mod.EMsg.BSUpdatePaymentDataResponse & Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignature
    extends StObject
       with EMsg
  /* 1488 */ val BSValidateMoPaySignature: typingsJapgolly.steamClient.mod.EMsg.BSValidateMoPaySignature & Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse
    extends StObject
       with EMsg
  /* 1489 */ val BSValidateMoPaySignatureResponse: typingsJapgolly.steamClient.mod.EMsg.BSValidateMoPaySignatureResponse & Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignature
    extends StObject
       with EMsg
  /* 1445 */ val BSValidateXsollaSignature: typingsJapgolly.steamClient.mod.EMsg.BSValidateXsollaSignature & Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse
    extends StObject
       with EMsg
  /* 1446 */ val BSValidateXsollaSignatureResponse: typingsJapgolly.steamClient.mod.EMsg.BSValidateXsollaSignatureResponse & Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKey
    extends StObject
       with EMsg
  /* 1480 */ val BSVerifyPOSAKey: typingsJapgolly.steamClient.mod.EMsg.BSVerifyPOSAKey & Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse
    extends StObject
       with EMsg
  /* 1481 */ val BSVerifyPOSAKeyResponse: typingsJapgolly.steamClient.mod.EMsg.BSVerifyPOSAKeyResponse & Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrency
    extends StObject
       with EMsg
  /* 8401 */ val BackpackAddToCurrency: typingsJapgolly.steamClient.mod.EMsg.BackpackAddToCurrency & Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse
    extends StObject
       with EMsg
  /* 8402 */ val BackpackAddToCurrencyResponse: typingsJapgolly.steamClient.mod.EMsg.BackpackAddToCurrencyResponse & Double = js.native
  
  @js.native
  sealed trait BackpackBase
    extends StObject
       with EMsg
  /* 8400 */ val BackpackBase: typingsJapgolly.steamClient.mod.EMsg.BackpackBase & Double = js.native
  
  @js.native
  sealed trait BadLoginIPList
    extends StObject
       with EMsg
  /* 7805 */ val BadLoginIPList: typingsJapgolly.steamClient.mod.EMsg.BadLoginIPList & Double = js.native
  
  @js.native
  sealed trait BaseAIS
    extends StObject
       with EMsg
  /* 400 */ val BaseAIS: typingsJapgolly.steamClient.mod.EMsg.BaseAIS & Double = js.native
  
  @js.native
  sealed trait BaseAM
    extends StObject
       with EMsg
  /* 500 */ val BaseAM: typingsJapgolly.steamClient.mod.EMsg.BaseAM & Double = js.native
  
  @js.native
  sealed trait BaseAMRange2
    extends StObject
       with EMsg
  /* 4000 */ val BaseAMRange2: typingsJapgolly.steamClient.mod.EMsg.BaseAMRange2 & Double = js.native
  
  @js.native
  sealed trait BaseATS
    extends StObject
       with EMsg
  /* 1500 */ val BaseATS: typingsJapgolly.steamClient.mod.EMsg.BaseATS & Double = js.native
  
  @js.native
  sealed trait BaseAdmin
    extends StObject
       with EMsg
  /* 1000 */ val BaseAdmin: typingsJapgolly.steamClient.mod.EMsg.BaseAdmin & Double = js.native
  
  @js.native
  sealed trait BaseBRP
    extends StObject
       with EMsg
  /* 3600 */ val BaseBRP: typingsJapgolly.steamClient.mod.EMsg.BaseBRP & Double = js.native
  
  @js.native
  sealed trait BaseBS
    extends StObject
       with EMsg
  /* 1400 */ val BaseBS: typingsJapgolly.steamClient.mod.EMsg.BaseBS & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseCCSRange
    extends StObject
       with EMsg
  /* 3150 */ val BaseCCSRange: typingsJapgolly.steamClient.mod.EMsg.BaseCCSRange & Double = js.native
  
  @js.native
  sealed trait BaseCM
    extends StObject
       with EMsg
  /* 1700 */ val BaseCM: typingsJapgolly.steamClient.mod.EMsg.BaseCM & Double = js.native
  
  @js.native
  sealed trait BaseCS
    extends StObject
       with EMsg
  /* 650 */ val BaseCS: typingsJapgolly.steamClient.mod.EMsg.BaseCS & Double = js.native
  
  @js.native
  sealed trait BaseChannelAuth
    extends StObject
       with EMsg
  /* 1300 */ val BaseChannelAuth: typingsJapgolly.steamClient.mod.EMsg.BaseChannelAuth & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseClient
    extends StObject
       with EMsg
  /* 700 */ val BaseClient: typingsJapgolly.steamClient.mod.EMsg.BaseClient & Double = js.native
  
  @js.native
  sealed trait BaseClient2
    extends StObject
       with EMsg
  /* 5400 */ val BaseClient2: typingsJapgolly.steamClient.mod.EMsg.BaseClient2 & Double = js.native
  
  @js.native
  sealed trait BaseClient3
    extends StObject
       with EMsg
  /* 9800 */ val BaseClient3: typingsJapgolly.steamClient.mod.EMsg.BaseClient3 & Double = js.native
  
  @js.native
  sealed trait BaseDFS
    extends StObject
       with EMsg
  /* 5600 */ val BaseDFS: typingsJapgolly.steamClient.mod.EMsg.BaseDFS & Double = js.native
  
  @js.native
  sealed trait BaseDP
    extends StObject
       with EMsg
  /* 1600 */ val BaseDP: typingsJapgolly.steamClient.mod.EMsg.BaseDP & Double = js.native
  
  @js.native
  sealed trait BaseDRMS
    extends StObject
       with EMsg
  /* 625 */ val BaseDRMS: typingsJapgolly.steamClient.mod.EMsg.BaseDRMS & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseDSS
    extends StObject
       with EMsg
  /* 1800 */ val BaseDSS: typingsJapgolly.steamClient.mod.EMsg.BaseDSS & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseEPM
    extends StObject
       with EMsg
  /* 1900 */ val BaseEPM: typingsJapgolly.steamClient.mod.EMsg.BaseEPM & Double = js.native
  
  @js.native
  sealed trait BaseFBS
    extends StObject
       with EMsg
  /* 1100 */ val BaseFBS: typingsJapgolly.steamClient.mod.EMsg.BaseFBS & Double = js.native
  
  @js.native
  sealed trait BaseFTSRange
    extends StObject
       with EMsg
  /* 3100 */ val BaseFTSRange: typingsJapgolly.steamClient.mod.EMsg.BaseFTSRange & Double = js.native
  
  @js.native
  sealed trait BaseFileXfer
    extends StObject
       with EMsg
  /* 1200 */ val BaseFileXfer: typingsJapgolly.steamClient.mod.EMsg.BaseFileXfer & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGC
    extends StObject
       with EMsg
  /* 2200 */ val BaseGC: typingsJapgolly.steamClient.mod.EMsg.BaseGC & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGM
    extends StObject
       with EMsg
  /* 300 */ val BaseGM: typingsJapgolly.steamClient.mod.EMsg.BaseGM & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGameServer
    extends StObject
       with EMsg
  /* 900 */ val BaseGameServer: typingsJapgolly.steamClient.mod.EMsg.BaseGameServer & Double = js.native
  
  @js.native
  sealed trait BaseGeneral
    extends StObject
       with EMsg
  /* 100 */ val BaseGeneral: typingsJapgolly.steamClient.mod.EMsg.BaseGeneral & Double = js.native
  
  @js.native
  sealed trait BaseLBSRange
    extends StObject
       with EMsg
  /* 3200 */ val BaseLBSRange: typingsJapgolly.steamClient.mod.EMsg.BaseLBSRange & Double = js.native
  
  @js.native
  sealed trait BaseMDS
    extends StObject
       with EMsg
  /* 5800 */ val BaseMDS: typingsJapgolly.steamClient.mod.EMsg.BaseMDS & Double = js.native
  
  @js.native
  sealed trait BaseOGS
    extends StObject
       with EMsg
  /* 3400 */ val BaseOGS: typingsJapgolly.steamClient.mod.EMsg.BaseOGS & Double = js.native
  
  @js.native
  sealed trait BaseP2P
    extends StObject
       with EMsg
  /* 2500 */ val BaseP2P: typingsJapgolly.steamClient.mod.EMsg.BaseP2P & Double = js.native
  
  @js.native
  sealed trait BasePSRange
    extends StObject
       with EMsg
  /* 5000 */ val BasePSRange: typingsJapgolly.steamClient.mod.EMsg.BasePSRange & Double = js.native
  
  @js.native
  sealed trait BaseSM
    extends StObject
       with EMsg
  /* 2900 */ val BaseSM: typingsJapgolly.steamClient.mod.EMsg.BaseSM & Double = js.native
  
  @js.native
  sealed trait BaseShell
    extends StObject
       with EMsg
  /* 200 */ val BaseShell: typingsJapgolly.steamClient.mod.EMsg.BaseShell & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseTest
    extends StObject
       with EMsg
  /* 3000 */ val BaseTest: typingsJapgolly.steamClient.mod.EMsg.BaseTest & Double = js.native
  
  @js.native
  sealed trait BaseUFSRange
    extends StObject
       with EMsg
  /* 5200 */ val BaseUFSRange: typingsJapgolly.steamClient.mod.EMsg.BaseUFSRange & Double = js.native
  
  @js.native
  sealed trait BaseVS
    extends StObject
       with EMsg
  /* 600 */ val BaseVS: typingsJapgolly.steamClient.mod.EMsg.BaseVS & Double = js.native
  
  // obsolete
  @js.native
  sealed trait BoxMonitorBase
    extends StObject
       with EMsg
  /* 8700 */ val BoxMonitorBase: typingsJapgolly.steamClient.mod.EMsg.BoxMonitorBase & Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportRequest
    extends StObject
       with EMsg
  /* 8700 */ val BoxMonitorReportRequest: typingsJapgolly.steamClient.mod.EMsg.BoxMonitorReportRequest & Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportResponse
    extends StObject
       with EMsg
  /* 8701 */ val BoxMonitorReportResponse: typingsJapgolly.steamClient.mod.EMsg.BoxMonitorReportResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSAddComment
    extends StObject
       with EMsg
  /* 3153 */ val CCSAddComment: typingsJapgolly.steamClient.mod.EMsg.CCSAddComment & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSAddCommentResponse
    extends StObject
       with EMsg
  /* 3154 */ val CCSAddCommentResponse: typingsJapgolly.steamClient.mod.EMsg.CCSAddCommentResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor
    extends StObject
       with EMsg
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: typingsJapgolly.steamClient.mod.EMsg.CCSDeleteAllCommentsByAuthor & Double = js.native
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse
    extends StObject
       with EMsg
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: typingsJapgolly.steamClient.mod.EMsg.CCSDeleteAllCommentsByAuthorResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteComment
    extends StObject
       with EMsg
  /* 3155 */ val CCSDeleteComment: typingsJapgolly.steamClient.mod.EMsg.CCSDeleteComment & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse
    extends StObject
       with EMsg
  /* 3156 */ val CCSDeleteCommentResponse: typingsJapgolly.steamClient.mod.EMsg.CCSDeleteCommentResponse & Double = js.native
  
  @js.native
  sealed trait CCSGetComments
    extends StObject
       with EMsg
  /* 3151 */ val CCSGetComments: typingsJapgolly.steamClient.mod.EMsg.CCSGetComments & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews
    extends StObject
       with EMsg
  /* 3159 */ val CCSGetCommentsForNews: typingsJapgolly.steamClient.mod.EMsg.CCSGetCommentsForNews & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse
    extends StObject
       with EMsg
  /* 3160 */ val CCSGetCommentsForNewsResponse: typingsJapgolly.steamClient.mod.EMsg.CCSGetCommentsForNewsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse
    extends StObject
       with EMsg
  /* 3152 */ val CCSGetCommentsResponse: typingsJapgolly.steamClient.mod.EMsg.CCSGetCommentsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount
    extends StObject
       with EMsg
  /* 3158 */ val CCSNotifyCommentCount: typingsJapgolly.steamClient.mod.EMsg.CCSNotifyCommentCount & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSPreloadComments
    extends StObject
       with EMsg
  /* 3157 */ val CCSPreloadComments: typingsJapgolly.steamClient.mod.EMsg.CCSPreloadComments & Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest
    extends StObject
       with EMsg
  /* 7602 */ val CEGPropStatusDRMSRequest: typingsJapgolly.steamClient.mod.EMsg.CEGPropStatusDRMSRequest & Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse
    extends StObject
       with EMsg
  /* 7603 */ val CEGPropStatusDRMSResponse: typingsJapgolly.steamClient.mod.EMsg.CEGPropStatusDRMSResponse & Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest
    extends StObject
       with EMsg
  /* 7600 */ val CEGVersionSetEnableDisableRequest: typingsJapgolly.steamClient.mod.EMsg.CEGVersionSetEnableDisableRequest & Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse
    extends StObject
       with EMsg
  /* 7601 */ val CEGVersionSetEnableDisableResponse: typingsJapgolly.steamClient.mod.EMsg.CEGVersionSetEnableDisableResponse & Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportRequest
    extends StObject
       with EMsg
  /* 7604 */ val CEGWhackFailureReportRequest: typingsJapgolly.steamClient.mod.EMsg.CEGWhackFailureReportRequest & Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportResponse
    extends StObject
       with EMsg
  /* 7605 */ val CEGWhackFailureReportResponse: typingsJapgolly.steamClient.mod.EMsg.CEGWhackFailureReportResponse & Double = js.native
  
  @js.native
  sealed trait CMAppInfoResponseDeprecated
    extends StObject
       with EMsg
  /* 1703 */ val CMAppInfoResponseDeprecated: typingsJapgolly.steamClient.mod.EMsg.CMAppInfoResponseDeprecated & Double = js.native
  
  @js.native
  sealed trait CMSetAllowState
    extends StObject
       with EMsg
  /* 1701 */ val CMSetAllowState: typingsJapgolly.steamClient.mod.EMsg.CMSetAllowState & Double = js.native
  
  @js.native
  sealed trait CMSpewAllowState
    extends StObject
       with EMsg
  /* 1702 */ val CMSpewAllowState: typingsJapgolly.steamClient.mod.EMsg.CMSpewAllowState & Double = js.native
  
  @js.native
  sealed trait CREBase
    extends StObject
       with EMsg
  /* 8500 */ val CREBase: typingsJapgolly.steamClient.mod.EMsg.CREBase & Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFiles
    extends StObject
       with EMsg
  /* 8511 */ val CREEnumeratePublishedFiles: typingsJapgolly.steamClient.mod.EMsg.CREEnumeratePublishedFiles & Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse
    extends StObject
       with EMsg
  /* 8512 */ val CREEnumeratePublishedFilesResponse: typingsJapgolly.steamClient.mod.EMsg.CREEnumeratePublishedFilesResponse & Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails
    extends StObject
       with EMsg
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: typingsJapgolly.steamClient.mod.EMsg.CREGetUserPublishedItemVoteDetails & Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse
    extends StObject
       with EMsg
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.CREGetUserPublishedItemVoteDetailsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CREItemVoteSummary
    extends StObject
       with EMsg
  /* 8503 */ val CREItemVoteSummary: typingsJapgolly.steamClient.mod.EMsg.CREItemVoteSummary & Double = js.native
  
  @js.native
  sealed trait CREItemVoteSummaryResponse
    extends StObject
       with EMsg
  /* 8504 */ val CREItemVoteSummaryResponse: typingsJapgolly.steamClient.mod.EMsg.CREItemVoteSummaryResponse & Double = js.native
  
  @js.native
  sealed trait CREPublishedFileVoteAdded
    extends StObject
       with EMsg
  /* 8513 */ val CREPublishedFileVoteAdded: typingsJapgolly.steamClient.mod.EMsg.CREPublishedFileVoteAdded & Double = js.native
  
  @js.native
  sealed trait CRERankByTrend
    extends StObject
       with EMsg
  /* 8501 */ val CRERankByTrend: typingsJapgolly.steamClient.mod.EMsg.CRERankByTrend & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CRERankByTrendResponse
    extends StObject
       with EMsg
  /* 8502 */ val CRERankByTrendResponse: typingsJapgolly.steamClient.mod.EMsg.CRERankByTrendResponse & Double = js.native
  
  @js.native
  sealed trait CRERankByVote
    extends StObject
       with EMsg
  /* 8505 */ val CRERankByVote: typingsJapgolly.steamClient.mod.EMsg.CRERankByVote & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CRERankByVoteResponse
    extends StObject
       with EMsg
  /* 8506 */ val CRERankByVoteResponse: typingsJapgolly.steamClient.mod.EMsg.CRERankByVoteResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CREUpdateUserPublishedItemVote
    extends StObject
       with EMsg
  /* 8507 */ val CREUpdateUserPublishedItemVote: typingsJapgolly.steamClient.mod.EMsg.CREUpdateUserPublishedItemVote & Double = js.native
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse
    extends StObject
       with EMsg
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: typingsJapgolly.steamClient.mod.EMsg.CREUpdateUserPublishedItemVoteResponse & Double = js.native
  
  @js.native
  sealed trait CSBase
    extends StObject
       with EMsg
  /* 6200 */ val CSBase: typingsJapgolly.steamClient.mod.EMsg.CSBase & Double = js.native
  
  @js.native
  sealed trait CSPing
    extends StObject
       with EMsg
  /* 6201 */ val CSPing: typingsJapgolly.steamClient.mod.EMsg.CSPing & Double = js.native
  
  @js.native
  sealed trait CSPingResponse
    extends StObject
       with EMsg
  /* 6202 */ val CSPingResponse: typingsJapgolly.steamClient.mod.EMsg.CSPingResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CSUserContentApprove
    extends StObject
       with EMsg
  /* 787 */ val CSUserContentApprove: typingsJapgolly.steamClient.mod.EMsg.CSUserContentApprove & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CSUserContentDeny
    extends StObject
       with EMsg
  /* 788 */ val CSUserContentDeny: typingsJapgolly.steamClient.mod.EMsg.CSUserContentDeny & Double = js.native
  
  @js.native
  sealed trait CSUserContentRequest
    extends StObject
       with EMsg
  /* 652 */ val CSUserContentRequest: typingsJapgolly.steamClient.mod.EMsg.CSUserContentRequest & Double = js.native
  
  @js.native
  sealed trait ChannelAuthChallenge
    extends StObject
       with EMsg
  /* 1300 */ val ChannelAuthChallenge: typingsJapgolly.steamClient.mod.EMsg.ChannelAuthChallenge & Double = js.native
  
  @js.native
  sealed trait ChannelAuthResponse
    extends StObject
       with EMsg
  /* 1301 */ val ChannelAuthResponse: typingsJapgolly.steamClient.mod.EMsg.ChannelAuthResponse & Double = js.native
  
  @js.native
  sealed trait ChannelAuthResult
    extends StObject
       with EMsg
  /* 1302 */ val ChannelAuthResult: typingsJapgolly.steamClient.mod.EMsg.ChannelAuthResult & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptRequest
    extends StObject
       with EMsg
  /* 1303 */ val ChannelEncryptRequest: typingsJapgolly.steamClient.mod.EMsg.ChannelEncryptRequest & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResponse
    extends StObject
       with EMsg
  /* 1304 */ val ChannelEncryptResponse: typingsJapgolly.steamClient.mod.EMsg.ChannelEncryptResponse & Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResult
    extends StObject
       with EMsg
  /* 1305 */ val ChannelEncryptResult: typingsJapgolly.steamClient.mod.EMsg.ChannelEncryptResult & Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficers
    extends StObject
       with EMsg
  /* 5531 */ val ClientAMGetClanOfficers: typingsJapgolly.steamClient.mod.EMsg.ClientAMGetClanOfficers & Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse
    extends StObject
       with EMsg
  /* 5532 */ val ClientAMGetClanOfficersResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAMGetClanOfficersResponse & Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory
    extends StObject
       with EMsg
  /* 5570 */ val ClientAMGetPersonaNameHistory: typingsJapgolly.steamClient.mod.EMsg.ClientAMGetPersonaNameHistory & Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse
    extends StObject
       with EMsg
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAMGetPersonaNameHistoryResponse & Double = js.native
  
  @js.native
  sealed trait ClientAccountInfo
    extends StObject
       with EMsg
  /* 768 */ val ClientAccountInfo: typingsJapgolly.steamClient.mod.EMsg.ClientAccountInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckGuestPass
    extends StObject
       with EMsg
  /* 740 */ val ClientAckGuestPass: typingsJapgolly.steamClient.mod.EMsg.ClientAckGuestPass & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckGuestPassResponse
    extends StObject
       with EMsg
  /* 796 */ val ClientAckGuestPassResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAckGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientAckMessageByGID
    extends StObject
       with EMsg
  /* 735 */ val ClientAckMessageByGID: typingsJapgolly.steamClient.mod.EMsg.ClientAckMessageByGID & Double = js.native
  
  @js.native
  sealed trait ClientAckPurchaseReceipt
    extends StObject
       with EMsg
  /* 737 */ val ClientAckPurchaseReceipt: typingsJapgolly.steamClient.mod.EMsg.ClientAckPurchaseReceipt & Double = js.native
  
  @js.native
  sealed trait ClientAckVACBan
    extends StObject
       with EMsg
  /* 709 */ val ClientAckVACBan: typingsJapgolly.steamClient.mod.EMsg.ClientAckVACBan & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckVACBan2
    extends StObject
       with EMsg
  /* 732 */ val ClientAckVACBan2: typingsJapgolly.steamClient.mod.EMsg.ClientAckVACBan2 & Double = js.native
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite
    extends StObject
       with EMsg
  /* 745 */ val ClientAcknowledgeClanInvite: typingsJapgolly.steamClient.mod.EMsg.ClientAcknowledgeClanInvite & Double = js.native
  
  @js.native
  sealed trait ClientActivateOEMLicense
    extends StObject
       with EMsg
  /* 5468 */ val ClientActivateOEMLicense: typingsJapgolly.steamClient.mod.EMsg.ClientActivateOEMLicense & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAddFriend
    extends StObject
       with EMsg
  /* 791 */ val ClientAddFriend: typingsJapgolly.steamClient.mod.EMsg.ClientAddFriend & Double = js.native
  
  @js.native
  sealed trait ClientAddFriendResponse
    extends StObject
       with EMsg
  /* 792 */ val ClientAddFriendResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAddFriendResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated
    extends StObject
       with EMsg
  /* 702 */ val ClientAnonLogOn_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientAnonLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated
    extends StObject
       with EMsg
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientAnonUserLogOn_Deprecated & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoChanges
    extends StObject
       with EMsg
  /* 867 */ val ClientAppInfoChanges: typingsJapgolly.steamClient.mod.EMsg.ClientAppInfoChanges & Double = js.native
  
  @js.native
  sealed trait ClientAppInfoRequest
    extends StObject
       with EMsg
  /* 840 */ val ClientAppInfoRequest: typingsJapgolly.steamClient.mod.EMsg.ClientAppInfoRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoResponse
    extends StObject
       with EMsg
  /* 841 */ val ClientAppInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAppInfoResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate
    extends StObject
       with EMsg
  /* 866 */ val ClientAppInfoUpdate: typingsJapgolly.steamClient.mod.EMsg.ClientAppInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ClientAppMinutesPlayedData
    extends StObject
       with EMsg
  /* 5507 */ val ClientAppMinutesPlayedData: typingsJapgolly.steamClient.mod.EMsg.ClientAppMinutesPlayedData & Double = js.native
  
  @js.native
  sealed trait ClientAppUsageEvent
    extends StObject
       with EMsg
  /* 747 */ val ClientAppUsageEvent: typingsJapgolly.steamClient.mod.EMsg.ClientAppUsageEvent & Double = js.native
  
  @js.native
  sealed trait ClientAuthList
    extends StObject
       with EMsg
  /* 5432 */ val ClientAuthList: typingsJapgolly.steamClient.mod.EMsg.ClientAuthList & Double = js.native
  
  @js.native
  sealed trait ClientAuthListAck
    extends StObject
       with EMsg
  /* 5575 */ val ClientAuthListAck: typingsJapgolly.steamClient.mod.EMsg.ClientAuthListAck & Double = js.native
  
  @js.native
  sealed trait ClientAuthList_Deprecated
    extends StObject
       with EMsg
  /* 5428 */ val ClientAuthList_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientAuthList_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDevice
    extends StObject
       with EMsg
  /* 6502 */ val ClientAuthorizeLocalDevice: typingsJapgolly.steamClient.mod.EMsg.ClientAuthorizeLocalDevice & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification
    extends StObject
       with EMsg
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: typingsJapgolly.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceNotification & Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest
    extends StObject
       with EMsg
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: typingsJapgolly.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse
    extends StObject
       with EMsg
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: typingsJapgolly.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceResponse & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastBase
    extends StObject
       with EMsg
  /* 9700 */ val ClientBroadcastBase: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastBase & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastDisconnect
    extends StObject
       with EMsg
  /* 9702 */ val ClientBroadcastDisconnect: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastDisconnect & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastFrames
    extends StObject
       with EMsg
  /* 9701 */ val ClientBroadcastFrames: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastFrames & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastInit
    extends StObject
       with EMsg
  /* 9700 */ val ClientBroadcastInit: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastInit & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastScreenshot
    extends StObject
       with EMsg
  /* 9703 */ val ClientBroadcastScreenshot: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientBroadcastUploadConfig
    extends StObject
       with EMsg
  /* 9704 */ val ClientBroadcastUploadConfig: typingsJapgolly.steamClient.mod.EMsg.ClientBroadcastUploadConfig & Double = js.native
  
  @js.native
  sealed trait ClientCMList
    extends StObject
       with EMsg
  /* 783 */ val ClientCMList: typingsJapgolly.steamClient.mod.EMsg.ClientCMList & Double = js.native
  
  @js.native
  sealed trait ClientCancelLicense
    extends StObject
       with EMsg
  /* 729 */ val ClientCancelLicense: typingsJapgolly.steamClient.mod.EMsg.ClientCancelLicense & Double = js.native
  
  @js.native
  sealed trait ClientCancelLicenseResponse
    extends StObject
       with EMsg
  /* 781 */ val ClientCancelLicenseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCancelLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientChangeStatus
    extends StObject
       with EMsg
  /* 716 */ val ClientChangeStatus: typingsJapgolly.steamClient.mod.EMsg.ClientChangeStatus & Double = js.native
  
  @js.native
  sealed trait ClientChangeSteamGuardOptions
    extends StObject
       with EMsg
  /* 5579 */ val ClientChangeSteamGuardOptions: typingsJapgolly.steamClient.mod.EMsg.ClientChangeSteamGuardOptions & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse
    extends StObject
       with EMsg
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientChangeSteamGuardOptionsResponse & Double = js.native
  
  @js.native
  sealed trait ClientChatAction
    extends StObject
       with EMsg
  /* 597 */ val ClientChatAction: typingsJapgolly.steamClient.mod.EMsg.ClientChatAction & Double = js.native
  
  @js.native
  sealed trait ClientChatActionResult
    extends StObject
       with EMsg
  /* 814 */ val ClientChatActionResult: typingsJapgolly.steamClient.mod.EMsg.ClientChatActionResult & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientChatDeclined
    extends StObject
       with EMsg
  /* 5426 */ val ClientChatDeclined: typingsJapgolly.steamClient.mod.EMsg.ClientChatDeclined & Double = js.native
  
  @js.native
  sealed trait ClientChatEnter
    extends StObject
       with EMsg
  /* 807 */ val ClientChatEnter: typingsJapgolly.steamClient.mod.EMsg.ClientChatEnter & Double = js.native
  
  @js.native
  sealed trait ClientChatInvite
    extends StObject
       with EMsg
  /* 800 */ val ClientChatInvite: typingsJapgolly.steamClient.mod.EMsg.ClientChatInvite & Double = js.native
  
  @js.native
  sealed trait ClientChatMemberInfo
    extends StObject
       with EMsg
  /* 802 */ val ClientChatMemberInfo: typingsJapgolly.steamClient.mod.EMsg.ClientChatMemberInfo & Double = js.native
  
  @js.native
  sealed trait ClientChatMsg
    extends StObject
       with EMsg
  /* 799 */ val ClientChatMsg: typingsJapgolly.steamClient.mod.EMsg.ClientChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientChatRoomInfo
    extends StObject
       with EMsg
  /* 4026 */ val ClientChatRoomInfo: typingsJapgolly.steamClient.mod.EMsg.ClientChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPassword
    extends StObject
       with EMsg
  /* 5450 */ val ClientCheckAppBetaPassword: typingsJapgolly.steamClient.mod.EMsg.ClientCheckAppBetaPassword & Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse
    extends StObject
       with EMsg
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCheckAppBetaPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientCheckFileSignature
    extends StObject
       with EMsg
  /* 5533 */ val ClientCheckFileSignature: typingsJapgolly.steamClient.mod.EMsg.ClientCheckFileSignature & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse
    extends StObject
       with EMsg
  /* 5534 */ val ClientCheckFileSignatureResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCheckFileSignatureResponse & Double = js.native
  
  @js.native
  sealed trait ClientCheckPassword
    extends StObject
       with EMsg
  /* 845 */ val ClientCheckPassword: typingsJapgolly.steamClient.mod.EMsg.ClientCheckPassword & Double = js.native
  
  @js.native
  sealed trait ClientCheckPasswordResponse
    extends StObject
       with EMsg
  /* 848 */ val ClientCheckPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCheckPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientClanState
    extends StObject
       with EMsg
  /* 822 */ val ClientClanState: typingsJapgolly.steamClient.mod.EMsg.ClientClanState & Double = js.native
  
  @js.native
  sealed trait ClientCommentNotifications
    extends StObject
       with EMsg
  /* 5582 */ val ClientCommentNotifications: typingsJapgolly.steamClient.mod.EMsg.ClientCommentNotifications & Double = js.native
  
  @js.native
  sealed trait ClientConcurrentSessionsBase
    extends StObject
       with EMsg
  /* 9600 */ val ClientConcurrentSessionsBase: typingsJapgolly.steamClient.mod.EMsg.ClientConcurrentSessionsBase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientConnectionStats
    extends StObject
       with EMsg
  /* 710 */ val ClientConnectionStats: typingsJapgolly.steamClient.mod.EMsg.ClientConnectionStats & Double = js.native
  
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated
    extends StObject
       with EMsg
  /* 731 */ val ClientContentServerLogOn_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientContentServerLogOn_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount2
    extends StObject
       with EMsg
  /* 5406 */ val ClientCreateAccount2: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAccount2 & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount3
    extends StObject
       with EMsg
  /* 5462 */ val ClientCreateAccount3: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAccount3 & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientCreateAccountProto
    extends StObject
       with EMsg
  /* 5590 */ val ClientCreateAccountProto: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAccountProto & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse
    extends StObject
       with EMsg
  /* 5591 */ val ClientCreateAccountProtoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAccountProtoResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountResponse
    extends StObject
       with EMsg
  /* 5403 */ val ClientCreateAccountResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAccountResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateAcctResponse
    extends StObject
       with EMsg
  /* 761 */ val ClientCreateAcctResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCreateAcctResponse & Double = js.native
  
  @js.native
  sealed trait ClientCreateChat
    extends StObject
       with EMsg
  /* 809 */ val ClientCreateChat: typingsJapgolly.steamClient.mod.EMsg.ClientCreateChat & Double = js.native
  
  @js.native
  sealed trait ClientCreateChatResponse
    extends StObject
       with EMsg
  /* 810 */ val ClientCreateChatResponse: typingsJapgolly.steamClient.mod.EMsg.ClientCreateChatResponse & Double = js.native
  
  @js.native
  sealed trait ClientCurrentUIMode
    extends StObject
       with EMsg
  /* 5597 */ val ClientCurrentUIMode: typingsJapgolly.steamClient.mod.EMsg.ClientCurrentUIMode & Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest
    extends StObject
       with EMsg
  /* 5605 */ val ClientDFSAuthenticateRequest: typingsJapgolly.steamClient.mod.EMsg.ClientDFSAuthenticateRequest & Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse
    extends StObject
       with EMsg
  /* 5606 */ val ClientDFSAuthenticateResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDFSAuthenticateResponse & Double = js.native
  
  @js.native
  sealed trait ClientDFSDownloadStatus
    extends StObject
       with EMsg
  /* 5617 */ val ClientDFSDownloadStatus: typingsJapgolly.steamClient.mod.EMsg.ClientDFSDownloadStatus & Double = js.native
  
  @js.native
  sealed trait ClientDFSEndSession
    extends StObject
       with EMsg
  /* 5607 */ val ClientDFSEndSession: typingsJapgolly.steamClient.mod.EMsg.ClientDFSEndSession & Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey
    extends StObject
       with EMsg
  /* 1620 */ val ClientDPCheckSpecialSurvey: typingsJapgolly.steamClient.mod.EMsg.ClientDPCheckSpecialSurvey & Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse
    extends StObject
       with EMsg
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDPCheckSpecialSurveyResponse & Double = js.native
  
  @js.native
  sealed trait ClientDPContentStatsReport
    extends StObject
       with EMsg
  /* 1630 */ val ClientDPContentStatsReport: typingsJapgolly.steamClient.mod.EMsg.ClientDPContentStatsReport & Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse
    extends StObject
       with EMsg
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDPSendSpecialSurveyResponse & Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply
    extends StObject
       with EMsg
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: typingsJapgolly.steamClient.mod.EMsg.ClientDPSendSpecialSurveyResponseReply & Double = js.native
  
  @js.native
  sealed trait ClientDPSteam2AppStarted
    extends StObject
       with EMsg
  /* 1627 */ val ClientDPSteam2AppStarted: typingsJapgolly.steamClient.mod.EMsg.ClientDPSteam2AppStarted & Double = js.native
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport
    extends StObject
       with EMsg
  /* 1625 */ val ClientDPUpdateAppJobReport: typingsJapgolly.steamClient.mod.EMsg.ClientDPUpdateAppJobReport & Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobRequest
    extends StObject
       with EMsg
  /* 896 */ val ClientDRMBlobRequest: typingsJapgolly.steamClient.mod.EMsg.ClientDRMBlobRequest & Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobResponse
    extends StObject
       with EMsg
  /* 897 */ val ClientDRMBlobResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDRMBlobResponse & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequest
    extends StObject
       with EMsg
  /* 5485 */ val ClientDRMDownloadRequest: typingsJapgolly.steamClient.mod.EMsg.ClientDRMDownloadRequest & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData
    extends StObject
       with EMsg
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: typingsJapgolly.steamClient.mod.EMsg.ClientDRMDownloadRequestWithCrashData & Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadResponse
    extends StObject
       with EMsg
  /* 5486 */ val ClientDRMDownloadResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDRMDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientDRMFinalResult
    extends StObject
       with EMsg
  /* 5487 */ val ClientDRMFinalResult: typingsJapgolly.steamClient.mod.EMsg.ClientDRMFinalResult & Double = js.native
  
  @js.native
  sealed trait ClientDRMProblemReport
    extends StObject
       with EMsg
  /* 851 */ val ClientDRMProblemReport: typingsJapgolly.steamClient.mod.EMsg.ClientDRMProblemReport & Double = js.native
  
  @js.native
  sealed trait ClientDRMTest
    extends StObject
       with EMsg
  /* 5495 */ val ClientDRMTest: typingsJapgolly.steamClient.mod.EMsg.ClientDRMTest & Double = js.native
  
  @js.native
  sealed trait ClientDRMTestResult
    extends StObject
       with EMsg
  /* 5496 */ val ClientDRMTestResult: typingsJapgolly.steamClient.mod.EMsg.ClientDRMTestResult & Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDevice
    extends StObject
       with EMsg
  /* 6504 */ val ClientDeauthorizeDevice: typingsJapgolly.steamClient.mod.EMsg.ClientDeauthorizeDevice & Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest
    extends StObject
       with EMsg
  /* 6503 */ val ClientDeauthorizeDeviceRequest: typingsJapgolly.steamClient.mod.EMsg.ClientDeauthorizeDeviceRequest & Double = js.native
  
  @js.native
  sealed trait ClientDeregisterWithServer
    extends StObject
       with EMsg
  /* 5511 */ val ClientDeregisterWithServer: typingsJapgolly.steamClient.mod.EMsg.ClientDeregisterWithServer & Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicense
    extends StObject
       with EMsg
  /* 5445 */ val ClientDisableTestLicense: typingsJapgolly.steamClient.mod.EMsg.ClientDisableTestLicense & Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse
    extends StObject
       with EMsg
  /* 5446 */ val ClientDisableTestLicenseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientDisableTestLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientDownloadRateStatistics
    extends StObject
       with EMsg
  /* 5548 */ val ClientDownloadRateStatistics: typingsJapgolly.steamClient.mod.EMsg.ClientDownloadRateStatistics & Double = js.native
  
  @js.native
  sealed trait ClientEmailAddrInfo
    extends StObject
       with EMsg
  /* 5456 */ val ClientEmailAddrInfo: typingsJapgolly.steamClient.mod.EMsg.ClientEmailAddrInfo & Double = js.native
  
  @js.native
  sealed trait ClientEmailChange3
    extends StObject
       with EMsg
  /* 5458 */ val ClientEmailChange3: typingsJapgolly.steamClient.mod.EMsg.ClientEmailChange3 & Double = js.native
  
  @js.native
  sealed trait ClientEmailChange4
    extends StObject
       with EMsg
  /* 5544 */ val ClientEmailChange4: typingsJapgolly.steamClient.mod.EMsg.ClientEmailChange4 & Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse
    extends StObject
       with EMsg
  /* 891 */ val ClientEmailChangeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientEmailChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse4
    extends StObject
       with EMsg
  /* 5545 */ val ClientEmailChangeResponse4: typingsJapgolly.steamClient.mod.EMsg.ClientEmailChangeResponse4 & Double = js.native
  
  @js.native
  sealed trait ClientEmoticonList
    extends StObject
       with EMsg
  /* 9331 */ val ClientEmoticonList: typingsJapgolly.steamClient.mod.EMsg.ClientEmoticonList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientEnableTestLicense
    extends StObject
       with EMsg
  /* 5443 */ val ClientEnableTestLicense: typingsJapgolly.steamClient.mod.EMsg.ClientEnableTestLicense & Double = js.native
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse
    extends StObject
       with EMsg
  /* 5444 */ val ClientEnableTestLicenseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientEnableTestLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientEncryptPct
    extends StObject
       with EMsg
  /* 784 */ val ClientEncryptPct: typingsJapgolly.steamClient.mod.EMsg.ClientEncryptPct & Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList
    extends StObject
       with EMsg
  /* 7519 */ val ClientFSEnumerateFollowingList: typingsJapgolly.steamClient.mod.EMsg.ClientFSEnumerateFollowingList & Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse
    extends StObject
       with EMsg
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFSEnumerateFollowingListResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCount
    extends StObject
       with EMsg
  /* 7515 */ val ClientFSGetFollowerCount: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFollowerCount & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse
    extends StObject
       with EMsg
  /* 7516 */ val ClientFSGetFollowerCountResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFollowerCountResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory
    extends StObject
       with EMsg
  /* 7525 */ val ClientFSGetFriendMessageHistory: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFriendMessageHistory & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages
    extends StObject
       with EMsg
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse
    extends StObject
       with EMsg
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFriendMessageHistoryResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels
    extends StObject
       with EMsg
  /* 7528 */ val ClientFSGetFriendsSteamLevels: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFriendsSteamLevels & Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse
    extends StObject
       with EMsg
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetFriendsSteamLevelsResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowing
    extends StObject
       with EMsg
  /* 7517 */ val ClientFSGetIsFollowing: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetIsFollowing & Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse
    extends StObject
       with EMsg
  /* 7518 */ val ClientFSGetIsFollowingResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFSGetIsFollowingResponse & Double = js.native
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification
    extends StObject
       with EMsg
  /* 7523 */ val ClientFSOfflineMessageNotification: typingsJapgolly.steamClient.mod.EMsg.ClientFSOfflineMessageNotification & Double = js.native
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount
    extends StObject
       with EMsg
  /* 7524 */ val ClientFSRequestOfflineMessageCount: typingsJapgolly.steamClient.mod.EMsg.ClientFSRequestOfflineMessageCount & Double = js.native
  
  @js.native
  sealed trait ClientFavoritesList
    extends StObject
       with EMsg
  /* 786 */ val ClientFavoritesList: typingsJapgolly.steamClient.mod.EMsg.ClientFavoritesList & Double = js.native
  
  @js.native
  sealed trait ClientFileToDownload
    extends StObject
       with EMsg
  /* 5412 */ val ClientFileToDownload: typingsJapgolly.steamClient.mod.EMsg.ClientFileToDownload & Double = js.native
  
  @js.native
  sealed trait ClientFileToDownloadResponse
    extends StObject
       with EMsg
  /* 5413 */ val ClientFileToDownloadResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFileToDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsg
    extends StObject
       with EMsg
  /* 718 */ val ClientFriendMsg: typingsJapgolly.steamClient.mod.EMsg.ClientFriendMsg & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender
    extends StObject
       with EMsg
  /* 5578 */ val ClientFriendMsgEchoToSender: typingsJapgolly.steamClient.mod.EMsg.ClientFriendMsgEchoToSender & Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgIncoming
    extends StObject
       with EMsg
  /* 5427 */ val ClientFriendMsgIncoming: typingsJapgolly.steamClient.mod.EMsg.ClientFriendMsgIncoming & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientFriendProfileInfo
    extends StObject
       with EMsg
  /* 5535 */ val ClientFriendProfileInfo: typingsJapgolly.steamClient.mod.EMsg.ClientFriendProfileInfo & Double = js.native
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse
    extends StObject
       with EMsg
  /* 5536 */ val ClientFriendProfileInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientFriendProfileInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientFriendRemovedFromSource
    extends StObject
       with EMsg
  /* 808 */ val ClientFriendRemovedFromSource: typingsJapgolly.steamClient.mod.EMsg.ClientFriendRemovedFromSource & Double = js.native
  
  @js.native
  sealed trait ClientFriendUserStatusPublished
    extends StObject
       with EMsg
  /* 5596 */ val ClientFriendUserStatusPublished: typingsJapgolly.steamClient.mod.EMsg.ClientFriendUserStatusPublished & Double = js.native
  
  @js.native
  sealed trait ClientFriendsGroupsList
    extends StObject
       with EMsg
  /* 5553 */ val ClientFriendsGroupsList: typingsJapgolly.steamClient.mod.EMsg.ClientFriendsGroupsList & Double = js.native
  
  @js.native
  sealed trait ClientFriendsList
    extends StObject
       with EMsg
  /* 767 */ val ClientFriendsList: typingsJapgolly.steamClient.mod.EMsg.ClientFriendsList & Double = js.native
  
  @js.native
  sealed trait ClientFromGC
    extends StObject
       with EMsg
  /* 5453 */ val ClientFromGC: typingsJapgolly.steamClient.mod.EMsg.ClientFromGC & Double = js.native
  
  @js.native
  sealed trait ClientGCMsgFailed
    extends StObject
       with EMsg
  /* 5503 */ val ClientGCMsgFailed: typingsJapgolly.steamClient.mod.EMsg.ClientGCMsgFailed & Double = js.native
  
  @js.native
  sealed trait ClientGMSServerQuery
    extends StObject
       with EMsg
  /* 6403 */ val ClientGMSServerQuery: typingsJapgolly.steamClient.mod.EMsg.ClientGMSServerQuery & Double = js.native
  
  @js.native
  sealed trait ClientGameConnectDeny
    extends StObject
       with EMsg
  /* 773 */ val ClientGameConnectDeny: typingsJapgolly.steamClient.mod.EMsg.ClientGameConnectDeny & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGameConnectTokens
    extends StObject
       with EMsg
  /* 779 */ val ClientGameConnectTokens: typingsJapgolly.steamClient.mod.EMsg.ClientGameConnectTokens & Double = js.native
  
  @js.native
  sealed trait ClientGameConnect_obsolete
    extends StObject
       with EMsg
  /* 719 */ val ClientGameConnect_obsolete: typingsJapgolly.steamClient.mod.EMsg.ClientGameConnect_obsolete & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete
    extends StObject
       with EMsg
  /* 721 */ val ClientGameEnded_obsolete: typingsJapgolly.steamClient.mod.EMsg.ClientGameEnded_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed
    extends StObject
       with EMsg
  /* 742 */ val ClientGamesPlayed: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayed & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete
    extends StObject
       with EMsg
  /* 720 */ val ClientGamesPlayed2_obsolete: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayed2_obsolete & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete
    extends StObject
       with EMsg
  /* 738 */ val ClientGamesPlayed3_obsolete: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayed3_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob
    extends StObject
       with EMsg
  /* 715 */ val ClientGamesPlayedNoDataBlob: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayedNoDataBlob & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob
    extends StObject
       with EMsg
  /* 5410 */ val ClientGamesPlayedWithDataBlob: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayedWithDataBlob & Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed_obsolete
    extends StObject
       with EMsg
  /* 705 */ val ClientGamesPlayed_obsolete: typingsJapgolly.steamClient.mod.EMsg.ClientGamesPlayed_obsolete & Double = js.native
  
  @js.native
  sealed trait ClientGetAppBetaPasswords
    extends StObject
       with EMsg
  /* 5441 */ val ClientGetAppBetaPasswords: typingsJapgolly.steamClient.mod.EMsg.ClientGetAppBetaPasswords & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse
    extends StObject
       with EMsg
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetAppBetaPasswordsResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket
    extends StObject
       with EMsg
  /* 857 */ val ClientGetAppOwnershipTicket: typingsJapgolly.steamClient.mod.EMsg.ClientGetAppOwnershipTicket & Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse
    extends StObject
       with EMsg
  /* 858 */ val ClientGetAppOwnershipTicketResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetAppOwnershipTicketResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevices
    extends StObject
       with EMsg
  /* 6506 */ val ClientGetAuthorizedDevices: typingsJapgolly.steamClient.mod.EMsg.ClientGetAuthorizedDevices & Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse
    extends StObject
       with EMsg
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetAuthorizedDevicesResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthToken
    extends StObject
       with EMsg
  /* 5546 */ val ClientGetCDNAuthToken: typingsJapgolly.steamClient.mod.EMsg.ClientGetCDNAuthToken & Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse
    extends StObject
       with EMsg
  /* 5547 */ val ClientGetCDNAuthTokenResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetCDNAuthTokenResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCounts
    extends StObject
       with EMsg
  /* 5554 */ val ClientGetClanActivityCounts: typingsJapgolly.steamClient.mod.EMsg.ClientGetClanActivityCounts & Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse
    extends StObject
       with EMsg
  /* 5555 */ val ClientGetClanActivityCountsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetClanActivityCountsResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppList
    extends StObject
       with EMsg
  /* 5518 */ val ClientGetClientAppList: typingsJapgolly.steamClient.mod.EMsg.ClientGetClientAppList & Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppListResponse
    extends StObject
       with EMsg
  /* 5519 */ val ClientGetClientAppListResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetClientAppListResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetails
    extends StObject
       with EMsg
  /* 5515 */ val ClientGetClientDetails: typingsJapgolly.steamClient.mod.EMsg.ClientGetClientDetails & Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetailsResponse
    extends StObject
       with EMsg
  /* 5516 */ val ClientGetClientDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetClientDetailsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetDepotDecryptionKey
    extends StObject
       with EMsg
  /* 5438 */ val ClientGetDepotDecryptionKey: typingsJapgolly.steamClient.mod.EMsg.ClientGetDepotDecryptionKey & Double = js.native
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse
    extends StObject
       with EMsg
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetDepotDecryptionKeyResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetEmoticonList
    extends StObject
       with EMsg
  /* 9330 */ val ClientGetEmoticonList: typingsJapgolly.steamClient.mod.EMsg.ClientGetEmoticonList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetFinalPrice
    extends StObject
       with EMsg
  /* 722 */ val ClientGetFinalPrice: typingsJapgolly.steamClient.mod.EMsg.ClientGetFinalPrice & Double = js.native
  
  @js.native
  sealed trait ClientGetFinalPriceResponse
    extends StObject
       with EMsg
  /* 775 */ val ClientGetFinalPriceResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetFinalPriceResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame
    extends StObject
       with EMsg
  /* 5488 */ val ClientGetFriendsWhoPlayGame: typingsJapgolly.steamClient.mod.EMsg.ClientGetFriendsWhoPlayGame & Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse
    extends StObject
       with EMsg
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetFriendsWhoPlayGameResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetGiftTargetList
    extends StObject
       with EMsg
  /* 748 */ val ClientGetGiftTargetList: typingsJapgolly.steamClient.mod.EMsg.ClientGetGiftTargetList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse
    extends StObject
       with EMsg
  /* 749 */ val ClientGetGiftTargetListResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetGiftTargetListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetLegacyGameKey
    extends StObject
       with EMsg
  /* 730 */ val ClientGetLegacyGameKey: typingsJapgolly.steamClient.mod.EMsg.ClientGetLegacyGameKey & Double = js.native
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse
    extends StObject
       with EMsg
  /* 785 */ val ClientGetLegacyGameKeyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetLegacyGameKeyResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetLicenses
    extends StObject
       with EMsg
  /* 728 */ val ClientGetLicenses: typingsJapgolly.steamClient.mod.EMsg.ClientGetLicenses & Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyListResponse
    extends StObject
       with EMsg
  /* 860 */ val ClientGetLobbyListResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyMetadata
    extends StObject
       with EMsg
  /* 861 */ val ClientGetLobbyMetadata: typingsJapgolly.steamClient.mod.EMsg.ClientGetLobbyMetadata & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse
    extends StObject
       with EMsg
  /* 862 */ val ClientGetLobbyMetadataResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetLobbyMetadataResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfo
    extends StObject
       with EMsg
  /* 5508 */ val ClientGetMicroTxnInfo: typingsJapgolly.steamClient.mod.EMsg.ClientGetMicroTxnInfo & Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse
    extends StObject
       with EMsg
  /* 5509 */ val ClientGetMicroTxnInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetMicroTxnInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers
    extends StObject
       with EMsg
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: typingsJapgolly.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayers & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP
    extends StObject
       with EMsg
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: typingsJapgolly.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersDP & Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse
    extends StObject
       with EMsg
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersDPResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse
    extends StObject
       with EMsg
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetPurchaseReceipts
    extends StObject
       with EMsg
  /* 736 */ val ClientGetPurchaseReceipts: typingsJapgolly.steamClient.mod.EMsg.ClientGetPurchaseReceipts & Double = js.native
  
  @js.native
  sealed trait ClientGetUserStats
    extends StObject
       with EMsg
  /* 818 */ val ClientGetUserStats: typingsJapgolly.steamClient.mod.EMsg.ClientGetUserStats & Double = js.native
  
  @js.native
  sealed trait ClientGetUserStatsResponse
    extends StObject
       with EMsg
  /* 819 */ val ClientGetUserStatsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientGetUserStatsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientHeartBeat
    extends StObject
       with EMsg
  /* 703 */ val ClientHeartBeat: typingsJapgolly.steamClient.mod.EMsg.ClientHeartBeat & Double = js.native
  
  @js.native
  sealed trait ClientHideFriend
    extends StObject
       with EMsg
  /* 5552 */ val ClientHideFriend: typingsJapgolly.steamClient.mod.EMsg.ClientHideFriend & Double = js.native
  
  @js.native
  sealed trait ClientInformOfCreateAccount
    extends StObject
       with EMsg
  /* 708 */ val ClientInformOfCreateAccount: typingsJapgolly.steamClient.mod.EMsg.ClientInformOfCreateAccount & Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword
    extends StObject
       with EMsg
  /* 5407 */ val ClientInformOfResetForgottenPassword: typingsJapgolly.steamClient.mod.EMsg.ClientInformOfResetForgottenPassword & Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse
    extends StObject
       with EMsg
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientInformOfResetForgottenPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientInitPurchase
    extends StObject
       with EMsg
  /* 711 */ val ClientInitPurchase: typingsJapgolly.steamClient.mod.EMsg.ClientInitPurchase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse
    extends StObject
       with EMsg
  /* 789 */ val ClientInitPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientInitPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait ClientInstallClientApp
    extends StObject
       with EMsg
  /* 5520 */ val ClientInstallClientApp: typingsJapgolly.steamClient.mod.EMsg.ClientInstallClientApp & Double = js.native
  
  @js.native
  sealed trait ClientInstallClientAppResponse
    extends StObject
       with EMsg
  /* 5521 */ val ClientInstallClientAppResponse: typingsJapgolly.steamClient.mod.EMsg.ClientInstallClientAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientInviteFriend
    extends StObject
       with EMsg
  /* 793 */ val ClientInviteFriend: typingsJapgolly.steamClient.mod.EMsg.ClientInviteFriend & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse
    extends StObject
       with EMsg
  /* 794 */ val ClientInviteFriendResponse: typingsJapgolly.steamClient.mod.EMsg.ClientInviteFriendResponse & Double = js.native
  
  @js.native
  sealed trait ClientInviteUserToClan
    extends StObject
       with EMsg
  /* 744 */ val ClientInviteUserToClan: typingsJapgolly.steamClient.mod.EMsg.ClientInviteUserToClan & Double = js.native
  
  @js.native
  sealed trait ClientIsLimitedAccount
    extends StObject
       with EMsg
  /* 5430 */ val ClientIsLimitedAccount: typingsJapgolly.steamClient.mod.EMsg.ClientIsLimitedAccount & Double = js.native
  
  @js.native
  sealed trait ClientItemAnnouncements
    extends StObject
       with EMsg
  /* 5576 */ val ClientItemAnnouncements: typingsJapgolly.steamClient.mod.EMsg.ClientItemAnnouncements & Double = js.native
  
  @js.native
  sealed trait ClientJoinChat
    extends StObject
       with EMsg
  /* 801 */ val ClientJoinChat: typingsJapgolly.steamClient.mod.EMsg.ClientJoinChat & Double = js.native
  
  @js.native
  sealed trait ClientKickPlayingSession
    extends StObject
       with EMsg
  /* 9601 */ val ClientKickPlayingSession: typingsJapgolly.steamClient.mod.EMsg.ClientKickPlayingSession & Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB
    extends StObject
       with EMsg
  /* 5416 */ val ClientLBSFindOrCreateLB: typingsJapgolly.steamClient.mod.EMsg.ClientLBSFindOrCreateLB & Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse
    extends StObject
       with EMsg
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLBSFindOrCreateLBResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntries
    extends StObject
       with EMsg
  /* 5418 */ val ClientLBSGetLBEntries: typingsJapgolly.steamClient.mod.EMsg.ClientLBSGetLBEntries & Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse
    extends StObject
       with EMsg
  /* 5419 */ val ClientLBSGetLBEntriesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLBSGetLBEntriesResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScore
    extends StObject
       with EMsg
  /* 5414 */ val ClientLBSSetScore: typingsJapgolly.steamClient.mod.EMsg.ClientLBSSetScore & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScoreResponse
    extends StObject
       with EMsg
  /* 5415 */ val ClientLBSSetScoreResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLBSSetScoreResponse & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGC
    extends StObject
       with EMsg
  /* 5529 */ val ClientLBSSetUGC: typingsJapgolly.steamClient.mod.EMsg.ClientLBSSetUGC & Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGCResponse
    extends StObject
       with EMsg
  /* 5530 */ val ClientLBSSetUGCResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLBSSetUGCResponse & Double = js.native
  
  @js.native
  sealed trait ClientLicenseList
    extends StObject
       with EMsg
  /* 780 */ val ClientLicenseList: typingsJapgolly.steamClient.mod.EMsg.ClientLicenseList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLogOff
    extends StObject
       with EMsg
  /* 706 */ val ClientLogOff: typingsJapgolly.steamClient.mod.EMsg.ClientLogOff & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLogOnResponse
    extends StObject
       with EMsg
  /* 751 */ val ClientLogOnResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLogOnResponse & Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated
    extends StObject
       with EMsg
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientLogOnWithCredentials_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated
    extends StObject
       with EMsg
  /* 5465 */ val ClientLogOnWithHash_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientLogOnWithHash_Deprecated & Double = js.native
  
  @js.native
  sealed trait ClientLogOn_Deprecated
    extends StObject
       with EMsg
  /* 701 */ val ClientLogOn_Deprecated: typingsJapgolly.steamClient.mod.EMsg.ClientLogOn_Deprecated & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLoggedOff
    extends StObject
       with EMsg
  /* 757 */ val ClientLoggedOff: typingsJapgolly.steamClient.mod.EMsg.ClientLoggedOff & Double = js.native
  
  @js.native
  sealed trait ClientLogon
    extends StObject
       with EMsg
  /* 5514 */ val ClientLogon: typingsJapgolly.steamClient.mod.EMsg.ClientLogon & Double = js.native
  
  @js.native
  sealed trait ClientLogonGameServer
    extends StObject
       with EMsg
  /* 5559 */ val ClientLogonGameServer: typingsJapgolly.steamClient.mod.EMsg.ClientLogonGameServer & Double = js.native
  
  @js.native
  sealed trait ClientLookupKey
    extends StObject
       with EMsg
  /* 898 */ val ClientLookupKey: typingsJapgolly.steamClient.mod.EMsg.ClientLookupKey & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse
    extends StObject
       with EMsg
  /* 899 */ val ClientLookupKeyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientLookupKeyResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest
    extends StObject
       with EMsg
  /* 5818 */ val ClientMDSGetDepotManifest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSGetDepotManifest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk
    extends StObject
       with EMsg
  /* 5820 */ val ClientMDSGetDepotManifestChunk: typingsJapgolly.steamClient.mod.EMsg.ClientMDSGetDepotManifestChunk & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse
    extends StObject
       with EMsg
  /* 5819 */ val ClientMDSGetDepotManifestResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSGetDepotManifestResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild
    extends StObject
       with EMsg
  /* 5842 */ val ClientMDSGetPrevDepotBuild: typingsJapgolly.steamClient.mod.EMsg.ClientMDSGetPrevDepotBuild & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse
    extends StObject
       with EMsg
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSGetPrevDepotBuildResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat
    extends StObject
       with EMsg
  /* 5806 */ val ClientMDSHeartbeat: typingsJapgolly.steamClient.mod.EMsg.ClientMDSHeartbeat & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest
    extends StObject
       with EMsg
  /* 5809 */ val ClientMDSInitDepotBuildRequest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSInitDepotBuildRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse
    extends StObject
       with EMsg
  /* 5810 */ val ClientMDSInitDepotBuildResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSInitDepotBuildResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest
    extends StObject
       with EMsg
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSInitWorkshopBuildRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse
    extends StObject
       with EMsg
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSInitWorkshopBuildResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSLoginRequest
    extends StObject
       with EMsg
  /* 5801 */ val ClientMDSLoginRequest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSLoginRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse
    extends StObject
       with EMsg
  /* 5802 */ val ClientMDSLoginResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSLoginResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSRegisterAppBuild
    extends StObject
       with EMsg
  /* 5838 */ val ClientMDSRegisterAppBuild: typingsJapgolly.steamClient.mod.EMsg.ClientMDSRegisterAppBuild & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse
    extends StObject
       with EMsg
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSRegisterAppBuildResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive
    extends StObject
       with EMsg
  /* 5840 */ val ClientMDSSetAppBuildLive: typingsJapgolly.steamClient.mod.EMsg.ClientMDSSetAppBuildLive & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse
    extends StObject
       with EMsg
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSSetAppBuildLiveResponse & Double = js.native
  
  @js.native
  sealed trait ClientMDSSignInstallScript
    extends StObject
       with EMsg
  /* 5845 */ val ClientMDSSignInstallScript: typingsJapgolly.steamClient.mod.EMsg.ClientMDSSignInstallScript & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse
    extends StObject
       with EMsg
  /* 5846 */ val ClientMDSSignInstallScriptResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSSignInstallScriptResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk
    extends StObject
       with EMsg
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: typingsJapgolly.steamClient.mod.EMsg.ClientMDSTransmitManifestDataChunk & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks
    extends StObject
       with EMsg
  /* 5807 */ val ClientMDSUploadDepotChunks: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadDepotChunks & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse
    extends StObject
       with EMsg
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadDepotChunksResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest
    extends StObject
       with EMsg
  /* 5803 */ val ClientMDSUploadManifestRequest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadManifestRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse
    extends StObject
       with EMsg
  /* 5804 */ val ClientMDSUploadManifestResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadManifestResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest
    extends StObject
       with EMsg
  /* 5823 */ val ClientMDSUploadRateTest: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadRateTest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse
    extends StObject
       with EMsg
  /* 5824 */ val ClientMDSUploadRateTestResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMDSUploadRateTestResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobby
    extends StObject
       with EMsg
  /* 6601 */ val ClientMMSCreateLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSCreateLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse
    extends StObject
       with EMsg
  /* 6602 */ val ClientMMSCreateLobbyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSCreateLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache
    extends StObject
       with EMsg
  /* 6622 */ val ClientMMSFlushFrenemyListCache: typingsJapgolly.steamClient.mod.EMsg.ClientMMSFlushFrenemyListCache & Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse
    extends StObject
       with EMsg
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSFlushFrenemyListCacheResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyData
    extends StObject
       with EMsg
  /* 6611 */ val ClientMMSGetLobbyData: typingsJapgolly.steamClient.mod.EMsg.ClientMMSGetLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyList
    extends StObject
       with EMsg
  /* 6607 */ val ClientMMSGetLobbyList: typingsJapgolly.steamClient.mod.EMsg.ClientMMSGetLobbyList & Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse
    extends StObject
       with EMsg
  /* 6608 */ val ClientMMSGetLobbyListResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSGetLobbyListResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSInviteToLobby
    extends StObject
       with EMsg
  /* 6621 */ val ClientMMSInviteToLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSInviteToLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobby
    extends StObject
       with EMsg
  /* 6603 */ val ClientMMSJoinLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSJoinLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse
    extends StObject
       with EMsg
  /* 6604 */ val ClientMMSJoinLobbyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSJoinLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobby
    extends StObject
       with EMsg
  /* 6605 */ val ClientMMSLeaveLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSLeaveLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse
    extends StObject
       with EMsg
  /* 6606 */ val ClientMMSLeaveLobbyResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSLeaveLobbyResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg
    extends StObject
       with EMsg
  /* 6614 */ val ClientMMSLobbyChatMsg: typingsJapgolly.steamClient.mod.EMsg.ClientMMSLobbyChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyData
    extends StObject
       with EMsg
  /* 6612 */ val ClientMMSLobbyData: typingsJapgolly.steamClient.mod.EMsg.ClientMMSLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet
    extends StObject
       with EMsg
  /* 6618 */ val ClientMMSLobbyGameServerSet: typingsJapgolly.steamClient.mod.EMsg.ClientMMSLobbyGameServerSet & Double = js.native
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg
    extends StObject
       with EMsg
  /* 6613 */ val ClientMMSSendLobbyChatMsg: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSendLobbyChatMsg & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyData
    extends StObject
       with EMsg
  /* 6609 */ val ClientMMSSetLobbyData: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyData & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse
    extends StObject
       with EMsg
  /* 6610 */ val ClientMMSSetLobbyDataResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyDataResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer
    extends StObject
       with EMsg
  /* 6617 */ val ClientMMSSetLobbyGameServer: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyGameServer & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked
    extends StObject
       with EMsg
  /* 6624 */ val ClientMMSSetLobbyLinked: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyLinked & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner
    extends StObject
       with EMsg
  /* 6615 */ val ClientMMSSetLobbyOwner: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyOwner & Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse
    extends StObject
       with EMsg
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMMSSetLobbyOwnerResponse & Double = js.native
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby
    extends StObject
       with EMsg
  /* 6619 */ val ClientMMSUserJoinedLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSUserJoinedLobby & Double = js.native
  
  @js.native
  sealed trait ClientMMSUserLeftLobby
    extends StObject
       with EMsg
  /* 6620 */ val ClientMMSUserLeftLobby: typingsJapgolly.steamClient.mod.EMsg.ClientMMSUserLeftLobby & Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate
    extends StObject
       with EMsg
  /* 5420 */ val ClientMarketingMessageUpdate: typingsJapgolly.steamClient.mod.EMsg.ClientMarketingMessageUpdate & Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2
    extends StObject
       with EMsg
  /* 5510 */ val ClientMarketingMessageUpdate2: typingsJapgolly.steamClient.mod.EMsg.ClientMarketingMessageUpdate2 & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest
    extends StObject
       with EMsg
  /* 5504 */ val ClientMicroTxnAuthRequest: typingsJapgolly.steamClient.mod.EMsg.ClientMicroTxnAuthRequest & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorize
    extends StObject
       with EMsg
  /* 5505 */ val ClientMicroTxnAuthorize: typingsJapgolly.steamClient.mod.EMsg.ClientMicroTxnAuthorize & Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse
    extends StObject
       with EMsg
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientMicroTxnAuthorizeResponse & Double = js.native
  
  @js.native
  sealed trait ClientNOP
    extends StObject
       with EMsg
  /* 765 */ val ClientNOP: typingsJapgolly.steamClient.mod.EMsg.ClientNOP & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNatTraversalStatEvent
    extends StObject
       with EMsg
  /* 839 */ val ClientNatTraversalStatEvent: typingsJapgolly.steamClient.mod.EMsg.ClientNatTraversalStatEvent & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNewLoginKey
    extends StObject
       with EMsg
  /* 5463 */ val ClientNewLoginKey: typingsJapgolly.steamClient.mod.EMsg.ClientNewLoginKey & Double = js.native
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted
    extends StObject
       with EMsg
  /* 5464 */ val ClientNewLoginKeyAccepted: typingsJapgolly.steamClient.mod.EMsg.ClientNewLoginKeyAccepted & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNewsUpdate
    extends StObject
       with EMsg
  /* 771 */ val ClientNewsUpdate: typingsJapgolly.steamClient.mod.EMsg.ClientNewsUpdate & Double = js.native
  
  @js.native
  sealed trait ClientNoUDPConnectivity
    extends StObject
       with EMsg
  /* 707 */ val ClientNoUDPConnectivity: typingsJapgolly.steamClient.mod.EMsg.ClientNoUDPConnectivity & Double = js.native
  
  @js.native
  sealed trait ClientNotLoggedOnDeprecated
    extends StObject
       with EMsg
  /* 756 */ val ClientNotLoggedOnDeprecated: typingsJapgolly.steamClient.mod.EMsg.ClientNotLoggedOnDeprecated & Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSession
    extends StObject
       with EMsg
  /* 5490 */ val ClientOGSBeginSession: typingsJapgolly.steamClient.mod.EMsg.ClientOGSBeginSession & Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse
    extends StObject
       with EMsg
  /* 5491 */ val ClientOGSBeginSessionResponse: typingsJapgolly.steamClient.mod.EMsg.ClientOGSBeginSessionResponse & Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSession
    extends StObject
       with EMsg
  /* 5492 */ val ClientOGSEndSession: typingsJapgolly.steamClient.mod.EMsg.ClientOGSEndSession & Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSessionResponse
    extends StObject
       with EMsg
  /* 5493 */ val ClientOGSEndSessionResponse: typingsJapgolly.steamClient.mod.EMsg.ClientOGSEndSessionResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientOGSGameServerPingSample
    extends StObject
       with EMsg
  /* 5581 */ val ClientOGSGameServerPingSample: typingsJapgolly.steamClient.mod.EMsg.ClientOGSGameServerPingSample & Double = js.native
  
  @js.native
  sealed trait ClientOGSReportBug
    extends StObject
       with EMsg
  /* 5557 */ val ClientOGSReportBug: typingsJapgolly.steamClient.mod.EMsg.ClientOGSReportBug & Double = js.native
  
  @js.native
  sealed trait ClientOGSReportString
    extends StObject
       with EMsg
  /* 5556 */ val ClientOGSReportString: typingsJapgolly.steamClient.mod.EMsg.ClientOGSReportString & Double = js.native
  
  @js.native
  sealed trait ClientOGSWriteRow
    extends StObject
       with EMsg
  /* 5494 */ val ClientOGSWriteRow: typingsJapgolly.steamClient.mod.EMsg.ClientOGSWriteRow & Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo
    extends StObject
       with EMsg
  /* 5435 */ val ClientP2PConnectionFailInfo: typingsJapgolly.steamClient.mod.EMsg.ClientP2PConnectionFailInfo & Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionInfo
    extends StObject
       with EMsg
  /* 5434 */ val ClientP2PConnectionInfo: typingsJapgolly.steamClient.mod.EMsg.ClientP2PConnectionInfo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientP2PIntroducerMessage
    extends StObject
       with EMsg
  /* 813 */ val ClientP2PIntroducerMessage: typingsJapgolly.steamClient.mod.EMsg.ClientP2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest
    extends StObject
       with EMsg
  /* 8905 */ val ClientPICSAccessTokenRequest: typingsJapgolly.steamClient.mod.EMsg.ClientPICSAccessTokenRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse
    extends StObject
       with EMsg
  /* 8906 */ val ClientPICSAccessTokenResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPICSAccessTokenResponse & Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest
    extends StObject
       with EMsg
  /* 8901 */ val ClientPICSChangesSinceRequest: typingsJapgolly.steamClient.mod.EMsg.ClientPICSChangesSinceRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse
    extends StObject
       with EMsg
  /* 8902 */ val ClientPICSChangesSinceResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPICSChangesSinceResponse & Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoRequest
    extends StObject
       with EMsg
  /* 8903 */ val ClientPICSProductInfoRequest: typingsJapgolly.steamClient.mod.EMsg.ClientPICSProductInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoResponse
    extends StObject
       with EMsg
  /* 8904 */ val ClientPICSProductInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPICSProductInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientPackageInfoRequest
    extends StObject
       with EMsg
  /* 833 */ val ClientPackageInfoRequest: typingsJapgolly.steamClient.mod.EMsg.ClientPackageInfoRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse
    extends StObject
       with EMsg
  /* 834 */ val ClientPackageInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPackageInfoResponse & Double = js.native
  
  @js.native
  sealed trait ClientPackageVersions
    extends StObject
       with EMsg
  /* 148 */ val ClientPackageVersions: typingsJapgolly.steamClient.mod.EMsg.ClientPackageVersions & Double = js.native
  
  @js.native
  sealed trait ClientPasswordChange3
    extends StObject
       with EMsg
  /* 5457 */ val ClientPasswordChange3: typingsJapgolly.steamClient.mod.EMsg.ClientPasswordChange3 & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPasswordChangeResponse
    extends StObject
       with EMsg
  /* 805 */ val ClientPasswordChangeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPasswordChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientPersonaChangeResponse
    extends StObject
       with EMsg
  /* 5584 */ val ClientPersonaChangeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPersonaChangeResponse & Double = js.native
  
  @js.native
  sealed trait ClientPersonaState
    extends StObject
       with EMsg
  /* 766 */ val ClientPersonaState: typingsJapgolly.steamClient.mod.EMsg.ClientPersonaState & Double = js.native
  
  @js.native
  sealed trait ClientPersonalQAChange3
    extends StObject
       with EMsg
  /* 5459 */ val ClientPersonalQAChange3: typingsJapgolly.steamClient.mod.EMsg.ClientPersonalQAChange3 & Double = js.native
  
  @js.native
  sealed trait ClientPing
    extends StObject
       with EMsg
  /* 764 */ val ClientPing: typingsJapgolly.steamClient.mod.EMsg.ClientPing & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPingResponse
    extends StObject
       with EMsg
  /* 712 */ val ClientPingResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPingResponse & Double = js.native
  
  @js.native
  sealed trait ClientPlayerNicknameList
    extends StObject
       with EMsg
  /* 5587 */ val ClientPlayerNicknameList: typingsJapgolly.steamClient.mod.EMsg.ClientPlayerNicknameList & Double = js.native
  
  @js.native
  sealed trait ClientPlayingSessionState
    extends StObject
       with EMsg
  /* 9600 */ val ClientPlayingSessionState: typingsJapgolly.steamClient.mod.EMsg.ClientPlayingSessionState & Double = js.native
  
  @js.native
  sealed trait ClientPurchaseResponse
    extends StObject
       with EMsg
  /* 763 */ val ClientPurchaseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientPurchaseResponse & Double = js.native
  
  @js.native
  sealed trait ClientPurchaseWithMachineID
    extends StObject
       with EMsg
  /* 746 */ val ClientPurchaseWithMachineID: typingsJapgolly.steamClient.mod.EMsg.ClientPurchaseWithMachineID & Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuth
    extends StObject
       with EMsg
  /* 5539 */ val ClientReadMachineAuth: typingsJapgolly.steamClient.mod.EMsg.ClientReadMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuthResponse
    extends StObject
       with EMsg
  /* 5540 */ val ClientReadMachineAuthResponse: typingsJapgolly.steamClient.mod.EMsg.ClientReadMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPass
    extends StObject
       with EMsg
  /* 741 */ val ClientRedeemGuestPass: typingsJapgolly.steamClient.mod.EMsg.ClientRedeemGuestPass & Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse
    extends StObject
       with EMsg
  /* 797 */ val ClientRedeemGuestPassResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRedeemGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM
    extends StObject
       with EMsg
  /* 5502 */ val ClientRegisterAuthTicketWithCM: typingsJapgolly.steamClient.mod.EMsg.ClientRegisterAuthTicketWithCM & Double = js.native
  
  @js.native
  sealed trait ClientRegisterKey
    extends StObject
       with EMsg
  /* 743 */ val ClientRegisterKey: typingsJapgolly.steamClient.mod.EMsg.ClientRegisterKey & Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachine
    extends StObject
       with EMsg
  /* 5469 */ val ClientRegisterOEMMachine: typingsJapgolly.steamClient.mod.EMsg.ClientRegisterOEMMachine & Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse
    extends StObject
       with EMsg
  /* 5470 */ val ClientRegisterOEMMachineResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRegisterOEMMachineResponse & Double = js.native
  
  @js.native
  sealed trait ClientRemoveFriend
    extends StObject
       with EMsg
  /* 714 */ val ClientRemoveFriend: typingsJapgolly.steamClient.mod.EMsg.ClientRemoveFriend & Double = js.native
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure
    extends StObject
       with EMsg
  /* 5517 */ val ClientReportOverlayDetourFailure: typingsJapgolly.steamClient.mod.EMsg.ClientReportOverlayDetourFailure & Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountData
    extends StObject
       with EMsg
  /* 5549 */ val ClientRequestAccountData: typingsJapgolly.steamClient.mod.EMsg.ClientRequestAccountData & Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountDataResponse
    extends StObject
       with EMsg
  /* 5550 */ val ClientRequestAccountDataResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestAccountDataResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestAuthList
    extends StObject
       with EMsg
  /* 5431 */ val ClientRequestAuthList: typingsJapgolly.steamClient.mod.EMsg.ClientRequestAuthList & Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMail
    extends StObject
       with EMsg
  /* 5454 */ val ClientRequestChangeMail: typingsJapgolly.steamClient.mod.EMsg.ClientRequestChangeMail & Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMailResponse
    extends StObject
       with EMsg
  /* 5455 */ val ClientRequestChangeMailResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestChangeMailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestCommentNotifications
    extends StObject
       with EMsg
  /* 5583 */ val ClientRequestCommentNotifications: typingsJapgolly.steamClient.mod.EMsg.ClientRequestCommentNotifications & Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket
    extends StObject
       with EMsg
  /* 5526 */ val ClientRequestEncryptedAppTicket: typingsJapgolly.steamClient.mod.EMsg.ClientRequestEncryptedAppTicket & Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse
    extends StObject
       with EMsg
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestEncryptedAppTicketResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail
    extends StObject
       with EMsg
  /* 5401 */ val ClientRequestForgottenPasswordEmail: typingsJapgolly.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmail & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3
    extends StObject
       with EMsg
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: typingsJapgolly.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmail3 & Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse
    extends StObject
       with EMsg
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicense
    extends StObject
       with EMsg
  /* 5572 */ val ClientRequestFreeLicense: typingsJapgolly.steamClient.mod.EMsg.ClientRequestFreeLicense & Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse
    extends StObject
       with EMsg
  /* 5573 */ val ClientRequestFreeLicenseResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestFreeLicenseResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendData
    extends StObject
       with EMsg
  /* 815 */ val ClientRequestFriendData: typingsJapgolly.steamClient.mod.EMsg.ClientRequestFriendData & Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendship
    extends StObject
       with EMsg
  /* 554 */ val ClientRequestFriendship: typingsJapgolly.steamClient.mod.EMsg.ClientRequestFriendship & Double = js.native
  
  @js.native
  sealed trait ClientRequestItemAnnouncements
    extends StObject
       with EMsg
  /* 5577 */ val ClientRequestItemAnnouncements: typingsJapgolly.steamClient.mod.EMsg.ClientRequestItemAnnouncements & Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuth
    extends StObject
       with EMsg
  /* 5541 */ val ClientRequestMachineAuth: typingsJapgolly.steamClient.mod.EMsg.ClientRequestMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse
    extends StObject
       with EMsg
  /* 5542 */ val ClientRequestMachineAuthResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestOAuthTokenForApp
    extends StObject
       with EMsg
  /* 5590 */ val ClientRequestOAuthTokenForApp: typingsJapgolly.steamClient.mod.EMsg.ClientRequestOAuthTokenForApp & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse
    extends StObject
       with EMsg
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestOAuthTokenForAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMail
    extends StObject
       with EMsg
  /* 5448 */ val ClientRequestValidationMail: typingsJapgolly.steamClient.mod.EMsg.ClientRequestValidationMail & Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMailResponse
    extends StObject
       with EMsg
  /* 5449 */ val ClientRequestValidationMailResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestValidationMailResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce
    extends StObject
       with EMsg
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: typingsJapgolly.steamClient.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonce & Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse
    extends StObject
       with EMsg
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: typingsJapgolly.steamClient.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse & Double = js.native
  
  @js.native
  sealed trait ClientRequestedClientStats
    extends StObject
       with EMsg
  /* 5480 */ val ClientRequestedClientStats: typingsJapgolly.steamClient.mod.EMsg.ClientRequestedClientStats & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword
    extends StObject
       with EMsg
  /* 5404 */ val ClientResetForgottenPassword: typingsJapgolly.steamClient.mod.EMsg.ClientResetForgottenPassword & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword3
    extends StObject
       with EMsg
  /* 5460 */ val ClientResetForgottenPassword3: typingsJapgolly.steamClient.mod.EMsg.ClientResetForgottenPassword3 & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword4
    extends StObject
       with EMsg
  /* 5551 */ val ClientResetForgottenPassword4: typingsJapgolly.steamClient.mod.EMsg.ClientResetForgottenPassword4 & Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse
    extends StObject
       with EMsg
  /* 5405 */ val ClientResetForgottenPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientResetForgottenPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientResetPassword
    extends StObject
       with EMsg
  /* 846 */ val ClientResetPassword: typingsJapgolly.steamClient.mod.EMsg.ClientResetPassword & Double = js.native
  
  @js.native
  sealed trait ClientResetPasswordResponse
    extends StObject
       with EMsg
  /* 849 */ val ClientResetPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientResetPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceInfo
    extends StObject
       with EMsg
  /* 7503 */ val ClientRichPresenceInfo: typingsJapgolly.steamClient.mod.EMsg.ClientRichPresenceInfo & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceRequest
    extends StObject
       with EMsg
  /* 7502 */ val ClientRichPresenceRequest: typingsJapgolly.steamClient.mod.EMsg.ClientRichPresenceRequest & Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceUpload
    extends StObject
       with EMsg
  /* 7501 */ val ClientRichPresenceUpload: typingsJapgolly.steamClient.mod.EMsg.ClientRichPresenceUpload & Double = js.native
  
  @js.native
  sealed trait ClientScreenshotsChanged
    extends StObject
       with EMsg
  /* 5543 */ val ClientScreenshotsChanged: typingsJapgolly.steamClient.mod.EMsg.ClientScreenshotsChanged & Double = js.native
  
  @js.native
  sealed trait ClientSecretQAChangeResponse
    extends StObject
       with EMsg
  /* 892 */ val ClientSecretQAChangeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientSecretQAChangeResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSendGuestPass
    extends StObject
       with EMsg
  /* 739 */ val ClientSendGuestPass: typingsJapgolly.steamClient.mod.EMsg.ClientSendGuestPass & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse
    extends StObject
       with EMsg
  /* 795 */ val ClientSendGuestPassResponse: typingsJapgolly.steamClient.mod.EMsg.ClientSendGuestPassResponse & Double = js.native
  
  @js.native
  sealed trait ClientSentLogs
    extends StObject
       with EMsg
  /* 5558 */ val ClientSentLogs: typingsJapgolly.steamClient.mod.EMsg.ClientSentLogs & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientServerList
    extends StObject
       with EMsg
  /* 880 */ val ClientServerList: typingsJapgolly.steamClient.mod.EMsg.ClientServerList & Double = js.native
  
  @js.native
  sealed trait ClientServerUnavailable
    extends StObject
       with EMsg
  /* 5500 */ val ClientServerUnavailable: typingsJapgolly.steamClient.mod.EMsg.ClientServerUnavailable & Double = js.native
  
  @js.native
  sealed trait ClientServersAvailable
    extends StObject
       with EMsg
  /* 5501 */ val ClientServersAvailable: typingsJapgolly.steamClient.mod.EMsg.ClientServersAvailable & Double = js.native
  
  @js.native
  sealed trait ClientServiceCall
    extends StObject
       with EMsg
  /* 831 */ val ClientServiceCall: typingsJapgolly.steamClient.mod.EMsg.ClientServiceCall & Double = js.native
  
  @js.native
  sealed trait ClientServiceCallResponse
    extends StObject
       with EMsg
  /* 832 */ val ClientServiceCallResponse: typingsJapgolly.steamClient.mod.EMsg.ClientServiceCallResponse & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethod
    extends StObject
       with EMsg
  /* 5594 */ val ClientServiceMethod: typingsJapgolly.steamClient.mod.EMsg.ClientServiceMethod & Double = js.native
  
  @js.native
  sealed trait ClientServiceMethodResponse
    extends StObject
       with EMsg
  /* 5595 */ val ClientServiceMethodResponse: typingsJapgolly.steamClient.mod.EMsg.ClientServiceMethodResponse & Double = js.native
  
  @js.native
  sealed trait ClientServiceModule
    extends StObject
       with EMsg
  /* 830 */ val ClientServiceModule: typingsJapgolly.steamClient.mod.EMsg.ClientServiceModule & Double = js.native
  
  @js.native
  sealed trait ClientSessionEnd
    extends StObject
       with EMsg
  /* 136 */ val ClientSessionEnd: typingsJapgolly.steamClient.mod.EMsg.ClientSessionEnd & Double = js.native
  
  @js.native
  sealed trait ClientSessionStart
    extends StObject
       with EMsg
  /* 135 */ val ClientSessionStart: typingsJapgolly.steamClient.mod.EMsg.ClientSessionStart & Double = js.native
  
  @js.native
  sealed trait ClientSessionToken
    extends StObject
       with EMsg
  /* 850 */ val ClientSessionToken: typingsJapgolly.steamClient.mod.EMsg.ClientSessionToken & Double = js.native
  
  // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdate
    extends StObject
       with EMsg
  /* 137 */ val ClientSessionUpdate: typingsJapgolly.steamClient.mod.EMsg.ClientSessionUpdate & Double = js.native
  
  @js.native
  sealed trait ClientSessionUpdateAuthTicket
    extends StObject
       with EMsg
  /* 137 */ val ClientSessionUpdateAuthTicket: typingsJapgolly.steamClient.mod.EMsg.ClientSessionUpdateAuthTicket & Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateState
    extends StObject
       with EMsg
  /* 5524 */ val ClientSetClientAppUpdateState: typingsJapgolly.steamClient.mod.EMsg.ClientSetClientAppUpdateState & Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse
    extends StObject
       with EMsg
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: typingsJapgolly.steamClient.mod.EMsg.ClientSetClientAppUpdateStateResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSetHeartbeatRate
    extends StObject
       with EMsg
  /* 755 */ val ClientSetHeartbeatRate: typingsJapgolly.steamClient.mod.EMsg.ClientSetHeartbeatRate & Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriend
    extends StObject
       with EMsg
  /* 855 */ val ClientSetIgnoreFriend: typingsJapgolly.steamClient.mod.EMsg.ClientSetIgnoreFriend & Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse
    extends StObject
       with EMsg
  /* 856 */ val ClientSetIgnoreFriendResponse: typingsJapgolly.steamClient.mod.EMsg.ClientSetIgnoreFriendResponse & Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryBase
    extends StObject
       with EMsg
  /* 9400 */ val ClientSharedLibraryBase: typingsJapgolly.steamClient.mod.EMsg.ClientSharedLibraryBase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSharedLibraryLockStatus
    extends StObject
       with EMsg
  /* 9405 */ val ClientSharedLibraryLockStatus: typingsJapgolly.steamClient.mod.EMsg.ClientSharedLibraryLockStatus & Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying
    extends StObject
       with EMsg
  /* 9406 */ val ClientSharedLibraryStopPlaying: typingsJapgolly.steamClient.mod.EMsg.ClientSharedLibraryStopPlaying & Double = js.native
  
  @js.native
  sealed trait ClientSharedLicensesLockStatus
    extends StObject
       with EMsg
  /* 9403 */ val ClientSharedLicensesLockStatus: typingsJapgolly.steamClient.mod.EMsg.ClientSharedLicensesLockStatus & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying
    extends StObject
       with EMsg
  /* 9404 */ val ClientSharedLicensesStopPlaying: typingsJapgolly.steamClient.mod.EMsg.ClientSharedLicensesStopPlaying & Double = js.native
  
  @js.native
  sealed trait ClientStat
    extends StObject
       with EMsg
  /* 5433 */ val ClientStat: typingsJapgolly.steamClient.mod.EMsg.ClientStat & Double = js.native
  
  @js.native
  sealed trait ClientStat2
    extends StObject
       with EMsg
  /* 5482 */ val ClientStat2: typingsJapgolly.steamClient.mod.EMsg.ClientStat2 & Double = js.native
  
  @js.native
  sealed trait ClientStat2Int32
    extends StObject
       with EMsg
  /* 5481 */ val ClientStat2Int32: typingsJapgolly.steamClient.mod.EMsg.ClientStat2Int32 & Double = js.native
  
  @js.native
  sealed trait ClientStatsUpdated
    extends StObject
       with EMsg
  /* 5467 */ val ClientStatsUpdated: typingsJapgolly.steamClient.mod.EMsg.ClientStatsUpdated & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSteamUsageEvent
    extends StObject
       with EMsg
  /* 842 */ val ClientSteamUsageEvent: typingsJapgolly.steamClient.mod.EMsg.ClientSteamUsageEvent & Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStats
    extends StObject
       with EMsg
  /* 820 */ val ClientStoreUserStats: typingsJapgolly.steamClient.mod.EMsg.ClientStoreUserStats & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientStoreUserStats2
    extends StObject
       with EMsg
  /* 5466 */ val ClientStoreUserStats2: typingsJapgolly.steamClient.mod.EMsg.ClientStoreUserStats2 & Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStatsResponse
    extends StObject
       with EMsg
  /* 821 */ val ClientStoreUserStatsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientStoreUserStatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed
    extends StObject
       with EMsg
  /* 5512 */ val ClientSubscribeToPersonaFeed: typingsJapgolly.steamClient.mod.EMsg.ClientSubscribeToPersonaFeed & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSystemIM
    extends StObject
       with EMsg
  /* 726 */ val ClientSystemIM: typingsJapgolly.steamClient.mod.EMsg.ClientSystemIM & Double = js.native
  
  @js.native
  sealed trait ClientSystemIMAck
    extends StObject
       with EMsg
  /* 727 */ val ClientSystemIMAck: typingsJapgolly.steamClient.mod.EMsg.ClientSystemIMAck & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientTicketAuthComplete
    extends StObject
       with EMsg
  /* 5429 */ val ClientTicketAuthComplete: typingsJapgolly.steamClient.mod.EMsg.ClientTicketAuthComplete & Double = js.native
  
  @js.native
  sealed trait ClientToGC
    extends StObject
       with EMsg
  /* 5452 */ val ClientToGC: typingsJapgolly.steamClient.mod.EMsg.ClientToGC & Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshot
    extends StObject
       with EMsg
  /* 7301 */ val ClientUCMAddScreenshot: typingsJapgolly.steamClient.mod.EMsg.ClientUCMAddScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse
    extends StObject
       with EMsg
  /* 7302 */ val ClientUCMAddScreenshotResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMAddScreenshotResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMDeletePublishedFile
    extends StObject
       with EMsg
  /* 7315 */ val ClientUCMDeletePublishedFile: typingsJapgolly.steamClient.mod.EMsg.ClientUCMDeletePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse
    extends StObject
       with EMsg
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMDeletePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot
    extends StObject
       with EMsg
  /* 7309 */ val ClientUCMDeleteScreenshot: typingsJapgolly.steamClient.mod.EMsg.ClientUCMDeleteScreenshot & Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse
    extends StObject
       with EMsg
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMDeleteScreenshotResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction
    extends StObject
       with EMsg
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserAction & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse
    extends StObject
       with EMsg
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles
    extends StObject
       with EMsg
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserPublishedFiles & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse
    extends StObject
       with EMsg
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserPublishedFilesResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles
    extends StObject
       with EMsg
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFiles & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse
    extends StObject
       with EMsg
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates
    extends StObject
       with EMsg
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdates & Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse
    extends StObject
       with EMsg
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails
    extends StObject
       with EMsg
  /* 7313 */ val ClientUCMGetPublishedFileDetails: typingsJapgolly.steamClient.mod.EMsg.ClientUCMGetPublishedFileDetails & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse
    extends StObject
       with EMsg
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMGetPublishedFileDetailsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser
    extends StObject
       with EMsg
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: typingsJapgolly.steamClient.mod.EMsg.ClientUCMGetPublishedFilesForUser & Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse
    extends StObject
       with EMsg
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMGetPublishedFilesForUserResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFile
    extends StObject
       with EMsg
  /* 7311 */ val ClientUCMPublishFile: typingsJapgolly.steamClient.mod.EMsg.ClientUCMPublishFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFileResponse
    extends StObject
       with EMsg
  /* 7312 */ val ClientUCMPublishFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMPublishFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted
    extends StObject
       with EMsg
  /* 7368 */ val ClientUCMPublishedFileDeleted: typingsJapgolly.steamClient.mod.EMsg.ClientUCMPublishedFileDeleted & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed
    extends StObject
       with EMsg
  /* 7347 */ val ClientUCMPublishedFileSubscribed: typingsJapgolly.steamClient.mod.EMsg.ClientUCMPublishedFileSubscribed & Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed
    extends StObject
       with EMsg
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: typingsJapgolly.steamClient.mod.EMsg.ClientUCMPublishedFileUnsubscribed & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction
    extends StObject
       with EMsg
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: typingsJapgolly.steamClient.mod.EMsg.ClientUCMSetUserPublishedFileAction & Double = js.native
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse
    extends StObject
       with EMsg
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMSetUserPublishedFileActionResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMSubscribePublishedFile
    extends StObject
       with EMsg
  /* 7319 */ val ClientUCMSubscribePublishedFile: typingsJapgolly.steamClient.mod.EMsg.ClientUCMSubscribePublishedFile & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse
    extends StObject
       with EMsg
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMSubscribePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile
    extends StObject
       with EMsg
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: typingsJapgolly.steamClient.mod.EMsg.ClientUCMUnsubscribePublishedFile & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse
    extends StObject
       with EMsg
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMUnsubscribePublishedFileResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMUpdatePublishedFile
    extends StObject
       with EMsg
  /* 7325 */ val ClientUCMUpdatePublishedFile: typingsJapgolly.steamClient.mod.EMsg.ClientUCMUpdatePublishedFile & Double = js.native
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse
    extends StObject
       with EMsg
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUCMUpdatePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUDSInviteToGame
    extends StObject
       with EMsg
  /* 7005 */ val ClientUDSInviteToGame: typingsJapgolly.steamClient.mod.EMsg.ClientUDSInviteToGame & Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded
    extends StObject
       with EMsg
  /* 7002 */ val ClientUDSP2PSessionEnded: typingsJapgolly.steamClient.mod.EMsg.ClientUDSP2PSessionEnded & Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted
    extends StObject
       with EMsg
  /* 7001 */ val ClientUDSP2PSessionStarted: typingsJapgolly.steamClient.mod.EMsg.ClientUDSP2PSessionStarted & Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest
    extends StObject
       with EMsg
  /* 5219 */ val ClientUFSDeleteFileRequest: typingsJapgolly.steamClient.mod.EMsg.ClientUFSDeleteFileRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse
    extends StObject
       with EMsg
  /* 5220 */ val ClientUFSDeleteFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSDeleteFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadChunk
    extends StObject
       with EMsg
  /* 5212 */ val ClientUFSDownloadChunk: typingsJapgolly.steamClient.mod.EMsg.ClientUFSDownloadChunk & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadRequest
    extends StObject
       with EMsg
  /* 5210 */ val ClientUFSDownloadRequest: typingsJapgolly.steamClient.mod.EMsg.ClientUFSDownloadRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadResponse
    extends StObject
       with EMsg
  /* 5211 */ val ClientUFSDownloadResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSDownloadResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForApp
    extends StObject
       with EMsg
  /* 5206 */ val ClientUFSGetFileListForApp: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetFileListForApp & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse
    extends StObject
       with EMsg
  /* 5207 */ val ClientUFSGetFileListForAppResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetFileListForAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo
    extends StObject
       with EMsg
  /* 5230 */ val ClientUFSGetSingleFileInfo: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetSingleFileInfo & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse
    extends StObject
       with EMsg
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetSingleFileInfoResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUFSGetUGCDetails
    extends StObject
       with EMsg
  /* 5226 */ val ClientUFSGetUGCDetails: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetUGCDetails & Double = js.native
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse
    extends StObject
       with EMsg
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSGetUGCDetailsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginRequest
    extends StObject
       with EMsg
  /* 5213 */ val ClientUFSLoginRequest: typingsJapgolly.steamClient.mod.EMsg.ClientUFSLoginRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginResponse
    extends StObject
       with EMsg
  /* 5214 */ val ClientUFSLoginResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSLoginResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFile
    extends StObject
       with EMsg
  /* 5232 */ val ClientUFSShareFile: typingsJapgolly.steamClient.mod.EMsg.ClientUFSShareFile & Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFileResponse
    extends StObject
       with EMsg
  /* 5233 */ val ClientUFSShareFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSShareFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat
    extends StObject
       with EMsg
  /* 5216 */ val ClientUFSTransferHeartbeat: typingsJapgolly.steamClient.mod.EMsg.ClientUFSTransferHeartbeat & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileChunk
    extends StObject
       with EMsg
  /* 5204 */ val ClientUFSUploadFileChunk: typingsJapgolly.steamClient.mod.EMsg.ClientUFSUploadFileChunk & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileFinished
    extends StObject
       with EMsg
  /* 5205 */ val ClientUFSUploadFileFinished: typingsJapgolly.steamClient.mod.EMsg.ClientUFSUploadFileFinished & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileRequest
    extends StObject
       with EMsg
  /* 5202 */ val ClientUFSUploadFileRequest: typingsJapgolly.steamClient.mod.EMsg.ClientUFSUploadFileRequest & Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileResponse
    extends StObject
       with EMsg
  /* 5203 */ val ClientUFSUploadFileResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUFSUploadFileResponse & Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStats
    extends StObject
       with EMsg
  /* 7901 */ val ClientUGSGetGlobalStats: typingsJapgolly.steamClient.mod.EMsg.ClientUGSGetGlobalStats & Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse
    extends StObject
       with EMsg
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUGSGetGlobalStatsResponse & Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientApp
    extends StObject
       with EMsg
  /* 5522 */ val ClientUninstallClientApp: typingsJapgolly.steamClient.mod.EMsg.ClientUninstallClientApp & Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientAppResponse
    extends StObject
       with EMsg
  /* 5523 */ val ClientUninstallClientAppResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUninstallClientAppResponse & Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreaming
    extends StObject
       with EMsg
  /* 9507 */ val ClientUnlockStreaming: typingsJapgolly.steamClient.mod.EMsg.ClientUnlockStreaming & Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreamingResponse
    extends StObject
       with EMsg
  /* 9508 */ val ClientUnlockStreamingResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUnlockStreamingResponse & Double = js.native
  
  @js.native
  sealed trait ClientUpdateChatMetadata
    extends StObject
       with EMsg
  /* 811 */ val ClientUpdateChatMetadata: typingsJapgolly.steamClient.mod.EMsg.ClientUpdateChatMetadata & Double = js.native
  
  @js.native
  sealed trait ClientUpdateGuestPassesList
    extends StObject
       with EMsg
  /* 798 */ val ClientUpdateGuestPassesList: typingsJapgolly.steamClient.mod.EMsg.ClientUpdateGuestPassesList & Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuth
    extends StObject
       with EMsg
  /* 5537 */ val ClientUpdateMachineAuth: typingsJapgolly.steamClient.mod.EMsg.ClientUpdateMachineAuth & Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse
    extends StObject
       with EMsg
  /* 5538 */ val ClientUpdateMachineAuthResponse: typingsJapgolly.steamClient.mod.EMsg.ClientUpdateMachineAuthResponse & Double = js.native
  
  @js.native
  sealed trait ClientUpdateUserGameInfo
    extends StObject
       with EMsg
  /* 5411 */ val ClientUpdateUserGameInfo: typingsJapgolly.steamClient.mod.EMsg.ClientUpdateUserGameInfo & Double = js.native
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations
    extends StObject
       with EMsg
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: typingsJapgolly.steamClient.mod.EMsg.ClientUseLocalDeviceAuthorizations & Double = js.native
  
  @js.native
  sealed trait ClientUserNotifications
    extends StObject
       with EMsg
  /* 5599 */ val ClientUserNotifications: typingsJapgolly.steamClient.mod.EMsg.ClientUserNotifications & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientVACBanStatus
    extends StObject
       with EMsg
  /* 782 */ val ClientVACBanStatus: typingsJapgolly.steamClient.mod.EMsg.ClientVACBanStatus & Double = js.native
  
  @js.native
  sealed trait ClientVACChallenge
    extends StObject
       with EMsg
  /* 753 */ val ClientVACChallenge: typingsJapgolly.steamClient.mod.EMsg.ClientVACChallenge & Double = js.native
  
  @js.native
  sealed trait ClientVACResponse
    extends StObject
       with EMsg
  /* 704 */ val ClientVACResponse: typingsJapgolly.steamClient.mod.EMsg.ClientVACResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientVTTCert
    extends StObject
       with EMsg
  /* 863 */ val ClientVTTCert: typingsJapgolly.steamClient.mod.EMsg.ClientVTTCert & Double = js.native
  
  @js.native
  sealed trait ClientVacStatusQuery
    extends StObject
       with EMsg
  /* 770 */ val ClientVacStatusQuery: typingsJapgolly.steamClient.mod.EMsg.ClientVacStatusQuery & Double = js.native
  
  @js.native
  sealed trait ClientVacStatusResponse
    extends StObject
       with EMsg
  /* 717 */ val ClientVacStatusResponse: typingsJapgolly.steamClient.mod.EMsg.ClientVacStatusResponse & Double = js.native
  
  @js.native
  sealed trait ClientVanityURLChangedNotification
    extends StObject
       with EMsg
  /* 5598 */ val ClientVanityURLChangedNotification: typingsJapgolly.steamClient.mod.EMsg.ClientVanityURLChangedNotification & Double = js.native
  
  @js.native
  sealed trait ClientVerifyPassword
    extends StObject
       with EMsg
  /* 5483 */ val ClientVerifyPassword: typingsJapgolly.steamClient.mod.EMsg.ClientVerifyPassword & Double = js.native
  
  @js.native
  sealed trait ClientVerifyPasswordResponse
    extends StObject
       with EMsg
  /* 5484 */ val ClientVerifyPasswordResponse: typingsJapgolly.steamClient.mod.EMsg.ClientVerifyPasswordResponse & Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize
    extends StObject
       with EMsg
  /* 9800 */ val ClientVoiceCallPreAuthorize: typingsJapgolly.steamClient.mod.EMsg.ClientVoiceCallPreAuthorize & Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse
    extends StObject
       with EMsg
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: typingsJapgolly.steamClient.mod.EMsg.ClientVoiceCallPreAuthorizeResponse & Double = js.native
  
  @js.native
  sealed trait ClientWalletInfoUpdate
    extends StObject
       with EMsg
  /* 5528 */ val ClientWalletInfoUpdate: typingsJapgolly.steamClient.mod.EMsg.ClientWalletInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest
    extends StObject
       with EMsg
  /* 7382 */ val ClientWorkshopItemChangesRequest: typingsJapgolly.steamClient.mod.EMsg.ClientWorkshopItemChangesRequest & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse
    extends StObject
       with EMsg
  /* 7383 */ val ClientWorkshopItemChangesResponse: typingsJapgolly.steamClient.mod.EMsg.ClientWorkshopItemChangesResponse & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest
    extends StObject
       with EMsg
  /* 7384 */ val ClientWorkshopItemInfoRequest: typingsJapgolly.steamClient.mod.EMsg.ClientWorkshopItemInfoRequest & Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse
    extends StObject
       with EMsg
  /* 7385 */ val ClientWorkshopItemInfoResponse: typingsJapgolly.steamClient.mod.EMsg.ClientWorkshopItemInfoResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CommunityAddFriendNews
    extends StObject
       with EMsg
  /* 4140 */ val CommunityAddFriendNews: typingsJapgolly.steamClient.mod.EMsg.CommunityAddFriendNews & Double = js.native
  
  // obsolete
  @js.native
  sealed trait CommunityDeleteUserNews
    extends StObject
       with EMsg
  /* 4155 */ val CommunityDeleteUserNews: typingsJapgolly.steamClient.mod.EMsg.CommunityDeleteUserNews & Double = js.native
  
  @js.native
  sealed trait CommunityGetUserFriendNews
    extends StObject
       with EMsg
  /* 4173 */ val CommunityGetUserFriendNews: typingsJapgolly.steamClient.mod.EMsg.CommunityGetUserFriendNews & Double = js.native
  
  @js.native
  sealed trait ContentDescriptionUpdate
    extends StObject
       with EMsg
  /* 227 */ val ContentDescriptionUpdate: typingsJapgolly.steamClient.mod.EMsg.ContentDescriptionUpdate & Double = js.native
  
  @js.native
  sealed trait DFSAcceptedResponse
    extends StObject
       with EMsg
  /* 5611 */ val DFSAcceptedResponse: typingsJapgolly.steamClient.mod.EMsg.DFSAcceptedResponse & Double = js.native
  
  @js.native
  sealed trait DFSConnection
    extends StObject
       with EMsg
  /* 5603 */ val DFSConnection: typingsJapgolly.steamClient.mod.EMsg.DFSConnection & Double = js.native
  
  @js.native
  sealed trait DFSConnectionReply
    extends StObject
       with EMsg
  /* 5604 */ val DFSConnectionReply: typingsJapgolly.steamClient.mod.EMsg.DFSConnectionReply & Double = js.native
  
  @js.native
  sealed trait DFSGetFile
    extends StObject
       with EMsg
  /* 5601 */ val DFSGetFile: typingsJapgolly.steamClient.mod.EMsg.DFSGetFile & Double = js.native
  
  @js.native
  sealed trait DFSGetFileFromServer
    extends StObject
       with EMsg
  /* 5610 */ val DFSGetFileFromServer: typingsJapgolly.steamClient.mod.EMsg.DFSGetFileFromServer & Double = js.native
  
  @js.native
  sealed trait DFSInstallLocalFile
    extends StObject
       with EMsg
  /* 5602 */ val DFSInstallLocalFile: typingsJapgolly.steamClient.mod.EMsg.DFSInstallLocalFile & Double = js.native
  
  @js.native
  sealed trait DFSPurgeFile
    extends StObject
       with EMsg
  /* 5608 */ val DFSPurgeFile: typingsJapgolly.steamClient.mod.EMsg.DFSPurgeFile & Double = js.native
  
  @js.native
  sealed trait DFSRecvTransmitFile
    extends StObject
       with EMsg
  /* 5613 */ val DFSRecvTransmitFile: typingsJapgolly.steamClient.mod.EMsg.DFSRecvTransmitFile & Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback
    extends StObject
       with EMsg
  /* 5612 */ val DFSRequestPingback: typingsJapgolly.steamClient.mod.EMsg.DFSRequestPingback & Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback2
    extends StObject
       with EMsg
  /* 5615 */ val DFSRequestPingback2: typingsJapgolly.steamClient.mod.EMsg.DFSRequestPingback2 & Double = js.native
  
  @js.native
  sealed trait DFSResponsePingback2
    extends StObject
       with EMsg
  /* 5616 */ val DFSResponsePingback2: typingsJapgolly.steamClient.mod.EMsg.DFSResponsePingback2 & Double = js.native
  
  @js.native
  sealed trait DFSRouteFile
    extends StObject
       with EMsg
  /* 5609 */ val DFSRouteFile: typingsJapgolly.steamClient.mod.EMsg.DFSRouteFile & Double = js.native
  
  @js.native
  sealed trait DFSRouteFileResponse
    extends StObject
       with EMsg
  /* 5620 */ val DFSRouteFileResponse: typingsJapgolly.steamClient.mod.EMsg.DFSRouteFileResponse & Double = js.native
  
  @js.native
  sealed trait DFSSendTransmitFile
    extends StObject
       with EMsg
  /* 5614 */ val DFSSendTransmitFile: typingsJapgolly.steamClient.mod.EMsg.DFSSendTransmitFile & Double = js.native
  
  @js.native
  sealed trait DFSStartTransfer
    extends StObject
       with EMsg
  /* 5618 */ val DFSStartTransfer: typingsJapgolly.steamClient.mod.EMsg.DFSStartTransfer & Double = js.native
  
  @js.native
  sealed trait DFSTransferComplete
    extends StObject
       with EMsg
  /* 5619 */ val DFSTransferComplete: typingsJapgolly.steamClient.mod.EMsg.DFSTransferComplete & Double = js.native
  
  @js.native
  sealed trait DPAccountCreationStats
    extends StObject
       with EMsg
  /* 1614 */ val DPAccountCreationStats: typingsJapgolly.steamClient.mod.EMsg.DPAccountCreationStats & Double = js.native
  
  @js.native
  sealed trait DPAchievementStats
    extends StObject
       with EMsg
  /* 1613 */ val DPAchievementStats: typingsJapgolly.steamClient.mod.EMsg.DPAchievementStats & Double = js.native
  
  @js.native
  sealed trait DPBlockingStats
    extends StObject
       with EMsg
  /* 1607 */ val DPBlockingStats: typingsJapgolly.steamClient.mod.EMsg.DPBlockingStats & Double = js.native
  
  @js.native
  sealed trait DPCloudStats
    extends StObject
       with EMsg
  /* 1612 */ val DPCloudStats: typingsJapgolly.steamClient.mod.EMsg.DPCloudStats & Double = js.native
  
  @js.native
  sealed trait DPDownloadRateStatistics
    extends StObject
       with EMsg
  /* 1618 */ val DPDownloadRateStatistics: typingsJapgolly.steamClient.mod.EMsg.DPDownloadRateStatistics & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPFacebookStatistics
    extends StObject
       with EMsg
  /* 1619 */ val DPFacebookStatistics: typingsJapgolly.steamClient.mod.EMsg.DPFacebookStatistics & Double = js.native
  
  @js.native
  sealed trait DPGamePlayedStats
    extends StObject
       with EMsg
  /* 1602 */ val DPGamePlayedStats: typingsJapgolly.steamClient.mod.EMsg.DPGamePlayedStats & Double = js.native
  
  @js.native
  sealed trait DPGameServersPlayersStats
    extends StObject
       with EMsg
  /* 1617 */ val DPGameServersPlayersStats: typingsJapgolly.steamClient.mod.EMsg.DPGameServersPlayersStats & Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCount
    extends StObject
       with EMsg
  /* 1615 */ val DPGetPlayerCount: typingsJapgolly.steamClient.mod.EMsg.DPGetPlayerCount & Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCountResponse
    extends StObject
       with EMsg
  /* 1616 */ val DPGetPlayerCountResponse: typingsJapgolly.steamClient.mod.EMsg.DPGetPlayerCountResponse & Double = js.native
  
  @js.native
  sealed trait DPNatTraversalStats
    extends StObject
       with EMsg
  /* 1608 */ val DPNatTraversalStats: typingsJapgolly.steamClient.mod.EMsg.DPNatTraversalStats & Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxns
    extends StObject
       with EMsg
  /* 1628 */ val DPPartnerMicroTxns: typingsJapgolly.steamClient.mod.EMsg.DPPartnerMicroTxns & Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse
    extends StObject
       with EMsg
  /* 1629 */ val DPPartnerMicroTxnsResponse: typingsJapgolly.steamClient.mod.EMsg.DPPartnerMicroTxnsResponse & Double = js.native
  
  @js.native
  sealed trait DPSetPublishingState
    extends StObject
       with EMsg
  /* 1601 */ val DPSetPublishingState: typingsJapgolly.steamClient.mod.EMsg.DPSetPublishingState & Double = js.native
  
  @js.native
  sealed trait DPSteamUsageEvent
    extends StObject
       with EMsg
  /* 1609 */ val DPSteamUsageEvent: typingsJapgolly.steamClient.mod.EMsg.DPSteamUsageEvent & Double = js.native
  
  @js.native
  sealed trait DPStoreSaleStatistics
    extends StObject
       with EMsg
  /* 1624 */ val DPStoreSaleStatistics: typingsJapgolly.steamClient.mod.EMsg.DPStoreSaleStatistics & Double = js.native
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat
    extends StObject
       with EMsg
  /* 1604 */ val DPStreamingUniquePlayersStat: typingsJapgolly.steamClient.mod.EMsg.DPStreamingUniquePlayersStat & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPUniquePlayersStat
    extends StObject
       with EMsg
  /* 1603 */ val DPUniquePlayersStat: typingsJapgolly.steamClient.mod.EMsg.DPUniquePlayersStat & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPUpdateContentEvent
    extends StObject
       with EMsg
  /* 1626 */ val DPUpdateContentEvent: typingsJapgolly.steamClient.mod.EMsg.DPUpdateContentEvent & Double = js.native
  
  @js.native
  sealed trait DPVRUniquePlayersStat
    extends StObject
       with EMsg
  /* 1631 */ val DPVRUniquePlayersStat: typingsJapgolly.steamClient.mod.EMsg.DPVRUniquePlayersStat & Double = js.native
  
  @js.native
  sealed trait DPVacBanStats
    extends StObject
       with EMsg
  /* 1606 */ val DPVacBanStats: typingsJapgolly.steamClient.mod.EMsg.DPVacBanStats & Double = js.native
  
  @js.native
  sealed trait DPVacCafeBanStats
    extends StObject
       with EMsg
  /* 1611 */ val DPVacCafeBanStats: typingsJapgolly.steamClient.mod.EMsg.DPVacCafeBanStats & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPVacCertBanStats
    extends StObject
       with EMsg
  /* 1610 */ val DPVacCertBanStats: typingsJapgolly.steamClient.mod.EMsg.DPVacCertBanStats & Double = js.native
  
  @js.native
  sealed trait DPVacInfractionStats
    extends StObject
       with EMsg
  /* 1605 */ val DPVacInfractionStats: typingsJapgolly.steamClient.mod.EMsg.DPVacInfractionStats & Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdate
    extends StObject
       with EMsg
  /* 640 */ val DRMAdminUpdate: typingsJapgolly.steamClient.mod.EMsg.DRMAdminUpdate & Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdateResponse
    extends StObject
       with EMsg
  /* 641 */ val DRMAdminUpdateResponse: typingsJapgolly.steamClient.mod.EMsg.DRMAdminUpdateResponse & Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobRequest
    extends StObject
       with EMsg
  /* 628 */ val DRMBuildBlobRequest: typingsJapgolly.steamClient.mod.EMsg.DRMBuildBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobResponse
    extends StObject
       with EMsg
  /* 629 */ val DRMBuildBlobResponse: typingsJapgolly.steamClient.mod.EMsg.DRMBuildBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportRequest
    extends StObject
       with EMsg
  /* 637 */ val DRMDetailsReportRequest: typingsJapgolly.steamClient.mod.EMsg.DRMDetailsReportRequest & Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportResponse
    extends StObject
       with EMsg
  /* 638 */ val DRMDetailsReportResponse: typingsJapgolly.steamClient.mod.EMsg.DRMDetailsReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCache
    extends StObject
       with EMsg
  /* 645 */ val DRMEmptyGuidCache: typingsJapgolly.steamClient.mod.EMsg.DRMEmptyGuidCache & Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse
    extends StObject
       with EMsg
  /* 646 */ val DRMEmptyGuidCacheResponse: typingsJapgolly.steamClient.mod.EMsg.DRMEmptyGuidCacheResponse & Double = js.native
  
  @js.native
  sealed trait DRMProcessFile
    extends StObject
       with EMsg
  /* 639 */ val DRMProcessFile: typingsJapgolly.steamClient.mod.EMsg.DRMProcessFile & Double = js.native
  
  @js.native
  sealed trait DRMProcessFileResponse
    extends StObject
       with EMsg
  /* 644 */ val DRMProcessFileResponse: typingsJapgolly.steamClient.mod.EMsg.DRMProcessFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMRange2
    extends StObject
       with EMsg
  /* 7600 */ val DRMRange2: typingsJapgolly.steamClient.mod.EMsg.DRMRange2 & Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidRequest
    extends StObject
       with EMsg
  /* 630 */ val DRMResolveGuidRequest: typingsJapgolly.steamClient.mod.EMsg.DRMResolveGuidRequest & Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidResponse
    extends StObject
       with EMsg
  /* 631 */ val DRMResolveGuidResponse: typingsJapgolly.steamClient.mod.EMsg.DRMResolveGuidResponse & Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSet
    extends StObject
       with EMsg
  /* 7606 */ val DRMSFetchVersionSet: typingsJapgolly.steamClient.mod.EMsg.DRMSFetchVersionSet & Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse
    extends StObject
       with EMsg
  /* 7607 */ val DRMSFetchVersionSetResponse: typingsJapgolly.steamClient.mod.EMsg.DRMSFetchVersionSetResponse & Double = js.native
  
  @js.native
  sealed trait DRMStabilityReport
    extends StObject
       with EMsg
  /* 635 */ val DRMStabilityReport: typingsJapgolly.steamClient.mod.EMsg.DRMStabilityReport & Double = js.native
  
  @js.native
  sealed trait DRMStabilityReportResponse
    extends StObject
       with EMsg
  /* 636 */ val DRMStabilityReportResponse: typingsJapgolly.steamClient.mod.EMsg.DRMStabilityReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMSync
    extends StObject
       with EMsg
  /* 642 */ val DRMSync: typingsJapgolly.steamClient.mod.EMsg.DRMSync & Double = js.native
  
  @js.native
  sealed trait DRMSyncResponse
    extends StObject
       with EMsg
  /* 643 */ val DRMSyncResponse: typingsJapgolly.steamClient.mod.EMsg.DRMSyncResponse & Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReport
    extends StObject
       with EMsg
  /* 633 */ val DRMVariabilityReport: typingsJapgolly.steamClient.mod.EMsg.DRMVariabilityReport & Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReportResponse
    extends StObject
       with EMsg
  /* 634 */ val DRMVariabilityReportResponse: typingsJapgolly.steamClient.mod.EMsg.DRMVariabilityReportResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcess
    extends StObject
       with EMsg
  /* 9100 */ val DRMWorkerProcess: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcess & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest
    extends StObject
       with EMsg
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessAnalyzeFileRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse
    extends StObject
       with EMsg
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessAnalyzeFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest
    extends StObject
       with EMsg
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessBackfillOriginalRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse
    extends StObject
       with EMsg
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessBackfillOriginalResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign
    extends StObject
       with EMsg
  /* 9100 */ val DRMWorkerProcessDRMAndSign: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessDRMAndSign & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse
    extends StObject
       with EMsg
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessDRMAndSignResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest
    extends StObject
       with EMsg
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessDescribeSecretRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse
    extends StObject
       with EMsg
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessDescribeSecretResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest
    extends StObject
       with EMsg
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessEvaluateCrashRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse
    extends StObject
       with EMsg
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessEvaluateCrashResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest
    extends StObject
       with EMsg
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessExamineBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse
    extends StObject
       with EMsg
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessExamineBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest
    extends StObject
       with EMsg
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessGetBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse
    extends StObject
       with EMsg
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessGetBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest
    extends StObject
       with EMsg
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse
    extends StObject
       with EMsg
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest
    extends StObject
       with EMsg
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallAllRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse
    extends StObject
       with EMsg
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallAllResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest
    extends StObject
       with EMsg
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallDRMDLLRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse
    extends StObject
       with EMsg
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallDRMDLLResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest
    extends StObject
       with EMsg
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallProcessedFilesRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse
    extends StObject
       with EMsg
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessInstallProcessedFilesResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest
    extends StObject
       with EMsg
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSecretIdStringRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse
    extends StObject
       with EMsg
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSecretIdStringResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest
    extends StObject
       with EMsg
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSplitAndInstallRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse
    extends StObject
       with EMsg
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSplitAndInstallResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest
    extends StObject
       with EMsg
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSteamworksInfoRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse
    extends StObject
       with EMsg
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessSteamworksInfoResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest
    extends StObject
       with EMsg
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessUnpackBlobRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse
    extends StObject
       with EMsg
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessUnpackBlobResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest
    extends StObject
       with EMsg
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessValidateDRMDLLRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse
    extends StObject
       with EMsg
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessValidateDRMDLLResponse & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest
    extends StObject
       with EMsg
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessValidateFileRequest & Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse
    extends StObject
       with EMsg
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: typingsJapgolly.steamClient.mod.EMsg.DRMWorkerProcessValidateFileResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSCurrentFileList
    extends StObject
       with EMsg
  /* 1802 */ val DSSCurrentFileList: typingsJapgolly.steamClient.mod.EMsg.DSSCurrentFileList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSNewFile
    extends StObject
       with EMsg
  /* 1801 */ val DSSNewFile: typingsJapgolly.steamClient.mod.EMsg.DSSNewFile & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchList
    extends StObject
       with EMsg
  /* 1803 */ val DSSSynchList: typingsJapgolly.steamClient.mod.EMsg.DSSSynchList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchListResponse
    extends StObject
       with EMsg
  /* 1804 */ val DSSSynchListResponse: typingsJapgolly.steamClient.mod.EMsg.DSSSynchListResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchSubscribe
    extends StObject
       with EMsg
  /* 1805 */ val DSSSynchSubscribe: typingsJapgolly.steamClient.mod.EMsg.DSSSynchSubscribe & Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe
    extends StObject
       with EMsg
  /* 1806 */ val DSSSynchUnsubscribe: typingsJapgolly.steamClient.mod.EMsg.DSSSynchUnsubscribe & Double = js.native
  
  @js.native
  sealed trait DestJobFailed
    extends StObject
       with EMsg
  /* 113 */ val DestJobFailed: typingsJapgolly.steamClient.mod.EMsg.DestJobFailed & Double = js.native
  
  @js.native
  sealed trait DeviceAuthorizationBase
    extends StObject
       with EMsg
  /* 6500 */ val DeviceAuthorizationBase: typingsJapgolly.steamClient.mod.EMsg.DeviceAuthorizationBase & Double = js.native
  
  @js.native
  sealed trait DirRequest
    extends StObject
       with EMsg
  /* 202 */ val DirRequest: typingsJapgolly.steamClient.mod.EMsg.DirRequest & Double = js.native
  
  @js.native
  sealed trait DirResponse
    extends StObject
       with EMsg
  /* 203 */ val DirResponse: typingsJapgolly.steamClient.mod.EMsg.DirResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMRestartProcess
    extends StObject
       with EMsg
  /* 1903 */ val EPMRestartProcess: typingsJapgolly.steamClient.mod.EMsg.EPMRestartProcess & Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMStartProcess
    extends StObject
       with EMsg
  /* 1901 */ val EPMStartProcess: typingsJapgolly.steamClient.mod.EMsg.EPMStartProcess & Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMStopProcess
    extends StObject
       with EMsg
  /* 1902 */ val EPMStopProcess: typingsJapgolly.steamClient.mod.EMsg.EPMStopProcess & Double = js.native
  
  @js.native
  sealed trait EconBase
    extends StObject
       with EMsg
  /* 7700 */ val EconBase: typingsJapgolly.steamClient.mod.EMsg.EconBase & Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransaction
    extends StObject
       with EMsg
  /* 7711 */ val EconCDKeyProcessTransaction: typingsJapgolly.steamClient.mod.EMsg.EconCDKeyProcessTransaction & Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse
    extends StObject
       with EMsg
  /* 7712 */ val EconCDKeyProcessTransactionResponse: typingsJapgolly.steamClient.mod.EMsg.EconCDKeyProcessTransactionResponse & Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCache
    extends StObject
       with EMsg
  /* 7707 */ val EconFlushInventoryCache: typingsJapgolly.steamClient.mod.EMsg.EconFlushInventoryCache & Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse
    extends StObject
       with EMsg
  /* 7708 */ val EconFlushInventoryCacheResponse: typingsJapgolly.steamClient.mod.EMsg.EconFlushInventoryCacheResponse & Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogs
    extends StObject
       with EMsg
  /* 7713 */ val EconGetErrorLogs: typingsJapgolly.steamClient.mod.EMsg.EconGetErrorLogs & Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogsResponse
    extends StObject
       with EMsg
  /* 7714 */ val EconGetErrorLogsResponse: typingsJapgolly.steamClient.mod.EMsg.EconGetErrorLogsResponse & Double = js.native
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest
    extends StObject
       with EMsg
  /* 7706 */ val EconTrading_CancelTradeRequest: typingsJapgolly.steamClient.mod.EMsg.EconTrading_CancelTradeRequest & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed
    extends StObject
       with EMsg
  /* 7702 */ val EconTrading_InitiateTradeProposed: typingsJapgolly.steamClient.mod.EMsg.EconTrading_InitiateTradeProposed & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest
    extends StObject
       with EMsg
  /* 7701 */ val EconTrading_InitiateTradeRequest: typingsJapgolly.steamClient.mod.EMsg.EconTrading_InitiateTradeRequest & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse
    extends StObject
       with EMsg
  /* 7703 */ val EconTrading_InitiateTradeResponse: typingsJapgolly.steamClient.mod.EMsg.EconTrading_InitiateTradeResponse & Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult
    extends StObject
       with EMsg
  /* 7704 */ val EconTrading_InitiateTradeResult: typingsJapgolly.steamClient.mod.EMsg.EconTrading_InitiateTradeResult & Double = js.native
  
  @js.native
  sealed trait EconTrading_StartSession
    extends StObject
       with EMsg
  /* 7705 */ val EconTrading_StartSession: typingsJapgolly.steamClient.mod.EMsg.EconTrading_StartSession & Double = js.native
  
  @js.native
  sealed trait Exit
    extends StObject
       with EMsg
  /* 201 */ val Exit: typingsJapgolly.steamClient.mod.EMsg.Exit & Double = js.native
  
  @js.native
  sealed trait ExitShell
    extends StObject
       with EMsg
  /* 308 */ val ExitShell: typingsJapgolly.steamClient.mod.EMsg.ExitShell & Double = js.native
  
  @js.native
  sealed trait ExitShells
    extends StObject
       with EMsg
  /* 307 */ val ExitShells: typingsJapgolly.steamClient.mod.EMsg.ExitShells & Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCred
    extends StObject
       with EMsg
  /* 1119 */ val FBSApplyAccountCred: typingsJapgolly.steamClient.mod.EMsg.FBSApplyAccountCred & Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCredResponse
    extends StObject
       with EMsg
  /* 1120 */ val FBSApplyAccountCredResponse: typingsJapgolly.steamClient.mod.EMsg.FBSApplyAccountCredResponse & Double = js.native
  
  @js.native
  sealed trait FBSApplyOSUpdates
    extends StObject
       with EMsg
  /* 1108 */ val FBSApplyOSUpdates: typingsJapgolly.steamClient.mod.EMsg.FBSApplyOSUpdates & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk
    extends StObject
       with EMsg
  /* 1130 */ val FBSBootstrapperGetPackageChunk: typingsJapgolly.steamClient.mod.EMsg.FBSBootstrapperGetPackageChunk & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse
    extends StObject
       with EMsg
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: typingsJapgolly.steamClient.mod.EMsg.FBSBootstrapperGetPackageChunkResponse & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest
    extends StObject
       with EMsg
  /* 1128 */ val FBSBootstrapperPackageRequest: typingsJapgolly.steamClient.mod.EMsg.FBSBootstrapperPackageRequest & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse
    extends StObject
       with EMsg
  /* 1129 */ val FBSBootstrapperPackageResponse: typingsJapgolly.steamClient.mod.EMsg.FBSBootstrapperPackageResponse & Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress
    extends StObject
       with EMsg
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: typingsJapgolly.steamClient.mod.EMsg.FBSBootstrapperPackageTransferProgress & Double = js.native
  
  @js.native
  sealed trait FBSConnectionData
    extends StObject
       with EMsg
  /* 1027 */ val FBSConnectionData: typingsJapgolly.steamClient.mod.EMsg.FBSConnectionData & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FBSDeployHotFixPackage
    extends StObject
       with EMsg
  /* 1114 */ val FBSDeployHotFixPackage: typingsJapgolly.steamClient.mod.EMsg.FBSDeployHotFixPackage & Double = js.native
  
  @js.native
  sealed trait FBSDeployHotFixResponse
    extends StObject
       with EMsg
  /* 1115 */ val FBSDeployHotFixResponse: typingsJapgolly.steamClient.mod.EMsg.FBSDeployHotFixResponse & Double = js.native
  
  @js.native
  sealed trait FBSDeployPackage
    extends StObject
       with EMsg
  /* 1104 */ val FBSDeployPackage: typingsJapgolly.steamClient.mod.EMsg.FBSDeployPackage & Double = js.native
  
  @js.native
  sealed trait FBSDeployResponse
    extends StObject
       with EMsg
  /* 1105 */ val FBSDeployResponse: typingsJapgolly.steamClient.mod.EMsg.FBSDeployResponse & Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFix
    extends StObject
       with EMsg
  /* 1116 */ val FBSDownloadHotFix: typingsJapgolly.steamClient.mod.EMsg.FBSDownloadHotFix & Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFixResponse
    extends StObject
       with EMsg
  /* 1117 */ val FBSDownloadHotFixResponse: typingsJapgolly.steamClient.mod.EMsg.FBSDownloadHotFixResponse & Double = js.native
  
  @js.native
  sealed trait FBSForceBounce
    extends StObject
       with EMsg
  /* 1103 */ val FBSForceBounce: typingsJapgolly.steamClient.mod.EMsg.FBSForceBounce & Double = js.native
  
  @js.native
  sealed trait FBSForceRefresh
    extends StObject
       with EMsg
  /* 1102 */ val FBSForceRefresh: typingsJapgolly.steamClient.mod.EMsg.FBSForceRefresh & Double = js.native
  
  @js.native
  sealed trait FBSInfoFromBootstrapper
    extends StObject
       with EMsg
  /* 1126 */ val FBSInfoFromBootstrapper: typingsJapgolly.steamClient.mod.EMsg.FBSInfoFromBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSMinidumpServer
    extends StObject
       with EMsg
  /* 1112 */ val FBSMinidumpServer: typingsJapgolly.steamClient.mod.EMsg.FBSMinidumpServer & Double = js.native
  
  @js.native
  sealed trait FBSQueryGMForRequest
    extends StObject
       with EMsg
  /* 1123 */ val FBSQueryGMForRequest: typingsJapgolly.steamClient.mod.EMsg.FBSQueryGMForRequest & Double = js.native
  
  @js.native
  sealed trait FBSQueryGMResponse
    extends StObject
       with EMsg
  /* 1124 */ val FBSQueryGMResponse: typingsJapgolly.steamClient.mod.EMsg.FBSQueryGMResponse & Double = js.native
  
  @js.native
  sealed trait FBSRebootBox
    extends StObject
       with EMsg
  /* 1110 */ val FBSRebootBox: typingsJapgolly.steamClient.mod.EMsg.FBSRebootBox & Double = js.native
  
  @js.native
  sealed trait FBSRebootBoxResponse
    extends StObject
       with EMsg
  /* 1127 */ val FBSRebootBoxResponse: typingsJapgolly.steamClient.mod.EMsg.FBSRebootBoxResponse & Double = js.native
  
  @js.native
  sealed trait FBSReqVersion
    extends StObject
       with EMsg
  /* 1100 */ val FBSReqVersion: typingsJapgolly.steamClient.mod.EMsg.FBSReqVersion & Double = js.native
  
  @js.native
  sealed trait FBSRestartBootstrapper
    extends StObject
       with EMsg
  /* 1133 */ val FBSRestartBootstrapper: typingsJapgolly.steamClient.mod.EMsg.FBSRestartBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSRunCMDScript
    extends StObject
       with EMsg
  /* 1109 */ val FBSRunCMDScript: typingsJapgolly.steamClient.mod.EMsg.FBSRunCMDScript & Double = js.native
  
  @js.native
  sealed trait FBSSetBigBrotherMode
    extends StObject
       with EMsg
  /* 1111 */ val FBSSetBigBrotherMode: typingsJapgolly.steamClient.mod.EMsg.FBSSetBigBrotherMode & Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount
    extends StObject
       with EMsg
  /* 1121 */ val FBSSetShellCount: typingsJapgolly.steamClient.mod.EMsg.FBSSetShellCount & Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount_obsolete
    extends StObject
       with EMsg
  /* 1113 */ val FBSSetShellCount_obsolete: typingsJapgolly.steamClient.mod.EMsg.FBSSetShellCount_obsolete & Double = js.native
  
  @js.native
  sealed trait FBSSetState
    extends StObject
       with EMsg
  /* 1107 */ val FBSSetState: typingsJapgolly.steamClient.mod.EMsg.FBSSetState & Double = js.native
  
  @js.native
  sealed trait FBSTerminateShell
    extends StObject
       with EMsg
  /* 1122 */ val FBSTerminateShell: typingsJapgolly.steamClient.mod.EMsg.FBSTerminateShell & Double = js.native
  
  @js.native
  sealed trait FBSTerminateZombies
    extends StObject
       with EMsg
  /* 1125 */ val FBSTerminateZombies: typingsJapgolly.steamClient.mod.EMsg.FBSTerminateZombies & Double = js.native
  
  @js.native
  sealed trait FBSUpdateBootstrapper
    extends StObject
       with EMsg
  /* 1106 */ val FBSUpdateBootstrapper: typingsJapgolly.steamClient.mod.EMsg.FBSUpdateBootstrapper & Double = js.native
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile
    extends StObject
       with EMsg
  /* 1118 */ val FBSUpdateTargetConfigFile: typingsJapgolly.steamClient.mod.EMsg.FBSUpdateTargetConfigFile & Double = js.native
  
  @js.native
  sealed trait FBSVersionInfo
    extends StObject
       with EMsg
  /* 1101 */ val FBSVersionInfo: typingsJapgolly.steamClient.mod.EMsg.FBSVersionInfo & Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollower
    extends StObject
       with EMsg
  /* 7510 */ val FSAddOrRemoveFollower: typingsJapgolly.steamClient.mod.EMsg.FSAddOrRemoveFollower & Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse
    extends StObject
       with EMsg
  /* 7511 */ val FSAddOrRemoveFollowerResponse: typingsJapgolly.steamClient.mod.EMsg.FSAddOrRemoveFollowerResponse & Double = js.native
  
  @js.native
  sealed trait FSBase
    extends StObject
       with EMsg
  /* 7500 */ val FSBase: typingsJapgolly.steamClient.mod.EMsg.FSBase & Double = js.native
  
  @js.native
  sealed trait FSCommentNotification
    extends StObject
       with EMsg
  /* 7513 */ val FSCommentNotification: typingsJapgolly.steamClient.mod.EMsg.FSCommentNotification & Double = js.native
  
  @js.native
  sealed trait FSCommentNotificationViewed
    extends StObject
       with EMsg
  /* 7514 */ val FSCommentNotificationViewed: typingsJapgolly.steamClient.mod.EMsg.FSCommentNotificationViewed & Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrix
    extends StObject
       with EMsg
  /* 7506 */ val FSComputeFrenematrix: typingsJapgolly.steamClient.mod.EMsg.FSComputeFrenematrix & Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrixResponse
    extends StObject
       with EMsg
  /* 7507 */ val FSComputeFrenematrixResponse: typingsJapgolly.steamClient.mod.EMsg.FSComputeFrenematrixResponse & Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCount
    extends StObject
       with EMsg
  /* 7521 */ val FSGetPendingNotificationCount: typingsJapgolly.steamClient.mod.EMsg.FSGetPendingNotificationCount & Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse
    extends StObject
       with EMsg
  /* 7522 */ val FSGetPendingNotificationCountResponse: typingsJapgolly.steamClient.mod.EMsg.FSGetPendingNotificationCountResponse & Double = js.native
  
  @js.native
  sealed trait FSPlayStatusNotification
    extends StObject
       with EMsg
  /* 7508 */ val FSPlayStatusNotification: typingsJapgolly.steamClient.mod.EMsg.FSPlayStatusNotification & Double = js.native
  
  @js.native
  sealed trait FSPublishPersonaStatus
    extends StObject
       with EMsg
  /* 7509 */ val FSPublishPersonaStatus: typingsJapgolly.steamClient.mod.EMsg.FSPublishPersonaStatus & Double = js.native
  
  @js.native
  sealed trait FSRequestFriendData
    extends StObject
       with EMsg
  /* 7530 */ val FSRequestFriendData: typingsJapgolly.steamClient.mod.EMsg.FSRequestFriendData & Double = js.native
  
  @js.native
  sealed trait FSRichPresenceRequest
    extends StObject
       with EMsg
  /* 7504 */ val FSRichPresenceRequest: typingsJapgolly.steamClient.mod.EMsg.FSRichPresenceRequest & Double = js.native
  
  @js.native
  sealed trait FSRichPresenceResponse
    extends StObject
       with EMsg
  /* 7505 */ val FSRichPresenceResponse: typingsJapgolly.steamClient.mod.EMsg.FSRichPresenceResponse & Double = js.native
  
  @js.native
  sealed trait FSUpdateFollowingList
    extends StObject
       with EMsg
  /* 7512 */ val FSUpdateFollowingList: typingsJapgolly.steamClient.mod.EMsg.FSUpdateFollowingList & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSBrowseClans
    extends StObject
       with EMsg
  /* 3103 */ val FTSBrowseClans: typingsJapgolly.steamClient.mod.EMsg.FTSBrowseClans & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse
    extends StObject
       with EMsg
  /* 3104 */ val FTSBrowseClansResponse: typingsJapgolly.steamClient.mod.EMsg.FTSBrowseClansResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSClanDeleted
    extends StObject
       with EMsg
  /* 3109 */ val FTSClanDeleted: typingsJapgolly.steamClient.mod.EMsg.FTSClanDeleted & Double = js.native
  
  @js.native
  sealed trait FTSGetBrowseCounts
    extends StObject
       with EMsg
  /* 3101 */ val FTSGetBrowseCounts: typingsJapgolly.steamClient.mod.EMsg.FTSGetBrowseCounts & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse
    extends StObject
       with EMsg
  /* 3102 */ val FTSGetBrowseCountsResponse: typingsJapgolly.steamClient.mod.EMsg.FTSGetBrowseCountsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats
    extends StObject
       with EMsg
  /* 3114 */ val FTSGetGSPlayStats: typingsJapgolly.steamClient.mod.EMsg.FTSGetGSPlayStats & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer
    extends StObject
       with EMsg
  /* 3116 */ val FTSGetGSPlayStatsForServer: typingsJapgolly.steamClient.mod.EMsg.FTSGetGSPlayStatsForServer & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse
    extends StObject
       with EMsg
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: typingsJapgolly.steamClient.mod.EMsg.FTSGetGSPlayStatsForServerResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse
    extends StObject
       with EMsg
  /* 3115 */ val FTSGetGSPlayStatsResponse: typingsJapgolly.steamClient.mod.EMsg.FTSGetGSPlayStatsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSReportIPUpdates
    extends StObject
       with EMsg
  /* 3118 */ val FTSReportIPUpdates: typingsJapgolly.steamClient.mod.EMsg.FTSReportIPUpdates & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearch
    extends StObject
       with EMsg
  /* 3110 */ val FTSSearch: typingsJapgolly.steamClient.mod.EMsg.FTSSearch & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation
    extends StObject
       with EMsg
  /* 3105 */ val FTSSearchClansByLocation: typingsJapgolly.steamClient.mod.EMsg.FTSSearchClansByLocation & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse
    extends StObject
       with EMsg
  /* 3106 */ val FTSSearchClansByLocationResponse: typingsJapgolly.steamClient.mod.EMsg.FTSSearchClansByLocationResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation
    extends StObject
       with EMsg
  /* 3107 */ val FTSSearchPlayersByLocation: typingsJapgolly.steamClient.mod.EMsg.FTSSearchPlayersByLocation & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse
    extends StObject
       with EMsg
  /* 3108 */ val FTSSearchPlayersByLocationResponse: typingsJapgolly.steamClient.mod.EMsg.FTSSearchPlayersByLocationResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchResponse
    extends StObject
       with EMsg
  /* 3111 */ val FTSSearchResponse: typingsJapgolly.steamClient.mod.EMsg.FTSSearchResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchStatus
    extends StObject
       with EMsg
  /* 3112 */ val FTSSearchStatus: typingsJapgolly.steamClient.mod.EMsg.FTSSearchStatus & Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse
    extends StObject
       with EMsg
  /* 3113 */ val FTSSearchStatusResponse: typingsJapgolly.steamClient.mod.EMsg.FTSSearchStatusResponse & Double = js.native
  
  @js.native
  sealed trait FailServer
    extends StObject
       with EMsg
  /* 3000 */ val FailServer: typingsJapgolly.steamClient.mod.EMsg.FailServer & Double = js.native
  
  @js.native
  sealed trait FileXferData
    extends StObject
       with EMsg
  /* 1202 */ val FileXferData: typingsJapgolly.steamClient.mod.EMsg.FileXferData & Double = js.native
  
  @js.native
  sealed trait FileXferDataAck
    extends StObject
       with EMsg
  /* 1204 */ val FileXferDataAck: typingsJapgolly.steamClient.mod.EMsg.FileXferDataAck & Double = js.native
  
  @js.native
  sealed trait FileXferEnd
    extends StObject
       with EMsg
  /* 1203 */ val FileXferEnd: typingsJapgolly.steamClient.mod.EMsg.FileXferEnd & Double = js.native
  
  @js.native
  sealed trait FileXferRequest
    extends StObject
       with EMsg
  /* 1200 */ val FileXferRequest: typingsJapgolly.steamClient.mod.EMsg.FileXferRequest & Double = js.native
  
  @js.native
  sealed trait FileXferResponse
    extends StObject
       with EMsg
  /* 1201 */ val FileXferResponse: typingsJapgolly.steamClient.mod.EMsg.FileXferResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCAchievementAwarded
    extends StObject
       with EMsg
  /* 2212 */ val GCAchievementAwarded: typingsJapgolly.steamClient.mod.EMsg.GCAchievementAwarded & Double = js.native
  
  @js.native
  sealed trait GCCmdBounce
    extends StObject
       with EMsg
  /* 2204 */ val GCCmdBounce: typingsJapgolly.steamClient.mod.EMsg.GCCmdBounce & Double = js.native
  
  @js.native
  sealed trait GCCmdDeploy
    extends StObject
       with EMsg
  /* 2207 */ val GCCmdDeploy: typingsJapgolly.steamClient.mod.EMsg.GCCmdDeploy & Double = js.native
  
  @js.native
  sealed trait GCCmdDeployResponse
    extends StObject
       with EMsg
  /* 2208 */ val GCCmdDeployResponse: typingsJapgolly.steamClient.mod.EMsg.GCCmdDeployResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdDown
    extends StObject
       with EMsg
  /* 2206 */ val GCCmdDown: typingsJapgolly.steamClient.mod.EMsg.GCCmdDown & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdForceBounce
    extends StObject
       with EMsg
  /* 2205 */ val GCCmdForceBounce: typingsJapgolly.steamClient.mod.EMsg.GCCmdForceBounce & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdRevive
    extends StObject
       with EMsg
  /* 2203 */ val GCCmdRevive: typingsJapgolly.steamClient.mod.EMsg.GCCmdRevive & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdStatus
    extends StObject
       with EMsg
  /* 2216 */ val GCCmdStatus: typingsJapgolly.steamClient.mod.EMsg.GCCmdStatus & Double = js.native
  
  @js.native
  sealed trait GCCmdSwitch
    extends StObject
       with EMsg
  /* 2209 */ val GCCmdSwitch: typingsJapgolly.steamClient.mod.EMsg.GCCmdSwitch & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCGetAccountDetails
    extends StObject
       with EMsg
  /* 2218 */ val GCGetAccountDetails: typingsJapgolly.steamClient.mod.EMsg.GCGetAccountDetails & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED
    extends StObject
       with EMsg
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: typingsJapgolly.steamClient.mod.EMsg.GCGetAccountDetails_DEPRECATED & Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplate
    extends StObject
       with EMsg
  /* 2220 */ val GCGetEmailTemplate: typingsJapgolly.steamClient.mod.EMsg.GCGetEmailTemplate & Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplateResponse
    extends StObject
       with EMsg
  /* 2221 */ val GCGetEmailTemplateResponse: typingsJapgolly.steamClient.mod.EMsg.GCGetEmailTemplateResponse & Double = js.native
  
  @js.native
  sealed trait GCHAccountLockStatusChange
    extends StObject
       with EMsg
  /* 2234 */ val GCHAccountLockStatusChange: typingsJapgolly.steamClient.mod.EMsg.GCHAccountLockStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange
    extends StObject
       with EMsg
  /* 2236 */ val GCHAccountPhoneNumberChange: typingsJapgolly.steamClient.mod.EMsg.GCHAccountPhoneNumberChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange
    extends StObject
       with EMsg
  /* 2233 */ val GCHAccountTradeBanStatusChange: typingsJapgolly.steamClient.mod.EMsg.GCHAccountTradeBanStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountTwoFactorChange
    extends StObject
       with EMsg
  /* 2237 */ val GCHAccountTwoFactorChange: typingsJapgolly.steamClient.mod.EMsg.GCHAccountTwoFactorChange & Double = js.native
  
  @js.native
  sealed trait GCHAccountVacStatusChange
    extends StObject
       with EMsg
  /* 2228 */ val GCHAccountVacStatusChange: typingsJapgolly.steamClient.mod.EMsg.GCHAccountVacStatusChange & Double = js.native
  
  @js.native
  sealed trait GCHKillGC
    extends StObject
       with EMsg
  /* 2231 */ val GCHKillGC: typingsJapgolly.steamClient.mod.EMsg.GCHKillGC & Double = js.native
  
  @js.native
  sealed trait GCHKillGCResponse
    extends StObject
       with EMsg
  /* 2232 */ val GCHKillGCResponse: typingsJapgolly.steamClient.mod.EMsg.GCHKillGCResponse & Double = js.native
  
  // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait GCHRelay
    extends StObject
       with EMsg
  /* 2222 */ val GCHRelay: typingsJapgolly.steamClient.mod.EMsg.GCHRelay & Double = js.native
  
  @js.native
  sealed trait GCHRelayClientToIS
    extends StObject
       with EMsg
  /* 2223 */ val GCHRelayClientToIS: typingsJapgolly.steamClient.mod.EMsg.GCHRelayClientToIS & Double = js.native
  
  // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayToClient
    extends StObject
       with EMsg
  /* 2223 */ val GCHRelayToClient: typingsJapgolly.steamClient.mod.EMsg.GCHRelayToClient & Double = js.native
  
  @js.native
  sealed trait GCHRequestStatus
    extends StObject
       with EMsg
  /* 2226 */ val GCHRequestStatus: typingsJapgolly.steamClient.mod.EMsg.GCHRequestStatus & Double = js.native
  
  @js.native
  sealed trait GCHRequestStatusResponse
    extends StObject
       with EMsg
  /* 2227 */ val GCHRequestStatusResponse: typingsJapgolly.steamClient.mod.EMsg.GCHRequestStatusResponse & Double = js.native
  
  @js.native
  sealed trait GCHRequestUpdateSession
    extends StObject
       with EMsg
  /* 2225 */ val GCHRequestUpdateSession: typingsJapgolly.steamClient.mod.EMsg.GCHRequestUpdateSession & Double = js.native
  
  @js.native
  sealed trait GCHSpawnGC
    extends StObject
       with EMsg
  /* 2229 */ val GCHSpawnGC: typingsJapgolly.steamClient.mod.EMsg.GCHSpawnGC & Double = js.native
  
  @js.native
  sealed trait GCHSpawnGCResponse
    extends StObject
       with EMsg
  /* 2230 */ val GCHSpawnGCResponse: typingsJapgolly.steamClient.mod.EMsg.GCHSpawnGCResponse & Double = js.native
  
  @js.native
  sealed trait GCHUpdateSession
    extends StObject
       with EMsg
  /* 2224 */ val GCHUpdateSession: typingsJapgolly.steamClient.mod.EMsg.GCHUpdateSession & Double = js.native
  
  @js.native
  sealed trait GCHVacVerificationChange
    extends StObject
       with EMsg
  /* 2235 */ val GCHVacVerificationChange: typingsJapgolly.steamClient.mod.EMsg.GCHVacVerificationChange & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCInterAppMessage
    extends StObject
       with EMsg
  /* 2219 */ val GCInterAppMessage: typingsJapgolly.steamClient.mod.EMsg.GCInterAppMessage & Double = js.native
  
  @js.native
  sealed trait GCRegisterWebInterfaces
    extends StObject
       with EMsg
  /* 2217 */ val GCRegisterWebInterfaces: typingsJapgolly.steamClient.mod.EMsg.GCRegisterWebInterfaces & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated
    extends StObject
       with EMsg
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: typingsJapgolly.steamClient.mod.EMsg.GCRegisterWebInterfaces_Deprecated & Double = js.native
  
  @js.native
  sealed trait GCSendClient
    extends StObject
       with EMsg
  /* 2200 */ val GCSendClient: typingsJapgolly.steamClient.mod.EMsg.GCSendClient & Double = js.native
  
  @js.native
  sealed trait GCSystemMessage
    extends StObject
       with EMsg
  /* 2213 */ val GCSystemMessage: typingsJapgolly.steamClient.mod.EMsg.GCSystemMessage & Double = js.native
  
  @js.native
  sealed trait GCUpdateGSState
    extends StObject
       with EMsg
  /* 2211 */ val GCUpdateGSState: typingsJapgolly.steamClient.mod.EMsg.GCUpdateGSState & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCUpdatePlayedState
    extends StObject
       with EMsg
  /* 2202 */ val GCUpdatePlayedState: typingsJapgolly.steamClient.mod.EMsg.GCUpdatePlayedState & Double = js.native
  
  @js.native
  sealed trait GCValidateSession
    extends StObject
       with EMsg
  /* 2214 */ val GCValidateSession: typingsJapgolly.steamClient.mod.EMsg.GCValidateSession & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCValidateSessionResponse
    extends StObject
       with EMsg
  /* 2215 */ val GCValidateSessionResponse: typingsJapgolly.steamClient.mod.EMsg.GCValidateSessionResponse & Double = js.native
  
  @js.native
  sealed trait GMConvertUserWallets
    extends StObject
       with EMsg
  /* 333 */ val GMConvertUserWallets: typingsJapgolly.steamClient.mod.EMsg.GMConvertUserWallets & Double = js.native
  
  @js.native
  sealed trait GMDRMSync
    extends StObject
       with EMsg
  /* 320 */ val GMDRMSync: typingsJapgolly.steamClient.mod.EMsg.GMDRMSync & Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRouting
    extends StObject
       with EMsg
  /* 331 */ val GMGetServiceMethodRouting: typingsJapgolly.steamClient.mod.EMsg.GMGetServiceMethodRouting & Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse
    extends StObject
       with EMsg
  /* 332 */ val GMGetServiceMethodRoutingResponse: typingsJapgolly.steamClient.mod.EMsg.GMGetServiceMethodRoutingResponse & Double = js.native
  
  @js.native
  sealed trait GMLoadActivationCodes
    extends StObject
       with EMsg
  /* 325 */ val GMLoadActivationCodes: typingsJapgolly.steamClient.mod.EMsg.GMLoadActivationCodes & Double = js.native
  
  @js.native
  sealed trait GMQueueForFBS
    extends StObject
       with EMsg
  /* 326 */ val GMQueueForFBS: typingsJapgolly.steamClient.mod.EMsg.GMQueueForFBS & Double = js.native
  
  @js.native
  sealed trait GMReportPHPError
    extends StObject
       with EMsg
  /* 319 */ val GMReportPHPError: typingsJapgolly.steamClient.mod.EMsg.GMReportPHPError & Double = js.native
  
  @js.native
  sealed trait GMSBase
    extends StObject
       with EMsg
  /* 6400 */ val GMSBase: typingsJapgolly.steamClient.mod.EMsg.GMSBase & Double = js.native
  
  @js.native
  sealed trait GMSClientServerQueryResponse
    extends StObject
       with EMsg
  /* 6404 */ val GMSClientServerQueryResponse: typingsJapgolly.steamClient.mod.EMsg.GMSClientServerQueryResponse & Double = js.native
  
  @js.native
  sealed trait GMSGameServerReplicate
    extends StObject
       with EMsg
  /* 6401 */ val GMSGameServerReplicate: typingsJapgolly.steamClient.mod.EMsg.GMSGameServerReplicate & Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResults
    extends StObject
       with EMsg
  /* 327 */ val GMSchemaConversionResults: typingsJapgolly.steamClient.mod.EMsg.GMSchemaConversionResults & Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResultsResponse
    extends StObject
       with EMsg
  /* 328 */ val GMSchemaConversionResultsResponse: typingsJapgolly.steamClient.mod.EMsg.GMSchemaConversionResultsResponse & Double = js.native
  
  @js.native
  sealed trait GMWriteConfigToSQL
    extends StObject
       with EMsg
  /* 324 */ val GMWriteConfigToSQL: typingsJapgolly.steamClient.mod.EMsg.GMWriteConfigToSQL & Double = js.native
  
  // obsolete
  @js.native
  sealed trait GMWriteShellFailureToSQL
    extends StObject
       with EMsg
  /* 329 */ val GMWriteShellFailureToSQL: typingsJapgolly.steamClient.mod.EMsg.GMWriteShellFailureToSQL & Double = js.native
  
  @js.native
  sealed trait GMWriteStatsToSOS
    extends StObject
       with EMsg
  /* 330 */ val GMWriteStatsToSOS: typingsJapgolly.steamClient.mod.EMsg.GMWriteStatsToSOS & Double = js.native
  
  @js.native
  sealed trait GSApprove
    extends StObject
       with EMsg
  /* 758 */ val GSApprove: typingsJapgolly.steamClient.mod.EMsg.GSApprove & Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClan
    extends StObject
       with EMsg
  /* 938 */ val GSAssociateWithClan: typingsJapgolly.steamClient.mod.EMsg.GSAssociateWithClan & Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClanResponse
    extends StObject
       with EMsg
  /* 939 */ val GSAssociateWithClanResponse: typingsJapgolly.steamClient.mod.EMsg.GSAssociateWithClanResponse & Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility
    extends StObject
       with EMsg
  /* 940 */ val GSComputeNewPlayerCompatibility: typingsJapgolly.steamClient.mod.EMsg.GSComputeNewPlayerCompatibility & Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse
    extends StObject
       with EMsg
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: typingsJapgolly.steamClient.mod.EMsg.GSComputeNewPlayerCompatibilityResponse & Double = js.native
  
  @js.native
  sealed trait GSDeny
    extends StObject
       with EMsg
  /* 759 */ val GSDeny: typingsJapgolly.steamClient.mod.EMsg.GSDeny & Double = js.native
  
  @js.native
  sealed trait GSDisconnectNotice
    extends StObject
       with EMsg
  /* 901 */ val GSDisconnectNotice: typingsJapgolly.steamClient.mod.EMsg.GSDisconnectNotice & Double = js.native
  
  @js.native
  sealed trait GSGetPlayStats
    extends StObject
       with EMsg
  /* 918 */ val GSGetPlayStats: typingsJapgolly.steamClient.mod.EMsg.GSGetPlayStats & Double = js.native
  
  @js.native
  sealed trait GSGetPlayStatsResponse
    extends StObject
       with EMsg
  /* 919 */ val GSGetPlayStatsResponse: typingsJapgolly.steamClient.mod.EMsg.GSGetPlayStatsResponse & Double = js.native
  
  @js.native
  sealed trait GSGetReputation
    extends StObject
       with EMsg
  /* 936 */ val GSGetReputation: typingsJapgolly.steamClient.mod.EMsg.GSGetReputation & Double = js.native
  
  @js.native
  sealed trait GSGetReputationResponse
    extends StObject
       with EMsg
  /* 937 */ val GSGetReputationResponse: typingsJapgolly.steamClient.mod.EMsg.GSGetReputationResponse & Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatus
    extends StObject
       with EMsg
  /* 910 */ val GSGetUserAchievementStatus: typingsJapgolly.steamClient.mod.EMsg.GSGetUserAchievementStatus & Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse
    extends StObject
       with EMsg
  /* 911 */ val GSGetUserAchievementStatusResponse: typingsJapgolly.steamClient.mod.EMsg.GSGetUserAchievementStatusResponse & Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatus
    extends StObject
       with EMsg
  /* 920 */ val GSGetUserGroupStatus: typingsJapgolly.steamClient.mod.EMsg.GSGetUserGroupStatus & Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse
    extends StObject
       with EMsg
  /* 923 */ val GSGetUserGroupStatusResponse: typingsJapgolly.steamClient.mod.EMsg.GSGetUserGroupStatusResponse & Double = js.native
  
  @js.native
  sealed trait GSKick
    extends StObject
       with EMsg
  /* 760 */ val GSKick: typingsJapgolly.steamClient.mod.EMsg.GSKick & Double = js.native
  
  @js.native
  sealed trait GSPerformHardwareSurvey
    extends StObject
       with EMsg
  /* 5440 */ val GSPerformHardwareSurvey: typingsJapgolly.steamClient.mod.EMsg.GSPerformHardwareSurvey & Double = js.native
  
  @js.native
  sealed trait GSPlayerList
    extends StObject
       with EMsg
  /* 909 */ val GSPlayerList: typingsJapgolly.steamClient.mod.EMsg.GSPlayerList & Double = js.native
  
  @js.native
  sealed trait GSServerType
    extends StObject
       with EMsg
  /* 908 */ val GSServerType: typingsJapgolly.steamClient.mod.EMsg.GSServerType & Double = js.native
  
  @js.native
  sealed trait GSStatus
    extends StObject
       with EMsg
  /* 903 */ val GSStatus: typingsJapgolly.steamClient.mod.EMsg.GSStatus & Double = js.native
  
  @js.native
  sealed trait GSStatus2
    extends StObject
       with EMsg
  /* 906 */ val GSStatus2: typingsJapgolly.steamClient.mod.EMsg.GSStatus2 & Double = js.native
  
  @js.native
  sealed trait GSStatusReply
    extends StObject
       with EMsg
  /* 774 */ val GSStatusReply: typingsJapgolly.steamClient.mod.EMsg.GSStatusReply & Double = js.native
  
  @js.native
  sealed trait GSStatusUpdate_Unused
    extends StObject
       with EMsg
  /* 907 */ val GSStatusUpdate_Unused: typingsJapgolly.steamClient.mod.EMsg.GSStatusUpdate_Unused & Double = js.native
  
  @js.native
  sealed trait GSUserPlaying
    extends StObject
       with EMsg
  /* 905 */ val GSUserPlaying: typingsJapgolly.steamClient.mod.EMsg.GSUserPlaying & Double = js.native
  
  @js.native
  sealed trait GameServerOutOfDate
    extends StObject
       with EMsg
  /* 6407 */ val GameServerOutOfDate: typingsJapgolly.steamClient.mod.EMsg.GameServerOutOfDate & Double = js.native
  
  @js.native
  sealed trait GenericReply
    extends StObject
       with EMsg
  /* 100 */ val GenericReply: typingsJapgolly.steamClient.mod.EMsg.GenericReply & Double = js.native
  
  @js.native
  sealed trait GetUserIPCountry
    extends StObject
       with EMsg
  /* 4393 */ val GetUserIPCountry: typingsJapgolly.steamClient.mod.EMsg.GetUserIPCountry & Double = js.native
  
  @js.native
  sealed trait GetUserIPCountryResponse
    extends StObject
       with EMsg
  /* 4394 */ val GetUserIPCountryResponse: typingsJapgolly.steamClient.mod.EMsg.GetUserIPCountryResponse & Double = js.native
  
  @js.native
  sealed trait GracefulExitShell
    extends StObject
       with EMsg
  /* 309 */ val GracefulExitShell: typingsJapgolly.steamClient.mod.EMsg.GracefulExitShell & Double = js.native
  
  @js.native
  sealed trait Heartbeat
    extends StObject
       with EMsg
  /* 300 */ val Heartbeat: typingsJapgolly.steamClient.mod.EMsg.Heartbeat & Double = js.native
  
  @js.native
  sealed trait HubConnect
    extends StObject
       with EMsg
  /* 124 */ val HubConnect: typingsJapgolly.steamClient.mod.EMsg.HubConnect & Double = js.native
  
  @js.native
  sealed trait ISRelayToGCH
    extends StObject
       with EMsg
  /* 2222 */ val ISRelayToGCH: typingsJapgolly.steamClient.mod.EMsg.ISRelayToGCH & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EMsg
  /* 0 */ val Invalid: typingsJapgolly.steamClient.mod.EMsg.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidateDBOCacheItems
    extends StObject
       with EMsg
  /* 145 */ val InvalidateDBOCacheItems: typingsJapgolly.steamClient.mod.EMsg.InvalidateDBOCacheItems & Double = js.native
  
  @js.native
  sealed trait JobHeartbeat
    extends StObject
       with EMsg
  /* 123 */ val JobHeartbeat: typingsJapgolly.steamClient.mod.EMsg.JobHeartbeat & Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTest
    extends StObject
       with EMsg
  /* 3001 */ val JobHeartbeatTest: typingsJapgolly.steamClient.mod.EMsg.JobHeartbeatTest & Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTestResponse
    extends StObject
       with EMsg
  /* 3002 */ val JobHeartbeatTestResponse: typingsJapgolly.steamClient.mod.EMsg.JobHeartbeatTestResponse & Double = js.native
  
  @js.native
  sealed trait KGSAllocateKeyRange
    extends StObject
       with EMsg
  /* 7201 */ val KGSAllocateKeyRange: typingsJapgolly.steamClient.mod.EMsg.KGSAllocateKeyRange & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse
    extends StObject
       with EMsg
  /* 7202 */ val KGSAllocateKeyRangeResponse: typingsJapgolly.steamClient.mod.EMsg.KGSAllocateKeyRangeResponse & Double = js.native
  
  @js.native
  sealed trait KGSBase
    extends StObject
       with EMsg
  /* 7200 */ val KGSBase: typingsJapgolly.steamClient.mod.EMsg.KGSBase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys
    extends StObject
       with EMsg
  /* 7207 */ val KGSGenerateGameStopWCKeys: typingsJapgolly.steamClient.mod.EMsg.KGSGenerateGameStopWCKeys & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse
    extends StObject
       with EMsg
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: typingsJapgolly.steamClient.mod.EMsg.KGSGenerateGameStopWCKeysResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateKeys
    extends StObject
       with EMsg
  /* 7203 */ val KGSGenerateKeys: typingsJapgolly.steamClient.mod.EMsg.KGSGenerateKeys & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse
    extends StObject
       with EMsg
  /* 7204 */ val KGSGenerateKeysResponse: typingsJapgolly.steamClient.mod.EMsg.KGSGenerateKeysResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSRemapKeys
    extends StObject
       with EMsg
  /* 7205 */ val KGSRemapKeys: typingsJapgolly.steamClient.mod.EMsg.KGSRemapKeys & Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse
    extends StObject
       with EMsg
  /* 7206 */ val KGSRemapKeysResponse: typingsJapgolly.steamClient.mod.EMsg.KGSRemapKeysResponse & Double = js.native
  
  @js.native
  sealed trait KeepAlive
    extends StObject
       with EMsg
  /* 132 */ val KeepAlive: typingsJapgolly.steamClient.mod.EMsg.KeepAlive & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLB
    extends StObject
       with EMsg
  /* 3210 */ val LBSDeleteLB: typingsJapgolly.steamClient.mod.EMsg.LBSDeleteLB & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBEntry
    extends StObject
       with EMsg
  /* 3211 */ val LBSDeleteLBEntry: typingsJapgolly.steamClient.mod.EMsg.LBSDeleteLBEntry & Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBResponse
    extends StObject
       with EMsg
  /* 3214 */ val LBSDeleteLBResponse: typingsJapgolly.steamClient.mod.EMsg.LBSDeleteLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLB
    extends StObject
       with EMsg
  /* 3203 */ val LBSFindOrCreateLB: typingsJapgolly.steamClient.mod.EMsg.LBSFindOrCreateLB & Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse
    extends StObject
       with EMsg
  /* 3204 */ val LBSFindOrCreateLBResponse: typingsJapgolly.steamClient.mod.EMsg.LBSFindOrCreateLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntries
    extends StObject
       with EMsg
  /* 3205 */ val LBSGetLBEntries: typingsJapgolly.steamClient.mod.EMsg.LBSGetLBEntries & Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntriesResponse
    extends StObject
       with EMsg
  /* 3206 */ val LBSGetLBEntriesResponse: typingsJapgolly.steamClient.mod.EMsg.LBSGetLBEntriesResponse & Double = js.native
  
  @js.native
  sealed trait LBSGetLBList
    extends StObject
       with EMsg
  /* 3207 */ val LBSGetLBList: typingsJapgolly.steamClient.mod.EMsg.LBSGetLBList & Double = js.native
  
  @js.native
  sealed trait LBSGetLBListResponse
    extends StObject
       with EMsg
  /* 3208 */ val LBSGetLBListResponse: typingsJapgolly.steamClient.mod.EMsg.LBSGetLBListResponse & Double = js.native
  
  @js.native
  sealed trait LBSResetLB
    extends StObject
       with EMsg
  /* 3212 */ val LBSResetLB: typingsJapgolly.steamClient.mod.EMsg.LBSResetLB & Double = js.native
  
  @js.native
  sealed trait LBSResetLBResponse
    extends StObject
       with EMsg
  /* 3213 */ val LBSResetLBResponse: typingsJapgolly.steamClient.mod.EMsg.LBSResetLBResponse & Double = js.native
  
  @js.native
  sealed trait LBSSetLBDetails
    extends StObject
       with EMsg
  /* 3209 */ val LBSSetLBDetails: typingsJapgolly.steamClient.mod.EMsg.LBSSetLBDetails & Double = js.native
  
  @js.native
  sealed trait LBSSetScore
    extends StObject
       with EMsg
  /* 3201 */ val LBSSetScore: typingsJapgolly.steamClient.mod.EMsg.LBSSetScore & Double = js.native
  
  @js.native
  sealed trait LBSSetScoreResponse
    extends StObject
       with EMsg
  /* 3202 */ val LBSSetScoreResponse: typingsJapgolly.steamClient.mod.EMsg.LBSSetScoreResponse & Double = js.native
  
  @js.native
  sealed trait LicenseProcessingComplete
    extends StObject
       with EMsg
  /* 316 */ val LicenseProcessingComplete: typingsJapgolly.steamClient.mod.EMsg.LicenseProcessingComplete & Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItem
    extends StObject
       with EMsg
  /* 143 */ val LoadDBOCacheItem: typingsJapgolly.steamClient.mod.EMsg.LoadDBOCacheItem & Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItemResponse
    extends StObject
       with EMsg
  /* 144 */ val LoadDBOCacheItemResponse: typingsJapgolly.steamClient.mod.EMsg.LoadDBOCacheItemResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait LogSearchCancel
    extends StObject
       with EMsg
  /* 1009 */ val LogSearchCancel: typingsJapgolly.steamClient.mod.EMsg.LogSearchCancel & Double = js.native
  
  @js.native
  sealed trait LogSearchRequest
    extends StObject
       with EMsg
  /* 1007 */ val LogSearchRequest: typingsJapgolly.steamClient.mod.EMsg.LogSearchRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait LogSearchResponse
    extends StObject
       with EMsg
  /* 1008 */ val LogSearchResponse: typingsJapgolly.steamClient.mod.EMsg.LogSearchResponse & Double = js.native
  
  @js.native
  sealed trait LogsinkBase
    extends StObject
       with EMsg
  /* 8800 */ val LogsinkBase: typingsJapgolly.steamClient.mod.EMsg.LogsinkBase & Double = js.native
  
  @js.native
  sealed trait LogsinkWriteReport
    extends StObject
       with EMsg
  /* 8800 */ val LogsinkWriteReport: typingsJapgolly.steamClient.mod.EMsg.LogsinkWriteReport & Double = js.native
  
  @js.native
  sealed trait MDSContentServerConfig
    extends StObject
       with EMsg
  /* 5828 */ val MDSContentServerConfig: typingsJapgolly.steamClient.mod.EMsg.MDSContentServerConfig & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSContentServerConfigRequest
    extends StObject
       with EMsg
  /* 5827 */ val MDSContentServerConfigRequest: typingsJapgolly.steamClient.mod.EMsg.MDSContentServerConfigRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast
    extends StObject
       with EMsg
  /* 5826 */ val MDSContentServerStatsBroadcast: typingsJapgolly.steamClient.mod.EMsg.MDSContentServerStatsBroadcast & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck
    extends StObject
       with EMsg
  /* 5825 */ val MDSDownloadDepotChunksAck: typingsJapgolly.steamClient.mod.EMsg.MDSDownloadDepotChunksAck & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunk
    extends StObject
       with EMsg
  /* 5832 */ val MDSGetDepotChunk: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkChunk
    extends StObject
       with EMsg
  /* 5834 */ val MDSGetDepotChunkChunk: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotChunkChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkResponse
    extends StObject
       with EMsg
  /* 5833 */ val MDSGetDepotChunkResponse: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotChunkResponse & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifest
    extends StObject
       with EMsg
  /* 5829 */ val MDSGetDepotManifest: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotManifest & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestChunk
    extends StObject
       with EMsg
  /* 5831 */ val MDSGetDepotManifestChunk: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotManifestChunk & Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestResponse
    extends StObject
       with EMsg
  /* 5830 */ val MDSGetDepotManifestResponse: typingsJapgolly.steamClient.mod.EMsg.MDSGetDepotManifestResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSGetServerListForUser
    extends StObject
       with EMsg
  /* 5836 */ val MDSGetServerListForUser: typingsJapgolly.steamClient.mod.EMsg.MDSGetServerListForUser & Double = js.native
  
  @js.native
  sealed trait MDSGetServerListForUserResponse
    extends StObject
       with EMsg
  /* 5837 */ val MDSGetServerListForUserResponse: typingsJapgolly.steamClient.mod.EMsg.MDSGetServerListForUserResponse & Double = js.native
  
  @js.native
  sealed trait MDSGetVersionsForDepot
    extends StObject
       with EMsg
  /* 5814 */ val MDSGetVersionsForDepot: typingsJapgolly.steamClient.mod.EMsg.MDSGetVersionsForDepot & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse
    extends StObject
       with EMsg
  /* 5815 */ val MDSGetVersionsForDepotResponse: typingsJapgolly.steamClient.mod.EMsg.MDSGetVersionsForDepotResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSMigrateChunk
    extends StObject
       with EMsg
  /* 5847 */ val MDSMigrateChunk: typingsJapgolly.steamClient.mod.EMsg.MDSMigrateChunk & Double = js.native
  
  @js.native
  sealed trait MDSMigrateChunkResponse
    extends StObject
       with EMsg
  /* 5848 */ val MDSMigrateChunkResponse: typingsJapgolly.steamClient.mod.EMsg.MDSMigrateChunkResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot
    extends StObject
       with EMsg
  /* 5816 */ val MDSSetPublicVersionForDepot: typingsJapgolly.steamClient.mod.EMsg.MDSSetPublicVersionForDepot & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse
    extends StObject
       with EMsg
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: typingsJapgolly.steamClient.mod.EMsg.MDSSetPublicVersionForDepotResponse & Double = js.native
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse
    extends StObject
       with EMsg
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: typingsJapgolly.steamClient.mod.EMsg.MDSToAMGetDepotDecryptionKeyResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSToCSFlushChunk
    extends StObject
       with EMsg
  /* 5844 */ val MDSToCSFlushChunk: typingsJapgolly.steamClient.mod.EMsg.MDSToCSFlushChunk & Double = js.native
  
  @js.native
  sealed trait MDSUpdateContentServerConfig
    extends StObject
       with EMsg
  /* 5835 */ val MDSUpdateContentServerConfig: typingsJapgolly.steamClient.mod.EMsg.MDSUpdateContentServerConfig & Double = js.native
  
  @js.native
  sealed trait MMSBase
    extends StObject
       with EMsg
  /* 6600 */ val MMSBase: typingsJapgolly.steamClient.mod.EMsg.MMSBase & Double = js.native
  
  @js.native
  sealed trait MPASBase
    extends StObject
       with EMsg
  /* 7100 */ val MPASBase: typingsJapgolly.steamClient.mod.EMsg.MPASBase & Double = js.native
  
  @js.native
  sealed trait MPASVacBanReset
    extends StObject
       with EMsg
  /* 7101 */ val MPASVacBanReset: typingsJapgolly.steamClient.mod.EMsg.MPASVacBanReset & Double = js.native
  
  @js.native
  sealed trait MarketingMessageUpdate
    extends StObject
       with EMsg
  /* 4216 */ val MarketingMessageUpdate: typingsJapgolly.steamClient.mod.EMsg.MarketingMessageUpdate & Double = js.native
  
  @js.native
  sealed trait Multi
    extends StObject
       with EMsg
  /* 1 */ val Multi: typingsJapgolly.steamClient.mod.EMsg.Multi & Double = js.native
  
  @js.native
  sealed trait NonStdMsgBase
    extends StObject
       with EMsg
  /* 6800 */ val NonStdMsgBase: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgBase & Double = js.native
  
  @js.native
  sealed trait NonStdMsgChase
    extends StObject
       with EMsg
  /* 6806 */ val NonStdMsgChase: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgChase & Double = js.native
  
  @js.native
  sealed trait NonStdMsgDFSTransfer
    extends StObject
       with EMsg
  /* 6807 */ val NonStdMsgDFSTransfer: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgDFSTransfer & Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPClient
    extends StObject
       with EMsg
  /* 6803 */ val NonStdMsgHTTPClient: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgHTTPClient & Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPServer
    extends StObject
       with EMsg
  /* 6802 */ val NonStdMsgHTTPServer: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgHTTPServer & Double = js.native
  
  // obsolete
  @js.native
  sealed trait NonStdMsgLogsink
    extends StObject
       with EMsg
  /* 6811 */ val NonStdMsgLogsink: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgLogsink & Double = js.native
  
  @js.native
  sealed trait NonStdMsgMemcached
    extends StObject
       with EMsg
  /* 6801 */ val NonStdMsgMemcached: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgMemcached & Double = js.native
  
  @js.native
  sealed trait NonStdMsgPHPSimulator
    extends StObject
       with EMsg
  /* 6805 */ val NonStdMsgPHPSimulator: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgPHPSimulator & Double = js.native
  
  @js.native
  sealed trait NonStdMsgRTMPServer
    extends StObject
       with EMsg
  /* 6813 */ val NonStdMsgRTMPServer: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgRTMPServer & Double = js.native
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator
    extends StObject
       with EMsg
  /* 6812 */ val NonStdMsgSteam2Emulator: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgSteam2Emulator & Double = js.native
  
  @js.native
  sealed trait NonStdMsgSyslog
    extends StObject
       with EMsg
  /* 6810 */ val NonStdMsgSyslog: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgSyslog & Double = js.native
  
  @js.native
  sealed trait NonStdMsgTests
    extends StObject
       with EMsg
  /* 6808 */ val NonStdMsgTests: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgTests & Double = js.native
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL
    extends StObject
       with EMsg
  /* 6809 */ val NonStdMsgUMQpipeAAPL: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgUMQpipeAAPL & Double = js.native
  
  @js.native
  sealed trait NonStdMsgWGResponse
    extends StObject
       with EMsg
  /* 6804 */ val NonStdMsgWGResponse: typingsJapgolly.steamClient.mod.EMsg.NonStdMsgWGResponse & Double = js.native
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity
    extends StObject
       with EMsg
  /* 4395 */ val NotificationOfSuspiciousActivity: typingsJapgolly.steamClient.mod.EMsg.NotificationOfSuspiciousActivity & Double = js.native
  
  @js.native
  sealed trait NotifyWatchdog
    extends StObject
       with EMsg
  /* 314 */ val NotifyWatchdog: typingsJapgolly.steamClient.mod.EMsg.NotifyWatchdog & Double = js.native
  
  @js.native
  sealed trait OGSBeginSession
    extends StObject
       with EMsg
  /* 3401 */ val OGSBeginSession: typingsJapgolly.steamClient.mod.EMsg.OGSBeginSession & Double = js.native
  
  @js.native
  sealed trait OGSBeginSessionResponse
    extends StObject
       with EMsg
  /* 3402 */ val OGSBeginSessionResponse: typingsJapgolly.steamClient.mod.EMsg.OGSBeginSessionResponse & Double = js.native
  
  @js.native
  sealed trait OGSEndSession
    extends StObject
       with EMsg
  /* 3403 */ val OGSEndSession: typingsJapgolly.steamClient.mod.EMsg.OGSEndSession & Double = js.native
  
  @js.native
  sealed trait OGSEndSessionResponse
    extends StObject
       with EMsg
  /* 3404 */ val OGSEndSessionResponse: typingsJapgolly.steamClient.mod.EMsg.OGSEndSessionResponse & Double = js.native
  
  @js.native
  sealed trait OGSWriteAppSessionRow
    extends StObject
       with EMsg
  /* 3406 */ val OGSWriteAppSessionRow: typingsJapgolly.steamClient.mod.EMsg.OGSWriteAppSessionRow & Double = js.native
  
  @js.native
  sealed trait P2PIntroducerMessage
    extends StObject
       with EMsg
  /* 2502 */ val P2PIntroducerMessage: typingsJapgolly.steamClient.mod.EMsg.P2PIntroducerMessage & Double = js.native
  
  @js.native
  sealed trait PICSBase
    extends StObject
       with EMsg
  /* 8900 */ val PICSBase: typingsJapgolly.steamClient.mod.EMsg.PICSBase & Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCart
    extends StObject
       with EMsg
  /* 5005 */ val PSAddPackageToShoppingCart: typingsJapgolly.steamClient.mod.EMsg.PSAddPackageToShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse
    extends StObject
       with EMsg
  /* 5006 */ val PSAddPackageToShoppingCartResponse: typingsJapgolly.steamClient.mod.EMsg.PSAddPackageToShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart
    extends StObject
       with EMsg
  /* 5011 */ val PSAddWalletCreditToShoppingCart: typingsJapgolly.steamClient.mod.EMsg.PSAddWalletCreditToShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse
    extends StObject
       with EMsg
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: typingsJapgolly.steamClient.mod.EMsg.PSAddWalletCreditToShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCart
    extends StObject
       with EMsg
  /* 5001 */ val PSCreateShoppingCart: typingsJapgolly.steamClient.mod.EMsg.PSCreateShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCartResponse
    extends StObject
       with EMsg
  /* 5002 */ val PSCreateShoppingCartResponse: typingsJapgolly.steamClient.mod.EMsg.PSCreateShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContents
    extends StObject
       with EMsg
  /* 5009 */ val PSGetShoppingCartContents: typingsJapgolly.steamClient.mod.EMsg.PSGetShoppingCartContents & Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse
    extends StObject
       with EMsg
  /* 5010 */ val PSGetShoppingCartContentsResponse: typingsJapgolly.steamClient.mod.EMsg.PSGetShoppingCartContentsResponse & Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCart
    extends StObject
       with EMsg
  /* 5003 */ val PSIsValidShoppingCart: typingsJapgolly.steamClient.mod.EMsg.PSIsValidShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse
    extends StObject
       with EMsg
  /* 5004 */ val PSIsValidShoppingCartResponse: typingsJapgolly.steamClient.mod.EMsg.PSIsValidShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart
    extends StObject
       with EMsg
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: typingsJapgolly.steamClient.mod.EMsg.PSRemoveLineItemFromShoppingCart & Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse
    extends StObject
       with EMsg
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: typingsJapgolly.steamClient.mod.EMsg.PSRemoveLineItemFromShoppingCartResponse & Double = js.native
  
  @js.native
  sealed trait PhysicalBoxInventory
    extends StObject
       with EMsg
  /* 321 */ val PhysicalBoxInventory: typingsJapgolly.steamClient.mod.EMsg.PhysicalBoxInventory & Double = js.native
  
  // obsolete
  @js.native
  sealed trait Ping
    extends StObject
       with EMsg
  /* 139 */ val Ping: typingsJapgolly.steamClient.mod.EMsg.Ping & Double = js.native
  
  @js.native
  sealed trait PingResponse
    extends StObject
       with EMsg
  /* 140 */ val PingResponse: typingsJapgolly.steamClient.mod.EMsg.PingResponse & Double = js.native
  
  @js.native
  sealed trait PrepareToExit
    extends StObject
       with EMsg
  /* 226 */ val PrepareToExit: typingsJapgolly.steamClient.mod.EMsg.PrepareToExit & Double = js.native
  
  @js.native
  sealed trait ProtobufWrapped
    extends StObject
       with EMsg
  /* 2 */ val ProtobufWrapped: typingsJapgolly.steamClient.mod.EMsg.ProtobufWrapped & Double = js.native
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries
    extends StObject
       with EMsg
  /* 234 */ val ProvideWindowsEventLogEntries: typingsJapgolly.steamClient.mod.EMsg.ProvideWindowsEventLogEntries & Double = js.native
  
  @js.native
  sealed trait QuestServerBase
    extends StObject
       with EMsg
  /* 9300 */ val QuestServerBase: typingsJapgolly.steamClient.mod.EMsg.QuestServerBase & Double = js.native
  
  @js.native
  sealed trait QueuedEmailsComplete
    extends StObject
       with EMsg
  /* 318 */ val QueuedEmailsComplete: typingsJapgolly.steamClient.mod.EMsg.QueuedEmailsComplete & Double = js.native
  
  @js.native
  sealed trait RMDeleteMemcachedKeys
    extends StObject
       with EMsg
  /* 7803 */ val RMDeleteMemcachedKeys: typingsJapgolly.steamClient.mod.EMsg.RMDeleteMemcachedKeys & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceAddTrigger
    extends StObject
       with EMsg
  /* 7806 */ val RMMsgTraceAddTrigger: typingsJapgolly.steamClient.mod.EMsg.RMMsgTraceAddTrigger & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceEvent
    extends StObject
       with EMsg
  /* 7808 */ val RMMsgTraceEvent: typingsJapgolly.steamClient.mod.EMsg.RMMsgTraceEvent & Double = js.native
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger
    extends StObject
       with EMsg
  /* 7807 */ val RMMsgTraceRemoveTrigger: typingsJapgolly.steamClient.mod.EMsg.RMMsgTraceRemoveTrigger & Double = js.native
  
  @js.native
  sealed trait RMRange
    extends StObject
       with EMsg
  /* 7800 */ val RMRange: typingsJapgolly.steamClient.mod.EMsg.RMRange & Double = js.native
  
  @js.native
  sealed trait RMRemoteInvoke
    extends StObject
       with EMsg
  /* 7804 */ val RMRemoteInvoke: typingsJapgolly.steamClient.mod.EMsg.RMRemoteInvoke & Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTP
    extends StObject
       with EMsg
  /* 7800 */ val RMTestVerisignOTP: typingsJapgolly.steamClient.mod.EMsg.RMTestVerisignOTP & Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTPResponse
    extends StObject
       with EMsg
  /* 7801 */ val RMTestVerisignOTPResponse: typingsJapgolly.steamClient.mod.EMsg.RMTestVerisignOTPResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientAcceptEULA
    extends StObject
       with EMsg
  /* 9509 */ val RemoteClientAcceptEULA: typingsJapgolly.steamClient.mod.EMsg.RemoteClientAcceptEULA & Double = js.native
  
  @js.native
  sealed trait RemoteClientAppStatus
    extends StObject
       with EMsg
  /* 9502 */ val RemoteClientAppStatus: typingsJapgolly.steamClient.mod.EMsg.RemoteClientAppStatus & Double = js.native
  
  @js.native
  sealed trait RemoteClientAuth
    extends StObject
       with EMsg
  /* 9500 */ val RemoteClientAuth: typingsJapgolly.steamClient.mod.EMsg.RemoteClientAuth & Double = js.native
  
  @js.native
  sealed trait RemoteClientAuthResponse
    extends StObject
       with EMsg
  /* 9501 */ val RemoteClientAuthResponse: typingsJapgolly.steamClient.mod.EMsg.RemoteClientAuthResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientBase
    extends StObject
       with EMsg
  /* 9500 */ val RemoteClientBase: typingsJapgolly.steamClient.mod.EMsg.RemoteClientBase & Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfig
    extends StObject
       with EMsg
  /* 9510 */ val RemoteClientGetControllerConfig: typingsJapgolly.steamClient.mod.EMsg.RemoteClientGetControllerConfig & Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne
    extends StObject
       with EMsg
  /* 9511 */ val RemoteClientGetControllerConfigResposne: typingsJapgolly.steamClient.mod.EMsg.RemoteClientGetControllerConfigResposne & Double = js.native
  
  @js.native
  sealed trait RemoteClientPing
    extends StObject
       with EMsg
  /* 9505 */ val RemoteClientPing: typingsJapgolly.steamClient.mod.EMsg.RemoteClientPing & Double = js.native
  
  @js.native
  sealed trait RemoteClientPingResponse
    extends StObject
       with EMsg
  /* 9506 */ val RemoteClientPingResponse: typingsJapgolly.steamClient.mod.EMsg.RemoteClientPingResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStream
    extends StObject
       with EMsg
  /* 9503 */ val RemoteClientStartStream: typingsJapgolly.steamClient.mod.EMsg.RemoteClientStartStream & Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStreamResponse
    extends StObject
       with EMsg
  /* 9504 */ val RemoteClientStartStreamResponse: typingsJapgolly.steamClient.mod.EMsg.RemoteClientStartStreamResponse & Double = js.native
  
  @js.native
  sealed trait RemoteClientStreamingEnabled
    extends StObject
       with EMsg
  /* 9512 */ val RemoteClientStreamingEnabled: typingsJapgolly.steamClient.mod.EMsg.RemoteClientStreamingEnabled & Double = js.native
  
  // obsolete
  @js.native
  sealed trait RemoteSysID
    extends StObject
       with EMsg
  /* 128 */ val RemoteSysID: typingsJapgolly.steamClient.mod.EMsg.RemoteSysID & Double = js.native
  
  @js.native
  sealed trait ReqChallenge
    extends StObject
       with EMsg
  /* 600 */ val ReqChallenge: typingsJapgolly.steamClient.mod.EMsg.ReqChallenge & Double = js.native
  
  @js.native
  sealed trait ReqChallengeTest
    extends StObject
       with EMsg
  /* 602 */ val ReqChallengeTest: typingsJapgolly.steamClient.mod.EMsg.ReqChallengeTest & Double = js.native
  
  @js.native
  sealed trait RequestFullStatsBlock
    extends StObject
       with EMsg
  /* 142 */ val RequestFullStatsBlock: typingsJapgolly.steamClient.mod.EMsg.RequestFullStatsBlock & Double = js.native
  
  @js.native
  sealed trait RequestStatHistory
    extends StObject
       with EMsg
  /* 1014 */ val RequestStatHistory: typingsJapgolly.steamClient.mod.EMsg.RequestStatHistory & Double = js.native
  
  @js.native
  sealed trait RequestWindowsEventLogEntries
    extends StObject
       with EMsg
  /* 233 */ val RequestWindowsEventLogEntries: typingsJapgolly.steamClient.mod.EMsg.RequestWindowsEventLogEntries & Double = js.native
  
  @js.native
  sealed trait RouteMessage
    extends StObject
       with EMsg
  /* 127 */ val RouteMessage: typingsJapgolly.steamClient.mod.EMsg.RouteMessage & Double = js.native
  
  @js.native
  sealed trait SCIDRequest
    extends StObject
       with EMsg
  /* 120 */ val SCIDRequest: typingsJapgolly.steamClient.mod.EMsg.SCIDRequest & Double = js.native
  
  @js.native
  sealed trait SCIDResponse
    extends StObject
       with EMsg
  /* 121 */ val SCIDResponse: typingsJapgolly.steamClient.mod.EMsg.SCIDResponse & Double = js.native
  
  // obsolete "renamed to SLCBase"
  @js.native
  sealed trait SLCBase
    extends StObject
       with EMsg
  /* 9400 */ val SLCBase: typingsJapgolly.steamClient.mod.EMsg.SLCBase & Double = js.native
  
  @js.native
  sealed trait SLCOwnerLibraryChanged
    extends StObject
       with EMsg
  /* 9407 */ val SLCOwnerLibraryChanged: typingsJapgolly.steamClient.mod.EMsg.SLCOwnerLibraryChanged & Double = js.native
  
  @js.native
  sealed trait SLCRequestUserSessionStatus
    extends StObject
       with EMsg
  /* 9401 */ val SLCRequestUserSessionStatus: typingsJapgolly.steamClient.mod.EMsg.SLCRequestUserSessionStatus & Double = js.native
  
  @js.native
  sealed trait SLCSharedLibraryChanged
    extends StObject
       with EMsg
  /* 9408 */ val SLCSharedLibraryChanged: typingsJapgolly.steamClient.mod.EMsg.SLCSharedLibraryChanged & Double = js.native
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus
    extends StObject
       with EMsg
  /* 9402 */ val SLCSharedLicensesLockStatus: typingsJapgolly.steamClient.mod.EMsg.SLCSharedLicensesLockStatus & Double = js.native
  
  @js.native
  sealed trait SLCUserSessionStatus
    extends StObject
       with EMsg
  /* 9400 */ val SLCUserSessionStatus: typingsJapgolly.steamClient.mod.EMsg.SLCUserSessionStatus & Double = js.native
  
  @js.native
  sealed trait SMExpensiveReport
    extends StObject
       with EMsg
  /* 2902 */ val SMExpensiveReport: typingsJapgolly.steamClient.mod.EMsg.SMExpensiveReport & Double = js.native
  
  @js.native
  sealed trait SMFishingReport
    extends StObject
       with EMsg
  /* 2904 */ val SMFishingReport: typingsJapgolly.steamClient.mod.EMsg.SMFishingReport & Double = js.native
  
  @js.native
  sealed trait SMGetSchemaConversionResults
    extends StObject
       with EMsg
  /* 2907 */ val SMGetSchemaConversionResults: typingsJapgolly.steamClient.mod.EMsg.SMGetSchemaConversionResults & Double = js.native
  
  // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse
    extends StObject
       with EMsg
  /* 2908 */ val SMGetSchemaConversionResultsResponse: typingsJapgolly.steamClient.mod.EMsg.SMGetSchemaConversionResultsResponse & Double = js.native
  
  @js.native
  sealed trait SMHourlyReport
    extends StObject
       with EMsg
  /* 2903 */ val SMHourlyReport: typingsJapgolly.steamClient.mod.EMsg.SMHourlyReport & Double = js.native
  
  @js.native
  sealed trait SMMonitorSpace
    extends StObject
       with EMsg
  /* 2906 */ val SMMonitorSpace: typingsJapgolly.steamClient.mod.EMsg.SMMonitorSpace & Double = js.native
  
  @js.native
  sealed trait SMPartitionRenames
    extends StObject
       with EMsg
  /* 2905 */ val SMPartitionRenames: typingsJapgolly.steamClient.mod.EMsg.SMPartitionRenames & Double = js.native
  
  @js.native
  sealed trait SecretsBase
    extends StObject
       with EMsg
  /* 8600 */ val SecretsBase: typingsJapgolly.steamClient.mod.EMsg.SecretsBase & Double = js.native
  
  @js.native
  sealed trait SecretsCredentialPairResponse
    extends StObject
       with EMsg
  /* 8601 */ val SecretsCredentialPairResponse: typingsJapgolly.steamClient.mod.EMsg.SecretsCredentialPairResponse & Double = js.native
  
  @js.native
  sealed trait SecretsRequestCredentialPair
    extends StObject
       with EMsg
  /* 8600 */ val SecretsRequestCredentialPair: typingsJapgolly.steamClient.mod.EMsg.SecretsRequestCredentialPair & Double = js.native
  
  @js.native
  sealed trait SecretsRequestServerIdentity
    extends StObject
       with EMsg
  /* 8602 */ val SecretsRequestServerIdentity: typingsJapgolly.steamClient.mod.EMsg.SecretsRequestServerIdentity & Double = js.native
  
  // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse
    extends StObject
       with EMsg
  /* 8603 */ val SecretsServerIdentityResponse: typingsJapgolly.steamClient.mod.EMsg.SecretsServerIdentityResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities
    extends StObject
       with EMsg
  /* 8604 */ val SecretsUpdateServerIdentities: typingsJapgolly.steamClient.mod.EMsg.SecretsUpdateServerIdentities & Double = js.native
  
  @js.native
  sealed trait ServiceMethod
    extends StObject
       with EMsg
  /* 146 */ val ServiceMethod: typingsJapgolly.steamClient.mod.EMsg.ServiceMethod & Double = js.native
  
  @js.native
  sealed trait ServiceMethodResponse
    extends StObject
       with EMsg
  /* 147 */ val ServiceMethodResponse: typingsJapgolly.steamClient.mod.EMsg.ServiceMethodResponse & Double = js.native
  
  @js.native
  sealed trait SetTestFlag
    extends StObject
       with EMsg
  /* 317 */ val SetTestFlag: typingsJapgolly.steamClient.mod.EMsg.SetTestFlag & Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdates
    extends StObject
       with EMsg
  /* 237 */ val ShellCheckWindowsUpdates: typingsJapgolly.steamClient.mod.EMsg.ShellCheckWindowsUpdates & Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse
    extends StObject
       with EMsg
  /* 238 */ val ShellCheckWindowsUpdatesResponse: typingsJapgolly.steamClient.mod.EMsg.ShellCheckWindowsUpdatesResponse & Double = js.native
  
  @js.native
  sealed trait ShellConfigInfoUpdate
    extends StObject
       with EMsg
  /* 230 */ val ShellConfigInfoUpdate: typingsJapgolly.steamClient.mod.EMsg.ShellConfigInfoUpdate & Double = js.native
  
  @js.native
  sealed trait ShellFailed
    extends StObject
       with EMsg
  /* 301 */ val ShellFailed: typingsJapgolly.steamClient.mod.EMsg.ShellFailed & Double = js.native
  
  @js.native
  sealed trait ShellFlushUserLicenseCache
    extends StObject
       with EMsg
  /* 239 */ val ShellFlushUserLicenseCache: typingsJapgolly.steamClient.mod.EMsg.ShellFlushUserLicenseCache & Double = js.native
  
  @js.native
  sealed trait ShellSearchLogs
    extends StObject
       with EMsg
  /* 235 */ val ShellSearchLogs: typingsJapgolly.steamClient.mod.EMsg.ShellSearchLogs & Double = js.native
  
  @js.native
  sealed trait ShellSearchLogsResponse
    extends StObject
       with EMsg
  /* 236 */ val ShellSearchLogsResponse: typingsJapgolly.steamClient.mod.EMsg.ShellSearchLogsResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait StatHistory
    extends StObject
       with EMsg
  /* 1015 */ val StatHistory: typingsJapgolly.steamClient.mod.EMsg.StatHistory & Double = js.native
  
  @js.native
  sealed trait Stats
    extends StObject
       with EMsg
  /* 141 */ val Stats: typingsJapgolly.steamClient.mod.EMsg.Stats & Double = js.native
  
  @js.native
  sealed trait StatsDeprecated
    extends StObject
       with EMsg
  /* 138 */ val StatsDeprecated: typingsJapgolly.steamClient.mod.EMsg.StatsDeprecated & Double = js.native
  
  @js.native
  sealed trait StoreBase
    extends StObject
       with EMsg
  /* 8000 */ val StoreBase: typingsJapgolly.steamClient.mod.EMsg.StoreBase & Double = js.native
  
  @js.native
  sealed trait StoreUpdateRecommendationCount
    extends StObject
       with EMsg
  /* 8000 */ val StoreUpdateRecommendationCount: typingsJapgolly.steamClient.mod.EMsg.StoreUpdateRecommendationCount & Double = js.native
  
  @js.native
  sealed trait Subscribe
    extends StObject
       with EMsg
  /* 126 */ val Subscribe: typingsJapgolly.steamClient.mod.EMsg.Subscribe & Double = js.native
  
  @js.native
  sealed trait TestInitDB
    extends StObject
       with EMsg
  /* 323 */ val TestInitDB: typingsJapgolly.steamClient.mod.EMsg.TestInitDB & Double = js.native
  
  @js.native
  sealed trait TestResetServer
    extends StObject
       with EMsg
  /* 228 */ val TestResetServer: typingsJapgolly.steamClient.mod.EMsg.TestResetServer & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcess
    extends StObject
       with EMsg
  /* 9200 */ val TestWorkerProcess: typingsJapgolly.steamClient.mod.EMsg.TestWorkerProcess & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest
    extends StObject
       with EMsg
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: typingsJapgolly.steamClient.mod.EMsg.TestWorkerProcessLoadUnloadModuleRequest & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse
    extends StObject
       with EMsg
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: typingsJapgolly.steamClient.mod.EMsg.TestWorkerProcessLoadUnloadModuleResponse & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest
    extends StObject
       with EMsg
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: typingsJapgolly.steamClient.mod.EMsg.TestWorkerProcessServiceModuleCallRequest & Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse
    extends StObject
       with EMsg
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: typingsJapgolly.steamClient.mod.EMsg.TestWorkerProcessServiceModuleCallResponse & Double = js.native
  
  @js.native
  sealed trait TimestampRequest
    extends StObject
       with EMsg
  /* 149 */ val TimestampRequest: typingsJapgolly.steamClient.mod.EMsg.TimestampRequest & Double = js.native
  
  @js.native
  sealed trait TimestampResponse
    extends StObject
       with EMsg
  /* 150 */ val TimestampResponse: typingsJapgolly.steamClient.mod.EMsg.TimestampResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot
    extends StObject
       with EMsg
  /* 7335 */ val UCMAddTaggedScreenshot: typingsJapgolly.steamClient.mod.EMsg.UCMAddTaggedScreenshot & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMBase
    extends StObject
       with EMsg
  /* 7300 */ val UCMBase: typingsJapgolly.steamClient.mod.EMsg.UCMBase & Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldScreenshot
    extends StObject
       with EMsg
  /* 7372 */ val UCMDeleteOldScreenshot: typingsJapgolly.steamClient.mod.EMsg.UCMDeleteOldScreenshot & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse
    extends StObject
       with EMsg
  /* 7373 */ val UCMDeleteOldScreenshotResponse: typingsJapgolly.steamClient.mod.EMsg.UCMDeleteOldScreenshotResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo
    extends StObject
       with EMsg
  /* 7374 */ val UCMDeleteOldVideo: typingsJapgolly.steamClient.mod.EMsg.UCMDeleteOldVideo & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse
    extends StObject
       with EMsg
  /* 7375 */ val UCMDeleteOldVideoResponse: typingsJapgolly.steamClient.mod.EMsg.UCMDeleteOldVideoResponse & Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFile
    extends StObject
       with EMsg
  /* 7329 */ val UCMDeletePublishedFile: typingsJapgolly.steamClient.mod.EMsg.UCMDeletePublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse
    extends StObject
       with EMsg
  /* 7330 */ val UCMDeletePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.UCMDeletePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMFixStatsPublishedFile
    extends StObject
       with EMsg
  /* 7371 */ val UCMFixStatsPublishedFile: typingsJapgolly.steamClient.mod.EMsg.UCMFixStatsPublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMGetPublishedFilesForUser
    extends StObject
       with EMsg
  /* 7362 */ val UCMGetPublishedFilesForUser: typingsJapgolly.steamClient.mod.EMsg.UCMGetPublishedFilesForUser & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse
    extends StObject
       with EMsg
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: typingsJapgolly.steamClient.mod.EMsg.UCMGetPublishedFilesForUserResponse & Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles
    extends StObject
       with EMsg
  /* 7369 */ val UCMGetUserSubscribedFiles: typingsJapgolly.steamClient.mod.EMsg.UCMGetUserSubscribedFiles & Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse
    extends StObject
       with EMsg
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: typingsJapgolly.steamClient.mod.EMsg.UCMGetUserSubscribedFilesResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishFile
    extends StObject
       with EMsg
  /* 7351 */ val UCMPublishFile: typingsJapgolly.steamClient.mod.EMsg.UCMPublishFile & Double = js.native
  
  @js.native
  sealed trait UCMPublishFileResponse
    extends StObject
       with EMsg
  /* 7352 */ val UCMPublishFileResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAdd
    extends StObject
       with EMsg
  /* 7353 */ val UCMPublishedFileChildAdd: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildAdd & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse
    extends StObject
       with EMsg
  /* 7354 */ val UCMPublishedFileChildAddResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildAddResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder
    extends StObject
       with EMsg
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildChangeSortOrder & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse
    extends StObject
       with EMsg
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildChangeSortOrderResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemove
    extends StObject
       with EMsg
  /* 7355 */ val UCMPublishedFileChildRemove: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildRemove & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse
    extends StObject
       with EMsg
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileChildRemoveResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated
    extends StObject
       with EMsg
  /* 7380 */ val UCMPublishedFileContentUpdated: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileContentUpdated & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFileParentChanged
    extends StObject
       with EMsg
  /* 7359 */ val UCMPublishedFileParentChanged: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileParentChanged & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd
    extends StObject
       with EMsg
  /* 7341 */ val UCMPublishedFilePreviewAdd: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewAdd & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse
    extends StObject
       with EMsg
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewAddResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder
    extends StObject
       with EMsg
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewChangeSortOrder & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse
    extends StObject
       with EMsg
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewChangeSortOrderResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove
    extends StObject
       with EMsg
  /* 7343 */ val UCMPublishedFilePreviewRemove: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewRemove & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse
    extends StObject
       with EMsg
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFilePreviewRemoveResponse & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileReported
    extends StObject
       with EMsg
  /* 7339 */ val UCMPublishedFileReported: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileReported & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileSubscribed
    extends StObject
       with EMsg
  /* 7349 */ val UCMPublishedFileSubscribed: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileSubscribed & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed
    extends StObject
       with EMsg
  /* 7350 */ val UCMPublishedFileUnsubscribed: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileUnsubscribed & Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUpdated
    extends StObject
       with EMsg
  /* 7381 */ val UCMPublishedFileUpdated: typingsJapgolly.steamClient.mod.EMsg.UCMPublishedFileUpdated & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMReloadPublishedFile
    extends StObject
       with EMsg
  /* 7337 */ val UCMReloadPublishedFile: typingsJapgolly.steamClient.mod.EMsg.UCMReloadPublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMReloadUserFileListCaches
    extends StObject
       with EMsg
  /* 7338 */ val UCMReloadUserFileListCaches: typingsJapgolly.steamClient.mod.EMsg.UCMReloadUserFileListCaches & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot
    extends StObject
       with EMsg
  /* 7336 */ val UCMRemoveTaggedScreenshot: typingsJapgolly.steamClient.mod.EMsg.UCMRemoveTaggedScreenshot & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMResetCommunityContent
    extends StObject
       with EMsg
  /* 7307 */ val UCMResetCommunityContent: typingsJapgolly.steamClient.mod.EMsg.UCMResetCommunityContent & Double = js.native
  
  @js.native
  sealed trait UCMResetCommunityContentResponse
    extends StObject
       with EMsg
  /* 7308 */ val UCMResetCommunityContentResponse: typingsJapgolly.steamClient.mod.EMsg.UCMResetCommunityContentResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy
    extends StObject
       with EMsg
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: typingsJapgolly.steamClient.mod.EMsg.UCMUpdateOldScreenshotPrivacy & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse
    extends StObject
       with EMsg
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: typingsJapgolly.steamClient.mod.EMsg.UCMUpdateOldScreenshotPrivacyResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFile
    extends StObject
       with EMsg
  /* 7327 */ val UCMUpdatePublishedFile: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFile & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan
    extends StObject
       with EMsg
  /* 7332 */ val UCMUpdatePublishedFileBan: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFileBan & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse
    extends StObject
       with EMsg
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFileBanResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus
    extends StObject
       with EMsg
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFileIncompatibleStatus & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse
    extends StObject
       with EMsg
  /* 7328 */ val UCMUpdatePublishedFileResponse: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFileResponse & Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat
    extends StObject
       with EMsg
  /* 7331 */ val UCMUpdatePublishedFileStat: typingsJapgolly.steamClient.mod.EMsg.UCMUpdatePublishedFileStat & Double = js.native
  
  @js.native
  sealed trait UCMUpdateTaggedScreenshot
    extends StObject
       with EMsg
  /* 7334 */ val UCMUpdateTaggedScreenshot: typingsJapgolly.steamClient.mod.EMsg.UCMUpdateTaggedScreenshot & Double = js.native
  
  @js.native
  sealed trait UCMValidateObjectExists
    extends StObject
       with EMsg
  /* 7303 */ val UCMValidateObjectExists: typingsJapgolly.steamClient.mod.EMsg.UCMValidateObjectExists & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse
    extends StObject
       with EMsg
  /* 7304 */ val UCMValidateObjectExistsResponse: typingsJapgolly.steamClient.mod.EMsg.UCMValidateObjectExistsResponse & Double = js.native
  
  @js.native
  sealed trait UDSBase
    extends StObject
       with EMsg
  /* 7000 */ val UDSBase: typingsJapgolly.steamClient.mod.EMsg.UDSBase & Double = js.native
  
  @js.native
  sealed trait UDSFindSession
    extends StObject
       with EMsg
  /* 7006 */ val UDSFindSession: typingsJapgolly.steamClient.mod.EMsg.UDSFindSession & Double = js.native
  
  @js.native
  sealed trait UDSFindSessionResponse
    extends StObject
       with EMsg
  /* 7007 */ val UDSFindSessionResponse: typingsJapgolly.steamClient.mod.EMsg.UDSFindSessionResponse & Double = js.native
  
  // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSHasSession
    extends StObject
       with EMsg
  /* 7006 */ val UDSHasSession: typingsJapgolly.steamClient.mod.EMsg.UDSHasSession & Double = js.native
  
  // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSHasSessionResponse
    extends StObject
       with EMsg
  /* 7007 */ val UDSHasSessionResponse: typingsJapgolly.steamClient.mod.EMsg.UDSHasSessionResponse & Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuth
    extends StObject
       with EMsg
  /* 7003 */ val UDSRenderUserAuth: typingsJapgolly.steamClient.mod.EMsg.UDSRenderUserAuth & Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuthResponse
    extends StObject
       with EMsg
  /* 7004 */ val UDSRenderUserAuthResponse: typingsJapgolly.steamClient.mod.EMsg.UDSRenderUserAuthResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UFSDownloadChunk
    extends StObject
       with EMsg
  /* 5223 */ val UFSDownloadChunk: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadChunk & Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkRequest
    extends StObject
       with EMsg
  /* 5246 */ val UFSDownloadChunkRequest: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadChunkRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkResponse
    extends StObject
       with EMsg
  /* 5247 */ val UFSDownloadChunkResponse: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadChunkResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishRequest
    extends StObject
       with EMsg
  /* 5248 */ val UFSDownloadFinishRequest: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadFinishRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishResponse
    extends StObject
       with EMsg
  /* 5249 */ val UFSDownloadFinishResponse: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadFinishResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadRequest
    extends StObject
       with EMsg
  /* 5221 */ val UFSDownloadRequest: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UFSDownloadResponse
    extends StObject
       with EMsg
  /* 5222 */ val UFSDownloadResponse: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadResponse & Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartRequest
    extends StObject
       with EMsg
  /* 5244 */ val UFSDownloadStartRequest: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadStartRequest & Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartResponse
    extends StObject
       with EMsg
  /* 5245 */ val UFSDownloadStartResponse: typingsJapgolly.steamClient.mod.EMsg.UFSDownloadStartResponse & Double = js.native
  
  @js.native
  sealed trait UFSFlushURLCache
    extends StObject
       with EMsg
  /* 5250 */ val UFSFlushURLCache: typingsJapgolly.steamClient.mod.EMsg.UFSFlushURLCache & Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLs
    extends StObject
       with EMsg
  /* 5240 */ val UFSGetUGCURLs: typingsJapgolly.steamClient.mod.EMsg.UFSGetUGCURLs & Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLsResponse
    extends StObject
       with EMsg
  /* 5241 */ val UFSGetUGCURLsResponse: typingsJapgolly.steamClient.mod.EMsg.UFSGetUGCURLsResponse & Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest
    extends StObject
       with EMsg
  /* 5242 */ val UFSHttpUploadFileFinishRequest: typingsJapgolly.steamClient.mod.EMsg.UFSHttpUploadFileFinishRequest & Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse
    extends StObject
       with EMsg
  /* 5243 */ val UFSHttpUploadFileFinishResponse: typingsJapgolly.steamClient.mod.EMsg.UFSHttpUploadFileFinishResponse & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFile
    extends StObject
       with EMsg
  /* 5238 */ val UFSMigrateFile: typingsJapgolly.steamClient.mod.EMsg.UFSMigrateFile & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppID
    extends StObject
       with EMsg
  /* 5253 */ val UFSMigrateFileAppID: typingsJapgolly.steamClient.mod.EMsg.UFSMigrateFileAppID & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse
    extends StObject
       with EMsg
  /* 5254 */ val UFSMigrateFileAppIDResponse: typingsJapgolly.steamClient.mod.EMsg.UFSMigrateFileAppIDResponse & Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileResponse
    extends StObject
       with EMsg
  /* 5239 */ val UFSMigrateFileResponse: typingsJapgolly.steamClient.mod.EMsg.UFSMigrateFileResponse & Double = js.native
  
  @js.native
  sealed trait UFSReloadAccount
    extends StObject
       with EMsg
  /* 5234 */ val UFSReloadAccount: typingsJapgolly.steamClient.mod.EMsg.UFSReloadAccount & Double = js.native
  
  @js.native
  sealed trait UFSReloadAccountResponse
    extends StObject
       with EMsg
  /* 5235 */ val UFSReloadAccountResponse: typingsJapgolly.steamClient.mod.EMsg.UFSReloadAccountResponse & Double = js.native
  
  @js.native
  sealed trait UFSReloadPartitionInfo
    extends StObject
       with EMsg
  /* 5215 */ val UFSReloadPartitionInfo: typingsJapgolly.steamClient.mod.EMsg.UFSReloadPartitionInfo & Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFile
    extends StObject
       with EMsg
  /* 5217 */ val UFSSynchronizeFile: typingsJapgolly.steamClient.mod.EMsg.UFSSynchronizeFile & Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFileResponse
    extends StObject
       with EMsg
  /* 5218 */ val UFSSynchronizeFileResponse: typingsJapgolly.steamClient.mod.EMsg.UFSSynchronizeFileResponse & Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlags
    extends StObject
       with EMsg
  /* 5228 */ val UFSUpdateFileFlags: typingsJapgolly.steamClient.mod.EMsg.UFSUpdateFileFlags & Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse
    extends StObject
       with EMsg
  /* 5229 */ val UFSUpdateFileFlagsResponse: typingsJapgolly.steamClient.mod.EMsg.UFSUpdateFileFlagsResponse & Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatched
    extends StObject
       with EMsg
  /* 5236 */ val UFSUpdateRecordBatched: typingsJapgolly.steamClient.mod.EMsg.UFSUpdateRecordBatched & Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse
    extends StObject
       with EMsg
  /* 5237 */ val UFSUpdateRecordBatchedResponse: typingsJapgolly.steamClient.mod.EMsg.UFSUpdateRecordBatchedResponse & Double = js.native
  
  @js.native
  sealed trait UFSUploadCommit
    extends StObject
       with EMsg
  /* 5251 */ val UFSUploadCommit: typingsJapgolly.steamClient.mod.EMsg.UFSUploadCommit & Double = js.native
  
  @js.native
  sealed trait UFSUploadCommitResponse
    extends StObject
       with EMsg
  /* 5252 */ val UFSUploadCommitResponse: typingsJapgolly.steamClient.mod.EMsg.UFSUploadCommitResponse & Double = js.native
  
  @js.native
  sealed trait UGSBase
    extends StObject
       with EMsg
  /* 7900 */ val UGSBase: typingsJapgolly.steamClient.mod.EMsg.UGSBase & Double = js.native
  
  @js.native
  sealed trait UGSUpdateGlobalStats
    extends StObject
       with EMsg
  /* 7900 */ val UGSUpdateGlobalStats: typingsJapgolly.steamClient.mod.EMsg.UGSUpdateGlobalStats & Double = js.native
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch
    extends StObject
       with EMsg
  /* 8108 */ val UMQ2AM_ClientMsgBatch: typingsJapgolly.steamClient.mod.EMsg.UMQ2AM_ClientMsgBatch & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UMQBase
    extends StObject
       with EMsg
  /* 8100 */ val UMQBase: typingsJapgolly.steamClient.mod.EMsg.UMQBase & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements
    extends StObject
       with EMsg
  /* 8110 */ val UMQEnqueueMobileAnnouncements: typingsJapgolly.steamClient.mod.EMsg.UMQEnqueueMobileAnnouncements & Double = js.native
  
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions
    extends StObject
       with EMsg
  /* 8109 */ val UMQEnqueueMobileSalePromotions: typingsJapgolly.steamClient.mod.EMsg.UMQEnqueueMobileSalePromotions & Double = js.native
  
  @js.native
  sealed trait UMQIncomingChatMessage
    extends StObject
       with EMsg
  /* 8105 */ val UMQIncomingChatMessage: typingsJapgolly.steamClient.mod.EMsg.UMQIncomingChatMessage & Double = js.native
  
  @js.native
  sealed trait UMQLogoffRequest
    extends StObject
       with EMsg
  /* 8102 */ val UMQLogoffRequest: typingsJapgolly.steamClient.mod.EMsg.UMQLogoffRequest & Double = js.native
  
  @js.native
  sealed trait UMQLogoffResponse
    extends StObject
       with EMsg
  /* 8103 */ val UMQLogoffResponse: typingsJapgolly.steamClient.mod.EMsg.UMQLogoffResponse & Double = js.native
  
  @js.native
  sealed trait UMQLogonRequest
    extends StObject
       with EMsg
  /* 8100 */ val UMQLogonRequest: typingsJapgolly.steamClient.mod.EMsg.UMQLogonRequest & Double = js.native
  
  @js.native
  sealed trait UMQLogonResponse
    extends StObject
       with EMsg
  /* 8101 */ val UMQLogonResponse: typingsJapgolly.steamClient.mod.EMsg.UMQLogonResponse & Double = js.native
  
  @js.native
  sealed trait UMQPoll
    extends StObject
       with EMsg
  /* 8106 */ val UMQPoll: typingsJapgolly.steamClient.mod.EMsg.UMQPoll & Double = js.native
  
  @js.native
  sealed trait UMQPollResults
    extends StObject
       with EMsg
  /* 8107 */ val UMQPollResults: typingsJapgolly.steamClient.mod.EMsg.UMQPollResults & Double = js.native
  
  @js.native
  sealed trait UMQSendChatMessage
    extends StObject
       with EMsg
  /* 8104 */ val UMQSendChatMessage: typingsJapgolly.steamClient.mod.EMsg.UMQSendChatMessage & Double = js.native
  
  @js.native
  sealed trait UniverseChanged
    extends StObject
       with EMsg
  /* 229 */ val UniverseChanged: typingsJapgolly.steamClient.mod.EMsg.UniverseChanged & Double = js.native
  
  // obsolete
  @js.native
  sealed trait UniverseData
    extends StObject
       with EMsg
  /* 1010 */ val UniverseData: typingsJapgolly.steamClient.mod.EMsg.UniverseData & Double = js.native
  
  @js.native
  sealed trait UpdateConfigFile
    extends StObject
       with EMsg
  /* 322 */ val UpdateConfigFile: typingsJapgolly.steamClient.mod.EMsg.UpdateConfigFile & Double = js.native
  
  @js.native
  sealed trait UpdateCreditCardRequest
    extends StObject
       with EMsg
  /* 221 */ val UpdateCreditCardRequest: typingsJapgolly.steamClient.mod.EMsg.UpdateCreditCardRequest & Double = js.native
  
  @js.native
  sealed trait UpdateRecordResponse
    extends StObject
       with EMsg
  /* 215 */ val UpdateRecordResponse: typingsJapgolly.steamClient.mod.EMsg.UpdateRecordResponse & Double = js.native
  
  @js.native
  sealed trait UpdateUserBanResponse
    extends StObject
       with EMsg
  /* 225 */ val UpdateUserBanResponse: typingsJapgolly.steamClient.mod.EMsg.UpdateUserBanResponse & Double = js.native
  
  @js.native
  sealed trait VACResponse
    extends StObject
       with EMsg
  /* 601 */ val VACResponse: typingsJapgolly.steamClient.mod.EMsg.VACResponse & Double = js.native
  
  @js.native
  sealed trait VSAddCheat
    extends StObject
       with EMsg
  /* 605 */ val VSAddCheat: typingsJapgolly.steamClient.mod.EMsg.VSAddCheat & Double = js.native
  
  @js.native
  sealed trait VSChallengeResultText
    extends StObject
       with EMsg
  /* 608 */ val VSChallengeResultText: typingsJapgolly.steamClient.mod.EMsg.VSChallengeResultText & Double = js.native
  
  @js.native
  sealed trait VSGetChallengeResults
    extends StObject
       with EMsg
  /* 607 */ val VSGetChallengeResults: typingsJapgolly.steamClient.mod.EMsg.VSGetChallengeResults & Double = js.native
  
  @js.native
  sealed trait VSLoadDBFinished
    extends StObject
       with EMsg
  /* 611 */ val VSLoadDBFinished: typingsJapgolly.steamClient.mod.EMsg.VSLoadDBFinished & Double = js.native
  
  @js.native
  sealed trait VSMarkCheat
    extends StObject
       with EMsg
  /* 604 */ val VSMarkCheat: typingsJapgolly.steamClient.mod.EMsg.VSMarkCheat & Double = js.native
  
  @js.native
  sealed trait VSPurgeCodeModDB
    extends StObject
       with EMsg
  /* 606 */ val VSPurgeCodeModDB: typingsJapgolly.steamClient.mod.EMsg.VSPurgeCodeModDB & Double = js.native
  
  @js.native
  sealed trait VSReportLingerer
    extends StObject
       with EMsg
  /* 609 */ val VSReportLingerer: typingsJapgolly.steamClient.mod.EMsg.VSReportLingerer & Double = js.native
  
  @js.native
  sealed trait VSRequestManagedChallenge
    extends StObject
       with EMsg
  /* 610 */ val VSRequestManagedChallenge: typingsJapgolly.steamClient.mod.EMsg.VSRequestManagedChallenge & Double = js.native
  
  @js.native
  sealed trait WGRequest
    extends StObject
       with EMsg
  /* 130 */ val WGRequest: typingsJapgolly.steamClient.mod.EMsg.WGRequest & Double = js.native
  
  @js.native
  sealed trait WGResponse
    extends StObject
       with EMsg
  /* 131 */ val WGResponse: typingsJapgolly.steamClient.mod.EMsg.WGResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait WebAPIBase
    extends StObject
       with EMsg
  /* 8300 */ val WebAPIBase: typingsJapgolly.steamClient.mod.EMsg.WebAPIBase & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache
    extends StObject
       with EMsg
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: typingsJapgolly.steamClient.mod.EMsg.WebAPIInvalidateOAuthClientCache & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache
    extends StObject
       with EMsg
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: typingsJapgolly.steamClient.mod.EMsg.WebAPIInvalidateOAuthTokenCache & Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount
    extends StObject
       with EMsg
  /* 8302 */ val WebAPIInvalidateTokensForAccount: typingsJapgolly.steamClient.mod.EMsg.WebAPIInvalidateTokensForAccount & Double = js.native
  
  @js.native
  sealed trait WebAPIJobRequest
    extends StObject
       with EMsg
  /* 133 */ val WebAPIJobRequest: typingsJapgolly.steamClient.mod.EMsg.WebAPIJobRequest & Double = js.native
  
  @js.native
  sealed trait WebAPIJobResponse
    extends StObject
       with EMsg
  /* 134 */ val WebAPIJobResponse: typingsJapgolly.steamClient.mod.EMsg.WebAPIJobResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait WebAPIRegisterGCInterfaces
    extends StObject
       with EMsg
  /* 8303 */ val WebAPIRegisterGCInterfaces: typingsJapgolly.steamClient.mod.EMsg.WebAPIRegisterGCInterfaces & Double = js.native
  
  @js.native
  sealed trait WebAPISetSecrets
    extends StObject
       with EMsg
  /* 8306 */ val WebAPISetSecrets: typingsJapgolly.steamClient.mod.EMsg.WebAPISetSecrets & Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token
    extends StObject
       with EMsg
  /* 8300 */ val WebAPIValidateOAuth2Token: typingsJapgolly.steamClient.mod.EMsg.WebAPIValidateOAuth2Token & Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse
    extends StObject
       with EMsg
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: typingsJapgolly.steamClient.mod.EMsg.WebAPIValidateOAuth2TokenResponse & Double = js.native
  
  @js.native
  sealed trait WorkerProcess
    extends StObject
       with EMsg
  /* 9000 */ val WorkerProcess: typingsJapgolly.steamClient.mod.EMsg.WorkerProcess & Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingRequest
    extends StObject
       with EMsg
  /* 9000 */ val WorkerProcessPingRequest: typingsJapgolly.steamClient.mod.EMsg.WorkerProcessPingRequest & Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingResponse
    extends StObject
       with EMsg
  /* 9001 */ val WorkerProcessPingResponse: typingsJapgolly.steamClient.mod.EMsg.WorkerProcessPingResponse & Double = js.native
  
  @js.native
  sealed trait WorkerProcessShutdown
    extends StObject
       with EMsg
  /* 9002 */ val WorkerProcessShutdown: typingsJapgolly.steamClient.mod.EMsg.WorkerProcessShutdown & Double = js.native
  
  @js.native
  sealed trait WorkshopAcceptTOSRequest
    extends StObject
       with EMsg
  /* 8200 */ val WorkshopAcceptTOSRequest: typingsJapgolly.steamClient.mod.EMsg.WorkshopAcceptTOSRequest & Double = js.native
  
  // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse
    extends StObject
       with EMsg
  /* 8201 */ val WorkshopAcceptTOSResponse: typingsJapgolly.steamClient.mod.EMsg.WorkshopAcceptTOSResponse & Double = js.native
  
  // obsolete
  @js.native
  sealed trait WorkshopBase
    extends StObject
       with EMsg
  /* 8200 */ val WorkshopBase: typingsJapgolly.steamClient.mod.EMsg.WorkshopBase & Double = js.native
  
  @js.native
  sealed trait ZipRequest
    extends StObject
       with EMsg
  /* 204 */ val ZipRequest: typingsJapgolly.steamClient.mod.EMsg.ZipRequest & Double = js.native
  
  @js.native
  sealed trait ZipResponse
    extends StObject
       with EMsg
  /* 205 */ val ZipResponse: typingsJapgolly.steamClient.mod.EMsg.ZipResponse & Double = js.native
}
