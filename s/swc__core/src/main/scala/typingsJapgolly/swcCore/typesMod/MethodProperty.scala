package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodProperty
  extends StObject
     with PropBase
     with Fn
     with Property {
  
  @JSName("type")
  var type_MethodProperty: typingsJapgolly.swcCore.swcCoreStrings.MethodProperty
}
object MethodProperty {
  
  inline def apply(async: Boolean, generator: Boolean, key: PropertyName, params: js.Array[Param], span: Span): MethodProperty = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodProperty")
    __obj.asInstanceOf[MethodProperty]
  }
  
  extension [Self <: MethodProperty](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.MethodProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
