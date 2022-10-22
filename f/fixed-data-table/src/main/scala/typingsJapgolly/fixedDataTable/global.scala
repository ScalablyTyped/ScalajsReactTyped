package typingsJapgolly.fixedDataTable

import typingsJapgolly.fixedDataTable.mod.CellProps
import typingsJapgolly.fixedDataTable.mod.ColumnGroupProps
import typingsJapgolly.fixedDataTable.mod.ColumnProps
import typingsJapgolly.fixedDataTable.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FixedDataTable {
    
    @JSGlobal("FixedDataTable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FixedDataTable.Cell")
    @js.native
    open class Cell protected ()
      extends typingsJapgolly.fixedDataTable.mod.Cell {
      def this(props: CellProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: CellProps, context: Any) = this()
    }
    
    @JSGlobal("FixedDataTable.Column")
    @js.native
    open class Column protected ()
      extends typingsJapgolly.fixedDataTable.mod.Column {
      def this(props: ColumnProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ColumnProps, context: Any) = this()
    }
    
    @JSGlobal("FixedDataTable.ColumnGroup")
    @js.native
    open class ColumnGroup protected ()
      extends typingsJapgolly.fixedDataTable.mod.ColumnGroup {
      def this(props: ColumnGroupProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ColumnGroupProps, context: Any) = this()
    }
    
    @JSGlobal("FixedDataTable.Table")
    @js.native
    open class Table protected ()
      extends typingsJapgolly.fixedDataTable.mod.Table {
      def this(props: TableProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TableProps, context: Any) = this()
    }
    
    @JSGlobal("FixedDataTable.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
