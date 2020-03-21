package typingsJapgolly.koaGenericSession.mod.koaAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koaGenericSession.mod.Session
import typingsJapgolly.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: Session | Null
  var sessionSave: Boolean | Null
  def regenerateSession(): Generator[_, _, _]
}

object Context {
  @scala.inline
  def apply(
    regenerateSession: CallbackTo[Generator[js.Any, js.Any, js.Any]],
    session: Session = null,
    sessionSave: js.UndefOr[Boolean] = js.undefined
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regenerateSession")(regenerateSession.toJsFn)
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionSave)) __obj.updateDynamic("sessionSave")(sessionSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

