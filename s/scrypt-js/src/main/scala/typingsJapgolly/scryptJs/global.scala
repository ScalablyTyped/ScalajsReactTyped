package typingsJapgolly.scryptJs

import typingsJapgolly.scryptJs.mod.ProgressCallback
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object scrypt {
    
    @JSGlobal("scrypt")
    @js.native
    val ^ : js.Any = js.native
    inline def scrypt(
      password: ArrayLike[Double],
      salt: ArrayLike[Double],
      N: Double,
      r: Double,
      p: Double,
      dkLen: Double
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def scrypt(
      password: ArrayLike[Double],
      salt: ArrayLike[Double],
      N: Double,
      r: Double,
      p: Double,
      dkLen: Double,
      callback: ProgressCallback
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    inline def syncScrypt(
      password: ArrayLike[Double],
      salt: ArrayLike[Double],
      N: Double,
      r: Double,
      p: Double,
      dkLen: Double
    ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("syncScrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
}
