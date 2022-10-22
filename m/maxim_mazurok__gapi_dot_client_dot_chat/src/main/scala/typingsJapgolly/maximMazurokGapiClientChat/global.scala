package typingsJapgolly.maximMazurokGapiClientChat

import typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat.DmsResource
import typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat.MediaResource
import typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat.RoomsResource
import typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat.SpacesResource
import typingsJapgolly.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.chat
import typingsJapgolly.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.v1
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object chat {
        
        @JSGlobal("gapi.client.chat.dms")
        @js.native
        val dms: DmsResource = js.native
        
        @JSGlobal("gapi.client.chat.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.chat.rooms")
        @js.native
        val rooms: RoomsResource = js.native
        
        @JSGlobal("gapi.client.chat.spaces")
        @js.native
        val spaces: SpacesResource = js.native
      }
      
      /** Load Google Chat API v1 */
      inline def load(name: chat, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: chat, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
