package typingsJapgolly.httpErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsHttpError extends StObject {
    
    def isHttpError(error: Any): /* is http-errors.http-errors.HttpError<number> */ Boolean
    @JSName("isHttpError")
    var isHttpError_Original: typingsJapgolly.httpErrors.mod.IsHttpError
  }
  object IsHttpError {
    
    inline def apply(isHttpError: /* error */ Any => /* is http-errors.http-errors.HttpError<number> */ Boolean): IsHttpError = {
      val __obj = js.Dynamic.literal(isHttpError = js.Any.fromFunction1(isHttpError))
      __obj.asInstanceOf[IsHttpError]
    }
    
    extension [Self <: IsHttpError](x: Self) {
      
      inline def setIsHttpError(value: /* error */ Any => /* is http-errors.http-errors.HttpError<number> */ Boolean): Self = StObject.set(x, "isHttpError", js.Any.fromFunction1(value))
    }
  }
}
