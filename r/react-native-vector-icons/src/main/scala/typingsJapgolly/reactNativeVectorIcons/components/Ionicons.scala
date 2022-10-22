package typingsJapgolly.reactNativeVectorIcons.components

import typingsJapgolly.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.IconProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ionicons {
  
  inline def apply(name: String): SharedBuilder_IconProps_1467254860[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps_1467254860[default](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  object Button {
    
    inline def apply(name: String): SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.Button] = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.Button")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.Button] = new SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TabBarItem {
    
    inline def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItem] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.TabBarItem")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItem] = new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TabBarItemIOS {
    
    inline def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItemIOS] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.TabBarItemIOS")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default.TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-vector-icons/Ionicons", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps_1467254860[default] = new SharedBuilder_IconProps_1467254860[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
