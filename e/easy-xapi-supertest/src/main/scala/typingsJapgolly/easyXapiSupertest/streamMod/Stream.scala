package typingsJapgolly.easyXapiSupertest.streamMod

import typingsJapgolly.easyXapiSupertest.AnonEnd
import typingsJapgolly.easyXapiSupertest.NodeJS.WritableStream
import typingsJapgolly.easyXapiSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}

