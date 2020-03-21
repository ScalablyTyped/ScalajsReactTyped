package typingsJapgolly.openlayers.mod.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.undefined
  - typingsJapgolly.openlayers.openlayersStrings.loading
  - typingsJapgolly.openlayers.openlayersStrings.ready
  - typingsJapgolly.openlayers.openlayersStrings.error
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.openlayers.openlayersStrings.error = this.cast("error")
  @scala.inline
  def loading: typingsJapgolly.openlayers.openlayersStrings.loading = this.cast("loading")
  @scala.inline
  def ready: typingsJapgolly.openlayers.openlayersStrings.ready = this.cast("ready")
  @scala.inline
  def undefined: typingsJapgolly.openlayers.openlayersStrings.undefined = this.cast("undefined")
}

