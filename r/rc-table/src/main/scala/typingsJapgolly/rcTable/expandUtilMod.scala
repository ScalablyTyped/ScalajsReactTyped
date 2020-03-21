package typingsJapgolly.rcTable

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
@js.native
object expandUtilMod extends js.Object {
  def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType]): js.Array[Key] = js.native
  def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): Element = js.native
}

