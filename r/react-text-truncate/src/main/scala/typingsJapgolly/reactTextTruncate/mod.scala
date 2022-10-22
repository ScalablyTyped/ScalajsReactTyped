package typingsJapgolly.reactTextTruncate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TextTruncateProps, js.Object, Any]
  
  type TextTruncate = japgolly.scalajs.react.facade.React.Component[TextTruncateProps & js.Object, js.Object]
  
  trait TextTruncateProps extends StObject {
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double | Boolean] = js.undefined
    
    var maxCalculateTimes: js.UndefOr[Double] = js.undefined
    
    var onCalculated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onToggled: js.UndefOr[js.Function1[/* truncated */ Boolean, Unit]] = js.undefined
    
    var onTruncated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var textElement: js.UndefOr[Node] = js.undefined
    
    var textTruncateChild: js.UndefOr[Node] = js.undefined
    
    var truncateText: js.UndefOr[String] = js.undefined
  }
  object TextTruncateProps {
    
    inline def apply(): TextTruncateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextTruncateProps]
    }
    
    extension [Self <: TextTruncateProps](x: Self) {
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setLine(value: Double | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMaxCalculateTimes(value: Double): Self = StObject.set(x, "maxCalculateTimes", value.asInstanceOf[js.Any])
      
      inline def setMaxCalculateTimesUndefined: Self = StObject.set(x, "maxCalculateTimes", js.undefined)
      
      inline def setOnCalculated(value: Callback): Self = StObject.set(x, "onCalculated", value.toJsFn)
      
      inline def setOnCalculatedUndefined: Self = StObject.set(x, "onCalculated", js.undefined)
      
      inline def setOnToggled(value: /* truncated */ Boolean => Callback): Self = StObject.set(x, "onToggled", js.Any.fromFunction1((t0: /* truncated */ Boolean) => value(t0).runNow()))
      
      inline def setOnToggledUndefined: Self = StObject.set(x, "onToggled", js.undefined)
      
      inline def setOnTruncated(value: Callback): Self = StObject.set(x, "onTruncated", value.toJsFn)
      
      inline def setOnTruncatedUndefined: Self = StObject.set(x, "onTruncated", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextElement(value: VdomNode): Self = StObject.set(x, "textElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextElementNull: Self = StObject.set(x, "textElement", null)
      
      inline def setTextElementUndefined: Self = StObject.set(x, "textElement", js.undefined)
      
      inline def setTextElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "textElement", js.Array(value*))
      
      inline def setTextElementVdomElement(value: VdomElement): Self = StObject.set(x, "textElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextTruncateChild(value: VdomNode): Self = StObject.set(x, "textTruncateChild", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextTruncateChildNull: Self = StObject.set(x, "textTruncateChild", null)
      
      inline def setTextTruncateChildUndefined: Self = StObject.set(x, "textTruncateChild", js.undefined)
      
      inline def setTextTruncateChildVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "textTruncateChild", js.Array(value*))
      
      inline def setTextTruncateChildVdomElement(value: VdomElement): Self = StObject.set(x, "textTruncateChild", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTruncateText(value: String): Self = StObject.set(x, "truncateText", value.asInstanceOf[js.Any])
      
      inline def setTruncateTextUndefined: Self = StObject.set(x, "truncateText", js.undefined)
    }
  }
}
