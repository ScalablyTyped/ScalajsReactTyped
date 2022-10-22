package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeWindows.anon.DoLeftAndRightSwapInRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nManagerStatic extends StObject {
  
  def allowRTL(allowRTL: Boolean): Unit
  
  var doLeftAndRightSwapInRTL: Boolean
  
  def forceRTL(forceRTL: Boolean): Unit
  
  def getConstants(): DoLeftAndRightSwapInRTL
  
  var isRTL: Boolean
  
  def swapLeftAndRightInRTL(swapLeftAndRight: Boolean): Unit
}
object I18nManagerStatic {
  
  inline def apply(
    allowRTL: Boolean => Callback,
    doLeftAndRightSwapInRTL: Boolean,
    forceRTL: Boolean => Callback,
    getConstants: CallbackTo[DoLeftAndRightSwapInRTL],
    isRTL: Boolean,
    swapLeftAndRightInRTL: Boolean => Callback
  ): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1((t0: Boolean) => allowRTL(t0).runNow()), doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], forceRTL = js.Any.fromFunction1((t0: Boolean) => forceRTL(t0).runNow()), getConstants = getConstants.toJsFn, isRTL = isRTL.asInstanceOf[js.Any], swapLeftAndRightInRTL = js.Any.fromFunction1((t0: Boolean) => swapLeftAndRightInRTL(t0).runNow()))
    __obj.asInstanceOf[I18nManagerStatic]
  }
  
  extension [Self <: I18nManagerStatic](x: Self) {
    
    inline def setAllowRTL(value: Boolean => Callback): Self = StObject.set(x, "allowRTL", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setDoLeftAndRightSwapInRTL(value: Boolean): Self = StObject.set(x, "doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    inline def setForceRTL(value: Boolean => Callback): Self = StObject.set(x, "forceRTL", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetConstants(value: CallbackTo[DoLeftAndRightSwapInRTL]): Self = StObject.set(x, "getConstants", value.toJsFn)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setSwapLeftAndRightInRTL(value: Boolean => Callback): Self = StObject.set(x, "swapLeftAndRightInRTL", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
