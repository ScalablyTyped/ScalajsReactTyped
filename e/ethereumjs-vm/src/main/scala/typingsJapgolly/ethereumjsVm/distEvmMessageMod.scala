package typingsJapgolly.ethereumjsVm

import typingsJapgolly.bnJs.mod.^
import typingsJapgolly.ethereumjsVm.distEvmPrecompilesTypesMod.PrecompileFunc
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmMessageMod {
  
  @JSImport("ethereumjs-vm/dist/evm/message", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Message {
    def this(opts: Any) = this()
  }
  
  @js.native
  trait Message extends StObject {
    
    var _codeAddress: Buffer = js.native
    
    var caller: Buffer = js.native
    
    var code: Buffer | PrecompileFunc = js.native
    
    def codeAddress: Buffer = js.native
    
    var data: Buffer = js.native
    
    var delegatecall: Boolean = js.native
    
    var depth: Double = js.native
    
    var gasLimit: ^ = js.native
    
    var isCompiled: Boolean = js.native
    
    var isStatic: Boolean = js.native
    
    var salt: Buffer = js.native
    
    var selfdestruct: Any = js.native
    
    var to: Buffer = js.native
    
    var value: ^ = js.native
  }
}
