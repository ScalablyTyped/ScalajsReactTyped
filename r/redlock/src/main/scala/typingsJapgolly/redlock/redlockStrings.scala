package typingsJapgolly.redlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object redlockStrings {
  @js.native
  sealed trait LockError extends js.Object
  
  @js.native
  sealed trait clientError extends js.Object
  
  @scala.inline
  def LockError: LockError = "LockError".asInstanceOf[LockError]
  @scala.inline
  def clientError: clientError = "clientError".asInstanceOf[clientError]
}

