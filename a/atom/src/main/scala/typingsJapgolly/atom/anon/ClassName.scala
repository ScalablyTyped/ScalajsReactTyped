package typingsJapgolly.atom.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var onDidClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object ClassName {
  
  inline def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnDidClick(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onDidClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnDidClickUndefined: Self = StObject.set(x, "onDidClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
