package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableInterfaceMod {
  type ColumnTitle[RecordType] = japgolly.scalajs.react.raw.React.Node | (js.Function1[
    /* props */ typingsJapgolly.antd.tableInterfaceMod.ColumnTitleProps[RecordType], 
    japgolly.scalajs.react.raw.React.Node
  ])
  type ColumnsType[RecordType] = js.Array[
    typingsJapgolly.antd.tableInterfaceMod.ColumnGroupType[RecordType] | typingsJapgolly.antd.tableInterfaceMod.ColumnType[RecordType]
  ]
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[typingsJapgolly.antd.tableInterfaceMod.SortOrder], 
    scala.Double
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsJapgolly.antd.antdStrings.row
    - typingsJapgolly.antd.antdStrings.nest
  */
  type ExpandType = typingsJapgolly.antd.tableInterfaceMod._ExpandType | scala.Null
  type GetPopupContainer = js.Function1[/* triggerNode */ org.scalajs.dom.raw.HTMLElement, org.scalajs.dom.raw.HTMLElement]
  type Key = typingsJapgolly.react.mod.Key
  type SelectionItemSelectFn = js.Function1[
    /* currentRowKeys */ js.Array[typingsJapgolly.antd.tableInterfaceMod.Key], 
    scala.Unit
  ]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ typingsJapgolly.std.Event_, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.descend
    - typingsJapgolly.antd.antdStrings.ascend
    - scala.Null
  */
  type SortOrder = typingsJapgolly.antd.tableInterfaceMod._SortOrder | scala.Null
  type TransformColumns[RecordType] = js.Function1[
    /* columns */ typingsJapgolly.antd.tableInterfaceMod.ColumnsType[RecordType], 
    typingsJapgolly.antd.tableInterfaceMod.ColumnsType[RecordType]
  ]
}
