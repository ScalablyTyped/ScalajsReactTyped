package typingsJapgolly.unfetch

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Blob
import org.scalajs.dom.Headers
import org.scalajs.dom.Request
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import typingsJapgolly.unfetch.anon.Body
import typingsJapgolly.unfetch.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("unfetch", JSImport.Default)
    @js.native
    val ^ : Unfetch_ = js.native
    
    type _To = Unfetch_
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Unfetch_ = ^
  }
  
  trait UnfetchResponse extends StObject {
    
    def blob(): js.Promise[Blob]
    
    var headers: Entries
    
    def json(): js.Promise[Any]
    
    var ok: Boolean
    
    var status: Double
    
    var statusText: String
    
    def text(): js.Promise[String]
    
    var url: String
  }
  object UnfetchResponse {
    
    inline def apply(
      blob: CallbackTo[js.Promise[Blob]],
      headers: Entries,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      url: String
    ): UnfetchResponse = {
      val __obj = js.Dynamic.literal(blob = blob.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnfetchResponse]
    }
    
    extension [Self <: UnfetchResponse](x: Self) {
      
      inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setHeaders(value: Entries): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Unfetch_ = js.Function2[/* url */ String, /* options */ js.UndefOr[Body], js.Promise[UnfetchResponse]]
  
  object unfetch {
    
    type IsomorphicBody = org.scalajs.dom.Body | typingsJapgolly.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typingsJapgolly.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typingsJapgolly.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typingsJapgolly.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typingsJapgolly.nodeFetch.mod.Response
  }
}
