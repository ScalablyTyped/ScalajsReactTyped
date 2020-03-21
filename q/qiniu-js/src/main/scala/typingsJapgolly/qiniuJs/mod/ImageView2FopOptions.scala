package typingsJapgolly.qiniuJs.mod

import typingsJapgolly.qiniuJs.qiniuJsNumbers.`0`
import typingsJapgolly.qiniuJs.qiniuJsNumbers.`1`
import typingsJapgolly.qiniuJs.qiniuJsNumbers.`2`
import typingsJapgolly.qiniuJs.qiniuJsNumbers.`3`
import typingsJapgolly.qiniuJs.qiniuJsNumbers.`4`
import typingsJapgolly.qiniuJs.qiniuJsNumbers.`5`
import typingsJapgolly.qiniuJs.qiniuJsStrings.gif
import typingsJapgolly.qiniuJs.qiniuJsStrings.jpg
import typingsJapgolly.qiniuJs.qiniuJsStrings.png
import typingsJapgolly.qiniuJs.qiniuJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView2FopOptions extends ImageView2Options {
  var fop: typingsJapgolly.qiniuJs.qiniuJsStrings.imageView2
}

object ImageView2FopOptions {
  @scala.inline
  def apply(
    fop: typingsJapgolly.qiniuJs.qiniuJsStrings.imageView2,
    format: jpg | gif | png | webp | String,
    h: Double,
    mode: `0` | `1` | `2` | `3` | `4` | `5`,
    q: Double,
    w: Double
  ): ImageView2FopOptions = {
    val __obj = js.Dynamic.literal(fop = fop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageView2FopOptions]
  }
}

