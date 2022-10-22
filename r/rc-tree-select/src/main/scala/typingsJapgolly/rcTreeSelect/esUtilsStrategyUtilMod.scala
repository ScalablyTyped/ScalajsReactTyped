package typingsJapgolly.rcTreeSelect

import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.esInterfaceMod.RawValueType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.InternalFieldName
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsStrategyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  inline def formatStrategyValues(
    values: js.Array[Key],
    strategy: CheckedStrategy,
    keyEntities: Record[typingsJapgolly.rcTreeSelect.esInterfaceMod.Key, DataEntity[DataNode]],
    fieldNames: InternalFieldName
  ): js.Array[RawValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStrategyValues")(values.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[RawValueType]]
  
  type CheckedStrategy = /* "SHOW_ALL" */ String
}
