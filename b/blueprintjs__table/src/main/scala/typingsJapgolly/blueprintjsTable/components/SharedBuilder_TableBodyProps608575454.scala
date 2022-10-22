package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TableBodyProps608575454[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def bodyContextMenuRenderer(value: /* context */ IMenuContext => Element): this.type = set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
  
  inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
  
  inline def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
  
  inline def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
  
  inline def onCompleteRender(value: Callback): this.type = set("onCompleteRender", value.toJsFn)
  
  inline def onSelectionEnd(value: /* regions */ js.Array[Region] => Callback): this.type = set("onSelectionEnd", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
  
  inline def renderMode(value: BATCH | NONE): this.type = set("renderMode", value.asInstanceOf[js.Any])
  
  inline def selectedRegionTransform(
    value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
  ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
  
  inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  
  inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
}
