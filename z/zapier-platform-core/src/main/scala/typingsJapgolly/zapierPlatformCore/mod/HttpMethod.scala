package typingsJapgolly.zapierPlatformCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// internal only
// export const integrationTestHandler: () => any;
// export const createAppHandler: (appRaw: object) => any
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.GET
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.POST
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.PUT
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.PATCH
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.DELETE
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS
  - typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.HEAD
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

