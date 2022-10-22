package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "StereoscopicInterlacePostProcessI")
@js.native
open class StereoscopicInterlacePostProcessI protected ()
  extends typingsJapgolly.babylonjs.indexMod.StereoscopicInterlacePostProcessI {
  /**
    * Initializes a StereoscopicInterlacePostProcessI
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be applied to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or vertical
    * @param isStereoscopicInterlaced If the rendered results are alternate line interlaced
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
}
