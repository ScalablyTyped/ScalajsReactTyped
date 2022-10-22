package typingsJapgolly.fsCapacitor

import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-capacitor", "ReadAfterDestroyedError")
  @js.native
  open class ReadAfterDestroyedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("fs-capacitor", "ReadStream")
  @js.native
  open class ReadStream ()
    extends typingsJapgolly.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-capacitor", "WriteStream")
  @js.native
  open class WriteStream ()
    extends typingsJapgolly.node.fsMod.WriteStream {
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(name: String): ReadStream = js.native
  }
}
