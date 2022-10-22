package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Picker object used to select mesh instances from screen coordinates.
  *
  * @property {number} width Width of the pick buffer in pixels (read-only).
  * @property {number} height Height of the pick buffer in pixels (read-only).
  * @property {RenderTarget} renderTarget The render target used by the picker internally
  * (read-only).
  */
@JSGlobal("pc.Picker")
@js.native
open class Picker protected ()
  extends typingsJapgolly.playcanvas.mod.Picker {
  /**
    * Create a new Picker instance.
    *
    * @param {AppBase} app - The application managing this picker instance.
    * @param {number} width - The width of the pick buffer in pixels.
    * @param {number} height - The height of the pick buffer in pixels.
    */
  def this(app: AppBase, width: Double, height: Double) = this()
}
