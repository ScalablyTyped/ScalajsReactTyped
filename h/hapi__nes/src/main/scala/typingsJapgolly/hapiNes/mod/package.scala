package typingsJapgolly.hapiNes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * TODO (if possible) use a drier, more robust way of doing this that
    * allows for:
    *      * the export to have be of type Hapi.PluginFunction whilst
    *      * also exposing the Client type
    *      * exporting the NesClient as the Client class without having to
    *          duplicate the constructor definition
    *      * and all the type exports from the NesClient namespace (Handler,
    *          ClientOptions, ClientConnectOptions, ClientRequestOptions,
    *          ClientSubscribeFlags)
    */
  type Client = typingsJapgolly.hapiNes.clientMod.Client
  type ClientConnectOptions = typingsJapgolly.hapiNes.clientMod.Client.ClientConnectOptions
  type ClientOptions = typingsJapgolly.hapiNes.clientMod.Client.ClientOptions
  type ClientRequestOptions = typingsJapgolly.hapiNes.clientMod.Client.ClientRequestOptions
  type ClientSubscribeFlags = typingsJapgolly.hapiNes.clientMod.Client.ClientSubscribeFlags
  type Handler = typingsJapgolly.hapiNes.clientMod.Client.Handler
  type ServerOnSubscribe = typingsJapgolly.hapiNes.mod.ServerOnSubscribeWithParams | typingsJapgolly.hapiNes.mod.ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typingsJapgolly.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsJapgolly.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    js.Promise[js.Any]
  ]
  type ServerOnUnSubscribe = typingsJapgolly.hapiNes.mod.ServerOnUnSubscribeWithParams | typingsJapgolly.hapiNes.mod.ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typingsJapgolly.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  type ServerOnUnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsJapgolly.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    scala.Unit
  ]
}
