package typingsJapgolly.mqtt

import typingsJapgolly.mqtt.typesLibStoreOptionsMod.IStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibStoreMod {
  
  /**
    * In-memory implementation of the message store
    * This can actually be saved into files.
    *
    */
  @JSImport("mqtt/types/lib/store", "Store")
  @js.native
  open class Store protected () extends StObject {
    /**
      * Store constructor
      *
      * @param {Object} [options] - store options
      */
    def this(options: IStoreOptions) = this()
    
    /**
      * Close the store
      */
    def close(cb: js.Function): Unit = js.native
    
    /**
      * Creates a stream with all the packets in the store
      *
      */
    def createStream(): Any = js.native
    
    /**
      * deletes a packet from the store.
      */
    def del(packet: Any, cb: js.Function): this.type = js.native
    
    /**
      * get a packet from the store.
      */
    def get(packet: Any, cb: js.Function): this.type = js.native
    
    /**
      * Adds a packet to the store, a packet is
      * anything that has a messageId property.
      *
      */
    def put(packet: Any): this.type = js.native
    def put(packet: Any, cb: js.Function): this.type = js.native
  }
}
