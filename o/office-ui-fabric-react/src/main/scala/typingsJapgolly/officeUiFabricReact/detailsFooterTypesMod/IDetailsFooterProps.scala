package typingsJapgolly.officeUiFabricReact.detailsFooterTypesMod

import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsFooterProps extends IDetailsItemProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsFooterProps: js.Array[IColumn]
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsFooterProps: SelectionMode
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsFooterProps: ISelection[IObjectWithKey]
}

object IDetailsFooterProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    rowWidth: Int | Double = null,
    viewport: IViewport = null
  ): IDetailsFooterProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsFooterProps]
  }
}

