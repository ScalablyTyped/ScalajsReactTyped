package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Provides access to input sources for WebXR.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrInput")
@js.native
open class XrInput protected ()
  extends typingsJapgolly.playcanvas.mod.XrInput {
  /**
    * Create a new XrInput instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typingsJapgolly.playcanvas.mod.XrManager) = this()
}
