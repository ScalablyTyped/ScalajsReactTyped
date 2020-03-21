package typingsJapgolly.emberRunloop.privateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emberRunloop.emberRunloopStrings.sync
  - typingsJapgolly.emberRunloop.emberRunloopStrings.actions
  - typingsJapgolly.emberRunloop.emberRunloopStrings.routerTransitions
  - typingsJapgolly.emberRunloop.emberRunloopStrings.render
  - typingsJapgolly.emberRunloop.emberRunloopStrings.afterRender
  - typingsJapgolly.emberRunloop.emberRunloopStrings.destroy
*/
trait EmberRunQueues extends js.Object

object EmberRunQueues {
  @scala.inline
  def actions: typingsJapgolly.emberRunloop.emberRunloopStrings.actions = this.cast("actions")
  @scala.inline
  def afterRender: typingsJapgolly.emberRunloop.emberRunloopStrings.afterRender = this.cast("afterRender")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsJapgolly.emberRunloop.emberRunloopStrings.destroy = this.cast("destroy")
  @scala.inline
  def render: typingsJapgolly.emberRunloop.emberRunloopStrings.render = this.cast("render")
  @scala.inline
  def routerTransitions: typingsJapgolly.emberRunloop.emberRunloopStrings.routerTransitions = this.cast("routerTransitions")
  @scala.inline
  def sync: typingsJapgolly.emberRunloop.emberRunloopStrings.sync = this.cast("sync")
}

