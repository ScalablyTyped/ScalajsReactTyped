package typingsJapgolly.firebaseStorage

import typingsJapgolly.firebaseStorage.distSrcImplementationErrorMod.StorageError
import typingsJapgolly.firebaseStorage.distSrcImplementationRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationFailrequestMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/failrequest", "FailRequest")
  @js.native
  open class FailRequest[T] protected ()
    extends StObject
       with Request[T] {
    def this(error: StorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}
