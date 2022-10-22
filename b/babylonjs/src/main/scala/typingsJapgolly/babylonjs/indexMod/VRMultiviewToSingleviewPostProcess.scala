package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "VRMultiviewToSingleviewPostProcess")
@js.native
open class VRMultiviewToSingleviewPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesIndexMod.VRMultiviewToSingleviewPostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(
    name: String,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    scaleFactor: Double
  ) = this()
}
