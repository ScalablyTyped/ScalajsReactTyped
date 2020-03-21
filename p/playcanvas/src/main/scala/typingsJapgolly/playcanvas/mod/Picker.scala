package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Picker
  * @classdesc Picker object used to select mesh instances from screen coordinates.
  * @description Create a new instance of a Picker object.
  * @param {pc.Application} app - The application managing this picker instance.
  * @param {number} width - The width of the pick buffer in pixels.
  * @param {number} height - The height of the pick buffer in pixels.
  * @property {number} width Width of the pick buffer in pixels (read-only).
  * @property {number} height Height of the pick buffer in pixels (read-only).
  * @property {pc.RenderTarget} renderTarget The render target used by the picker internally (read-only).
  */
@JSImport("playcanvas", "Picker")
@js.native
class Picker protected ()
  extends typingsJapgolly.playcanvas.pc.Picker {
  def this(app: typingsJapgolly.playcanvas.pc.Application, width: Double, height: Double) = this()
}

