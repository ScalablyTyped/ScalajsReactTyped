package typingsJapgolly.reactSelect.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerRef extends StObject {
  
  val innerRef: Ref[HTMLInputElement]
}
object InnerRef {
  
  inline def apply(): InnerRef = {
    val __obj = js.Dynamic.literal(innerRef = null)
    __obj.asInstanceOf[InnerRef]
  }
  
  extension [Self <: InnerRef](x: Self) {
    
    inline def setInnerRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
  }
}
