package typingsJapgolly.naverWhale.whale.contentSettings

import typingsJapgolly.naverWhale.naverWhaleStrings.allow
import typingsJapgolly.naverWhale.naverWhaleStrings.ask
import typingsJapgolly.naverWhale.naverWhaleStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleAutomaticDownloadsSetDetails
  extends StObject
     with typingsJapgolly.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_MultipleAutomaticDownloadsSetDetails: allow | block | ask
}
object MultipleAutomaticDownloadsSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | ask): MultipleAutomaticDownloadsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAutomaticDownloadsSetDetails]
  }
  
  extension [Self <: MultipleAutomaticDownloadsSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
