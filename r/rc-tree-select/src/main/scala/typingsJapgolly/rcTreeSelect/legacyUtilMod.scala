package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcTreeSelect.interfaceMod.ChangeEventExtra
import typingsJapgolly.rcTreeSelect.interfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.InnerDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.LegacyDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/utils/legacyUtil", JSImport.Namespace)
@js.native
object legacyUtilMod extends js.Object {
  def convertChildrenToData(nodes: Node): js.Array[DataNode] = js.native
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[InnerDataNode],
    showPosition: Boolean
  ): Unit = js.native
  def fillLegacyProps(dataNode: DataNode): LegacyDataNode = js.native
}

