package typingsJapgolly.nodeRedRuntime.mod

import typingsJapgolly.nodeRedRuntime.anon.FlowId
import typingsJapgolly.nodeRedRuntime.anon.IdReq
import typingsJapgolly.nodeRedRuntime.anon.Req
import typingsJapgolly.nodeRedRuntime.anon.Rev
import typingsJapgolly.nodeRedRuntime.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowsModule extends StObject {
  
  /**
    * Adds a flow configuration
    * @param opts
    * @param opts.flow - the flow to add
    * @param opts.req - the request to log (optional)
    * @returns the id of the added flow
    */
  def addFlow(opts: typingsJapgolly.nodeRedRuntime.anon.Flow): js.Promise[String]
  
  /**
    * Deletes a flow
    * @param opts
    * @param opts.id - the id of the flow to delete
    * @param opts.req - the request to log (optional)
    */
  def deleteFlow(opts: IdReq): js.Promise[Unit]
  
  /**
    * Gets an individual flow configuration
    * @param opts
    * @param opts.id - the id of the flow to retrieve
    * @param opts.req - the request to log (optional)
    */
  def getFlow(opts: IdReq): js.Promise[Flow]
  
  /**
    * Gets the current flow configuration
    * @param opts
    * @param opts.req - the request to log (optional)
    */
  def getFlows(opts: Req): js.Promise[Flows]
  
  /**
    * Gets the safe credentials for a node
    * @param opts
    * @param opts.type - the node type to return the credential information for
    * @param opts.id - the node id
    * @param opts.req - the request to log (optional)
    * @returns the safe credentials
    */
  def getNodeCredentials(opts: Type): js.Promise[js.Object]
  
  /**
    * Sets the current flow configuration
    * @param opts
    * @param opts.flows - the flow configuration: `{flows: [..], credentials: {}}`
    * @param opts.deploymentType - the type of deployment - "full", "nodes", "flows", "reload"
    * @param opts.req - the request to log (optional)
    */
  def setFlows(opts: typingsJapgolly.nodeRedRuntime.anon.Flows): js.Promise[Rev]
  
  /**
    * Updates an existing flow configuration
    * @param opts
    * @param opts.id - the id of the flow to update
    * @param opts.flow - the flow configuration
    * @param opts.req - the request to log (optional)
    * @returns the id of the updated flow
    */
  def updateFlow(opts: FlowId): js.Promise[String]
}
object FlowsModule {
  
  inline def apply(
    addFlow: typingsJapgolly.nodeRedRuntime.anon.Flow => js.Promise[String],
    deleteFlow: IdReq => js.Promise[Unit],
    getFlow: IdReq => js.Promise[Flow],
    getFlows: Req => js.Promise[Flows],
    getNodeCredentials: Type => js.Promise[js.Object],
    setFlows: typingsJapgolly.nodeRedRuntime.anon.Flows => js.Promise[Rev],
    updateFlow: FlowId => js.Promise[String]
  ): FlowsModule = {
    val __obj = js.Dynamic.literal(addFlow = js.Any.fromFunction1(addFlow), deleteFlow = js.Any.fromFunction1(deleteFlow), getFlow = js.Any.fromFunction1(getFlow), getFlows = js.Any.fromFunction1(getFlows), getNodeCredentials = js.Any.fromFunction1(getNodeCredentials), setFlows = js.Any.fromFunction1(setFlows), updateFlow = js.Any.fromFunction1(updateFlow))
    __obj.asInstanceOf[FlowsModule]
  }
  
  extension [Self <: FlowsModule](x: Self) {
    
    inline def setAddFlow(value: typingsJapgolly.nodeRedRuntime.anon.Flow => js.Promise[String]): Self = StObject.set(x, "addFlow", js.Any.fromFunction1(value))
    
    inline def setDeleteFlow(value: IdReq => js.Promise[Unit]): Self = StObject.set(x, "deleteFlow", js.Any.fromFunction1(value))
    
    inline def setGetFlow(value: IdReq => js.Promise[Flow]): Self = StObject.set(x, "getFlow", js.Any.fromFunction1(value))
    
    inline def setGetFlows(value: Req => js.Promise[Flows]): Self = StObject.set(x, "getFlows", js.Any.fromFunction1(value))
    
    inline def setGetNodeCredentials(value: Type => js.Promise[js.Object]): Self = StObject.set(x, "getNodeCredentials", js.Any.fromFunction1(value))
    
    inline def setSetFlows(value: typingsJapgolly.nodeRedRuntime.anon.Flows => js.Promise[Rev]): Self = StObject.set(x, "setFlows", js.Any.fromFunction1(value))
    
    inline def setUpdateFlow(value: FlowId => js.Promise[String]): Self = StObject.set(x, "updateFlow", js.Any.fromFunction1(value))
  }
}
