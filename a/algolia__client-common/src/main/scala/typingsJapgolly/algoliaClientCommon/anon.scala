package typingsJapgolly.algoliaClientCommon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.algoliaTransporter.mod.HostOptions
import typingsJapgolly.algoliaTransporter.mod.QueryParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    /**
      * The headers used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val headers: js.UndefOr[typingsJapgolly.algoliaTransporter.mod.Headers] = js.undefined
    
    /**
      * The hosts used by the requester.
      */
    val hosts: js.UndefOr[js.Array[HostOptions]] = js.undefined
    
    /**
      * The query parameters used by the requester. The transporter
      * layer may add some extra headers during the request
      * for the user agent, and others.
      */
    val queryParameters: js.UndefOr[QueryParameters] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: typingsJapgolly.algoliaTransporter.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHosts(value: js.Array[HostOptions]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: HostOptions*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setQueryParameters(value: QueryParameters): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    }
  }
  
  trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ Any, Any]]] */, TClient] extends StObject {
    
    val methods: js.UndefOr[TMethods] = js.undefined
  }
  object Methods {
    
    inline def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ Any, Any]]] */, TClient](): Methods[TMethods, TClient] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Methods[TMethods, TClient]]
    }
    
    extension [Self <: Methods[?, ?], TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ Any, Any]]] */, TClient](x: Self & (Methods[TMethods, TClient])) {
      
      inline def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<any>> */
  trait ReadonlyPromiseany extends StObject {
    
    def `catch`[TResult](): js.Promise[Any | TResult]
    
    def `finally`(): js.Promise[Any]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseany {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[Any | Any]],
      `finally`: CallbackTo[js.Promise[Any]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseany]
    }
    
    extension [Self <: ReadonlyPromiseany](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<void>> */
  trait ReadonlyPromisevoid extends StObject {
    
    def `catch`[TResult](): js.Promise[Unit | TResult]
    
    def `finally`(): js.Promise[Unit]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromisevoid {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[Unit | Any]],
      `finally`: CallbackTo[js.Promise[Unit]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromisevoid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromisevoid]
    }
    
    extension [Self <: ReadonlyPromisevoid](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[Unit | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  trait Transporter extends StObject {
    
    val transporter: typingsJapgolly.algoliaTransporter.mod.Transporter
  }
  object Transporter {
    
    inline def apply(transporter: typingsJapgolly.algoliaTransporter.mod.Transporter): Transporter = {
      val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transporter]
    }
    
    extension [Self <: Transporter](x: Self) {
      
      inline def setTransporter(value: typingsJapgolly.algoliaTransporter.mod.Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
}
