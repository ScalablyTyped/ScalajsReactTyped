package typingsJapgolly.nobleHashes

import typingsJapgolly.nobleHashes.anon.ReadonlyderiveChildKeypro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eskdfMod {
  
  @JSImport("@noble/hashes/eskdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deriveMainSeed(username: String, password: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveMainSeed")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def eskdf(username: String, password: String): js.Promise[ReadonlyderiveChildKeypro] = (^.asInstanceOf[js.Dynamic].applyDynamic("eskdf")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadonlyderiveChildKeypro]]
  
  inline def pbkdf2(password: String, salt: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def scrypt(password: String, salt: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  type AccountID = Double | String
  
  type ESKDF_ = js.Promise[ReadonlyderiveChildKeypro]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsJapgolly.nobleHashes.eskdfMod.OptsLength
    - typingsJapgolly.nobleHashes.eskdfMod.OptsMod
  */
  type KeyOpts = js.UndefOr[_KeyOpts]
  
  trait OptsLength
    extends StObject
       with _KeyOpts {
    
    var keyLength: Double
  }
  object OptsLength {
    
    inline def apply(keyLength: Double): OptsLength = {
      val __obj = js.Dynamic.literal(keyLength = keyLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptsLength]
    }
    
    extension [Self <: OptsLength](x: Self) {
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptsMod
    extends StObject
       with _KeyOpts {
    
    var modulus: js.BigInt
  }
  object OptsMod {
    
    inline def apply(modulus: js.BigInt): OptsMod = {
      val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptsMod]
    }
    
    extension [Self <: OptsMod](x: Self) {
      
      inline def setModulus(value: js.BigInt): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    }
  }
  
  trait _KeyOpts extends StObject
  object _KeyOpts {
    
    inline def OptsLength(keyLength: Double): typingsJapgolly.nobleHashes.eskdfMod.OptsLength = {
      val __obj = js.Dynamic.literal(keyLength = keyLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nobleHashes.eskdfMod.OptsLength]
    }
    
    inline def OptsMod(modulus: js.BigInt): typingsJapgolly.nobleHashes.eskdfMod.OptsMod = {
      val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nobleHashes.eskdfMod.OptsMod]
    }
  }
}
