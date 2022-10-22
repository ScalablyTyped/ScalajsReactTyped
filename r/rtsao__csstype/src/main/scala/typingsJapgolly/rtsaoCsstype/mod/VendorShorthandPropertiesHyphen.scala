package typingsJapgolly.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorShorthandPropertiesHyphen[TLength] extends StObject {
  
  /** The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`. */
  var `-moz-animation`: js.UndefOr[AnimationProperty] = js.undefined
  
  /** The **`border-image`** CSS property draws an image in place of an element's `border-style`. */
  var `-moz-border-image`: js.UndefOr[BorderImageProperty] = js.undefined
  
  /** The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout. */
  var `-moz-column-rule`: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  
  /** The **`columns`** CSS property sets the column width and column count of an element. */
  var `-moz-columns`: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  
  /** The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`. */
  var `-moz-transition`: js.UndefOr[TransitionProperty] = js.undefined
  
  /** The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties. */
  var `-ms-content-zoom-limit`: js.UndefOr[GlobalsString] = js.undefined
  
  /** The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties. */
  var `-ms-content-zoom-snap`: js.UndefOr[MsContentZoomSnapProperty] = js.undefined
  
  /** The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`. */
  var `-ms-flex`: js.UndefOr[FlexProperty[TLength]] = js.undefined
  
  /** The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties. */
  var `-ms-scroll-limit`: js.UndefOr[GlobalsString] = js.undefined
  
  /** The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties. */
  var `-ms-scroll-snap-x`: js.UndefOr[GlobalsString] = js.undefined
  
  /** The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties. */
  var `-ms-scroll-snap-y`: js.UndefOr[GlobalsString] = js.undefined
  
  /** The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`. */
  var `-webkit-animation`: js.UndefOr[AnimationProperty] = js.undefined
  
  /** The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet. */
  var `-webkit-border-before`: js.UndefOr[WebkitBorderBeforeProperty[TLength]] = js.undefined
  
  /** The **`border-image`** CSS property draws an image in place of an element's `border-style`. */
  var `-webkit-border-image`: js.UndefOr[BorderImageProperty] = js.undefined
  
  /** The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners. */
  var `-webkit-border-radius`: js.UndefOr[BorderRadiusProperty[TLength]] = js.undefined
  
  /** The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout. */
  var `-webkit-column-rule`: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  
  /** The **`columns`** CSS property sets the column width and column count of an element. */
  var `-webkit-columns`: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  
  /** The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`. */
  var `-webkit-flex`: js.UndefOr[FlexProperty[TLength]] = js.undefined
  
  /** The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties. */
  var `-webkit-flex-flow`: js.UndefOr[FlexFlowProperty] = js.undefined
  
  var `-webkit-line-clamp`: js.UndefOr[WebkitLineClampProperty] = js.undefined
  
  /** The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points. */
  var `-webkit-mask`: js.UndefOr[WebkitMaskProperty[TLength]] = js.undefined
  
  /** The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`. */
  var `-webkit-text-emphasis`: js.UndefOr[TextEmphasisProperty] = js.undefined
  
  /** The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`. */
  var `-webkit-text-stroke`: js.UndefOr[WebkitTextStrokeProperty[TLength]] = js.undefined
  
  /** The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`. */
  var `-webkit-transition`: js.UndefOr[TransitionProperty] = js.undefined
}
object VendorShorthandPropertiesHyphen {
  
  inline def apply[TLength](): VendorShorthandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandPropertiesHyphen[TLength]]
  }
  
  extension [Self <: VendorShorthandPropertiesHyphen[?], TLength](x: Self & VendorShorthandPropertiesHyphen[TLength]) {
    
    inline def `set-moz-animation`(value: AnimationProperty): Self = StObject.set(x, "-moz-animation", value.asInstanceOf[js.Any])
    
    inline def `set-moz-animationUndefined`: Self = StObject.set(x, "-moz-animation", js.undefined)
    
    inline def `set-moz-border-image`(value: BorderImageProperty): Self = StObject.set(x, "-moz-border-image", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-imageUndefined`: Self = StObject.set(x, "-moz-border-image", js.undefined)
    
    inline def `set-moz-column-rule`(value: ColumnRuleProperty[TLength]): Self = StObject.set(x, "-moz-column-rule", value.asInstanceOf[js.Any])
    
    inline def `set-moz-column-ruleUndefined`: Self = StObject.set(x, "-moz-column-rule", js.undefined)
    
    inline def `set-moz-columns`(value: ColumnsProperty[TLength]): Self = StObject.set(x, "-moz-columns", value.asInstanceOf[js.Any])
    
    inline def `set-moz-columnsUndefined`: Self = StObject.set(x, "-moz-columns", js.undefined)
    
    inline def `set-moz-transition`(value: TransitionProperty): Self = StObject.set(x, "-moz-transition", value.asInstanceOf[js.Any])
    
    inline def `set-moz-transitionUndefined`: Self = StObject.set(x, "-moz-transition", js.undefined)
    
    inline def `set-ms-content-zoom-limit`(value: GlobalsString): Self = StObject.set(x, "-ms-content-zoom-limit", value.asInstanceOf[js.Any])
    
    inline def `set-ms-content-zoom-limitUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit", js.undefined)
    
    inline def `set-ms-content-zoom-snap`(value: MsContentZoomSnapProperty): Self = StObject.set(x, "-ms-content-zoom-snap", value.asInstanceOf[js.Any])
    
    inline def `set-ms-content-zoom-snapUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap", js.undefined)
    
    inline def `set-ms-flex`(value: FlexProperty[TLength]): Self = StObject.set(x, "-ms-flex", value.asInstanceOf[js.Any])
    
    inline def `set-ms-flexUndefined`: Self = StObject.set(x, "-ms-flex", js.undefined)
    
    inline def `set-ms-scroll-limit`(value: GlobalsString): Self = StObject.set(x, "-ms-scroll-limit", value.asInstanceOf[js.Any])
    
    inline def `set-ms-scroll-limitUndefined`: Self = StObject.set(x, "-ms-scroll-limit", js.undefined)
    
    inline def `set-ms-scroll-snap-x`(value: GlobalsString): Self = StObject.set(x, "-ms-scroll-snap-x", value.asInstanceOf[js.Any])
    
    inline def `set-ms-scroll-snap-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-x", js.undefined)
    
    inline def `set-ms-scroll-snap-y`(value: GlobalsString): Self = StObject.set(x, "-ms-scroll-snap-y", value.asInstanceOf[js.Any])
    
    inline def `set-ms-scroll-snap-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-y", js.undefined)
    
    inline def `set-webkit-animation`(value: AnimationProperty): Self = StObject.set(x, "-webkit-animation", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-animationUndefined`: Self = StObject.set(x, "-webkit-animation", js.undefined)
    
    inline def `set-webkit-border-before`(value: WebkitBorderBeforeProperty[TLength]): Self = StObject.set(x, "-webkit-border-before", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-border-beforeUndefined`: Self = StObject.set(x, "-webkit-border-before", js.undefined)
    
    inline def `set-webkit-border-image`(value: BorderImageProperty): Self = StObject.set(x, "-webkit-border-image", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-border-imageUndefined`: Self = StObject.set(x, "-webkit-border-image", js.undefined)
    
    inline def `set-webkit-border-radius`(value: BorderRadiusProperty[TLength]): Self = StObject.set(x, "-webkit-border-radius", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-border-radiusUndefined`: Self = StObject.set(x, "-webkit-border-radius", js.undefined)
    
    inline def `set-webkit-column-rule`(value: ColumnRuleProperty[TLength]): Self = StObject.set(x, "-webkit-column-rule", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-column-ruleUndefined`: Self = StObject.set(x, "-webkit-column-rule", js.undefined)
    
    inline def `set-webkit-columns`(value: ColumnsProperty[TLength]): Self = StObject.set(x, "-webkit-columns", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-columnsUndefined`: Self = StObject.set(x, "-webkit-columns", js.undefined)
    
    inline def `set-webkit-flex`(value: FlexProperty[TLength]): Self = StObject.set(x, "-webkit-flex", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-flex-flow`(value: FlexFlowProperty): Self = StObject.set(x, "-webkit-flex-flow", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-flex-flowUndefined`: Self = StObject.set(x, "-webkit-flex-flow", js.undefined)
    
    inline def `set-webkit-flexUndefined`: Self = StObject.set(x, "-webkit-flex", js.undefined)
    
    inline def `set-webkit-line-clamp`(value: WebkitLineClampProperty): Self = StObject.set(x, "-webkit-line-clamp", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-line-clampUndefined`: Self = StObject.set(x, "-webkit-line-clamp", js.undefined)
    
    inline def `set-webkit-mask`(value: WebkitMaskProperty[TLength]): Self = StObject.set(x, "-webkit-mask", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-maskUndefined`: Self = StObject.set(x, "-webkit-mask", js.undefined)
    
    inline def `set-webkit-text-emphasis`(value: TextEmphasisProperty): Self = StObject.set(x, "-webkit-text-emphasis", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-text-emphasisUndefined`: Self = StObject.set(x, "-webkit-text-emphasis", js.undefined)
    
    inline def `set-webkit-text-stroke`(value: WebkitTextStrokeProperty[TLength]): Self = StObject.set(x, "-webkit-text-stroke", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-text-strokeUndefined`: Self = StObject.set(x, "-webkit-text-stroke", js.undefined)
    
    inline def `set-webkit-transition`(value: TransitionProperty): Self = StObject.set(x, "-webkit-transition", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-transitionUndefined`: Self = StObject.set(x, "-webkit-transition", js.undefined)
  }
}
