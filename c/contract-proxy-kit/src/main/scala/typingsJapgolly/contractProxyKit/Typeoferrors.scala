package typingsJapgolly.contractProxyKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoferrors extends js.Object {
  val CALL_EXCEPTION: typingsJapgolly.contractProxyKit.contractProxyKitStrings.CALL_EXCEPTION = js.native
  val INVALID_ARGUMENT: typingsJapgolly.contractProxyKit.contractProxyKitStrings.INVALID_ARGUMENT = js.native
  val MISSING_ARGUMENT: typingsJapgolly.contractProxyKit.contractProxyKitStrings.MISSING_ARGUMENT = js.native
  val MISSING_NEW: typingsJapgolly.contractProxyKit.contractProxyKitStrings.MISSING_NEW = js.native
  val NOT_IMPLEMENTED: typingsJapgolly.contractProxyKit.contractProxyKitStrings.NOT_IMPLEMENTED = js.native
  val NUMERIC_FAULT: typingsJapgolly.contractProxyKit.contractProxyKitStrings.NUMERIC_FAULT = js.native
  val UNEXPECTED_ARGUMENT: typingsJapgolly.contractProxyKit.contractProxyKitStrings.UNEXPECTED_ARGUMENT = js.native
  val UNKNOWN_ERROR: typingsJapgolly.contractProxyKit.contractProxyKitStrings.UNKNOWN_ERROR = js.native
  val UNSUPPORTED_OPERATION: typingsJapgolly.contractProxyKit.contractProxyKitStrings.UNSUPPORTED_OPERATION = js.native
  def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double, suffix: String): Unit = js.native
  def checkNew(self: js.Any, kind: js.Any): Unit = js.native
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  def throwError(message: String, code: String, params: js.Any): scala.Nothing = js.native
}

