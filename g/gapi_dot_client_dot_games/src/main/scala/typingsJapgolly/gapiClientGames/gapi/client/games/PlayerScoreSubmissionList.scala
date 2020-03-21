package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreSubmissionList extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreSubmissionList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The score submissions. */
  var scores: js.UndefOr[js.Array[ScoreSubmission]] = js.undefined
}

object PlayerScoreSubmissionList {
  @scala.inline
  def apply(kind: String = null, scores: js.Array[ScoreSubmission] = null): PlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (scores != null) __obj.updateDynamic("scores")(scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerScoreSubmissionList]
  }
}

