package typingsJapgolly.babylonjs.global.BABYLON

import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLTexture
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLHardwareTexture")
@js.native
open class WebGLHardwareTexture protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGLHardwareTexture {
  def this(existingTexture: Unit, context: WebGLRenderingContext) = this()
  def this(existingTexture: Nullable[WebGLTexture], context: WebGLRenderingContext) = this()
  
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(hardwareTexture: Any): Unit = js.native
  
  /* CompleteClass */
  override def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit = js.native
  
  /* CompleteClass */
  var underlyingResource: Any = js.native
}
