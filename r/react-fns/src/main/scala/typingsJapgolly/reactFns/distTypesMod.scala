package typingsJapgolly.reactFns

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ CompositeComponent[TMergedProps], 
    ComponentClassP[TOwnProps & js.Object]
  ]
  
  type CompositeComponent[P] = (ComponentClassP[P & js.Object]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any)
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  
  trait SharedRenderProps[P] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* props */ P, Node]) | Node] = js.undefined
    
    var component: js.UndefOr[ComponentType[P | Unit]] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ P, Node]] = js.undefined
  }
  object SharedRenderProps {
    
    inline def apply[P](): SharedRenderProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedRenderProps[P]]
    }
    
    extension [Self <: SharedRenderProps[?], P](x: Self & SharedRenderProps[P]) {
      
      inline def setChildren(value: (js.Function1[/* props */ P, Node]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ P => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentType[P | Unit]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setRender(value: /* props */ P => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
