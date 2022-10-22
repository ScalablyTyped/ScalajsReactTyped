package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.backgroundUpload method.
  */
trait IBackgroundUploadProperties extends StObject {
  
  /**
    * The file input object to read the file from. Can be a
    * Windows.Storage.StorageFile or an IFile.
    */
  var file_input: js.UndefOr[Any] = js.undefined
  
  /**
    * The name of the file to upload.
    */
  var file_name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify "true" to overwrite, "false" to not overwrite and for
    * the WL.backgroundUpload method call to fail, or "rename" to not
    * overwrite and enable SkyDrive to assign a new name to the uploaded
    * file.
    * @default "false".
    */
  var overwrite: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the file to upload.
    */
  var path: String
  
  /**
    * The file input stream to read the file from.
    */
  var stream_input: js.UndefOr[IInputStream] = js.undefined
}
object IBackgroundUploadProperties {
  
  inline def apply(path: String): IBackgroundUploadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundUploadProperties]
  }
  
  extension [Self <: IBackgroundUploadProperties](x: Self) {
    
    inline def setFile_input(value: Any): Self = StObject.set(x, "file_input", value.asInstanceOf[js.Any])
    
    inline def setFile_inputUndefined: Self = StObject.set(x, "file_input", js.undefined)
    
    inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
    
    inline def setFile_nameUndefined: Self = StObject.set(x, "file_name", js.undefined)
    
    inline def setOverwrite(value: String): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStream_input(value: IInputStream): Self = StObject.set(x, "stream_input", value.asInstanceOf[js.Any])
    
    inline def setStream_inputUndefined: Self = StObject.set(x, "stream_input", js.undefined)
  }
}
