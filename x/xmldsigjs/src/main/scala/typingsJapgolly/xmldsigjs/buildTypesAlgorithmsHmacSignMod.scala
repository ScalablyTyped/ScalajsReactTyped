package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesAlgorithmsHmacSignMod {
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HMAC")
  @js.native
  val HMAC: /* "HMAC" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HMAC_SHA1_NAMESPACE")
  @js.native
  val HMAC_SHA1_NAMESPACE: /* "http://www.w3.org/2000/09/xmldsig#hmac-sha1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HMAC_SHA256_NAMESPACE")
  @js.native
  val HMAC_SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HMAC_SHA384_NAMESPACE")
  @js.native
  val HMAC_SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HMAC_SHA512_NAMESPACE")
  @js.native
  val HMAC_SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HmacSha1")
  @js.native
  open class HmacSha1 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HmacSha256")
  @js.native
  open class HmacSha256 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HmacSha384")
  @js.native
  open class HmacSha384 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/hmac_sign", "HmacSha512")
  @js.native
  open class HmacSha512 () extends SignatureAlgorithm
}
