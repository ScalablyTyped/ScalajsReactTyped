package typingsJapgolly.baseui.components

import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.itemanyundefinedonMouseEn
import typingsJapgolly.baseui.anon.sizeIconPropssizeIconProp
import typingsJapgolly.baseui.listTypesMod.ArtworkSizes
import typingsJapgolly.baseui.listTypesMod.ListOverrides
import typingsJapgolly.baseui.listTypesMod.Shape
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuAdapter {
  
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLLIElement] {
    
    inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
    
    inline def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def $size(value: String): this.type = set("$size", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def artwork(value: ComponentType[sizeIconPropssizeIconProp]): this.type = set("artwork", value.asInstanceOf[js.Any])
    
    inline def artworkSize(value: ArtworkSizes | Double): this.type = set("artworkSize", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: ComponentType[js.Object]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def item(value: Any): this.type = set("item", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* a */ MouseEvent => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* a */ MouseEvent => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def shape(value: Shape): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def sublist(value: Boolean): this.type = set("sublist", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuAdapter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: itemanyundefinedonMouseEn): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
