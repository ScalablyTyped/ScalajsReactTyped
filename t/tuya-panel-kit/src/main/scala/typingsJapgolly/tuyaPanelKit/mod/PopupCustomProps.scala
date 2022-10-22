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

trait PopupCustomProps
  extends StObject
     with PopupProps {
  
  /**
    * @language zh-CN
    * @description 自定义内容
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom content
    * @defaultValue null
    */
  var content: Node
}
object PopupCustomProps {
  
  inline def apply(): PopupCustomProps = {
    val __obj = js.Dynamic.literal(content = null)
    __obj.asInstanceOf[PopupCustomProps]
  }
  
  extension [Self <: PopupCustomProps](x: Self) {
    
    inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
  }
}
