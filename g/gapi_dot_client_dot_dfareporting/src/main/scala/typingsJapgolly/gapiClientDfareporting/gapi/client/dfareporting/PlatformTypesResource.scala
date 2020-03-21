package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesResource extends js.Object {
  /** Gets one platform type by ID. */
  def get(request: AnonFields): Request_[PlatformType]
  /** Retrieves a list of platform types. */
  def list(request: AnonKey): Request_[PlatformTypesListResponse]
}

object PlatformTypesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[PlatformType]],
    list: AnonKey => CallbackTo[Request_[PlatformTypesListResponse]]
  ): PlatformTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[PlatformTypesResource]
  }
}

