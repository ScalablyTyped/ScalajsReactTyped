package typingsJapgolly.ink

import typingsJapgolly.ink.inkStrings.`column-reverse`
import typingsJapgolly.ink.inkStrings.`flex-end`
import typingsJapgolly.ink.inkStrings.`flex-start`
import typingsJapgolly.ink.inkStrings.`row-reverse`
import typingsJapgolly.ink.inkStrings.`space-around`
import typingsJapgolly.ink.inkStrings.`space-between`
import typingsJapgolly.ink.inkStrings.`truncate-end`
import typingsJapgolly.ink.inkStrings.`truncate-middle`
import typingsJapgolly.ink.inkStrings.`truncate-start`
import typingsJapgolly.ink.inkStrings.absolute
import typingsJapgolly.ink.inkStrings.arrow
import typingsJapgolly.ink.inkStrings.auto
import typingsJapgolly.ink.inkStrings.bold
import typingsJapgolly.ink.inkStrings.center
import typingsJapgolly.ink.inkStrings.classic
import typingsJapgolly.ink.inkStrings.column
import typingsJapgolly.ink.inkStrings.double
import typingsJapgolly.ink.inkStrings.doubleSingle
import typingsJapgolly.ink.inkStrings.end
import typingsJapgolly.ink.inkStrings.flex
import typingsJapgolly.ink.inkStrings.middle
import typingsJapgolly.ink.inkStrings.none
import typingsJapgolly.ink.inkStrings.relative
import typingsJapgolly.ink.inkStrings.round
import typingsJapgolly.ink.inkStrings.row
import typingsJapgolly.ink.inkStrings.single
import typingsJapgolly.ink.inkStrings.singleDouble
import typingsJapgolly.ink.inkStrings.stretch
import typingsJapgolly.ink.inkStrings.truncate
import typingsJapgolly.ink.inkStrings.wrap
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import typingsJapgolly.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStylesMod {
  
  @JSImport("ink/build/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: YogaNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(node: YogaNode, style: Styles): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Styles extends StObject {
    
    /**
      * The align-items property defines the default behavior for how items are laid out along the cross axis (perpendicular to the main axis).
      * See [align-items](https://css-tricks.com/almanac/properties/a/align-items/).
      */
    val alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.undefined
    
    /**
      * It makes possible to override the align-items value for specific flex items.
      * See [align-self](https://css-tricks.com/almanac/properties/a/align-self/).
      */
    val alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.undefined
    
    /**
      * Change border color.
      * Accepts the same values as `color` in <Text> component.
      */
    val borderColor: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
      ] = js.undefined
    
    /**
      * Add a border with a specified style.
      * If `borderStyle` is `undefined` (which it is by default), no border will be added.
      */
    val borderStyle: js.UndefOr[single | double | round | bold | singleDouble | doubleSingle | classic | arrow] = js.undefined
    
    /**
      * Set this property to `none` to hide the element.
      */
    val display: js.UndefOr[flex | none] = js.undefined
    
    /**
      * It specifies the initial size of the flex item, before any available space is distributed according to the flex factors.
      * See [flex-basis](https://css-tricks.com/almanac/properties/f/flex-basis/).
      */
    val flexBasis: js.UndefOr[Double | String] = js.undefined
    
    /**
      * It establishes the main-axis, thus defining the direction flex items are placed in the flex container.
      * See [flex-direction](https://css-tricks.com/almanac/properties/f/flex-direction/).
      */
    val flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.undefined
    
    /**
      * This property defines the ability for a flex item to grow if necessary.
      * See [flex-grow](https://css-tricks.com/almanac/properties/f/flex-grow/).
      */
    val flexGrow: js.UndefOr[Double] = js.undefined
    
    /**
      * It specifies the “flex shrink factor”, which determines how much the flex item will shrink relative to the rest of the flex items in the flex container when there isn’t enough space on the row.
      * See [flex-shrink](https://css-tricks.com/almanac/properties/f/flex-shrink/).
      */
    val flexShrink: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of the element in lines (rows).
      * You can also set it in percent, which will calculate the height based on the height of parent element.
      */
    val height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * It defines the alignment along the main axis.
      * See [justify-content](https://css-tricks.com/almanac/properties/j/justify-content/).
      */
    val justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.undefined
    
    /**
      * Bottom margin.
      */
    val marginBottom: js.UndefOr[Double] = js.undefined
    
    /**
      * Left margin.
      */
    val marginLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Right margin.
      */
    val marginRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Top margin.
      */
    val marginTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets a minimum height of the element.
      */
    val minHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Sets a minimum width of the element.
      */
    val minWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Bottom padding.
      */
    val paddingBottom: js.UndefOr[Double] = js.undefined
    
    /**
      * Left padding.
      */
    val paddingLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Right padding.
      */
    val paddingRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Top padding.
      */
    val paddingTop: js.UndefOr[Double] = js.undefined
    
    val position: js.UndefOr[absolute | relative] = js.undefined
    
    val textWrap: js.UndefOr[
        wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
      ] = js.undefined
    
    /**
      * Width of the element in spaces.
      * You can also set it in percent, which will calculate the width based on the width of parent element.
      */
    val width: js.UndefOr[Double | String] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBorderColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
              String
            ]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic | arrow): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setDisplay(value: flex | none): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTextWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = StObject.set(x, "textWrap", value.asInstanceOf[js.Any])
      
      inline def setTextWrapUndefined: Self = StObject.set(x, "textWrap", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
