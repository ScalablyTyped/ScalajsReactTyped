package typingsJapgolly.typestyle.typesMod

import typingsJapgolly.csstype.mod.AlignmentBaselineProperty
import typingsJapgolly.csstype.mod.AnimationDirectionProperty
import typingsJapgolly.csstype.mod.AnimationFillModeProperty
import typingsJapgolly.csstype.mod.AnimationIterationCountProperty
import typingsJapgolly.csstype.mod.AnimationNameProperty
import typingsJapgolly.csstype.mod.AnimationPlayStateProperty
import typingsJapgolly.csstype.mod.AnimationProperty
import typingsJapgolly.csstype.mod.AnimationTimingFunctionProperty
import typingsJapgolly.csstype.mod.BackgroundClipProperty
import typingsJapgolly.csstype.mod.BackgroundOriginProperty
import typingsJapgolly.csstype.mod.BackgroundSizeProperty
import typingsJapgolly.csstype.mod.BaselineShiftProperty
import typingsJapgolly.csstype.mod.BorderBottomLeftRadiusProperty
import typingsJapgolly.csstype.mod.BorderBottomRightRadiusProperty
import typingsJapgolly.csstype.mod.BorderImageProperty
import typingsJapgolly.csstype.mod.BorderRadiusProperty
import typingsJapgolly.csstype.mod.BorderTopLeftRadiusProperty
import typingsJapgolly.csstype.mod.BorderTopRightRadiusProperty
import typingsJapgolly.csstype.mod.BoxAlignProperty
import typingsJapgolly.csstype.mod.BoxDecorationBreakProperty
import typingsJapgolly.csstype.mod.BoxDirectionProperty
import typingsJapgolly.csstype.mod.BoxLinesProperty
import typingsJapgolly.csstype.mod.BoxOrientProperty
import typingsJapgolly.csstype.mod.BoxPackProperty
import typingsJapgolly.csstype.mod.BoxShadowProperty
import typingsJapgolly.csstype.mod.ClipProperty
import typingsJapgolly.csstype.mod.ClipRuleProperty
import typingsJapgolly.csstype.mod.ColorInterpolationProperty
import typingsJapgolly.csstype.mod.ColorRenderingProperty
import typingsJapgolly.csstype.mod.DominantBaselineProperty
import typingsJapgolly.csstype.mod.FillProperty
import typingsJapgolly.csstype.mod.FillRuleProperty
import typingsJapgolly.csstype.mod.FloodColorProperty
import typingsJapgolly.csstype.mod.FontVariantAlternatesProperty
import typingsJapgolly.csstype.mod.GlobalsNumber
import typingsJapgolly.csstype.mod.GlobalsString
import typingsJapgolly.csstype.mod.GlyphOrientationVerticalProperty
import typingsJapgolly.csstype.mod.GridColumnGapProperty
import typingsJapgolly.csstype.mod.GridGapProperty
import typingsJapgolly.csstype.mod.GridRowGapProperty
import typingsJapgolly.csstype.mod.ImeModeProperty
import typingsJapgolly.csstype.mod.InsetBlockEndProperty
import typingsJapgolly.csstype.mod.InsetBlockProperty
import typingsJapgolly.csstype.mod.InsetBlockStartProperty
import typingsJapgolly.csstype.mod.InsetInlineEndProperty
import typingsJapgolly.csstype.mod.InsetInlineProperty
import typingsJapgolly.csstype.mod.InsetInlineStartProperty
import typingsJapgolly.csstype.mod.LightingColorProperty
import typingsJapgolly.csstype.mod.LineBreakProperty
import typingsJapgolly.csstype.mod.MarkerEndProperty
import typingsJapgolly.csstype.mod.MarkerMidProperty
import typingsJapgolly.csstype.mod.MarkerProperty
import typingsJapgolly.csstype.mod.MarkerStartProperty
import typingsJapgolly.csstype.mod.MozBindingProperty
import typingsJapgolly.csstype.mod.MozOutlineRadiusProperty
import typingsJapgolly.csstype.mod.MozTextBlinkProperty
import typingsJapgolly.csstype.mod.MozUserInputProperty
import typingsJapgolly.csstype.mod.MozWindowShadowProperty
import typingsJapgolly.csstype.mod.OutlineColorProperty
import typingsJapgolly.csstype.mod.OutlineProperty
import typingsJapgolly.csstype.mod.OutlineStyleProperty
import typingsJapgolly.csstype.mod.OutlineWidthProperty
import typingsJapgolly.csstype.mod.ScrollSnapCoordinateProperty
import typingsJapgolly.csstype.mod.ScrollSnapDestinationProperty
import typingsJapgolly.csstype.mod.ScrollSnapPointsXProperty
import typingsJapgolly.csstype.mod.ScrollSnapPointsYProperty
import typingsJapgolly.csstype.mod.ScrollSnapTypeXProperty
import typingsJapgolly.csstype.mod.ScrollSnapTypeYProperty
import typingsJapgolly.csstype.mod.ShapeRenderingProperty
import typingsJapgolly.csstype.mod.StandardLonghandPropertiesFallback
import typingsJapgolly.csstype.mod.StandardShorthandPropertiesFallback
import typingsJapgolly.csstype.mod.StopColorProperty
import typingsJapgolly.csstype.mod.StrokeDasharrayProperty
import typingsJapgolly.csstype.mod.StrokeDashoffsetProperty
import typingsJapgolly.csstype.mod.StrokeLinecapProperty
import typingsJapgolly.csstype.mod.StrokeLinejoinProperty
import typingsJapgolly.csstype.mod.StrokeProperty
import typingsJapgolly.csstype.mod.StrokeWidthProperty
import typingsJapgolly.csstype.mod.TextAlignLastProperty
import typingsJapgolly.csstype.mod.TextAnchorProperty
import typingsJapgolly.csstype.mod.TextCombineUprightProperty
import typingsJapgolly.csstype.mod.TextDecorationColorProperty
import typingsJapgolly.csstype.mod.TextDecorationLineProperty
import typingsJapgolly.csstype.mod.TextDecorationStyleProperty
import typingsJapgolly.csstype.mod.TransformProperty
import typingsJapgolly.csstype.mod.TransitionProperty
import typingsJapgolly.csstype.mod.TransitionPropertyProperty
import typingsJapgolly.csstype.mod.TransitionTimingFunctionProperty
import typingsJapgolly.csstype.mod.UserSelectProperty
import typingsJapgolly.csstype.mod.VectorEffectProperty
import typingsJapgolly.csstype.mod.VendorLonghandPropertiesHyphenFallback
import typingsJapgolly.csstype.mod.VendorShorthandPropertiesHyphenFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.csstype.mod.ObsoletePropertiesFallback because var conflicts: clip. Inlined KhtmlBoxAlign, KhtmlBoxDirection, KhtmlBoxFlex, KhtmlBoxFlexGroup, KhtmlBoxLines, KhtmlBoxOrdinalGroup, KhtmlBoxOrient, KhtmlBoxPack, KhtmlLineBreak, KhtmlOpacity, KhtmlUserSelect, MozBackgroundClip, MozBackgroundInlinePolicy, MozBackgroundOrigin, MozBackgroundSize, MozBinding, MozBorderRadius, MozBorderRadiusBottomleft, MozBorderRadiusBottomright, MozBorderRadiusTopleft, MozBorderRadiusTopright, MozBoxAlign, MozBoxDirection, MozBoxFlex, MozBoxOrdinalGroup, MozBoxOrient, MozBoxPack, MozBoxShadow, MozOpacity, MozOutline, MozOutlineColor, MozOutlineRadius, MozOutlineStyle, MozOutlineWidth, MozTextAlignLast, MozTextBlink, MozTextDecorationColor, MozTextDecorationLine, MozTextDecorationStyle, MozUserInput, MozWindowShadow, OAnimation, OAnimationDelay, OAnimationDirection, OAnimationDuration, OAnimationFillMode, OAnimationIterationCount, OAnimationName, OAnimationPlayState, OAnimationTimingFunction, OBackgroundSize, OBorderImage, OTransform, OTransition, OTransitionDelay, OTransitionDuration, OTransitionProperty, OTransitionTimingFunction, WebkitBoxAlign, WebkitBoxDirection, WebkitBoxFlex, WebkitBoxFlexGroup, WebkitBoxLines, WebkitBoxOrdinalGroup, WebkitBoxOrient, WebkitBoxPack, WebkitScrollSnapPointsX, WebkitScrollSnapPointsY, boxAlign, boxDirection, boxFlex, boxFlexGroup, boxLines, boxOrdinalGroup, boxOrient, boxPack, fontVariantAlternates, gridColumnGap, gridGap, gridRowGap, imeMode, msImeMode, offsetBlock, offsetBlockEnd, offsetBlockStart, offsetInline, offsetInlineEnd, offsetInlineStart, scrollSnapCoordinate, scrollSnapDestination, scrollSnapPointsX, scrollSnapPointsY, scrollSnapTypeX, scrollSnapTypeY, textCombineHorizontal
- typingsJapgolly.csstype.mod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSProperties
  extends StandardLonghandPropertiesFallback[TLength]
     with StandardShorthandPropertiesFallback[TLength]
     with VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength] {
  /**
    * Typestyle configuration options
    **/
  /**
    * The generated CSS selector gets its own unique location in the generated CSS (disables deduping).
    * So instead of `.classA,.classB{same properties}`
    * you get `.classA {same properties} .classB {same properties}`
    * This is needed for certain browser edge cases like placeholder styling
    **/
  @JSName("$unique")
  var $unique: js.UndefOr[Boolean] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.native
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextBlink: js.UndefOr[MozTextBlinkProperty | js.Array[MozTextBlinkProperty]] = js.native
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.native
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Initial value**: `default`
    *
    * @deprecated
    */
  var MozWindowShadow: js.UndefOr[MozWindowShadowProperty | js.Array[MozWindowShadowProperty]] = js.native
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  var clip: js.UndefOr[ClipProperty | js.Array[ClipProperty]] = js.native
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.native
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[
    ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]
  ] = js.native
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[
    ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]
  ] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.native
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.native
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.native
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}

