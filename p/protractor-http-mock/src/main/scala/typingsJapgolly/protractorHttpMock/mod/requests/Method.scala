package typingsJapgolly.protractorHttpMock.mod.requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request methods type
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.GET
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.DELETE
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PUT
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PATCH
  - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.JSONP
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def JSONP: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.JSONP = this.cast("JSONP")
  @scala.inline
  def PATCH: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

