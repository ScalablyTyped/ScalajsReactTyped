package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.materialsTexturesTextureCreationOptionsMod.RenderTargetCreationOptions
import typingsJapgolly.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ThinRenderTargetTexture")
@js.native
open class ThinRenderTargetTexture protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.ThinRenderTargetTexture {
  /**
    * Instantiates a new ThinRenderTargetTexture.
    * Tiny helper class to wrap a RenderTargetWrapper in a texture.
    * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache and to hold on the associated RTT
    * @param engine Define the internalTexture to wrap
    * @param size Define the size of the RTT to create
    * @param options Define rendertarget options
    */
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    size: TextureSize,
    options: RenderTargetCreationOptions
  ) = this()
}
