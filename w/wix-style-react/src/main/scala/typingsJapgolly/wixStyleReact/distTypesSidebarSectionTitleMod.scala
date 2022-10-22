package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionTitleMod {
  
  @JSImport("wix-style-react/dist/types/SidebarSectionTitle", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarSectionTitleProps, js.Object, Any]
  
  type SidebarSectionTitle = PureComponent[SidebarSectionTitleProps, js.Object, Any]
  
  trait SidebarSectionTitleProps extends StObject {
    
    var children: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object SidebarSectionTitleProps {
    
    inline def apply(): SidebarSectionTitleProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[SidebarSectionTitleProps]
    }
    
    extension [Self <: SidebarSectionTitleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
