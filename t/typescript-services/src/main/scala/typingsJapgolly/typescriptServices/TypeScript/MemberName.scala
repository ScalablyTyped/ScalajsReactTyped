package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberName extends StObject {
  
  def isArray(): Boolean
  
  def isMarker(): Boolean
  
  def isString(): Boolean
  
  var prefix: String
  
  var suffix: String
}
object MemberName {
  
  inline def apply(
    isArray: CallbackTo[Boolean],
    isMarker: CallbackTo[Boolean],
    isString: CallbackTo[Boolean],
    prefix: String,
    suffix: String
  ): MemberName = {
    val __obj = js.Dynamic.literal(isArray = isArray.toJsFn, isMarker = isMarker.toJsFn, isString = isString.toJsFn, prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberName]
  }
  
  extension [Self <: MemberName](x: Self) {
    
    inline def setIsArray(value: CallbackTo[Boolean]): Self = StObject.set(x, "isArray", value.toJsFn)
    
    inline def setIsMarker(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMarker", value.toJsFn)
    
    inline def setIsString(value: CallbackTo[Boolean]): Self = StObject.set(x, "isString", value.toJsFn)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
