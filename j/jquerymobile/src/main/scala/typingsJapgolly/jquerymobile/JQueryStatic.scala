package typingsJapgolly.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var mobile: JQueryMobile
}

object JQueryStatic {
  @scala.inline
  def apply(mobile: JQueryMobile): JQueryStatic = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

