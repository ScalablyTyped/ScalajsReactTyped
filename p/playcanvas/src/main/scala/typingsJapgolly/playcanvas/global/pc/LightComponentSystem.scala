package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../app-base.js').AppBase} AppBase */
/**
  * A Light Component is used to dynamically light the scene.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.LightComponentSystem")
@js.native
open class LightComponentSystem protected ()
  extends typingsJapgolly.playcanvas.mod.LightComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}
