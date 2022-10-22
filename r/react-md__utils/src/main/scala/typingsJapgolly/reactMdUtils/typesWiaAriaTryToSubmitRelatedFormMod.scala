package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaTryToSubmitRelatedFormMod {
  
  @JSImport("@react-md/utils/types/wia-aria/tryToSubmitRelatedForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryToSubmitRelatedForm(event: KeyboardSubmitEventPartial): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToSubmitRelatedForm")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'preventDefault' | 'stopPropagation' | 'currentTarget'> */
  trait KeyboardSubmitEventPartial extends StObject {
    
    var currentTarget: EventTarget | Null
    
    var key: String
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
  }
  object KeyboardSubmitEventPartial {
    
    inline def apply(key: String, preventDefault: Callback, stopPropagation: Callback): KeyboardSubmitEventPartial = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, currentTarget = null)
      __obj.asInstanceOf[KeyboardSubmitEventPartial]
    }
    
    extension [Self <: KeyboardSubmitEventPartial](x: Self) {
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    }
  }
}
