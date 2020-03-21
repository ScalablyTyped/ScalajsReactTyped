package typingsJapgolly.workboxStreams

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/types/StreamSource", JSImport.Namespace)
@js.native
object streamSourceMod extends js.Object {
  type StreamSource = Response | BodyInit | ReadableStream[js.Any]
}

