package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedUniversalApk extends StObject {
  
  /** Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method. */
  var downloadId: js.UndefOr[String] = js.undefined
}
object GeneratedUniversalApk {
  
  inline def apply(): GeneratedUniversalApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedUniversalApk]
  }
  
  extension [Self <: GeneratedUniversalApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
  }
}
