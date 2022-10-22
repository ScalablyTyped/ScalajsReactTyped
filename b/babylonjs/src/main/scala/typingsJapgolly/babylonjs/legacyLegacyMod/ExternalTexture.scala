package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ExternalTexture")
@js.native
open class ExternalTexture protected ()
  extends typingsJapgolly.babylonjs.indexMod.ExternalTexture {
  /**
    * Constructs the texture
    * @param video The video the texture should be wrapped around
    */
  def this(video: HTMLVideoElement) = this()
}
/* static members */
object ExternalTexture {
  
  @JSImport("babylonjs/Legacy/legacy", "ExternalTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if a texture is an external or internal texture
    * @param texture the external or internal texture
    * @returns true if the texture is an external texture, else false
    */
  inline def IsExternalTexture(texture: typingsJapgolly.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture): /* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean]
  inline def IsExternalTexture(texture: typingsJapgolly.babylonjs.materialsTexturesInternalTextureMod.InternalTexture): /* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/Textures/externalTexture.ExternalTexture */ Boolean]
}
