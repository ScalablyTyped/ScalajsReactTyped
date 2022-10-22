package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValue extends StObject {
  
  var value: typingsJapgolly.baseui.selectTypesMod.Value
}
object ValueValue {
  
  inline def apply(value: typingsJapgolly.baseui.selectTypesMod.Value): ValueValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValue]
  }
  
  extension [Self <: ValueValue](x: Self) {
    
    inline def setValue(value: typingsJapgolly.baseui.selectTypesMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: typingsJapgolly.baseui.selectTypesMod.Option*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
