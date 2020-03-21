package typingsJapgolly.listStream.mod

import typingsJapgolly.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStream extends Duplex {
  var length: Double = js.native
  def append(chunk: js.Any): Unit = js.native
  def duplicate(): ListStream = js.native
  def get(index: Double): js.Any = js.native
}

