package typingsJapgolly.koaGenericSession.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koaGenericSession.AnonHttpOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
  var cookie: js.UndefOr[AnonHttpOnly] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var errorHandler: js.UndefOr[js.Function3[/* error */ js.Error, /* type */ String, /* ctx */ Context, Unit]] = js.undefined
  var genSid: js.UndefOr[js.Function1[/* length */ Double, String]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var reconnectTimeout: js.UndefOr[Double] = js.undefined
  var rolling: js.UndefOr[Boolean] = js.undefined
  var sessionIdStore: js.UndefOr[SessionIdStore] = js.undefined
  var store: js.UndefOr[SessionStore] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    beforeSave: (/* ctx */ Context, /* session */ Session) => Callback = null,
    cookie: AnonHttpOnly = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    errorHandler: (/* error */ js.Error, /* type */ String, /* ctx */ Context) => Callback = null,
    genSid: /* length */ Double => CallbackTo[String] = null,
    key: String = null,
    prefix: String = null,
    reconnectTimeout: Int | Double = null,
    rolling: js.UndefOr[Boolean] = js.undefined,
    sessionIdStore: SessionIdStore = null,
    store: SessionStore = null,
    ttl: Int | Double = null,
    valid: (/* ctx */ Context, /* session */ Session) => CallbackTo[Boolean] = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction2((t0: /* ctx */ typingsJapgolly.koa.mod.Context, t1: /* session */ typingsJapgolly.koaGenericSession.mod.Session) => beforeSave(t0, t1).runNow()))
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction3((t0: /* error */ js.Error, t1: /* type */ java.lang.String, t2: /* ctx */ typingsJapgolly.koa.mod.Context) => errorHandler(t0, t1, t2).runNow()))
    if (genSid != null) __obj.updateDynamic("genSid")(js.Any.fromFunction1((t0: /* length */ scala.Double) => genSid(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (reconnectTimeout != null) __obj.updateDynamic("reconnectTimeout")(reconnectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    if (sessionIdStore != null) __obj.updateDynamic("sessionIdStore")(sessionIdStore.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(js.Any.fromFunction2((t0: /* ctx */ typingsJapgolly.koa.mod.Context, t1: /* session */ typingsJapgolly.koaGenericSession.mod.Session) => valid(t0, t1).runNow()))
    __obj.asInstanceOf[SessionOptions]
  }
}

