package typingsJapgolly.hapiAuthBearerToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Validate = js.Function3[
    /* request */ typingsJapgolly.hapi.mod.Request, 
    /* token */ java.lang.String, 
    /* h */ typingsJapgolly.hapi.mod.ResponseToolkit, 
    js.Promise[typingsJapgolly.hapiAuthBearerToken.mod.ValidateReturn] | typingsJapgolly.hapiAuthBearerToken.mod.ValidateReturn
  ]
}
