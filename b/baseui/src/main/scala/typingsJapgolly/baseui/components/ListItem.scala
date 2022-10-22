package typingsJapgolly.baseui.components

import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.sizeIconPropssizeIconProp
import typingsJapgolly.baseui.listTypesMod.ArtworkSizes
import typingsJapgolly.baseui.listTypesMod.ListOverrides
import typingsJapgolly.baseui.listTypesMod.ListProps
import typingsJapgolly.baseui.listTypesMod.Shape
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("baseui/list", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLLIElement] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def artwork(value: ComponentType[sizeIconPropssizeIconProp]): this.type = set("artwork", value.asInstanceOf[js.Any])
    
    inline def artworkSize(value: ArtworkSizes | Double): this.type = set("artworkSize", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: ComponentType[js.Object]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def shape(value: Shape): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def sublist(value: Boolean): this.type = set("sublist", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListProps & RefAttributes[HTMLLIElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
