package typingsJapgolly.koaSession

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.Session> */
trait PartialSession extends js.Object {
  var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var maxAge: js.UndefOr[Double | session] = js.undefined
  var populated: js.UndefOr[Boolean] = js.undefined
  var save: js.UndefOr[js.Function0[Unit]] = js.undefined
  var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
}

object PartialSession {
  @scala.inline
  def apply(
    inspect: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    length: Int | Double = null,
    maxAge: Double | session = null,
    populated: js.UndefOr[Boolean] = js.undefined,
    save: js.UndefOr[Callback] = js.undefined,
    toJSON: js.UndefOr[CallbackTo[js.Object]] = js.undefined
  ): PartialSession = {
    val __obj = js.Dynamic.literal()
    inspect.foreach(p => __obj.updateDynamic("inspect")(p.toJsFn))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(populated)) __obj.updateDynamic("populated")(populated.asInstanceOf[js.Any])
    save.foreach(p => __obj.updateDynamic("save")(p.toJsFn))
    toJSON.foreach(p => __obj.updateDynamic("toJSON")(p.toJsFn))
    __obj.asInstanceOf[PartialSession]
  }
}

