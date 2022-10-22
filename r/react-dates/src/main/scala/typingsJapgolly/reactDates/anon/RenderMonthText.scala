package typingsJapgolly.reactDates.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactDates.mod.RenderMonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderMonthText
  extends StObject
     with RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[(js.Function1[/* props */ IsVisible, Node]) | Null] = js.undefined
  
  var renderMonthText: js.UndefOr[scala.Nothing] = js.undefined
}
object RenderMonthText {
  
  inline def apply(): RenderMonthText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthText]
  }
  
  extension [Self <: RenderMonthText](x: Self) {
    
    inline def setRenderMonthElement(value: /* props */ IsVisible => Node): Self = StObject.set(x, "renderMonthElement", js.Any.fromFunction1(value))
    
    inline def setRenderMonthElementNull: Self = StObject.set(x, "renderMonthElement", null)
    
    inline def setRenderMonthElementUndefined: Self = StObject.set(x, "renderMonthElement", js.undefined)
  }
}
