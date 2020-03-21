package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Kernel status states.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.unknown
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.starting
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.reconnecting
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.idle
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.busy
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.restarting
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.autorestarting
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.dead
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connected
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def autorestarting: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.autorestarting = this.cast("autorestarting")
  @scala.inline
  def busy: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.unknown = this.cast("unknown")
}

