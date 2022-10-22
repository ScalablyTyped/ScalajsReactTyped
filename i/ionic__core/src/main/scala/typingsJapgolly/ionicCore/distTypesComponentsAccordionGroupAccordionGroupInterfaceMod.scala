package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionGroupElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAccordionGroupAccordionGroupInterfaceMod {
  
  trait AccordionGroupChangeEventDetail[T] extends StObject {
    
    var value: T
  }
  object AccordionGroupChangeEventDetail {
    
    inline def apply[T](value: T): AccordionGroupChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionGroupChangeEventDetail[T]]
    }
    
    extension [Self <: AccordionGroupChangeEventDetail[?], T](x: Self & AccordionGroupChangeEventDetail[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccordionGroupCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_AccordionGroupCustomEvent: AccordionGroupChangeEventDetail[T] = js.native
    
    @JSName("target")
    var target_AccordionGroupCustomEvent: HTMLIonAccordionGroupElement = js.native
  }
}
