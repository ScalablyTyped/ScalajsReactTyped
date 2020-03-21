package typingsJapgolly.pouchdbCore.PouchDB.Configuration

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.pouchdbCore.AnonPassword
import typingsJapgolly.pouchdbCore.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  var auth: js.UndefOr[AnonPassword] = js.undefined
  var fetch: js.UndefOr[Fetch] = js.undefined
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[Boolean] = js.undefined
}

object RemoteDatabaseConfiguration {
  @scala.inline
  def apply(
    adapter: String = null,
    auth: AnonPassword = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[Response]] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): RemoteDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDatabaseConfiguration]
  }
}

