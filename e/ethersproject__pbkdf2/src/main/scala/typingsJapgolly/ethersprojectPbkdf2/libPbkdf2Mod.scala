package typingsJapgolly.ethersprojectPbkdf2

import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPbkdf2Mod {
  
  @JSImport("@ethersproject/pbkdf2/lib/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbkdf2(password: BytesLike, salt: BytesLike, iterations: Double, keylen: Double, hashAlgorithm: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], hashAlgorithm.asInstanceOf[js.Any])).asInstanceOf[String]
}
