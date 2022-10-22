package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsTableTableCellMod.TableCellProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.center
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TableRowProps1840000053 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def cellAs(value: Any): this.type = set("cellAs", value.asInstanceOf[js.Any])
  
  inline def cells(value: SemanticShorthandCollection[TableCellProps]): this.type = set("cells", value.asInstanceOf[js.Any])
  
  inline def cellsVarargs(value: SemanticShorthandItem[TableCellProps]*): this.type = set("cells", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
  
  inline def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
  
  inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
  
  inline def textAlign(value: center | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
  
  inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  
  inline def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
}
