package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDialogParams
  extends StObject
     with DialogParams {
  
  var hashtag: js.UndefOr[String] = js.undefined
  
  var href: String
  
  var method: share
  
  var mobile_iframe: js.UndefOr[Boolean] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
}
object ShareDialogParams {
  
  inline def apply(href: String): ShareDialogParams = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = "share")
    __obj.asInstanceOf[ShareDialogParams]
  }
  
  extension [Self <: ShareDialogParams](x: Self) {
    
    inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: share): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMobile_iframe(value: Boolean): Self = StObject.set(x, "mobile_iframe", value.asInstanceOf[js.Any])
    
    inline def setMobile_iframeUndefined: Self = StObject.set(x, "mobile_iframe", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
