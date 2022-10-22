package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  def click(event: Event): Unit
  
  var id: js.UndefOr[String] = js.undefined
  
  var text: String
}
object Class {
  
  inline def apply(click: Event => Callback, text: String): Class = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: Event) => click(t0).runNow()), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  extension [Self <: Class](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClick(value: Event => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
