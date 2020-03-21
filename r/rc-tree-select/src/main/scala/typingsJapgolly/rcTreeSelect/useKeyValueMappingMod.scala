package typingsJapgolly.rcTreeSelect

import typingsJapgolly.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.Key
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/hooks/useKeyValueMapping", JSImport.Namespace)
@js.native
object useKeyValueMappingMod extends js.Object {
  trait _SkipType extends js.Object
  
  def default(cacheKeyMap: Map[Key, FlattenDataNode], cacheValueMap: Map[RawValueType, FlattenDataNode]): js.Tuple2[
    js.Function2[/* key */ Key, /* skipType */ js.UndefOr[SkipType], FlattenDataNode], 
    js.Function2[/* value */ RawValueType, /* skipType */ js.UndefOr[SkipType], FlattenDataNode]
  ] = js.native
  def isDisabled(dataNode: FlattenDataNode, skipType: SkipType): Boolean = js.native
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.select
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.checkbox
  */
  type SkipType = _SkipType | Null
}

