package typingsJapgolly.rcTable

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcTable.anon.Scrollbar
import typingsJapgolly.rcTable.libFooterSummaryMod.SummaryProps
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.StickyOffsets
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterMod {
  
  @JSImport("rc-table/lib/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](hasChildrenStickyOffsetsFlattenColumns: FooterProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenStickyOffsetsFlattenColumns.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object FooterComponents {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    inline def apply(hasChildren: SummaryProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
    
    @JSImport("rc-table/lib/Footer", "FooterComponents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Cell")
    @js.native
    def Cell: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any = js.native
    inline def Cell_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Row")
    @js.native
    def Row: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any = js.native
    inline def Row_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  type FlattenColumns[RecordType] = js.Array[ColumnType[RecordType] & Scrollbar]
  
  trait FooterProps[RecordType] extends StObject {
    
    var children: Node
    
    var flattenColumns: FlattenColumns[RecordType]
    
    var stickyOffsets: StickyOffsets
  }
  object FooterProps {
    
    inline def apply[RecordType](flattenColumns: FlattenColumns[RecordType], stickyOffsets: StickyOffsets): FooterProps[RecordType] = {
      val __obj = js.Dynamic.literal(flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[FooterProps[RecordType]]
    }
    
    extension [Self <: FooterProps[?], RecordType](x: Self & FooterProps[RecordType]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFlattenColumns(value: FlattenColumns[RecordType]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: (ColumnType[RecordType] & Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
