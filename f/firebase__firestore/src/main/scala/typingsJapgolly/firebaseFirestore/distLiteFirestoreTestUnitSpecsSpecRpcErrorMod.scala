package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.Code
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestUnitSpecsSpecRpcErrorMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/specs/spec_rpc_error", "RpcError")
  @js.native
  open class RpcError protected ()
    extends StObject
       with Error {
    def this(code: Double, message: String) = this()
    def this(code: Code, message: String) = this()
    
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
