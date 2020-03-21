package typingsJapgolly.mapnik

import typingsJapgolly.mapnik.mapnikStrings.DEFAULT
import typingsJapgolly.mapnik.mapnikStrings.FILTERED
import typingsJapgolly.mapnik.mapnikStrings.FIXED
import typingsJapgolly.mapnik.mapnikStrings.HUFFMAN_ONLY
import typingsJapgolly.mapnik.mapnikStrings.RLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompression extends js.Object {
  var compression: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.undefined
}

object AnonCompression {
  @scala.inline
  def apply(
    compression: Int | Double = null,
    level: Int | Double = null,
    strategy: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT = null
  ): AnonCompression = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompression]
  }
}

