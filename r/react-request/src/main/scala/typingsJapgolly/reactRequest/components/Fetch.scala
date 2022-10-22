package typingsJapgolly.reactRequest.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRequest.mod.FetchProps
import typingsJapgolly.reactRequest.mod.FetchResponse
import typingsJapgolly.reactRequest.mod.RenderProps
import typingsJapgolly.reactRequest.mod.ResponseType
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fetch {
  
  inline def apply[T](url: String): Builder[T] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[FetchProps[T]]))
  }
  
  @JSImport("react-request", "Fetch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRequest.mod.Fetch[T]] {
    
    inline def afterFetch(value: /* args */ FetchResponse[T] => Callback): this.type = set("afterFetch", js.Any.fromFunction1((t0: /* args */ FetchResponse[T]) => value(t0).runNow()))
    
    inline def body(value: BodyInit): this.type = set("body", value.asInstanceOf[js.Any])
    
    inline def bodyNull: this.type = set("body", null)
    
    inline def cache(value: RequestCache): this.type = set("cache", value.asInstanceOf[js.Any])
    
    inline def children(value: /* renderProps */ RenderProps[T] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def credentials(value: RequestCredentials): this.type = set("credentials", value.asInstanceOf[js.Any])
    
    inline def headers(value: HeadersInit): this.type = set("headers", value.asInstanceOf[js.Any])
    
    inline def headersVarargs(value: (js.Tuple2[String, String])*): this.type = set("headers", js.Array(value*))
    
    inline def integrity(value: String): this.type = set("integrity", value.asInstanceOf[js.Any])
    
    inline def keepalive(value: Boolean): this.type = set("keepalive", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def mode(value: RequestMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def redirect(value: RequestRedirect): this.type = set("redirect", value.asInstanceOf[js.Any])
    
    inline def referrer(value: String): this.type = set("referrer", value.asInstanceOf[js.Any])
    
    inline def referrerPolicy(value: ReferrerPolicy): this.type = set("referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def responseType(value: ResponseType): this.type = set("responseType", value.asInstanceOf[js.Any])
    
    inline def signal(value: AbortSignal): this.type = set("signal", value.asInstanceOf[js.Any])
    
    inline def signalNull: this.type = set("signal", null)
    
    inline def transformData(value: /* data */ Any => T): this.type = set("transformData", js.Any.fromFunction1(value))
  }
  
  def withProps[T](p: FetchProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
