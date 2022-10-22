package typingsJapgolly.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AspectRating extends StObject {
  
  /** the user's rating for this particular aspect, from 0 to 3. */
  var rating: Double
  
  /** the name of the aspect that is being rated. */
  var `type`: AspectRatingType
}
object AspectRating {
  
  inline def apply(rating: Double, `type`: AspectRatingType): AspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRating]
  }
  
  extension [Self <: AspectRating](x: Self) {
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setType(value: AspectRatingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
