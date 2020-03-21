package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLicense extends js.Object {
  /**
    * How this group license was acquired. "bulkPurchase" means that this Grouplicenses resource was created because the enterprise purchased licenses for
    * this product; otherwise, the value is "free" (for free products).
    */
  var acquisitionKind: js.UndefOr[String] = js.undefined
  /**
    * Whether the product to which this group license relates is currently approved by the enterprise. Products are approved when a group license is first
    * created, but this approval may be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to end users in collections,
    * and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicense". */
  var kind: js.UndefOr[String] = js.undefined
  /** The total number of provisioned licenses for this product. Returned by read operations, but ignored in write operations. */
  var numProvisioned: js.UndefOr[Double] = js.undefined
  /**
    * The number of purchased licenses (possibly in multiple purchases). If this field is omitted, then there is no limit on the number of licenses that can
    * be provisioned (for example, if the acquisition kind is "free").
    */
  var numPurchased: js.UndefOr[Double] = js.undefined
  /**
    * The permission approval status of the product. This field is only set if the product is approved. Possible states are:
    * - "currentApproved", the current set of permissions is approved, but additional permissions will require the administrator to reapprove the product (If
    * the product was approved without specifying the approved permissions setting, then this is the default behavior.),
    * - "needsReapproval", the product has unapproved permissions. No additional product licenses can be assigned until the product is reapproved,
    * - "allCurrentAndFutureApproved", the current permissions are approved and any future permission updates will be automatically approved without
    * administrator review.
    */
  var permissions: js.UndefOr[String] = js.undefined
  /** The ID of the product that the license is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}

object GroupLicense {
  @scala.inline
  def apply(
    acquisitionKind: String = null,
    approval: String = null,
    kind: String = null,
    numProvisioned: Int | Double = null,
    numPurchased: Int | Double = null,
    permissions: String = null,
    productId: String = null
  ): GroupLicense = {
    val __obj = js.Dynamic.literal()
    if (acquisitionKind != null) __obj.updateDynamic("acquisitionKind")(acquisitionKind.asInstanceOf[js.Any])
    if (approval != null) __obj.updateDynamic("approval")(approval.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numProvisioned != null) __obj.updateDynamic("numProvisioned")(numProvisioned.asInstanceOf[js.Any])
    if (numPurchased != null) __obj.updateDynamic("numPurchased")(numPurchased.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLicense]
  }
}

