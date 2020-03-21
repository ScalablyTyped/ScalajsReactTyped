package typingsJapgolly.cassandraDriver.policiesMod.policies.timestampGeneration

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.mod.Client
import typingsJapgolly.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampGenerator extends js.Object {
  def next(client: Client): Long | Double
}

object TimestampGenerator {
  @scala.inline
  def apply(next: Client => CallbackTo[Long | Double]): TimestampGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.Client) => next(t0).runNow()))
    __obj.asInstanceOf[TimestampGenerator]
  }
}

