package typingsJapgolly.relayRuntime.connectionInterfaceMod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: unknown} */ trait EdgeRecord extends js.Object {
  var cursor: js.Any
  var node: Record[DataID, _]
}

object EdgeRecord {
  @scala.inline
  def apply(cursor: js.Any, node: Record[DataID, _]): EdgeRecord = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EdgeRecord]
  }
}

