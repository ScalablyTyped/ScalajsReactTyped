package typingsJapgolly.antd.useSorterMod

import typingsJapgolly.antd.tableInterfaceMod.ColumnTitleProps
import typingsJapgolly.antd.tableInterfaceMod.SorterResult
import typingsJapgolly.antd.tableInterfaceMod.TransformColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useSorter", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](hasPrefixClsColumnsOnSorterChangeSortDirections: SorterConfig[RecordType]): js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ] = js.native
}

