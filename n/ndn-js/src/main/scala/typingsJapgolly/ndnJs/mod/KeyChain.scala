package typingsJapgolly.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "KeyChain")
@js.native
open class KeyChain ()
  extends typingsJapgolly.ndnJs.keyChainMod.KeyChain {
  def this(pibLocator: String, tpmLocator: String) = this()
  def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
}
/* static members */
object KeyChain {
  
  @JSImport("ndn-js", "KeyChain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultKeyParams(): typingsJapgolly.ndnJs.keyChainMod.KeyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyParams")().asInstanceOf[typingsJapgolly.ndnJs.keyChainMod.KeyParams]
}
