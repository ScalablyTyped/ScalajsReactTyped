package typingsJapgolly.azureSb.serviceclientMod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceClient extends EventEmitter {
  var host: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
}

