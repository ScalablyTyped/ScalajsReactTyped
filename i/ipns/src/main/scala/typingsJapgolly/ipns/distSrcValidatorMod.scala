package typingsJapgolly.ipns

import typingsJapgolly.ipns.mod.IPNSEntry
import typingsJapgolly.libp2pInterfaceDht.mod.ValidateFn
import typingsJapgolly.libp2pInterfaceKeys.mod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcValidatorMod {
  
  @JSImport("ipns/dist/src/validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipns/dist/src/validator", "ipnsValidator")
  @js.native
  val ipnsValidator: ValidateFn = js.native
  
  inline def validate(publicKey: PublicKey, entry: IPNSEntry): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(publicKey.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
