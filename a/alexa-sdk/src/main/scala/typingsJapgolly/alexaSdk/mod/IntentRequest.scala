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

trait IntentRequest extends Request {
  var dialogState: js.UndefOr[DialogStates] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
}

object IntentRequest {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typingsJapgolly.alexaSdk.alexaSdkStrings.LaunchRequest | typingsJapgolly.alexaSdk.alexaSdkStrings.IntentRequest | typingsJapgolly.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    dialogState: DialogStates = null,
    intent: Intent = null,
    locale: String = null
  ): IntentRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dialogState != null) __obj.updateDynamic("dialogState")(dialogState.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRequest]
  }
}

