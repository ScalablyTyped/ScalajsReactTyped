package typingsJapgolly.antd

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antd.libTableCreateStoreMod.Store
import typingsJapgolly.antd.libTableInterfaceMod.CheckboxPropsCache
import typingsJapgolly.antd.libTableInterfaceMod.TableProps
import typingsJapgolly.antd.libTableTableMod.StoreTable
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Namespace)
@js.native
object libTableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[OmitTablePropsTkeyofWithStoreBodyStyle[T], js.Object, js.Any] {
    var CheckboxPropsCache: typingsJapgolly.antd.libTableInterfaceMod.CheckboxPropsCache = js.native
    var store: Store = js.native
    def setCheckboxPropsCache(cache: CheckboxPropsCache): CheckboxPropsCache = js.native
  }
  
  @js.native
  class default[T] protected () extends StoreTable[T] {
    def this(props: TableProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Column: Instantiable0[typingsJapgolly.antd.libTableColumnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroupANTTABLECOLUMNGROUP = js.native
    var displayName: String = js.native
  }
  
}

