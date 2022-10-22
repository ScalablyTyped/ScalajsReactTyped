package typingsJapgolly.reactOnsenui.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbarRenderTab extends StObject {
  
  var content: Element
  
  var tab: Element
}
object TabbarRenderTab {
  
  inline def apply(content: VdomElement, tab: VdomElement): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.rawElement.asInstanceOf[js.Any], tab = tab.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
  
  extension [Self <: TabbarRenderTab](x: Self) {
    
    inline def setContent(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTab(value: VdomElement): Self = StObject.set(x, "tab", value.rawElement.asInstanceOf[js.Any])
  }
}
