package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTextareaElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTextareaTextareaInterfaceMod {
  
  trait TextareaChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object TextareaChangeEventDetail {
    
    inline def apply(): TextareaChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaChangeEventDetail]
    }
    
    extension [Self <: TextareaChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TextareaCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_TextareaCustomEvent: TextareaChangeEventDetail = js.native
    
    @JSName("target")
    var target_TextareaCustomEvent: HTMLIonTextareaElement = js.native
  }
}
