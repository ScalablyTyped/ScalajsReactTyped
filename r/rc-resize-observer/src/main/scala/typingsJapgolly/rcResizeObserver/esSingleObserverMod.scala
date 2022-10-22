package typingsJapgolly.rcResizeObserver

import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.rcResizeObserver.mod.ResizeObserverProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSingleObserverMod {
  
  @JSImport("rc-resize-observer/es/SingleObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SingleObserverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SingleObserverProps
    extends StObject
       with ResizeObserverProps {
    
    @JSName("children")
    var children_SingleObserverProps: japgolly.scalajs.react.facade.React.Element | (js.Function1[
        /* ref */ RefHandle[org.scalajs.dom.Element], 
        japgolly.scalajs.react.facade.React.Element
      ])
  }
  object SingleObserverProps {
    
    inline def apply(
      children: japgolly.scalajs.react.facade.React.Element | (js.Function1[
          /* ref */ RefHandle[org.scalajs.dom.Element], 
          japgolly.scalajs.react.facade.React.Element
        ])
    ): SingleObserverProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleObserverProps]
    }
    
    extension [Self <: SingleObserverProps](x: Self) {
      
      inline def setChildren(
        value: japgolly.scalajs.react.facade.React.Element | (js.Function1[
              /* ref */ RefHandle[org.scalajs.dom.Element], 
              japgolly.scalajs.react.facade.React.Element
            ])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefHandle[org.scalajs.dom.Element] => japgolly.scalajs.react.facade.React.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
