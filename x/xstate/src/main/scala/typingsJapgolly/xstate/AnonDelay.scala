package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: Double | String | (Expr[TContext, TEvent, Double])
}

object AnonDelay {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](delay: Double | String | (Expr[TContext, TEvent, Double])): AnonDelay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelay[TContext, TEvent]]
  }
}

