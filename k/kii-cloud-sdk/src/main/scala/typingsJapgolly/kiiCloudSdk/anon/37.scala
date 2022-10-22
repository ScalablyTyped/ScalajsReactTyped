package typingsJapgolly.kiiCloudSdk.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  def failure(errString: String): Any
  
  def success(): Any
}
object `37` {
  
  inline def apply(failure: String => Any, success: CallbackTo[Any]): `37` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = success.toJsFn)
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setFailure(value: String => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: CallbackTo[Any]): Self = StObject.set(x, "success", value.toJsFn)
  }
}
