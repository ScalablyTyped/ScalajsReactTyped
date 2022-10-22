package typingsJapgolly.firebaseAuth.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMetadata2
  extends StObject
     with UserMetadata {
  
  def _copy(metadata: UserMetadata2): Unit
  
  /* private */ var _initializeTime: Any
  
  /* private */ var createdAt: Any
  
  /* private */ var lastLoginAt: Any
  
  def toJSON(): js.Object
}
object UserMetadata2 {
  
  inline def apply(
    _copy: UserMetadata2 => Callback,
    _initializeTime: Any,
    createdAt: Any,
    lastLoginAt: Any,
    toJSON: CallbackTo[js.Object]
  ): UserMetadata2 = {
    val __obj = js.Dynamic.literal(_copy = js.Any.fromFunction1((t0: UserMetadata2) => _copy(t0).runNow()), _initializeTime = _initializeTime.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastLoginAt = lastLoginAt.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[UserMetadata2]
  }
  
  extension [Self <: UserMetadata2](x: Self) {
    
    inline def setCreatedAt(value: Any): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAt(value: Any): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def set_copy(value: UserMetadata2 => Callback): Self = StObject.set(x, "_copy", js.Any.fromFunction1((t0: UserMetadata2) => value(t0).runNow()))
    
    inline def set_initializeTime(value: Any): Self = StObject.set(x, "_initializeTime", value.asInstanceOf[js.Any])
  }
}
