package typingsJapgolly.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageSize extends js.Object {
  var height: Double
  var width: Double
}

object imageSize {
  @scala.inline
  def apply(height: Double, width: Double): imageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[imageSize]
  }
}

