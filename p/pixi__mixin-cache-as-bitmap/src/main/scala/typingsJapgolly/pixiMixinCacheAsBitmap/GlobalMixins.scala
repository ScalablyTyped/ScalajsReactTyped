package typingsJapgolly.pixiMixinCacheAsBitmap

import typingsJapgolly.pixiConstants.mod.MSAA_QUALITY
import typingsJapgolly.pixiCore.mod.AbstractRenderer
import typingsJapgolly.pixiCore.mod.Renderer
import typingsJapgolly.pixiDisplay.mod.IDestroyOptions
import typingsJapgolly.pixiMath.mod.Rectangle
import typingsJapgolly.pixiMixinCacheAsBitmap.mod.CacheData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  @js.native
  trait DisplayObject extends StObject {
    
    var _cacheAsBitmap: Boolean = js.native
    
    def _cacheAsBitmapDestroy(): Unit = js.native
    def _cacheAsBitmapDestroy(options: Boolean): Unit = js.native
    def _cacheAsBitmapDestroy(options: IDestroyOptions): Unit = js.native
    
    var _cacheAsBitmapMultisample: MSAA_QUALITY = js.native
    
    var _cacheAsBitmapResolution: Double = js.native
    
    var _cacheData: CacheData = js.native
    
    def _calculateCachedBounds(): Unit = js.native
    
    def _destroyCachedDisplayObject(): Unit = js.native
    
    def _getCachedLocalBounds(): Rectangle = js.native
    
    def _initCachedDisplayObject(renderer: Renderer): Unit = js.native
    
    def _initCachedDisplayObjectCanvas(renderer: AbstractRenderer): Unit = js.native
    
    def _renderCached(renderer: Renderer): Unit = js.native
    
    def _renderCachedCanvas(renderer: AbstractRenderer): Unit = js.native
    
    var cacheAsBitmap: Boolean = js.native
    
    var cacheAsBitmapMultisample: MSAA_QUALITY = js.native
    
    var cacheAsBitmapResolution: Double = js.native
  }
}
