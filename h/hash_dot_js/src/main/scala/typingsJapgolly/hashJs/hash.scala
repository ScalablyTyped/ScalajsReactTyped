package typingsJapgolly.hashJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  def hmac(hash: BlockHash[Any], key: Any): Hmac
  @JSName("hmac")
  var hmac_Original: HmacConstructor
  @JSName("hmac")
  def hmac_hex(hash: BlockHash[Any], key: Any, enc: hex): Hmac
  
  var ripemd: RipemdSet
  
  def ripemd160(): Ripemd160
  @JSName("ripemd160")
  var ripemd160_Original: Ripemd160Constructor
  
  var sha: ShaSet
  
  def sha1(): Sha1
  @JSName("sha1")
  var sha1_Original: Sha1Constructor
  
  def sha224(): Sha224
  @JSName("sha224")
  var sha224_Original: Sha224Constructor
  
  def sha256(): Sha256
  @JSName("sha256")
  var sha256_Original: Sha256Constructor
  
  def sha384(): Sha384
  @JSName("sha384")
  var sha384_Original: Sha384Constructor
  
  def sha512(): Sha512
  @JSName("sha512")
  var sha512_Original: Sha512Constructor
  
  var utils: Utils
}
object Hash {
  
  inline def apply(
    hmac: (/* hash */ BlockHash[Any], /* key */ Any, /* enc */ js.UndefOr[hex]) => Hmac,
    ripemd: RipemdSet,
    ripemd160: CallbackTo[Ripemd160],
    sha: ShaSet,
    sha1: CallbackTo[Sha1],
    sha224: CallbackTo[Sha224],
    sha256: CallbackTo[Sha256],
    sha384: CallbackTo[Sha384],
    sha512: CallbackTo[Sha512],
    utils: Utils
  ): Hash = {
    val __obj = js.Dynamic.literal(hmac = js.Any.fromFunction3(hmac), ripemd = ripemd.asInstanceOf[js.Any], ripemd160 = ripemd160.toJsFn, sha = sha.asInstanceOf[js.Any], sha1 = sha1.toJsFn, sha224 = sha224.toJsFn, sha256 = sha256.toJsFn, sha384 = sha384.toJsFn, sha512 = sha512.toJsFn, utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHmac(value: (/* hash */ BlockHash[Any], /* key */ Any, /* enc */ js.UndefOr[hex]) => Hmac): Self = StObject.set(x, "hmac", js.Any.fromFunction3(value))
    
    inline def setRipemd(value: RipemdSet): Self = StObject.set(x, "ripemd", value.asInstanceOf[js.Any])
    
    inline def setRipemd160(value: CallbackTo[Ripemd160]): Self = StObject.set(x, "ripemd160", value.toJsFn)
    
    inline def setSha(value: ShaSet): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: CallbackTo[Sha1]): Self = StObject.set(x, "sha1", value.toJsFn)
    
    inline def setSha224(value: CallbackTo[Sha224]): Self = StObject.set(x, "sha224", value.toJsFn)
    
    inline def setSha256(value: CallbackTo[Sha256]): Self = StObject.set(x, "sha256", value.toJsFn)
    
    inline def setSha384(value: CallbackTo[Sha384]): Self = StObject.set(x, "sha384", value.toJsFn)
    
    inline def setSha512(value: CallbackTo[Sha512]): Self = StObject.set(x, "sha512", value.toJsFn)
    
    inline def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
  }
}
