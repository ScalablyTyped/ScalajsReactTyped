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

trait SpecialChar
  extends StObject
     with Base[typingsJapgolly.regexpTree.regexpTreeStrings.Char]
     with Char {
  
  var codePoint: Double
  
  var kind: meta | control | hex | decimal | oct | unicode
  
  var value: String
}
object SpecialChar {
  
  inline def apply(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[SpecialChar]
  }
  
  extension [Self <: SpecialChar](x: Self) {
    
    inline def setCodePoint(value: Double): Self = StObject.set(x, "codePoint", value.asInstanceOf[js.Any])
    
    inline def setKind(value: meta | control | hex | decimal | oct | unicode): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
