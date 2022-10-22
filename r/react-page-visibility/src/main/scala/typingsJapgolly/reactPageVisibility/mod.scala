package typingsJapgolly.reactPageVisibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-page-visibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-page-visibility", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PageVisibilityProps, js.Object, Any]
  
  inline def usePageVisibility(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usePageVisibility")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.visible
    - typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.hidden
    - typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.prerender
    - typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.unloaded
  */
  trait KnownVisibilityStates extends StObject
  object KnownVisibilityStates {
    
    inline def hidden: typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.hidden]
    
    inline def prerender: typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.prerender = "prerender".asInstanceOf[typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.prerender]
    
    inline def unloaded: typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.unloaded = "unloaded".asInstanceOf[typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.unloaded]
    
    inline def visible: typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.visible = "visible".asInstanceOf[typingsJapgolly.reactPageVisibility.reactPageVisibilityStrings.visible]
  }
  
  type PageVisibility = japgolly.scalajs.react.facade.React.Component[PageVisibilityProps & js.Object, js.Object]
  
  trait PageVisibilityProps extends StObject {
    
    var children: js.UndefOr[
        Node | (js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, Node])
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, Unit]
      ] = js.undefined
  }
  object PageVisibilityProps {
    
    inline def apply(): PageVisibilityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageVisibilityProps]
    }
    
    extension [Self <: PageVisibilityProps](x: Self) {
      
      inline def setChildren(
        value: Node | (js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, Node])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction2(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* isVisible */ Boolean, t1: /* visibilityState */ KnownVisibilityStates) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
