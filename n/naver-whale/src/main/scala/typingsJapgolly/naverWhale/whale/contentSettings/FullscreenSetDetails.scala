package typingsJapgolly.naverWhale.whale.contentSettings

import typingsJapgolly.naverWhale.naverWhaleStrings.allow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenSetDetails
  extends StObject
     with typingsJapgolly.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_FullscreenSetDetails: allow
}
object FullscreenSetDetails {
  
  inline def apply(primaryPattern: String): FullscreenSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = "allow")
    __obj.asInstanceOf[FullscreenSetDetails]
  }
  
  extension [Self <: FullscreenSetDetails](x: Self) {
    
    inline def setSetting(value: allow): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
