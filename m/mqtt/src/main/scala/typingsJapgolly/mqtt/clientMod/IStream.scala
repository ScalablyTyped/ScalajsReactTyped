package typingsJapgolly.mqtt.clientMod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStream extends EventEmitter {
  def destroy(): js.Any = js.native
  def end(): js.Any = js.native
  def pipe(to: js.Any): js.Any = js.native
}

