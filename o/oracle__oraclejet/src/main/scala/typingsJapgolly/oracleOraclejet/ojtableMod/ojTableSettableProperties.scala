package typingsJapgolly.oracleOraclejet.ojtableMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.Anon19
import typingsJapgolly.oracleOraclejet.AnonColumnKey
import typingsJapgolly.oracleOraclejet.AnonDropReorder
import typingsJapgolly.oracleOraclejet.AnonField
import typingsJapgolly.oracleOraclejet.AnonFooterClassName
import typingsJapgolly.oracleOraclejet.AnonLabelAccSelectionAffordanceBottom
import typingsJapgolly.oracleOraclejet.AnonMaxCount
import typingsJapgolly.oracleOraclejet.AnonRowHeader
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.grid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.list
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableSettableProperties[K, D] extends baseComponentSettableProperties {
  var accessibility: AnonRowHeader
  var as: String
  var columns: (js.Array[AnonField[K, D]]) | Null
  var columnsDefault: AnonFooterClassName[K, D]
  var currentRow: CurrentRow[K] | Null
  var data: (DataProvider[K, D]) | Null
  var display: list | grid
  var dnd: AnonDropReorder[K, D]
  var editMode: none | rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: auto | enabled | disabled
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: AnonMaxCount
  var scrollPosition: AnonColumnKey
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ]
  var selectionMode: Anon19
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: AnonLabelAccSelectionAffordanceBottom
  var verticalGridVisible: auto | enabled | disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: AnonRowHeader,
    as: String,
    columnsDefault: AnonFooterClassName[K, D],
    display: list | grid,
    dnd: AnonDropReorder[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: AnonMaxCount,
    scrollPosition: AnonColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: Anon19,
    selectionRequired: Boolean,
    translations: AnonLabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled,
    columns: js.Array[AnonField[K, D]] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => CallbackTo[String | HTMLElement | Unit] = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (currentRow != null) __obj.updateDynamic("currentRow")(currentRow.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowRendererContext[K, D]) => rowRenderer(t0).runNow()))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

