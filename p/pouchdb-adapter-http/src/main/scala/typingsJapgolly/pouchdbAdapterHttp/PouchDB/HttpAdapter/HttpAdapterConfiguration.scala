package typingsJapgolly.pouchdbAdapterHttp.PouchDB.HttpAdapter

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typingsJapgolly.pouchdbCore.AnonPassword
import typingsJapgolly.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: http,
    auth: AnonPassword = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[Response]] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
}

