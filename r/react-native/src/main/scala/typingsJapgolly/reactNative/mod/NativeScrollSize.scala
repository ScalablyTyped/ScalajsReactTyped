package typingsJapgolly.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollSize extends js.Object {
  var height: Double
  var width: Double
}

object NativeScrollSize {
  @scala.inline
  def apply(height: Double, width: Double): NativeScrollSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeScrollSize]
  }
}

