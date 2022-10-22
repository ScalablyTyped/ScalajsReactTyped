package typingsJapgolly.scBrokerCluster

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.scBroker.mod.SCBrokerClient
import typingsJapgolly.scBrokerCluster.mod.mapperFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientclusterMod {
  
  @JSImport("sc-broker-cluster/clientcluster", "ClientCluster")
  @js.native
  open class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[SCBrokerClient]) = this()
    
    def getMapper(): mapperFunction = js.native
    
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
}
