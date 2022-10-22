package typingsJapgolly.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 要隐藏/显示的菜单项，只能隐藏“传播类”和“保护类”按钮
    */
  var menuList: js.Array[String]
}
object MenuItemsConfig {
  
  inline def apply(menuList: js.Array[String]): MenuItemsConfig = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemsConfig]
  }
  
  extension [Self <: MenuItemsConfig](x: Self) {
    
    inline def setMenuList(value: js.Array[String]): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    inline def setMenuListVarargs(value: String*): Self = StObject.set(x, "menuList", js.Array(value*))
  }
}
