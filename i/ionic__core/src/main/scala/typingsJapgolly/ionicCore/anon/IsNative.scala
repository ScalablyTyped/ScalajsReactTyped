package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNative extends StObject {
  
  var isNative: Boolean
}
object IsNative {
  
  inline def apply(isNative: Boolean): IsNative = {
    val __obj = js.Dynamic.literal(isNative = isNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNative]
  }
  
  extension [Self <: IsNative](x: Self) {
    
    inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
  }
}
