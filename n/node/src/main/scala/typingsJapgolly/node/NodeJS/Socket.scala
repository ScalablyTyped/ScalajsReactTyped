package typingsJapgolly.node.NodeJS

import typingsJapgolly.node.nodeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends ReadableStream
     with WritableStream {
  var isTTY: js.UndefOr[`true`] = js.native
}

