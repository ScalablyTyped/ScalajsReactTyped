package typingsJapgolly.requestPromise

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bluebird.mod.Bluebird
import typingsJapgolly.bluebird.mod.CatchFilter
import typingsJapgolly.bluebird.mod.Constructor
import typingsJapgolly.bluebird.mod.Resolvable
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import typingsJapgolly.request.mod.Response
import typingsJapgolly.request.mod.UriOptions
import typingsJapgolly.request.mod.UrlOptions
import typingsJapgolly.requestPromise.anon.FnCall
import typingsJapgolly.requestPromise.anon.FnCallFilter1Filter2Filter3Filter4Filter5OnReject
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("request-promise", JSImport.Namespace)
  @js.native
  val ^ : RequestPromiseAPI[Any] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.requestPromise.mod.OptionsWithUri
    - typingsJapgolly.requestPromise.mod.OptionsWithUrl
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithUri(uri: String | Url): typingsJapgolly.requestPromise.mod.OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestPromise.mod.OptionsWithUri]
    }
    
    inline def OptionsWithUrl(url: String | Url): typingsJapgolly.requestPromise.mod.OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestPromise.mod.OptionsWithUrl]
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
  trait RequestPromise[T] extends Request {
    
    def cancel(): Unit = js.native
    @JSName("cancel")
    var cancel_Original: js.Function0[Unit] = js.native
    
    def `catch`[U](): Bluebird[U | T] = js.native
    def `catch`[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | T] = js.native
    def `catch`[U, E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    @JSName("catch")
    var catch_Original: FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] = js.native
    
    def `finally`(handler: js.Function0[Resolvable[Any]]): Bluebird[T] = js.native
    @JSName("finally")
    var finally_Original: js.Function1[/* handler */ js.Function0[Resolvable[Any]], Bluebird[T]] = js.native
    
    def promise(): typingsJapgolly.bluebird.mod.^[T] = js.native
    
    def `then`[U](): Bluebird[U] = js.native
    def `then`[U](onFulfill: js.Function1[/* value */ T, Resolvable[U]]): Bluebird[U] = js.native
    def `then`[U](
      onFulfill: js.Function1[/* value */ T, Resolvable[U]],
      onReject: js.Function1[/* error */ Any, Resolvable[U]]
    ): Bluebird[U] = js.native
    def `then`[U](onFulfill: Unit, onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCall[T] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, Resolvable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, Resolvable[TResult1]],
      onrejected: js.Function1[/* reason */ Any, Resolvable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2_Bluebird[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2_PromiseLike[TResult1, TResult2](): PromiseLike[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2_PromiseLike[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]]): PromiseLike[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2_PromiseLike[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): PromiseLike[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2_PromiseLike[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
  }
  
  type RequestPromiseAPI[T] = RequestAPI[RequestPromise[T], RequestPromiseOptions, RequiredUriUrl]
  
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
  
  type _To = RequestPromiseAPI[Any]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RequestPromiseAPI[Any] = ^
}
