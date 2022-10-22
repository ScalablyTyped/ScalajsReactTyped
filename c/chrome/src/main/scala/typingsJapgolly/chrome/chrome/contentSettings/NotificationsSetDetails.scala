package typingsJapgolly.chrome.chrome.contentSettings

import typingsJapgolly.chrome.chromeStrings.allow
import typingsJapgolly.chrome.chromeStrings.ask
import typingsJapgolly.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_NotificationsSetDetails: allow | block | ask
}
object NotificationsSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | ask): NotificationsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsSetDetails]
  }
  
  extension [Self <: NotificationsSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
