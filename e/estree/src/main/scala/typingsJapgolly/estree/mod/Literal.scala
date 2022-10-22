package typingsJapgolly.estree.mod

import typingsJapgolly.estree.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.SimpleLiteral
  - typingsJapgolly.estree.mod.RegExpLiteral
  - typingsJapgolly.estree.mod.BigIntLiteral
*/
trait Literal extends StObject
object Literal {
  
  inline def BigIntLiteral(bigint: String): typingsJapgolly.estree.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.BigIntLiteral]
  }
  
  inline def RegExpLiteral(regex: Flags): typingsJapgolly.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.RegExpLiteral]
  }
  
  inline def SimpleLiteral(): typingsJapgolly.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.SimpleLiteral]
  }
}
