package typingsJapgolly.vueI18n.anon

import typingsJapgolly.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredBoolean extends StObject {
  
  var required: Boolean
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  @JSName("type")
  var type_Original: StringConstructor
}
object RequiredBoolean {
  
  inline def apply(required: Boolean, `type`: StringConstructor): RequiredBoolean = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredBoolean]
  }
  
  extension [Self <: RequiredBoolean](x: Self) {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
