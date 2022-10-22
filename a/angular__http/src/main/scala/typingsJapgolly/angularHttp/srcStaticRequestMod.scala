package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.srcBodyMod.Body
import typingsJapgolly.angularHttp.srcEnumsMod.ContentType
import typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod
import typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType
import typingsJapgolly.angularHttp.srcHeadersMod.Headers
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestArgs
import typingsJapgolly.std.ArrayBufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStaticRequestMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@angular/http/src/static_request", "ArrayBuffer")
  @js.native
  open class ArrayBuffer protected ()
    extends StObject
       with typingsJapgolly.std.ArrayBuffer {
    /* standard es5 */
    def this(byteLength: Double) = this()
  }
  @JSImport("@angular/http/src/static_request", "ArrayBuffer")
  @js.native
  val ArrayBuffer: ArrayBufferConstructor = js.native
  
  @JSImport("@angular/http/src/static_request", "Request")
  @js.native
  open class Request protected () extends Body {
    def this(requestOptions: RequestArgs) = this()
    
    /** Type of the request body **/
    /* private */ var contentType: Any = js.native
    
    /**
      * Returns the content type enum based on header options.
      */
    def detectContentType(): ContentType = js.native
    
    /**
      * Returns the content type of request's body based on its type.
      */
    def detectContentTypeFromBody(): ContentType = js.native
    
    /**
      * Returns the request's body according to its type. If body is undefined, return
      * null.
      */
    def getBody(): Any = js.native
    
    /**
      * {@link Headers} instance
      */
    var headers: Headers = js.native
    
    /**
      * Http method with which to perform the request.
      */
    var method: RequestMethod = js.native
    
    /** Buffer to store the response */
    var responseType: ResponseContentType = js.native
    
    /** Url of the remote resource */
    var url: String = js.native
    
    /** Enable use credentials */
    var withCredentials: Boolean = js.native
  }
}
