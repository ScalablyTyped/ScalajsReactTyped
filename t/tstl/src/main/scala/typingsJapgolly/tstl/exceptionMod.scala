package typingsJapgolly.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  @js.native
  class DomainError protected ()
    extends typingsJapgolly.tstl.domainErrorMod.DomainError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ErrorCategory ()
    extends typingsJapgolly.tstl.errorCategoryMod.ErrorCategory
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode ()
    extends typingsJapgolly.tstl.errorCodeMod.ErrorCode {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsJapgolly.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition ()
    extends typingsJapgolly.tstl.errorConditionMod.ErrorCondition {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsJapgolly.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  class Exception protected ()
    extends typingsJapgolly.tstl.exceptionExceptionMod.Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class InvalidArgument protected ()
    extends typingsJapgolly.tstl.invalidArgumentMod.InvalidArgument {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected ()
    extends typingsJapgolly.tstl.lengthErrorMod.LengthError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected ()
    extends typingsJapgolly.tstl.logicErrorMod.LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected ()
    extends typingsJapgolly.tstl.outOfRangeMod.OutOfRange {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OverflowError protected ()
    extends typingsJapgolly.tstl.overflowErrorMod.OverflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected ()
    extends typingsJapgolly.tstl.rangeErrorMod.RangeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected ()
    extends typingsJapgolly.tstl.runtimeErrorMod.RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class SystemError protected ()
    extends typingsJapgolly.tstl.systemErrorMod.SystemError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: typingsJapgolly.tstl.errorCodeMod.ErrorCode) = this()
    def this(code: typingsJapgolly.tstl.errorCodeMod.ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: typingsJapgolly.tstl.errorCategoryMod.ErrorCategory) = this()
    def this(`val`: Double, category: typingsJapgolly.tstl.errorCategoryMod.ErrorCategory, message: String) = this()
  }
  
  @js.native
  class UnderflowError protected ()
    extends typingsJapgolly.tstl.underflowErrorMod.UnderflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @JSName("get_terminate")
  def getTerminate(): js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("set_terminate")
  def setTerminate(func: js.Function0[Unit]): Unit = js.native
  def terminate(): Unit = js.native
}

