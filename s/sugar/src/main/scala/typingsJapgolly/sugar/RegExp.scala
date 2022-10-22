package typingsJapgolly.sugar

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExp extends StObject {
  
  def addFlags(flags: java.lang.String): RegExp
  
  def getFlags(): java.lang.String
  
  def removeFlags(flags: java.lang.String): RegExp
  
  def setFlags(flags: java.lang.String): RegExp
}
object RegExp {
  
  inline def apply(
    addFlags: java.lang.String => RegExp,
    getFlags: CallbackTo[java.lang.String],
    removeFlags: java.lang.String => RegExp,
    setFlags: java.lang.String => RegExp
  ): RegExp = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), getFlags = getFlags.toJsFn, removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags))
    __obj.asInstanceOf[RegExp]
  }
  
  extension [Self <: RegExp](x: Self) {
    
    inline def setAddFlags(value: java.lang.String => RegExp): Self = StObject.set(x, "addFlags", js.Any.fromFunction1(value))
    
    inline def setGetFlags(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getFlags", value.toJsFn)
    
    inline def setRemoveFlags(value: java.lang.String => RegExp): Self = StObject.set(x, "removeFlags", js.Any.fromFunction1(value))
    
    inline def setSetFlags(value: java.lang.String => RegExp): Self = StObject.set(x, "setFlags", js.Any.fromFunction1(value))
  }
}
