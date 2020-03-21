package typingsJapgolly.gulpFilter.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A transform stream with a .restore object
@js.native
trait Filter
  extends ReadableStream
     with WritableStream {
  var restore: ReadWriteStream = js.native
}

