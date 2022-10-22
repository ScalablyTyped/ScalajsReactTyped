package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderInputComponentProps
  extends StObject
     with InputHTMLAttributes[Any] {
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  @JSName("value")
  var value_RenderInputComponentProps: String
}
object RenderInputComponentProps {
  
  inline def apply(value: String): RenderInputComponentProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputComponentProps]
  }
  
  extension [Self <: RenderInputComponentProps](x: Self) {
    
    inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
