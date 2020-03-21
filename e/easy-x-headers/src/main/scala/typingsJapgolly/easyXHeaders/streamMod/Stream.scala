package typingsJapgolly.easyXHeaders.streamMod

import typingsJapgolly.easyXHeaders.AnonEnd
import typingsJapgolly.easyXHeaders.NodeJS.WritableStream
import typingsJapgolly.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}

