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

trait ImageView2Options extends js.Object {
  	// 新图的图像质量，取值范围：1-100
  var format: jpg | gif | png | webp | String
  	// 具体含义由缩略模式决定
  var h: Double
  var mode: `0` | `1` | `2` | `3` | `4` | `5`
  	// 具体含义由缩略模式决定
  var q: Double
  	// 缩略模式，共6种[0-5]
  var w: Double
}

object ImageView2Options {
  @scala.inline
  def apply(
    format: jpg | gif | png | webp | String,
    h: Double,
    mode: `0` | `1` | `2` | `3` | `4` | `5`,
    q: Double,
    w: Double
  ): ImageView2Options = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageView2Options]
  }
}

