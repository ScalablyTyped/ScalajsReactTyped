package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.GET
  - typingsJapgolly.ionic.ionicStrings.POST
  - typingsJapgolly.ionic.ionicStrings.PATCH
  - typingsJapgolly.ionic.ionicStrings.PUT
  - typingsJapgolly.ionic.ionicStrings.DELETE
  - typingsJapgolly.ionic.ionicStrings.PURGE
  - typingsJapgolly.ionic.ionicStrings.HEAD
  - typingsJapgolly.ionic.ionicStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.ionic.ionicStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.ionic.ionicStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.ionic.ionicStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsJapgolly.ionic.ionicStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.ionic.ionicStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.ionic.ionicStrings.POST = this.cast("POST")
  @scala.inline
  def PURGE: typingsJapgolly.ionic.ionicStrings.PURGE = this.cast("PURGE")
  @scala.inline
  def PUT: typingsJapgolly.ionic.ionicStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

