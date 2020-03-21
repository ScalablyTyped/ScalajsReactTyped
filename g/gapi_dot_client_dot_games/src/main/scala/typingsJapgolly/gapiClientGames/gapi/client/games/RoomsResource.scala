package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonAlt
import typingsJapgolly.gapiClientGames.AnonLanguage
import typingsJapgolly.gapiClientGames.AnonQuotaUser
import typingsJapgolly.gapiClientGames.AnonRoomId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: AnonLanguage): Request_[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: AnonQuotaUser): Request_[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: AnonRoomId): Request_[Unit]
  /** Get the data for a room. */
  def get(request: AnonQuotaUser): Request_[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: AnonQuotaUser): Request_[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: AnonQuotaUser): Request_[Room]
  /** Returns invitations to join rooms. */
  def list(request: AnonAlt): Request_[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: AnonQuotaUser): Request_[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: AnonLanguage => CallbackTo[Request_[Room]],
    decline: AnonQuotaUser => CallbackTo[Request_[Room]],
    dismiss: AnonRoomId => CallbackTo[Request_[Unit]],
    get: AnonQuotaUser => CallbackTo[Request_[Room]],
    join: AnonQuotaUser => CallbackTo[Request_[Room]],
    leave: AnonQuotaUser => CallbackTo[Request_[Room]],
    list: AnonAlt => CallbackTo[Request_[RoomList]],
    reportStatus: AnonQuotaUser => CallbackTo[Request_[RoomStatus]]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonLanguage) => create(t0).runNow()))
    __obj.updateDynamic("decline")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuotaUser) => decline(t0).runNow()))
    __obj.updateDynamic("dismiss")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonRoomId) => dismiss(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuotaUser) => join(t0).runNow()))
    __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuotaUser) => leave(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("reportStatus")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuotaUser) => reportStatus(t0).runNow()))
    __obj.asInstanceOf[RoomsResource]
  }
}

