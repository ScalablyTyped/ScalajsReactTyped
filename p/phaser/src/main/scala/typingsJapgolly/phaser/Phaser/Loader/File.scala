package typingsJapgolly.phaser.Phaser.Loader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.phaser.Phaser.Cache.BaseCache
import typingsJapgolly.phaser.Phaser.Textures.TextureManager
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base File class used by all File Types that the Loader can support.
  * You shouldn't create an instance of a File directly, but should extend it with your own class, setting a custom type and processing methods.
  */
trait File extends StObject {
  
  /**
    * Adds this file to its target cache upon successful loading and processing.
    * This method is often overridden by specific file types.
    */
  def addToCache(): Unit
  
  /**
    * Updated as the file loads.
    * Only set if loading via XHR.
    */
  var bytesLoaded: Double
  
  /**
    * The total size of this file.
    * Set by onProgress and only if loading via XHR.
    */
  var bytesTotal: Double
  
  /**
    * A reference to the Cache, or Texture Manager, that is going to store this file if it loads.
    */
  var cache: BaseCache | TextureManager
  
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: Any
  
  /**
    * For CORs based loading.
    * If this is undefined then the File will check BaseLoader.crossOrigin and use that (if set)
    */
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * The processed file data, stored here after the file has loaded.
    */
  var data: Any
  
  /**
    * Destroy this File and any references it holds.
    */
  def destroy(): Unit
  
  /**
    * Checks if a key matching the one used by this file exists in the target Cache or not.
    * This is called automatically by the LoaderPlugin to decide if the file can be safely
    * loaded or will conflict.
    */
  def hasCacheConflict(): Boolean
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  
  /**
    * Does this file have an associated linked file? Such as an image and a normal map.
    * Atlases and Bitmap Fonts use the multiFile, because those files need loading together but aren't
    * actually bound by data, where-as a linkFile is.
    */
  var linkFile: File
  
  /**
    * Called by the Loader, starts the actual file downloading.
    * During the load the methods onLoad, onError and onProgress are called, based on the XHR events.
    * You shouldn't normally call this method directly, it's meant to be invoked by the Loader.
    */
  def load(): Unit
  
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin
  
  /**
    * If this is a multipart file, i.e. an atlas and its json together, then this is a reference
    * to the parent MultiFile. Set and used internally by the Loader or specific file types.
    */
  var multiFile: MultiFile
  
  /**
    * Called if the file errors while loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this error.
    */
  def onError(xhr: XMLHttpRequest, event: ProgressEvent): Unit
  
  /**
    * Called when the file finishes loading, is sent a DOM ProgressEvent.
    * @param xhr The XMLHttpRequest that caused this onload event.
    * @param event The DOM ProgressEvent that resulted from this load.
    */
  def onLoad(xhr: XMLHttpRequest, event: ProgressEvent): Unit
  
  /**
    * Usually overridden by the FileTypes and is called by Loader.nextFile.
    * This method controls what extra work this File does with its loaded data, for example a JSON file will parse itself during this stage.
    */
  def onProcess(): Unit
  
  /**
    * Called when the File has completed processing.
    * Checks on the state of its multifile, if set.
    */
  def onProcessComplete(): Unit
  
  /**
    * Called when the File has completed processing but it generated an error.
    * Checks on the state of its multifile, if set.
    */
  def onProcessError(): Unit
  
  /**
    * Called during the file load progress. Is sent a DOM ProgressEvent.
    * @param event The DOM ProgressEvent.
    */
  def onProgress(event: ProgressEvent): Unit
  
  /**
    * Called once the file has been added to its cache and is now ready for deletion from the Loader.
    * It will emit a `filecomplete` event from the LoaderPlugin.
    */
  def pendingDestroy(): Unit
  
  /**
    * A percentage value between 0 and 1 indicating how much of this file has loaded.
    * Only set if loading via XHR.
    */
  var percentComplete: Double
  
  /**
    * Resets the XHRLoader instance this file is using.
    */
  def resetXHR(): Unit
  
  /**
    * Links this File with another, so they depend upon each other for loading and processing.
    * @param fileB The file to link to this one.
    */
  def setLink(fileB: File): Unit
  
  /**
    * The final URL this file will load from, including baseURL and path.
    * Set automatically when the Loader calls 'load' on this file.
    */
  var src: String
  
  /**
    * The current state of the file. One of the FILE_CONST values.
    */
  var state: Double
  
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String
  
  /**
    * The URL of the file, not including baseURL.
    * 
    * Automatically has Loader.path prepended to it if a string.
    * 
    * Can also be a JavaScript Object, such as the results of parsing JSON data.
    */
  var url: js.Object | String
  
  /**
    * The XMLHttpRequest instance (as created by XHR Loader) that is loading this File.
    */
  var xhrLoader: XMLHttpRequest
  
  /**
    * The merged XHRSettings for this file.
    */
  var xhrSettings: XHRSettingsObject
}
object File {
  
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
    onError: (XMLHttpRequest, ProgressEvent) => Callback,
    onLoad: (XMLHttpRequest, ProgressEvent) => Callback,
    onProcess: Callback,
    onProcessComplete: Callback,
    onProcessError: Callback,
    onProgress: ProgressEvent => Callback,
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
  ): File = {
    val __obj = js.Dynamic.literal(addToCache = addToCache.toJsFn, bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = destroy.toJsFn, hasCacheConflict = hasCacheConflict.toJsFn, key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = load.toJsFn, loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (onError(t0, t1)).runNow()), onLoad = js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (onLoad(t0, t1)).runNow()), onProcess = onProcess.toJsFn, onProcessComplete = onProcessComplete.toJsFn, onProcessError = onProcessError.toJsFn, onProgress = js.Any.fromFunction1((t0: ProgressEvent) => onProgress(t0).runNow()), pendingDestroy = pendingDestroy.toJsFn, percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = resetXHR.toJsFn, setLink = js.Any.fromFunction1((t0: File) => setLink(t0).runNow()), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setAddToCache(value: Callback): Self = StObject.set(x, "addToCache", value.toJsFn)
    
    inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    inline def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
    
    inline def setCache(value: BaseCache | TextureManager): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHasCacheConflict(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasCacheConflict", value.toJsFn)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLinkFile(value: File): Self = StObject.set(x, "linkFile", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def setLoader(value: LoaderPlugin): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setMultiFile(value: MultiFile): Self = StObject.set(x, "multiFile", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: (XMLHttpRequest, ProgressEvent) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (value(t0, t1)).runNow()))
    
    inline def setOnLoad(value: (XMLHttpRequest, ProgressEvent) => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (value(t0, t1)).runNow()))
    
    inline def setOnProcess(value: Callback): Self = StObject.set(x, "onProcess", value.toJsFn)
    
    inline def setOnProcessComplete(value: Callback): Self = StObject.set(x, "onProcessComplete", value.toJsFn)
    
    inline def setOnProcessError(value: Callback): Self = StObject.set(x, "onProcessError", value.toJsFn)
    
    inline def setOnProgress(value: ProgressEvent => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ProgressEvent) => value(t0).runNow()))
    
    inline def setPendingDestroy(value: Callback): Self = StObject.set(x, "pendingDestroy", value.toJsFn)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setResetXHR(value: Callback): Self = StObject.set(x, "resetXHR", value.toJsFn)
    
    inline def setSetLink(value: File => Callback): Self = StObject.set(x, "setLink", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: js.Object | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setXhrLoader(value: XMLHttpRequest): Self = StObject.set(x, "xhrLoader", value.asInstanceOf[js.Any])
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
  }
}
