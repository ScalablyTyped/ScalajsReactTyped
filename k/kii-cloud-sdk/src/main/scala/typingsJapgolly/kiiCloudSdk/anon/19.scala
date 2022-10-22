package typingsJapgolly.kiiCloudSdk.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(): Any
}
object `19` {
  
  inline def apply(failure: js.Error => Any, success: CallbackTo[Any]): `19` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = success.toJsFn)
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: CallbackTo[Any]): Self = StObject.set(x, "success", value.toJsFn)
  }
}
