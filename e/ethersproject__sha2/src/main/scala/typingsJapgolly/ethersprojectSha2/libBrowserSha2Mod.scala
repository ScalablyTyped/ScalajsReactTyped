package typingsJapgolly.ethersprojectSha2

import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectSha2.libTypesMod.SupportedAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserSha2Mod {
  
  @JSImport("@ethersproject/sha2/lib/browser-sha2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ripemd160(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha256(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha512(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
