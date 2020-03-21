package typingsJapgolly.sdpTransform

import typingsJapgolly.sdpTransform.sdpTransformStrings.excl
import typingsJapgolly.sdpTransform.sdpTransformStrings.incl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressTypes extends js.Object {
  var addressTypes: String
  var destAddress: String
  var filterMode: excl | incl
  var netType: String
  var srcList: String
}

object AnonAddressTypes {
  @scala.inline
  def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): AnonAddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes.asInstanceOf[js.Any], destAddress = destAddress.asInstanceOf[js.Any], filterMode = filterMode.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], srcList = srcList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddressTypes]
  }
}

