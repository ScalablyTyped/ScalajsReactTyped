package typingsJapgolly.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  /**
    * 是否建议用户休息
    */
  var result: Boolean
}

object AnonResult {
  @scala.inline
  def apply(result: Boolean): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult]
  }
}

