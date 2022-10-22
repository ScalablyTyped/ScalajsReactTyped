package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matches_
  extends StObject
     with MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Matches_ : typingsJapgolly.esquery.esqueryStrings.matches
}
object Matches_ {
  
  inline def apply(selectors: js.Array[SubjectSelector]): Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("matches")
    __obj.asInstanceOf[Matches_]
  }
  
  extension [Self <: Matches_](x: Self) {
    
    inline def setType(value: typingsJapgolly.esquery.esqueryStrings.matches): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
