package typingsJapgolly.errorSubclass

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("error-subclass", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: String = js.native
  }
  
  type ErrorSubclass = js.Error
}

