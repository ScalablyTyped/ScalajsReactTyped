package typingsJapgolly.promisePg.mod

import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Query")
@js.native
class Query ()
  extends typingsJapgolly.pg.mod.Query[js.Any, js.Any] {
  var promise: Promise[QueryResult] = js.native
}

