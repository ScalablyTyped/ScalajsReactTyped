package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkSignatureV4.anon.HttpRequestqueryQueryPara
import typingsJapgolly.awsSdkSignatureV4.anon.UnhoistableHeaders
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HeaderBag
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpRequest
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signature-v4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/signature-v4", "SignatureV4")
  @js.native
  open class SignatureV4 protected ()
    extends typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4 {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init & SignatureV4CryptoInit) = this()
  }
  
  inline def clearCredentialCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCredentialCache")().asInstanceOf[Unit]
  
  inline def createScope(shortDate: String, region: String, service: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createScope")(shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCanonicalHeaders(hasHeaders: HttpRequest): HeaderBag = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any]).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Unit, signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(hasHeaders: HttpRequest, unsignableHeaders: Set[String], signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(hasHeaders.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  
  inline def getCanonicalQuery(hasQuery: HttpRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalQuery")(hasQuery.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPayloadHash(hasHeadersBody: HttpRequest, hashConstructor: HashConstructor): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayloadHash")(hasHeadersBody.asInstanceOf[js.Any], hashConstructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSigningKey")(sha256Constructor.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def moveHeadersToQuery(request: HttpRequest): HttpRequestqueryQueryPara = ^.asInstanceOf[js.Dynamic].applyDynamic("moveHeadersToQuery")(request.asInstanceOf[js.Any]).asInstanceOf[HttpRequestqueryQueryPara]
  inline def moveHeadersToQuery(request: HttpRequest, options: UnhoistableHeaders): HttpRequestqueryQueryPara = (^.asInstanceOf[js.Dynamic].applyDynamic("moveHeadersToQuery")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpRequestqueryQueryPara]
  
  inline def prepareRequest(request: HttpRequest): HttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareRequest")(request.asInstanceOf[js.Any]).asInstanceOf[HttpRequest]
}
