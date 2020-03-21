package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /**
    * The type of product the SKU refers to.
    * Example: "Compute", "Storage", "Network", "ApplicationServices" etc.
    */
  var resourceFamily: js.UndefOr[String] = js.undefined
  /**
    * A group classification for related SKUs.
    * Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc.
    */
  var resourceGroup: js.UndefOr[String] = js.undefined
  /** The display name of the service this SKU belongs to. */
  var serviceDisplayName: js.UndefOr[String] = js.undefined
  /**
    * Represents how the SKU is consumed.
    * Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc.
    */
  var usageType: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(
    resourceFamily: String = null,
    resourceGroup: String = null,
    serviceDisplayName: String = null,
    usageType: String = null
  ): Category = {
    val __obj = js.Dynamic.literal()
    if (resourceFamily != null) __obj.updateDynamic("resourceFamily")(resourceFamily.asInstanceOf[js.Any])
    if (resourceGroup != null) __obj.updateDynamic("resourceGroup")(resourceGroup.asInstanceOf[js.Any])
    if (serviceDisplayName != null) __obj.updateDynamic("serviceDisplayName")(serviceDisplayName.asInstanceOf[js.Any])
    if (usageType != null) __obj.updateDynamic("usageType")(usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

