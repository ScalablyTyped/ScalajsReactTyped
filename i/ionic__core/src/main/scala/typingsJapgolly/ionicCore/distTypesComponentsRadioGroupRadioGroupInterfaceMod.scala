package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRadioGroupElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRadioGroupRadioGroupInterfaceMod {
  
  trait RadioGroupChangeEventDetail[T] extends StObject {
    
    var value: T
  }
  object RadioGroupChangeEventDetail {
    
    inline def apply[T](value: T): RadioGroupChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupChangeEventDetail[T]]
    }
    
    extension [Self <: RadioGroupChangeEventDetail[?], T](x: Self & RadioGroupChangeEventDetail[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioGroupCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RadioGroupCustomEvent: RadioGroupChangeEventDetail[T] = js.native
    
    @JSName("target")
    var target_RadioGroupCustomEvent: HTMLIonRadioGroupElement = js.native
  }
}
