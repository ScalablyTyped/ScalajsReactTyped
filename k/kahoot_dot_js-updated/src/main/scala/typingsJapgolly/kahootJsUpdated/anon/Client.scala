package typingsJapgolly.kahootJsUpdated.anon

import typingsJapgolly.kahootJsUpdated.kahootJsUpdatedBooleans.`false`
import typingsJapgolly.kahootJsUpdated.mod.JoinResponse
import typingsJapgolly.kahootJsUpdated.mod.Kahoot
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: Kahoot
  
  var event: ReturnType[
    js.Function3[
      /* pin */ String | Double, 
      /* name */ String, 
      /* team */ js.UndefOr[js.Array[String] | `false`], 
      js.Promise[JoinResponse]
    ]
  ]
}
object Client {
  
  inline def apply(
    client: Kahoot,
    event: ReturnType[
      js.Function3[
        /* pin */ String | Double, 
        /* name */ String, 
        /* team */ js.UndefOr[js.Array[String] | `false`], 
        js.Promise[JoinResponse]
      ]
    ]
  ): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: Kahoot): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: ReturnType[
          js.Function3[
            /* pin */ String | Double, 
            /* name */ String, 
            /* team */ js.UndefOr[js.Array[String] | `false`], 
            js.Promise[JoinResponse]
          ]
        ]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
