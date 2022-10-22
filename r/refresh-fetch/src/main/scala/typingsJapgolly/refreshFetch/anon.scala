package typingsJapgolly.refreshFetch

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body[ResponseBody] extends StObject {
    
    /* tslint:disable-next-line no-unnecessary-generics */
    var body: ResponseBody
    
    var response: Response
  }
  object Body {
    
    inline def apply[ResponseBody](body: ResponseBody, response: Response): Body[ResponseBody] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body[ResponseBody]]
    }
    
    extension [Self <: Body[?], ResponseBody](x: Self & Body[ResponseBody]) {
      
      inline def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fetch[T] extends StObject {
    
    var fetch: T
    
    def refreshToken(): js.Promise[Unit]
    
    def shouldRefreshToken(error: Any): Boolean
  }
  object Fetch {
    
    inline def apply[T](fetch: T, refreshToken: CallbackTo[js.Promise[Unit]], shouldRefreshToken: Any => Boolean): Fetch[T] = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = refreshToken.toJsFn, shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
      __obj.asInstanceOf[Fetch[T]]
    }
    
    extension [Self <: Fetch[?], T](x: Self & Fetch[T]) {
      
      inline def setFetch(value: T): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "refreshToken", value.toJsFn)
      
      inline def setShouldRefreshToken(value: Any => Boolean): Self = StObject.set(x, "shouldRefreshToken", js.Any.fromFunction1(value))
    }
  }
}
