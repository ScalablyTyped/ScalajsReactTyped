package typingsJapgolly.setLink

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attach extends StObject {
    
    def attach(res: Response_[Any, Record[String, Any]]): Unit
  }
  object Attach {
    
    inline def apply(attach: Response_[Any, Record[String, Any]] => Callback): Attach = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: Response_[Any, Record[String, Any]]) => attach(t0).runNow()))
      __obj.asInstanceOf[Attach]
    }
    
    extension [Self <: Attach](x: Self) {
      
      inline def setAttach(value: Response_[Any, Record[String, Any]] => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: Response_[Any, Record[String, Any]]) => value(t0).runNow()))
    }
  }
}
