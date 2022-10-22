package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcTreeSelect.esInterfaceMod.ChangeEventExtra
import typingsJapgolly.rcTreeSelect.esInterfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.esInterfaceMod.RawValueType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsLegacyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertChildrenToData(nodes: Node): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  inline def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[DefaultOptionType],
    showPosition: Boolean,
    fieldNames: FieldNames
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillAdditionalInfo")(extra.asInstanceOf[js.Any], triggerValue.asInstanceOf[js.Any], checkedValues.asInstanceOf[js.Any], treeData.asInstanceOf[js.Any], showPosition.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fillLegacyProps(dataNode: DataNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fillLegacyProps")(dataNode.asInstanceOf[js.Any]).asInstanceOf[Any]
}
