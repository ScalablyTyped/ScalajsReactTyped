package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchSuggestItem...
  */
trait ISearchSuggestItem extends StObject {
  
  /**
    * Index of the suggestion value.
    * The indexing starts from 0 and from the left.
    */
  var qTerm: Double
  
  /**
    * Value of the suggestion.
    */
  var qValue: String
}
object ISearchSuggestItem {
  
  inline def apply(qTerm: Double, qValue: String): ISearchSuggestItem = {
    val __obj = js.Dynamic.literal(qTerm = qTerm.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestItem]
  }
  
  extension [Self <: ISearchSuggestItem](x: Self) {
    
    inline def setQTerm(value: Double): Self = StObject.set(x, "qTerm", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
