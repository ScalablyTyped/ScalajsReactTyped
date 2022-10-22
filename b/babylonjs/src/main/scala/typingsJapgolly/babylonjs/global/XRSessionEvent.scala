package typingsJapgolly.babylonjs.global

import typingsJapgolly.babylonjs.XRSessionEventInit
import typingsJapgolly.babylonjs.XRSessionEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRSessionEvents are fired to indicate changes to the state of an XRSession.
  * ref: https://immersive-web.github.io/webxr/#xrsessionevent-interface
  */
@JSGlobal("XRSessionEvent")
@js.native
open class XRSessionEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.XRSessionEvent {
  def this(`type`: XRSessionEventType) = this()
  def this(`type`: XRSessionEventType, eventInitDict: XRSessionEventInit) = this()
}
