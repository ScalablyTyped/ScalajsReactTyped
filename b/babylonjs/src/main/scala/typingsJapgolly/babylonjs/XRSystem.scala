package typingsJapgolly.babylonjs

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.babylonjs.babylonjsStrings.devicechange
import typingsJapgolly.babylonjs.babylonjsStrings.sessiongranted
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An XRSystem object is the entry point to the API, used to query for XR features available
  * to the user agent and initiate communication with XR hardware via the creation of
  * XRSessions.
  *
  * ref: https://immersive-web.github.io/webxr/#xrsystem-interface
  */
@js.native
trait XRSystem
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Queries if a given mode may be supported by the user agent and device capabilities.
    * @param mode
    */
  def isSessionSupported(mode: XRSessionMode): js.Promise[Boolean] = js.native
  
  var ondevicechange: XRSystemDeviceChangeEventHandler | Null = js.native
  
  var onsessiongranted: XRSystemSessionGrantedEventHandler | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemDeviceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessiongranted(
    `type`: sessiongranted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSystemSessionGrantedEvent, Any],
    options: Boolean
  ): Unit = js.native
  
  /**
    * Attempts to initialize an XRSession for the given mode if possible, entering immersive
    * mode if necessary.
    * @param mode
    * @param options
    */
  def requestSession(mode: XRSessionMode): js.Promise[XRSession] = js.native
  def requestSession(mode: XRSessionMode, options: XRSessionInit): js.Promise[XRSession] = js.native
}
