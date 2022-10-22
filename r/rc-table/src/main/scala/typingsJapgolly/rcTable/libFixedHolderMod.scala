package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTable.anon.CurrentTarget
import typingsJapgolly.rcTable.libHeaderHeaderMod.HeaderProps
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnsType
import typingsJapgolly.rcTable.libInterfaceMod.StickyOffsets
import typingsJapgolly.rcTable.rcTableStrings.ltr
import typingsJapgolly.rcTable.rcTableStrings.rtl
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFixedHolderMod extends Shortcut {
  
  @JSImport("rc-table/lib/FixedHolder", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]] = js.native
  
  trait FixedHeaderProps[RecordType]
    extends StObject
       with HeaderProps[RecordType] {
    
    def children(info: HeaderProps[RecordType]): Node
    
    var className: String
    
    var colWidths: js.Array[Double]
    
    var columCount: Double
    
    var direction: ltr | rtl
    
    var fixHeader: Boolean
    
    var maxContentScroll: Boolean
    
    var noData: Boolean
    
    def onScroll(info: CurrentTarget): Unit
    
    var stickyBottomOffset: js.UndefOr[Double] = js.undefined
    
    var stickyClassName: js.UndefOr[String] = js.undefined
    
    var stickyTopOffset: js.UndefOr[Double] = js.undefined
  }
  object FixedHeaderProps {
    
    inline def apply[RecordType](
      children: HeaderProps[RecordType] => Node,
      className: String,
      colWidths: js.Array[Double],
      columCount: Double,
      columns: ColumnsType[RecordType],
      direction: ltr | rtl,
      fixHeader: Boolean,
      flattenColumns: js.Array[ColumnType[RecordType]],
      maxContentScroll: Boolean,
      noData: Boolean,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      onScroll: CurrentTarget => Callback,
      stickyOffsets: StickyOffsets
    ): FixedHeaderProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), className = className.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], maxContentScroll = maxContentScroll.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1((t0: CurrentTarget) => onScroll(t0).runNow()), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedHeaderProps[RecordType]]
    }
    
    extension [Self <: FixedHeaderProps[?], RecordType](x: Self & FixedHeaderProps[RecordType]) {
      
      inline def setChildren(value: HeaderProps[RecordType] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setMaxContentScroll(value: Boolean): Self = StObject.set(x, "maxContentScroll", value.asInstanceOf[js.Any])
      
      inline def setNoData(value: Boolean): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: CurrentTarget => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: CurrentTarget) => value(t0).runNow()))
      
      inline def setStickyBottomOffset(value: Double): Self = StObject.set(x, "stickyBottomOffset", value.asInstanceOf[js.Any])
      
      inline def setStickyBottomOffsetUndefined: Self = StObject.set(x, "stickyBottomOffset", js.undefined)
      
      inline def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      inline def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      inline def setStickyTopOffset(value: Double): Self = StObject.set(x, "stickyTopOffset", value.asInstanceOf[js.Any])
      
      inline def setStickyTopOffsetUndefined: Self = StObject.set(x, "stickyTopOffset", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libFixedHolderMod.foo` */
  override def _to: ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]] = default
}
