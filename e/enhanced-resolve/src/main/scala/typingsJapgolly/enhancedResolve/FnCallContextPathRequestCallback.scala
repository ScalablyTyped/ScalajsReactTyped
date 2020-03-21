package typingsJapgolly.enhancedResolve

import typingsJapgolly.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallContextPathRequestCallback extends js.Object {
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
}

