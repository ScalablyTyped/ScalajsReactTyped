package typingsJapgolly.googleGax.mod

import typingsJapgolly.googleGax.buildSrcGaxMod.BackoffSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "Operation")
@js.native
open class Operation_ protected ()
  extends typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ {
  /**
    * Wrapper for a google.longrunnung.Operation.
    *
    * @constructor
    *
    * @param {google.longrunning.Operation} grpcOp - The operation to be wrapped.
    * @param {LongRunningDescriptor} longrunningDescriptor - This defines the
    * operations service client and unpacking mechanisms for the operation.
    * @param {BackoffSettings} backoffSettings - The backoff settings used in
    * in polling the operation.
    * @param {CallOptions} callOptions - CallOptions used in making get operation
    * requests.
    */
  def this(
    grpcOp: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings
  ) = this()
  def this(
    grpcOp: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ) = this()
}
