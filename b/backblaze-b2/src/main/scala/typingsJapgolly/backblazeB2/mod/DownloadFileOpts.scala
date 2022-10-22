package typingsJapgolly.backblazeB2.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.backblazeB2.backblazeB2Strings.arraybuffer
import typingsJapgolly.backblazeB2.backblazeB2Strings.blob
import typingsJapgolly.backblazeB2.backblazeB2Strings.document
import typingsJapgolly.backblazeB2.backblazeB2Strings.json
import typingsJapgolly.backblazeB2.backblazeB2Strings.stream
import typingsJapgolly.backblazeB2.backblazeB2Strings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileOpts
  extends StObject
     with CommonArgs {
  
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  
  var responseType: arraybuffer | blob | document | json | text | stream
}
object DownloadFileOpts {
  
  inline def apply(responseType: arraybuffer | blob | document | json | text | stream): DownloadFileOpts = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOpts]
  }
  
  extension [Self <: DownloadFileOpts](x: Self) {
    
    inline def setOnDownloadProgress(value: /* event */ Any => Callback): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def setOnDownloadProgressNull: Self = StObject.set(x, "onDownloadProgress", null)
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setResponseType(value: arraybuffer | blob | document | json | text | stream): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}
