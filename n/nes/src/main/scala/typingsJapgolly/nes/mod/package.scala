package typingsJapgolly.nes

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
  type Client = typingsJapgolly.nes.clientMod.^
  type ClientConnectOptions = typingsJapgolly.nes.clientMod.ClientConnectOptions
  type ClientOptions = typingsJapgolly.nes.clientMod.ClientOptions
  type ClientRequestOptions = typingsJapgolly.nes.clientMod.ClientRequestOptions
  type ClientSubscribeFlags = typingsJapgolly.nes.clientMod.ClientSubscribeFlags
  type Handler = typingsJapgolly.nes.clientMod.Handler
  type ServerOnSubscribe = typingsJapgolly.nes.mod.ServerOnSubscribeWithParams | typingsJapgolly.nes.mod.ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typingsJapgolly.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsJapgolly.nes.mod.Socket, 
    /* path */ java.lang.String, 
    js.Promise[js.Any]
  ]
  type ServerOnUnSubscribe = typingsJapgolly.nes.mod.ServerOnUnSubscribeWithParams | typingsJapgolly.nes.mod.ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typingsJapgolly.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ typingsJapgolly.nes.mod.Socket, /* path */ java.lang.String, scala.Unit]
}
