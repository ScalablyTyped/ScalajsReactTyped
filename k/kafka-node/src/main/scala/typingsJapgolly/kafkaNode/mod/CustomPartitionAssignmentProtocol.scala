package typingsJapgolly.kafkaNode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPartitionAssignmentProtocol extends js.Object {
  var name: String
  var version: Double
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit
}

object CustomPartitionAssignmentProtocol {
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Callback,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("assign")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]) => assign(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
}

