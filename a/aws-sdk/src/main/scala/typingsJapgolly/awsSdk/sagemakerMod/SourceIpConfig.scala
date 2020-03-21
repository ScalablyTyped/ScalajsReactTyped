package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceIpConfig extends js.Object {
  /**
    * A list of one to four Classless Inter-Domain Routing (CIDR) values. Maximum: 4 CIDR values  The following Length Constraints apply to individual CIDR values in the CIDR value list. 
    */
  var Cidrs: typingsJapgolly.awsSdk.sagemakerMod.Cidrs = js.native
}

object SourceIpConfig {
  @scala.inline
  def apply(Cidrs: Cidrs): SourceIpConfig = {
    val __obj = js.Dynamic.literal(Cidrs = Cidrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceIpConfig]
  }
}

