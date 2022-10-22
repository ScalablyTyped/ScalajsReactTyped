package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.gestalt.anon.Style
import typingsJapgolly.gestalt.gestaltDoubles.`0.1`
import typingsJapgolly.gestalt.gestaltDoubles.`0.2`
import typingsJapgolly.gestalt.gestaltDoubles.`0.3`
import typingsJapgolly.gestalt.gestaltDoubles.`0.4`
import typingsJapgolly.gestalt.gestaltDoubles.`0.5`
import typingsJapgolly.gestalt.gestaltDoubles.`0.6`
import typingsJapgolly.gestalt.gestaltDoubles.`0.7`
import typingsJapgolly.gestalt.gestaltDoubles.`0.8`
import typingsJapgolly.gestalt.gestaltDoubles.`0.9`
import typingsJapgolly.gestalt.gestaltInts.`0`
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltInts.`7`
import typingsJapgolly.gestalt.gestaltInts.`8`
import typingsJapgolly.gestalt.gestaltStrings.absolute
import typingsJapgolly.gestalt.gestaltStrings.around
import typingsJapgolly.gestalt.gestaltStrings.article
import typingsJapgolly.gestalt.gestaltStrings.aside
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.baseline
import typingsJapgolly.gestalt.gestaltStrings.between
import typingsJapgolly.gestalt.gestaltStrings.block
import typingsJapgolly.gestalt.gestaltStrings.brand
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.column
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.darkWash
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.details
import typingsJapgolly.gestalt.gestaltStrings.div
import typingsJapgolly.gestalt.gestaltStrings.education
import typingsJapgolly.gestalt.gestaltStrings.elevationAccent
import typingsJapgolly.gestalt.gestaltStrings.elevationFloating
import typingsJapgolly.gestalt.gestaltStrings.elevationRaised
import typingsJapgolly.gestalt.gestaltStrings.end
import typingsJapgolly.gestalt.gestaltStrings.errorBase
import typingsJapgolly.gestalt.gestaltStrings.errorWeak
import typingsJapgolly.gestalt.gestaltStrings.evenly
import typingsJapgolly.gestalt.gestaltStrings.figcaption
import typingsJapgolly.gestalt.gestaltStrings.figure
import typingsJapgolly.gestalt.gestaltStrings.fixed
import typingsJapgolly.gestalt.gestaltStrings.flex
import typingsJapgolly.gestalt.gestaltStrings.footer
import typingsJapgolly.gestalt.gestaltStrings.grow
import typingsJapgolly.gestalt.gestaltStrings.header
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.infoBase
import typingsJapgolly.gestalt.gestaltStrings.infoWeak
import typingsJapgolly.gestalt.gestaltStrings.inlineBlock
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.lightWash
import typingsJapgolly.gestalt.gestaltStrings.main
import typingsJapgolly.gestalt.gestaltStrings.nav
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.pill
import typingsJapgolly.gestalt.gestaltStrings.primary
import typingsJapgolly.gestalt.gestaltStrings.raisedBottomShadow
import typingsJapgolly.gestalt.gestaltStrings.raisedTopShadow
import typingsJapgolly.gestalt.gestaltStrings.recommendationBase
import typingsJapgolly.gestalt.gestaltStrings.recommendationWeak
import typingsJapgolly.gestalt.gestaltStrings.relative
import typingsJapgolly.gestalt.gestaltStrings.row
import typingsJapgolly.gestalt.gestaltStrings.scroll
import typingsJapgolly.gestalt.gestaltStrings.scrollX
import typingsJapgolly.gestalt.gestaltStrings.scrollY
import typingsJapgolly.gestalt.gestaltStrings.secondary
import typingsJapgolly.gestalt.gestaltStrings.section
import typingsJapgolly.gestalt.gestaltStrings.selected
import typingsJapgolly.gestalt.gestaltStrings.shadow
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.shrink
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.start
import typingsJapgolly.gestalt.gestaltStrings.static
import typingsJapgolly.gestalt.gestaltStrings.stretch
import typingsJapgolly.gestalt.gestaltStrings.successBase
import typingsJapgolly.gestalt.gestaltStrings.successWeak
import typingsJapgolly.gestalt.gestaltStrings.summary
import typingsJapgolly.gestalt.gestaltStrings.tertiary
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.transparentDarkGray
import typingsJapgolly.gestalt.gestaltStrings.visible
import typingsJapgolly.gestalt.gestaltStrings.visuallyHidden
import typingsJapgolly.gestalt.gestaltStrings.warningBase
import typingsJapgolly.gestalt.gestaltStrings.warningWeak
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'div'>, 'onClick' | 'className' | 'style' | 'ref'> ]: react.react.ComponentProps<'div'>[P]} */ trait BoxProps
  extends StObject
     with RefAttributes[HTMLDivElement] {
  
  var alignContent: js.UndefOr[start | end | center | between | around | evenly | stretch] = js.undefined
  
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.undefined
  
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  
  /**
    * Changes the underlying DOM element when needed for accessibility or SEO reasons. Note that currently only block-level elements are available.
    *
    * @default 'div'
    */
  var as: js.UndefOr[
    article | aside | details | div | figcaption | figure | footer | header | main | nav | section | summary
  ] = js.undefined
  
  var borderStyle: js.UndefOr[sm | lg | shadow | raisedTopShadow | raisedBottomShadow | none] = js.undefined
  
  var bottom: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[
    darkWash | lightWash | transparent | transparentDarkGray | default | infoBase | infoWeak | errorBase | errorWeak | warningBase | warningWeak | successBase | successWeak | recommendationBase | recommendationWeak | shopping | primary | secondary | tertiary | selected | inverse | brand | education | elevationAccent | elevationFloating | elevationRaised | dark | light
  ] = js.undefined
  
  var column: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var dangerouslySetInlineStyle: js.UndefOr[Style] = js.undefined
  
  var direction: js.UndefOr[row | column] = js.undefined
  
  var display: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  
  var fit: js.UndefOr[Boolean] = js.undefined
  
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var justifyContent: js.UndefOr[start | end | center | between | around | evenly] = js.undefined
  
  var left: js.UndefOr[Boolean] = js.undefined
  
  var lgColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var lgDirection: js.UndefOr[row | column] = js.undefined
  
  var lgDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  
  var lgMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var lgMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var lgMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var lgMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var lgMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var lgPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var lgPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var lgPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var margin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var marginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var marginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var marginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var marginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var mdColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var mdDirection: js.UndefOr[row | column] = js.undefined
  
  var mdDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  
  var mdMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var mdMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var mdMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var mdMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var mdMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var mdPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var mdPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var mdPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var minHeight: js.UndefOr[Double | String] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
  var opacity: js.UndefOr[
    `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`
  ] = js.undefined
  
  var overflow: js.UndefOr[visible | hidden | scroll | scrollX | scrollY | auto] = js.undefined
  
  var padding: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var paddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var paddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var position: js.UndefOr[static | absolute | relative | fixed] = js.undefined
  
  var right: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var smColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var smDirection: js.UndefOr[row | column] = js.undefined
  
  var smDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  
  var smMargin: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var smMarginBottom: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var smMarginEnd: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var smMarginStart: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var smMarginTop: js.UndefOr[SignedUpTo12 | auto] = js.undefined
  
  var smPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var smPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var smPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var top: js.UndefOr[Boolean] = js.undefined
  
  var userSelect: js.UndefOr[auto | none] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object BoxProps {
  
  inline def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  
  extension [Self <: BoxProps](x: Self) {
    
    inline def setAlignContent(value: start | end | center | between | around | evenly | stretch): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignItems(value: start | end | center | baseline | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignSelf(value: auto | start | end | center | baseline | stretch): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAs(
      value: article | aside | details | div | figcaption | figure | footer | header | main | nav | section | summary
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setBorderStyle(value: sm | lg | shadow | raisedTopShadow | raisedBottomShadow | none): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(
      value: darkWash | lightWash | transparent | transparentDarkGray | default | infoBase | infoWeak | errorBase | errorWeak | warningBase | warningWeak | successBase | successWeak | recommendationBase | recommendationWeak | shopping | primary | secondary | tertiary | selected | inverse | brand | education | elevationAccent | elevationFloating | elevationRaised | dark | light
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColumn(value: UnsignedUpTo12): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDangerouslySetInlineStyle(value: Style): Self = StObject.set(x, "dangerouslySetInlineStyle", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInlineStyleUndefined: Self = StObject.set(x, "dangerouslySetInlineStyle", js.undefined)
    
    inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setFlex(value: grow | shrink | none): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustifyContent(value: start | end | center | between | around | evenly): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLgColumn(value: UnsignedUpTo12): Self = StObject.set(x, "lgColumn", value.asInstanceOf[js.Any])
    
    inline def setLgColumnUndefined: Self = StObject.set(x, "lgColumn", js.undefined)
    
    inline def setLgDirection(value: row | column): Self = StObject.set(x, "lgDirection", value.asInstanceOf[js.Any])
    
    inline def setLgDirectionUndefined: Self = StObject.set(x, "lgDirection", js.undefined)
    
    inline def setLgDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = StObject.set(x, "lgDisplay", value.asInstanceOf[js.Any])
    
    inline def setLgDisplayUndefined: Self = StObject.set(x, "lgDisplay", js.undefined)
    
    inline def setLgMargin(value: SignedUpTo12 | auto): Self = StObject.set(x, "lgMargin", value.asInstanceOf[js.Any])
    
    inline def setLgMarginBottom(value: SignedUpTo12 | auto): Self = StObject.set(x, "lgMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setLgMarginBottomUndefined: Self = StObject.set(x, "lgMarginBottom", js.undefined)
    
    inline def setLgMarginEnd(value: SignedUpTo12 | auto): Self = StObject.set(x, "lgMarginEnd", value.asInstanceOf[js.Any])
    
    inline def setLgMarginEndUndefined: Self = StObject.set(x, "lgMarginEnd", js.undefined)
    
    inline def setLgMarginStart(value: SignedUpTo12 | auto): Self = StObject.set(x, "lgMarginStart", value.asInstanceOf[js.Any])
    
    inline def setLgMarginStartUndefined: Self = StObject.set(x, "lgMarginStart", js.undefined)
    
    inline def setLgMarginTop(value: SignedUpTo12 | auto): Self = StObject.set(x, "lgMarginTop", value.asInstanceOf[js.Any])
    
    inline def setLgMarginTopUndefined: Self = StObject.set(x, "lgMarginTop", js.undefined)
    
    inline def setLgMarginUndefined: Self = StObject.set(x, "lgMargin", js.undefined)
    
    inline def setLgPadding(value: UnsignedUpTo12): Self = StObject.set(x, "lgPadding", value.asInstanceOf[js.Any])
    
    inline def setLgPaddingUndefined: Self = StObject.set(x, "lgPadding", js.undefined)
    
    inline def setLgPaddingX(value: UnsignedUpTo12): Self = StObject.set(x, "lgPaddingX", value.asInstanceOf[js.Any])
    
    inline def setLgPaddingXUndefined: Self = StObject.set(x, "lgPaddingX", js.undefined)
    
    inline def setLgPaddingY(value: UnsignedUpTo12): Self = StObject.set(x, "lgPaddingY", value.asInstanceOf[js.Any])
    
    inline def setLgPaddingYUndefined: Self = StObject.set(x, "lgPaddingY", js.undefined)
    
    inline def setMargin(value: SignedUpTo12 | auto): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: SignedUpTo12 | auto): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginEnd(value: SignedUpTo12 | auto): Self = StObject.set(x, "marginEnd", value.asInstanceOf[js.Any])
    
    inline def setMarginEndUndefined: Self = StObject.set(x, "marginEnd", js.undefined)
    
    inline def setMarginStart(value: SignedUpTo12 | auto): Self = StObject.set(x, "marginStart", value.asInstanceOf[js.Any])
    
    inline def setMarginStartUndefined: Self = StObject.set(x, "marginStart", js.undefined)
    
    inline def setMarginTop(value: SignedUpTo12 | auto): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMdColumn(value: UnsignedUpTo12): Self = StObject.set(x, "mdColumn", value.asInstanceOf[js.Any])
    
    inline def setMdColumnUndefined: Self = StObject.set(x, "mdColumn", js.undefined)
    
    inline def setMdDirection(value: row | column): Self = StObject.set(x, "mdDirection", value.asInstanceOf[js.Any])
    
    inline def setMdDirectionUndefined: Self = StObject.set(x, "mdDirection", js.undefined)
    
    inline def setMdDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = StObject.set(x, "mdDisplay", value.asInstanceOf[js.Any])
    
    inline def setMdDisplayUndefined: Self = StObject.set(x, "mdDisplay", js.undefined)
    
    inline def setMdMargin(value: SignedUpTo12 | auto): Self = StObject.set(x, "mdMargin", value.asInstanceOf[js.Any])
    
    inline def setMdMarginBottom(value: SignedUpTo12 | auto): Self = StObject.set(x, "mdMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setMdMarginBottomUndefined: Self = StObject.set(x, "mdMarginBottom", js.undefined)
    
    inline def setMdMarginEnd(value: SignedUpTo12 | auto): Self = StObject.set(x, "mdMarginEnd", value.asInstanceOf[js.Any])
    
    inline def setMdMarginEndUndefined: Self = StObject.set(x, "mdMarginEnd", js.undefined)
    
    inline def setMdMarginStart(value: SignedUpTo12 | auto): Self = StObject.set(x, "mdMarginStart", value.asInstanceOf[js.Any])
    
    inline def setMdMarginStartUndefined: Self = StObject.set(x, "mdMarginStart", js.undefined)
    
    inline def setMdMarginTop(value: SignedUpTo12 | auto): Self = StObject.set(x, "mdMarginTop", value.asInstanceOf[js.Any])
    
    inline def setMdMarginTopUndefined: Self = StObject.set(x, "mdMarginTop", js.undefined)
    
    inline def setMdMarginUndefined: Self = StObject.set(x, "mdMargin", js.undefined)
    
    inline def setMdPadding(value: UnsignedUpTo12): Self = StObject.set(x, "mdPadding", value.asInstanceOf[js.Any])
    
    inline def setMdPaddingUndefined: Self = StObject.set(x, "mdPadding", js.undefined)
    
    inline def setMdPaddingX(value: UnsignedUpTo12): Self = StObject.set(x, "mdPaddingX", value.asInstanceOf[js.Any])
    
    inline def setMdPaddingXUndefined: Self = StObject.set(x, "mdPaddingX", js.undefined)
    
    inline def setMdPaddingY(value: UnsignedUpTo12): Self = StObject.set(x, "mdPaddingY", value.asInstanceOf[js.Any])
    
    inline def setMdPaddingYUndefined: Self = StObject.set(x, "mdPaddingY", js.undefined)
    
    inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOpacity(value: `0` | `0.1` | `0.2` | `0.3` | `0.4` | `0.5` | `0.6` | `0.7` | `0.8` | `0.9` | `1`): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverflow(value: visible | hidden | scroll | scrollX | scrollY | auto): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPadding(value: UnsignedUpTo12): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingX(value: UnsignedUpTo12): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    inline def setPaddingY(value: UnsignedUpTo12): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    inline def setPosition(value: static | absolute | relative | fixed): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setSmColumn(value: UnsignedUpTo12): Self = StObject.set(x, "smColumn", value.asInstanceOf[js.Any])
    
    inline def setSmColumnUndefined: Self = StObject.set(x, "smColumn", js.undefined)
    
    inline def setSmDirection(value: row | column): Self = StObject.set(x, "smDirection", value.asInstanceOf[js.Any])
    
    inline def setSmDirectionUndefined: Self = StObject.set(x, "smDirection", js.undefined)
    
    inline def setSmDisplay(value: none | flex | block | inlineBlock | visuallyHidden): Self = StObject.set(x, "smDisplay", value.asInstanceOf[js.Any])
    
    inline def setSmDisplayUndefined: Self = StObject.set(x, "smDisplay", js.undefined)
    
    inline def setSmMargin(value: SignedUpTo12 | auto): Self = StObject.set(x, "smMargin", value.asInstanceOf[js.Any])
    
    inline def setSmMarginBottom(value: SignedUpTo12 | auto): Self = StObject.set(x, "smMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setSmMarginBottomUndefined: Self = StObject.set(x, "smMarginBottom", js.undefined)
    
    inline def setSmMarginEnd(value: SignedUpTo12 | auto): Self = StObject.set(x, "smMarginEnd", value.asInstanceOf[js.Any])
    
    inline def setSmMarginEndUndefined: Self = StObject.set(x, "smMarginEnd", js.undefined)
    
    inline def setSmMarginStart(value: SignedUpTo12 | auto): Self = StObject.set(x, "smMarginStart", value.asInstanceOf[js.Any])
    
    inline def setSmMarginStartUndefined: Self = StObject.set(x, "smMarginStart", js.undefined)
    
    inline def setSmMarginTop(value: SignedUpTo12 | auto): Self = StObject.set(x, "smMarginTop", value.asInstanceOf[js.Any])
    
    inline def setSmMarginTopUndefined: Self = StObject.set(x, "smMarginTop", js.undefined)
    
    inline def setSmMarginUndefined: Self = StObject.set(x, "smMargin", js.undefined)
    
    inline def setSmPadding(value: UnsignedUpTo12): Self = StObject.set(x, "smPadding", value.asInstanceOf[js.Any])
    
    inline def setSmPaddingUndefined: Self = StObject.set(x, "smPadding", js.undefined)
    
    inline def setSmPaddingX(value: UnsignedUpTo12): Self = StObject.set(x, "smPaddingX", value.asInstanceOf[js.Any])
    
    inline def setSmPaddingXUndefined: Self = StObject.set(x, "smPaddingX", js.undefined)
    
    inline def setSmPaddingY(value: UnsignedUpTo12): Self = StObject.set(x, "smPaddingY", value.asInstanceOf[js.Any])
    
    inline def setSmPaddingYUndefined: Self = StObject.set(x, "smPaddingY", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setUserSelect(value: auto | none): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
    
    inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
