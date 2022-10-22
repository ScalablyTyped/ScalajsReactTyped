package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileOptions extends StObject {
  
  // An object of headers to be passed to the server
  var background: js.UndefOr[Boolean] = js.undefined
  
  // supported on Android and iOS
  var backgroundTimeout: js.UndefOr[Double] = js.undefined
  
  var begin: js.UndefOr[js.Function1[/* res */ DownloadBeginCallbackResult, Unit]] = js.undefined
  
  // Allow the OS to control the timing and speed of the download to improve perceived performance  (iOS only)
  var cacheable: js.UndefOr[Boolean] = js.undefined
  
  // only supported on iOS yet
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  
  // Continue the download in the background after the app terminates (iOS only)
  var discretionary: js.UndefOr[Boolean] = js.undefined
  
  var fromUrl: String
  
  // Local filesystem path to save the file to
  var headers: js.UndefOr[Headers] = js.undefined
  
  var progress: js.UndefOr[js.Function1[/* res */ DownloadProgressCallbackResult, Unit]] = js.undefined
  
  var progressDivider: js.UndefOr[Double] = js.undefined
  
  // Whether the download can be stored in the shared NSURLCache (iOS only)
  var progressInterval: js.UndefOr[Double] = js.undefined
  
  // only supported on Android yet
  var readTimeout: js.UndefOr[Double] = js.undefined
  
  var resumable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // URL to download file from
  var toFile: String
}
object DownloadFileOptions {
  
  inline def apply(fromUrl: String, toFile: String): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl.asInstanceOf[js.Any], toFile = toFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
  
  extension [Self <: DownloadFileOptions](x: Self) {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTimeout(value: Double): Self = StObject.set(x, "backgroundTimeout", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTimeoutUndefined: Self = StObject.set(x, "backgroundTimeout", js.undefined)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBegin(value: /* res */ DownloadBeginCallbackResult => Callback): Self = StObject.set(x, "begin", js.Any.fromFunction1((t0: /* res */ DownloadBeginCallbackResult) => value(t0).runNow()))
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setDiscretionary(value: Boolean): Self = StObject.set(x, "discretionary", value.asInstanceOf[js.Any])
    
    inline def setDiscretionaryUndefined: Self = StObject.set(x, "discretionary", js.undefined)
    
    inline def setFromUrl(value: String): Self = StObject.set(x, "fromUrl", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setProgress(value: /* res */ DownloadProgressCallbackResult => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction1((t0: /* res */ DownloadProgressCallbackResult) => value(t0).runNow()))
    
    inline def setProgressDivider(value: Double): Self = StObject.set(x, "progressDivider", value.asInstanceOf[js.Any])
    
    inline def setProgressDividerUndefined: Self = StObject.set(x, "progressDivider", js.undefined)
    
    inline def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    inline def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    inline def setResumable(value: Callback): Self = StObject.set(x, "resumable", value.toJsFn)
    
    inline def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    inline def setToFile(value: String): Self = StObject.set(x, "toFile", value.asInstanceOf[js.Any])
  }
}
