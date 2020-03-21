package typingsJapgolly.gulpSize.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStream
  extends ReadableStream
     with WritableStream {
  var prettySize: String = js.native
  var size: Double = js.native
}

