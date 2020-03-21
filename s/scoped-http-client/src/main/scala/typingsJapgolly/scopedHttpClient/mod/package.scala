package typingsJapgolly.scopedHttpClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestCallback = js.Function2[
    /* err */ js.Any, 
    /* request */ typingsJapgolly.node.httpMod.ClientRequest, 
    scala.Unit
  ]
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[
        /* err */ js.Any, 
        /* response */ typingsJapgolly.node.httpMod.IncomingMessage, 
        /* body */ java.lang.String, 
        scala.Unit
      ]
    ], 
    typingsJapgolly.scopedHttpClient.mod.ScopedClient
  ]
  type ScopeCallback = js.Function1[/* scoped */ typingsJapgolly.scopedHttpClient.mod.ScopedClient, scala.Unit]
}
