package typingsJapgolly.ejWebAll.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdevice extends StObject {
  
  def isAndroid(): Boolean
  
  def isFlat(): Boolean
  
  def isIOS(): Boolean
  
  def isIOS7(): Boolean
  
  def isWindows(): Boolean
}
object Typeofdevice {
  
  inline def apply(
    isAndroid: CallbackTo[Boolean],
    isFlat: CallbackTo[Boolean],
    isIOS: CallbackTo[Boolean],
    isIOS7: CallbackTo[Boolean],
    isWindows: CallbackTo[Boolean]
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal(isAndroid = isAndroid.toJsFn, isFlat = isFlat.toJsFn, isIOS = isIOS.toJsFn, isIOS7 = isIOS7.toJsFn, isWindows = isWindows.toJsFn)
    __obj.asInstanceOf[Typeofdevice]
  }
  
  extension [Self <: Typeofdevice](x: Self) {
    
    inline def setIsAndroid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAndroid", value.toJsFn)
    
    inline def setIsFlat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFlat", value.toJsFn)
    
    inline def setIsIOS(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIOS", value.toJsFn)
    
    inline def setIsIOS7(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIOS7", value.toJsFn)
    
    inline def setIsWindows(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWindows", value.toJsFn)
  }
}
