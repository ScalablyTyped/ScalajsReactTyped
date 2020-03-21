package typingsJapgolly.mobileDetect

import typingsJapgolly.mobileDetect.mod.MobileDetectComplexRules
import typingsJapgolly.mobileDetect.mod.MobileDetectRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOss extends js.Object {
  var oss: MobileDetectRules
  var phones: MobileDetectRules
  var props: MobileDetectComplexRules
  var tablets: MobileDetectRules
  var uas: MobileDetectRules
  var utils: MobileDetectRules
}

object AnonOss {
  @scala.inline
  def apply(
    oss: MobileDetectRules,
    phones: MobileDetectRules,
    props: MobileDetectComplexRules,
    tablets: MobileDetectRules,
    uas: MobileDetectRules,
    utils: MobileDetectRules
  ): AnonOss = {
    val __obj = js.Dynamic.literal(oss = oss.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tablets = tablets.asInstanceOf[js.Any], uas = uas.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOss]
  }
}

