package typingsJapgolly.libp2pUtils

import typingsJapgolly.libp2pInterfacePeerStore.mod.Address
import typingsJapgolly.libp2pUtils.libp2pUtilsInts.`-1`
import typingsJapgolly.libp2pUtils.libp2pUtilsInts.`0`
import typingsJapgolly.libp2pUtils.libp2pUtilsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object addressSortMod {
  
  @JSImport("@libp2p/utils/address-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publicAddressesFirst(a: Address, b: Address): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("publicAddressesFirst")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
}
