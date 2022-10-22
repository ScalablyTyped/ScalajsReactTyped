package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetHit extends StObject {
  
  /**
    * The count.
    */
  val count: Double
  
  /**
    * The highlighted value.
    */
  val highlighted: String
  
  /**
    * The value of the facet.
    */
  val value: String
}
object FacetHit {
  
  inline def apply(count: Double, highlighted: String, value: String): FacetHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetHit]
  }
  
  extension [Self <: FacetHit](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
