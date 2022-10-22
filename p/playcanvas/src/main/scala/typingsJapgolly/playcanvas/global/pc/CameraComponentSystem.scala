package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to add and remove {@link CameraComponent}s from Entities. It also holds an array of all
  * active cameras.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.CameraComponentSystem")
@js.native
open class CameraComponentSystem protected ()
  extends typingsJapgolly.playcanvas.mod.CameraComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}
