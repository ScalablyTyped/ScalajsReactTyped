package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WmxSitemap extends StObject {
  
  /** The various content types in the sitemap. */
  var contents: js.UndefOr[js.Array[WmxSitemapContent]] = js.undefined
  
  /** Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed before it can be processed correctly. */
  var errors: js.UndefOr[String] = js.undefined
  
  /** If true, the sitemap has not been processed. */
  var isPending: js.UndefOr[Boolean] = js.undefined
  
  /** If true, the sitemap is a collection of sitemaps. */
  var isSitemapsIndex: js.UndefOr[Boolean] = js.undefined
  
  /** Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastDownloaded: js.UndefOr[String] = js.undefined
  
  /** Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastSubmitted: js.UndefOr[String] = js.undefined
  
  /** The url of the sitemap. */
  var path: js.UndefOr[String] = js.undefined
  
  /** The type of the sitemap. For example: `rssFeed`. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Number of warnings for the sitemap. These are generally non-critical issues with URLs in the sitemaps. */
  var warnings: js.UndefOr[String] = js.undefined
}
object WmxSitemap {
  
  inline def apply(): WmxSitemap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSitemap]
  }
  
  extension [Self <: WmxSitemap](x: Self) {
    
    inline def setContents(value: js.Array[WmxSitemapContent]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContentsVarargs(value: WmxSitemapContent*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setErrors(value: String): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setIsPendingUndefined: Self = StObject.set(x, "isPending", js.undefined)
    
    inline def setIsSitemapsIndex(value: Boolean): Self = StObject.set(x, "isSitemapsIndex", value.asInstanceOf[js.Any])
    
    inline def setIsSitemapsIndexUndefined: Self = StObject.set(x, "isSitemapsIndex", js.undefined)
    
    inline def setLastDownloaded(value: String): Self = StObject.set(x, "lastDownloaded", value.asInstanceOf[js.Any])
    
    inline def setLastDownloadedUndefined: Self = StObject.set(x, "lastDownloaded", js.undefined)
    
    inline def setLastSubmitted(value: String): Self = StObject.set(x, "lastSubmitted", value.asInstanceOf[js.Any])
    
    inline def setLastSubmittedUndefined: Self = StObject.set(x, "lastSubmitted", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWarnings(value: String): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
