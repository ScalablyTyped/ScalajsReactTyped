package typingsJapgolly.phaser.Phaser.Loader.FileTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.Loader.File
import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Loader.MultiFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpineFile
  extends StObject
     with MultiFile {
  
  def addToCache(): Any
}
object SpineFile {
  
  inline def apply(
    addToCache: CallbackTo[Any],
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: Any,
    failed: Double,
    files: js.Array[File],
    isReadyToProcess: CallbackTo[Boolean],
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Callback,
    onFileFailed: File => Callback,
    path: String,
    pending: Double,
    prefix: String,
    `type`: String
  ): SpineFile = {
    val __obj = js.Dynamic.literal(addToCache = addToCache.toJsFn, addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = isReadyToProcess.toJsFn, key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1((t0: File) => onFileComplete(t0).runNow()), onFileFailed = js.Any.fromFunction1((t0: File) => onFileFailed(t0).runNow()), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFile]
  }
  
  extension [Self <: SpineFile](x: Self) {
    
    inline def setAddToCache(value: CallbackTo[Any]): Self = StObject.set(x, "addToCache", value.toJsFn)
  }
}
