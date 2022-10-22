package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StereoscopicInterlacePostProcess")
@js.native
open class StereoscopicInterlacePostProcess protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.StereoscopicInterlacePostProcess {
  /**
    * Initializes a StereoscopicInterlacePostProcess
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be applied to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or vertical
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
}
