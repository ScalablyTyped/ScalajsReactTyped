package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLING
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeToLiveDescriptionMod {
  
  trait TimeToLiveDescription extends StObject {
    
    /**
      * <p> The name of the Time to Live attribute for items in the table.</p>
      */
    var AttributeName: js.UndefOr[String] = js.undefined
    
    /**
      * <p> The Time to Live status for the table.</p>
      */
    var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.undefined
  }
  object TimeToLiveDescription {
    
    inline def apply(): TimeToLiveDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeToLiveDescription]
    }
    
    extension [Self <: TimeToLiveDescription](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
      
      inline def setTimeToLiveStatus(value: ENABLING | DISABLING | ENABLED | DISABLED | String): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
    }
  }
  
  type UnmarshalledTimeToLiveDescription = TimeToLiveDescription
}
