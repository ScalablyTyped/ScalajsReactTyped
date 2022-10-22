package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValueChange extends StObject {
  
  def onValueChange(): Unit
  
  var prefixCls: String
}
object OnValueChange {
  
  inline def apply(onValueChange: Callback, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = onValueChange.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  
  extension [Self <: OnValueChange](x: Self) {
    
    inline def setOnValueChange(value: Callback): Self = StObject.set(x, "onValueChange", value.toJsFn)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
