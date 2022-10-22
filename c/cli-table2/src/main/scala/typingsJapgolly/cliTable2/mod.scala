package typingsJapgolly.cliTable2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cliTable2.anon.Border
import typingsJapgolly.cliTable2.anon.Compact
import typingsJapgolly.cliTable2.anon.PartialRecordCharNamestri
import typingsJapgolly.cliTable2.anon.RecordCharNamestring
import typingsJapgolly.std.Array
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-table2", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CliTable2 = js.native
  
  type Cell = CellValue | CellOptions
  
  trait CellOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var content: CellValue
    
    var hAlign: js.UndefOr[HorizontalAlignment] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[Border] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
    
    var vAlign: js.UndefOr[VerticalAlignment] = js.undefined
  }
  object CellOptions {
    
    inline def apply(): CellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellOptions]
    }
    
    extension [Self <: CellOptions](x: Self) {
      
      inline def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setContent(value: CellValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHAlign(value: HorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setStyle(value: Border): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setVAlign(value: VerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  type CellValue = js.UndefOr[Boolean | Double | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cliTable2.cliTable2Strings.top
    - typingsJapgolly.cliTable2.cliTable2Strings.`top-mid`
    - typingsJapgolly.cliTable2.cliTable2Strings.`top-left`
    - typingsJapgolly.cliTable2.cliTable2Strings.`top-right`
    - typingsJapgolly.cliTable2.cliTable2Strings.bottom
    - typingsJapgolly.cliTable2.cliTable2Strings.`bottom-mid`
    - typingsJapgolly.cliTable2.cliTable2Strings.`bottom-left`
    - typingsJapgolly.cliTable2.cliTable2Strings.`bottom-right`
    - typingsJapgolly.cliTable2.cliTable2Strings.left
    - typingsJapgolly.cliTable2.cliTable2Strings.`left-mid`
    - typingsJapgolly.cliTable2.cliTable2Strings.mid
    - typingsJapgolly.cliTable2.cliTable2Strings.`mid-mid`
    - typingsJapgolly.cliTable2.cliTable2Strings.right
    - typingsJapgolly.cliTable2.cliTable2Strings.`right-mid`
    - typingsJapgolly.cliTable2.cliTable2Strings.middle
  */
  trait CharName extends StObject
  object CharName {
    
    inline def bottom: typingsJapgolly.cliTable2.cliTable2Strings.bottom = "bottom".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.bottom]
    
    inline def `bottom-left`: typingsJapgolly.cliTable2.cliTable2Strings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`bottom-left`]
    
    inline def `bottom-mid`: typingsJapgolly.cliTable2.cliTable2Strings.`bottom-mid` = "bottom-mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`bottom-mid`]
    
    inline def `bottom-right`: typingsJapgolly.cliTable2.cliTable2Strings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`bottom-right`]
    
    inline def left: typingsJapgolly.cliTable2.cliTable2Strings.left = "left".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.left]
    
    inline def `left-mid`: typingsJapgolly.cliTable2.cliTable2Strings.`left-mid` = "left-mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`left-mid`]
    
    inline def mid: typingsJapgolly.cliTable2.cliTable2Strings.mid = "mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.mid]
    
    inline def `mid-mid`: typingsJapgolly.cliTable2.cliTable2Strings.`mid-mid` = "mid-mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`mid-mid`]
    
    inline def middle: typingsJapgolly.cliTable2.cliTable2Strings.middle = "middle".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.middle]
    
    inline def right: typingsJapgolly.cliTable2.cliTable2Strings.right = "right".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.right]
    
    inline def `right-mid`: typingsJapgolly.cliTable2.cliTable2Strings.`right-mid` = "right-mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`right-mid`]
    
    inline def top: typingsJapgolly.cliTable2.cliTable2Strings.top = "top".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.top]
    
    inline def `top-left`: typingsJapgolly.cliTable2.cliTable2Strings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`top-left`]
    
    inline def `top-mid`: typingsJapgolly.cliTable2.cliTable2Strings.`top-mid` = "top-mid".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`top-mid`]
    
    inline def `top-right`: typingsJapgolly.cliTable2.cliTable2Strings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.`top-right`]
  }
  
  @js.native
  trait CliTable2
    extends StObject
       with Instantiable0[Table]
       with Instantiable1[/* options */ TableConstructorOptions, Table]
  
  type CrossTable = GenericTable[CrossTableRow]
  
  type CrossTableRow = StringDictionary[js.Array[Cell]]
  
  @js.native
  trait GenericTable[T]
    extends StObject
       with Array[T] {
    
    var options: TableInstanceOptions = js.native
    
    val width: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cliTable2.cliTable2Strings.left
    - typingsJapgolly.cliTable2.cliTable2Strings.center
    - typingsJapgolly.cliTable2.cliTable2Strings.right
  */
  trait HorizontalAlignment extends StObject
  object HorizontalAlignment {
    
    inline def center: typingsJapgolly.cliTable2.cliTable2Strings.center = "center".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.center]
    
    inline def left: typingsJapgolly.cliTable2.cliTable2Strings.left = "left".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.left]
    
    inline def right: typingsJapgolly.cliTable2.cliTable2Strings.right = "right".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.right]
  }
  
  type HorizontalTable = GenericTable[HorizontalTableRow]
  
  type HorizontalTableRow = js.Array[Cell]
  
  type Table = HorizontalTable | VerticalTable | CrossTable
  
  /* Inlined parent std.Partial<cli-table2.cli-table2.TableOptions> */
  trait TableConstructorOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
    
    var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.undefined
    
    var colWidths: js.UndefOr[js.Array[Double | Null]] = js.undefined
    
    var head: js.UndefOr[js.Array[Cell]] = js.undefined
    
    var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.undefined
    
    var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.undefined
    
    var style: js.UndefOr[Partial[Compact]] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
  }
  object TableConstructorOptions {
    
    inline def apply(): TableConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableConstructorOptions]
    }
    
    extension [Self <: TableConstructorOptions](x: Self) {
      
      inline def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      inline def setColAlignsUndefined: Self = StObject.set(x, "colAligns", js.undefined)
      
      inline def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value*))
      
      inline def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      inline def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setHead(value: js.Array[Cell]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: Cell*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      inline def setRowAlignsUndefined: Self = StObject.set(x, "rowAligns", js.undefined)
      
      inline def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value*))
      
      inline def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setStyle(value: Partial[Compact]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
  
  trait TableInstanceOptions
    extends StObject
       with TableOptions {
    
    var chars: RecordCharNamestring
    
    var style: Compact
  }
  object TableInstanceOptions {
    
    inline def apply(
      chars: RecordCharNamestring,
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[Cell],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      style: Compact,
      truncate: String,
      wordWrap: Boolean
    ): TableInstanceOptions = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableInstanceOptions]
    }
    
    extension [Self <: TableInstanceOptions](x: Self) {
      
      inline def setChars(value: RecordCharNamestring): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Compact): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableOptions extends StObject {
    
    var colAligns: js.Array[HorizontalAlignment]
    
    var colWidths: js.Array[Double | Null]
    
    var head: js.Array[Cell]
    
    var rowAligns: js.Array[VerticalAlignment]
    
    var rowHeights: js.Array[Double | Null]
    
    var truncate: String
    
    var wordWrap: Boolean
  }
  object TableOptions {
    
    inline def apply(
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[Cell],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      truncate: String,
      wordWrap: Boolean
    ): TableOptions = {
      val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    extension [Self <: TableOptions](x: Self) {
      
      inline def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      inline def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value*))
      
      inline def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setHead(value: js.Array[Cell]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: Cell*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      inline def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value*))
      
      inline def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cliTable2.cliTable2Strings.top
    - typingsJapgolly.cliTable2.cliTable2Strings.center
    - typingsJapgolly.cliTable2.cliTable2Strings.bottom
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    inline def bottom: typingsJapgolly.cliTable2.cliTable2Strings.bottom = "bottom".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.bottom]
    
    inline def center: typingsJapgolly.cliTable2.cliTable2Strings.center = "center".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.center]
    
    inline def top: typingsJapgolly.cliTable2.cliTable2Strings.top = "top".asInstanceOf[typingsJapgolly.cliTable2.cliTable2Strings.top]
  }
  
  type VerticalTable = GenericTable[VerticalTableRow]
  
  type VerticalTableRow = StringDictionary[Cell]
  
  type _To = js.Object & CliTable2
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CliTable2 = ^
}
