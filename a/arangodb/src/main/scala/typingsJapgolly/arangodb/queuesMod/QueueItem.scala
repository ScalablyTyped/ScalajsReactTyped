package typingsJapgolly.arangodb.queuesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arangodb.Foxx.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.undefined
  var maxFailures: js.UndefOr[Double] = js.undefined
  var mount: String
  var name: String
  var preprocess: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
}

object QueueItem {
  @scala.inline
  def apply(
    mount: String,
    name: String,
    backOff: (js.Function1[/* failureCount */ Double, Double]) | Double = null,
    maxFailures: Int | Double = null,
    preprocess: /* data */ js.Any => CallbackTo[js.Any] = null,
    schema: Schema = null
  ): QueueItem = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (backOff != null) __obj.updateDynamic("backOff")(backOff.asInstanceOf[js.Any])
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1((t0: /* data */ js.Any) => preprocess(t0).runNow()))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
}

