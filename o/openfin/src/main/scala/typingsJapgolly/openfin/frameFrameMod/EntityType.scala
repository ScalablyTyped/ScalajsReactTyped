package typingsJapgolly.openfin.frameFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openfin.openfinStrings.window
  - typingsJapgolly.openfin.openfinStrings.iframe
  - typingsJapgolly.openfin.openfinStrings.`external connection`
  - typingsJapgolly.openfin.openfinStrings.view
  - typingsJapgolly.openfin.openfinStrings.unknown
*/
trait EntityType extends js.Object

object EntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `external connection`: typingsJapgolly.openfin.openfinStrings.`external connection` = this.cast("external connection")
  @scala.inline
  def iframe: typingsJapgolly.openfin.openfinStrings.iframe = this.cast("iframe")
  @scala.inline
  def unknown: typingsJapgolly.openfin.openfinStrings.unknown = this.cast("unknown")
  @scala.inline
  def view: typingsJapgolly.openfin.openfinStrings.view = this.cast("view")
  @scala.inline
  def window: typingsJapgolly.openfin.openfinStrings.window = this.cast("window")
}

