package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.prefix
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.suffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFilterRuleMod {
  
  trait FilterRule extends StObject {
    
    /**
      * <p>Object key name prefix or suffix identifying one or more objects to which the filtering rule applies. Maximum prefix length can be up to 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    var Name: js.UndefOr[prefix | suffix | String] = js.undefined
    
    /**
      * _FilterRuleValue shape
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  object FilterRule {
    
    inline def apply(): FilterRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterRule]
    }
    
    extension [Self <: FilterRule](x: Self) {
      
      inline def setName(value: prefix | suffix | String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledFilterRule = FilterRule
}
