package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcTable.libFooterCellMod.SummaryCellProps
import typingsJapgolly.rcTable.libFooterRowMod.FooterRowProps
import typingsJapgolly.rcTable.libFooterSummaryMod.SummaryProps
import typingsJapgolly.rcTable.libInterfaceMod.DefaultRecordType
import typingsJapgolly.rcTable.libSugarColumnGroupMod.ColumnGroupProps
import typingsJapgolly.rcTable.libSugarColumnMod.ColumnProps
import typingsJapgolly.rcTable.libTableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply[RecordType /* <: DefaultRecordType */](): SharedBuilder_TableProps_2076786734[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TableProps_2076786734[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  
  object Column {
    
    inline def apply[RecordType](): SharedBuilder_ColumnProps202403286[RecordType] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_ColumnProps202403286[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
    }
    
    @JSImport("rc-table/lib/Table", "default.Column")
    @js.native
    val component: js.Object = js.native
    
    implicit def make[RecordType](companion: Column.type): SharedBuilder_ColumnProps202403286[RecordType] = new SharedBuilder_ColumnProps202403286[RecordType](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[RecordType](p: ColumnProps[RecordType]): SharedBuilder_ColumnProps202403286[RecordType] = new SharedBuilder_ColumnProps202403286[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ColumnGroup {
    
    inline def apply[RecordType](children: Element | js.Array[Element]): SharedBuilder_ColumnGroupProps_1147588062[RecordType] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new SharedBuilder_ColumnGroupProps_1147588062[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
    }
    
    @JSImport("rc-table/lib/Table", "default.ColumnGroup")
    @js.native
    val component: js.Object = js.native
    
    def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps_1147588062[RecordType] = new SharedBuilder_ColumnGroupProps_1147588062[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Summary {
    
    object Cell {
      
      inline def apply(index: Double): SharedBuilder_SummaryCellProps_81412118 = {
        val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
        new SharedBuilder_SummaryCellProps_81412118(js.Array(this.component, __props.asInstanceOf[SummaryCellProps]))
      }
      
      @JSImport("rc-table/lib/Table", "default.Summary.Cell")
      @js.native
      val component: js.Object = js.native
      
      def withProps(p: SummaryCellProps): SharedBuilder_SummaryCellProps_81412118 = new SharedBuilder_SummaryCellProps_81412118(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    object Row {
      
      @JSImport("rc-table/lib/Table", "default.Summary.Row")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1997898985 = new SharedBuilder_FooterRowProps_1997898985(js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: FooterRowProps): SharedBuilder_FooterRowProps_1997898985 = new SharedBuilder_FooterRowProps_1997898985(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("rc-table/lib/Table", "default.Summary")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Summary.type): SharedBuilder_SummaryProps458023166 = new SharedBuilder_SummaryProps458023166(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SummaryProps): SharedBuilder_SummaryProps458023166 = new SharedBuilder_SummaryProps458023166(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-table/lib/Table", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[RecordType /* <: DefaultRecordType */](companion: Table.type): SharedBuilder_TableProps_2076786734[RecordType] = new SharedBuilder_TableProps_2076786734[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType /* <: DefaultRecordType */](p: TableProps[RecordType]): SharedBuilder_TableProps_2076786734[RecordType] = new SharedBuilder_TableProps_2076786734[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
