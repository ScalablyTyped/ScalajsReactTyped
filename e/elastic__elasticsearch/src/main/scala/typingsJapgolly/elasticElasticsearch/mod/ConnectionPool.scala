package typingsJapgolly.elasticElasticsearch.mod

import typingsJapgolly.elasticElasticsearch.AnonNone
import typingsJapgolly.elasticElasticsearch.poolMod.ConnectionPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
class ConnectionPool ()
  extends typingsJapgolly.elasticElasticsearch.poolMod.ConnectionPool {
  def this(opts: ConnectionPoolOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
object ConnectionPool extends js.Object {
  var resurrectStrategies: AnonNone = js.native
}

