package typingsJapgolly.requestAsCurl

import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl], body: Any): String = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("request-as-curl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serialize(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(request.asInstanceOf[js.Any]).asInstanceOf[String]
}
