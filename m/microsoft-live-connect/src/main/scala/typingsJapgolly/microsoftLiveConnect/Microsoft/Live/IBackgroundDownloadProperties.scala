package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.backgroundDownload method.
  */
trait IBackgroundDownloadProperties extends StObject {
  
  /**
    * The file output object to which the downloaded file data is written.
    */
  var file_output: js.UndefOr[StorageFile] = js.undefined
  
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String
}
object IBackgroundDownloadProperties {
  
  inline def apply(path: String): IBackgroundDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundDownloadProperties]
  }
  
  extension [Self <: IBackgroundDownloadProperties](x: Self) {
    
    inline def setFile_output(value: StorageFile): Self = StObject.set(x, "file_output", value.asInstanceOf[js.Any])
    
    inline def setFile_outputUndefined: Self = StObject.set(x, "file_output", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
