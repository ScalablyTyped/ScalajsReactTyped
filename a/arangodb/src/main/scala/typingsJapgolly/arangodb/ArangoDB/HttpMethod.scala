package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.HEAD
  - typingsJapgolly.arangodb.arangodbStrings.GET
  - typingsJapgolly.arangodb.arangodbStrings.POST
  - typingsJapgolly.arangodb.arangodbStrings.PUT
  - typingsJapgolly.arangodb.arangodbStrings.PATCH
  - typingsJapgolly.arangodb.arangodbStrings.DELETE
  - typingsJapgolly.arangodb.arangodbStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.arangodb.arangodbStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.arangodb.arangodbStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.arangodb.arangodbStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsJapgolly.arangodb.arangodbStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.arangodb.arangodbStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.arangodb.arangodbStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.arangodb.arangodbStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

