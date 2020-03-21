package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.mod.AuthInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorize extends js.Object {
  def authorize(
    socketId: String,
    callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
  ): Unit
}

object AnonAuthorize {
  @scala.inline
  def apply(
    authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Callback
  ): AnonAuthorize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorize")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* errored */ scala.Boolean, 
  /* authInfo */ js.UndefOr[typingsJapgolly.pusherJs.mod.AuthInfo], 
  scala.Unit]) => authorize(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAuthorize]
  }
}

