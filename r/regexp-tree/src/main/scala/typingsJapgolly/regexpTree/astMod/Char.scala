package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.control
import typingsJapgolly.regexpTree.regexpTreeStrings.decimal
import typingsJapgolly.regexpTree.regexpTreeStrings.hex
import typingsJapgolly.regexpTree.regexpTreeStrings.meta
import typingsJapgolly.regexpTree.regexpTreeStrings.oct
import typingsJapgolly.regexpTree.regexpTreeStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.SimpleChar
  - typingsJapgolly.regexpTree.astMod.SpecialChar
*/
trait Char
  extends StObject
     with Expression
object Char {
  
  inline def SimpleChar(codePoint: Double, value: String): typingsJapgolly.regexpTree.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typingsJapgolly.regexpTree.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SpecialChar]
  }
}
