package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpinning extends js.Object {
  var size: small | large | default
  var spinning: Boolean
  var wrapperClassName: String
}

object AnonSpinning {
  @scala.inline
  def apply(size: small | large | default, spinning: Boolean, wrapperClassName: String): AnonSpinning = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSpinning]
  }
}

