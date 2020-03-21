package typingsJapgolly.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ComponentSystem
  * @augments pc.EventHandler
  * @classdesc Component Systems contain the logic and functionality to update all Components of a particular type.
  * @param {pc.Application} app - The application managing this system.
  */
@JSGlobal("pc.ComponentSystem")
@js.native
class ComponentSystem protected () extends EventHandler {
  def this(app: Application) = this()
}

