package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.tuyaPanelKit.anon.Arrow
import typingsJapgolly.tuyaPanelKit.anon.BoardBg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionDataProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 数据源
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Data source
    * @defaultValue null
    */
  var data: js.UndefOr[js.Array[Arrow]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 如果列表是开关类型，是否可以点击
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description If the list is of switch type, can I click
    * @defaultValue null
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分组列表的底部文本或者自定义渲染
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Text at the bottom of the group list or custom rendering
    * @defaultValue null
    */
  var footer: js.UndefOr[Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description Key 值
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Key Value
    * @defaultValue null
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue null
    */
  var theme: js.UndefOr[BoardBg] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分组列表的标题或者自定义头部渲染
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Group list title or custom header rendering
    * @defaultValue null
    */
  var title: js.UndefOr[String | Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项的具体值
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The specific value of the list item
    * @defaultValue null
    */
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}
object SectionDataProps {
  
  inline def apply(): SectionDataProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionDataProps]
  }
  
  extension [Self <: SectionDataProps](x: Self) {
    
    inline def setData(value: js.Array[Arrow]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Arrow*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTheme(value: BoardBg): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String | Node): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
