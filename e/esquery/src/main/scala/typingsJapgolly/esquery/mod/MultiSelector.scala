package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.Sequence
  - typingsJapgolly.esquery.mod.Negation
  - typingsJapgolly.esquery.mod.Matches_
  - typingsJapgolly.esquery.mod.Has
*/
trait MultiSelector
  extends StObject
     with SubjectSelector
object MultiSelector {
  
  inline def Has(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("has")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Has]
  }
  
  inline def Matches_(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("matches")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Matches_]
  }
  
  inline def Negation(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Negation]
  }
  
  inline def Sequence(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Sequence]
  }
}
