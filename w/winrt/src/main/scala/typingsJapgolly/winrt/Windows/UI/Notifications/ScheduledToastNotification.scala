package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledToastNotification
  extends StObject
     with IScheduledToastNotification
object ScheduledToastNotification {
  
  inline def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): ScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledToastNotification]
  }
}
