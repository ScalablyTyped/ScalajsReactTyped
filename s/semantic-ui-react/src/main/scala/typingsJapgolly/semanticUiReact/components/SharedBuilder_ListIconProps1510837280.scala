package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconCorner
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconSizeProp
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticICONS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.clockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.counterclockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.horizontally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ListIconProps1510837280 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
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
  
  inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
