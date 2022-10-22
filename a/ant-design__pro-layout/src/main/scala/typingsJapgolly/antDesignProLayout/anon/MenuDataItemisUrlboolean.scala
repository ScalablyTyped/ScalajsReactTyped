package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/es/typings.MenuDataItem & {  isUrl :boolean} */
trait MenuDataItemisUrlboolean
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @name 子菜单 */
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  
  /** @name disable 菜单选项 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** @name 隐藏自己，并且将子节点提升到与自己平级 */
  var flatMenu: js.UndefOr[Boolean] = js.undefined
  
  /** @name 在菜单中隐藏子节点 */
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  
  /** @name 在菜单中隐藏自己和子节点 */
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  
  /** @name 菜单的icon */
  var icon: js.UndefOr[Node] = js.undefined
  
  var isUrl: Boolean
  
  /** @name 用于标定选中的值，默认是 path */
  var key: js.UndefOr[String] = js.undefined
  
  /** @name 自定义菜单的国际化 key */
  var locale: js.UndefOr[String | `false`] = js.undefined
  
  /** @name 菜单的名字 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 当此节点被选中的时候也会选中 parentKeys 的节点
    *
    * @name 自定义父节点
    */
  var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @name 路径,可以设定为网页链接 */
  var path: js.UndefOr[String] = js.undefined
  
  var routes: Unit
  
  /** @name 指定外链打开形式，同a标签 */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * menuItem 的 tooltip 显示的路径
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object MenuDataItemisUrlboolean {
  
  inline def apply(isUrl: Boolean, routes: Unit): MenuDataItemisUrlboolean = {
    val __obj = js.Dynamic.literal(isUrl = isUrl.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDataItemisUrlboolean]
  }
  
  extension [Self <: MenuDataItemisUrlboolean](x: Self) {
    
    inline def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFlatMenu(value: Boolean): Self = StObject.set(x, "flatMenu", value.asInstanceOf[js.Any])
    
    inline def setFlatMenuUndefined: Self = StObject.set(x, "flatMenu", js.undefined)
    
    inline def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
    
    inline def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
    
    inline def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
    
    inline def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
    
    inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsUrl(value: Boolean): Self = StObject.set(x, "isUrl", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
    
    inline def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
    
    inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRoutes(value: Unit): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
