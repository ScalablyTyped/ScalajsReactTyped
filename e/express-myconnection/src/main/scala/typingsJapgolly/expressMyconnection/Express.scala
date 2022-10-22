package typingsJapgolly.expressMyconnection

import japgolly.scalajs.react.Callback
import typingsJapgolly.expressMyconnection.mysql.Connection
import typingsJapgolly.expressMyconnection.mysql.MysqlError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait Request extends StObject {
    
    var getConnection: js.UndefOr[
        js.Function1[
          /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setGetConnection(
        value: /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit] => Callback
      ): Self = StObject.set(x, "getConnection", js.Any.fromFunction1((t0: /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit]) => value(t0).runNow()))
      
      inline def setGetConnectionUndefined: Self = StObject.set(x, "getConnection", js.undefined)
    }
  }
}
