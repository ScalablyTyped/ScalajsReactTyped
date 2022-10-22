package typingsJapgolly.phaser.Phaser.Loader.FileTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.phaser.Phaser.Cache.BaseCache
import typingsJapgolly.phaser.Phaser.Loader.File
import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Loader.MultiFile
import typingsJapgolly.phaser.Phaser.Textures.TextureManager
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
trait HTML5AudioFile
  extends StObject
     with File {
  
  /**
    * Called if the file errors while loading.
    */
  def onError(): Unit
  
  /**
    * Called when the file finishes loading.
    */
  def onLoad(): Unit
  
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    */
  def onProgress(): Unit
}
object HTML5AudioFile {
  
  inline def apply(
    addToCache: Callback,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: Any,
    data: Any,
    destroy: Callback,
    hasCacheConflict: CallbackTo[Boolean],
    key: String,
    linkFile: File,
    load: Callback,
    loader: LoaderPlugin,
    multiFile: MultiFile,
    onError: Callback,
    onLoad: Callback,
    onProcess: Callback,
    onProcessComplete: Callback,
    onProcessError: Callback,
    onProgress: Callback,
    pendingDestroy: Callback,
    percentComplete: Double,
    resetXHR: Callback,
    setLink: File => Callback,
    src: String,
    state: Double,
    `type`: String,
    url: js.Object | String,
    xhrLoader: XMLHttpRequest,
    xhrSettings: XHRSettingsObject
  ): HTML5AudioFile = {
    val __obj = js.Dynamic.literal(addToCache = addToCache.toJsFn, bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = destroy.toJsFn, hasCacheConflict = hasCacheConflict.toJsFn, key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = load.toJsFn, loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = onError.toJsFn, onLoad = onLoad.toJsFn, onProcess = onProcess.toJsFn, onProcessComplete = onProcessComplete.toJsFn, onProcessError = onProcessError.toJsFn, onProgress = onProgress.toJsFn, pendingDestroy = pendingDestroy.toJsFn, percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = resetXHR.toJsFn, setLink = js.Any.fromFunction1((t0: File) => setLink(t0).runNow()), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5AudioFile]
  }
  
  extension [Self <: HTML5AudioFile](x: Self) {
    
    inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
    
    inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnProgress(value: Callback): Self = StObject.set(x, "onProgress", value.toJsFn)
  }
}
