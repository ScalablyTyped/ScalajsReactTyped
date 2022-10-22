package typingsJapgolly.stremioAddonSdk.anon

import typingsJapgolly.stremioAddonSdk.mod.Subtitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  subtitles :std.Array<stremio-addon-sdk.stremio-addon-sdk.Subtitle>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait subtitlesArraySubtitleCac extends StObject {
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.undefined
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.undefined
  
  var subtitles: js.Array[Subtitle]
}
object subtitlesArraySubtitleCac {
  
  inline def apply(subtitles: js.Array[Subtitle]): subtitlesArraySubtitleCac = {
    val __obj = js.Dynamic.literal(subtitles = subtitles.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitlesArraySubtitleCac]
  }
  
  extension [Self <: subtitlesArraySubtitleCac](x: Self) {
    
    inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    inline def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    inline def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    inline def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    inline def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
    
    inline def setSubtitles(value: js.Array[Subtitle]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesVarargs(value: Subtitle*): Self = StObject.set(x, "subtitles", js.Array(value*))
  }
}
