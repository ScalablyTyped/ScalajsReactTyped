package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_StatisticGroupProps_195426480 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  
  inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
  
  inline def items(value: SemanticShorthandCollection[StatisticProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  inline def itemsVarargs(value: SemanticShorthandItem[StatisticProps]*): this.type = set("items", js.Array(value*))
  
  inline def size(value: StatisticSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def widths(value: SemanticWIDTHS): this.type = set("widths", value.asInstanceOf[js.Any])
}
