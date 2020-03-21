package typingsJapgolly.nextServer.routerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nextServer.mittMod.MittEmitter
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
trait NextRouter extends js.Object {
  var asPath: String
  var back: js.Function0[Unit]
  var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
  var events: MittEmitter
  var pathname: String
  var prefetch: js.Function1[/* url */ String, js.Promise[Unit]]
  var push: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ]
  var query: ParsedUrlQuery
  var reload: js.Function0[Unit]
  var replace: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ]
  var route: String
}

object NextRouter {
  @scala.inline
  def apply(
    asPath: String,
    back: Callback,
    beforePopState: /* cb */ BeforePopStateCallback => Callback,
    events: MittEmitter,
    pathname: String,
    prefetch: /* url */ String => CallbackTo[js.Promise[Unit]],
    push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => CallbackTo[js.Promise[Boolean]],
    query: ParsedUrlQuery,
    reload: Callback,
    replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => CallbackTo[js.Promise[Boolean]],
    route: String
  ): NextRouter = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("back")(back.toJsFn)
    __obj.updateDynamic("beforePopState")(js.Any.fromFunction1((t0: /* cb */ typingsJapgolly.nextServer.routerMod.BeforePopStateCallback) => beforePopState(t0).runNow()))
    __obj.updateDynamic("prefetch")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => prefetch(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction3((t0: /* url */ typingsJapgolly.nextServer.routerMod.Url, t1: /* as */ js.UndefOr[typingsJapgolly.nextServer.routerMod.Url], t2: /* options */ js.UndefOr[js.Object]) => push(t0, t1, t2).runNow()))
    __obj.updateDynamic("reload")(reload.toJsFn)
    __obj.updateDynamic("replace")(js.Any.fromFunction3((t0: /* url */ typingsJapgolly.nextServer.routerMod.Url, t1: /* as */ js.UndefOr[typingsJapgolly.nextServer.routerMod.Url], t2: /* options */ js.UndefOr[js.Object]) => replace(t0, t1, t2).runNow()))
    __obj.asInstanceOf[NextRouter]
  }
}

