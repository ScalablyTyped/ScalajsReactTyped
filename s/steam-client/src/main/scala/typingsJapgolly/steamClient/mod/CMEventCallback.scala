package typingsJapgolly.steamClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.steamClient.anon.Msg
import typingsJapgolly.steamClient.steamClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMEventCallback extends StObject {
  
  /**
    * Encryption handshake complete.
    * From now on, it's your responsibility to handle disconnections and reconnect (see error).
    * You'll likely want to log on now.
    *
    * @param serverLoad The load value of the CM server you're connected to. Only available if you're connecting using UDP. It's unclear at this time what scale this value uses.
    */
  def connected(serverLoad: String): Unit
  
  /**
    * Connection closed by the server.
    * Only emitted if the encryption handshake is complete, otherwise it will reconnect automatically (unless you disabled autoRetry).
    * loggedOn is now false.
    *
    * @param err An Error object. May contain an eresult property.
    */
  def error(err: js.Error): Unit
  
  /**
    * Logon response received. If eresult is EResult.OK, loggedOn is now true.
    *
    * @param response An object with the properties in CMsgClientLogonResponse
    */
  def logOnResponse(response: CMsgClientLogonResponse): Unit
  
  /**
    * You were logged off from Steam. loggedOn is now false.
    *
    * @param eresesult A value from EResult
    */
  def loggedOff(eresesult: EResult): Unit
  
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: SendMessage
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer
  ): Unit
  def message(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: SendMessage
  ): Unit
  @JSName("message")
  var message_Original: SendMessage
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ Any,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit
  @JSName("message")
  def message_false(
    /**
    * An object containing the message header. It has the following properties:
    * The following fields are reserved for internal use and shall be ignored: steamid, client_sessionid, jobid_source, jobid_target.
    * (Note: pass an empty object if you don't need to set any fields)
    */
  header: Msg,
    /**
    * A Buffer or ByteBuffer containing the rest of the message
    */
  body: Buffer,
    /**
    * If not falsy, then this message is a request, and callback shall be called with any response to it instead of 'message'/send. callback has the same arguments as 'message'/send.
    */
  callback: `false`
  ): Unit
  
  /**
    * CMClient will use this new list when reconnecting, but it will be lost when your application restarts.
    * You might want to save it to a file or a database and assign it to Steam.servers before logging in next time.
    *
    * Note that Steam.servers will be automatically updated after this event is emitted.
    * This will be useful if you want to compare the old list with the new one for some reason - otherwise it shouldn't matter.
    *
    * @param servers An array containing the up-to-date server list
    */
  def servers(servers: js.Array[Server]): Unit
}
object CMEventCallback {
  
  inline def apply(
    connected: String => Callback,
    error: js.Error => Callback,
    logOnResponse: CMsgClientLogonResponse => Callback,
    loggedOff: EResult => Callback,
    message: SendMessage,
    servers: js.Array[Server] => Callback
  ): CMEventCallback = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1((t0: String) => connected(t0).runNow()), error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), logOnResponse = js.Any.fromFunction1((t0: CMsgClientLogonResponse) => logOnResponse(t0).runNow()), loggedOff = js.Any.fromFunction1((t0: EResult) => loggedOff(t0).runNow()), message = message.asInstanceOf[js.Any], servers = js.Any.fromFunction1((t0: js.Array[Server]) => servers(t0).runNow()))
    __obj.asInstanceOf[CMEventCallback]
  }
  
  extension [Self <: CMEventCallback](x: Self) {
    
    inline def setConnected(value: String => Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setLogOnResponse(value: CMsgClientLogonResponse => Callback): Self = StObject.set(x, "logOnResponse", js.Any.fromFunction1((t0: CMsgClientLogonResponse) => value(t0).runNow()))
    
    inline def setLoggedOff(value: EResult => Callback): Self = StObject.set(x, "loggedOff", js.Any.fromFunction1((t0: EResult) => value(t0).runNow()))
    
    inline def setMessage(value: SendMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setServers(value: js.Array[Server] => Callback): Self = StObject.set(x, "servers", js.Any.fromFunction1((t0: js.Array[Server]) => value(t0).runNow()))
  }
}
