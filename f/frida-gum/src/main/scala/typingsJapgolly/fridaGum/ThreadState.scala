package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.running
  - typingsJapgolly.fridaGum.fridaGumStrings.stopped
  - typingsJapgolly.fridaGum.fridaGumStrings.waiting
  - typingsJapgolly.fridaGum.fridaGumStrings.uninterruptible
  - typingsJapgolly.fridaGum.fridaGumStrings.halted
*/
trait ThreadState extends js.Object

object ThreadState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def halted: typingsJapgolly.fridaGum.fridaGumStrings.halted = this.cast("halted")
  @scala.inline
  def running: typingsJapgolly.fridaGum.fridaGumStrings.running = this.cast("running")
  @scala.inline
  def stopped: typingsJapgolly.fridaGum.fridaGumStrings.stopped = this.cast("stopped")
  @scala.inline
  def uninterruptible: typingsJapgolly.fridaGum.fridaGumStrings.uninterruptible = this.cast("uninterruptible")
  @scala.inline
  def waiting: typingsJapgolly.fridaGum.fridaGumStrings.waiting = this.cast("waiting")
}

