package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tree/util", JSImport.Namespace)
@js.native
object libTreeUtilMod extends js.Object {
  def calcRangeKeys(rootChildren: js.Array[ReactNode], expandedKeys: js.Array[String]): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: js.Array[ReactNode], expandedKeys: js.Array[String], startKey: String): js.Array[String] = js.native
  def calcRangeKeys(
    rootChildren: js.Array[ReactNode],
    expandedKeys: js.Array[String],
    startKey: String,
    endKey: String
  ): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String]): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String], startKey: String): js.Array[String] = js.native
  def calcRangeKeys(rootChildren: ReactNode, expandedKeys: js.Array[String], startKey: String, endKey: String): js.Array[String] = js.native
  def convertDirectoryKeysToNodes(rootChildren: js.Array[ReactNode], keys: js.Array[String]): js.Array[Component[AntTreeNodeProps with js.Object, js.Object]] = js.native
  def convertDirectoryKeysToNodes(rootChildren: ReactNode, keys: js.Array[String]): js.Array[Component[AntTreeNodeProps with js.Object, js.Object]] = js.native
  def getFullKeyList(children: js.Array[ReactNode]): js.Array[String] = js.native
  def getFullKeyList(children: ReactNode): js.Array[String] = js.native
  def getFullKeyListByTreeData(treeData: js.Array[_]): js.Array[_] = js.native
}

