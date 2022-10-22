package typingsJapgolly.consumerDataStandards.commonMod

import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MAIL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PHYSICAL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.REGISTERED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.WORK
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.paf
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPhysicalAddressWithPurpose
  extends StObject
     with CommonPhysicalAddress {
  
  /**
    * Enumeration of values indicating the purpose of the physical address
    */
  var purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK
}
object CommonPhysicalAddressWithPurpose {
  
  inline def apply(addressUType: paf | simple, purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): CommonPhysicalAddressWithPurpose = {
    val __obj = js.Dynamic.literal(addressUType = addressUType.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPhysicalAddressWithPurpose]
  }
  
  extension [Self <: CommonPhysicalAddressWithPurpose](x: Self) {
    
    inline def setPurpose(value: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
  }
}
