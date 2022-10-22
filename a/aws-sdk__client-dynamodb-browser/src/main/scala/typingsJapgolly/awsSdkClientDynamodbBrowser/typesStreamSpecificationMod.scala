package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_AND_OLD_IMAGES
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_IMAGE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.OLD_IMAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStreamSpecificationMod {
  
  trait StreamSpecification extends StObject {
    
    /**
      * <p>Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.</p>
      */
    var StreamEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p> When an item in the table is modified, <code>StreamViewType</code> determines what information is written to the stream for this table. Valid values for <code>StreamViewType</code> are:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the key attributes of the modified item are written to the stream.</p> </li> <li> <p> <code>NEW_IMAGE</code> - The entire item, as it appears after it was modified, is written to the stream.</p> </li> <li> <p> <code>OLD_IMAGE</code> - The entire item, as it appeared before it was modified, is written to the stream.</p> </li> <li> <p> <code>NEW_AND_OLD_IMAGES</code> - Both the new and the old item images of the item are written to the stream.</p> </li> </ul>
      */
    var StreamViewType: js.UndefOr[NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String] = js.undefined
  }
  object StreamSpecification {
    
    inline def apply(): StreamSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamSpecification]
    }
    
    extension [Self <: StreamSpecification](x: Self) {
      
      inline def setStreamEnabled(value: Boolean): Self = StObject.set(x, "StreamEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamEnabledUndefined: Self = StObject.set(x, "StreamEnabled", js.undefined)
      
      inline def setStreamViewType(value: NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
      
      inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
    }
  }
  
  type UnmarshalledStreamSpecification = StreamSpecification
}
