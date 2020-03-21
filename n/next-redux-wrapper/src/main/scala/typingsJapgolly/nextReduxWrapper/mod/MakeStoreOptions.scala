package typingsJapgolly.nextReduxWrapper.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.ErrorstatusCodenumber
import typingsJapgolly.next.utilsMod.AppTreeType
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeStoreOptions
  extends NextJSContext[js.Any, AnyAction]
     with Config

object MakeStoreOptions {
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[js.Any, AnyAction],
    asPath: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deserializeState: /* any */ js.Any => CallbackTo[js.Any] = null,
    err: ErrorstatusCodenumber = null,
    overrideIsServer: js.UndefOr[Boolean] = js.undefined,
    req: IncomingMessage = null,
    res: ServerResponse = null,
    serializeState: /* any */ js.Any => CallbackTo[js.Any] = null,
    storeKey: String = null
  ): MakeStoreOptions = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (asPath != null) __obj.updateDynamic("asPath")(asPath.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(js.Any.fromFunction1((t0: /* any */ js.Any) => deserializeState(t0).runNow()))
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideIsServer)) __obj.updateDynamic("overrideIsServer")(overrideIsServer.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    if (serializeState != null) __obj.updateDynamic("serializeState")(js.Any.fromFunction1((t0: /* any */ js.Any) => serializeState(t0).runNow()))
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeStoreOptions]
  }
}

