package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsMod.CardFolderTabsProps
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsMod.TabFontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardFolderTabs {
  
  inline def apply(activeId: String): Builder = {
    val __props = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CardFolderTabsProps]))
  }
  
  @JSImport("wix-style-react", "CardFolderTabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CardFolderTabs] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def maxTabWidth(value: MaxWidth[String | Double]): this.type = set("maxTabWidth", value.asInstanceOf[js.Any])
    
    inline def onTabChange(value: /* newActiveId */ String => Callback): this.type = set("onTabChange", js.Any.fromFunction1((t0: /* newActiveId */ String) => value(t0).runNow()))
    
    inline def size(value: TabFontSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardFolderTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
