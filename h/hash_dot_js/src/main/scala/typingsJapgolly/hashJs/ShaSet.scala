package typingsJapgolly.hashJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaSet extends StObject {
  
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
}
object ShaSet {
  
  inline def apply(
    sha1: CallbackTo[Sha1],
    sha224: CallbackTo[Sha224],
    sha256: CallbackTo[Sha256],
    sha384: CallbackTo[Sha384],
    sha512: CallbackTo[Sha512]
  ): ShaSet = {
    val __obj = js.Dynamic.literal(sha1 = sha1.toJsFn, sha224 = sha224.toJsFn, sha256 = sha256.toJsFn, sha384 = sha384.toJsFn, sha512 = sha512.toJsFn)
    __obj.asInstanceOf[ShaSet]
  }
  
  extension [Self <: ShaSet](x: Self) {
    
    inline def setSha1(value: CallbackTo[Sha1]): Self = StObject.set(x, "sha1", value.toJsFn)
    
    inline def setSha224(value: CallbackTo[Sha224]): Self = StObject.set(x, "sha224", value.toJsFn)
    
    inline def setSha256(value: CallbackTo[Sha256]): Self = StObject.set(x, "sha256", value.toJsFn)
    
    inline def setSha384(value: CallbackTo[Sha384]): Self = StObject.set(x, "sha384", value.toJsFn)
    
    inline def setSha512(value: CallbackTo[Sha512]): Self = StObject.set(x, "sha512", value.toJsFn)
  }
}
