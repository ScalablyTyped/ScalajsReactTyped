package typingsJapgolly.oracleOraclejet.ojtableMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.ColumnKey
import typingsJapgolly.oracleOraclejet.anon.DropReorder
import typingsJapgolly.oracleOraclejet.anon.Field
import typingsJapgolly.oracleOraclejet.anon.FooterClassName
import typingsJapgolly.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typingsJapgolly.oracleOraclejet.anon.MaxCount
import typingsJapgolly.oracleOraclejet.anon.RowHeader
import typingsJapgolly.oracleOraclejet.anon.`21`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojTableSettableProperties[K, D]
  extends StObject
     with baseComponentSettableProperties {
  
  var accessibility: RowHeader
  
  var as: String
  
  var columns: (js.Array[Field[K, D]]) | Null
  
  var columnsDefault: FooterClassName[K, D]
  
  var currentRow: CurrentRow[K] | Null
  
  var data: (DataProvider[K, D]) | Null
  
  var display: list | grid
  
  var dnd: DropReorder[K, D]
  
  var editMode: none | rowEdit
  
  val firstSelectedRow: js.Object
  
  var horizontalGridVisible: auto | enabled | disabled
  
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  
  var scrollPolicy: auto | loadMoreOnScroll
  
  var scrollPolicyOptions: MaxCount
  
  var scrollPosition: ColumnKey
  
  var selection: js.Array[
    (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
  ]
  
  var selectionMode: `21`
  
  var selectionRequired: Boolean
  
  @JSName("translations")
  var translations_ojTableSettableProperties: LabelAccSelectionAffordanceBottom
  
  var verticalGridVisible: auto | enabled | disabled
}
object ojTableSettableProperties {
  
  inline def apply[K, D](
    accessibility: RowHeader,
    as: String,
    columnsDefault: FooterClassName[K, D],
    display: list | grid,
    dnd: DropReorder[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: MaxCount,
    scrollPosition: ColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
    ],
    selectionMode: `21`,
    selectionRequired: Boolean,
    translations: LabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any], columns = null, currentRow = null, data = null, rowRenderer = null)
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
  
  extension [Self <: ojTableSettableProperties[?, ?], K, D](x: Self & (ojTableSettableProperties[K, D])) {
    
    inline def setAccessibility(value: RowHeader): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[Field[K, D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsDefault(value: FooterClassName[K, D]): Self = StObject.set(x, "columnsDefault", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsVarargs(value: (Field[K, D])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCurrentRow(value: CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    inline def setCurrentRowNull: Self = StObject.set(x, "currentRow", null)
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDisplay(value: list | grid): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDnd(value: DropReorder[K, D]): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setEditMode(value: none | rowEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    inline def setFirstSelectedRow(value: js.Object): Self = StObject.set(x, "firstSelectedRow", value.asInstanceOf[js.Any])
    
    inline def setHorizontalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "horizontalGridVisible", value.asInstanceOf[js.Any])
    
    inline def setRowRenderer(value: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    inline def setRowRendererNull: Self = StObject.set(x, "rowRenderer", null)
    
    inline def setScrollPolicy(value: auto | loadMoreOnScroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
    
    inline def setScrollPolicyOptions(value: MaxCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
    
    inline def setScrollPosition(value: ColumnKey): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    inline def setSelection(
      value: js.Array[
          (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
        ]
    ): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: `21`): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionRequired(value: Boolean): Self = StObject.set(x, "selectionRequired", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(
      value: ((RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K]))*
    ): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setTranslations(value: LabelAccSelectionAffordanceBottom): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setVerticalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "verticalGridVisible", value.asInstanceOf[js.Any])
  }
}
