package typingsJapgolly.babylonjs

import org.scalajs.dom.WebGLFramebuffer
import org.scalajs.dom.WebGLRenderbuffer
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLTexture
import typingsJapgolly.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import typingsJapgolly.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGLWebGLRenderTargetWrapperMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLRenderTargetWrapper", "WebGLRenderTargetWrapper")
  @js.native
  open class WebGLRenderTargetWrapper protected () extends RenderTargetWrapper {
    def this(
      isMulti: Boolean,
      isCube: Boolean,
      size: TextureSize,
      engine: ThinEngine,
      context: WebGLRenderingContext
    ) = this()
    
    var _MSAAFramebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /**
      * Binds a texture to this render target on a specific attachment
      * @param texture The texture to bind to the framebuffer
      * @param attachmentIndex Index of the attachment
      * @param faceIndex The face of the texture to render to in case of cube texture
      * @param lodLevel defines the lod level to bind to the frame buffer
      */
    /* private */ var _bindTextureRenderTarget: Any = js.native
    
    var _colorTextureArray: Nullable[WebGLTexture] = js.native
    
    /* private */ var _context: Any = js.native
    
    var _depthStencilBuffer: Nullable[WebGLRenderbuffer] = js.native
    
    var _depthStencilTextureArray: Nullable[WebGLTexture] = js.native
    
    var _framebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /**
      * Shares the depth buffer of this render target with another render target.
      * @internal
      * @param renderTarget Destination renderTarget
      */
    def _shareDepth(renderTarget: WebGLRenderTargetWrapper): Unit = js.native
    
    /* protected */ def _swapRenderTargetWrapper(target: WebGLRenderTargetWrapper): Unit = js.native
  }
}
