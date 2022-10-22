package typingsJapgolly.reactMdUtils

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdUtils.typesLayoutGridCellMod.GridCellProps
import typingsJapgolly.reactMdUtils.typesLayoutGridListCellMod.GridListCellProps
import typingsJapgolly.reactMdUtils.typesLayoutGridListMod.GridListProps
import typingsJapgolly.reactMdUtils.typesLayoutGridMod.GridProps
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.GridListSize
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.UseGridListOptions
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.UseGridListReturnValue
import typingsJapgolly.reactMdUtils.typesTypesMod.PropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutMod {
  
  @JSImport("@react-md/utils/types/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/layout", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  inline def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")().asInstanceOf[UseGridListReturnValue[E]]
  inline def useGridList[E /* <: HTMLElement */](
    hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")(hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding.asInstanceOf[js.Any]).asInstanceOf[UseGridListReturnValue[E]]
  
  inline def useGridListSize(): GridListSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridListSize")().asInstanceOf[GridListSize]
}
