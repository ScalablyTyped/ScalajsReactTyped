package typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Values. */
trait IValues extends js.Object {
  /** Values value */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IValues {
  @scala.inline
  def apply(value: js.Array[String] = null): IValues = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValues]
  }
}

