package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentGroupMod.SegmentGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsSegmentSegmentInlineMod.SegmentInlineComponent
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

object distCommonjsElementsSegmentSegmentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Segment/Segment", JSImport.Default)
  @js.native
  val default: SegmentComponent = js.native
  
  @js.native
  trait SegmentComponent
    extends StObject
       with FunctionComponent[SegmentProps] {
    
    var Group: FC[SegmentGroupProps] = js.native
    
    var Inline: SegmentInlineComponent = js.native
  }
  
  trait SegmentProps
    extends StObject
       with StrictSegmentProps
       with /* key */ StringDictionary[Any]
  object SegmentProps {
    
    inline def apply(): SegmentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
  */
  trait SegmentSizeProp extends StObject
  object SegmentSizeProp {
    
    inline def big: typingsJapgolly.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.big]
    
    inline def huge: typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typingsJapgolly.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.large]
    
    inline def massive: typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive]
    
    inline def mini: typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typingsJapgolly.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictSegmentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Attach segment to other content, like a header. */
    var attached: js.UndefOr[Boolean | top | bottom] = js.undefined
    
    /** A basic segment has no special formatting. */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** A segment can be circular. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A segment can clear floated content. */
    var clearing: js.UndefOr[Boolean] = js.undefined
    
    /** Segment can be colored. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A segment may take up only as much space as is necessary. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A segment may show its content is disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Segment content can be floated to the left or right. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** A segment can have its colors inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** A segment may show its content is being loaded. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** A segment can increase its padding. */
    var padded: js.UndefOr[Boolean | very] = js.undefined
    
    /** Formatted to look like a pile of pages. */
    var piled: js.UndefOr[Boolean] = js.undefined
    
    /** A segment can be used to reserve space for conditionally displayed content. */
    var placeholder: js.UndefOr[Boolean] = js.undefined
    
    /** A segment may be formatted to raise above the page. */
    var raised: js.UndefOr[Boolean] = js.undefined
    
    /** A segment can be formatted to appear less noticeable. */
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    /** A segment can have different sizes. */
    var size: js.UndefOr[SegmentSizeProp] = js.undefined
    
    /** Formatted to show it contains multiple pages. */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /** A segment can be formatted to appear even less noticeable. */
    var tertiary: js.UndefOr[Boolean] = js.undefined
    
    /** Formats content to be aligned as part of a vertical group. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
    
    /** Formats content to be aligned vertically. */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object StrictSegmentProps {
    
    inline def apply(): StrictSegmentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSegmentProps]
    }
    
    extension [Self <: StrictSegmentProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearing(value: Boolean): Self = StObject.set(x, "clearing", value.asInstanceOf[js.Any])
      
      inline def setClearingUndefined: Self = StObject.set(x, "clearing", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setPadded(value: Boolean | very): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      inline def setPiled(value: Boolean): Self = StObject.set(x, "piled", value.asInstanceOf[js.Any])
      
      inline def setPiledUndefined: Self = StObject.set(x, "piled", js.undefined)
      
      inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSize(value: SegmentSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      inline def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = SegmentComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsSegmentSegmentMod.foo` */
  override def _to: SegmentComponent = default
}
