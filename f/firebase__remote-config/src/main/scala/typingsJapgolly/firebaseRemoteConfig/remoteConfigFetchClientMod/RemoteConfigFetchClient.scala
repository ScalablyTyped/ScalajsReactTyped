package typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigFetchClient extends js.Object {
  /**
    * @throws if response status is not 200 or 304.
    */
  def fetch(request: FetchRequest): js.Promise[FetchResponse]
}

object RemoteConfigFetchClient {
  @scala.inline
  def apply(fetch: FetchRequest => CallbackTo[js.Promise[FetchResponse]]): RemoteConfigFetchClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest) => fetch(t0).runNow()))
    __obj.asInstanceOf[RemoteConfigFetchClient]
  }
}

