package typingsJapgolly.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.store
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.normal
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.maximum
*/
trait CompressionLevel extends js.Object

object CompressionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def maximum: typingsJapgolly.appBuilderLib.appBuilderLibStrings.maximum = this.cast("maximum")
  @scala.inline
  def normal: typingsJapgolly.appBuilderLib.appBuilderLibStrings.normal = this.cast("normal")
  @scala.inline
  def store: typingsJapgolly.appBuilderLib.appBuilderLibStrings.store = this.cast("store")
}

