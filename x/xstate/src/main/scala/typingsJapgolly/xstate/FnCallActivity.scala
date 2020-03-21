package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.ActivityActionObject
import typingsJapgolly.xstate.typesMod.ActivityDefinition
import typingsJapgolly.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallActivity extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
}

