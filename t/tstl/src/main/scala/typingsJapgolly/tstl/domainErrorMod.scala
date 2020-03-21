package typingsJapgolly.tstl

import typingsJapgolly.tstl.logicErrorMod.LogicError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/DomainError", JSImport.Namespace)
@js.native
object domainErrorMod extends js.Object {
  @js.native
  class DomainError protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}

