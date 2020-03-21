package typingsJapgolly.reactTransitionGroup.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.entering
  - typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.entered
  - typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.exiting
  - typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.exited
  - typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.unmounted
*/
trait TransitionStatus extends js.Object

object TransitionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entered: typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.entered = this.cast("entered")
  @scala.inline
  def entering: typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.entering = this.cast("entering")
  @scala.inline
  def exited: typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.exited = this.cast("exited")
  @scala.inline
  def exiting: typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.exiting = this.cast("exiting")
  @scala.inline
  def unmounted: typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.unmounted = this.cast("unmounted")
}

