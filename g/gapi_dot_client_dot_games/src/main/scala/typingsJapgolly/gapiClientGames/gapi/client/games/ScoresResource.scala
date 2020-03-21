package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonIncludeRankType
import typingsJapgolly.gapiClientGames.AnonLanguage
import typingsJapgolly.gapiClientGames.AnonResultsAbove
import typingsJapgolly.gapiClientGames.AnonScore
import typingsJapgolly.gapiClientGames.AnonTimeSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: AnonIncludeRankType): Request_[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: AnonTimeSpan): Request_[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: AnonResultsAbove): Request_[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: AnonScore): Request_[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: AnonLanguage): Request_[PlayerScoreListResponse]
}

object ScoresResource {
  @scala.inline
  def apply(
    get: AnonIncludeRankType => CallbackTo[Request_[PlayerLeaderboardScoreListResponse]],
    list: AnonTimeSpan => CallbackTo[Request_[LeaderboardScores]],
    listWindow: AnonResultsAbove => CallbackTo[Request_[LeaderboardScores]],
    submit: AnonScore => CallbackTo[Request_[PlayerScoreResponse]],
    submitMultiple: AnonLanguage => CallbackTo[Request_[PlayerScoreListResponse]]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonIncludeRankType) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonTimeSpan) => list(t0).runNow()))
    __obj.updateDynamic("listWindow")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonResultsAbove) => listWindow(t0).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonScore) => submit(t0).runNow()))
    __obj.updateDynamic("submitMultiple")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonLanguage) => submitMultiple(t0).runNow()))
    __obj.asInstanceOf[ScoresResource]
  }
}

