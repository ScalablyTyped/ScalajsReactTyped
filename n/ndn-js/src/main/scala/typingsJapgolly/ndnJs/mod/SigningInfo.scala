package typingsJapgolly.ndnJs.mod

import typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
class SigningInfo ()
  extends typingsJapgolly.ndnJs.keyChainMod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.PibIdentity) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.PibKey) = this()
  def this(arg: typingsJapgolly.ndnJs.keyChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typingsJapgolly.ndnJs.nameMod.Name) = this()
}

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfo extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.CERT with Double = js.native
    /* 1 */ val ID: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.ID with Double = js.native
    /* 2 */ val KEY: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.KEY with Double = js.native
    /* 0 */ val NULL: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.NULL with Double = js.native
    /* 4 */ val SHA256: typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ndnJs.keyChainMod.SigningInfo.SignerType with Double] = js.native
  }
  
}

