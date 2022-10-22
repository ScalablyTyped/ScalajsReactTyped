package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows scripts to be attached to an Entity and executed.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.ScriptComponentSystem")
@js.native
open class ScriptComponentSystem protected ()
  extends typingsJapgolly.playcanvas.mod.ScriptComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}
