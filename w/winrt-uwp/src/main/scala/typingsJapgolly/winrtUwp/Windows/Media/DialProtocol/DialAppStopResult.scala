package typingsJapgolly.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialAppStopResult extends js.Object

/** The result of attempting to stop an app from running on a remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppStopResult")
@js.native
object DialAppStopResult extends js.Object {
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure extends DialAppStopResult
  
  /** The app cannot be stopped because the operation isn't supported. */
  @js.native
  sealed trait operationNotSupported extends DialAppStopResult
  
  /** The app failed to stop. */
  @js.native
  sealed trait stopFailed extends DialAppStopResult
  
  /** The app is successfully stopped. */
  @js.native
  sealed trait stopped extends DialAppStopResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialAppStopResult with Double] = js.native
  /* 3 */ @js.native
  object networkFailure extends TopLevel[networkFailure with Double]
  
  /* 2 */ @js.native
  object operationNotSupported extends TopLevel[operationNotSupported with Double]
  
  /* 1 */ @js.native
  object stopFailed extends TopLevel[stopFailed with Double]
  
  /* 0 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

