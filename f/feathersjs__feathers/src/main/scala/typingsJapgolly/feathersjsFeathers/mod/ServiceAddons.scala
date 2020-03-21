package typingsJapgolly.feathersjsFeathers.mod

import typingsJapgolly.feathersjsFeathers.PartialHooksObject
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAddons[T] extends EventEmitter {
  def hooks(hooks: PartialHooksObject): this.type = js.native
}

