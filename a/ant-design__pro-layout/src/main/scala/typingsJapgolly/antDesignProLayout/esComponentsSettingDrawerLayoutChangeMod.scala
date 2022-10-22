package typingsJapgolly.antDesignProLayout

import typingsJapgolly.antDesignProLayout.anon.ChangeSetting
import typingsJapgolly.antDesignProLayout.esComponentsSettingDrawerMod.SettingItemProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSettingDrawerLayoutChangeMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/LayoutChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/LayoutChange", "LayoutSetting")
  @js.native
  val LayoutSetting: FC[ChangeSetting] = js.native
  
  inline def renderLayoutSettingItem(item: SettingItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLayoutSettingItem")(item.asInstanceOf[js.Any]).asInstanceOf[Element]
}
