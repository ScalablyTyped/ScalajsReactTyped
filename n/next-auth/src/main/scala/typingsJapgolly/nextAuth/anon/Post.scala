package typingsJapgolly.nextAuth.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.nextAuth.clientUtilsMod.BroadcastMessage
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post extends StObject {
  
  /** Notify other tabs/windows. */
  def post(message: Record[String, Any]): Unit
  
  /** Get notified by other tabs/windows. */
  def receive(onReceive: js.Function1[/* message */ BroadcastMessage, Unit]): js.Function0[Unit]
}
object Post {
  
  inline def apply(
    post: Record[String, Any] => Callback,
    receive: js.Function1[/* message */ BroadcastMessage, Unit] => js.Function0[Unit]
  ): Post = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction1((t0: Record[String, Any]) => post(t0).runNow()), receive = js.Any.fromFunction1(receive))
    __obj.asInstanceOf[Post]
  }
  
  extension [Self <: Post](x: Self) {
    
    inline def setPost(value: Record[String, Any] => Callback): Self = StObject.set(x, "post", js.Any.fromFunction1((t0: Record[String, Any]) => value(t0).runNow()))
    
    inline def setReceive(value: js.Function1[/* message */ BroadcastMessage, Unit] => js.Function0[Unit]): Self = StObject.set(x, "receive", js.Any.fromFunction1(value))
  }
}
