package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUpdateResponse extends js.Object {
  /** Any batch-wide failures which occurred applying updates. */
  var batchFailures: js.UndefOr[js.Array[EventBatchRecordFailure]] = js.undefined
  /** Any failures updating a particular event. */
  var eventFailures: js.UndefOr[js.Array[EventRecordFailure]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventUpdateResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The current status of any updated events */
  var playerEvents: js.UndefOr[js.Array[PlayerEvent]] = js.undefined
}

object EventUpdateResponse {
  @scala.inline
  def apply(
    batchFailures: js.Array[EventBatchRecordFailure] = null,
    eventFailures: js.Array[EventRecordFailure] = null,
    kind: String = null,
    playerEvents: js.Array[PlayerEvent] = null
  ): EventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (batchFailures != null) __obj.updateDynamic("batchFailures")(batchFailures.asInstanceOf[js.Any])
    if (eventFailures != null) __obj.updateDynamic("eventFailures")(eventFailures.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playerEvents != null) __obj.updateDynamic("playerEvents")(playerEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUpdateResponse]
  }
}

