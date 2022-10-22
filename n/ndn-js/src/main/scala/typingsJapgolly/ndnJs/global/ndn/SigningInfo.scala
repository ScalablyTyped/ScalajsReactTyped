package typingsJapgolly.ndnJs.global.ndn

import typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.SigningInfo")
@js.native
open class SigningInfo ()
  extends typingsJapgolly.ndnJs.mod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.PibIdentity) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.PibKey) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typingsJapgolly.ndnJs.nameMod.Name) = this()
}
object SigningInfo {
  
  @JSGlobal("ndn.SigningInfo.SignerType")
  @js.native
  object SignerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType & Double] = js.native
    
    /* 3 */ val CERT: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.CERT & Double = js.native
    
    /* 1 */ val ID: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.ID & Double = js.native
    
    /* 2 */ val KEY: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.KEY & Double = js.native
    
    /* 0 */ val NULL: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.NULL & Double = js.native
    
    /* 4 */ val SHA256: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 & Double = js.native
  }
}
