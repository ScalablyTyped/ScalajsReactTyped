package typingsJapgolly.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maquette.maquetteStrings.domEvent
  - typingsJapgolly.maquette.maquetteStrings.domEventProcessed
  - typingsJapgolly.maquette.maquetteStrings.renderStart
  - typingsJapgolly.maquette.maquetteStrings.rendered
  - typingsJapgolly.maquette.maquetteStrings.patched
  - typingsJapgolly.maquette.maquetteStrings.renderDone
*/
trait PerformanceLoggerEvent extends js.Object

object PerformanceLoggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domEvent: typingsJapgolly.maquette.maquetteStrings.domEvent = this.cast("domEvent")
  @scala.inline
  def domEventProcessed: typingsJapgolly.maquette.maquetteStrings.domEventProcessed = this.cast("domEventProcessed")
  @scala.inline
  def patched: typingsJapgolly.maquette.maquetteStrings.patched = this.cast("patched")
  @scala.inline
  def renderDone: typingsJapgolly.maquette.maquetteStrings.renderDone = this.cast("renderDone")
  @scala.inline
  def renderStart: typingsJapgolly.maquette.maquetteStrings.renderStart = this.cast("renderStart")
  @scala.inline
  def rendered: typingsJapgolly.maquette.maquetteStrings.rendered = this.cast("rendered")
}

