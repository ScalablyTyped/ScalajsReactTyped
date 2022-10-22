package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.selectedTab
import typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedTab extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var selectedTab: typingsJapgolly.ionicAngular.ionicAngularStrings.selectedTab
  
  var translucent: typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
}
object SelectedTab {
  
  inline def apply(): SelectedTab = {
    val __obj = js.Dynamic.literal(color = "color", mode = "mode", selectedTab = "selectedTab", translucent = "translucent")
    __obj.asInstanceOf[SelectedTab]
  }
  
  extension [Self <: SelectedTab](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSelectedTab(value: selectedTab): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
    
    inline def setTranslucent(value: translucent): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
  }
}
