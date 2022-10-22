package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IMultiRenderTargetOptions
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassRenderTarget")
@js.native
open class PrePassRenderTarget protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PrePassRenderTarget {
  def this(
    name: String,
    renderTargetTexture: Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: Unit,
    options: IMultiRenderTargetOptions
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    options: IMultiRenderTargetOptions
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Entry point to access the wrapper on a texture.
    */
  /* CompleteClass */
  var renderTarget: Nullable[typingsJapgolly.babylonjs.BABYLON.RenderTargetWrapper] = js.native
}
