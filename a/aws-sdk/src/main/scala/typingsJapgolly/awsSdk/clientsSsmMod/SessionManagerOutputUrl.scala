package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionManagerOutputUrl extends StObject {
  
  /**
    * Reserved for future use.
    */
  var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined
}
object SessionManagerOutputUrl {
  
  inline def apply(): SessionManagerOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionManagerOutputUrl]
  }
  
  extension [Self <: SessionManagerOutputUrl](x: Self) {
    
    inline def setCloudWatchOutputUrl(value: SessionManagerCloudWatchOutputUrl): Self = StObject.set(x, "CloudWatchOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputUrlUndefined: Self = StObject.set(x, "CloudWatchOutputUrl", js.undefined)
    
    inline def setS3OutputUrl(value: SessionManagerS3OutputUrl): Self = StObject.set(x, "S3OutputUrl", value.asInstanceOf[js.Any])
    
    inline def setS3OutputUrlUndefined: Self = StObject.set(x, "S3OutputUrl", js.undefined)
  }
}
