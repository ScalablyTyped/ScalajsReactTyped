package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Parameter Objects for searching
//
/**
  * Object for search parameters for searching for tracks, playlists, artists or albums.
  * See: [Search for an item](https://developer.spotify.com/web-api/search-item/)
  *
  * q and type are not optional in the API, however they are marked as optional here, since various libraries
  * implement them as function call parameters instead. This could be changed.
  *
  * @param q Required. The search query's keywords (and optional field filters and operators).
  * @param type Required. A comma-separated list of item types to search across. Valid types are: album, artist, playlist, and track.
  * @param market Optional. An ISO 3166-1 alpha-2 country code or the string from_token
  * @param limit Optional. The maximum number of results to return. Default: 20. Minimum: 1. Maximum: 50.
  * @param offset Optional. The index of the first result to return. Default: 0 (i.e., the first result). Maximum offset: 100.000. Use with limit to get the next page of search results.
  */
trait SearchForItemParameterObject extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var market: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SearchForItemParameterObject {
  
  inline def apply(): SearchForItemParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchForItemParameterObject]
  }
  
  extension [Self <: SearchForItemParameterObject](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
