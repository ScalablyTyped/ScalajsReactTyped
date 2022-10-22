package typingsJapgolly.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  var score: Double
  
  var suggestion: String
}
object Score {
  
  inline def apply(score: Double, suggestion: String): Score = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
  }
}
