package typingsJapgolly.spotifyWebApiNode.mod

import typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.long_term
import typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.medium_term
import typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.short_term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopOptions
  extends StObject
     with PaginationOptions {
  
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.undefined
}
object GetTopOptions {
  
  inline def apply(): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopOptions]
  }
  
  extension [Self <: GetTopOptions](x: Self) {
    
    inline def setTime_range(value: long_term | medium_term | short_term): Self = StObject.set(x, "time_range", value.asInstanceOf[js.Any])
    
    inline def setTime_rangeUndefined: Self = StObject.set(x, "time_range", js.undefined)
  }
}
