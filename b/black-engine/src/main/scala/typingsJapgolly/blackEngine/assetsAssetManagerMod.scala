package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.assetsAssetMod.Asset
import typingsJapgolly.blackEngine.assetsBitmapFontAssetMod.BitmapFontData
import typingsJapgolly.blackEngine.audioSoundClipMod.SoundClip
import typingsJapgolly.blackEngine.displayGraphicsDataMod.GraphicsData
import typingsJapgolly.blackEngine.messagesMessageDispatcherMod.MessageDispatcher
import typingsJapgolly.blackEngine.messagesMessageMod.Message
import typingsJapgolly.blackEngine.texturesAtlasTextureMod.AtlasTexture
import typingsJapgolly.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsAssetManagerMod {
  
  @JSImport("black-engine/assets/AssetManager", "AssetManager")
  @js.native
  open class AssetManager () extends MessageDispatcher {
    
    /* private */ var __getAsset: Any = js.native
    
    def __validateName(`type`: Any, name: Any): Unit = js.native
    
    def __validateState(): Unit = js.native
    
    def addTexture(name: String, texture: Texture): Unit = js.native
    
    def defaultPath: String = js.native
    def defaultPath_=(arg: String): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def enqueueAsset(name: String, asset: Asset): Unit = js.native
    
    def enqueueAtlas(name: String, imageUrl: String, dataUrl: String): Unit = js.native
    
    def enqueueBitmapFont(name: String, imageUrl: String, xmlUrl: String): Unit = js.native
    
    def enqueueFont(name: String, url: String): Unit = js.native
    
    def enqueueGoogleFont(name: String): Unit = js.native
    
    def enqueueImage(name: String, url: String): Unit = js.native
    
    def enqueueJSON(name: String, url: String): Unit = js.native
    
    def enqueueSound(name: String, url: String): Unit = js.native
    
    def enqueueSoundAtlas(name: String, soundUrl: String, dataUrl: String): Unit = js.native
    
    def enqueueVector(name: String, url: String): Unit = js.native
    
    def enqueueVectorTexture(name: String, url: String): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Boolean): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Boolean, bakeChildren: Boolean): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Boolean, bakeChildren: Boolean, namesToBake: js.Array[String]): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Boolean, bakeChildren: Unit, namesToBake: js.Array[String]): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Unit, bakeChildren: Boolean): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Unit, bakeChildren: Boolean, namesToBake: js.Array[String]): Unit = js.native
    def enqueueVectorTexture(name: String, url: String, bakeSelf: Unit, bakeChildren: Unit, namesToBake: js.Array[String]): Unit = js.native
    
    def enqueueXML(name: String, url: String): Unit = js.native
    
    def getAtlas(name: String): AtlasTexture | Null = js.native
    
    def getBitmapFont(name: String): BitmapFontData | Null = js.native
    
    def getCustomAsset(`type`: String, name: String): Any = js.native
    
    def getGraphicsData(name: String): GraphicsData = js.native
    
    def getJSON(name: String): Any = js.native
    
    def getSound(name: String): SoundClip = js.native
    
    def getSoundAtlas(name: String): SoundClip = js.native
    
    def getTexture(name: String): Texture | Null = js.native
    
    def getTextures(nameMask: String): js.Array[Texture] | Null = js.native
    
    def isAllLoaded: Boolean = js.native
    
    def loadQueue(): Unit = js.native
    
    /* private */ var mDefaultPath: Any = js.native
    
    /* private */ var mIsAllLoaded: Any = js.native
    
    /* private */ var mLoaderFactory: Any = js.native
    
    /* private */ var mLoadersQueue: Any = js.native
    
    /* private */ var mLoadingProgress: Any = js.native
    
    /* private */ var mQueue: Any = js.native
    
    /* private */ var mState: Any = js.native
    
    /* private */ var mTotalErrors: Any = js.native
    
    /* private */ var mTotalLoaded: Any = js.native
    
    /* private */ var mTotalPending: Any = js.native
    
    def numErrors: Double = js.native
    
    def onAssetError(msg: Any): Unit = js.native
    
    /* protected */ def onAssetLoaded(msg: Message): Unit = js.native
    
    def registerDefaultTypes(): Unit = js.native
    
    def setAssetType(name: String, `type`: String): Unit = js.native
    
    def setLoaderType(name: String, `type`: String): Unit = js.native
    
    def state: String = js.native
  }
}
