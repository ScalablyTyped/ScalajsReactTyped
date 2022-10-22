package typingsJapgolly.jestTestResult

import typingsJapgolly.jestTestResult.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestTestResultStrings {
  
  @js.native
  sealed trait disabled
    extends StObject
       with Status
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait failed
    extends StObject
       with Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait passed
    extends StObject
       with Status
  inline def passed: passed = "passed".asInstanceOf[passed]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait skipped
    extends StObject
       with Status
  inline def skipped: skipped = "skipped".asInstanceOf[skipped]
  
  @js.native
  sealed trait `test-case-result` extends StObject
  inline def `test-case-result`: `test-case-result` = "test-case-result".asInstanceOf[`test-case-result`]
  
  @js.native
  sealed trait `test-file-failure` extends StObject
  inline def `test-file-failure`: `test-file-failure` = "test-file-failure".asInstanceOf[`test-file-failure`]
  
  @js.native
  sealed trait `test-file-start` extends StObject
  inline def `test-file-start`: `test-file-start` = "test-file-start".asInstanceOf[`test-file-start`]
  
  @js.native
  sealed trait `test-file-success` extends StObject
  inline def `test-file-success`: `test-file-success` = "test-file-success".asInstanceOf[`test-file-success`]
  
  @js.native
  sealed trait todo
    extends StObject
       with Status
  inline def todo: todo = "todo".asInstanceOf[todo]
}
