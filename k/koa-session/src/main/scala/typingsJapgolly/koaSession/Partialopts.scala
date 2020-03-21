package typingsJapgolly.koaSession

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koaSession.koaSessionStrings.lax
import typingsJapgolly.koaSession.koaSessionStrings.none
import typingsJapgolly.koaSession.koaSessionStrings.session
import typingsJapgolly.koaSession.koaSessionStrings.strict
import typingsJapgolly.koaSession.mod.ExternalKeys
import typingsJapgolly.koaSession.mod.Session
import typingsJapgolly.koaSession.mod.stores
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.opts> */
trait Partialopts extends js.Object {
  var ContextStore: js.UndefOr[AnonInstantiable] = js.undefined
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
  var decode: js.UndefOr[js.Function1[/* str */ String, js.Object]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[js.Function1[/* obj */ js.Object, String]] = js.undefined
  var expires: js.UndefOr[js.Date] = js.undefined
  var externalKey: js.UndefOr[ExternalKeys] = js.undefined
  var genid: js.UndefOr[js.Function0[String]] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double | session] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var renew: js.UndefOr[Boolean] = js.undefined
  var rolling: js.UndefOr[Boolean] = js.undefined
  var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var secureProxy: js.UndefOr[Boolean] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[stores] = js.undefined
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.undefined
}

object Partialopts {
  @scala.inline
  def apply(
    ContextStore: AnonInstantiable = null,
    beforeSave: (/* ctx */ Context, /* session */ Session) => Callback = null,
    decode: /* str */ String => CallbackTo[js.Object] = null,
    domain: String = null,
    encode: /* obj */ js.Object => CallbackTo[String] = null,
    expires: js.Date = null,
    externalKey: ExternalKeys = null,
    genid: js.UndefOr[CallbackTo[String]] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxAge: Double | session = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    prefix: String = null,
    renew: js.UndefOr[Boolean] = js.undefined,
    rolling: js.UndefOr[Boolean] = js.undefined,
    sameSite: strict | lax | none | Boolean = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    secureProxy: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined,
    store: stores = null,
    valid: (/* ctx */ Context, /* session */ PartialSession) => Callback = null
  ): Partialopts = {
    val __obj = js.Dynamic.literal()
    if (ContextStore != null) __obj.updateDynamic("ContextStore")(ContextStore.asInstanceOf[js.Any])
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction2((t0: /* ctx */ typingsJapgolly.koa.mod.Context, t1: /* session */ typingsJapgolly.koaSession.mod.Session) => beforeSave(t0, t1).runNow()))
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => decode(t0).runNow()))
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: /* obj */ js.Object) => encode(t0).runNow()))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (externalKey != null) __obj.updateDynamic("externalKey")(externalKey.asInstanceOf[js.Any])
    genid.foreach(p => __obj.updateDynamic("genid")(p.toJsFn))
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(renew)) __obj.updateDynamic("renew")(renew.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(js.Any.fromFunction2((t0: /* ctx */ typingsJapgolly.koa.mod.Context, t1: /* session */ typingsJapgolly.koaSession.PartialSession) => valid(t0, t1).runNow()))
    __obj.asInstanceOf[Partialopts]
  }
}

