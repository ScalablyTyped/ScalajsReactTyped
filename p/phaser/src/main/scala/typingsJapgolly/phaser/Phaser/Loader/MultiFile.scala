package typingsJapgolly.phaser.Phaser.Loader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
trait MultiFile extends StObject {
  
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile
  
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var baseURL: String
  
  /**
    * The completion status of this MultiFile.
    */
  var complete: Boolean
  
  /**
    * A storage container for transient data that the loading files need.
    */
  var config: Any
  
  /**
    * The number of files that failed to load.
    */
  var failed: Double
  
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File]
  
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin
  
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  def onFileComplete(file: File): Unit
  
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  def onFileFailed(file: File): Unit
  
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var path: String
  
  /**
    * The number of files to load.
    */
  var pending: Double
  
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var prefix: String
  
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String
}
object MultiFile {
  
  inline def apply(
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
  ): MultiFile = {
    val __obj = js.Dynamic.literal(addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = isReadyToProcess.toJsFn, key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1((t0: File) => onFileComplete(t0).runNow()), onFileFailed = js.Any.fromFunction1((t0: File) => onFileFailed(t0).runNow()), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFile]
  }
  
  extension [Self <: MultiFile](x: Self) {
    
    inline def setAddToMultiFile(value: File => MultiFile): Self = StObject.set(x, "addToMultiFile", js.Any.fromFunction1(value))
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setIsReadyToProcess(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadyToProcess", value.toJsFn)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: LoaderPlugin): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setOnFileComplete(value: File => Callback): Self = StObject.set(x, "onFileComplete", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setOnFileFailed(value: File => Callback): Self = StObject.set(x, "onFileFailed", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
