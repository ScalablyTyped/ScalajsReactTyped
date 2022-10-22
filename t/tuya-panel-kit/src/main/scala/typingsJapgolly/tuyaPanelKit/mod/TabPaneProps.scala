package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabPaneProps
  extends StObject
     with TabProps {
  
  /**
    * @language zh-CN
    * @description Tab 上文字或者自定义的元素
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text or custom elements on tab
    * @defaultValue undefined
    */
  var tab: js.UndefOr[Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description 每个 tab 的宽度
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Width of each tab
    * @defaultValue undefined
    */
  var tabWidth: js.UndefOr[Double] = js.undefined
}
object TabPaneProps {
  
  inline def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  
  extension [Self <: TabPaneProps](x: Self) {
    
    inline def setTab(value: VdomNode): Self = StObject.set(x, "tab", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTabNull: Self = StObject.set(x, "tab", null)
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    inline def setTabVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tab", js.Array(value*))
    
    inline def setTabVdomElement(value: VdomElement): Self = StObject.set(x, "tab", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
  }
}
