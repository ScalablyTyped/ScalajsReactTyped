package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.disk
  - typingsJapgolly.gm.gmStrings.file
  - typingsJapgolly.gm.gmStrings.map
  - typingsJapgolly.gm.gmStrings.memory
  - typingsJapgolly.gm.gmStrings.pixels
  - typingsJapgolly.gm.gmStrings.threads
*/
trait LimitType extends js.Object

object LimitType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disk: typingsJapgolly.gm.gmStrings.disk = this.cast("disk")
  @scala.inline
  def file: typingsJapgolly.gm.gmStrings.file = this.cast("file")
  @scala.inline
  def map: typingsJapgolly.gm.gmStrings.map = this.cast("map")
  @scala.inline
  def memory: typingsJapgolly.gm.gmStrings.memory = this.cast("memory")
  @scala.inline
  def pixels: typingsJapgolly.gm.gmStrings.pixels = this.cast("pixels")
  @scala.inline
  def threads: typingsJapgolly.gm.gmStrings.threads = this.cast("threads")
}

