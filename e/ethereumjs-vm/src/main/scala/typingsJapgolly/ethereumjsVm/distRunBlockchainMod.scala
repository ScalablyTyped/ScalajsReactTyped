package typingsJapgolly.ethereumjsVm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRunBlockchainMod {
  
  @JSImport("ethereumjs-vm/dist/runBlockchain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(blockchain: typingsJapgolly.ethereumjsBlockchain.mod.default): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(blockchain.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
