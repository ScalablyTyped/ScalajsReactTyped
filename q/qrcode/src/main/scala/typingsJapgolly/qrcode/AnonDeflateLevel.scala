package typingsJapgolly.qrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeflateLevel extends js.Object {
  /**
    * Compression level for deflate.
    * Default: 9
    */
  var deflateLevel: js.UndefOr[Double] = js.undefined
  /**
    * Compression strategy for deflate.
    * Default: 3
    */
  var deflateStrategy: js.UndefOr[Double] = js.undefined
}

object AnonDeflateLevel {
  @scala.inline
  def apply(deflateLevel: Int | Double = null, deflateStrategy: Int | Double = null): AnonDeflateLevel = {
    val __obj = js.Dynamic.literal()
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (deflateStrategy != null) __obj.updateDynamic("deflateStrategy")(deflateStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeflateLevel]
  }
}

