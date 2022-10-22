package typingsJapgolly.chrome.chrome.contentSettings

import typingsJapgolly.chrome.chromeStrings.allow
import typingsJapgolly.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupsSetDetails
  extends StObject
     with SetDetails {
  
  @JSName("setting")
  var setting_PopupsSetDetails: allow | block
}
object PopupsSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block): PopupsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupsSetDetails]
  }
  
  extension [Self <: PopupsSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
