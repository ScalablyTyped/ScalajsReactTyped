package typingsJapgolly.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Exceptions")
@js.native
object Exceptions extends js.Object {
  /**
    * Indicates the session description handler has closed.
    * Occurs when getDescription() or setDescription() are called after close() has been called.
    * Occurs when close() is called while getDescription() or setDescription() are in progress.
    */
  @js.native
  class ClosedSessionDescriptionHandlerError ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.ClosedSessionDescriptionHandlerError
  
  @js.native
  class ConfigurationError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.ConfigurationError {
    def this(parameter: String) = this()
    def this(parameter: String, value: js.Any) = this()
  }
  
  @js.native
  class InvalidStateError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.InvalidStateError {
    def this(status: typingsJapgolly.sipJs.enumsMod.SessionStatus) = this()
  }
  
  @js.native
  class MethodParameterError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.MethodParameterError {
    def this(method: String, parameter: String, value: js.Any) = this()
  }
  
  @js.native
  class NotSupportedError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.NotSupportedError {
    def this(message: String) = this()
  }
  
  @js.native
  class RenegotiationError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.RenegotiationError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.SessionDescriptionHandlerError {
    def this(method: String) = this()
    def this(method: String, error: String) = this()
    def this(method: String, error: String, message: String) = this()
  }
  
  /**
    * Indicates the session terminated before the action completed.
    */
  @js.native
  class TerminatedSessionError ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.TerminatedSessionError
  
  /**
    * Unsupported session description content type.
    */
  @js.native
  class UnsupportedSessionDescriptionContentTypeError ()
    extends typingsJapgolly.sipJs.libExceptionsMod.Exceptions.UnsupportedSessionDescriptionContentTypeError {
    def this(message: String) = this()
  }
  
}

