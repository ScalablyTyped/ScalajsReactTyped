package typingsJapgolly.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mapboxGlStrings.unavailable
  - typingsJapgolly.mapboxGl.mapboxGlStrings.loading
  - typingsJapgolly.mapboxGl.mapboxGlStrings.loaded
  - typingsJapgolly.mapboxGl.mapboxGlStrings.error
*/
trait PluginStatus extends js.Object

object PluginStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.mapboxGl.mapboxGlStrings.error = this.cast("error")
  @scala.inline
  def loaded: typingsJapgolly.mapboxGl.mapboxGlStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typingsJapgolly.mapboxGl.mapboxGlStrings.loading = this.cast("loading")
  @scala.inline
  def unavailable: typingsJapgolly.mapboxGl.mapboxGlStrings.unavailable = this.cast("unavailable")
}

