package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.babylonjs.XRReferenceSpaceType
import typingsJapgolly.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXREnterExitUIButton")
@js.native
open class WebXREnterExitUIButton protected ()
  extends typingsJapgolly.babylonjs.indexMod.WebXREnterExitUIButton {
  /**
    * Creates a WebXREnterExitUIButton
    * @param element button element
    * @param sessionMode XR initialization session mode
    * @param referenceSpaceType the type of reference space to be used
    */
  def this(
    /** button element */
  element: HTMLElement,
    /** XR initialization options for the button */
  sessionMode: XRSessionMode,
    /** Reference space type */
  referenceSpaceType: XRReferenceSpaceType
  ) = this()
}
