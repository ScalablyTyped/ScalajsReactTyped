package typingsJapgolly.natsHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActHandler = js.ThisFunction2[
    /* this */ typingsJapgolly.natsHemera.mod.Hemera[
      typingsJapgolly.natsHemera.mod.ClientRequest, 
      typingsJapgolly.natsHemera.mod.ClientResponse
    ], 
    /* error */ js.Error, 
    /* response */ typingsJapgolly.natsHemera.mod.ClientResult, 
    scala.Unit
  ]
  type ClientResult = js.Any
  type NoContext = scala.Null
  type NodeCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* success */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Plugin = js.Function
  type Request = scala.Null
  type Response = scala.Null
}
