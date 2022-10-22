package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsFontAssetMod {
  
  @JSImport("black-engine/assets/FontAsset", "FontAsset")
  @js.native
  open class FontAsset protected () extends Asset {
    def this(name: String, url: String, isLocal: Boolean) = this()
    
    /* private */ var mIsLocal: Any = js.native
    
    /* private */ var mUrl: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
