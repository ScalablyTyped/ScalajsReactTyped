package typingsJapgolly.requestPromiseNative

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import typingsJapgolly.request.mod.Response
import typingsJapgolly.request.mod.UriOptions
import typingsJapgolly.request.mod.UrlOptions
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("request-promise-native", JSImport.Namespace)
  @js.native
  val ^ : RequestPromiseAPI = js.native
  
  type FullResponse = Response
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.requestPromiseNative.mod.OptionsWithUri
    - typingsJapgolly.requestPromiseNative.mod.OptionsWithUrl
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithUri(uri: String | Url): typingsJapgolly.requestPromiseNative.mod.OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestPromiseNative.mod.OptionsWithUri]
    }
    
    inline def OptionsWithUrl(url: String | Url): typingsJapgolly.requestPromiseNative.mod.OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestPromiseNative.mod.OptionsWithUrl]
    }
  }
  
  trait OptionsWithUri
    extends StObject
       with UriOptions
       with RequestPromiseOptions
       with Options
  object OptionsWithUri {
    
    inline def apply(uri: String | Url): OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUri]
    }
  }
  
  trait OptionsWithUrl
    extends StObject
       with UrlOptions
       with RequestPromiseOptions
       with Options
  object OptionsWithUrl {
    
    inline def apply(url: String | Url): OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUrl]
    }
  }
  
  @js.native
  trait RequestPromise[T]
    extends StObject
       with Request
       with Promise[T] {
    
    def promise(): js.Promise[T] = js.native
  }
  
  type RequestPromiseAPI = RequestAPI[RequestPromise[Any], RequestPromiseOptions, RequiredUriUrl]
  
  trait RequestPromiseOptions
    extends StObject
       with CoreOptions {
    
    var resolveWithFullResponse: js.UndefOr[Boolean] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[
          /* body */ Any, 
          /* response */ Response, 
          /* resolveWithFullResponse */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    var transform2xxOnly: js.UndefOr[Boolean] = js.undefined
  }
  object RequestPromiseOptions {
    
    inline def apply(): RequestPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestPromiseOptions]
    }
    
    extension [Self <: RequestPromiseOptions](x: Self) {
      
      inline def setResolveWithFullResponse(value: Boolean): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
      
      inline def setResolveWithFullResponseUndefined: Self = StObject.set(x, "resolveWithFullResponse", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setTransform(
        value: (/* body */ Any, /* response */ Response, /* resolveWithFullResponse */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransform2xxOnly(value: Boolean): Self = StObject.set(x, "transform2xxOnly", value.asInstanceOf[js.Any])
      
      inline def setTransform2xxOnlyUndefined: Self = StObject.set(x, "transform2xxOnly", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = RequestPromiseAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RequestPromiseAPI = ^
}
