package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcTreeSelect.interfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.Key
import typingsJapgolly.rcTreeSelect.interfaceMod.LabelValueType
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import typingsJapgolly.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typingsJapgolly.rcTreeSelect.useKeyValueMappingMod.SkipType
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/hooks/useSelectValues", JSImport.Namespace)
@js.native
object useSelectValuesMod extends js.Object {
  @js.native
  trait Config extends js.Object {
    var conductKeyEntities: Record[
        Key, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataEntity */ _
      ] = js.native
    var showCheckedStrategy: CheckedStrategy = js.native
    var treeConduction: Boolean = js.native
    /** Current `value` of TreeSelect */
    var value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultValueType */ js.Any = js.native
    def getEntityByKey(key: Key): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType): FlattenDataNode = js.native
    def getLabelProp(node: DataNode): Node = js.native
  }
  
  def default(
    rawValues: js.Array[RawValueType],
    hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp: Config
  ): js.Array[LabelValueType] = js.native
}

