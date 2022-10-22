package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an Entity to render a mesh or a primitive shape like a box, capsule, sphere, cylinder,
  * cone etc.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.RenderComponentSystem")
@js.native
open class RenderComponentSystem protected ()
  extends typingsJapgolly.playcanvas.mod.RenderComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}
