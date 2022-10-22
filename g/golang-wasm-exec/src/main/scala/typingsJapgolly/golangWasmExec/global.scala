package typingsJapgolly.golangWasmExec

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.WebAssembly.Imports
import typingsJapgolly.std.WebAssembly.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Go")
  @js.native
  open class Go ()
    extends StObject
       with typingsJapgolly.golangWasmExec.Go {
    
    /* CompleteClass */
    var argv: js.Array[String] = js.native
    
    /* CompleteClass */
    var env: StringDictionary[String] = js.native
    
    /* CompleteClass */
    override def exit(code: Double): Unit = js.native
    
    /* CompleteClass */
    var exited: Boolean = js.native
    
    /* CompleteClass */
    var importObject: Imports = js.native
    
    /* CompleteClass */
    var mem: js.typedarray.DataView = js.native
    
    /* CompleteClass */
    override def run(instance: Instance): js.Promise[Unit] = js.native
  }
}
