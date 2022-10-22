package typingsJapgolly.domBackgroundSync

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/background-sync/spec/#syncmanager
trait SyncManager extends StObject {
  
  def getTags(): js.Promise[js.Array[String]]
  
  def register(tag: String): js.Promise[Unit]
}
object SyncManager {
  
  inline def apply(getTags: CallbackTo[js.Promise[js.Array[String]]], register: String => js.Promise[Unit]): SyncManager = {
    val __obj = js.Dynamic.literal(getTags = getTags.toJsFn, register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[SyncManager]
  }
  
  extension [Self <: SyncManager](x: Self) {
    
    inline def setGetTags(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "getTags", value.toJsFn)
    
    inline def setRegister(value: String => js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
