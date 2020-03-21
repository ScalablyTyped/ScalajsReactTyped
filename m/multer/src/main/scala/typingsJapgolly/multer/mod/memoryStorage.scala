package typingsJapgolly.multer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer", "memoryStorage")
@js.native
object memoryStorage extends js.Object {
  /**
    * Returns a `StorageEngine` implementation configured to store files in
    * memory as `Buffer` objects.
    */
  def apply(): StorageEngine = js.native
}

