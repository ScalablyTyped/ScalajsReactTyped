package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureAssetTask
  extends StObject
     with AbstractAssetTask
     with ITextureAssetTask[Texture] {
  
  /**
    * Defines if texture must be inverted on Y axis (default is true)
    */
  var invertY: Boolean = js.native
  
  /**
    * Defines if mipmap should not be generated (default is false)
    */
  var noMipmap: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextureAssetTask): Unit = js.native
  def onError(task: TextureAssetTask, message: String): Unit = js.native
  def onError(task: TextureAssetTask, message: String, exception: Any): Unit = js.native
  def onError(task: TextureAssetTask, message: Unit, exception: Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextureAssetTask): Unit = js.native
  
  /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  var samplingMode: Double = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
