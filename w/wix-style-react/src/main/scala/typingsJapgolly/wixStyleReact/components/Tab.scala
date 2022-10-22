package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsTabMod.CardFolderTabProps
import typingsJapgolly.wixStyleReact.distTypesCardFolderTabsTabMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CardFolderTabProps]))
  }
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def name(value: VdomNode): this.type = set("name", value.rawNode.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def nameVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("name", js.Array(value*))
    
    inline def nameVdomElement(value: VdomElement): this.type = set("name", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardFolderTabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
