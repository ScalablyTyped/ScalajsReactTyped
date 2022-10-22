package typingsJapgolly.reactNativeWindowsFindRepoRoot

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sync extends StObject {
    
    def sync(): String
    @JSName("sync")
    var sync_Original: js.Function0[String]
  }
  object Sync {
    
    inline def apply(sync: CallbackTo[String]): Sync = {
      val __obj = js.Dynamic.literal(sync = sync.toJsFn)
      __obj.asInstanceOf[Sync]
    }
    
    extension [Self <: Sync](x: Self) {
      
      inline def setSync(value: CallbackTo[String]): Self = StObject.set(x, "sync", value.toJsFn)
    }
  }
}
