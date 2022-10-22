package typingsJapgolly.storybookApi.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.distTs3Dot9ModulesShortcutsMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(): Unit
  
  def dispatchEvent(event: Event): Boolean
  
  def getAttribute(attr: String): String | Null
  
  def removeEventListener(): Boolean
  
  var tagName: String
}
object AddEventListener {
  
  inline def apply(
    addEventListener: Callback,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: CallbackTo[Boolean],
    tagName: String
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.toJsFn, dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = removeEventListener.toJsFn, tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEventListener]
  }
  
  extension [Self <: AddEventListener](x: Self) {
    
    inline def setAddEventListener(value: Callback): Self = StObject.set(x, "addEventListener", value.toJsFn)
    
    inline def setDispatchEvent(value: Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: CallbackTo[Boolean]): Self = StObject.set(x, "removeEventListener", value.toJsFn)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
