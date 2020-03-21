package typingsJapgolly.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SpecHandler = js.Function3[
    /* token */ typingsJapgolly.keycloakConnect.mod.Token, 
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    scala.Boolean
  ]
}
