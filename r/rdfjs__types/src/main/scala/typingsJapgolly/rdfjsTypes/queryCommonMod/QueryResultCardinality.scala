package typingsJapgolly.rdfjsTypes.queryCommonMod

import typingsJapgolly.rdfjsTypes.rdfjsTypesStrings.estimate
import typingsJapgolly.rdfjsTypes.rdfjsTypesStrings.exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultCardinality extends StObject {
  
  /**
    * indicates the type of counting that was done, and MUST either be "estimate" or "exact".
    */
  var `type`: estimate | exact
  
  /**
    * Indicates an estimated of the number of results in the stream if type = "estimate",
    * or the exact number of results in the stream if type = "exact".
    */
  var value: Double
}
object QueryResultCardinality {
  
  inline def apply(`type`: estimate | exact, value: Double): QueryResultCardinality = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultCardinality]
  }
  
  extension [Self <: QueryResultCardinality](x: Self) {
    
    inline def setType(value: estimate | exact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
