package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.tuyaPanelKit.anon.DividerColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerIOSProps * / any */ trait PickerViewIOSProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 自定义内容
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description customized contend
    * @defaultValue undefined
    */
  var children: Node
  
  /**
    * @language zh-CN
    * @description Picker是否循环滚动
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to simulate an endless loop
    * @defaultValue false
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: js.UndefOr[DividerColor] = js.undefined
}
object PickerViewIOSProps {
  
  inline def apply(): PickerViewIOSProps = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[PickerViewIOSProps]
  }
  
  extension [Self <: PickerViewIOSProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setTheme(value: DividerColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
