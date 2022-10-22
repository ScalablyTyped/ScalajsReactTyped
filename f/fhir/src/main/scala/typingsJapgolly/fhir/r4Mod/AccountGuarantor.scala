package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountGuarantor
  extends StObject
     with BackboneElement {
  
  var _onHold: js.UndefOr[Element] = js.undefined
  
  /**
    * A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
    */
  var onHold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The entity who is responsible.
    */
  var party: Reference
  
  /**
    * The timeframe during which the guarantor accepts responsibility for the account.
    */
  var period: js.UndefOr[Period] = js.undefined
}
object AccountGuarantor {
  
  inline def apply(party: Reference): AccountGuarantor = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGuarantor]
  }
  
  extension [Self <: AccountGuarantor](x: Self) {
    
    inline def setOnHold(value: Boolean): Self = StObject.set(x, "onHold", value.asInstanceOf[js.Any])
    
    inline def setOnHoldUndefined: Self = StObject.set(x, "onHold", js.undefined)
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def set_onHold(value: Element): Self = StObject.set(x, "_onHold", value.asInstanceOf[js.Any])
    
    inline def set_onHoldUndefined: Self = StObject.set(x, "_onHold", js.undefined)
  }
}
