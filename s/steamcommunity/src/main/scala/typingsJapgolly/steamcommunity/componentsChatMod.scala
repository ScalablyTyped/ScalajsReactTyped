package typingsJapgolly.steamcommunity

import typingsJapgolly.steamcommunity.mod.Callback
import typingsJapgolly.steamcommunity.mod.userid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsChatMod {
  
  trait Chat extends StObject {
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      */
    def chatLogoff(): Unit
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      *
      * @param interval
      * @param uiMode
      */
    def chatLogon(interval: Double, uiMode: String): Unit
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      * @param recipient
      * @param text
      * @param [type]
      * @param [callback]
      */
    def chatMessage(recipient: userid, text: String, `type`: String, callback: Callback): Unit
  }
  object Chat {
    
    inline def apply(
      chatLogoff: japgolly.scalajs.react.Callback,
      chatLogon: (Double, String) => japgolly.scalajs.react.Callback,
      chatMessage: (userid, String, String, Callback) => japgolly.scalajs.react.Callback
    ): Chat = {
      val __obj = js.Dynamic.literal(chatLogoff = chatLogoff.toJsFn, chatLogon = js.Any.fromFunction2((t0: Double, t1: String) => (chatLogon(t0, t1)).runNow()), chatMessage = js.Any.fromFunction4((t0: userid, t1: String, t2: String, t3: Callback) => (chatMessage(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Chat]
    }
    
    extension [Self <: Chat](x: Self) {
      
      inline def setChatLogoff(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "chatLogoff", value.toJsFn)
      
      inline def setChatLogon(value: (Double, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "chatLogon", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setChatMessage(value: (userid, String, String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "chatMessage", js.Any.fromFunction4((t0: userid, t1: String, t2: String, t3: Callback) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
}
