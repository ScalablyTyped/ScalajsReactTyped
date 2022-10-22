package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TonemapPostProcess")
@js.native
open class TonemapPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesIndexMod.TonemapPostProcess {
  /**
    * Creates a new TonemapPostProcess
    * @param name defines the name of the postprocess
    * @param _operator defines the operator to use
    * @param exposureAdjustment defines the required exposure adjustment
    * @param camera defines the camera to use (can be null)
    * @param samplingMode defines the required sampling mode (BABYLON.Texture.BILINEAR_SAMPLINGMODE by default)
    * @param engine defines the hosting engine (can be ignore if camera is set)
    * @param textureFormat defines the texture format to use (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
}
