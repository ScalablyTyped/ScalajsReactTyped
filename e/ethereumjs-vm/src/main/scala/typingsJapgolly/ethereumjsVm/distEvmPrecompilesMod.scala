package typingsJapgolly.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ethereumjsVm.distEvmPrecompilesTypesMod.PrecompileFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmPrecompilesMod {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrecompile(address: String): PrecompileFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecompile")(address.asInstanceOf[js.Any]).asInstanceOf[PrecompileFunc]
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", "precompiles")
  @js.native
  val precompiles: Precompiles_ = js.native
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", "ripemdPrecompileAddress")
  @js.native
  val ripemdPrecompileAddress: /* "0000000000000000000000000000000000000003" */ String = js.native
  
  type Precompiles_ = StringDictionary[PrecompileFunc]
}
