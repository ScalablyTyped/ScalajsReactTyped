package typingsJapgolly.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrendingOptions
  extends StObject
     with BaseOptions {
  
  var limit: js.UndefOr[Double] = js.undefined
}
object TrendingOptions {
  
  inline def apply(rating: Rating): TrendingOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendingOptions]
  }
  
  extension [Self <: TrendingOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
