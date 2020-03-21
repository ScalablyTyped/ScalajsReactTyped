package typingsJapgolly.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorOptions extends js.Object

/** Specifies the type of diagnostic error reporting for a thread. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends js.Object {
  /** Exceptions are reported. */
  @js.native
  sealed trait forceExceptions extends ErrorOptions
  
  /** No error reporting occurs for the thread. */
  @js.native
  sealed trait none extends ErrorOptions
  
  /** Exceptions are suppressed and not reported. */
  @js.native
  sealed trait suppressExceptions extends ErrorOptions
  
  /** Error information for SetErrorInfo is suppressed and not reported. */
  @js.native
  sealed trait suppressSetErrorInfo extends ErrorOptions
  
  /** Error information for SetErrorInfo is used. */
  @js.native
  sealed trait useSetErrorInfo extends ErrorOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorOptions with Double] = js.native
  /* 2 */ @js.native
  object forceExceptions extends TopLevel[forceExceptions with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object suppressExceptions extends TopLevel[suppressExceptions with Double]
  
  /* 4 */ @js.native
  object suppressSetErrorInfo extends TopLevel[suppressSetErrorInfo with Double]
  
  /* 3 */ @js.native
  object useSetErrorInfo extends TopLevel[useSetErrorInfo with Double]
  
}

