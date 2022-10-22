package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TonemapPostProcess")
@js.native
open class TonemapPostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.TonemapPostProcess {
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
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Double,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    _operator: typingsJapgolly.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustment */
  exposureAdjustment: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    textureFormat: Unit,
    reusable: Boolean
  ) = this()
}
