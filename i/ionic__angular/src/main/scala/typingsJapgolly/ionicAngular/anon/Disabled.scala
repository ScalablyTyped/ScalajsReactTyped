package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.readonly
import typingsJapgolly.ionicAngular.ionicAngularStrings.toggleIcon
import typingsJapgolly.ionicAngular.ionicAngularStrings.toggleIconSlot
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var readonly: typingsJapgolly.ionicAngular.ionicAngularStrings.readonly
  
  var toggleIcon: typingsJapgolly.ionicAngular.ionicAngularStrings.toggleIcon
  
  var toggleIconSlot: typingsJapgolly.ionicAngular.ionicAngularStrings.toggleIconSlot
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Disabled {
  
  inline def apply(): Disabled = {
    val __obj = js.Dynamic.literal(disabled = "disabled", mode = "mode", readonly = "readonly", toggleIcon = "toggleIcon", toggleIconSlot = "toggleIconSlot", value = "value")
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: readonly): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setToggleIcon(value: toggleIcon): Self = StObject.set(x, "toggleIcon", value.asInstanceOf[js.Any])
    
    inline def setToggleIconSlot(value: toggleIconSlot): Self = StObject.set(x, "toggleIconSlot", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
