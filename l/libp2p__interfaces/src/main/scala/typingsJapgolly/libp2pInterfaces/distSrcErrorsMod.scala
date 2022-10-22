package typingsJapgolly.libp2pInterfaces

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("@libp2p/interfaces/dist/src/errors", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    val code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val `type`: String = js.native
  }
}
