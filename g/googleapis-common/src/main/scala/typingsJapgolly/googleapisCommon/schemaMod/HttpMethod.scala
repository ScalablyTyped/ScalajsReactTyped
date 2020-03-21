package typingsJapgolly.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.GET
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.PATCH
  - typingsJapgolly.googleapisCommon.googleapisCommonStrings.PUT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def GET: typingsJapgolly.googleapisCommon.googleapisCommonStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsJapgolly.googleapisCommon.googleapisCommonStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def PUT: typingsJapgolly.googleapisCommon.googleapisCommonStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

