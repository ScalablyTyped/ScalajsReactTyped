package typingsJapgolly.nodeJsonDb

import typingsJapgolly.std.Error
import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-json-db/dist/lib/Errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class DataError () extends NestedError
  
  @js.native
  class DatabaseError () extends NestedError
  
  @js.native
  abstract class NestedError protected () extends Error {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
    val id: Number = js.native
    val inner: js.UndefOr[js.Error] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

