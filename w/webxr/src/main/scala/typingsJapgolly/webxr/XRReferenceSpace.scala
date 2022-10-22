package typingsJapgolly.webxr

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.webxr.webxrStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of several common XRSpaces that applications can use to establish a spatial relationship
  * with the user's physical environment.
  *
  * ref: https://immersive-web.github.io/webxr/#xrreferencespace-interface
  */
@js.native
trait XRReferenceSpace
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
  
  def onreset(event: XRReferenceSpaceEvent): Any = js.native
  @JSName("onreset")
  var onreset_Original: XRReferenceSpaceEventHandler = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRReferenceSpaceEvent, Any],
    options: Boolean
  ): Unit = js.native
}
