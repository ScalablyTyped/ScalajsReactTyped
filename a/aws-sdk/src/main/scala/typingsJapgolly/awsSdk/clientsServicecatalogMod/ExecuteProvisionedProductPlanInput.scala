package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteProvisionedProductPlanInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsJapgolly.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    * The plan identifier.
    */
  var PlanId: Id
}
object ExecuteProvisionedProductPlanInput {
  
  inline def apply(IdempotencyToken: IdempotencyToken, PlanId: Id): ExecuteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PlanId = PlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteProvisionedProductPlanInput]
  }
  
  extension [Self <: ExecuteProvisionedProductPlanInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
  }
}
