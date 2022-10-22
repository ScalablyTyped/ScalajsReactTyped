package typingsJapgolly.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardShorthandPropertiesFallback[TLength] extends StObject {
  
  /**
    * The `**all**` CSS shorthand property sets all of an element's properties (other than `unicode-bidi` and `direction`) to their initial or inherited values, or to the values specified in another stylesheet origin.
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **37** | **27**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[Globals | js.Array[Globals]] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation
    */
  var animation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.undefined
  
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]] = js.undefined
  
  /**
    * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[BorderProperty[TLength] | js.Array[BorderProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var borderBlock: js.UndefOr[BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var borderBlockEnd: js.UndefOr[BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var borderBlockStart: js.UndefOr[BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var borderBottom: js.UndefOr[BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var borderColor: js.UndefOr[BorderColorProperty | js.Array[BorderColorProperty]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
    * | :-----: | :-------: | :-----: | :----: | :----: |
    * | **16**  |  **15**   |  **6**  | **12** | **11** |
    * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image
    */
  var borderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.undefined
  
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var borderInline: js.UndefOr[BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var borderInlineEnd: js.UndefOr[BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var borderInlineStart: js.UndefOr[
    BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var borderLeft: js.UndefOr[BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
    */
  var borderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var borderRight: js.UndefOr[BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var borderStyle: js.UndefOr[BorderStyleProperty | js.Array[BorderStyleProperty]] = js.undefined
  
  /**
    * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var borderTop: js.UndefOr[BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var borderWidth: js.UndefOr[BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
    */
  var columnRule: js.UndefOr[ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]] = js.undefined
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **50** | **52**  | **3** _-x-_ | **12** | **10** |
    * |        | 9 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/columns
    */
  var columns: js.UndefOr[ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]] = js.undefined
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
    * | :------: | :-----: | :-------: | :----: | :------: |
    * |  **29**  |  20-61  |   **9**   | **12** |  **11**  |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[FlexProperty[TLength] | js.Array[FlexProperty[TLength]]] = js.undefined
  
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var flexFlow: js.UndefOr[FlexFlowProperty | js.Array[FlexFlowProperty]] = js.undefined
  
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[FontProperty | js.Array[FontProperty]] = js.undefined
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **66** | **61**  |   No   | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/gap
    */
  var gap: js.UndefOr[GapProperty[TLength] | js.Array[GapProperty[TLength]]] = js.undefined
  
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[GridProperty | js.Array[GridProperty]] = js.undefined
  
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var gridArea: js.UndefOr[GridAreaProperty | js.Array[GridAreaProperty]] = js.undefined
  
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var gridColumn: js.UndefOr[GridColumnProperty | js.Array[GridColumnProperty]] = js.undefined
  
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var gridRow: js.UndefOr[GridRowProperty | js.Array[GridRowProperty]] = js.undefined
  
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var gridTemplate: js.UndefOr[GridTemplateProperty | js.Array[GridTemplateProperty]] = js.undefined
  
  /** **Initial value**: `none` */
  var lineClamp: js.UndefOr[LineClampProperty | js.Array[LineClampProperty]] = js.undefined
  
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var listStyle: js.UndefOr[ListStyleProperty | js.Array[ListStyleProperty]] = js.undefined
  
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[MarginProperty[TLength] | js.Array[MarginProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **2**  | **4**  | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[MaskProperty[TLength] | js.Array[MaskProperty[TLength]]] = js.undefined
  
  /** The **`mask-border`** CSS property lets you create a mask along the edge of an element's border. */
  var maskBorder: js.UndefOr[MaskBorderProperty | js.Array[MaskBorderProperty]] = js.undefined
  
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     |   No    |   No   |  No  | n/a |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     |   No    |   No   |  No  | n/a |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]] = js.undefined
  
  /**
    * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  n/a   | n/a  | n/a |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  n/a   | n/a  | n/a |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var placeItems: js.UndefOr[PlaceItemsProperty | js.Array[PlaceItemsProperty]] = js.undefined
  
  /**
    * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   | n/a  | n/a |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   | n/a  | n/a |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var placeSelf: js.UndefOr[PlaceSelfProperty | js.Array[PlaceSelfProperty]] = js.undefined
  
  /**
    * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var textDecoration: js.UndefOr[TextDecorationProperty | js.Array[TextDecorationProperty]] = js.undefined
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var textEmphasis: js.UndefOr[TextEmphasisProperty | js.Array[TextEmphasisProperty]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **26**  | **16**  | **6.1** | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition
    */
  var transition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.undefined
}
object StandardShorthandPropertiesFallback {
  
  inline def apply[TLength](): StandardShorthandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandPropertiesFallback[TLength]]
  }
  
  extension [Self <: StandardShorthandPropertiesFallback[?], TLength](x: Self & StandardShorthandPropertiesFallback[TLength]) {
    
    inline def setAll(value: Globals | js.Array[Globals]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAllVarargs(value: Globals*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnimationVarargs(value: AnimationProperty*): Self = StObject.set(x, "animation", js.Array(value*))
    
    inline def setBackground(value: BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: BackgroundProperty[TLength]*): Self = StObject.set(x, "background", js.Array(value*))
    
    inline def setBorder(value: BorderProperty[TLength] | js.Array[BorderProperty[TLength]]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderBlock(value: BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]): Self = StObject.set(x, "borderBlock", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockEnd(value: BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]): Self = StObject.set(x, "borderBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockEndUndefined: Self = StObject.set(x, "borderBlockEnd", js.undefined)
    
    inline def setBorderBlockEndVarargs(value: BorderBlockEndProperty[TLength]*): Self = StObject.set(x, "borderBlockEnd", js.Array(value*))
    
    inline def setBorderBlockStart(value: BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]): Self = StObject.set(x, "borderBlockStart", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockStartUndefined: Self = StObject.set(x, "borderBlockStart", js.undefined)
    
    inline def setBorderBlockStartVarargs(value: BorderBlockStartProperty[TLength]*): Self = StObject.set(x, "borderBlockStart", js.Array(value*))
    
    inline def setBorderBlockUndefined: Self = StObject.set(x, "borderBlock", js.undefined)
    
    inline def setBorderBlockVarargs(value: BorderBlockProperty[TLength]*): Self = StObject.set(x, "borderBlock", js.Array(value*))
    
    inline def setBorderBottom(value: BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderBottomVarargs(value: BorderBottomProperty[TLength]*): Self = StObject.set(x, "borderBottom", js.Array(value*))
    
    inline def setBorderColor(value: BorderColorProperty | js.Array[BorderColorProperty]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: BorderColorProperty*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
    
    inline def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
    
    inline def setBorderImageVarargs(value: BorderImageProperty*): Self = StObject.set(x, "borderImage", js.Array(value*))
    
    inline def setBorderInline(value: BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]): Self = StObject.set(x, "borderInline", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineEnd(value: BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]): Self = StObject.set(x, "borderInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineEndUndefined: Self = StObject.set(x, "borderInlineEnd", js.undefined)
    
    inline def setBorderInlineEndVarargs(value: BorderInlineEndProperty[TLength]*): Self = StObject.set(x, "borderInlineEnd", js.Array(value*))
    
    inline def setBorderInlineStart(value: BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]): Self = StObject.set(x, "borderInlineStart", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineStartUndefined: Self = StObject.set(x, "borderInlineStart", js.undefined)
    
    inline def setBorderInlineStartVarargs(value: BorderInlineStartProperty[TLength]*): Self = StObject.set(x, "borderInlineStart", js.Array(value*))
    
    inline def setBorderInlineUndefined: Self = StObject.set(x, "borderInline", js.undefined)
    
    inline def setBorderInlineVarargs(value: BorderInlineProperty[TLength]*): Self = StObject.set(x, "borderInline", js.Array(value*))
    
    inline def setBorderLeft(value: BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderLeftVarargs(value: BorderLeftProperty[TLength]*): Self = StObject.set(x, "borderLeft", js.Array(value*))
    
    inline def setBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRadiusVarargs(value: BorderRadiusProperty[TLength]*): Self = StObject.set(x, "borderRadius", js.Array(value*))
    
    inline def setBorderRight(value: BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderRightVarargs(value: BorderRightProperty[TLength]*): Self = StObject.set(x, "borderRight", js.Array(value*))
    
    inline def setBorderStyle(value: BorderStyleProperty | js.Array[BorderStyleProperty]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderStyleVarargs(value: BorderStyleProperty*): Self = StObject.set(x, "borderStyle", js.Array(value*))
    
    inline def setBorderTop(value: BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderTopVarargs(value: BorderTopProperty[TLength]*): Self = StObject.set(x, "borderTop", js.Array(value*))
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: BorderProperty[TLength]*): Self = StObject.set(x, "border", js.Array(value*))
    
    inline def setBorderWidth(value: BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBorderWidthVarargs(value: BorderWidthProperty[TLength]*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setColumnRule(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
    
    inline def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
    
    inline def setColumnRuleVarargs(value: ColumnRuleProperty[TLength]*): Self = StObject.set(x, "columnRule", js.Array(value*))
    
    inline def setColumns(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnsProperty[TLength]*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setFlex(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexFlow(value: FlexFlowProperty | js.Array[FlexFlowProperty]): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
    
    inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
    
    inline def setFlexFlowVarargs(value: FlexFlowProperty*): Self = StObject.set(x, "flexFlow", js.Array(value*))
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexVarargs(value: FlexProperty[TLength]*): Self = StObject.set(x, "flex", js.Array(value*))
    
    inline def setFont(value: FontProperty | js.Array[FontProperty]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontVarargs(value: FontProperty*): Self = StObject.set(x, "font", js.Array(value*))
    
    inline def setGap(value: GapProperty[TLength] | js.Array[GapProperty[TLength]]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setGapVarargs(value: GapProperty[TLength]*): Self = StObject.set(x, "gap", js.Array(value*))
    
    inline def setGrid(value: GridProperty | js.Array[GridProperty]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridArea(value: GridAreaProperty | js.Array[GridAreaProperty]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    inline def setGridAreaVarargs(value: GridAreaProperty*): Self = StObject.set(x, "gridArea", js.Array(value*))
    
    inline def setGridColumn(value: GridColumnProperty | js.Array[GridColumnProperty]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    inline def setGridColumnVarargs(value: GridColumnProperty*): Self = StObject.set(x, "gridColumn", js.Array(value*))
    
    inline def setGridRow(value: GridRowProperty | js.Array[GridRowProperty]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
    
    inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    
    inline def setGridRowVarargs(value: GridRowProperty*): Self = StObject.set(x, "gridRow", js.Array(value*))
    
    inline def setGridTemplate(value: GridTemplateProperty | js.Array[GridTemplateProperty]): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
    
    inline def setGridTemplateVarargs(value: GridTemplateProperty*): Self = StObject.set(x, "gridTemplate", js.Array(value*))
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridVarargs(value: GridProperty*): Self = StObject.set(x, "grid", js.Array(value*))
    
    inline def setLineClamp(value: LineClampProperty | js.Array[LineClampProperty]): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
    
    inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    
    inline def setLineClampVarargs(value: LineClampProperty*): Self = StObject.set(x, "lineClamp", js.Array(value*))
    
    inline def setListStyle(value: ListStyleProperty | js.Array[ListStyleProperty]): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    inline def setListStyleVarargs(value: ListStyleProperty*): Self = StObject.set(x, "listStyle", js.Array(value*))
    
    inline def setMargin(value: MarginProperty[TLength] | js.Array[MarginProperty[TLength]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: MarginProperty[TLength]*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setMask(value: MaskProperty[TLength] | js.Array[MaskProperty[TLength]]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskBorder(value: MaskBorderProperty | js.Array[MaskBorderProperty]): Self = StObject.set(x, "maskBorder", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderUndefined: Self = StObject.set(x, "maskBorder", js.undefined)
    
    inline def setMaskBorderVarargs(value: MaskBorderProperty*): Self = StObject.set(x, "maskBorder", js.Array(value*))
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaskVarargs(value: MaskProperty[TLength]*): Self = StObject.set(x, "mask", js.Array(value*))
    
    inline def setMotion(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setMotionVarargs(value: OffsetProperty[TLength]*): Self = StObject.set(x, "motion", js.Array(value*))
    
    inline def setOffset(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: OffsetProperty[TLength]*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineVarargs(value: OutlineProperty[TLength]*): Self = StObject.set(x, "outline", js.Array(value*))
    
    inline def setPadding(value: PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: PaddingProperty[TLength]*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPlaceItems(value: PlaceItemsProperty | js.Array[PlaceItemsProperty]): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
    
    inline def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
    
    inline def setPlaceItemsVarargs(value: PlaceItemsProperty*): Self = StObject.set(x, "placeItems", js.Array(value*))
    
    inline def setPlaceSelf(value: PlaceSelfProperty | js.Array[PlaceSelfProperty]): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
    
    inline def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
    
    inline def setPlaceSelfVarargs(value: PlaceSelfProperty*): Self = StObject.set(x, "placeSelf", js.Array(value*))
    
    inline def setTextDecoration(value: TextDecorationProperty | js.Array[TextDecorationProperty]): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setTextDecorationVarargs(value: TextDecorationProperty*): Self = StObject.set(x, "textDecoration", js.Array(value*))
    
    inline def setTextEmphasis(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): Self = StObject.set(x, "textEmphasis", value.asInstanceOf[js.Any])
    
    inline def setTextEmphasisUndefined: Self = StObject.set(x, "textEmphasis", js.undefined)
    
    inline def setTextEmphasisVarargs(value: TextEmphasisProperty*): Self = StObject.set(x, "textEmphasis", js.Array(value*))
    
    inline def setTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setTransitionVarargs(value: TransitionProperty*): Self = StObject.set(x, "transition", js.Array(value*))
  }
}
