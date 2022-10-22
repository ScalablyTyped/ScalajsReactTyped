package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.anon.CurrentTarget
import typingsJapgolly.rcTable.libFixedHolderMod.FixedHeaderProps
import typingsJapgolly.rcTable.libHeaderHeaderMod.HeaderProps
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnsType
import typingsJapgolly.rcTable.libInterfaceMod.StickyOffsets
import typingsJapgolly.rcTable.rcTableStrings.ltr
import typingsJapgolly.rcTable.rcTableStrings.rtl
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FixedHolder {
  
  inline def apply(
    children: HeaderProps[Any] => Node,
    className: String,
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[Any],
    direction: ltr | rtl,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[Any]],
    maxContentScroll: Boolean,
    noData: Boolean,
    onHeaderRow: (js.Array[ColumnType[Any]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
    onScroll: CurrentTarget => Callback,
    stickyOffsets: StickyOffsets
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), className = className.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], maxContentScroll = maxContentScroll.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1((t0: CurrentTarget) => onScroll(t0).runNow()), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-table/lib/FixedHolder", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def stickyBottomOffset(value: Double): this.type = set("stickyBottomOffset", value.asInstanceOf[js.Any])
    
    inline def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    
    inline def stickyTopOffset(value: Double): this.type = set("stickyTopOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
