package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsJapgolly.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The plan identifier.
    */
  var PlanId: Id = js.native
}

object ExecuteProvisionedProductPlanInput {
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, PlanId: Id, AcceptLanguage: AcceptLanguage = null): ExecuteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PlanId = PlanId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteProvisionedProductPlanInput]
  }
}

