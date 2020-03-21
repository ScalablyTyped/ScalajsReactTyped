package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonIncludeMatchData
import typingsJapgolly.gapiClientGames.AnonLanguage
import typingsJapgolly.gapiClientGames.AnonMatchId
import typingsJapgolly.gapiClientGames.AnonMatchVersion
import typingsJapgolly.gapiClientGames.AnonMaxCompletedMatches
import typingsJapgolly.gapiClientGames.AnonRequestId
import typingsJapgolly.gapiClientGames.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Cancel a turn-based match. */
  def cancel(request: AnonMatchId): Request_[Unit]
  /** Create a turn-based match. */
  def create(request: AnonLanguage): Request_[TurnBasedMatch]
  /** Decline an invitation to play a turn-based match. */
  def decline(request: AnonUserIp): Request_[TurnBasedMatch]
  /** Dismiss a turn-based match from the match list. The match will no longer show up in the list and will not generate notifications. */
  def dismiss(request: AnonMatchId): Request_[Unit]
  /**
    * Finish a turn-based match. Each player should make this call once, after all results are in. Only the player whose turn it is may make the first call
    * to Finish, and can pass in the final match state.
    */
  def finish(request: AnonUserIp): Request_[TurnBasedMatch]
  /** Get the data for a turn-based match. */
  def get(request: AnonIncludeMatchData): Request_[TurnBasedMatch]
  /** Join a turn-based match. */
  def join(request: AnonUserIp): Request_[TurnBasedMatch]
  /** Leave a turn-based match when it is not the current player's turn, without canceling the match. */
  def leave(request: AnonUserIp): Request_[TurnBasedMatch]
  /** Leave a turn-based match during the current player's turn, without canceling the match. */
  def leaveTurn(request: AnonMatchVersion): Request_[TurnBasedMatch]
  /** Returns turn-based matches the player is or was involved in. */
  def list(request: AnonMaxCompletedMatches): Request_[TurnBasedMatchList]
  /**
    * Create a rematch of a match that was previously completed, with the same participants. This can be called by only one player on a match still in their
    * list; the player must have called Finish first. Returns the newly created match; it will be the caller's turn.
    */
  def rematch(request: AnonRequestId): Request_[TurnBasedMatchRematch]
  /**
    * Returns turn-based matches the player is or was involved in that changed since the last sync call, with the least recent changes coming first. Matches
    * that should be removed from the local cache will have a status of MATCH_DELETED.
    */
  def sync(request: AnonMaxCompletedMatches): Request_[TurnBasedMatchSync]
  /** Commit the results of a player turn. */
  def takeTurn(request: AnonUserIp): Request_[TurnBasedMatch]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(
    cancel: AnonMatchId => CallbackTo[Request_[Unit]],
    create: AnonLanguage => CallbackTo[Request_[TurnBasedMatch]],
    decline: AnonUserIp => CallbackTo[Request_[TurnBasedMatch]],
    dismiss: AnonMatchId => CallbackTo[Request_[Unit]],
    finish: AnonUserIp => CallbackTo[Request_[TurnBasedMatch]],
    get: AnonIncludeMatchData => CallbackTo[Request_[TurnBasedMatch]],
    join: AnonUserIp => CallbackTo[Request_[TurnBasedMatch]],
    leave: AnonUserIp => CallbackTo[Request_[TurnBasedMatch]],
    leaveTurn: AnonMatchVersion => CallbackTo[Request_[TurnBasedMatch]],
    list: AnonMaxCompletedMatches => CallbackTo[Request_[TurnBasedMatchList]],
    rematch: AnonRequestId => CallbackTo[Request_[TurnBasedMatchRematch]],
    sync: AnonMaxCompletedMatches => CallbackTo[Request_[TurnBasedMatchSync]],
    takeTurn: AnonUserIp => CallbackTo[Request_[TurnBasedMatch]]
  ): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMatchId) => cancel(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonLanguage) => create(t0).runNow()))
    __obj.updateDynamic("decline")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonUserIp) => decline(t0).runNow()))
    __obj.updateDynamic("dismiss")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMatchId) => dismiss(t0).runNow()))
    __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonUserIp) => finish(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonIncludeMatchData) => get(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonUserIp) => join(t0).runNow()))
    __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonUserIp) => leave(t0).runNow()))
    __obj.updateDynamic("leaveTurn")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMatchVersion) => leaveTurn(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMaxCompletedMatches) => list(t0).runNow()))
    __obj.updateDynamic("rematch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonRequestId) => rematch(t0).runNow()))
    __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMaxCompletedMatches) => sync(t0).runNow()))
    __obj.updateDynamic("takeTurn")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonUserIp) => takeTurn(t0).runNow()))
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

