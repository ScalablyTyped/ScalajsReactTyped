package typingsJapgolly.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webvrApi.webvrApiStrings.mounted
  - typingsJapgolly.webvrApi.webvrApiStrings.navigation
  - typingsJapgolly.webvrApi.webvrApiStrings.requested
  - typingsJapgolly.webvrApi.webvrApiStrings.unmounted
*/
trait VRDisplayEventReasonDtAlias extends js.Object

object VRDisplayEventReasonDtAlias {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typingsJapgolly.webvrApi.webvrApiStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typingsJapgolly.webvrApi.webvrApiStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typingsJapgolly.webvrApi.webvrApiStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typingsJapgolly.webvrApi.webvrApiStrings.unmounted = this.cast("unmounted")
}

