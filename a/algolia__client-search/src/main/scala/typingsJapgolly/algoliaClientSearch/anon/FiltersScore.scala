package typingsJapgolly.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiltersScore extends StObject {
  
  val filtersScore: Double
  
  val rankingScore: Double
  
  val score: Double
}
object FiltersScore {
  
  inline def apply(filtersScore: Double, rankingScore: Double, score: Double): FiltersScore = {
    val __obj = js.Dynamic.literal(filtersScore = filtersScore.asInstanceOf[js.Any], rankingScore = rankingScore.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiltersScore]
  }
  
  extension [Self <: FiltersScore](x: Self) {
    
    inline def setFiltersScore(value: Double): Self = StObject.set(x, "filtersScore", value.asInstanceOf[js.Any])
    
    inline def setRankingScore(value: Double): Self = StObject.set(x, "rankingScore", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
