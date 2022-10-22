package typingsJapgolly.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataRequestedEventOptions
  extends StObject
     with EntryPathRequestedEventOptions {
  
  /** Set to true if the thumbnail is requested. */
  var thumbnail: Boolean
}
object MetadataRequestedEventOptions {
  
  inline def apply(entryPath: String, fileSystemId: String, requestId: Double, thumbnail: Boolean): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
  
  extension [Self <: MetadataRequestedEventOptions](x: Self) {
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
