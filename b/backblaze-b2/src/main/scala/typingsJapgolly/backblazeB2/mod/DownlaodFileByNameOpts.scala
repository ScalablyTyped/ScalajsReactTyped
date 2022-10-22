package typingsJapgolly.backblazeB2.mod

import typingsJapgolly.backblazeB2.backblazeB2Strings.arraybuffer
import typingsJapgolly.backblazeB2.backblazeB2Strings.blob
import typingsJapgolly.backblazeB2.backblazeB2Strings.document
import typingsJapgolly.backblazeB2.backblazeB2Strings.json
import typingsJapgolly.backblazeB2.backblazeB2Strings.stream
import typingsJapgolly.backblazeB2.backblazeB2Strings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownlaodFileByNameOpts
  extends StObject
     with DownloadFileOpts {
  
  var bucketName: String
  
  var fileName: String
}
object DownlaodFileByNameOpts {
  
  inline def apply(
    bucketName: String,
    fileName: String,
    responseType: arraybuffer | blob | document | json | text | stream
  ): DownlaodFileByNameOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownlaodFileByNameOpts]
  }
  
  extension [Self <: DownlaodFileByNameOpts](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
