package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.scrollable
import typingsJapgolly.ionicAngular.ionicAngularStrings.selectOnFocus
import typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var scrollable: typingsJapgolly.ionicAngular.ionicAngularStrings.scrollable
  
  var selectOnFocus: typingsJapgolly.ionicAngular.ionicAngularStrings.selectOnFocus
  
  var swipeGesture: typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Scrollable {
  
  inline def apply(): Scrollable = {
    val __obj = js.Dynamic.literal(color = "color", disabled = "disabled", mode = "mode", scrollable = "scrollable", selectOnFocus = "selectOnFocus", swipeGesture = "swipeGesture", value = "value")
    __obj.asInstanceOf[Scrollable]
  }
  
  extension [Self <: Scrollable](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setScrollable(value: scrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setSelectOnFocus(value: selectOnFocus): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSwipeGesture(value: swipeGesture): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
