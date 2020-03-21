package typingsJapgolly.scBrokerCluster

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.scBroker.mod.SCBrokerClient
import typingsJapgolly.scBrokerCluster.mod.mapperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster/clientcluster", JSImport.Namespace)
@js.native
object clientclusterMod extends js.Object {
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[SCBrokerClient]) = this()
    def getMapper(): mapperFunction = js.native
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
  
}

