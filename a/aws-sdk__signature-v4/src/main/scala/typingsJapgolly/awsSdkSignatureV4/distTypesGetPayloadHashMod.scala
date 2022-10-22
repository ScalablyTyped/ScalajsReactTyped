package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetPayloadHashMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getPayloadHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPayloadHash(hasHeadersBody: HttpRequest, hashConstructor: HashConstructor): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayloadHash")(hasHeadersBody.asInstanceOf[js.Any], hashConstructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
