package typingsJapgolly.reactMdUtils

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.`max-content`
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.`min-content`
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutGridMod {
  
  @JSImport("@react-md/utils/types/layout/Grid", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/Grid", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/Grid", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait GridProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the `children` should have the grid `style` and `className`
      * props cloned using `React.cloneElement`. This is useful if you just want to
      * use the grid styles without the additional wrapper `<div>`.
      *
      * Note: if this prop is provided, all of the `HTMLAttributes` props will be
      * ignored as well as the `clone` and `wrapOnly` props.
      *
      * @remarks \@since 2.3.0
      */
    var cloneStyles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the `children` should be updated to be wrapped in the `GridCell`
      * component and clone the `className` into each child automatically. This is
      * really just a convenience prop so you don't always need to import both the
      * `Grid` and `GridCell` components to create a grid.
      */
    @JSName("clone")
    var clone_FGridProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional number of columns to apply for all media types. Providing one
      * of the media-specific column props will override this value for those
      * breakpoints still.
      */
    var columns: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional number of columns to display for desktop screens.
      */
    var desktopColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * This will override the default grid cell's gutter value (the space between
      * each cell). This **needs to be a number with a unit** since it is set to a
      * css variable. Examples:
      *
      * - `1rem`
      * - `16px`
      * - `1em`
      * - `5%`
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * An optional number of columns to display for large desktop screens.
      */
    var largeDesktopColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * This prop allows you to generate your grid with a dynamic amount of columns
      * instead of a static size. This will update the grid to ignore all the
      * `columns` props and update the grid to show as many columns as possible by
      * updating the `grid-template-columns` style to be:
      *
      * ```scss
      * grid-template-columns: repeat(auto-fill, minmax($min-cell-width, 1fr));
      * ```
      *
      * This **needs to be a number with a unit**. Check out the documentation on
      * the `minmax` css function for some more info.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/minmax
      */
    var minCellWidth: js.UndefOr[`min-content` | `max-content` | auto | String] = js.undefined
    
    /**
      * This is really just a pass-through of the `style` prop that allows you to
      * quickly update the base padding for the grid.
      */
    var padding: js.UndefOr[Double | String] = js.undefined
    
    /**
      * An optional number of columns to display for phones.
      */
    var phoneColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional number of columns to display for tablets.
      */
    var tabletColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the `children` should be updated to be wrapped in the `GridCell`
      * component.  This is really just a convenience prop so you don't always need
      * to import both the `Grid` and `GridCell` components to create a grid/
      */
    var wrapOnly: js.UndefOr[Boolean] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setCloneStyles(value: Boolean): Self = StObject.set(x, "cloneStyles", value.asInstanceOf[js.Any])
      
      inline def setCloneStylesUndefined: Self = StObject.set(x, "cloneStyles", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDesktopColumns(value: Double): Self = StObject.set(x, "desktopColumns", value.asInstanceOf[js.Any])
      
      inline def setDesktopColumnsUndefined: Self = StObject.set(x, "desktopColumns", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLargeDesktopColumns(value: Double): Self = StObject.set(x, "largeDesktopColumns", value.asInstanceOf[js.Any])
      
      inline def setLargeDesktopColumnsUndefined: Self = StObject.set(x, "largeDesktopColumns", js.undefined)
      
      inline def setMinCellWidth(value: `min-content` | `max-content` | auto | String): Self = StObject.set(x, "minCellWidth", value.asInstanceOf[js.Any])
      
      inline def setMinCellWidthUndefined: Self = StObject.set(x, "minCellWidth", js.undefined)
      
      inline def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPhoneColumns(value: Double): Self = StObject.set(x, "phoneColumns", value.asInstanceOf[js.Any])
      
      inline def setPhoneColumnsUndefined: Self = StObject.set(x, "phoneColumns", js.undefined)
      
      inline def setTabletColumns(value: Double): Self = StObject.set(x, "tabletColumns", value.asInstanceOf[js.Any])
      
      inline def setTabletColumnsUndefined: Self = StObject.set(x, "tabletColumns", js.undefined)
      
      inline def setWrapOnly(value: Boolean): Self = StObject.set(x, "wrapOnly", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyUndefined: Self = StObject.set(x, "wrapOnly", js.undefined)
    }
  }
}
