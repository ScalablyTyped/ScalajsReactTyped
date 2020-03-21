package typingsJapgolly.alexaSdk.mod

import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsCreated
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsDeleted
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsUpdated
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListCreated
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListDeleted
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListUpdated
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillAccountLinked
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillDisabled
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillEnabled
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionAccepted
import typingsJapgolly.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionChanged
import typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackFinished
import typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackNearlyFinished
import typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStarted
import typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStopped
import typingsJapgolly.alexaSdk.alexaSdkStrings.PlaybackControllerDotNextCommandIssued
import typingsJapgolly.alexaSdk.alexaSdkStrings.PlaybackControllerDotPauseCommandIssued
import typingsJapgolly.alexaSdk.alexaSdkStrings.PlaybackControllerDotPlayCommandIssued
import typingsJapgolly.alexaSdk.alexaSdkStrings.PlaybackControllerDotPreviousCommandIssued
import typingsJapgolly.alexaSdk.alexaSdkStrings.SystemDotExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayerPlaybackRequest extends Request {
  var offsetInMilliseconds: Double
  var token: String
}

object AudioPlayerPlaybackRequest {
  @scala.inline
  def apply(
    offsetInMilliseconds: Double,
    requestId: String,
    timestamp: String,
    token: String,
    `type`: typingsJapgolly.alexaSdk.alexaSdkStrings.LaunchRequest | typingsJapgolly.alexaSdk.alexaSdkStrings.IntentRequest | typingsJapgolly.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    locale: String = null
  ): AudioPlayerPlaybackRequest = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerPlaybackRequest]
  }
}

