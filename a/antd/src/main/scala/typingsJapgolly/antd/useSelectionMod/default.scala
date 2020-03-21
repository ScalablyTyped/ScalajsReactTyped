package typingsJapgolly.antd.useSelectionMod

import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.antd.tableInterfaceMod.TableRowSelection
import typingsJapgolly.antd.tableInterfaceMod.TransformColumns
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useSelection", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](rowSelection: js.UndefOr[scala.Nothing], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
  def apply[RecordType](rowSelection: TableRowSelection[RecordType], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
}

