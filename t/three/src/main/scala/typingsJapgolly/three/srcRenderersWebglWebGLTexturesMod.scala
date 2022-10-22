package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typingsJapgolly.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import typingsJapgolly.three.srcRenderersWebglWebGLPropertiesMod.WebGLProperties
import typingsJapgolly.three.srcRenderersWebglWebGLStateMod.WebGLState
import typingsJapgolly.three.srcRenderersWebglWebGLUtilsMod.WebGLUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLTexturesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLTextures", "WebGLTextures")
  @js.native
  open class WebGLTextures protected () extends StObject {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      state: WebGLState,
      properties: WebGLProperties,
      capabilities: WebGLCapabilities,
      utils: WebGLUtils,
      info: WebGLInfo
    ) = this()
    
    def allocateTextureUnit(): Unit = js.native
    
    def resetTextureUnits(): Unit = js.native
    
    def safeSetTexture2D(texture: Any, slot: Double): Unit = js.native
    
    def safeSetTextureCube(texture: Any, slot: Double): Unit = js.native
    
    def setTexture2D(texture: Any, slot: Double): Unit = js.native
    
    def setTexture2DArray(texture: Any, slot: Double): Unit = js.native
    
    def setTexture3D(texture: Any, slot: Double): Unit = js.native
    
    def setTextureCube(texture: Any, slot: Double): Unit = js.native
    
    def setupRenderTarget(renderTarget: Any): Unit = js.native
    
    def updateMultisampleRenderTarget(renderTarget: Any): Unit = js.native
    
    def updateRenderTargetMipmap(renderTarget: Any): Unit = js.native
  }
}
