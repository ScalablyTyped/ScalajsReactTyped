package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpRequestBodyMod {
  
  inline def apply(request: Request): Unit = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/RequestBody", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RequestBody {
    def this(request: Request) = this()
    
    /* CompleteClass */
    override def asJson(): Any = js.native
    
    /* CompleteClass */
    override def asText(): String = js.native
    
    /* private */ /* CompleteClass */
    var request_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/http/RequestBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Request = typingsJapgolly.nginstackEngine.libHttpRequestMod.^
  
  trait RequestBody extends StObject {
    
    def asJson(): Any
    
    def asText(): String
    
    /* private */ var request_ : Any
  }
  object RequestBody {
    
    inline def apply(asJson: CallbackTo[Any], asText: CallbackTo[String], request_ : Any): RequestBody = {
      val __obj = js.Dynamic.literal(asJson = asJson.toJsFn, asText = asText.toJsFn, request_ = request_.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestBody]
    }
    
    extension [Self <: RequestBody](x: Self) {
      
      inline def setAsJson(value: CallbackTo[Any]): Self = StObject.set(x, "asJson", value.toJsFn)
      
      inline def setAsText(value: CallbackTo[String]): Self = StObject.set(x, "asText", value.toJsFn)
      
      inline def setRequest_(value: Any): Self = StObject.set(x, "request_", value.asInstanceOf[js.Any])
    }
  }
}
