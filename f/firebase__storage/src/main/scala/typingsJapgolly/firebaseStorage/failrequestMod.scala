package typingsJapgolly.firebaseStorage

import typingsJapgolly.firebaseStorage.errorMod.FirebaseStorageError
import typingsJapgolly.firebaseStorage.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/failrequest", JSImport.Namespace)
@js.native
object failrequestMod extends js.Object {
  @js.native
  class FailRequest[T] protected () extends Request[T] {
    def this(error: FirebaseStorageError) = this()
    var promise_ : js.Promise[T] = js.native
  }
  
}

