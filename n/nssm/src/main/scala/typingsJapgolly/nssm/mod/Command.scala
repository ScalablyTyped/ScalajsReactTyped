package typingsJapgolly.nssm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nssm.nssmStrings.install
  - typingsJapgolly.nssm.nssmStrings.remove
  - typingsJapgolly.nssm.nssmStrings.start
  - typingsJapgolly.nssm.nssmStrings.stop
  - typingsJapgolly.nssm.nssmStrings.restart
  - typingsJapgolly.nssm.nssmStrings.status
  - typingsJapgolly.nssm.nssmStrings.pause
  - typingsJapgolly.nssm.nssmStrings.continue
  - typingsJapgolly.nssm.nssmStrings.rotate
  - typingsJapgolly.nssm.nssmStrings.get
  - typingsJapgolly.nssm.nssmStrings.set
  - typingsJapgolly.nssm.nssmStrings.reset
*/
trait Command extends js.Object

object Command {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def continue: typingsJapgolly.nssm.nssmStrings.continue = this.cast("continue")
  @scala.inline
  def get: typingsJapgolly.nssm.nssmStrings.get = this.cast("get")
  @scala.inline
  def install: typingsJapgolly.nssm.nssmStrings.install = this.cast("install")
  @scala.inline
  def pause: typingsJapgolly.nssm.nssmStrings.pause = this.cast("pause")
  @scala.inline
  def remove: typingsJapgolly.nssm.nssmStrings.remove = this.cast("remove")
  @scala.inline
  def reset: typingsJapgolly.nssm.nssmStrings.reset = this.cast("reset")
  @scala.inline
  def restart: typingsJapgolly.nssm.nssmStrings.restart = this.cast("restart")
  @scala.inline
  def rotate: typingsJapgolly.nssm.nssmStrings.rotate = this.cast("rotate")
  @scala.inline
  def set: typingsJapgolly.nssm.nssmStrings.set = this.cast("set")
  @scala.inline
  def start: typingsJapgolly.nssm.nssmStrings.start = this.cast("start")
  @scala.inline
  def status: typingsJapgolly.nssm.nssmStrings.status = this.cast("status")
  @scala.inline
  def stop: typingsJapgolly.nssm.nssmStrings.stop = this.cast("stop")
}

