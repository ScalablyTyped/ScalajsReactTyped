package typingsJapgolly.teenyRequest.mod

import typingsJapgolly.node.httpsMod.Agent
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.teenyRequest.teenyRequestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Transform {
  var agent: Agent | `false` = js.native
  var headers: Headers = js.native
  var href: js.UndefOr[String] = js.native
}

