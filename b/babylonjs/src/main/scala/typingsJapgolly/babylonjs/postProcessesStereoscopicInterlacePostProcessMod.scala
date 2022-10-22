package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesStereoscopicInterlacePostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/stereoscopicInterlacePostProcess", "StereoscopicInterlacePostProcess")
  @js.native
  open class StereoscopicInterlacePostProcess protected () extends PostProcess {
    /**
      * Initializes a StereoscopicInterlacePostProcess
      * @param name The name of the effect.
      * @param rigCameras The rig cameras to be applied to the post process
      * @param isStereoscopicHoriz If the rendered results are horizontal or vertical
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      */
    def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean) = this()
    def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean, samplingMode: Double) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _passedProcess: Any = js.native
    
    /* private */ var _stepSize: Any = js.native
  }
  
  @JSImport("babylonjs/PostProcesses/stereoscopicInterlacePostProcess", "StereoscopicInterlacePostProcessI")
  @js.native
  open class StereoscopicInterlacePostProcessI protected () extends PostProcess {
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
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _passedProcess: Any = js.native
    
    /* private */ var _stepSize: Any = js.native
  }
}
