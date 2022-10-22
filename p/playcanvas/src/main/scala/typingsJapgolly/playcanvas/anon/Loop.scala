package typingsJapgolly.playcanvas.anon

import typingsJapgolly.playcanvas.mod.Asset_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loop extends StObject {
  
  var fps: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var spriteAsset: js.UndefOr[Double | Asset_] = js.undefined
}
object Loop {
  
  inline def apply(): Loop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loop]
  }
  
  extension [Self <: Loop](x: Self) {
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpriteAsset(value: Double | Asset_): Self = StObject.set(x, "spriteAsset", value.asInstanceOf[js.Any])
    
    inline def setSpriteAssetUndefined: Self = StObject.set(x, "spriteAsset", js.undefined)
  }
}
