package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledToastNotification extends StObject {
  
  var content: XmlDocument
  
  var deliveryTime: js.Date
  
  var id: String
  
  var maximumSnoozeCount: Double
  
  var snoozeInterval: Double
}
object IScheduledToastNotification {
  
  inline def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledToastNotification]
  }
  
  extension [Self <: IScheduledToastNotification](x: Self) {
    
    inline def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTime(value: js.Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaximumSnoozeCount(value: Double): Self = StObject.set(x, "maximumSnoozeCount", value.asInstanceOf[js.Any])
    
    inline def setSnoozeInterval(value: Double): Self = StObject.set(x, "snoozeInterval", value.asInstanceOf[js.Any])
  }
}
