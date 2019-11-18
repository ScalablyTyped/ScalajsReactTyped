package typingsJapgolly.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.alpha
  - typings.csstype.csstypeStrings.luminance
  - typings.csstype.csstypeStrings.`match-source`
*/
trait MaskingMode
  extends _MaskLayer[js.Any]
     with _MaskModeProperty

object MaskingMode {
  @scala.inline
  def alpha: typingsJapgolly.csstype.csstypeStrings.alpha = this.cast("alpha")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def luminance: typingsJapgolly.csstype.csstypeStrings.luminance = this.cast("luminance")
  @scala.inline
  def `match-source`: typingsJapgolly.csstype.csstypeStrings.`match-source` = this.cast("match-source")
}

