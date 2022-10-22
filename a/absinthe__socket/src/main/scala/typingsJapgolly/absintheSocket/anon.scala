package typingsJapgolly.absintheSocket

import typingsJapgolly.absintheSocket.mod.AbsintheSocket
import typingsJapgolly.absintheSocket.mod.Notifier
import typingsJapgolly.absintheSocket.mod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OnError[Variables] extends StObject {
    
    def onError(error: js.Error): Any = js.native
    
    def onStart(notifier: Notifier[Variables, js.Object]): Any = js.native
    
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: Unit,
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: Notifier[Variables, js.Object],
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
  }
}
