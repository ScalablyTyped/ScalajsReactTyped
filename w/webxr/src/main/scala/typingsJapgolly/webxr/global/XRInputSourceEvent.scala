package typingsJapgolly.webxr.global

import typingsJapgolly.webxr.XRInputSourceEventInit
import typingsJapgolly.webxr.XRInputSourceEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRInputSourceEvents are fired to indicate changes to the state of an XRInputSource.
  * ref: https://immersive-web.github.io/webxr/#xrinputsourceevent-interface
  */
@JSGlobal("XRInputSourceEvent")
@js.native
open class XRInputSourceEvent protected ()
  extends StObject
     with typingsJapgolly.webxr.XRInputSourceEvent {
  def this(`type`: XRInputSourceEventType) = this()
  def this(`type`: XRInputSourceEventType, eventInitDict: XRInputSourceEventInit) = this()
}
