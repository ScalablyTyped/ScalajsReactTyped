package typingsJapgolly.blackEngine

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blackEngine.assetsAssetMod.Asset
import typingsJapgolly.blackEngine.texturesCanvasRenderTextureMod.CanvasRenderTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsVectorTextureAssetMod {
  
  @JSImport("black-engine/assets/VectorTextureAsset", "VectorTextureAsset")
  @js.native
  open class VectorTextureAsset protected () extends Asset {
    def this(name: String, url: String, bakeSelf: Boolean, bakeChildren: Boolean, namesToBake: js.Array[String]) = this()
    
    def bakeTextures(): StringDictionary[CanvasRenderTexture] = js.native
    
    /* private */ var mBakeChildren: Any = js.native
    
    /* private */ var mBakeSelf: Any = js.native
    
    /* private */ var mGraphicsData: Any = js.native
    
    /* private */ var mNamesToBake: Any = js.native
    
    /* private */ var mUrl: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
