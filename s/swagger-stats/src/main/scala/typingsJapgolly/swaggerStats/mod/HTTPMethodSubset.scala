package typingsJapgolly.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swaggerStats.swaggerStatsStrings.GET
  - typingsJapgolly.swaggerStats.swaggerStatsStrings.POST
  - typingsJapgolly.swaggerStats.swaggerStatsStrings.PUT
  - typingsJapgolly.swaggerStats.swaggerStatsStrings.DELETE
*/
trait HTTPMethodSubset extends js.Object

object HTTPMethodSubset {
  @scala.inline
  def DELETE: typingsJapgolly.swaggerStats.swaggerStatsStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.swaggerStats.swaggerStatsStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.swaggerStats.swaggerStatsStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.swaggerStats.swaggerStatsStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

