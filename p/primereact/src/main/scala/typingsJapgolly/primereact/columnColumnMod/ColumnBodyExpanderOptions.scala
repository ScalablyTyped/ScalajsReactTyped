package typingsJapgolly.primereact.columnColumnMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBodyExpanderOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var element: js.UndefOr[Element] = js.undefined
  
  var iconClassName: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
}
object ColumnBodyExpanderOptions {
  
  inline def apply(): ColumnBodyExpanderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBodyExpanderOptions]
  }
  
  extension [Self <: ColumnBodyExpanderOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    inline def setOnClick(value: /* e */ Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
