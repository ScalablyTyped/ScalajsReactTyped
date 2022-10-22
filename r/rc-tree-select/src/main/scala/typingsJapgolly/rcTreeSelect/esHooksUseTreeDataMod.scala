package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcTreeSelect.esInterfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.esInterfaceMod.SimpleModeConfig
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseTreeDataMod {
  
  @JSImport("rc-tree-select/es/hooks/useTreeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(treeData: js.Array[DataNode], children: Node, simpleMode: Boolean): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  inline def default(treeData: js.Array[DataNode], children: Node, simpleMode: SimpleModeConfig): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
}
