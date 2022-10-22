package typingsJapgolly.reactMathjax

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactMathjax.anon.Children
import typingsJapgolly.reactMathjax.anon.Formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-mathjax", "default.Node")
    @js.native
    open class Node ()
      extends PureComponent[Formula, js.Object, Any]
    
    @JSImport("react-mathjax", "default.Provider")
    @js.native
    open class Provider () extends Component[Children, MathJaxContextValue, Any]
  }
  
  object MathJax {
    
    type Node = PureComponent[Formula, js.Object, Any]
    
    type Provider = japgolly.scalajs.react.facade.React.Component[Children & js.Object, js.Object]
  }
  
  trait MathJaxContextValue extends StObject {
    
    var MathJax: js.UndefOr[js.Object] = js.undefined
    
    def registerNode(): Unit
  }
  object MathJaxContextValue {
    
    inline def apply(registerNode: Callback): MathJaxContextValue = {
      val __obj = js.Dynamic.literal(registerNode = registerNode.toJsFn)
      __obj.asInstanceOf[MathJaxContextValue]
    }
    
    extension [Self <: MathJaxContextValue](x: Self) {
      
      inline def setMathJax(value: js.Object): Self = StObject.set(x, "MathJax", value.asInstanceOf[js.Any])
      
      inline def setMathJaxUndefined: Self = StObject.set(x, "MathJax", js.undefined)
      
      inline def setRegisterNode(value: Callback): Self = StObject.set(x, "registerNode", value.toJsFn)
    }
  }
}
