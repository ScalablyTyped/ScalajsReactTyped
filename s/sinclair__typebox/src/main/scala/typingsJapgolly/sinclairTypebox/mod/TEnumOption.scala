package typingsJapgolly.sinclairTypebox.mod

import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.number
import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TEnumOption[T] extends StObject {
  
  var const: T
  
  var `type`: number | string
}
object TEnumOption {
  
  inline def apply[T](const: T, `type`: number | string): TEnumOption[T] = {
    val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TEnumOption[T]]
  }
  
  extension [Self <: TEnumOption[?], T](x: Self & TEnumOption[T]) {
    
    inline def setConst(value: T): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setType(value: number | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
