package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HeaderBag
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpRequest
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetCanonicalHeadersMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getCanonicalHeaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanonicalHeaders(hasHeaders: HttpRequest): HeaderBag = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any]).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Unit, signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Set[String], signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
}
