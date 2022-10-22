package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.CreateContextCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.DeleteAllContextsCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.DeleteContextCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.GetContextCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.ListContextsCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Contexts.UpdateContextCallback
import typingsJapgolly.dialogflow.protosProtosMod.google.protobuf.Empty
import typingsJapgolly.protobufjs.mod.RPCImpl
import typingsJapgolly.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Contexts */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Contexts")
@js.native
open class Contexts protected () extends Service {
  /**
    * Constructs a new Contexts service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateContext.
    * @param request CreateContextRequest message or plain object
    * @returns Promise
    */
  def createContext(request: ICreateContextRequest): js.Promise[Context] = js.native
  /**
    * Calls CreateContext.
    * @param request CreateContextRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Context
    */
  def createContext(request: ICreateContextRequest, callback: CreateContextCallback): Unit = js.native
  
  /**
    * Calls DeleteAllContexts.
    * @param request DeleteAllContextsRequest message or plain object
    * @returns Promise
    */
  def deleteAllContexts(request: IDeleteAllContextsRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteAllContexts.
    * @param request DeleteAllContextsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteAllContexts(request: IDeleteAllContextsRequest, callback: DeleteAllContextsCallback): Unit = js.native
  
  /**
    * Calls DeleteContext.
    * @param request DeleteContextRequest message or plain object
    * @returns Promise
    */
  def deleteContext(request: IDeleteContextRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteContext.
    * @param request DeleteContextRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteContext(request: IDeleteContextRequest, callback: DeleteContextCallback): Unit = js.native
  
  /**
    * Calls GetContext.
    * @param request GetContextRequest message or plain object
    * @returns Promise
    */
  def getContext(request: IGetContextRequest): js.Promise[Context] = js.native
  /**
    * Calls GetContext.
    * @param request GetContextRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Context
    */
  def getContext(request: IGetContextRequest, callback: GetContextCallback): Unit = js.native
  
  /**
    * Calls ListContexts.
    * @param request ListContextsRequest message or plain object
    * @returns Promise
    */
  def listContexts(request: IListContextsRequest): js.Promise[ListContextsResponse] = js.native
  /**
    * Calls ListContexts.
    * @param request ListContextsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListContextsResponse
    */
  def listContexts(request: IListContextsRequest, callback: ListContextsCallback): Unit = js.native
  
  /**
    * Calls UpdateContext.
    * @param request UpdateContextRequest message or plain object
    * @returns Promise
    */
  def updateContext(request: IUpdateContextRequest): js.Promise[Context] = js.native
  /**
    * Calls UpdateContext.
    * @param request UpdateContextRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Context
    */
  def updateContext(request: IUpdateContextRequest, callback: UpdateContextCallback): Unit = js.native
}
object Contexts {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Contexts")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Contexts service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Contexts = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Contexts]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Contexts = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Contexts]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Contexts = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Contexts]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Contexts = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Contexts]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#createContext}.
    * @param error Error, if any
    * @param [response] Context
    */
  type CreateContextCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Context], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#deleteAllContexts}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteAllContextsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#deleteContext}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteContextCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#getContext}.
    * @param error Error, if any
    * @param [response] Context
    */
  type GetContextCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Context], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#listContexts}.
    * @param error Error, if any
    * @param [response] ListContextsResponse
    */
  type ListContextsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListContextsResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.Contexts#updateContext}.
    * @param error Error, if any
    * @param [response] Context
    */
  type UpdateContextCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Context], Unit]
}
