package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassRenderTarget
  extends StObject
     with MultiRenderTarget {
  
  /**
    * @internal
    */
  var _beforeCompositionPostProcesses: js.Array[PostProcess] = js.native
  
  /**
    * Checks that the size of this RT is still adapted to the desired render size.
    * @internal
    */
  def _checkSize(): Unit = js.native
  
  /**
    * Creates a composition effect for this RT
    * @internal
    */
  def _createCompositionEffect(): Unit = js.native
  
  /**
    * @internal
    */
  @JSName("_engine")
  var _engine_PrePassRenderTarget: Engine = js.native
  
  /**
    * @internal
    */
  var _internalTextureDirty: Boolean = js.native
  
  /**
    * @internal
    */
  var _outputPostProcess: Nullable[PostProcess] = js.native
  
  /**
    * Resets the post processes chains applied to this RT.
    * @internal
    */
  def _resetPostProcessChain(): Unit = js.native
  
  /**
    * @internal
    */
  @JSName("_scene")
  var _scene_PrePassRenderTarget: Scene = js.native
  
  /**
    * Is this render target enabled for prepass rendering
    */
  var enabled: Boolean = js.native
  
  /**
    * Image processing post process for composition
    */
  var imageProcessingPostProcess: ImageProcessingPostProcess = js.native
  
  /**
    * Render target associated with this prePassRenderTarget
    * If this is `null`, it means this prePassRenderTarget is associated with the scene
    */
  var renderTargetTexture: Nullable[RenderTargetTexture] = js.native
}
