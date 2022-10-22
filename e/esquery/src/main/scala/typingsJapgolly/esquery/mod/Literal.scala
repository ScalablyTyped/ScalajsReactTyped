package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.StringLiteral
  - typingsJapgolly.esquery.mod.NumericLiteral
*/
trait Literal extends StObject
object Literal {
  
  inline def NumericLiteral(value: Double): typingsJapgolly.esquery.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.NumericLiteral]
  }
  
  inline def StringLiteral(value: String): typingsJapgolly.esquery.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.StringLiteral]
  }
}
