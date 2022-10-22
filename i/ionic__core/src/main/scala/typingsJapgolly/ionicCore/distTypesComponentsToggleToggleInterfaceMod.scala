package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToggleElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsToggleToggleInterfaceMod {
  
  trait ToggleChangeEventDetail[T] extends StObject {
    
    var checked: Boolean
    
    var value: T
  }
  object ToggleChangeEventDetail {
    
    inline def apply[T](checked: Boolean, value: T): ToggleChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleChangeEventDetail[T]]
    }
    
    extension [Self <: ToggleChangeEventDetail[?], T](x: Self & ToggleChangeEventDetail[T]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ToggleCustomEvent: ToggleChangeEventDetail[T] = js.native
    
    @JSName("target")
    var target_ToggleCustomEvent: HTMLIonToggleElement = js.native
  }
}
