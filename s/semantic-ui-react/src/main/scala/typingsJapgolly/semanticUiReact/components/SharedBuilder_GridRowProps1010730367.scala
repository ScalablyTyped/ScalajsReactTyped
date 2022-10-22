package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridMod.GridReversedProp
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_GridRowProps1010730367 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def columns(value: SemanticWIDTHS | equal): this.type = set("columns", value.asInstanceOf[js.Any])
  
  inline def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
  
  inline def only(value: GridOnlyProp): this.type = set("only", value.asInstanceOf[js.Any])
  
  inline def reversed(value: GridReversedProp): this.type = set("reversed", value.asInstanceOf[js.Any])
  
  inline def stretched(value: Boolean): this.type = set("stretched", value.asInstanceOf[js.Any])
  
  inline def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
  
  inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
