package typingsJapgolly.atlaskitPopper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactPopper.mod.ReferenceChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-popper.react-popper.ManagerProps> */
  trait ReadonlyManagerProps extends StObject {
    
    val children: Node
  }
  object ReadonlyManagerProps {
    
    inline def apply(): ReadonlyManagerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ReadonlyManagerProps]
    }
    
    extension [Self <: ReadonlyManagerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-popper.react-popper.ReferenceProps> */
  trait ReadonlyReferenceProps extends StObject {
    
    val children: js.Function1[/* props */ ReferenceChildrenProps, Node]
    
    val innerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ReadonlyReferenceProps {
    
    inline def apply(children: /* props */ ReferenceChildrenProps => Node): ReadonlyReferenceProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReadonlyReferenceProps]
    }
    
    extension [Self <: ReadonlyReferenceProps](x: Self) {
      
      inline def setChildren(value: /* props */ ReferenceChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
