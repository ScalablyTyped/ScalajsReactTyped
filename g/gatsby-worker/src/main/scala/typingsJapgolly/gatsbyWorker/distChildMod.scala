package typingsJapgolly.gatsbyWorker

import japgolly.scalajs.react.Callback
import typingsJapgolly.gatsbyWorker.gatsbyWorkerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChildMod {
  
  @JSImport("gatsby-worker/dist/child", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-worker/dist/child", "getMessenger")
  @js.native
  def getMessenger: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]] = js.native
  inline def getMessenger_=(x: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMessenger")(x.asInstanceOf[js.Any])
  
  /**
    * Used to check wether current context is executed in worker process
    */
  @JSImport("gatsby-worker/dist/child", "isWorker")
  @js.native
  def isWorker: Boolean = js.native
  inline def isWorker_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(x.asInstanceOf[js.Any])
  
  trait IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild] extends StObject {
    
    var messagingVersion: `1`
    
    def onMessage(listener: js.Function1[/* msg */ MessagesFromParent, Unit]): Unit
    
    def sendMessage(msg: MessagesFromChild): Unit
  }
  object IGatsbyWorkerMessenger {
    
    inline def apply[MessagesFromParent, MessagesFromChild](
      onMessage: js.Function1[/* msg */ MessagesFromParent, Unit] => Callback,
      sendMessage: MessagesFromChild => Callback
    ): IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild] = {
      val __obj = js.Dynamic.literal(messagingVersion = 1, onMessage = js.Any.fromFunction1((t0: js.Function1[/* msg */ MessagesFromParent, Unit]) => onMessage(t0).runNow()), sendMessage = js.Any.fromFunction1((t0: MessagesFromChild) => sendMessage(t0).runNow()))
      __obj.asInstanceOf[IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild]]
    }
    
    extension [Self <: IGatsbyWorkerMessenger[?, ?], MessagesFromParent, MessagesFromChild](x: Self & (IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild])) {
      
      inline def setMessagingVersion(value: `1`): Self = StObject.set(x, "messagingVersion", value.asInstanceOf[js.Any])
      
      inline def setOnMessage(value: js.Function1[/* msg */ MessagesFromParent, Unit] => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: js.Function1[/* msg */ MessagesFromParent, Unit]) => value(t0).runNow()))
      
      inline def setSendMessage(value: MessagesFromChild => Callback): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1((t0: MessagesFromChild) => value(t0).runNow()))
    }
  }
}
