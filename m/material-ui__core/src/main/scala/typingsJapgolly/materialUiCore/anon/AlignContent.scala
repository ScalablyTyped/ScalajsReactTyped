package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.gridGridMod.GridContentAlignment
import typingsJapgolly.materialUiCore.gridGridMod.GridDirection
import typingsJapgolly.materialUiCore.gridGridMod.GridItemsAlignment
import typingsJapgolly.materialUiCore.gridGridMod.GridJustification
import typingsJapgolly.materialUiCore.gridGridMod.GridSize
import typingsJapgolly.materialUiCore.gridGridMod.GridSpacing
import typingsJapgolly.materialUiCore.gridGridMod.GridWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignContent extends StObject {
  
  /**
    * Defines the `align-content` style property.
    * It's applied for all screen sizes.
    */
  var alignContent: js.UndefOr[GridContentAlignment] = js.undefined
  
  /**
    * Defines the `align-items` style property.
    * It's applied for all screen sizes.
    */
  var alignItems: js.UndefOr[GridItemsAlignment] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true`, the component will have the flex *container* behavior.
    * You should be wrapping *items* with a *container*.
    */
  var container: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    */
  var direction: js.UndefOr[GridDirection] = js.undefined
  
  /**
    * If `true`, the component will have the flex *item* behavior.
    * You should be wrapping *items* with a *container*.
    */
  var item: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the `justify-content` style property.
    * It is applied for all screen sizes.
    * @deprecated Use `justifyContent` instead, the prop was renamed
    */
  var justify: js.UndefOr[GridJustification] = js.undefined
  
  /**
    * Defines the `justify-content` style property.
    * It is applied for all screen sizes.
    */
  var justifyContent: js.UndefOr[GridJustification] = js.undefined
  
  /**
    * Defines the number of grids the component is going to use.
    * It's applied for the `lg` breakpoint and wider screens if not overridden.
    */
  var lg: js.UndefOr[Boolean | GridSize] = js.undefined
  
  /**
    * Defines the number of grids the component is going to use.
    * It's applied for the `md` breakpoint and wider screens if not overridden.
    */
  var md: js.UndefOr[Boolean | GridSize] = js.undefined
  
  /**
    * Defines the number of grids the component is going to use.
    * It's applied for the `sm` breakpoint and wider screens if not overridden.
    */
  var sm: js.UndefOr[Boolean | GridSize] = js.undefined
  
  /**
    * Defines the space between the type `item` component.
    * It can only be used on a type `container` component.
    */
  var spacing: js.UndefOr[GridSpacing] = js.undefined
  
  /**
    * Defines the `flex-wrap` style property.
    * It's applied for all screen sizes.
    */
  var wrap: js.UndefOr[GridWrap] = js.undefined
  
  /**
    * Defines the number of grids the component is going to use.
    * It's applied for the `xl` breakpoint and wider screens.
    */
  var xl: js.UndefOr[Boolean | GridSize] = js.undefined
  
  /**
    * Defines the number of grids the component is going to use.
    * It's applied for all the screen sizes with the lowest priority.
    */
  var xs: js.UndefOr[Boolean | GridSize] = js.undefined
  
  /**
    * If `true`, it sets `min-width: 0` on the item.
    * Refer to the limitations section of the documentation to better understand the use case.
    */
  var zeroMinWidth: js.UndefOr[Boolean] = js.undefined
}
object AlignContent {
  
  inline def apply(): AlignContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContent]
  }
  
  extension [Self <: AlignContent](x: Self) {
    
    inline def setAlignContent(value: GridContentAlignment): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignItems(value: GridItemsAlignment): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDirection(value: GridDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setJustify(value: GridJustification): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: GridJustification): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setLg(value: Boolean | GridSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
    
    inline def setMd(value: Boolean | GridSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    inline def setSm(value: Boolean | GridSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    inline def setSpacing(value: GridSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setWrap(value: GridWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    
    inline def setXl(value: Boolean | GridSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
    
    inline def setXs(value: Boolean | GridSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    
    inline def setZeroMinWidth(value: Boolean): Self = StObject.set(x, "zeroMinWidth", value.asInstanceOf[js.Any])
    
    inline def setZeroMinWidthUndefined: Self = StObject.set(x, "zeroMinWidth", js.undefined)
  }
}
