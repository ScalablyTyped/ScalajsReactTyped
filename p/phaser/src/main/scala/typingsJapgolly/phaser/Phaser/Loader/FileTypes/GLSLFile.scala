package typingsJapgolly.phaser.Phaser.Loader.FileTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ProgressEvent
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
  * A single GLSL File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#glsl method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#glsl.
  */
trait GLSLFile
  extends StObject
     with File {
  
  /**
    * Returns the name of the shader from the header block.
    * @param headerSource The header data.
    */
  def getShaderName(headerSource: js.Array[String]): String
  
  /**
    * Returns the type of the shader from the header block.
    * @param headerSource The header data.
    */
  def getShaderType(headerSource: js.Array[String]): String
  
  /**
    * Returns the shader uniforms from the header block.
    * @param headerSource The header data.
    */
  def getShaderUniforms(headerSource: js.Array[String]): Any
}
object GLSLFile {
  
  inline def apply(
    addToCache: Callback,
    bytesLoaded: Double,
    bytesTotal: Double,
    cache: BaseCache | TextureManager,
    config: Any,
    data: Any,
    destroy: Callback,
    getShaderName: js.Array[String] => String,
    getShaderType: js.Array[String] => String,
    getShaderUniforms: js.Array[String] => Any,
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
  ): GLSLFile = {
    val __obj = js.Dynamic.literal(addToCache = addToCache.toJsFn, bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = destroy.toJsFn, getShaderName = js.Any.fromFunction1(getShaderName), getShaderType = js.Any.fromFunction1(getShaderType), getShaderUniforms = js.Any.fromFunction1(getShaderUniforms), hasCacheConflict = hasCacheConflict.toJsFn, key = key.asInstanceOf[js.Any], linkFile = linkFile.asInstanceOf[js.Any], load = load.toJsFn, loader = loader.asInstanceOf[js.Any], multiFile = multiFile.asInstanceOf[js.Any], onError = js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (onError(t0, t1)).runNow()), onLoad = js.Any.fromFunction2((t0: XMLHttpRequest, t1: ProgressEvent) => (onLoad(t0, t1)).runNow()), onProcess = onProcess.toJsFn, onProcessComplete = onProcessComplete.toJsFn, onProcessError = onProcessError.toJsFn, onProgress = js.Any.fromFunction1((t0: ProgressEvent) => onProgress(t0).runNow()), pendingDestroy = pendingDestroy.toJsFn, percentComplete = percentComplete.asInstanceOf[js.Any], resetXHR = resetXHR.toJsFn, setLink = js.Any.fromFunction1((t0: File) => setLink(t0).runNow()), src = src.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrLoader = xhrLoader.asInstanceOf[js.Any], xhrSettings = xhrSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSLFile]
  }
  
  extension [Self <: GLSLFile](x: Self) {
    
    inline def setGetShaderName(value: js.Array[String] => String): Self = StObject.set(x, "getShaderName", js.Any.fromFunction1(value))
    
    inline def setGetShaderType(value: js.Array[String] => String): Self = StObject.set(x, "getShaderType", js.Any.fromFunction1(value))
    
    inline def setGetShaderUniforms(value: js.Array[String] => Any): Self = StObject.set(x, "getShaderUniforms", js.Any.fromFunction1(value))
  }
}
