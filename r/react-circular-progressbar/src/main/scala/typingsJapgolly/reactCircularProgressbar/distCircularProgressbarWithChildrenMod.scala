package typingsJapgolly.reactCircularProgressbar

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCircularProgressbarWithChildrenMod {
  
  @JSImport("react-circular-progressbar/dist/CircularProgressbarWithChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CircularProgressbarWithChildrenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CircularProgressbarWithChildrenProps
    extends StObject
       with CircularProgressbarWrapperProps {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object CircularProgressbarWithChildrenProps {
    
    inline def apply(value: Double): CircularProgressbarWithChildrenProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarWithChildrenProps]
    }
    
    extension [Self <: CircularProgressbarWithChildrenProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
