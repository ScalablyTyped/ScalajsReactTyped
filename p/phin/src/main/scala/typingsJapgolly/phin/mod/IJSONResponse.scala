package typingsJapgolly.phin.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJSONResponse[T] extends IncomingMessage {
  var body: T = js.native
}

