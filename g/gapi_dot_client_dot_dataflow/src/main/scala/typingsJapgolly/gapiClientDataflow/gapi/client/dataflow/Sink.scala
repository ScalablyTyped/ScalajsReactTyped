package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink extends js.Object {
  /** The codec to use to encode data written to the sink. */
  var codec: js.UndefOr[Record[String, _]] = js.undefined
  /** The sink to write to, plus its parameters. */
  var spec: js.UndefOr[Record[String, _]] = js.undefined
}

object Sink {
  @scala.inline
  def apply(codec: Record[String, _] = null, spec: Record[String, _] = null): Sink = {
    val __obj = js.Dynamic.literal()
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sink]
  }
}

