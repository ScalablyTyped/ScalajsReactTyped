package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconGroupMod.IconGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconCorner
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconSizeProp
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticICONS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.clockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.counterclockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.horizontally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Icon.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_IconGroupProps1901602356 = new SharedBuilder_IconGroupProps1901602356(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: IconGroupProps): SharedBuilder_IconGroupProps1901602356 = new SharedBuilder_IconGroupProps1901602356(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Icon] {
    
    inline def `aria-hidden`(value: String): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def corner(value: Boolean | IconCorner): this.type = set("corner", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fitted(value: Boolean): this.type = set("fitted", value.asInstanceOf[js.Any])
    
    inline def flipped(value: horizontally | vertically): this.type = set("flipped", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def name(value: SemanticICONS): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def rotated(value: clockwise | counterclockwise): this.type = set("rotated", value.asInstanceOf[js.Any])
    
    inline def size(value: IconSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Icon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
