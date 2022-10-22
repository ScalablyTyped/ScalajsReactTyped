package typingsJapgolly.coreJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolConstructor extends StObject {
  
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit
  
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit
}
object SymbolConstructor {
  
  inline def apply(useSimple: Callback, userSetter: Callback): SymbolConstructor = {
    val __obj = js.Dynamic.literal(useSimple = useSimple.toJsFn, userSetter = userSetter.toJsFn)
    __obj.asInstanceOf[SymbolConstructor]
  }
  
  extension [Self <: SymbolConstructor](x: Self) {
    
    inline def setUseSimple(value: Callback): Self = StObject.set(x, "useSimple", value.toJsFn)
    
    inline def setUserSetter(value: Callback): Self = StObject.set(x, "userSetter", value.toJsFn)
  }
}
