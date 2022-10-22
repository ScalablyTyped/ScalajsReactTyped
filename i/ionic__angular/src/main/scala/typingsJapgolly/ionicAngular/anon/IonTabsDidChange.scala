package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.ionTabsDidChange
import typingsJapgolly.ionicAngular.ionicAngularStrings.ionTabsWillChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTabsDidChange extends StObject {
  
  var ionTabsDidChange: typingsJapgolly.ionicAngular.ionicAngularStrings.ionTabsDidChange
  
  var ionTabsWillChange: typingsJapgolly.ionicAngular.ionicAngularStrings.ionTabsWillChange
}
object IonTabsDidChange {
  
  inline def apply(): IonTabsDidChange = {
    val __obj = js.Dynamic.literal(ionTabsDidChange = "ionTabsDidChange", ionTabsWillChange = "ionTabsWillChange")
    __obj.asInstanceOf[IonTabsDidChange]
  }
  
  extension [Self <: IonTabsDidChange](x: Self) {
    
    inline def setIonTabsDidChange(value: ionTabsDidChange): Self = StObject.set(x, "ionTabsDidChange", value.asInstanceOf[js.Any])
    
    inline def setIonTabsWillChange(value: ionTabsWillChange): Self = StObject.set(x, "ionTabsWillChange", value.asInstanceOf[js.Any])
  }
}
