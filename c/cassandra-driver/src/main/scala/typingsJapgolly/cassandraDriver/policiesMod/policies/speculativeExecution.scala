package typingsJapgolly.cassandraDriver.policiesMod.policies

import typingsJapgolly.cassandraDriver.AnonNextExecution
import typingsJapgolly.cassandraDriver.mod.Client
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution")
@js.native
object speculativeExecution extends js.Object {
  @js.native
  class ConstantSpeculativeExecutionPolicy protected () extends SpeculativeExecutionPolicy {
    def this(delay: Double, maxSpeculativeExecutions: Double) = this()
  }
  
  @js.native
  class NoSpeculativeExecutionPolicy () extends SpeculativeExecutionPolicy
  
  @js.native
  trait SpeculativeExecutionPolicy extends js.Object {
    def getOptions(): Map[String, js.Object] = js.native
    def init(client: Client): Unit = js.native
    def newPlan(keyspace: String, queryInfo: String): AnonNextExecution = js.native
    def newPlan(keyspace: String, queryInfo: js.Array[js.Object]): AnonNextExecution = js.native
    def shutdown(): Unit = js.native
  }
  
}

