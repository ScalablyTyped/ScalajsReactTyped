package typingsJapgolly.consul.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends IncomingMessage {
  var body: js.UndefOr[js.Object | String | Buffer] = js.native
}

