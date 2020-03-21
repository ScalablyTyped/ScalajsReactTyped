package typingsJapgolly.passportSocketio.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.expressSession.mod.Store
import typingsJapgolly.passport.mod.PassportStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportSocketIoOptions extends js.Object {
  /**
    * the same middleware you registrer in express.
    */
  var cookieParser: js.UndefOr[RequestHandler[ParamsDictionary]] = js.undefined
  /**
    * callback on fail/error.
    */
  var fail: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* message */ String, 
      /* critical */ String, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * the name of the cookie where express/connect stores its session_id.
    */
  var key: js.UndefOr[String] = js.undefined
  var passport: js.UndefOr[PassportStatic] = js.undefined
  /**
    * the session_secret to parse the cookie.
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * we NEED to use a sessionstore. No MemoryStore please.
    */
  var store: Store
  /**
    * callback on success.
    */
  var success: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.undefined
}

object PassportSocketIoOptions {
  @scala.inline
  def apply(
    store: Store,
    cookieParser: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    fail: (/* data */ js.Any, /* message */ String, /* critical */ String, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Callback = null,
    key: String = null,
    passport: PassportStatic = null,
    secret: String = null,
    success: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Callback = null
  ): PassportSocketIoOptions = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (cookieParser != null) __obj.updateDynamic("cookieParser")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => cookieParser(t0, t1, t2).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction4((t0: /* data */ js.Any, t1: /* message */ java.lang.String, t2: /* critical */ java.lang.String, t3: /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[scala.Boolean], scala.Unit]) => fail(t0, t1, t2, t3).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passport != null) __obj.updateDynamic("passport")(passport.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[scala.Boolean], scala.Unit]) => success(t0, t1).runNow()))
    __obj.asInstanceOf[PassportSocketIoOptions]
  }
}

