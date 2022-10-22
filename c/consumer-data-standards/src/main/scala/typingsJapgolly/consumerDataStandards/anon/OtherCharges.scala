package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCharges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional array of charges that may be part of the invoice (for e.g. environmental charges for C&I consumers) (exclusive of GST)
    */
  var otherCharges: js.UndefOr[js.Array[DescriptionType] | Null] = js.undefined
  
  /**
    * The aggregate total of generation credits for the period covered by the invoice (exclusive of GST)
    */
  var totalGenerationCredits: String
  
  /**
    * The total GST for all electricity usage charges.  If absent then zero is assumed
    */
  var totalGst: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The aggregate total of any once off charges arising from electricity usage for the period covered by the invoice (exclusive of GST)
    */
  var totalOnceOffCharges: String
  
  /**
    * The aggregate total of any once off discounts or credits arising from electricity usage for the period covered by the invoice (exclusive of GST)
    */
  var totalOnceOffDiscounts: String
  
  /**
    * The aggregate total of usage charges for the period covered by the invoice (exclusive of GST)
    */
  var totalUsageCharges: String
}
object OtherCharges {
  
  inline def apply(
    totalGenerationCredits: String,
    totalOnceOffCharges: String,
    totalOnceOffDiscounts: String,
    totalUsageCharges: String
  ): OtherCharges = {
    val __obj = js.Dynamic.literal(totalGenerationCredits = totalGenerationCredits.asInstanceOf[js.Any], totalOnceOffCharges = totalOnceOffCharges.asInstanceOf[js.Any], totalOnceOffDiscounts = totalOnceOffDiscounts.asInstanceOf[js.Any], totalUsageCharges = totalUsageCharges.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCharges]
  }
  
  extension [Self <: OtherCharges](x: Self) {
    
    inline def setOtherCharges(value: js.Array[DescriptionType]): Self = StObject.set(x, "otherCharges", value.asInstanceOf[js.Any])
    
    inline def setOtherChargesNull: Self = StObject.set(x, "otherCharges", null)
    
    inline def setOtherChargesUndefined: Self = StObject.set(x, "otherCharges", js.undefined)
    
    inline def setOtherChargesVarargs(value: DescriptionType*): Self = StObject.set(x, "otherCharges", js.Array(value*))
    
    inline def setTotalGenerationCredits(value: String): Self = StObject.set(x, "totalGenerationCredits", value.asInstanceOf[js.Any])
    
    inline def setTotalGst(value: String): Self = StObject.set(x, "totalGst", value.asInstanceOf[js.Any])
    
    inline def setTotalGstNull: Self = StObject.set(x, "totalGst", null)
    
    inline def setTotalGstUndefined: Self = StObject.set(x, "totalGst", js.undefined)
    
    inline def setTotalOnceOffCharges(value: String): Self = StObject.set(x, "totalOnceOffCharges", value.asInstanceOf[js.Any])
    
    inline def setTotalOnceOffDiscounts(value: String): Self = StObject.set(x, "totalOnceOffDiscounts", value.asInstanceOf[js.Any])
    
    inline def setTotalUsageCharges(value: String): Self = StObject.set(x, "totalUsageCharges", value.asInstanceOf[js.Any])
  }
}
