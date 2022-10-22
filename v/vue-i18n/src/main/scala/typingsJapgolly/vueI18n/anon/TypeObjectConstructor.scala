package typingsJapgolly.vueI18n.anon

import typingsJapgolly.std.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeObjectConstructor extends StObject {
  
  /* standard es5 */
  def `type`(): Any
  /* standard es5 */
  def `type`(value: Any): Any
  @JSName("type")
  var type_Original: ObjectConstructor
}
object TypeObjectConstructor {
  
  inline def apply(`type`: ObjectConstructor): TypeObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObjectConstructor]
  }
  
  extension [Self <: TypeObjectConstructor](x: Self) {
    
    inline def setType(value: ObjectConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
