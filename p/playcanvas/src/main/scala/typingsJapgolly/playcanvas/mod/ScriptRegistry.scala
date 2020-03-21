package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScriptRegistry
  * @augments pc.EventHandler
  * @classdesc Container for all Script Types that are available to this application.
  * @description Create an instance of a pc.ScriptRegistry.
  * Note: PlayCanvas scripts can access the Script Registry from inside the application with {@link pc.Application#scripts} {@link pc.ADDRESS_REPEAT}.
  * @param {pc.Application} app - Application to attach registry to.
  */
@JSImport("playcanvas", "ScriptRegistry")
@js.native
class ScriptRegistry protected ()
  extends typingsJapgolly.playcanvas.pc.ScriptRegistry {
  def this(app: typingsJapgolly.playcanvas.pc.Application) = this()
}

