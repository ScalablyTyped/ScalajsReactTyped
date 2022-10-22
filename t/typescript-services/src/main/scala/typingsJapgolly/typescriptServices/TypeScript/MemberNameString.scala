package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberNameString
  extends StObject
     with MemberName {
  
  var text: String
}
object MemberNameString {
  
  inline def apply(
    isArray: CallbackTo[Boolean],
    isMarker: CallbackTo[Boolean],
    isString: CallbackTo[Boolean],
    prefix: String,
    suffix: String,
    text: String
  ): MemberNameString = {
    val __obj = js.Dynamic.literal(isArray = isArray.toJsFn, isMarker = isMarker.toJsFn, isString = isString.toJsFn, prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberNameString]
  }
  
  extension [Self <: MemberNameString](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
