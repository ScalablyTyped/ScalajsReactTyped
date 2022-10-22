package typingsJapgolly.rcTable

import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSugarColumnMod {
  
  @JSImport("rc-table/lib/sugar/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  inline def default[RecordType](_underscore: ColumnProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ColumnProps[RecordType]
    extends StObject
       with ColumnType[RecordType] {
    
    var children: js.UndefOr[Null] = js.undefined
  }
  object ColumnProps {
    
    inline def apply[RecordType](): ColumnProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps[RecordType]]
    }
  }
}
