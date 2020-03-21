package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
  /**
    * Indicates whether a verbose level of detail is enabled.
    */
  var Verbose: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.Verbose] = js.native
}

object DescribeProvisioningArtifactInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    Verbose: js.UndefOr[Boolean] = js.undefined
  ): DescribeProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningArtifactInput]
  }
}

