package typingsJapgolly.webxr.global

import org.scalajs.dom.EventTarget
import typingsJapgolly.std.DOMPointReadOnly
import typingsJapgolly.webxr.XRPlaneOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("XRPlane")
@js.native
open class XRPlane ()
  extends StObject
     with typingsJapgolly.webxr.XRPlane {
  
  /* CompleteClass */
  var lastChangedTime: Double = js.native
  
  /* CompleteClass */
  var orientation: XRPlaneOrientation = js.native
  
  /* CompleteClass */
  var planeSpace: EventTarget = js.native
  
  /* CompleteClass */
  var polygon: js.Array[DOMPointReadOnly] = js.native
}
