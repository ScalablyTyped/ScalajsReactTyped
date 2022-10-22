package typingsJapgolly.reactJsonTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.reactJsonTreeStrings.double
import typingsJapgolly.reactJsonTree.reactJsonTreeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesJsonarrowMod extends Shortcut {
  
  @JSImport("react-json-tree/lib/types/JSONArrow", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var arrowStyle: js.UndefOr[single | double] = js.undefined
    
    var expanded: Boolean
    
    var nodeType: String
    
    var onClick: MouseEventHandler[HTMLDivElement]
    
    var styling: StylingFunction
  }
  object Props {
    
    inline def apply(
      expanded: Boolean,
      nodeType: String,
      onClick: ReactMouseEventFrom[HTMLDivElement & Element] => Callback,
      styling: StylingFunction
    ): Props = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => onClick(t0).runNow()), styling = styling.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setArrowStyle(value: single | double): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      inline def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setStyling(value: StylingFunction): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesJsonarrowMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
