package typingsJapgolly.antd.useSelectionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antd.tableInterfaceMod.ExpandType
import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectionConfig[RecordType] extends js.Object {
  var childrenColumnName: String
  var data: js.Array[RecordType]
  var expandType: ExpandType
  var getRowKey: GetRowKey[RecordType]
  var pageData: js.Array[RecordType]
  var prefixCls: String
  def getRecordByKey(key: Key): RecordType
}

object UseSelectionConfig {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    getRecordByKey: Key => CallbackTo[RecordType],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[typingsJapgolly.rcTable.interfaceMod.Key],
    pageData: js.Array[RecordType],
    prefixCls: String,
    expandType: ExpandType = null
  ): UseSelectionConfig[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("getRecordByKey")(js.Any.fromFunction1((t0: typingsJapgolly.antd.tableInterfaceMod.Key) => getRecordByKey(t0).runNow()))
    __obj.updateDynamic("getRowKey")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => getRowKey(t0, t1).runNow()))
    if (expandType != null) __obj.updateDynamic("expandType")(expandType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectionConfig[RecordType]]
  }
}

