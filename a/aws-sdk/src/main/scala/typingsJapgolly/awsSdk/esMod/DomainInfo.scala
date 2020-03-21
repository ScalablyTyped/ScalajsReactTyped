package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainInfo extends js.Object {
  /**
    *  Specifies the DomainName.
    */
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.esMod.DomainName] = js.native
}

object DomainInfo {
  @scala.inline
  def apply(DomainName: DomainName = null): DomainInfo = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInfo]
  }
}

