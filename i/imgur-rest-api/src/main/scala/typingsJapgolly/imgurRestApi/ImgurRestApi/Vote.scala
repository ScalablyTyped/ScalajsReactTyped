package typingsJapgolly.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vote extends js.Object {
  var downs: Double
  var ups: Double
}

object Vote {
  @scala.inline
  def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vote]
  }
}

