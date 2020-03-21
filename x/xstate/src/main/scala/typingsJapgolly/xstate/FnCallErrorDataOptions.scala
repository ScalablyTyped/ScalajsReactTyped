package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.ExprWithMeta
import typingsJapgolly.xstate.typesMod.SendAction
import typingsJapgolly.xstate.typesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallErrorDataOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
}

