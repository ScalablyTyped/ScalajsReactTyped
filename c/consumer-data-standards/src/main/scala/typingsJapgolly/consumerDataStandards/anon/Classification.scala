package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.HIGH
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.LOW
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MEDIUM
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.RESIDENTIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classification
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A code that defines the consumer class as defined in the National Energy Retail Regulations, or in overriding Jurisdictional instruments
    */
  var classification: js.UndefOr[BUSINESS | RESIDENTIAL | Null] = js.undefined
  
  /**
    * A code that defines the consumption threshold as defined in the National Energy Retail Regulations, or in overriding Jurisdictional instruments. Note the details of enumeration values below: <ul><li>**LOW** - Consumption is less than the ‘lower consumption threshold’ as defined in the National Energy Retail Regulations</li><li>**MEDIUM** - Consumption is equal to or greater than the ‘lower consumption threshold’, but less than the ‘upper consumption threshold’, as defined in the National Energy Retail Regulations</li><li>**HIGH** - Consumption is equal to or greater than the ‘upper consumption threshold’ as defined in the National Energy Retail Regulations</li></ul>
    */
  var threshold: js.UndefOr[LOW | MEDIUM | HIGH] = js.undefined
}
object Classification {
  
  inline def apply(): Classification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classification]
  }
  
  extension [Self <: Classification](x: Self) {
    
    inline def setClassification(value: BUSINESS | RESIDENTIAL): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setThreshold(value: LOW | MEDIUM | HIGH): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
