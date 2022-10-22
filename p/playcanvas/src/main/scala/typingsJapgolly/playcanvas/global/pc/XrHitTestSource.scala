package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR hit test source, which provides access to hit results of real world geometry from
  * AR session.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrHitTestSource")
@js.native
open class XrHitTestSource protected ()
  extends typingsJapgolly.playcanvas.mod.XrHitTestSource {
  /**
    * Create a new XrHitTestSource instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @param {*} xrHitTestSource - XRHitTestSource object that is created by WebXR API.
    * @param {boolean} transient - True if XRHitTestSource created for input source profile.
    * @hideconstructor
    */
  def this(manager: typingsJapgolly.playcanvas.mod.XrManager, xrHitTestSource: Any, transient: Boolean) = this()
}
