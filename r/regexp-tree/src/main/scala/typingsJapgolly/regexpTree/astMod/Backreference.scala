package typingsJapgolly.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.NumericBackreference
  - typingsJapgolly.regexpTree.astMod.NamedBackreference
*/
trait Backreference
  extends StObject
     with Expression
object Backreference {
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typingsJapgolly.regexpTree.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NamedBackreference]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typingsJapgolly.regexpTree.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NumericBackreference]
  }
}
