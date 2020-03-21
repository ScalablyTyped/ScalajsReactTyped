package typingsJapgolly.vinylPaths.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths
  extends ReadableStream
     with WritableStream {
  var paths: js.Array[String] = js.native
}

