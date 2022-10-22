package typingsJapgolly.createHmac

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.Hmac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algo: Algorithm, key: String): Hmac = (^.asInstanceOf[js.Dynamic].apply(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def apply(algo: Algorithm, key: Buffer): Hmac = (^.asInstanceOf[js.Dynamic].apply(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.createHmac.createHmacStrings.rmd160
    - typingsJapgolly.createHmac.createHmacStrings.ripemd160
    - typingsJapgolly.createHmac.createHmacStrings.md5
    - typingsJapgolly.createHmac.createHmacStrings.sha
    - typingsJapgolly.createHmac.createHmacStrings.sha1
    - typingsJapgolly.createHmac.createHmacStrings.sha224
    - typingsJapgolly.createHmac.createHmacStrings.sha256
    - typingsJapgolly.createHmac.createHmacStrings.sha384
    - typingsJapgolly.createHmac.createHmacStrings.sha512
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def md5: typingsJapgolly.createHmac.createHmacStrings.md5 = "md5".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.md5]
    
    inline def ripemd160: typingsJapgolly.createHmac.createHmacStrings.ripemd160 = "ripemd160".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.ripemd160]
    
    inline def rmd160: typingsJapgolly.createHmac.createHmacStrings.rmd160 = "rmd160".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.rmd160]
    
    inline def sha: typingsJapgolly.createHmac.createHmacStrings.sha = "sha".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha]
    
    inline def sha1: typingsJapgolly.createHmac.createHmacStrings.sha1 = "sha1".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha1]
    
    inline def sha224: typingsJapgolly.createHmac.createHmacStrings.sha224 = "sha224".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha224]
    
    inline def sha256: typingsJapgolly.createHmac.createHmacStrings.sha256 = "sha256".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha256]
    
    inline def sha384: typingsJapgolly.createHmac.createHmacStrings.sha384 = "sha384".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha384]
    
    inline def sha512: typingsJapgolly.createHmac.createHmacStrings.sha512 = "sha512".asInstanceOf[typingsJapgolly.createHmac.createHmacStrings.sha512]
  }
}
