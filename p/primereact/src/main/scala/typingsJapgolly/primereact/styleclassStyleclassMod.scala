package typingsJapgolly.primereact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleclassStyleclassMod {
  
  @JSImport("primereact/styleclass/styleclass", "StyleClass")
  @js.native
  open class StyleClass protected () extends Component[StyleClassProps, Any, Any] {
    def this(props: StyleClassProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleClassProps, context: Any) = this()
    
    def getElement(): HTMLElement = js.native
    
    def getTarget(): HTMLElement = js.native
  }
  
  trait StyleClassProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var enterActiveClassName: js.UndefOr[String] = js.undefined
    
    var enterClassName: js.UndefOr[String] = js.undefined
    
    var enterToClassName: js.UndefOr[String] = js.undefined
    
    var hideOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    var leaveActiveClassName: js.UndefOr[String] = js.undefined
    
    var leaveClassName: js.UndefOr[String] = js.undefined
    
    var leaveToClassName: js.UndefOr[String] = js.undefined
    
    var nodeRef: MutableRefObject[Node]
    
    var selector: js.UndefOr[StyleClassSelectorType] = js.undefined
    
    var toggleClassName: js.UndefOr[String] = js.undefined
  }
  object StyleClassProps {
    
    inline def apply(nodeRef: MutableRefObject[Node]): StyleClassProps = {
      val __obj = js.Dynamic.literal(nodeRef = nodeRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleClassProps]
    }
    
    extension [Self <: StyleClassProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnterActiveClassName(value: String): Self = StObject.set(x, "enterActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterActiveClassNameUndefined: Self = StObject.set(x, "enterActiveClassName", js.undefined)
      
      inline def setEnterClassName(value: String): Self = StObject.set(x, "enterClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterClassNameUndefined: Self = StObject.set(x, "enterClassName", js.undefined)
      
      inline def setEnterToClassName(value: String): Self = StObject.set(x, "enterToClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterToClassNameUndefined: Self = StObject.set(x, "enterToClassName", js.undefined)
      
      inline def setHideOnOutsideClick(value: Boolean): Self = StObject.set(x, "hideOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnOutsideClickUndefined: Self = StObject.set(x, "hideOnOutsideClick", js.undefined)
      
      inline def setLeaveActiveClassName(value: String): Self = StObject.set(x, "leaveActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveActiveClassNameUndefined: Self = StObject.set(x, "leaveActiveClassName", js.undefined)
      
      inline def setLeaveClassName(value: String): Self = StObject.set(x, "leaveClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveClassNameUndefined: Self = StObject.set(x, "leaveClassName", js.undefined)
      
      inline def setLeaveToClassName(value: String): Self = StObject.set(x, "leaveToClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveToClassNameUndefined: Self = StObject.set(x, "leaveToClassName", js.undefined)
      
      inline def setNodeRef(value: MutableRefObject[Node]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: StyleClassSelectorType): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setToggleClassName(value: String): Self = StObject.set(x, "toggleClassName", value.asInstanceOf[js.Any])
      
      inline def setToggleClassNameUndefined: Self = StObject.set(x, "toggleClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.`@next`
    - typingsJapgolly.primereact.primereactStrings.`@prev`
    - typingsJapgolly.primereact.primereactStrings.`@parent`
    - typingsJapgolly.primereact.primereactStrings.`@grandparent`
    - java.lang.String
  */
  type StyleClassSelectorType = _StyleClassSelectorType | String
  
  trait _StyleClassSelectorType extends StObject
}
