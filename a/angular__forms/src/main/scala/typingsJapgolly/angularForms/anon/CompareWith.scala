package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.compareWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareWith extends StObject {
  
  var compareWith: typingsJapgolly.angularForms.angularFormsStrings.compareWith
}
object CompareWith {
  
  inline def apply(): CompareWith = {
    val __obj = js.Dynamic.literal(compareWith = "compareWith")
    __obj.asInstanceOf[CompareWith]
  }
  
  extension [Self <: CompareWith](x: Self) {
    
    inline def setCompareWith(value: compareWith): Self = StObject.set(x, "compareWith", value.asInstanceOf[js.Any])
  }
}
