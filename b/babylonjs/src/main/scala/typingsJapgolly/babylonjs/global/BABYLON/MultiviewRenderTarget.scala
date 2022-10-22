package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.anon.Height
import typingsJapgolly.babylonjs.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiviewRenderTarget")
@js.native
/**
  * Creates a multiview render target
  * @param scene scene used with the render target
  * @param size the size of the render target (used for each view)
  */
open class MultiviewRenderTarget ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MultiviewRenderTarget {
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(scene: Unit, size: Double) = this()
  def this(scene: Unit, size: Height) = this()
  def this(scene: Unit, size: Ratio) = this()
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene, size: Double) = this()
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene, size: Height) = this()
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene, size: Ratio) = this()
  
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
