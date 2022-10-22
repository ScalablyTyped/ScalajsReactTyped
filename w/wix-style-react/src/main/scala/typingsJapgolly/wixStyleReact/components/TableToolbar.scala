package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.DividerProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.ItemGroupProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.ItemProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.LabelProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.SelectedCountProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.TableToolbarProps
import typingsJapgolly.wixStyleReact.distTypesTableToolbarMod.TitleProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbar {
  
  object Divider {
    
    @JSImport("wix-style-react", "TableToolbar.Divider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Divider.type): typingsJapgolly.wixStyleReact.components.TableToolbar.Divider.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Divider.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DividerProps): typingsJapgolly.wixStyleReact.components.TableToolbar.Divider.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Divider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("wix-style-react", "TableToolbar.Item")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def layout(value: button): this.type = set("layout", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Item.type): typingsJapgolly.wixStyleReact.components.TableToolbar.Item.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemProps): typingsJapgolly.wixStyleReact.components.TableToolbar.Item.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ItemGroup {
    
    @JSImport("wix-style-react", "TableToolbar.ItemGroup")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ItemGroup.type): typingsJapgolly.wixStyleReact.components.TableToolbar.ItemGroup.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.ItemGroup.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ItemGroupProps): typingsJapgolly.wixStyleReact.components.TableToolbar.ItemGroup.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.ItemGroup.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Label {
    
    @JSImport("wix-style-react", "TableToolbar.Label")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Label.type): typingsJapgolly.wixStyleReact.components.TableToolbar.Label.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Label.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LabelProps): typingsJapgolly.wixStyleReact.components.TableToolbar.Label.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Label.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SelectedCount {
    
    @JSImport("wix-style-react", "TableToolbar.SelectedCount")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: SelectedCount.type): typingsJapgolly.wixStyleReact.components.TableToolbar.SelectedCount.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.SelectedCount.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SelectedCountProps): typingsJapgolly.wixStyleReact.components.TableToolbar.SelectedCount.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.SelectedCount.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("wix-style-react", "TableToolbar.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Title.type): typingsJapgolly.wixStyleReact.components.TableToolbar.Title.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TitleProps): typingsJapgolly.wixStyleReact.components.TableToolbar.Title.Builder = new typingsJapgolly.wixStyleReact.components.TableToolbar.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "TableToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def removeVerticalPadding(value: Boolean): this.type = set("removeVerticalPadding", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableToolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableToolbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
