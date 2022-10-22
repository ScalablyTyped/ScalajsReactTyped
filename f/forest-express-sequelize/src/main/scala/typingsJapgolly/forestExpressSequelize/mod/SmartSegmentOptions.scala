package typingsJapgolly.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartSegmentOptions extends StObject {
  
  var name: String
  
  def where(record: Any): js.Object
  @JSName("where")
  var where_Original: SegmentAggregationCreator
}
object SmartSegmentOptions {
  
  inline def apply(name: String, where: /* record */ Any => js.Object): SmartSegmentOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[SmartSegmentOptions]
  }
  
  extension [Self <: SmartSegmentOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: /* record */ Any => js.Object): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}
