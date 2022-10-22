package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.pullingIcon
import typingsJapgolly.ionicAngular.ionicAngularStrings.pullingText
import typingsJapgolly.ionicAngular.ionicAngularStrings.refreshingSpinner
import typingsJapgolly.ionicAngular.ionicAngularStrings.refreshingText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullingIcon extends StObject {
  
  var pullingIcon: typingsJapgolly.ionicAngular.ionicAngularStrings.pullingIcon
  
  var pullingText: typingsJapgolly.ionicAngular.ionicAngularStrings.pullingText
  
  var refreshingSpinner: typingsJapgolly.ionicAngular.ionicAngularStrings.refreshingSpinner
  
  var refreshingText: typingsJapgolly.ionicAngular.ionicAngularStrings.refreshingText
}
object PullingIcon {
  
  inline def apply(): PullingIcon = {
    val __obj = js.Dynamic.literal(pullingIcon = "pullingIcon", pullingText = "pullingText", refreshingSpinner = "refreshingSpinner", refreshingText = "refreshingText")
    __obj.asInstanceOf[PullingIcon]
  }
  
  extension [Self <: PullingIcon](x: Self) {
    
    inline def setPullingIcon(value: pullingIcon): Self = StObject.set(x, "pullingIcon", value.asInstanceOf[js.Any])
    
    inline def setPullingText(value: pullingText): Self = StObject.set(x, "pullingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingSpinner(value: refreshingSpinner): Self = StObject.set(x, "refreshingSpinner", value.asInstanceOf[js.Any])
    
    inline def setRefreshingText(value: refreshingText): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
  }
}
