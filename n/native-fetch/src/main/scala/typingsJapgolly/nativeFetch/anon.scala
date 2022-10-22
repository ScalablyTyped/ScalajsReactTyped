package typingsJapgolly.nativeFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.Headers
import org.scalajs.dom.Request
import org.scalajs.dom.Response
import org.scalajs.dom.ResponseInit
import org.scalajs.dom.URL
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import typingsJapgolly.undici.typesFetchMod.RequestInfo
import typingsJapgolly.undici.typesFetchMod.RequestInit
import typingsJapgolly.undici.typesFetchMod.ResponseRedirectStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error
    extends StObject
       with Instantiable0[Response]
       with Instantiable1[/* body */ BodyInit, Response]
       with Instantiable2[
          (/* body */ BodyInit) | (/* body */ Null) | (/* body */ Unit), 
          /* init */ ResponseInit, 
          Response
        ] {
    
    def error(): Response = js.native
    
    def redirect(url: String): Response = js.native
    def redirect(url: String, status: Double): Response = js.native
    def redirect(url: URL): Response = js.native
    def redirect(url: URL, status: Double): Response = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[typingsJapgolly.undici.typesFetchMod.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.undici.typesFetchMod.Response] = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Headers]
       with Instantiable1[/* init */ HeadersInit, Headers]
  
  @js.native
  trait InstantiableRequest
    extends StObject
       with Instantiable1[/* input */ typingsJapgolly.std.RequestInfo, Request]
       with Instantiable2[
          /* input */ typingsJapgolly.std.RequestInfo, 
          /* init */ org.scalajs.dom.RequestInit, 
          Request
        ]
  
  @js.native
  trait TypeofResponse
    extends StObject
       with Instantiable0[typingsJapgolly.undici.mod.Response] {
    
    def error(): typingsJapgolly.undici.typesFetchMod.Response = js.native
    
    def json(data: Any): typingsJapgolly.undici.typesFetchMod.Response = js.native
    def json(data: Any, init: typingsJapgolly.undici.typesFetchMod.ResponseInit): typingsJapgolly.undici.typesFetchMod.Response = js.native
    
    def redirect(url: String, status: ResponseRedirectStatus): typingsJapgolly.undici.typesFetchMod.Response = js.native
    def redirect(url: URL_, status: ResponseRedirectStatus): typingsJapgolly.undici.typesFetchMod.Response = js.native
  }
}
