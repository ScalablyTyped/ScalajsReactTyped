package typingsJapgolly.rcTreeSelect.strategyUtilMod

import typingsJapgolly.rcTreeSelect.interfaceMod.Key
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/utils/strategyUtil", "formatStrategyKeys")
@js.native
object formatStrategyKeys extends js.Object {
  def apply(
    keys: js.Array[Key],
    strategy: CheckedStrategy,
    keyEntities: Record[
      Key, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataEntity */ _
    ]
  ): js.Array[RawValueType] = js.native
}

