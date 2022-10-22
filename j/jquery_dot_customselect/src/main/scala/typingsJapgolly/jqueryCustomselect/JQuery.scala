package typingsJapgolly.jqueryCustomselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def customSelect(`val`: JQueryCustomSelectOption): JQuery
}
object JQuery {
  
  inline def apply(customSelect: JQueryCustomSelectOption => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(customSelect = js.Any.fromFunction1(customSelect))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setCustomSelect(value: JQueryCustomSelectOption => JQuery): Self = StObject.set(x, "customSelect", js.Any.fromFunction1(value))
  }
}
