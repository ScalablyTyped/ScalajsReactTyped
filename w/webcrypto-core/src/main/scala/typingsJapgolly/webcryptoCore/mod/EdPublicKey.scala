package typingsJapgolly.webcryptoCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.peculiarJsonSchema.buildTypesTypesMod.IJsonConvertible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdPublicKey
  extends StObject
     with IJsonConvertible[Any] {
  
  var value: js.typedarray.ArrayBuffer
}
object EdPublicKey {
  
  inline def apply(fromJSON: Any => EdPublicKey, toJSON: CallbackTo[Any], value: js.typedarray.ArrayBuffer): EdPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = toJSON.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdPublicKey]
  }
  
  extension [Self <: EdPublicKey](x: Self) {
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
