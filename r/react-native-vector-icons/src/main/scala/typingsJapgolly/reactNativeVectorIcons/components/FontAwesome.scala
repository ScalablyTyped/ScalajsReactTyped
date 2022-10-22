package typingsJapgolly.reactNativeVectorIcons.components

import typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default
import typingsJapgolly.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.IconProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FontAwesome {
  
  inline def apply(name: String): SharedBuilder_IconProps_1467254860[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps_1467254860[default](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  object Button {
    
    inline def apply(name: String): SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.Button] = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
    }
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.Button")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.Button] = new SharedBuilder_IconButtonProps_77438457[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TabBarItem {
    
    inline def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.TabBarItem")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem] = new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TabBarItemIOS {
    
    inline def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.TabBarItemIOS")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_1118788793[typingsJapgolly.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-vector-icons/FontAwesome", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps_1467254860[default] = new SharedBuilder_IconProps_1467254860[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
