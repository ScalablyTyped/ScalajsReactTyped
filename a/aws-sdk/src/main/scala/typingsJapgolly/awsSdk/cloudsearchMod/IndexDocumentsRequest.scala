package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDocumentsRequest extends js.Object {
  var DomainName: typingsJapgolly.awsSdk.cloudsearchMod.DomainName = js.native
}

object IndexDocumentsRequest {
  @scala.inline
  def apply(DomainName: DomainName): IndexDocumentsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexDocumentsRequest]
  }
}

