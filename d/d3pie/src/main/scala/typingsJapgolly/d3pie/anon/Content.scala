package typingsJapgolly.d3pie.anon

import typingsJapgolly.d3pie.d3pieStrings.`label-asc`
import typingsJapgolly.d3pie.d3pieStrings.`label-desc`
import typingsJapgolly.d3pie.d3pieStrings.`value-asc`
import typingsJapgolly.d3pie.d3pieStrings.`value-desc`
import typingsJapgolly.d3pie.d3pieStrings.none
import typingsJapgolly.d3pie.d3pieStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: js.Array[Label]
  
  var smallSegmentGrouping: js.UndefOr[Color] = js.undefined
  
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.undefined
}
object Content {
  
  inline def apply(content: js.Array[Label]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: js.Array[Label]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Label*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setSmallSegmentGrouping(value: Color): Self = StObject.set(x, "smallSegmentGrouping", value.asInstanceOf[js.Any])
    
    inline def setSmallSegmentGroupingUndefined: Self = StObject.set(x, "smallSegmentGrouping", js.undefined)
    
    inline def setSortOrder(value: none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
