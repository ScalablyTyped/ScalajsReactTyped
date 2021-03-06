package typingsJapgolly.jestTestResult

import typingsJapgolly.jestTestResult.typesMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestTestResultStrings {
  @js.native
  sealed trait disabled extends Status
  
  @js.native
  sealed trait failed extends Status
  
  @js.native
  sealed trait passed extends Status
  
  @js.native
  sealed trait pending extends Status
  
  @js.native
  sealed trait skipped extends Status
  
  @js.native
  sealed trait todo extends Status
  
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  @scala.inline
  def todo: todo = "todo".asInstanceOf[todo]
}

