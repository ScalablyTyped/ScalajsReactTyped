package typingsJapgolly.enhancedResolve.mod

import typingsJapgolly.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "context")
@js.native
object context extends js.Object {
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def sync(context: ResolveContext, path: String, request: String): String = js.native
  def sync(path: String, request: String): String = js.native
}

