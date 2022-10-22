package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.anon.AddTab
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoginLoginTabMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  open class default () extends Component[LoginTabProps, Any, Any]
  
  type LoginTab = japgolly.scalajs.react.facade.React.Component[LoginTabProps & js.Object, js.Object]
  
  trait LoginTabProps extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var tab: js.UndefOr[Node] = js.undefined
    
    var tabUtil: AddTab
  }
  object LoginTabProps {
    
    inline def apply(tabUtil: AddTab): LoginTabProps = {
      val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginTabProps]
    }
    
    extension [Self <: LoginTabProps](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTab(value: VdomNode): Self = StObject.set(x, "tab", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTabNull: Self = StObject.set(x, "tab", null)
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setTabUtil(value: AddTab): Self = StObject.set(x, "tabUtil", value.asInstanceOf[js.Any])
      
      inline def setTabVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tab", js.Array(value*))
      
      inline def setTabVdomElement(value: VdomElement): Self = StObject.set(x, "tab", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
