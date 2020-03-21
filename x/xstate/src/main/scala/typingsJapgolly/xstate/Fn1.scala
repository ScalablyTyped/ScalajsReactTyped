package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn1 extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
}

