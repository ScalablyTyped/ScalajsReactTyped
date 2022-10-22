package typingsJapgolly.spotifyWebApiNode.mod

import typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions
  extends StObject
     with PaginationMarketOptions {
  
  var include_external: js.UndefOr[audio] = js.undefined
}
object SearchOptions {
  
  inline def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setInclude_external(value: audio): Self = StObject.set(x, "include_external", value.asInstanceOf[js.Any])
    
    inline def setInclude_externalUndefined: Self = StObject.set(x, "include_external", js.undefined)
  }
}
