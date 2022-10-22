package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.XREye
import typingsJapgolly.babylonjs.XRView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRWebGLLayerRenderTargetTextureProvider")
@js.native
open class WebXRWebGLLayerRenderTargetTextureProvider protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRWebGLLayerRenderTargetTextureProvider {
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    layerWrapper: typingsJapgolly.babylonjs.BABYLON.WebXRWebGLLayerWrapper
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets the correct render target texture to be rendered this frame for this eye
    * @param eye the eye for which to get the render target
    * @returns the render target for the specified eye or null if not available
    */
  /* CompleteClass */
  override def getRenderTargetTextureForEye(eye: XREye): Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture] = js.native
  
  /**
    * Gets the correct render target texture to be rendered this frame for this view
    * @param view the view for which to get the render target
    * @returns the render target for the specified view or null if not available
    */
  /* CompleteClass */
  override def getRenderTargetTextureForView(view: XRView): Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture] = js.native
  
  /**
    * Attempts to set the framebuffer-size-normalized viewport to be rendered this frame for this view.
    * In the event of a failure, the supplied viewport is not updated.
    * @param viewport the viewport to which the view will be rendered
    * @param view the view for which to set the viewport
    * @returns whether the operation was successful
    */
  /* CompleteClass */
  override def trySetViewportForView(viewport: typingsJapgolly.babylonjs.BABYLON.Viewport, view: XRView): Boolean = js.native
}
