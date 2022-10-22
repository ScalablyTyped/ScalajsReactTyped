package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.height
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCollapseMod {
  
  @JSImport("react-bootstrap/lib/Collapse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CollapseProps, js.Object, Any]
  
  type Collapse = japgolly.scalajs.react.facade.React.Component[CollapseProps & js.Object, js.Object]
  
  trait CollapseProps
    extends StObject
       with TransitionCallbacks
       with ClassAttributes[
          japgolly.scalajs.react.facade.React.Component[CollapseProps & js.Object, js.Object]
        ] {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var dimension: js.UndefOr[height | width | js.Function0[String]] = js.undefined
    
    var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ Element, Double]] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transitionAppear: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDimension(value: height | width | js.Function0[String]): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "dimension", value.toJsFn)
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setGetDimensionValue(value: (/* dimension */ Double, /* element */ Element) => Double): Self = StObject.set(x, "getDimensionValue", js.Any.fromFunction2(value))
      
      inline def setGetDimensionValueUndefined: Self = StObject.set(x, "getDimensionValue", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
      
      inline def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
