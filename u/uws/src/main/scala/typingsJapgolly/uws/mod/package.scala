package typingsJapgolly.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ typingsJapgolly.uws.AnonOrigin, 
    /* callback */ js.Function1[/* res */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type VerifyClientCallbackSync = js.Function1[/* info */ typingsJapgolly.uws.AnonOrigin, scala.Boolean]
}
