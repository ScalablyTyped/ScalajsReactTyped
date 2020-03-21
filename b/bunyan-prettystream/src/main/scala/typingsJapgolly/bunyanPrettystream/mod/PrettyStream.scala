package typingsJapgolly.bunyanPrettystream.mod

import typingsJapgolly.bunyanPrettystream.AnonEnd
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyStream extends Writable {
  def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}

