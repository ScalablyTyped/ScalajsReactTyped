package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.DomainArn] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.DomainName] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.native
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.native
}

object DomainDetails {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    DomainArn: DomainArn = null,
    DomainId: DomainId = null,
    DomainName: DomainName = null,
    LastModifiedTime: js.Date = null,
    Status: DomainStatus = null,
    Url: String1024 = null
  ): DomainDetails = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainArn != null) __obj.updateDynamic("DomainArn")(DomainArn.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetails]
  }
}

