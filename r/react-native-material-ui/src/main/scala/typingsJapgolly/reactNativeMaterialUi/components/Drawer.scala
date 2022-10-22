package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNativeMaterialUi.anon.AccountContainer
import typingsJapgolly.reactNativeMaterialUi.anon.ContainerContentContainer
import typingsJapgolly.reactNativeMaterialUi.anon.Item
import typingsJapgolly.reactNativeMaterialUi.anon.`0`
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderAccountProps
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderProps
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerProps
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionItem
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  object Header {
    
    object Account {
      
      @JSImport("react-native-material-ui", "Drawer.Header.Account")
      @js.native
      val component: js.Object = js.native
      
      @scala.inline
      open class Builder (val args: js.Array[Any])
        extends AnyVal
           with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header.Account] {
        
        inline def accounts(value: js.Array[typingsJapgolly.reactNativeMaterialUi.anon.Avatar]): this.type = set("accounts", value.asInstanceOf[js.Any])
        
        inline def accountsVarargs(value: typingsJapgolly.reactNativeMaterialUi.anon.Avatar*): this.type = set("accounts", js.Array(value*))
        
        inline def avatar(value: VdomElement): this.type = set("avatar", value.rawElement.asInstanceOf[js.Any])
        
        inline def footer(value: js.Object): this.type = set("footer", value.asInstanceOf[js.Any])
        
        inline def style(value: AccountContainer): this.type = set("style", value.asInstanceOf[js.Any])
      }
      
      implicit def make(companion: Account.type): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Account.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Account.Builder(js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: DrawerHeaderAccountProps): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Account.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Account.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("react-native-material-ui", "Drawer.Header")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header] {
      
      inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      inline def image(value: js.Array[Image]): this.type = set("image", value.asInstanceOf[js.Any])
      
      inline def imageVarargs(value: Image*): this.type = set("image", js.Array(value*))
      
      inline def style(value: ContainerContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Header.type): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DrawerHeaderProps): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Section {
    
    inline def apply(items: js.Array[DrawerSectionItem]): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Section.Builder = {
      val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Section.Builder(js.Array(this.component, __props.asInstanceOf[DrawerSectionProps]))
    }
    
    @JSImport("react-native-material-ui", "Drawer.Section")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Section] {
      
      inline def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
      
      inline def style(value: Item): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DrawerSectionProps): typingsJapgolly.reactNativeMaterialUi.components.Drawer.Section.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Drawer.Section.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-material-ui", "Drawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Drawer] {
    
    inline def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
