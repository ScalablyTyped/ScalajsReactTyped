package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentGroupMod.SegmentGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentInlineMod.SegmentInlineProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentMod.SegmentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentMod.SegmentSizeProp
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Segment {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Segment.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_SegmentGroupProps2029818604 = new SharedBuilder_SegmentGroupProps2029818604(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SegmentGroupProps): SharedBuilder_SegmentGroupProps2029818604 = new SharedBuilder_SegmentGroupProps2029818604(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Inline {
    
    @JSImport("semantic-ui-react", "Segment.Inline")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Inline.type): SharedBuilder_SegmentInlineProps581177643 = new SharedBuilder_SegmentInlineProps581177643(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SegmentInlineProps): SharedBuilder_SegmentInlineProps581177643 = new SharedBuilder_SegmentInlineProps581177643(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Segment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: Boolean | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    inline def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearing(value: Boolean): this.type = set("clearing", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def padded(value: Boolean | very): this.type = set("padded", value.asInstanceOf[js.Any])
    
    inline def piled(value: Boolean): this.type = set("piled", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: Boolean): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def size(value: SegmentSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    inline def tertiary(value: Boolean): this.type = set("tertiary", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Segment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SegmentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
