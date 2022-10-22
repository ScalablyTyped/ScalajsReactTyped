package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepMod.StepProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`1`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`2`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`3`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`4`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`5`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`6`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`7`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`8`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.eight
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.five
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.four
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.one
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.seven
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.six
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tablet
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.three
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_StepGroupProps1660011682 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  
  inline def items(value: SemanticShorthandCollection[StepProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  inline def itemsVarargs(value: SemanticShorthandItem[StepProps]*): this.type = set("items", js.Array(value*))
  
  inline def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
  
  inline def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def stackable(value: tablet): this.type = set("stackable", value.asInstanceOf[js.Any])
  
  inline def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
  
  inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  inline def widths(
    value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`1` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`2` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`3` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`5` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`6` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`7` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
  ): this.type = set("widths", value.asInstanceOf[js.Any])
}
