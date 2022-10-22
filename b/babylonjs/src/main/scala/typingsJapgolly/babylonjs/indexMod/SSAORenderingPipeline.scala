package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SSAORenderingPipeline")
@js.native
open class SSAORenderingPipeline protected ()
  extends typingsJapgolly.babylonjs.postProcessesIndexMod.SSAORenderingPipeline {
  /**
    * @constructor
    * @param name - The rendering pipeline name
    * @param scene - The scene linked to this pipeline
    * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
    * @param cameras - The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene, ratio: Any) = this()
  def this(
    name: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    ratio: Any,
    cameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera]
  ) = this()
}
