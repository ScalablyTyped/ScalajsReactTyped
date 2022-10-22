package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`match`
import typingsJapgolly.fhir.fhirStrings.include
import typingsJapgolly.fhir.fhirStrings.outcome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleEntrySearch
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * There is only one mode. In some corner cases, a resource may be included because it is both a match and an include. In these circumstances, 'match' takes precedence.
    */
  var mode: js.UndefOr[`match` | include | outcome] = js.undefined
  
  /**
    * Servers are not required to return a ranking score. 1 is most relevant, and 0 is least relevant. Often, search results are sorted by score, but the client may specify a different sort order.
    */
  var score: js.UndefOr[Double] = js.undefined
}
object BundleEntrySearch {
  
  inline def apply(): BundleEntrySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleEntrySearch]
  }
  
  extension [Self <: BundleEntrySearch](x: Self) {
    
    inline def setMode(value: `match` | include | outcome): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
