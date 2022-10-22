package typingsJapgolly.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.WebGLProgram
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayTileGlMod {
  
  @JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
  @js.native
  open class default () extends TileGL
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/tile-gl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait TileGL
    extends typingsJapgolly.rotJs.libDisplayBackendMod.default {
    
    var _gl: WebGLRenderingContext = js.native
    
    def _initWebGL(): WebGLRenderingContext = js.native
    
    def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    var _program: WebGLProgram = js.native
    
    var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
    
    def _updateSize(): Unit = js.native
    
    def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
    
    def computeFontSize(): Double = js.native
  }
}
