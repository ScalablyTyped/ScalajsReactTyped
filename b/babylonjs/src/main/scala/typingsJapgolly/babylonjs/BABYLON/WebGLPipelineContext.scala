package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLShader
import typingsJapgolly.babylonjs.WebGLProgram
import typingsJapgolly.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLPipelineContext
  extends StObject
     with IPipelineContext {
  
  /**
    * @internal
    */
  def _cacheFloat2(uniformName: String, x: Double, y: Double): Boolean = js.native
  
  /**
    * @internal
    */
  def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Boolean = js.native
  
  /**
    * @internal
    */
  def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
  
  /**
    * @internal
    */
  def _cacheFloatN(_uniformName: String, _x: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Double, _z: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Double, _z: Double, _w: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Double, _z: Unit, _w: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Unit, _z: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Unit, _z: Double, _w: Double): Boolean = js.native
  def _cacheFloatN(_uniformName: String, _x: Double, _y: Unit, _z: Unit, _w: Double): Boolean = js.native
  
  /**
    * @internal
    */
  def _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean = js.native
  
  /* private */ var _uniforms: Any = js.native
  
  /* private */ var _valueCache: Any = js.native
  
  var context: js.UndefOr[WebGLRenderingContext] = js.native
  
  var engine: ThinEngine = js.native
  
  var fragmentCompilationError: Nullable[String] = js.native
  
  var fragmentShader: js.UndefOr[WebGLShader] = js.native
  
  @JSName("isAsync")
  def isAsync_MWebGLPipelineContext: Boolean = js.native
  
  var isParallelCompiled: Boolean = js.native
  
  @JSName("isReady")
  def isReady_MWebGLPipelineContext: Boolean = js.native
  
  var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
  
  var program: Nullable[WebGLProgram] = js.native
  
  var programLinkError: Nullable[String] = js.native
  
  var programValidationError: Nullable[String] = js.native
  
  var transformFeedback: js.UndefOr[WebGLTransformFeedback | Null] = js.native
  
  var vertexCompilationError: Nullable[String] = js.native
  
  var vertexShader: js.UndefOr[WebGLShader] = js.native
}
