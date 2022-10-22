package typingsJapgolly.chrome.chrome.contentSettings

import typingsJapgolly.chrome.chromeStrings.allow
import typingsJapgolly.chrome.chromeStrings.block
import typingsJapgolly.chrome.chromeStrings.detect_important_content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginsSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_PluginsSetDetails: allow | block | detect_important_content
}
object PluginsSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | detect_important_content): PluginsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsSetDetails]
  }
  
  extension [Self <: PluginsSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block | detect_important_content): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
