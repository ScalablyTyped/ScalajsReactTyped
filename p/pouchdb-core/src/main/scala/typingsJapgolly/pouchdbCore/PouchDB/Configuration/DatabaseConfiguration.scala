package typingsJapgolly.pouchdbCore.PouchDB.Configuration

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.pouchdbCore.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
  - typingsJapgolly.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
*/
trait DatabaseConfiguration extends js.Object

object DatabaseConfiguration {
  @scala.inline
  def LocalDatabaseConfiguration(
    adapter: String = null,
    auto_compaction: js.UndefOr[Boolean] = js.undefined,
    deterministic_revs: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prefix: String = null,
    revs_limit: Int | Double = null,
    size: Int | Double = null
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_compaction)) __obj.updateDynamic("auto_compaction")(auto_compaction.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministic_revs)) __obj.updateDynamic("deterministic_revs")(deterministic_revs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (revs_limit != null) __obj.updateDynamic("revs_limit")(revs_limit.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
  @scala.inline
  def RemoteDatabaseConfiguration(
    adapter: String = null,
    auth: AnonPassword = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[Response]] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* url */ java.lang.String | org.scalajs.dom.experimental.Request, t1: /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
}

