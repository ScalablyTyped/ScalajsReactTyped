package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonCheckboxElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCheckboxCheckboxInterfaceMod {
  
  trait CheckboxChangeEventDetail[T] extends StObject {
    
    var checked: Boolean
    
    var value: T
  }
  object CheckboxChangeEventDetail {
    
    inline def apply[T](checked: Boolean, value: T): CheckboxChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxChangeEventDetail[T]]
    }
    
    extension [Self <: CheckboxChangeEventDetail[?], T](x: Self & CheckboxChangeEventDetail[T]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckboxCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_CheckboxCustomEvent: CheckboxChangeEventDetail[T] = js.native
    
    @JSName("target")
    var target_CheckboxCustomEvent: HTMLIonCheckboxElement = js.native
  }
}
