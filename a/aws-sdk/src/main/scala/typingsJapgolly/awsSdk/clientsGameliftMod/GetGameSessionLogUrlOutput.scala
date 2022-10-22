package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameSessionLogUrlOutput extends StObject {
  
  /**
    * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day period that the logs are retained.
    */
  var PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object GetGameSessionLogUrlOutput {
  
  inline def apply(): GetGameSessionLogUrlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameSessionLogUrlOutput]
  }
  
  extension [Self <: GetGameSessionLogUrlOutput](x: Self) {
    
    inline def setPreSignedUrl(value: NonZeroAndMaxString): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
  }
}
