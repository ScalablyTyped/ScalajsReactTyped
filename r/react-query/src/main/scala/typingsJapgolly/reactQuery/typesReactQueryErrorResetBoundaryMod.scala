package typingsJapgolly.reactQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactQueryErrorResetBoundaryMod {
  
  @JSImport("react-query/types/react/QueryErrorResetBoundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def QueryErrorResetBoundary(hasChildren: QueryErrorResetBoundaryProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryErrorResetBoundary")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useQueryErrorResetBoundary(): QueryErrorResetBoundaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryErrorResetBoundary")().asInstanceOf[QueryErrorResetBoundaryValue]
  
  trait QueryErrorResetBoundaryProps extends StObject {
    
    var children: (js.Function1[/* value */ QueryErrorResetBoundaryValue, Node]) | Node
  }
  object QueryErrorResetBoundaryProps {
    
    inline def apply(): QueryErrorResetBoundaryProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[QueryErrorResetBoundaryProps]
    }
    
    extension [Self <: QueryErrorResetBoundaryProps](x: Self) {
      
      inline def setChildren(value: (js.Function1[/* value */ QueryErrorResetBoundaryValue, Node]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* value */ QueryErrorResetBoundaryValue => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait QueryErrorResetBoundaryValue extends StObject {
    
    def clearReset(): Unit
    
    def isReset(): Boolean
    
    def reset(): Unit
  }
  object QueryErrorResetBoundaryValue {
    
    inline def apply(clearReset: Callback, isReset: CallbackTo[Boolean], reset: Callback): QueryErrorResetBoundaryValue = {
      val __obj = js.Dynamic.literal(clearReset = clearReset.toJsFn, isReset = isReset.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[QueryErrorResetBoundaryValue]
    }
    
    extension [Self <: QueryErrorResetBoundaryValue](x: Self) {
      
      inline def setClearReset(value: Callback): Self = StObject.set(x, "clearReset", value.toJsFn)
      
      inline def setIsReset(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReset", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
}
