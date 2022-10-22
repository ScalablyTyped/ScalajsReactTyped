package typingsJapgolly.steamClient.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.steamClient.anon.Msg
import typingsJapgolly.steamClient.steamClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessage extends StObject {
  
  def apply(
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
  ): Unit = js.native
  def apply(
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
  ): Unit = js.native
  def apply(
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
  ): Unit = js.native
  def apply(
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
  ): Unit = js.native
  def apply(
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
  ): Unit = js.native
  def apply(
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
  ): Unit = js.native
}
